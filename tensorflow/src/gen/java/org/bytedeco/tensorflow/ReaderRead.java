// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the next record (key, value pair) produced by a Reader.
 * 
 *  Will dequeue from the input queue if necessary (e.g. when the
 *  Reader needs to start reading from a new file since it has finished
 *  with the previous file).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * reader_handle: Handle to a Reader.
 *  * queue_handle: Handle to a Queue, with string work items.
 * 
 *  Returns:
 *  * {@code Output} key: A scalar.
 *  * {@code Output} value: A scalar. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReaderRead extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReaderRead(Pointer p) { super(p); }

  public ReaderRead(@Const @ByRef Scope scope, @ByVal Input reader_handle,
             @ByVal Input queue_handle) { super((Pointer)null); allocate(scope, reader_handle, queue_handle); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input reader_handle,
             @ByVal Input queue_handle);

  public native @ByRef Operation operation(); public native ReaderRead operation(Operation operation);
  public native @ByRef Output key(); public native ReaderRead key(Output key);
  public native @ByRef Output value(); public native ReaderRead value(Output value);
}
