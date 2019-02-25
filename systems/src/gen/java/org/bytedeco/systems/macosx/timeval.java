// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;

@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class timeval extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public timeval() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public timeval(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public timeval(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public timeval position(long position) {
        return (timeval)super.position(position);
    }

	public native @Cast("__darwin_time_t") long tv_sec(); public native timeval tv_sec(long tv_sec);	        /* seconds */
	public native @Cast("__darwin_suseconds_t") int tv_usec(); public native timeval tv_usec(int tv_usec);        /* and microseconds */
}
