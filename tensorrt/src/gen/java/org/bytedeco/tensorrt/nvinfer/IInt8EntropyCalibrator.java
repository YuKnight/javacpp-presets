// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  Entropy calibrator. This is the preferred calibrator, as it is less complicated than the legacy calibrator and produces better results.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IInt8EntropyCalibrator extends IInt8Calibrator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IInt8EntropyCalibrator(Pointer p) { super(p); }

    /**
     *  Signal that this is the entropy calibrator.
     *  */
    public native CalibrationAlgoType getAlgorithm();
}
