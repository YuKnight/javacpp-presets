// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_ApiDefMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_ApiDefMap(Pointer p) { super(p); }

  public TF_ApiDefMap(@Const @ByRef OpList op_list) { super((Pointer)null); allocate(op_list); }
  private native void allocate(@Const @ByRef OpList op_list);

// #ifndef __ANDROID__
  public native @ByRef ApiDefMap api_def_map(); public native TF_ApiDefMap api_def_map(ApiDefMap api_def_map);
// #endif
  public native @Cast("bool") boolean update_docs_called(); public native TF_ApiDefMap update_docs_called(boolean update_docs_called);
  public native @ByRef @Cast("tensorflow::mutex*") Pointer lock(); public native TF_ApiDefMap lock(Pointer lock);
}
