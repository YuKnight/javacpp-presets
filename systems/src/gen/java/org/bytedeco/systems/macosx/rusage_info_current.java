// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.macosx.*;


@Opaque @Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class rusage_info_current extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public rusage_info_current() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rusage_info_current(Pointer p) { super(p); }
}
