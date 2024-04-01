package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.28q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C468828q {
    public final C000500h A00;
    public final AnonymousClass011 A01;

    public C468828q(AnonymousClass011 anonymousClass011, C000500h c000500h) {
        this.A01 = anonymousClass011;
        this.A00 = c000500h;
    }

    public final void A00(int i) {
        C09900ex c09900ex = new C09900ex();
        c09900ex.A00 = Integer.valueOf(i);
        c09900ex.A01 = 13;
        this.A01.A09(c09900ex, 1);
        AnonymousClass011.A01(c09900ex, "");
    }

    public boolean A01(C01B c01b, Context context) {
        int i;
        if (c01b.A0E(C01C.A2H) && context.getPackageManager().getLaunchIntentForPackage("com.whatsapp.w4b") == null) {
            C000500h c000500h = this.A00;
            SharedPreferences sharedPreferences = c000500h.A00;
            if (C02620Cd.A00(System.currentTimeMillis(), sharedPreferences.getLong("biz_app_cross_sell_banner_notif_time", -1L) * 1000) < sharedPreferences.getInt("biz_app_cross_sell_banner_expiry_days", 0) && sharedPreferences.getInt("biz_app_cross_sell_banner_dismiss_count", 0) < 1 && sharedPreferences.getInt("biz_app_cross_sell_banner_click_count", 0) < 1) {
                if (c000500h.A0p(86400000L, "biz_app_upsell_banner_timestamp")) {
                    if (sharedPreferences.getInt("biz_app_cross_sell_banner_consecutive_days", 0) >= 2) {
                        C000200d.A0g(c000500h, "biz_app_cross_sell_banner_consecutive_days", 0);
                        C000200d.A0g(c000500h, "biz_app_cross_sell_banner_cool_off_days", sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0) + 1);
                    } else if (sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0) >= 5) {
                        C000200d.A0g(c000500h, "biz_app_cross_sell_banner_cool_off_days", 0);
                    } else {
                        int i2 = sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0);
                        if (i2 > 0 && i2 <= 5) {
                            C000200d.A0g(c000500h, "biz_app_cross_sell_banner_cool_off_days", sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0) + 1);
                        } else {
                            C000200d.A0g(c000500h, "biz_app_cross_sell_banner_total_days", sharedPreferences.getInt("biz_app_cross_sell_banner_total_days", 0) + 1);
                            C000200d.A0g(c000500h, "biz_app_cross_sell_banner_consecutive_days", sharedPreferences.getInt("biz_app_cross_sell_banner_consecutive_days", 0) + 1);
                        }
                    }
                    c000500h.A0C("biz_app_upsell_banner_timestamp");
                }
                if (sharedPreferences.getInt("biz_app_cross_sell_banner_total_days", 0) < 4 && ((i = sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0)) <= 0 || i > 5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
