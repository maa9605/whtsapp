package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.1YX  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YX {
    public C1YX() {
    }

    public C1YX(C20490xc c20490xc) {
    }

    public static void A00(String str, Class cls) {
        if (!C20390xS.A00 || Build.VERSION.SDK_INT < 18) {
            return;
        }
        if (cls != null) {
            StringBuilder A0P = C000200d.A0P(str);
            A0P.append(cls.getSimpleName());
            str = A0P.toString();
        }
        Trace.beginSection(str);
    }
}
