// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
//  Privilege Set - This is defined for a privilege set of one.
//                  If more than one privilege is needed, then this structure
//                  will need to be allocated with more space.
//
//  Note: don't change this structure without fixing the INITIAL_PRIVILEGE_SET
//  structure (defined in se.h)
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PRIVILEGE_SET extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PRIVILEGE_SET() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PRIVILEGE_SET(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PRIVILEGE_SET(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PRIVILEGE_SET position(long position) {
        return (PRIVILEGE_SET)super.position(position);
    }

    public native @Cast("DWORD") int PrivilegeCount(); public native PRIVILEGE_SET PrivilegeCount(int PrivilegeCount);
    public native @Cast("DWORD") int Control(); public native PRIVILEGE_SET Control(int Control);
    public native @ByRef LUID_AND_ATTRIBUTES Privilege(int i); public native PRIVILEGE_SET Privilege(int i, LUID_AND_ATTRIBUTES Privilege);
    @MemberGetter public native LUID_AND_ATTRIBUTES Privilege();
    }