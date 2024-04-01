package X;

import android.content.SharedPreferences;

/* renamed from: X.1us  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42011us {
    public static volatile C42011us A03;
    public final AnonymousClass011 A00;
    public final C02O A01;
    public final C2A9 A02;

    public C42011us(C2A9 c2a9, AnonymousClass011 anonymousClass011, C02O c02o) {
        this.A02 = c2a9;
        this.A00 = anonymousClass011;
        this.A01 = c02o;
    }

    public final SharedPreferences A00() {
        return this.A01.A01("ntp-scheduler");
    }

    public void A01(String str) {
        SharedPreferences A00 = A00();
        synchronized (this) {
            A00.edit().putInt(str, A00.getInt(str, 0) + 1).apply();
        }
    }
}
