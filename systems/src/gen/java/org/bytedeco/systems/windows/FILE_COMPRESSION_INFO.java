// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_COMPRESSION_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_COMPRESSION_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_COMPRESSION_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_COMPRESSION_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_COMPRESSION_INFO position(long position) {
        return (FILE_COMPRESSION_INFO)super.position(position);
    }

    public native @ByRef LARGE_INTEGER CompressedFileSize(); public native FILE_COMPRESSION_INFO CompressedFileSize(LARGE_INTEGER CompressedFileSize);
    public native @Cast("WORD") short CompressionFormat(); public native FILE_COMPRESSION_INFO CompressionFormat(short CompressionFormat);
    public native @Cast("UCHAR") byte CompressionUnitShift(); public native FILE_COMPRESSION_INFO CompressionUnitShift(byte CompressionUnitShift);
    public native @Cast("UCHAR") byte ChunkShift(); public native FILE_COMPRESSION_INFO ChunkShift(byte ChunkShift);
    public native @Cast("UCHAR") byte ClusterShift(); public native FILE_COMPRESSION_INFO ClusterShift(byte ClusterShift);
    public native @Cast("UCHAR") byte Reserved(int i); public native FILE_COMPRESSION_INFO Reserved(int i, byte Reserved);
    @MemberGetter public native @Cast("UCHAR*") BytePointer Reserved();
}
