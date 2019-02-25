// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("tensorflow::gtl::FlatMap<TF_Session*,tensorflow::string>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_SessionStringMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_SessionStringMap(Pointer p) { super(p); }
    public TF_SessionStringMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef TF_SessionStringMap put(@ByRef TF_SessionStringMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @StdString BytePointer get(TF_Session i);
    public native TF_SessionStringMap put(TF_Session i, BytePointer value);
    @ValueSetter @Index public native TF_SessionStringMap put(TF_Session i, @StdString String value);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*().first") @MemberGetter @Const TF_Session first();
        public native @Name("operator*().second") @MemberGetter @StdString BytePointer second();
    }
}

