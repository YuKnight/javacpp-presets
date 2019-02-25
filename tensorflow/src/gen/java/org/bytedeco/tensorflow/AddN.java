// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Add all input tensors element wise.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: Must all be the same size and shape.
 * 
 *  Returns:
 *  * {@code Output}: The sum tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AddN extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AddN(Pointer p) { super(p); }

  public AddN(@Const @ByRef Scope scope, @ByVal InputList inputs) { super((Pointer)null); allocate(scope, inputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native AddN operation(Operation operation);
  public native @ByRef Output sum(); public native AddN sum(Output sum);
}
