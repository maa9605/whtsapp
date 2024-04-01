package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.0xd */
/* loaded from: classes.dex */
public final class C20500xd {
    public static volatile C1YX A00 = new C1YX(null);

    public static void A00() {
        if (!C20390xS.A00 || Build.VERSION.SDK_INT < 18) {
            return;
        }
        Trace.endSection();
    }
}
