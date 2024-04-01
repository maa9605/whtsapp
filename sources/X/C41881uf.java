package X;

import android.content.SharedPreferences;

/* renamed from: X.1uf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41881uf {
    public static volatile C41881uf A01;
    public final C02O A00;

    public C41881uf(C02O c02o) {
        this.A00 = c02o;
    }

    public static C41881uf A00() {
        if (A01 == null) {
            synchronized (C41881uf.class) {
                if (A01 == null) {
                    A01 = new C41881uf(C02O.A00());
                }
            }
        }
        return A01;
    }

    public final void A01(String str) {
        SharedPreferences A012 = this.A00.A01("scheduler-experiment");
        synchronized (this) {
            A012.edit().putInt(str, A012.getInt(str, 0) + 1).apply();
        }
    }
}
