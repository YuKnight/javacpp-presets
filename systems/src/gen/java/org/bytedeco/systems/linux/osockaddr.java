// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


// #ifdef __USE_BSD
/* This is the 4.3 BSD `struct sockaddr' format, which is used as wire
   format in the grotty old 4.3 `talk' protocol.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class osockaddr extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public osockaddr() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public osockaddr(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public osockaddr(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public osockaddr position(long position) {
        return (osockaddr)super.position(position);
    }

    public native @Cast("unsigned short int") short sa_family(); public native osockaddr sa_family(short sa_family);
    public native @Cast("unsigned char") byte sa_data(int i); public native osockaddr sa_data(int i, byte sa_data);
    @MemberGetter public native @Cast("unsigned char*") BytePointer sa_data();
  }
