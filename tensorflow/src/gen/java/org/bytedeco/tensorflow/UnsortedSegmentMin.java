// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the minimum along segments of a tensor.
 * 
 *  Read
 *  [the section on segmentation](https://tensorflow.org/api_guides/python/math_ops#segmentation)
 *  for an explanation of segments.
 * 
 *  This operator is similar to the unsorted segment sum operator found
 *  [(here)](../../../api_docs/python/math_ops.md#UnsortedSegmentSum).
 *  Instead of computing the sum over segments, it computes the minimum such that:
 * 
 *  \(output_i = \min_{j...} data_[j...]\) where min is over tuples {@code j...} such
 *  that {@code segment_ids[j...] == i}.
 * 
 *  If the minimum is empty for a given segment ID {@code i}, it outputs the largest
 *  possible value for the specific numeric type,
 *  {@code output[i] = numeric_limits<T>::max()}.
 * 
 *  If the given segment ID {@code i} is negative, then the corresponding value is
 *  dropped, and will not be included in the result.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * segment_ids: A tensor whose shape is a prefix of {@code data.shape}.
 * 
 *  Returns:
 *  * {@code Output}: Has same shape as data, except for the first {@code segment_ids.rank}
 *  dimensions, which are replaced with a single dimension which has size
 *  {@code num_segments}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class UnsortedSegmentMin extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnsortedSegmentMin(Pointer p) { super(p); }

  public UnsortedSegmentMin(@Const @ByRef Scope scope, @ByVal Input data,
                     @ByVal Input segment_ids, @ByVal Input num_segments) { super((Pointer)null); allocate(scope, data, segment_ids, num_segments); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
                     @ByVal Input segment_ids, @ByVal Input num_segments);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native UnsortedSegmentMin operation(Operation operation);
  public native @ByRef Output output(); public native UnsortedSegmentMin output(Output output);
}
