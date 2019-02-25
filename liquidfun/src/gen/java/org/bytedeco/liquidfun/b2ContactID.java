// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Contact ids to facilitate warm starting. */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ContactID extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ContactID() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ContactID(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ContactID(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ContactID position(long position) {
        return (b2ContactID)super.position(position);
    }

	public native @ByRef b2ContactFeature cf(); public native b2ContactID cf(b2ContactFeature cf);
	/** Used to quickly compare contact ids. */
	public native @Cast("uint32") long key(); public native b2ContactID key(long key);
}
