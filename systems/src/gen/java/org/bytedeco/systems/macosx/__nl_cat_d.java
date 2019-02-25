// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class __nl_cat_d extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public __nl_cat_d() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public __nl_cat_d(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __nl_cat_d(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public __nl_cat_d position(long position) {
        return (__nl_cat_d)super.position(position);
    }

	public native Pointer __data(); public native __nl_cat_d __data(Pointer __data);
	public native int __size(); public native __nl_cat_d __size(int __size);
}
