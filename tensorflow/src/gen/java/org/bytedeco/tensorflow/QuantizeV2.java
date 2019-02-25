// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Quantize the 'input' tensor of type float to 'output' tensor of type 'T'.
 * 
 *  [min_range, max_range] are scalar floats that specify the range for
 *  the 'input' data. The 'mode' attribute controls exactly which calculations are
 *  used to convert the float values to their quantized equivalents.  The
 *  'round_mode' attribute controls which rounding tie-breaking algorithm is used
 *  when rounding float values to their quantized equivalents.
 * 
 *  In 'MIN_COMBINED' mode, each value of the tensor will undergo the following:
 * 
 *  <pre>{@code
 *  out[i] = (in[i] - min_range) * range(T) / (max_range - min_range)
 *  if T == qint8: out[i] -= (range(T) + 1) / 2.0
 *  }</pre>
 * 
 *  here {@code range(T) = numeric_limits<T>::max() - numeric_limits<T>::min()}
 * 
 *  *MIN_COMBINED Mode Example*
 * 
 *  Assume the input is type float and has a possible range of [0.0, 6.0] and the
 *  output type is quint8 ([0, 255]). The min_range and max_range values should be
 *  specified as 0.0 and 6.0. Quantizing from float to quint8 will multiply each
 *  value of the input by 255/6 and cast to quint8.
 * 
 *  If the output type was qint8 ([-128, 127]), the operation will additionally
 *  subtract each value by 128 prior to casting, so that the range of values aligns
 *  with the range of qint8.
 * 
 *  If the mode is 'MIN_FIRST', then this approach is used:
 * 
 *  <pre>{@code
 *  num_discrete_values = 1 << (# of bits in T)
 *  range_adjust = num_discrete_values / (num_discrete_values - 1)
 *  range = (range_max - range_min) * range_adjust
 *  range_scale = num_discrete_values / range
 *  quantized = round(input * range_scale) - round(range_min * range_scale) +
 *    numeric_limits<T>::min()
 *  quantized = max(quantized, numeric_limits<T>::min())
 *  quantized = min(quantized, numeric_limits<T>::max())
 *  }</pre>
 * 
 *  The biggest difference between this and MIN_COMBINED is that the minimum range
 *  is rounded first, before it's subtracted from the rounded value. With
 *  MIN_COMBINED, a small bias is introduced where repeated iterations of quantizing
 *  and dequantizing will introduce a larger and larger error.
 * 
 *  *SCALED mode Example*
 * 
 *  {@code SCALED} mode matches the quantization approach used in
 *  {@code QuantizeAndDequantize{V2|V3}}.
 * 
 *  If the mode is {@code SCALED}, we do not use the full range of the output type,
 *  choosing to elide the lowest possible value for symmetry (e.g., output range is
 *  -127 to 127, not -128 to 127 for signed 8 bit quantization), so that 0.0 maps to
 *  0.
 * 
 *  We first find the range of values in our tensor. The
 *  range we use is always centered on 0, so we find m such that
 * 
 *  <pre>{@code c++
 *    m = max(abs(input_min), abs(input_max))
 *  }</pre>
 * 
 *  Our input tensor range is then {@code [-m, m]}.
 * 
 *  Next, we choose our fixed-point quantization buckets, {@code [min_fixed, max_fixed]}.
 *  If T is signed, this is
 * 
 *  <pre>{@code
 *    num_bits = sizeof(T) * 8
 *    [min_fixed, max_fixed] =
 *        [-(1 << (num_bits - 1) - 1), (1 << (num_bits - 1)) - 1]
 *  }</pre>
 * 
 *  Otherwise, if T is unsigned, the fixed-point range is
 * 
 *  <pre>{@code
 *    [min_fixed, max_fixed] = [0, (1 << num_bits) - 1]
 *  }</pre>
 * 
 *  From this we compute our scaling factor, s:
 * 
 *  <pre>{@code c++
 *    s = (max_fixed - min_fixed) / (2 * m)
 *  }</pre>
 * 
 *  Now we can quantize the elements of our tensor:
 * 
 *  <pre>{@code c++
 *  result = round(input * s)
 *  }</pre>
 * 
 *  One thing to watch out for is that the operator may choose to adjust the
 *  requested minimum and maximum values slightly during the quantization process,
 *  so you should always use the output ports as the range for further calculations.
 *  For example, if the requested minimum and maximum values are close to equal,
 *  they will be separated by a small epsilon value to prevent ill-formed quantized
 *  buffers from being created. Otherwise, you can end up with buffers where all the
 *  quantized values map to the same float value, which causes problems for
 *  operations that have to perform further calculations on them.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * min_range: The minimum scalar value possibly produced for the input.
 *  * max_range: The maximum scalar value possibly produced for the input.
 * 
 *  Returns:
 *  * {@code Output} output: The quantized data produced from the float input.
 *  * {@code Output} output_min: The actual minimum scalar value used for the output.
 *  * {@code Output} output_max: The actual maximum scalar value used for the output. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizeV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizeV2(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizeV2 */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** Defaults to "MIN_COMBINED" */
    public native @ByVal Attrs Mode(@StringPiece BytePointer x);
    public native @ByVal Attrs Mode(@StringPiece String x);

    /** Defaults to "HALF_AWAY_FROM_ZERO" */
    public native @ByVal Attrs RoundMode(@StringPiece BytePointer x);
    public native @ByVal Attrs RoundMode(@StringPiece String x);

    public native @StringPiece BytePointer mode_(); public native Attrs mode_(BytePointer mode_);
    public native @StringPiece BytePointer round_mode_(); public native Attrs round_mode_(BytePointer round_mode_);
  }
  public QuantizeV2(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range,
             @Cast("tensorflow::DataType") int T) { super((Pointer)null); allocate(scope, input, min_range, max_range, T); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range,
             @Cast("tensorflow::DataType") int T);
  public QuantizeV2(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range,
             @Cast("tensorflow::DataType") int T, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, min_range, max_range, T, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
             @ByVal Input min_range, @ByVal Input max_range,
             @Cast("tensorflow::DataType") int T, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Mode(@StringPiece BytePointer x);
  public static native @ByVal Attrs Mode(@StringPiece String x);
  public static native @ByVal Attrs RoundMode(@StringPiece BytePointer x);
  public static native @ByVal Attrs RoundMode(@StringPiece String x);

  public native @ByRef Operation operation(); public native QuantizeV2 operation(Operation operation);
  public native @ByRef Output output(); public native QuantizeV2 output(Output output);
  public native @ByRef Output output_min(); public native QuantizeV2 output_min(Output output_min);
  public native @ByRef Output output_max(); public native QuantizeV2 output_max(Output output_max);
}
