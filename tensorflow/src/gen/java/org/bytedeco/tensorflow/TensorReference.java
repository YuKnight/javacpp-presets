// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// An opaque class that holds a reference to an underlying TensorBuffer.
// Unlike Tensor, it does not have any shape or type information, so
// it is cheaper to construct/move, but the only thing you can really do
// with it is Unref it, which releases one of the references to the underlying
// TensorBuffer.
// IMPORTANT: If you do not call Unref(), you will likely leak tensor memory.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorReference extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorReference(Pointer p) { super(p); }

  // Take the reference of the root buffer so the size will be more accurate
  public TensorReference(@Const @ByRef Tensor tensor) { super((Pointer)null); allocate(tensor); }
  private native void allocate(@Const @ByRef Tensor tensor);

  public native void Unref();

  // Return an estimate of the total bytes being kept alive by this reference.
  public native @Cast("size_t") long TotalBytes();

  public native void FillDescription(AllocationDescription description);

  // Convenience function for de-duplicating tensor references.
  public native @Cast("bool") boolean SharesBufferWith(@Const @ByRef TensorReference t);

  // Convenience function for de-duplicating tensor references.
  public native @Cast("bool") boolean SharesBufferWith(@Const @ByRef Tensor t);

  // Convenience function for de-duplicating tensor references.
  public native @Cast("size_t") long BufferHash();

  // A constructor used only for tests
  public TensorReference(TensorBuffer test_buffer) { super((Pointer)null); allocate(test_buffer); }
  private native void allocate(TensorBuffer test_buffer);
}
