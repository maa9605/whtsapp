package X;

import android.content.SharedPreferences;

/* renamed from: X.0KQ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0KQ {
    public static volatile C0KQ A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C0KQ(C02O c02o) {
        this.A01 = c02o;
    }

    public static C0KQ A00() {
        if (A02 == null) {
            synchronized (C0KQ.class) {
                if (A02 == null) {
                    A02 = new C0KQ(C02O.A00());
                }
            }
        }
        return A02;
    }

    public long A01() {
        return A02().getLong("contact_full_sync_wait", 86400000L);
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A01("contact_sync_prefs");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public void A03() {
        C000200d.A0d(this, "contact_sync_backoff", -1L);
        C000200d.A0d(this, "sidelist_sync_backoff", -1L);
        A02().edit().putLong("status_sync_backoff", -1L).apply();
        A02().edit().putLong("picture_sync_backoff", -1L).apply();
        A02().edit().putLong("business_sync_backoff", -1L).apply();
        A02().edit().putLong("devices_sync_backoff", -1L).apply();
        A02().edit().putLong("payment_sync_backoff", -1L).apply();
    }
}
