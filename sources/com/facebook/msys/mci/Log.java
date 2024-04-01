package com.facebook.msys.mci;

import X.C003601s;
import X.C0Iw;

/* loaded from: classes.dex */
public class Log {
    public static boolean sRegistered;

    public static int getWaLogLevel(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return i != 7 ? 1 : 0;
                    }
                    return 2;
                }
                return 3;
            }
            return 4;
        }
        return 5;
    }

    public static native void registerLoggerNative(long j, int i);

    public static native void setLogLevel(int i);

    public static void log(int i, String str) {
        int waLogLevel = getWaLogLevel(i);
        StringBuilder sb = new StringBuilder("wamsys/");
        sb.append(str);
        com.whatsapp.util.Log.log(waLogLevel, sb.toString());
    }

    public static synchronized boolean registerLogger(C0Iw c0Iw) {
        synchronized (Log.class) {
            C003601s.A01("registerLogger");
            if (sRegistered) {
                C003601s.A00();
                return false;
            }
            registerLoggerNative(c0Iw.A01, c0Iw.A00);
            setLogLevel(4);
            sRegistered = true;
            C003601s.A00();
            return true;
        }
    }
}
