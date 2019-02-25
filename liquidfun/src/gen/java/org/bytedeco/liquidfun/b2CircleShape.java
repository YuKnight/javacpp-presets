// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A circle shape. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2CircleShape extends b2Shape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2CircleShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2CircleShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2CircleShape position(long position) {
        return (b2CircleShape)super.position(position);
    }

	public b2CircleShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Implement b2Shape. */
	public native b2Shape Clone(b2BlockAllocator allocator);

	/** @see b2Shape::GetChildCount */
	public native @Cast("int32") int GetChildCount();

	/** Implement b2Shape. */
	public native @Cast("bool") boolean TestPoint(@Const @ByRef b2Transform transform, @Const @ByRef b2Vec2 p);

	// @see b2Shape::ComputeDistance
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") FloatPointer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") FloatBuffer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") float[] distance, b2Vec2 normal, @Cast("int32") int childIndex);

	/** Implement b2Shape. */
	public native @Cast("bool") boolean RayCast(b2RayCastOutput output, @Const @ByRef b2RayCastInput input,
					@Const @ByRef b2Transform transform, @Cast("int32") int childIndex);

	/** @see b2Shape::ComputeAABB */
	public native void ComputeAABB(b2AABB aabb, @Const @ByRef b2Transform transform, @Cast("int32") int childIndex);

	/** @see b2Shape::ComputeMass */
	public native void ComputeMass(b2MassData massData, @Cast("float32") float density);

	/** Get the supporting vertex index in the given direction. */
	public native @Cast("int32") int GetSupport(@Const @ByRef b2Vec2 d);

	/** Get the supporting vertex in the given direction. */
	public native @Const @ByRef b2Vec2 GetSupportVertex(@Const @ByRef b2Vec2 d);

	/** Get the vertex count. */
	public native @Cast("int32") int GetVertexCount();

	/** Get a vertex by index. Used by b2Distance. */
	public native @Const @ByRef b2Vec2 GetVertex(@Cast("int32") int index);
	/** Set position with direct floats. */
	public native void SetPosition(@Cast("float32") float x, @Cast("float32") float y);

	/** Get x-coordinate of position. */
	public native @Cast("float32") float GetPositionX();

	/** Get y-coordinate of position. */
	public native @Cast("float32") float GetPositionY();
// #endif // LIQUIDFUN_EXTERNAL_LANGUAGE_API

	/** Position */
	public native @ByRef b2Vec2 m_p(); public native b2CircleShape m_p(b2Vec2 m_p);
}
