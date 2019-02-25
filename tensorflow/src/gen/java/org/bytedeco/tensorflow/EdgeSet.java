// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// An unordered set of edges.  Uses very little memory for small sets.
// Unlike std::set, EdgeSet does NOT allow mutations during iteration.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EdgeSet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeSet(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EdgeSet(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public EdgeSet position(long position) {
        return (EdgeSet)super.position(position);
    }

  public EdgeSet() { super((Pointer)null); allocate(); }
  private native void allocate();

  @Name("const_iterator") @Opaque public static class EdgeSetIterator extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public EdgeSetIterator() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public EdgeSetIterator(Pointer p) { super(p); }
  }

  public native @Cast("bool") boolean empty();
  public native @Cast("tensorflow::EdgeSet::size_type") long size();
  public native void clear();
  public native @ByVal EdgeSetBoolPair insert(@Cast("tensorflow::EdgeSet::value_type") Edge value);
  public native @Cast("tensorflow::EdgeSet::size_type") long erase(@Cast("tensorflow::EdgeSet::key_type") Edge key);

  // Caller is not allowed to mutate the EdgeSet while iterating.
  public native @ByVal EdgeSetIterator begin();
  public native @ByVal EdgeSetIterator end();
}
