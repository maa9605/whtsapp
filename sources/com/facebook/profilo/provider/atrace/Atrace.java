package com.facebook.profilo.provider.atrace;

import X.C1YQ;
import X.C20290xB;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative();

    public static native boolean installSystraceHook(int i);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative();

    public static void enableSystrace() {
        Method method;
        if (hasHacks()) {
            enableSystraceNative();
            Field field = C20290xB.A00;
            if (field != null && (method = C20290xB.A01) != null) {
                try {
                    field.set(null, method.invoke(null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public static synchronized boolean hasHacks() {
        boolean z;
        synchronized (Atrace.class) {
            z = sHasHook;
            if (!z && !sHookFailed) {
                z = installSystraceHook(C1YQ.A00);
                sHasHook = z;
                sHookFailed = z ? false : true;
            }
        }
        return z;
    }

    public static void restoreSystrace() {
        Method method;
        if (hasHacks()) {
            restoreSystraceNative();
            Field field = C20290xB.A00;
            if (field != null && (method = C20290xB.A01) != null) {
                try {
                    field.set(null, method.invoke(null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }
}
