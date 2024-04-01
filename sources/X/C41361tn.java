package X;

import android.content.SharedPreferences;

/* renamed from: X.1tn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41361tn {
    public static volatile C41361tn A04;
    public final C003701t A00;
    public final AnonymousClass011 A01;
    public final C02O A02;
    public final C2A9 A03;

    public C41361tn(C003701t c003701t, C2A9 c2a9, AnonymousClass011 anonymousClass011, C02O c02o) {
        this.A00 = c003701t;
        this.A03 = c2a9;
        this.A01 = anonymousClass011;
        this.A02 = c02o;
    }

    public void A00(String str) {
        SharedPreferences A01 = this.A02.A01("cron-scheduler");
        synchronized (this) {
            A01.edit().putInt(str, A01.getInt(str, 0) + 1).apply();
        }
    }
}
