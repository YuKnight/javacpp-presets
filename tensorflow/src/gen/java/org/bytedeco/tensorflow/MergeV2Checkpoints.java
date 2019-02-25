// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** V2 format specific: merges the metadata files of sharded checkpoints.  The
 * 
 *  result is one logical checkpoint, with one physical metadata file and renamed
 *  data files.
 * 
 *  Intended for "grouping" multiple checkpoints in a sharded checkpoint setup.
 * 
 *  If delete_old_dirs is true, attempts to delete recursively the dirname of each
 *  path in the input checkpoint_prefixes.  This is useful when those paths are non
 *  user-facing temporary locations.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * checkpoint_prefixes: prefixes of V2 checkpoints to merge.
 *  * destination_prefix: scalar.  The desired final prefix.  Allowed to be the same
 *  as one of the checkpoint_prefixes.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * delete_old_dirs: see above.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MergeV2Checkpoints extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MergeV2Checkpoints(Pointer p) { super(p); }

  /** Optional attribute setters for MergeV2Checkpoints */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** see above.
     * 
     *  Defaults to true */
    public native @ByVal Attrs DeleteOldDirs(@Cast("bool") boolean x);

    public native @Cast("bool") boolean delete_old_dirs_(); public native Attrs delete_old_dirs_(boolean delete_old_dirs_);
  }
  public MergeV2Checkpoints(@Const @ByRef Scope scope, @ByVal Input checkpoint_prefixes, @ByVal Input destination_prefix) { super((Pointer)null); allocate(scope, checkpoint_prefixes, destination_prefix); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input checkpoint_prefixes, @ByVal Input destination_prefix);
  public MergeV2Checkpoints(@Const @ByRef Scope scope, @ByVal Input checkpoint_prefixes, @ByVal Input destination_prefix,
                     @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, checkpoint_prefixes, destination_prefix, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input checkpoint_prefixes, @ByVal Input destination_prefix,
                     @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs DeleteOldDirs(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native MergeV2Checkpoints operation(Operation operation);
}
