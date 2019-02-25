// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Allocator is an abstract interface for allocating and deallocating
// device memory.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Allocator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Allocator(Pointer p) { super(p); }

  // Align to 64 byte boundary.
  @MemberGetter public static native @Cast("const size_t") long kAllocatorAlignment();
  public static final long kAllocatorAlignment = kAllocatorAlignment();

  // Return a string identifying this allocator
  public native @StdString BytePointer Name();

  // Return an uninitialized block of memory that is "num_bytes" bytes
  // in size.  The returned pointer is guaranteed to be aligned to a
  // multiple of "alignment" bytes.
  // REQUIRES: "alignment" is a power of 2.
  public native Pointer AllocateRaw(@Cast("size_t") long alignment, @Cast("size_t") long num_bytes);

  // Return an uninitialized block of memory that is "num_bytes" bytes
  // in size with specified allocation attributes.  The returned pointer is
  // guaranteed to be aligned to a multiple of "alignment" bytes.
  // REQUIRES: "alignment" is a power of 2.
  public native Pointer AllocateRaw(@Cast("size_t") long alignment, @Cast("size_t") long num_bytes,
                              @Const @ByRef AllocationAttributes allocation_attr);

  // Deallocate a block of memory pointer to by "ptr"
  // REQUIRES: "ptr" was previously returned by a call to AllocateRaw
  public native void DeallocateRaw(Pointer ptr);

  // Convenience functions to do typed allocation.  C++ constructors
  // and destructors are invoked for complex types if necessary,
  // depending on the concrete Allocator implementation. May return
  // NULL if the tensor has too many elements to represent in a single
  // allocation.

  // Returns true if this allocator tracks the sizes of allocations.
  // RequestedSize and AllocatedSize must be overridden if
  // TracksAllocationSizes is overridden to return true.
  public native @Cast("bool") boolean TracksAllocationSizes();

  // Returns true if this allocator requires tensors with 0 elements
  // to allocate buffers. This is false for most allocators, but may
  // be used by special-case allocators that want to track tensor
  // usage.
  public native @Cast("bool") boolean ShouldAllocateEmptyTensors();

  // Returns the user-requested size of the data allocated at
  // 'ptr'.  Note that the actual buffer allocated might be larger
  // than requested, but this function returns the size requested by
  // the user.
  //
  // REQUIRES: TracksAllocationSizes() is true.
  //
  // REQUIRES: 'ptr!=nullptr' and points to a buffer previously
  // allocated by this allocator.
  public native @Cast("size_t") long RequestedSize(@Const Pointer ptr);

  // Returns the allocated size of the buffer at 'ptr' if known,
  // otherwise returns RequestedSize(ptr). AllocatedSize(ptr) is
  // guaranteed to be >= RequestedSize(ptr).
  //
  // REQUIRES: TracksAllocationSizes() is true.
  //
  // REQUIRES: 'ptr!=nullptr' and points to a buffer previously
  // allocated by this allocator.
  public native @Cast("size_t") long AllocatedSize(@Const Pointer ptr);

  // Returns either 0 or an identifier assigned to the buffer at 'ptr'
  // when the buffer was returned by AllocateRaw. If non-zero, the
  // identifier differs from every other ID assigned by this
  // allocator.
  //
  // REQUIRES: TracksAllocationSizes() is true.
  //
  // REQUIRES: 'ptr!=nullptr' and points to a buffer previously
  // allocated by this allocator.
  public native @Cast("tensorflow::int64") long AllocationId(@Const Pointer ptr);

  // Returns the allocated size of the buffer at 'ptr' if known,
  // otherwise returns 0. This method can be called when
  // TracksAllocationSizes() is false, but can be extremely slow.
  //
  // REQUIRES: 'ptr!=nullptr' and points to a buffer previously
  // allocated by this allocator.
  public native @Cast("size_t") long AllocatedSizeSlow(@Const Pointer ptr);

  // Fills in 'stats' with statistics collected by this allocator.
  public native void GetStats(AllocatorStats stats);

  // Clears the internal stats except for the `in_use` field.
  public native void ClearStats();
}
