// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

@Namespace("onnx::checker") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class ValidationError extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValidationError(Pointer p) { super(p); }

  public native @NoException @Cast("const char*") BytePointer what();
  public native void AppendContext(@StdString BytePointer context);
  public native void AppendContext(@StdString String context);
}
