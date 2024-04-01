package X;

import android.content.SharedPreferences;

/* renamed from: X.2V0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2V0 {
    public static int A06 = 7;
    public static volatile C2V0 A07;
    public final C000500h A00;
    public final C003701t A01;
    public final C0GZ A02;
    public final C0GR A03;
    public final C0DW A04;
    public final C0DV A05;

    public C2V0(C003701t c003701t, C0DV c0dv, C0GZ c0gz, C000500h c000500h, C0DW c0dw, C0GR c0gr) {
        this.A01 = c003701t;
        this.A05 = c0dv;
        this.A02 = c0gz;
        this.A00 = c000500h;
        this.A04 = c0dw;
        this.A03 = c0gr;
    }

    public void A00() {
        C000200d.A0j(this.A00, "payments_onboarding_chat_banner_dismmissed", true);
    }

    public boolean A01() {
        C003701t c003701t = this.A01;
        A06 = c003701t.A03(486);
        if (c003701t.A0C(484)) {
            C000500h c000500h = this.A00;
            SharedPreferences sharedPreferences = c000500h.A00;
            if (sharedPreferences.getBoolean("payments_onboarding_banner_registration_started", false) || !this.A04.A04()) {
                return false;
            }
            C0GZ c0gz = this.A02;
            if (c0gz.A08() || c0gz.A09() || c0gz.A0B("tos_no_wallet") || (!c000500h.A0p(604800000L, "payments_onboarding_banner_start_cool_off_timestamp"))) {
                return false;
            }
            long j = sharedPreferences.getLong("payments_onboarding_banner_start_timestamp", -1L);
            if (j == -1) {
                c000500h.A0C("payments_onboarding_banner_last_seen_timestamp");
                C000200d.A0g(c000500h, "payments_onboarding_banner_total_days", 0);
                c000500h.A0D().putInt("payments_onboarding_banner_consecutive_days", 0).apply();
                j = System.currentTimeMillis();
                C000200d.A0h(c000500h, "payments_onboarding_banner_start_timestamp", j);
            }
            if (C02620Cd.A00(System.currentTimeMillis(), j) >= A06 || sharedPreferences.getBoolean("payments_onboarding_chat_banner_dismmissed", false)) {
                return false;
            }
            if (c000500h.A0p(86400000L, "payments_onboarding_banner_last_seen_timestamp")) {
                int i = sharedPreferences.getInt("payments_onboarding_banner_consecutive_days", 0);
                int i2 = A06;
                if (i >= i2) {
                    C000200d.A0g(c000500h, "payments_onboarding_banner_total_days", i2);
                    A00();
                } else {
                    C000200d.A0g(c000500h, "payments_onboarding_banner_total_days", sharedPreferences.getInt("payments_onboarding_banner_total_days", 0) + 1);
                    C000200d.A0g(c000500h, "payments_onboarding_banner_consecutive_days", sharedPreferences.getInt("payments_onboarding_banner_consecutive_days", 0) + 1);
                }
                c000500h.A0C("payments_onboarding_banner_last_seen_timestamp");
            }
            return sharedPreferences.getInt("payments_onboarding_banner_total_days", 0) < A06;
        }
        return false;
    }
}
