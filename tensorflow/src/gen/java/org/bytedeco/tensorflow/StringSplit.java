// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Split elements of {@code input} based on {@code delimiter} into a {@code SparseTensor}.
 * 
 *  Let N be the size of source (typically N will be the batch size). Split each
 *  element of {@code input} based on {@code delimiter} and return a {@code SparseTensor}
 *  containing the splitted tokens. Empty tokens are ignored.
 * 
 *  {@code delimiter} can be empty, or a string of split characters. If {@code delimiter} is an
 *   empty string, each element of {@code input} is split into individual single-byte
 *   character strings, including splitting of UTF-8 multibyte sequences. Otherwise
 *   every character of {@code delimiter} is a potential split point.
 * 
 *  For example:
 *    N = 2, input[0] is 'hello world' and input[1] is 'a b c', then the output
 *    will be
 * 
 *    indices = [0, 0;
 *               0, 1;
 *               1, 0;
 *               1, 1;
 *               1, 2]
 *    shape = [2, 3]
 *    values = ['hello', 'world', 'a', 'b', 'c']
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 1-D. Strings to split.
 *  * delimiter: 0-D. Delimiter characters (bytes), or empty string.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * skip_empty: A {@code bool}. If {@code True}, skip the empty strings from the result.
 * 
 *  Returns:
 *  * {@code Output} indices: A dense matrix of int64 representing the indices of the sparse tensor.
 *  * {@code Output} values: A vector of strings corresponding to the splited values.
 *  * {@code Output} shape: a length-2 vector of int64 representing the shape of the sparse
 *  tensor, where the first value is N and the second value is the maximum number
 *  of tokens in a single input entry. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringSplit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSplit(Pointer p) { super(p); }

  /** Optional attribute setters for StringSplit */
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
  
    /** A {@code bool}. If {@code True}, skip the empty strings from the result.
     * 
     *  Defaults to true */
    public native @ByVal Attrs SkipEmpty(@Cast("bool") boolean x);

    public native @Cast("bool") boolean skip_empty_(); public native Attrs skip_empty_(boolean skip_empty_);
  }
  public StringSplit(@Const @ByRef Scope scope, @ByVal Input input,
              @ByVal Input delimiter) { super((Pointer)null); allocate(scope, input, delimiter); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
              @ByVal Input delimiter);
  public StringSplit(@Const @ByRef Scope scope, @ByVal Input input,
              @ByVal Input delimiter, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, delimiter, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
              @ByVal Input delimiter, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs SkipEmpty(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native StringSplit operation(Operation operation);
  public native @ByRef Output indices(); public native StringSplit indices(Output indices);
  public native @ByRef Output values(); public native StringSplit values(Output values);
  public native @ByRef Output shape(); public native StringSplit shape(Output shape);
}
