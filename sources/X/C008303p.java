package X;

import com.facebook.soloader.SoLoader;

/* renamed from: X.03p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C008303p {
    public static C008703t A00;

    public static void A00(String str) {
        synchronized (C008303p.class) {
            if (A00 == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        if (A00 == null) {
            throw null;
        }
        SoLoader.A03(str);
    }
}
