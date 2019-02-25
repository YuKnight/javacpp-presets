// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// This is a helper for creating a Node and adding it to a Graph.
// Internally, it uses a NodeDefBuilder to automatically set attrs
// that can be inferred from the inputs, and use default values
// (where they exist) for unspecified attrs.  Example usage:
//
//  Node* node;
//  Status status = NodeBuilder(node_name, op_name)
//                           .Input(...)
//                           .Attr(...)
//                           .Finalize(&graph, &node);
//  if (!status.ok()) return status;
//  // Use node here.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeBuilder(Pointer p) { super(p); }

  // For specifying the output of a Node to provide to one of the Input()
  // functions below.  It supports both regular inputs (where you are
  // connecting to an existing Node*), and inputs from outside the graph
  // (or haven't been added to the graph yet, like back edges, where
  // you don't have a Node*). Both types can be mixed, e.g. in an
  // ArraySlice.
  @NoOffset public static class NodeOut extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public NodeOut(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public NodeOut(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public NodeOut position(long position) {
          return (NodeOut)super.position(position);
      }
  
    // For referencing an existing Node.
    public NodeOut(Node n, int i/*=0*/) { super((Pointer)null); allocate(n, i); }
    private native void allocate(Node n, int i/*=0*/);
    public NodeOut(Node n) { super((Pointer)null); allocate(n); }
    private native void allocate(Node n);
    public NodeOut(@ByVal OutputTensor t) { super((Pointer)null); allocate(t); }
    private native void allocate(@ByVal OutputTensor t);

    // For referencing Nodes not in the graph being built. It is
    // useful when preparing a graph for ExtendSession or creating a
    // back edge to a node that hasn't been added to the graph yet,
    // but will be.
    public NodeOut(@StringPiece BytePointer name, int i, @Cast("tensorflow::DataType") int t) { super((Pointer)null); allocate(name, i, t); }
    private native void allocate(@StringPiece BytePointer name, int i, @Cast("tensorflow::DataType") int t);
    public NodeOut(@StringPiece String name, int i, @Cast("tensorflow::DataType") int t) { super((Pointer)null); allocate(name, i, t); }
    private native void allocate(@StringPiece String name, int i, @Cast("tensorflow::DataType") int t);

    // Default constructor for std::vector<NodeOut>.
    public NodeOut() { super((Pointer)null); allocate(); }
    private native void allocate();

    public native Node node(); public native NodeOut node(Node node);
    // error is set to true if:
    // * the NodeOut was default constructed and never overwritten,
    // * a nullptr Node* was passed to the NodeOut constructor, or
    // * an out-of-range index was passed to the NodeOut constructor.
    public native @Cast("bool") boolean error(); public native NodeOut error(boolean error);
    public native @StdString BytePointer name(); public native NodeOut name(BytePointer name);
    public native int index(); public native NodeOut index(int index);
    public native @Cast("tensorflow::DataType") int dt(); public native NodeOut dt(int dt);
  }

  // Specify the name and the Op (either via an OpDef or the name of
  // the Op plus a registry) for the Node.  Other fields are
  // specified by calling the methods below.
  // REQUIRES: The OpDef must satisfy ValidateOpDef().
  public NodeBuilder(@StringPiece BytePointer name, @StringPiece BytePointer op_name,
                @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                @Const NodeDebugInfo debug/*=nullptr*/) { super((Pointer)null); allocate(name, op_name, op_registry, debug); }
  private native void allocate(@StringPiece BytePointer name, @StringPiece BytePointer op_name,
                @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                @Const NodeDebugInfo debug/*=nullptr*/);
  public NodeBuilder(@StringPiece BytePointer name, @StringPiece BytePointer op_name) { super((Pointer)null); allocate(name, op_name); }
  private native void allocate(@StringPiece BytePointer name, @StringPiece BytePointer op_name);
  public NodeBuilder(@StringPiece String name, @StringPiece String op_name,
                @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                @Const NodeDebugInfo debug/*=nullptr*/) { super((Pointer)null); allocate(name, op_name, op_registry, debug); }
  private native void allocate(@StringPiece String name, @StringPiece String op_name,
                @Const OpRegistryInterface op_registry/*=tensorflow::OpRegistry::Global()*/,
                @Const NodeDebugInfo debug/*=nullptr*/);
  public NodeBuilder(@StringPiece String name, @StringPiece String op_name) { super((Pointer)null); allocate(name, op_name); }
  private native void allocate(@StringPiece String name, @StringPiece String op_name);
  public NodeBuilder(@StringPiece BytePointer name, @Const OpDef op_def) { super((Pointer)null); allocate(name, op_def); }
  private native void allocate(@StringPiece BytePointer name, @Const OpDef op_def);
  public NodeBuilder(@StringPiece String name, @Const OpDef op_def) { super((Pointer)null); allocate(name, op_def); }
  private native void allocate(@StringPiece String name, @Const OpDef op_def);

  // Create a NodeBuilder from an existing NodeDefBuilder.
  public NodeBuilder(@Const @ByRef NodeDefBuilder def_builder) { super((Pointer)null); allocate(def_builder); }
  private native void allocate(@Const @ByRef NodeDefBuilder def_builder);

  // You must call one Input() function per input_arg in the Op,
  // *and in the same order as the input_args appear in the OpDef.*

  // For inputs that take a single tensor.
  public native @ByRef NodeBuilder Input(Node src_node, int src_index/*=0*/);
  public native @ByRef NodeBuilder Input(Node src_node);
  public native @ByRef NodeBuilder Input(@ByVal NodeOut src);

  // For inputs that take a list of tensors.

  // Require that this node run after src_node(s).
  public native @ByRef NodeBuilder ControlInput(Node src_node);
  public native @ByRef NodeBuilder ControlInputs(@ByVal NodeVector src_nodes);

  // Sets the "requested device spec" in the NodeDef (not the
  // "assigned device" in the Node).
  public native @ByRef NodeBuilder Device(@StringPiece BytePointer device_spec);
  public native @ByRef NodeBuilder Device(@StringPiece String device_spec);

  // Sets the device name in the "assigned device" field in tensorflow::Node.
  public native @ByRef NodeBuilder AssignedDevice(@StringPiece BytePointer device);
  public native @ByRef NodeBuilder AssignedDevice(@StringPiece String device);

  // Sets the _XlaCluster attribute in created node to `xla_cluster`.
  public native @ByRef NodeBuilder XlaCluster(@StringPiece BytePointer xla_cluster);
  public native @ByRef NodeBuilder XlaCluster(@StringPiece String xla_cluster);

  // Set the value of an attr.  attr_name must match the name of one of
  // attrs defined by the Op, and value must have the corresponding type
  // (see SetAttrValue() in ../framework/attr_value_util.h for legal
  // types for value).  Note that attrs will be set automatically if
  // they can be determined by the inputs.

  // Validates the described node and adds it to *graph, adding edges
  // for all (non-back) inputs.  If created_node is not nullptr,
  // *created_node will be set to the new node (or nullptr on error).
  public native @ByVal Status Finalize(Graph graph, @Cast("tensorflow::Node**") PointerPointer created_node);
  public native @ByVal Status Finalize(Graph graph, @ByPtrPtr Node created_node);

  // Accessors for the values set in the constructor.
  public native @StdString BytePointer node_name();
  public native @Const @ByRef OpDef op_def();
}
