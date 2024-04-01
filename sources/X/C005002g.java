package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.Date;

/* renamed from: X.02g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C005002g {
    public static volatile C005002g A05;
    public Date A00;
    public boolean A01;
    public final C02L A02;
    public final C005102h A03;
    public final C000500h A04;

    public C005002g(C02L c02l, C000500h c000500h, C005102h c005102h) {
        this.A02 = c02l;
        this.A04 = c000500h;
        this.A03 = c005102h;
    }

    public static C005002g A00() {
        if (A05 == null) {
            synchronized (C005002g.class) {
                if (A05 == null) {
                    A05 = new C005002g(C02L.A00(), C000500h.A00(), C005102h.A00());
                }
            }
        }
        return A05;
    }

    public static boolean A01() {
        return "chromium".equals(Build.MANUFACTURER) && "chromium".equals(Build.BRAND);
    }

    public Date A02() {
        SharedPreferences sharedPreferences = this.A04.A00;
        long j = 0;
        long j2 = sharedPreferences.getLong("software_forced_expiration", 0L);
        if (j2 > 0) {
            return new Date(j2);
        }
        long j3 = sharedPreferences.getLong("client_expiration_time", 0L);
        if (j3 > 0) {
            return new Date(j3);
        }
        C02L c02l = this.A02;
        c02l.A05();
        Me me = c02l.A00;
        int i = -1;
        if (me != null) {
            try {
                if (!TextUtils.isEmpty(me.number)) {
                    i = (int) (Long.valueOf(me.number).longValue() % 14);
                }
            } catch (NumberFormatException e) {
                StringBuilder A0P = C000200d.A0P("number format not valid: ");
                A0P.append(me.number);
                Log.w(A0P.toString(), e);
            }
        }
        if (i >= 0 && i <= 13) {
            j = i - 6;
        }
        return new Date(((j + 180) * 86400000) + 1620966675000L);
    }

    public boolean A03() {
        if (this.A01) {
            return true;
        }
        boolean after = new Date().after(A02());
        this.A01 = after;
        return after;
    }

    public boolean A04() {
        if (this.A00 != null) {
            return true;
        }
        Date date = new Date();
        if (date.before(new Date(1620793875000L))) {
            this.A00 = date;
            return true;
        }
        boolean after = date.after(new Date(A02().getTime() + 31536000000L));
        if (after) {
            this.A00 = date;
        }
        return after;
    }
}
