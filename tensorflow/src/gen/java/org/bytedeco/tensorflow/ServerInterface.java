// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// This library supports a registration/factory-based mechanism for
// creating TensorFlow server objects. Each server implementation must
// have an accompanying implementation of ServerFactory, and create a
// static "registrar" object that calls `ServerFactory::Register()`
// with an instance of the factory class. See "rpc/grpc_server_lib.cc"
// for an example.

// Represents a single TensorFlow server that exports Master and Worker
// services.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ServerInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ServerInterface(Pointer p) { super(p); }


  // Starts the server running asynchronously. Returns OK on success, otherwise
  // returns an error.
  public native @ByVal Status Start();

  // Stops the server asynchronously. Returns OK on success, otherwise returns
  // an error.
  //
  // After calling `Stop()`, the caller may call `Join()` to block until the
  // server has stopped.
  public native @ByVal Status Stop();

  // Blocks until the server has stopped. Returns OK on success, otherwise
  // returns an error.
  public native @ByVal Status Join();

  // Returns a target string that can be used to connect to this server using
  // `tensorflow::NewSession()`.
  public native @StdString BytePointer target();
}
