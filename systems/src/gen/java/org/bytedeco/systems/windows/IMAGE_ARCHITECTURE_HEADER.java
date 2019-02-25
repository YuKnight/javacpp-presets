// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;
  // when DBG was updated, the
                                                // old checksum didn't match.

//
//  The .arch section is made up of headers, each describing an amask position/value
//  pointing to an array of IMAGE_ARCHITECTURE_ENTRY's.  Each "array" (both the header
//  and entry arrays) are terminiated by a quadword of 0xffffffffL.
//
//  NOTE: There may be quadwords of 0 sprinkled around and must be skipped.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_ARCHITECTURE_HEADER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_ARCHITECTURE_HEADER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_ARCHITECTURE_HEADER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_ARCHITECTURE_HEADER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_ARCHITECTURE_HEADER position(long position) {
        return (IMAGE_ARCHITECTURE_HEADER)super.position(position);
    }

    public native @Cast("unsigned int") @NoOffset int AmaskValue(); public native IMAGE_ARCHITECTURE_HEADER AmaskValue(int AmaskValue);                 // 1 -> code section depends on mask bit
                                                // 0 -> new instruction depends on mask bit
                                         // MBZ
    public native @Cast("unsigned int") @NoOffset int AmaskShift(); public native IMAGE_ARCHITECTURE_HEADER AmaskShift(int AmaskShift);                 // Amask bit in question for this fixup
                                        // MBZ
    public native @Cast("DWORD") int FirstEntryRVA(); public native IMAGE_ARCHITECTURE_HEADER FirstEntryRVA(int FirstEntryRVA);                        // RVA into .arch section to array of ARCHITECTURE_ENTRY's
}
