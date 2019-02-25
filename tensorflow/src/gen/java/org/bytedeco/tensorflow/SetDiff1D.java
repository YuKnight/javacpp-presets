// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the difference between two lists of numbers or strings.
 * 
 *  Given a list {@code x} and a list {@code y}, this operation returns a list {@code out} that
 *  represents all values that are in {@code x} but not in {@code y}. The returned list {@code out}
 *  is sorted in the same order that the numbers appear in {@code x} (duplicates are
 *  preserved). This operation also returns a list {@code idx} that represents the
 *  position of each {@code out} element in {@code x}. In other words:
 * 
 *  {@code out[i] = x[idx[i]] for i in [0, 1, ..., len(out) - 1]}
 * 
 *  For example, given this input:
 * 
 *  <pre>{@code
 *  x = [1, 2, 3, 4, 5, 6]
 *  y = [1, 3, 5]
 *  }</pre>
 * 
 *  This operation would return:
 * 
 *  <pre>{@code
 *  out ==> [2, 4, 6]
 *  idx ==> [1, 3, 5]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: 1-D. Values to keep.
 *  * y: 1-D. Values to remove.
 * 
 *  Returns:
 *  * {@code Output} out: 1-D. Values present in {@code x} but not in {@code y}.
 *  * {@code Output} idx: 1-D. Positions of {@code x} values preserved in {@code out}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SetDiff1D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SetDiff1D(Pointer p) { super(p); }

  /** Optional attribute setters for SetDiff1D */
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
  
    /** Defaults to DT_INT32 */
    public native @ByVal Attrs OutIdx(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int out_idx_(); public native Attrs out_idx_(int out_idx_);
  }
  public SetDiff1D(@Const @ByRef Scope scope, @ByVal Input x,
            @ByVal Input y) { super((Pointer)null); allocate(scope, x, y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
            @ByVal Input y);
  public SetDiff1D(@Const @ByRef Scope scope, @ByVal Input x,
            @ByVal Input y, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, y, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
            @ByVal Input y, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutIdx(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native SetDiff1D operation(Operation operation);
  public native @ByRef Output out(); public native SetDiff1D out(Output out);
  public native @ByRef Output idx(); public native SetDiff1D idx(Output idx);
}
