package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public class StackTraceWhitelist {
    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    static {
        SoLoader.A03("profilo_stacktrace");
    }
}
