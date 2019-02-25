// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;



@Name("onnx::Dimension") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class DimensionIR extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DimensionIR(Pointer p) { super(p); }

  public DimensionIR(@StdString BytePointer param) { super((Pointer)null); allocate(param); }
  private native void allocate(@StdString BytePointer param);
  public DimensionIR(@StdString String param) { super((Pointer)null); allocate(param); }
  private native void allocate(@StdString String param);
  public DimensionIR(@Cast("int64_t") int dim) { super((Pointer)null); allocate(dim); }
  private native void allocate(@Cast("int64_t") int dim);

  public native @Cast("bool") boolean is_int(); public native DimensionIR is_int(boolean is_int);
  public native @Cast("int64_t") int dim(); public native DimensionIR dim(int dim);
  public native @StdString BytePointer param(); public native DimensionIR param(BytePointer param);
}
