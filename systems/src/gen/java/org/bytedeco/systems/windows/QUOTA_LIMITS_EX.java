// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class QUOTA_LIMITS_EX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public QUOTA_LIMITS_EX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QUOTA_LIMITS_EX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QUOTA_LIMITS_EX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public QUOTA_LIMITS_EX position(long position) {
        return (QUOTA_LIMITS_EX)super.position(position);
    }

    public native @Cast("SIZE_T") long PagedPoolLimit(); public native QUOTA_LIMITS_EX PagedPoolLimit(long PagedPoolLimit);
    public native @Cast("SIZE_T") long NonPagedPoolLimit(); public native QUOTA_LIMITS_EX NonPagedPoolLimit(long NonPagedPoolLimit);
    public native @Cast("SIZE_T") long MinimumWorkingSetSize(); public native QUOTA_LIMITS_EX MinimumWorkingSetSize(long MinimumWorkingSetSize);
    public native @Cast("SIZE_T") long MaximumWorkingSetSize(); public native QUOTA_LIMITS_EX MaximumWorkingSetSize(long MaximumWorkingSetSize);
    public native @Cast("SIZE_T") long PagefileLimit(); public native QUOTA_LIMITS_EX PagefileLimit(long PagefileLimit);               // Limit expressed in pages
    public native @ByRef LARGE_INTEGER TimeLimit(); public native QUOTA_LIMITS_EX TimeLimit(LARGE_INTEGER TimeLimit);
    public native @Cast("SIZE_T") long WorkingSetLimit(); public native QUOTA_LIMITS_EX WorkingSetLimit(long WorkingSetLimit);             // Limit expressed in pages
    public native @Cast("SIZE_T") long Reserved2(); public native QUOTA_LIMITS_EX Reserved2(long Reserved2);
    public native @Cast("SIZE_T") long Reserved3(); public native QUOTA_LIMITS_EX Reserved3(long Reserved3);
    public native @Cast("SIZE_T") long Reserved4(); public native QUOTA_LIMITS_EX Reserved4(long Reserved4);
    public native @Cast("DWORD") int Flags(); public native QUOTA_LIMITS_EX Flags(int Flags);
    public native @ByRef RATE_QUOTA_LIMIT CpuRateLimit(); public native QUOTA_LIMITS_EX CpuRateLimit(RATE_QUOTA_LIMIT CpuRateLimit);
}
