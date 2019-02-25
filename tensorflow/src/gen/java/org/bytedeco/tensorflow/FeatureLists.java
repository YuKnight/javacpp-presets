// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FeatureLists extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FeatureLists(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FeatureLists(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FeatureLists position(long position) {
        return (FeatureLists)super.position(position);
    }

  public FeatureLists() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FeatureLists(@Const @ByRef FeatureLists from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef FeatureLists from);

  public native @ByRef @Name("operator =") FeatureLists put(@Const @ByRef FeatureLists from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef FeatureLists default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const FeatureLists internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(FeatureLists other);
  public native void Swap(FeatureLists other);
  

  // implements Message ----------------------------------------------

  public native FeatureLists New();

  public native FeatureLists New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef FeatureLists from);
  public native void MergeFrom(@Const @ByRef FeatureLists from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------


  // accessors -------------------------------------------------------

  // map<string, .tensorflow.FeatureList> feature_list = 1;
  public native int feature_list_size();
  public native void clear_feature_list();
  @MemberGetter public static native int kFeatureListFieldNumber();
  public static final int kFeatureListFieldNumber = kFeatureListFieldNumber();
  public native @Const @ByRef StringFeatureListMap feature_list();
  public native StringFeatureListMap mutable_feature_list();
}
