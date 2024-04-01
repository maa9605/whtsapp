package com.facebook.jni;

import X.AbstractC19820wA;
import X.C008303p;

/* loaded from: classes.dex */
public class HybridData {
    public Destructor mDestructor = new Destructor(this);

    static {
        C008303p.A00("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    /* loaded from: classes.dex */
    public class Destructor extends AbstractC19820wA {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        public Destructor(Object obj) {
            super(obj);
        }

        @Override // X.AbstractC19820wA
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }
}
