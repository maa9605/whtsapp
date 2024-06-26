package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0HC  reason: invalid class name */
/* loaded from: classes.dex */
public class C0HC {
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public final boolean A04;

    public C0HC() {
        this.A04 = false;
    }

    public C0HC(String str) {
        this.A04 = false;
        this.A02 = str;
        this.A03 = true;
        A03();
    }

    public C0HC(boolean z) {
        this.A04 = true;
    }

    public long A00() {
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            String str = this.A02;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/timer/elapsed: ");
                sb.append(j4);
                Log.i(sb.toString());
            } else {
                C000200d.A0u("timer/elapsed: ", j4);
                return j4;
            }
        }
        return j4;
    }

    public long A01() {
        long uptimeMillis;
        long j = this.A01;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long j2 = this.A00;
        if (i == 0) {
            return j2;
        }
        if (this.A04) {
            uptimeMillis = SystemClock.elapsedRealtime();
        } else {
            uptimeMillis = SystemClock.uptimeMillis();
        }
        long j3 = (uptimeMillis - j) + j2;
        this.A00 = j3;
        if (this.A03) {
            String str = this.A02;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/timer/stop: ");
                C000200d.A1I(sb, j3);
            } else {
                C000200d.A1I(C000200d.A0P("timer/stop: "), j3);
            }
        }
        this.A01 = 0L;
        return this.A00;
    }

    public long A02(String str) {
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            StringBuilder sb = new StringBuilder("timer/mark/");
            sb.append(str);
            sb.append(": ");
            sb.append(j4);
            String obj = sb.toString();
            String str2 = this.A02;
            if (str2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("/");
                sb2.append(obj);
                Log.i(sb2.toString());
            } else {
                Log.i(obj);
                return j4;
            }
        }
        return j4;
    }

    public void A03() {
        long uptimeMillis;
        if (this.A01 != 0) {
            return;
        }
        if (this.A04) {
            uptimeMillis = SystemClock.elapsedRealtime();
        } else {
            uptimeMillis = SystemClock.uptimeMillis();
        }
        this.A01 = uptimeMillis;
    }
}
