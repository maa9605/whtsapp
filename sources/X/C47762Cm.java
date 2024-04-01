package X;

import android.content.SharedPreferences;

/* renamed from: X.2Cm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47762Cm {
    public static volatile C47762Cm A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C47762Cm(C02O c02o) {
        this.A01 = c02o;
    }

    public static C47762Cm A00() {
        if (A02 == null) {
            synchronized (C47762Cm.class) {
                if (A02 == null) {
                    A02 = new C47762Cm(C02O.A00());
                }
            }
        }
        return A02;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A01("time_spent_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}
