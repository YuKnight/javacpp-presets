// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTCTXA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTCTXA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTCTXA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTCTXA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTCTXA position(long position) {
        return (ACTCTXA)super.position(position);
    }

    public native @Cast("ULONG") long cbSize(); public native ACTCTXA cbSize(long cbSize);
    public native @Cast("DWORD") int dwFlags(); public native ACTCTXA dwFlags(int dwFlags);
    public native @Cast("LPCSTR") BytePointer lpSource(); public native ACTCTXA lpSource(BytePointer lpSource);
    public native @Cast("USHORT") short wProcessorArchitecture(); public native ACTCTXA wProcessorArchitecture(short wProcessorArchitecture);
    public native @Cast("LANGID") short wLangId(); public native ACTCTXA wLangId(short wLangId);
    public native @Cast("LPCSTR") BytePointer lpAssemblyDirectory(); public native ACTCTXA lpAssemblyDirectory(BytePointer lpAssemblyDirectory);
    public native @Cast("LPCSTR") BytePointer lpResourceName(); public native ACTCTXA lpResourceName(BytePointer lpResourceName);
    public native @Cast("LPCSTR") BytePointer lpApplicationName(); public native ACTCTXA lpApplicationName(BytePointer lpApplicationName);
    public native @Cast("HMODULE") Pointer hModule(); public native ACTCTXA hModule(Pointer hModule);
}
