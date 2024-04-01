package X;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.01s  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C003601s {
    public static long A00;
    public static Method A01;
    public static Method A02;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 18 || i >= 29) {
            return;
        }
        try {
            A00 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            Trace.class.getMethod("isTagEnabled", cls);
            A01 = Trace.class.getMethod("asyncTraceBegin", cls, String.class, Integer.TYPE);
            Class cls2 = Integer.TYPE;
            A02 = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, cls2);
            Trace.class.getMethod("traceCounter", Long.TYPE, String.class, cls2);
        } catch (Exception e) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e);
        }
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void A01(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
