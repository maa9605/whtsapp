package X;

import android.content.SharedPreferences;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ui */
/* loaded from: classes2.dex */
public class C41911ui {
    public static volatile C41911ui A0A;
    public SharedPreferences A00;
    public final C0E6 A01;
    public final C0E7 A02;
    public final AnonymousClass012 A03;
    public final C0EG A04;
    public final C02O A05;
    public final List A06 = new LinkedList();
    public static final long[] A09 = {TimeUnit.HOURS.toMillis(6), TimeUnit.HOURS.toMillis(12), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(1), TimeUnit.DAYS.toMillis(3), TimeUnit.DAYS.toMillis(7)};
    public static final int A07 = 5;
    public static final long A08 = TimeUnit.SECONDS.toMillis(35);

    public C41911ui(AnonymousClass012 anonymousClass012, C0EG c0eg, C0E6 c0e6, C0E7 c0e7, C02O c02o) {
        this.A03 = anonymousClass012;
        this.A04 = c0eg;
        this.A01 = c0e6;
        this.A02 = c0e7;
        this.A05 = c02o;
    }

    public static C41911ui A00() {
        if (A0A == null) {
            synchronized (C41911ui.class) {
                if (A0A == null) {
                    A0A = new C41911ui(AnonymousClass012.A00(), C0EG.A00(), C0E6.A00(), C0E7.A00(), C02O.A00());
                }
            }
        }
        return A0A;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A05.A01(C02M.A02);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public String A02() {
        return A01().getString("two_factor_auth_code", "");
    }

    public void A03(C2E8 c2e8) {
        List list = this.A06;
        C000700j.A07(!list.contains(c2e8));
        list.add(c2e8);
    }

    public void A04(String str, String str2) {
        if (!this.A02.A05()) {
            Log.i("twofactorauthmanager/set-two-factor-auth-settings no internet connection, cancelling");
            for (C2E8 c2e8 : this.A06) {
                c2e8.APy();
            }
            return;
        }
        C0EG c0eg = this.A04;
        if (c0eg.A02.A06) {
            Log.i("sendmethods/send-set-two-factor-auth");
            C05Y c05y = c0eg.A07;
            Message obtain = Message.obtain(null, 0, 111, 0);
            obtain.getData().putString("code", str);
            obtain.getData().putString("email", str2);
            c05y.A09(obtain);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0016, code lost:
        if (r10.isEmpty() != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "twofactorauthmanager/store-new-auth-settings"
            com.whatsapp.util.Log.i(r0)
            android.content.SharedPreferences r0 = r9.A01()
            android.content.SharedPreferences$Editor r4 = r0.edit()
            r8 = 1
            r7 = 0
            if (r10 == 0) goto L18
            boolean r0 = r10.isEmpty()
            r1 = 1
            if (r0 == 0) goto L19
        L18:
            r1 = 0
        L19:
            java.lang.String r6 = "two_factor_auth_last_code_correctness"
            java.lang.String r5 = "two_factor_auth_nag_interval"
            java.lang.String r3 = "two_factor_auth_nag_time"
            java.lang.String r2 = "two_factor_auth_email_set"
            java.lang.String r0 = "two_factor_auth_code"
            if (r1 == 0) goto L71
            r4.putString(r0, r10)
            long r0 = java.lang.System.currentTimeMillis()
            r4.putLong(r3, r0)
            r4.putInt(r5, r12)
            r4.putBoolean(r6, r7)
            if (r11 == 0) goto L5a
            int r0 = r11.length()
            if (r0 > 0) goto L3e
            r8 = 2
        L3e:
            r4.putInt(r2, r8)
        L41:
            r4.apply()
            java.util.List r0 = r9.A06
            java.util.Iterator r1 = r0.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r1.next()
            X.2E8 r0 = (X.C2E8) r0
            r0.APz()
            goto L4a
        L5a:
            android.content.SharedPreferences r0 = r9.A01()
            int r0 = r0.getInt(r2, r7)
            if (r0 != 0) goto L41
            X.0E6 r0 = r9.A01
            X.2F0 r1 = new X.2F0
            r1.<init>()
            X.0I8 r0 = r0.A00
            r0.A01(r1)
            goto L41
        L71:
            r4.remove(r0)
            r4.remove(r2)
            r4.remove(r3)
            r4.remove(r5)
            r4.remove(r6)
            goto L41
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41911ui.A05(java.lang.String, java.lang.String, int):void");
    }

    public void A06(boolean z) {
        int max;
        int i = A01().getInt("two_factor_auth_nag_interval", 0);
        if (z) {
            max = Math.min(i + 1, 5);
        } else {
            max = Math.max(i - 1, 0);
        }
        A01().edit().putLong("two_factor_auth_nag_time", this.A03.A05()).putInt("two_factor_auth_nag_interval", max).putBoolean("two_factor_auth_last_code_correctness", z).apply();
    }
}
