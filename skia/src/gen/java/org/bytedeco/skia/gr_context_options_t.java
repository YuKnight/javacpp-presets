// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class gr_context_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gr_context_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gr_context_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gr_context_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gr_context_options_t position(long position) {
        return (gr_context_options_t)super.position(position);
    }

    public native @Cast("bool") boolean fSuppressPrints(); public native gr_context_options_t fSuppressPrints(boolean fSuppressPrints);
    public native int fMaxTextureSizeOverride(); public native gr_context_options_t fMaxTextureSizeOverride(int fMaxTextureSizeOverride);
    public native int fMaxTileSizeOverride(); public native gr_context_options_t fMaxTileSizeOverride(int fMaxTileSizeOverride);
    public native @Cast("bool") boolean fSuppressDualSourceBlending(); public native gr_context_options_t fSuppressDualSourceBlending(boolean fSuppressDualSourceBlending);
    public native int fBufferMapThreshold(); public native gr_context_options_t fBufferMapThreshold(int fBufferMapThreshold);
    public native @Cast("bool") boolean fUseDrawInsteadOfPartialRenderTargetWrite(); public native gr_context_options_t fUseDrawInsteadOfPartialRenderTargetWrite(boolean fUseDrawInsteadOfPartialRenderTargetWrite);
    public native @Cast("bool") boolean fImmediateMode(); public native gr_context_options_t fImmediateMode(boolean fImmediateMode);
    public native @Cast("bool") boolean fClipDrawOpsToBounds(); public native gr_context_options_t fClipDrawOpsToBounds(boolean fClipDrawOpsToBounds);
    public native int fMaxOpCombineLookback(); public native gr_context_options_t fMaxOpCombineLookback(int fMaxOpCombineLookback);
    public native int fMaxOpCombineLookahead(); public native gr_context_options_t fMaxOpCombineLookahead(int fMaxOpCombineLookahead);
    public native @Cast("bool") boolean fUseShaderSwizzling(); public native gr_context_options_t fUseShaderSwizzling(boolean fUseShaderSwizzling);
    public native @Cast("bool") boolean fDoManualMipmapping(); public native gr_context_options_t fDoManualMipmapping(boolean fDoManualMipmapping);
    public native @Cast("bool") boolean fEnableInstancedRendering(); public native gr_context_options_t fEnableInstancedRendering(boolean fEnableInstancedRendering);
    public native @Cast("bool") boolean fAllowPathMaskCaching(); public native gr_context_options_t fAllowPathMaskCaching(boolean fAllowPathMaskCaching);
    public native @Cast("bool") boolean fRequireDecodeDisableForSRGB(); public native gr_context_options_t fRequireDecodeDisableForSRGB(boolean fRequireDecodeDisableForSRGB);
    public native @Cast("bool") boolean fDisableGpuYUVConversion(); public native gr_context_options_t fDisableGpuYUVConversion(boolean fDisableGpuYUVConversion);
    public native @Cast("bool") boolean fSuppressPathRendering(); public native gr_context_options_t fSuppressPathRendering(boolean fSuppressPathRendering);
    public native @Cast("gr_contextoptions_gpupathrenderers_t") int fGpuPathRenderers(); public native gr_context_options_t fGpuPathRenderers(int fGpuPathRenderers);
}
