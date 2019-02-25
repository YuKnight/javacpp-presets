// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.QtGui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.qt.QtCore.*;
import static org.bytedeco.qt.global.QtCore.*;

import static org.bytedeco.qt.global.QtGui.*;

// Parsed from QtGui/qguiapplication.h

@Properties(inherit = org.bytedeco.qt.presets.QtGui.class)
public class QGuiApplication extends QCoreApplication {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QGuiApplication(Pointer p) { super(p); }

// #ifdef Q_QDOC
    public QGuiApplication(@ByRef IntPointer argc, @Cast("char**") PointerPointer argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntPointer argc, @Cast("char**") PointerPointer argv);
    public QGuiApplication(@ByRef IntPointer argc, @Cast("char**") @ByPtrPtr BytePointer argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntPointer argc, @Cast("char**") @ByPtrPtr BytePointer argv);
    public QGuiApplication(@ByRef IntBuffer argc, @Cast("char**") @ByPtrPtr ByteBuffer argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntBuffer argc, @Cast("char**") @ByPtrPtr ByteBuffer argv);
    public QGuiApplication(@ByRef int[] argc, @Cast("char**") @ByPtrPtr byte[] argv) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef int[] argc, @Cast("char**") @ByPtrPtr byte[] argv);
// #else
// #endif

    public static native void setApplicationDisplayName(@Const @ByRef QString name);
    public static native @ByVal QString applicationDisplayName();

    public static native void setDesktopFileName(@Const @ByRef QString name);
    public static native @ByVal QString desktopFileName();

    public static native void setWindowIcon(@Const @ByRef QIcon icon);
    public static native @ByVal QIcon windowIcon();

    public static native @ByVal QString platformName();
    public static native QObject focusObject();

    public native double devicePixelRatio();

// #ifndef QT_NO_CURSOR
    public static native void restoreOverrideCursor();
// #endif

    public static native @ByVal QFont font();
    public static native void setFont(@Const @ByRef QFont arg0);

// #ifndef QT_NO_CLIPBOARD
// #endif

    public static native @ByVal @Cast("Qt::KeyboardModifiers") int keyboardModifiers();
    public static native @ByVal @Cast("Qt::KeyboardModifiers") int queryKeyboardModifiers();

    public static native void setLayoutDirection(@Cast("Qt::LayoutDirection") int direction);
    public static native @Cast("Qt::LayoutDirection") int layoutDirection();

    public static native @Cast("bool") boolean isRightToLeft();
    public static native @Cast("bool") boolean isLeftToRight();
    public static native void setDesktopSettingsAware(@Cast("bool") boolean on);
    public static native @Cast("bool") boolean desktopSettingsAware();

    public static native void setQuitOnLastWindowClosed(@Cast("bool") boolean quit);
    public static native @Cast("bool") boolean quitOnLastWindowClosed();

    public static native @Cast("Qt::ApplicationState") int applicationState();

    public static native int exec();
    public native @Cast("bool") @Name("notify") boolean _notify(QObject arg0, QEvent arg1);

// #ifndef QT_NO_SESSIONMANAGER
    // session management
    public native @Cast("bool") boolean isSessionRestored();
    public native @ByVal QString sessionId();
    public native @ByVal QString sessionKey();
    public native @Cast("bool") boolean isSavingSession();

    public static native @Cast("bool") boolean isFallbackSessionManagementEnabled();
    public static native void setFallbackSessionManagementEnabled(@Cast("bool") boolean arg0);
// #endif

    public static native void sync();
}
