// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;

@Opaque @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class Serializer extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Serializer() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Serializer(Pointer p) { super(p); }
}
