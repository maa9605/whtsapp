package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.2zB */
/* loaded from: classes2.dex */
public class C63132zB {
    public int A00;
    public int A01;
    public long A02;
    public C04020Ic A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public URL A0J;
    public final byte A0K;
    public final long A0L = SystemClock.elapsedRealtime();

    public C63132zB(byte b) {
        this.A0K = b;
    }

    public Long A00() {
        Long l = this.A0A;
        if (l == null) {
            return 0L;
        }
        Long l2 = this.A09;
        if (l2 != null) {
            return C000200d.A05(l, l2.longValue());
        }
        return C000200d.A05(l, SystemClock.elapsedRealtime());
    }

    public void A01() {
        Long l = this.A0A;
        C000700j.A07(l != null);
        this.A08 = C000200d.A05(l, SystemClock.elapsedRealtime());
        this.A01 = 1;
    }

    public void A02() {
        Long l = this.A0A;
        C000700j.A07(l != null);
        this.A0C = C000200d.A05(l, SystemClock.elapsedRealtime());
    }

    public void A03(Exception exc) {
        if (!(exc instanceof C50302Re)) {
            this.A0H = exc.getClass().getName();
            return;
        }
        Throwable cause = exc.getCause();
        if (cause != null) {
            exc = cause;
        }
        this.A0H = exc.getClass().getName();
    }

    public String toString() {
        long j;
        StringBuilder A0P = C000200d.A0P("media type: ");
        A0P.append((int) this.A0K);
        A0P.append(" retry count: ");
        A0P.append(this.A0E);
        A0P.append(" network stack: ");
        A0P.append(this.A00);
        A0P.append(" connction type: ");
        A0P.append(this.A07);
        A0P.append(" connection class: ");
        A0P.append(this.A0G);
        A0P.append(" url: ");
        URL url = this.A0J;
        A0P.append(url == null ? null : url.toString());
        A0P.append(" download time: ");
        A0P.append(A00());
        A0P.append(" queue time: ");
        Long l = this.A0A;
        A0P.append(l == null ? null : Long.valueOf(l.longValue() - this.A0L));
        A0P.append(" connction time: ");
        Long l2 = this.A0A;
        long j2 = 0;
        if (l2 != null) {
            Long l3 = this.A08;
            if (l3 != null) {
                j2 = l3.longValue();
            } else if (this.A09 == null) {
                j2 = SystemClock.elapsedRealtime() - l2.longValue();
            }
        }
        A0P.append(j2);
        A0P.append(" route selection delay: ");
        A0P.append(this.A0F);
        A0P.append(" network time: ");
        Long l4 = this.A0A;
        long j3 = 0;
        if (l4 != null) {
            Long l5 = this.A0C;
            if (l5 != null) {
                j3 = l5.longValue();
            } else if (this.A09 == null) {
                j3 = SystemClock.elapsedRealtime() - l4.longValue();
            }
        }
        A0P.append(j3);
        A0P.append(" connection reused: ");
        A0P.append(this.A04);
        A0P.append(" response code: ");
        A0P.append(this.A0D);
        A0P.append(" total bytes transferred: ");
        synchronized (this) {
            j = this.A02;
        }
        A0P.append(j);
        A0P.append(" media ip: ");
        A0P.append(this.A0I);
        A0P.append(" exception: ");
        A0P.append(this.A0H);
        A0P.append(" download stage: ");
        A0P.append(this.A01);
        return A0P.toString();
    }
}
