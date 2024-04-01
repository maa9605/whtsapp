package X;

import android.content.SharedPreferences;

/* renamed from: X.056  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass056 {
    public static volatile AnonymousClass056 A03;
    public SharedPreferences A00;
    public final AnonymousClass012 A01;
    public final C02O A02;

    public AnonymousClass056(AnonymousClass012 anonymousClass012, C02O c02o) {
        this.A01 = anonymousClass012;
        this.A02 = c02o;
    }

    public static AnonymousClass056 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass056.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass056(AnonymousClass012.A00(), C02O.A00());
                }
            }
        }
        return A03;
    }

    public static final String A01(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "lukewarm_start_count_pref";
                }
                throw new IllegalArgumentException(C000200d.A0D("Unknown wam launch type enum value: ", i));
            }
            return "warm_start_count_pref";
        }
        return "fg_cold_start_count_pref";
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A01("core_health_event_pref_file");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }
}
