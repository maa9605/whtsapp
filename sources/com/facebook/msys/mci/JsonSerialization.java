package com.facebook.msys.mci;

import X.C003601s;

/* loaded from: classes.dex */
public class JsonSerialization {
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized boolean initialize() {
        synchronized (JsonSerialization.class) {
            C003601s.A01("JsonSerialization.initialize");
            if (sInitialized) {
                C003601s.A00();
                return false;
            }
            nativeInitialize();
            sInitialized = true;
            C003601s.A00();
            return true;
        }
    }
}
