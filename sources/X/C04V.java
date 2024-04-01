package X;

import android.util.Pair;

/* renamed from: X.04V  reason: invalid class name */
/* loaded from: classes.dex */
public class C04V {
    public final C04W A00 = new C04W(20);

    public Pair A00(String str) {
        C04W c04w = this.A00;
        synchronized (c04w) {
            if (c04w.containsKey(str)) {
                C0Mt c0Mt = (C0Mt) c04w.get(str);
                return Pair.create(Boolean.valueOf(c0Mt == null), c0Mt);
            }
            return null;
        }
    }

    public void A01(String str) {
        C04W c04w = this.A00;
        synchronized (c04w) {
            c04w.put(str, null);
        }
    }
}
