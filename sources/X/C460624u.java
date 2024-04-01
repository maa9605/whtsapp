package X;

import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: X.24u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C460624u {
    public static volatile C460624u A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C460624u(C02O c02o) {
        this.A01 = c02o;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        if (this.A00 == null) {
            C02O c02o = this.A01;
            SharedPreferences A01 = c02o.A01("block_reasons_prefs");
            this.A00 = A01;
            if (A01.getBoolean("biz_block_reasons_migration_pending", true)) {
                HashMap hashMap = new HashMap();
                hashMap.put("biz_block_reasons", String.class);
                hashMap.put("biz_block_reasons_country", String.class);
                hashMap.put("biz_block_reasons_version", Integer.class);
                hashMap.put("biz_block_reasons_language", String.class);
                C003101m.A0J(c02o.A01(C000500h.A04), this.A00, hashMap, false);
                this.A00.edit().putBoolean("biz_block_reasons_migration_pending", false).apply();
            }
        }
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            throw null;
        }
        return sharedPreferences;
    }

    public void A01(int i) {
        A00().edit().putInt("biz_block_reasons_api_back_off_days", i).apply();
    }

    public void A02(long j) {
        A00().edit().putLong("biz_block_reasons_api_cooling_timestamp", j).apply();
    }
}
