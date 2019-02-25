// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** b2TypedIntrusiveListNode which supports inserting an object into a single
 *  doubly linked list.  For objects that need to be inserted in multiple
 *  doubly linked lists, use b2IntrusiveListNode.
 * 
 *  For example:
 * 
 *  class IntegerItem : public b2TypedIntrusiveListNode<IntegerItem>
 *  {
 *  public:
 *  	IntegerItem(int32 value) : m_value(value) { }
 *  	~IntegerItem() { }
 *  	int32 GetValue() const { return m_value; }
 *  private:
 *  	int32 m_value;
 *  };
 * 
 *  int main(int argc, const char *arvg[]) {
 *  	b2TypedIntrusiveListNode<IntegerItem> list;
 *  	IntegerItem a(1);
 *  	IntegerItem b(2);
 *  	IntegerItem c(3);
 *  	list.InsertBefore(&a);
 *  	list.InsertBefore(&b);
 *  	list.InsertBefore(&c);
 *  	for (IntegerItem* item = list.GetNext();
 *  		 item != list.GetTerminator(); item = item->GetNext())
 *  	{
 *  		printf("%d\n", item->GetValue());
 *  	}
 *  } */
@Name("b2TypedIntrusiveListNode<b2ParticleHandle>") @NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class ParticleHandleListNode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParticleHandleListNode(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParticleHandleListNode(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ParticleHandleListNode position(long position) {
        return (ParticleHandleListNode)super.position(position);
    }

	public ParticleHandleListNode() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Insert this object after the specified object. */
	public native void InsertAfter(b2ParticleHandle obj);

	/** Insert this object before the specified object. */
	public native void InsertBefore(b2ParticleHandle obj);

	/** Get the next object in the list.
	 *  Check against GetTerminator() before deferencing the object. */
	public native b2ParticleHandle GetNext();

	/** Get the previous object in the list.
	 *  Check against GetTerminator() before deferencing the object. */
	public native b2ParticleHandle GetPrevious();

	/** Get the terminator of the list.
	 *  This should not be dereferenced as it is a pointer to
	 *  b2TypedIntrusiveListNode<T> *not* T. */
	public native b2ParticleHandle GetTerminator();

	/** Remove this object from the list it's currently in. */
	public native b2ParticleHandle Remove();

	/** Determine whether this object is in a list. */
	public native @Cast("bool") boolean InList();

	// Determine whether this list is empty.
	public native @Cast("bool") boolean IsEmpty();

	/** Calculate the length of the list. */
	public native @Cast("uint32") long GetLength();

	public native b2IntrusiveListNode GetListNode();
	/** Get a pointer to the instance of T that contains "node". */
	public static native b2ParticleHandle GetInstanceFromListNode(b2IntrusiveListNode node);
}
