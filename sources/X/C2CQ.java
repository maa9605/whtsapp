package X;

import android.content.SharedPreferences;

/* renamed from: X.2CQ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2CQ {
    public static volatile C2CQ A0A;
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04 = false;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public final C02E A08;
    public final C000500h A09;

    public C2CQ(C02E c02e, C000500h c000500h) {
        this.A08 = c02e;
        this.A09 = c000500h;
        SharedPreferences sharedPreferences = c000500h.A00;
        this.A01 = sharedPreferences.getBoolean("pref_fail_too_many", false);
        this.A02 = sharedPreferences.getBoolean("pref_no_route_sms", false);
        this.A03 = sharedPreferences.getBoolean("pref_no_route_voice", false);
        this.A06 = sharedPreferences.getBoolean("pref_fail_too_many_attempts", false);
        this.A07 = sharedPreferences.getBoolean("pref_fail_too_many_guesses", false);
    }

    public static C2CQ A00() {
        if (A0A == null) {
            synchronized (C2CQ.class) {
                if (A0A == null) {
                    A0A = new C2CQ(C02E.A00(), C000500h.A00());
                }
            }
        }
        return A0A;
    }

    public String A01(String str) {
        boolean A0A2 = C02A.A0A(this.A08);
        String str2 = this.A00;
        if ("register-phone".equals(str2)) {
            return A0A2 ? "register-phone-rtd" : this.A04 ? "register-phone-no_number" : !this.A05 ? "register-phone-invalid" : str;
        } else if (!"verify-sms".equals(str2)) {
            String str3 = "verify-tma";
            if (!"verify-tma".equals(str2)) {
                str3 = "verify-tmg";
                if (!"verify-tmg".equals(str2)) {
                    return str;
                }
            }
            return str3;
        } else if (A0A2) {
            return "verify-sms-rtd";
        } else {
            boolean z = this.A02;
            if (z || this.A03 || this.A01) {
                boolean z2 = this.A03;
                return z ? z2 ? "verify-sms-no_routes_both" : "verify-sms-no_routes_sms" : z2 ? "verify-sms-no_routes_voice" : str;
            }
            return "verify-sms-normal";
        }
    }

    public void A02(String str) {
        this.A00 = str;
        if (str.equals("verify-tmg")) {
            this.A07 = true;
            this.A06 = false;
            this.A09.A0j(this.A01, this.A02, this.A03, false, true);
        } else if (str.equals("verify-tma")) {
            this.A07 = false;
            this.A06 = true;
            this.A09.A0j(this.A01, this.A02, this.A03, true, false);
        }
        if (str.equals("verify-sms")) {
            if (this.A07) {
                this.A00 = "verify-tmg";
            } else if (!this.A06) {
            } else {
                this.A00 = "verify-tma";
            }
        }
    }

    public void A03(String str) {
        switch (str.hashCode()) {
            case -1976127222:
                if (str.equals("noRouteVoice")) {
                    this.A03 = true;
                    break;
                }
                break;
            case -1893373339:
                if (str.equals("validNumber")) {
                    this.A05 = true;
                    break;
                }
                break;
            case -1777505757:
                if (str.equals("notEmptyNumber")) {
                    this.A04 = false;
                    break;
                }
                break;
            case -1522953003:
                if (str.equals("failTooMany")) {
                    this.A01 = true;
                    break;
                }
                break;
            case -416647790:
                if (str.equals("notValidNumber")) {
                    this.A05 = false;
                    break;
                }
                break;
            case 1040735990:
                if (str.equals("emptyNumber")) {
                    this.A04 = true;
                    break;
                }
                break;
            case 1164419889:
                if (str.equals("noRouteSms")) {
                    this.A02 = true;
                    break;
                }
                break;
        }
        this.A09.A0j(this.A01, this.A02, this.A03, this.A06, this.A07);
    }
}
