// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LOAD_DLL_DEBUG_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LOAD_DLL_DEBUG_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LOAD_DLL_DEBUG_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LOAD_DLL_DEBUG_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LOAD_DLL_DEBUG_INFO position(long position) {
        return (LOAD_DLL_DEBUG_INFO)super.position(position);
    }

    public native @Cast("HANDLE") Pointer hFile(); public native LOAD_DLL_DEBUG_INFO hFile(Pointer hFile);
    public native @Cast("LPVOID") Pointer lpBaseOfDll(); public native LOAD_DLL_DEBUG_INFO lpBaseOfDll(Pointer lpBaseOfDll);
    public native @Cast("DWORD") int dwDebugInfoFileOffset(); public native LOAD_DLL_DEBUG_INFO dwDebugInfoFileOffset(int dwDebugInfoFileOffset);
    public native @Cast("DWORD") int nDebugInfoSize(); public native LOAD_DLL_DEBUG_INFO nDebugInfoSize(int nDebugInfoSize);
    public native @Cast("LPVOID") Pointer lpImageName(); public native LOAD_DLL_DEBUG_INFO lpImageName(Pointer lpImageName);
    public native @Cast("WORD") short fUnicode(); public native LOAD_DLL_DEBUG_INFO fUnicode(short fUnicode);
}
