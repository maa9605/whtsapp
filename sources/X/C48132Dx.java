package X;

import android.content.SharedPreferences;

/* renamed from: X.2Dx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48132Dx {
    public static volatile C48132Dx A02;
    public SharedPreferences A00;
    public final C02O A01;

    public C48132Dx(C02O c02o) {
        this.A01 = c02o;
    }

    public final SharedPreferences A00() {
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = this.A01.A01("privatestats_props");
            }
        }
        return this.A00;
    }

    public void A01(int i) {
        A00().edit().putInt("first_token_stage", i).apply();
    }

    public void A02(int i) {
        SharedPreferences.Editor edit = A00().edit();
        if (i >= 0) {
            edit.putInt("redeem_count", i).apply();
        } else {
            edit.remove("redeem_count").apply();
        }
    }

    public void A03(int i) {
        SharedPreferences.Editor edit = A00().edit();
        if (i > 0) {
            edit.putInt("token_not_ready_reason", i).apply();
        } else {
            edit.remove("token_not_ready_reason").apply();
        }
    }

    public final void A04(String str, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        SharedPreferences.Editor edit = A00().edit();
        if (i > 0) {
            edit.putLong(str, j).apply();
        } else {
            edit.remove(str).apply();
        }
    }

    public final void A05(String str, String str2) {
        SharedPreferences.Editor edit = A00().edit();
        if (str2 != null) {
            edit.putString(str, str2).apply();
        } else {
            edit.remove(str).apply();
        }
    }
}
