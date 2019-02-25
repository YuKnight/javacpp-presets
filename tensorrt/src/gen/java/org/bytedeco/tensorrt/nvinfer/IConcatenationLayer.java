// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IConcatenationLayer
 * 
 *  \brief A concatenation layer in a network definition.
 * 
 *  The output channel size is the sum of the channel sizes of the inputs.
 *  The other output sizes are the same as the other input sizes,
 *  which must all match.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IConcatenationLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IConcatenationLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the axis along which concatenation occurs.
     * 
     *  0 is the major axis (excluding the batch dimension). The default is the number of non-batch axes in the tensor minus three (e.g.
     *  for an NCHW input it would be 0), or 0 if there are fewer than 3 non-batch axes.
     * 
     *  @param axis The axis along which concatenation occurs.
     *  */
    
    
    //!
    //!
    //!
    public native void setAxis(int axis);

    /**
     *  \brief Get the axis along which concatenation occurs.
     * 
     *  @see setAxis()
     *  */
    public native int getAxis();
}
