// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IBuilder
 * 
 *  \brief Builds an engine from a network definition.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IBuilder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IBuilder(Pointer p) { super(p); }

    /**
     *  \brief Create a network definition object.
     * 
     *  @see INetworkDefinition
     *  */
    
    
    //!
    //!
    //!
    //!
    public native INetworkDefinition createNetwork();

    /**
     *  \brief Set the maximum batch size.
     * 
     *  @param batchSize The maximum batch size which can be used at execution time, and also the batch size for which the engine will be optimized.
     * 
     *  @see getMaxBatchSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setMaxBatchSize(int batchSize);

    /**
     *  \brief Get the maximum batch size.
     * 
     *  @return The maximum batch size.
     * 
     *  @see setMaxBatchSize()
     *  @see getMaxDLABatchSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getMaxBatchSize();

    /**
     *  \brief Set the maximum workspace size.
     * 
     *  @param workspaceSize The maximum GPU temporary memory which the engine can use at execution time.
     * 
     *  @see getMaxWorkspaceSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setMaxWorkspaceSize(@Cast("std::size_t") long workspaceSize);

    /**
     *  \brief Get the maximum workspace size.
     * 
     *  @return The maximum workspace size.
     * 
     *  @see setMaxWorkspaceSize()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("std::size_t") long getMaxWorkspaceSize();

    /**
     *  \brief Set whether half2 mode is used.
     * 
     *  half2 mode is a paired-image mode that is significantly faster for batch sizes greater than one on platforms with fp16 support.
     * 
     *  @param mode Whether half2 mode is used.
     * 
     *  @see getHalf2Mode()
     * 
     *  @deprecated This function is superseded by setFp16Mode.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void setHalf2Mode(@Cast("bool") boolean mode);

    /**
     *  \brief Query whether half2 mode is used.
     * 
     *  @see setHalf2Mode()
     * 
     *  @deprecated This function is superseded by getFp16Mode.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") boolean getHalf2Mode();

    /**
     *  \brief Set whether the builder should use debug synchronization.
     * 
     *  If this flag is true, the builder will synchronize after timing each layer, and report the layer name. It can be useful when diagnosing issues at build time.
     *  */
    
    
    //!
    //!
    //!
    public native void setDebugSync(@Cast("bool") boolean sync);

    /**
     *  \brief Query whether the builder will use debug synchronization.
     * 
     *  @see setDebugSync()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean getDebugSync();

    /**
     *  \brief Set the number of minimization iterations used when timing layers.
     * 
     *  When timing layers, the builder minimizes over a set of average times for layer execution. This parameter controls the number of iterations
     *  used in minimization.
     * 
     *  @see getMinFindIterations()
     *  */
    
    
    //!
    //!
    //!
    public native void setMinFindIterations(int minFind);

    /**
     *  \brief Query the number of minimization iterations.
     * 
     *  @see setMinFindIterations()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getMinFindIterations();

    /**
     *  \brief Set the number of averaging iterations used when timing layers.
     * 
     *  When timing layers, the builder minimizes over a set of average times for layer execution. This parameter controls the number of iterations
     *  used in averaging.
     * 
     *  @see getAverageFindIterations()
     *  */
    
    
    //!
    //!
    //!
    public native void setAverageFindIterations(int avgFind);

    /**
     *  \brief Query the number of averaging iterations.
     * 
     *  @see setAverageFindIterations()
     *  */
    
    
    //!
    //!
    //!
    public native int getAverageFindIterations();

    /**
     *  \brief Build a CUDA engine from a network definition.
     * 
     *  @see INetworkDefinition ICudaEngine
     *  */
    
    
    //!
    //!
    public native ICudaEngine buildCudaEngine(@ByRef INetworkDefinition network);

    /**
     *  \brief Determine whether the platform has fast native fp16.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") boolean platformHasFastFp16();

    /**
     *  \brief Determine whether the platform has fast native int8.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") boolean platformHasFastInt8();

    /**
     *  \brief Destroy this object.
     *  */
    
    
    //!
    //!
    //!
    public native void destroy();

    /**
     *  \brief Set the maximum value for a region.
     * 
     *  Used for INT8 mode compression.
     *  */
    
    
    //!
    //!
    //!
    public native void setInt8Mode(@Cast("bool") boolean mode);

    /**
     *  \brief Query whether Int8 mode is used.
     * 
     *  @see setInt8Mode()
     *  */
    
    
    //!
    //!
    public native @Cast("bool") boolean getInt8Mode();

    /**
     *  \brief Set Int8 Calibration interface.
     *  */
    
    
    //!
    //!
    public native void setInt8Calibrator(IInt8Calibrator calibrator);

    /**
     *  \brief Set the device that this layer must execute on.
     *  @param DeviceType that this layer must execute on.
     *  If DeviceType is not set or is reset, TensorRT will use the default DeviceType set in the builder.
     *  @see getDeviceType()
     *  */
    
    
    //!
    //!
    public native void setDeviceType(ILayer layer, DeviceType deviceType);
    public native void setDeviceType(ILayer layer, @Cast("nvinfer1::DeviceType") int deviceType);

    /**
     *  \brief Get the device that this layer executes on.
     *  @return Returns DeviceType of the layer.
     *  */
    
    
    //!
    //!
    public native DeviceType getDeviceType(@Const ILayer layer);

    /**
     *  \brief whether the DeviceType has been explicitly set for this layer
     *  @return whether the DeviceType has been explicitly set
     *  @see setDeviceType() getDeviceType() resetDeviceType()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") boolean isDeviceTypeSet(@Const ILayer layer);

    /**
     *  \brief reset the DeviceType for this layer
     * 
     *  @see setDeviceType() getDeviceType() isDeviceTypeSet()
     *  */
    
    
    //!
    //!
    public native void resetDeviceType(ILayer layer);

    /**
     *  \brief Checks if a layer can run on DLA.
     *  @return status true if the layer can on DLA else returns false.
     *  */
    
    
    //!
    //!
    public native @Cast("bool") boolean canRunOnDLA(@Const ILayer layer);

    /**
     *  \brief Sets the default DeviceType to be used by the builder. It ensures that all the layers that can run on this device will run on it, unless setDeviceType is used to override the default DeviceType for a layer.
     *  @see getDefaultDeviceType()
     *  */
    
    
    //!
    //!
    public native void setDefaultDeviceType(DeviceType deviceType);
    public native void setDefaultDeviceType(@Cast("nvinfer1::DeviceType") int deviceType);

    /**
     *  \brief Get the default DeviceType which was set by setDefaultDeviceType.
     *  */
    
    
    //!
    //!
    public native DeviceType getDefaultDeviceType();

    /**
     *  \brief Get the maximum batch size DLA can support.
     *  For any tensor the total volume of index dimensions combined(dimensions other than CHW) with the requested batch size should not exceed the value returned by this function.
     *  */
    
    
    //!
    //!
    public native int getMaxDLABatchSize(DeviceType deviceType);
    public native int getMaxDLABatchSize(@Cast("nvinfer1::DeviceType") int deviceType);

    /**
     *  \brief Sets the builder to use GPU if a layer that was supposed to run on DLA can not run on DLA.
     *  @param Allows fallback if setFallBackMode is true else disables fallback option.
     *  */
    
    
    //!
    //!
    public native void allowGPUFallback(@Cast("bool") boolean setFallBackMode);

    /**
     *  \brief Resets the builder state
     *  */
    public native void reset(@ByRef INetworkDefinition network);
    /**
     *  \brief Set the GPU allocator.
     *  @param allocator Set the GPU allocator to be used by the builder. All GPU memory acquired will use this allocator. If NULL is passed, the default allocator will be used.
     * 
     *  Default: uses cudaMalloc/cudaFree.
     * 
     *  \note This allocator will be passed to any engines created via the builder; thus the lifetime of the allocator must span the lifetime of those engines as
     *  well as that of the builder. If nullptr is passed, the default allocator will be used.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native void setGpuAllocator(IGpuAllocator allocator);

    /**
     *  \brief Set whether or not 16-bit kernels are permitted.
     * 
     *  During engine build fp16 kernels will also be tried when this mode is enabled.
     * 
     *  @param mode Whether 16-bit kernels are permitted.
     * 
     *  @see getFp16Mode()
     *  */
    
    
    //!
    //!
    //!
    public native void setFp16Mode(@Cast("bool") boolean mode);

    /**
     *  \brief Query whether 16-bit kernels are permitted.
     * 
     *  @see setFp16Mode()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") boolean getFp16Mode();

    /**
     *  \brief Set whether or not type constraints are strict.
     * 
     *  When strict type constraints are in use, TensorRT will always choose a layer implementation that conforms to the type constraints
     *  specified, if one exists. If this flag is not set, a higher-precision implementation may be chosen if it results in higher performance.
     * 
     *  If no conformant layer exists, TensorRT will choose a non-conformant layer if available regardless of the setting of this flag.
     * 
     *  See the developer guide for the definition of strictness.
     * 
     *  @param mode Whether type constraints are strict
     * 
     *  @see getStrictTypeConstraints()
     *  */
    
    
    //!
    //!
    //!
    public native void setStrictTypeConstraints(@Cast("bool") boolean mode);

    /**
     *  \brief Query whether or not type constraints are strict.
     * 
     *  @see setStrictTypeConstraints()
     *  */
    public native @Cast("bool") boolean getStrictTypeConstraints();

}
