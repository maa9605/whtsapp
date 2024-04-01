package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.012 */
/* loaded from: classes.dex */
public class AnonymousClass012 {
    public static volatile AnonymousClass012 A05;
    public final C02N A00 = new C02N();
    public final C000500h A01;
    public volatile long A02;
    public volatile long A03;
    public volatile long A04;

    public AnonymousClass012(C000500h c000500h) {
        this.A01 = c000500h;
        SharedPreferences sharedPreferences = c000500h.A00;
        this.A03 = sharedPreferences.getLong("client_server_time_diff", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("last_ntp_client_time", 0L);
        if (!sharedPreferences.contains("client_ntp_time_diff") || j <= 0 || Math.abs(currentTimeMillis - j) >= 86400000) {
            return;
        }
        A07(sharedPreferences.getLong("client_ntp_time_diff", 0L));
    }

    public static AnonymousClass012 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass012.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass012(C000500h.A00());
                }
            }
        }
        return A05;
    }

    public long A01() {
        if (this.A00 != null) {
            return System.currentTimeMillis();
        }
        throw null;
    }

    public long A02() {
        if (this.A04 != 0) {
            long j = this.A04;
            if (this.A00 != null) {
                return j + SystemClock.elapsedRealtime();
            }
            throw null;
        } else if (this.A00 != null) {
            return System.currentTimeMillis() - this.A03;
        } else {
            throw null;
        }
    }

    public long A03() {
        if (this.A00 != null) {
            return SystemClock.elapsedRealtime();
        }
        throw null;
    }

    public long A04() {
        if (this.A00 != null) {
            return SystemClock.uptimeMillis();
        }
        throw null;
    }

    public final long A05() {
        C02N c02n = this.A00;
        if (c02n != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.A02 != 0) {
                return this.A02 + elapsedRealtime;
            }
            if (this.A04 != 0) {
                return this.A04 + elapsedRealtime;
            }
            if (c02n != null) {
                return System.currentTimeMillis() - this.A03;
            }
            throw null;
        }
        throw null;
    }

    public long A06(long j) {
        if (this.A00 != null) {
            return (j + System.currentTimeMillis()) - A05();
        }
        throw null;
    }

    public final void A07(long j) {
        System.currentTimeMillis();
        A05();
        C02N c02n = this.A00;
        if (c02n != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis + j;
            if (c02n != null) {
                this.A02 = j2 - SystemClock.elapsedRealtime();
                StringBuilder A0S = C000200d.A0S("app/time ntp update processed; diffClientNtp:", j, " device time: ");
                A0S.append(currentTimeMillis);
                A0S.append(" ntp time: ");
                A0S.append(j2);
                Log.i(A0S.toString());
                System.currentTimeMillis();
                A05();
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A08(long j, long j2) {
        System.currentTimeMillis();
        A05();
        if (j > 0) {
            if (this.A00 != null) {
                this.A04 = j - SystemClock.elapsedRealtime();
                this.A03 = j2 - j;
                StringBuilder A0P = C000200d.A0P("app/time server update processed; diffClientWaServer:");
                A0P.append(this.A03);
                A0P.append(" device time: ");
                A0P.append(j2);
                A0P.append(" server time: ");
                C000200d.A1I(A0P, j);
                C000200d.A0h(this.A01, "client_server_time_diff", this.A03);
            } else {
                throw null;
            }
        }
        System.currentTimeMillis();
        A05();
    }
}
