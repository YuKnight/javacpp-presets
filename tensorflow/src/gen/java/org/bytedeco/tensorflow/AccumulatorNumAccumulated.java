// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the number of gradients aggregated in the given accumulators.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to an accumulator.
 * 
 *  Returns:
 *  * {@code Output}: The number of gradients aggregated in the given accumulator. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AccumulatorNumAccumulated extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AccumulatorNumAccumulated(Pointer p) { super(p); }

  public AccumulatorNumAccumulated(@Const @ByRef Scope scope, @ByVal Input handle) { super((Pointer)null); allocate(scope, handle); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native AccumulatorNumAccumulated operation(Operation operation);
  public native @ByRef Output num_accumulated(); public native AccumulatorNumAccumulated num_accumulated(Output num_accumulated);
}
