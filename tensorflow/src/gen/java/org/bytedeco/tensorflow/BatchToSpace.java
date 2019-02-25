// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** \defgroup array_ops Array Ops
 *  \{
 <p>
 *  BatchToSpace for 4-D tensors of type T.
 * 
 *  This is a legacy version of the more general BatchToSpaceND.
 * 
 *  Rearranges (permutes) data from batch into blocks of spatial data, followed by
 *  cropping. This is the reverse transformation of SpaceToBatch. More specifically,
 *  this op outputs a copy of the input tensor where values from the {@code batch}
 *  dimension are moved in spatial blocks to the {@code height} and {@code width} dimensions,
 *  followed by cropping along the {@code height} and {@code width} dimensions.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: 4-D tensor with shape
 *  {@code [batch*block_size*block_size, height_pad/block_size, width_pad/block_size,
 *    depth]}. Note that the batch size of the input tensor must be divisible by
 *  {@code block_size * block_size}.
 *  * crops: 2-D tensor of non-negative integers with shape {@code [2, 2]}. It specifies
 *  how many elements to crop from the intermediate result across the spatial
 *  dimensions as follows:
 * 
 *      crops = [[crop_top, crop_bottom], [crop_left, crop_right]]
 * 
 *  Returns:
 *  * {@code Output}: 4-D with shape {@code [batch, height, width, depth]}, where:
 * 
 *        height = height_pad - crop_top - crop_bottom
 *        width = width_pad - crop_left - crop_right
 * 
 *  The attr {@code block_size} must be greater than one. It indicates the block size.
 * 
 *  Some examples:
 * 
 *  (1) For the following input of shape {@code [4, 1, 1, 1]} and block_size of 2:
 * 
 *  <pre>{@code
 *  [[[[1]]], [[[2]]], [[[3]]], [[[4]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [1, 2, 2, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1], [2]], [[3], [4]]]]
 *  }</pre>
 * 
 *  (2) For the following input of shape {@code [4, 1, 1, 3]} and block_size of 2:
 * 
 *  <pre>{@code
 *  [[[1, 2, 3]], [[4, 5, 6]], [[7, 8, 9]], [[10, 11, 12]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [1, 2, 2, 3]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1, 2, 3], [4, 5, 6]],
 *        [[7, 8, 9], [10, 11, 12]]]]
 *  }</pre>
 * 
 *  (3) For the following input of shape {@code [4, 2, 2, 1]} and block_size of 2:
 * 
 *  <pre>{@code
 *  x = [[[[1], [3]], [[9], [11]]],
 *       [[[2], [4]], [[10], [12]]],
 *       [[[5], [7]], [[13], [15]]],
 *       [[[6], [8]], [[14], [16]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [1, 4, 4, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[1],   [2],  [3],  [4]],
 *       [[5],   [6],  [7],  [8]],
 *       [[9],  [10], [11],  [12]],
 *       [[13], [14], [15],  [16]]]
 *  }</pre>
 * 
 *  (4) For the following input of shape {@code [8, 1, 2, 1]} and block_size of 2:
 * 
 *  <pre>{@code
 *  x = [[[[1], [3]]], [[[9], [11]]], [[[2], [4]]], [[[10], [12]]],
 *       [[[5], [7]]], [[[13], [15]]], [[[6], [8]]], [[[14], [16]]]]
 *  }</pre>
 * 
 *  The output tensor has shape {@code [2, 2, 4, 1]} and value:
 * 
 *  <pre>{@code
 *  x = [[[[1], [3]], [[5], [7]]],
 *       [[[2], [4]], [[10], [12]]],
 *       [[[5], [7]], [[13], [15]]],
 *       [[[6], [8]], [[14], [16]]]]
 *  }</pre> */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BatchToSpace extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchToSpace(Pointer p) { super(p); }

  public BatchToSpace(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input crops, @Cast("tensorflow::int64") long block_size) { super((Pointer)null); allocate(scope, input, crops, block_size); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input crops, @Cast("tensorflow::int64") long block_size);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native BatchToSpace operation(Operation operation);
  public native @ByRef Output output(); public native BatchToSpace output(Output output);
}
