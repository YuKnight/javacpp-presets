// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** The base joint class. Joints are used to constraint two bodies together in
 *  various fashions. Some joints also feature limits and motors. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Joint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Joint(Pointer p) { super(p); }


	/** Get the type of the concrete joint. */
	public native @Cast("b2JointType") int GetType();

	/** Get the first body attached to this joint. */
	public native b2Body GetBodyA();

	/** Get the second body attached to this joint. */
	public native b2Body GetBodyB();

	/** Get the anchor point on bodyA in world coordinates. */
	public native @ByVal b2Vec2 GetAnchorA();

	/** Get the anchor point on bodyB in world coordinates. */
	public native @ByVal b2Vec2 GetAnchorB();

	/** Get the reaction force on bodyB at the joint anchor in Newtons. */
	public native @ByVal b2Vec2 GetReactionForce(@Cast("float32") float inv_dt);

	/** Get the reaction torque on bodyB in N*m. */
	public native @Cast("float32") float GetReactionTorque(@Cast("float32") float inv_dt);

	/** Get the next joint the world joint list. */
	public native b2Joint GetNext();

	/** Get the user data pointer. */
	public native Pointer GetUserData();

	/** Set the user data pointer. */
	public native void SetUserData(Pointer data);

	/** Short-cut function to determine if either body is inactive. */
	public native @Cast("bool") boolean IsActive();

	/** Get collide connected.
	 *  Note: modifying the collide connect flag won't work correctly because
	 *  the flag is only checked when fixture AABBs begin to overlap. */
	public native @Cast("bool") boolean GetCollideConnected();

	/** Dump this joint to the log file. */
	public native void Dump();

	/** Shift the origin for any points stored in world coordinates. */
	public native void ShiftOrigin(@Const @ByRef b2Vec2 newOrigin);
}
