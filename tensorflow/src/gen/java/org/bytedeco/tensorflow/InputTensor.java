// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Represents an input of a node, i.e., the `index`-th input to `node`.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InputTensor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InputTensor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public InputTensor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public InputTensor position(long position) {
        return (InputTensor)super.position(position);
    }

  public native Node node(); public native InputTensor node(Node node);
  public native int index(); public native InputTensor index(int index);

  public InputTensor(Node n, int i) { super((Pointer)null); allocate(n, i); }
  private native void allocate(Node n, int i);
  public InputTensor() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Returns true if this InputTensor is identical to 'other'. Nodes are
  // compared using pointer equality.
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef InputTensor other);

  // A hash function for InputTensors. Nodes are hashed based on their pointer
  // value.
  public static class Hash extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Hash() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Hash(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Hash(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Hash position(long position) {
          return (Hash)super.position(position);
      }
  
    public native @Cast("tensorflow::uint64") @Name("operator ()") long apply(@Const @ByRef InputTensor s);
  }
}
