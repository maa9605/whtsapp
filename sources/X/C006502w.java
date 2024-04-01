package X;

import android.content.SharedPreferences;

/* renamed from: X.02w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C006502w {
    public static volatile C006502w A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C006502w(C02O c02o) {
        this.A01 = c02o;
    }

    public static C006502w A00() {
        if (A02 == null) {
            synchronized (C006502w.class) {
                if (A02 == null) {
                    A02 = new C006502w(C02O.A00());
                }
            }
        }
        return A02;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A02("field-stats-events-sampling");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}
