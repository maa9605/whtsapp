package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.0Ss */
/* loaded from: classes.dex */
public class C06350Ss {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C04020Ic A04;
    public Boolean A05;
    public Float A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public URL A0N;
    public boolean A0O;
    public final int A0P;
    public final long A0Q = SystemClock.elapsedRealtime();
    public final C0DC A0R;

    public C06350Ss(C0DC c0dc, int i, int i2) {
        this.A00 = i;
        this.A0R = c0dc;
        this.A0P = i2;
    }

    public long A00() {
        Long l = this.A0B;
        if (l == null) {
            return 0L;
        }
        Long l2 = this.A0E;
        if (l2 != null) {
            return l2.longValue();
        }
        if (this.A09 == null) {
            return SystemClock.elapsedRealtime() - l.longValue();
        }
        return 0L;
    }

    public synchronized long A01() {
        return this.A02;
    }

    public Long A02() {
        Long l = this.A0B;
        if (l == null) {
            return 0L;
        }
        Long l2 = this.A09;
        if (l2 != null) {
            return C000200d.A05(l, l2.longValue());
        }
        return C000200d.A05(l, SystemClock.elapsedRealtime());
    }

    public void A03() {
        Long l = this.A0B;
        C000700j.A07(l != null);
        this.A08 = C000200d.A05(l, SystemClock.elapsedRealtime());
    }

    public void A04() {
        Long l = this.A0C;
        C000700j.A07(l != null);
        this.A0D = C000200d.A05(l, SystemClock.elapsedRealtime());
    }

    public void A05() {
        Long l = this.A0B;
        C000700j.A07(l != null);
        C000700j.A07(this.A08 != null);
        this.A0I = C000200d.A05(l, SystemClock.elapsedRealtime());
    }

    public void A06() {
        Long l = this.A0B;
        C000700j.A07(l != null);
        this.A0E = C000200d.A05(l, SystemClock.elapsedRealtime());
    }

    public void A07(Exception exc) {
        if (exc instanceof C50292Rd) {
            Throwable cause = exc.getCause();
            if (cause != null) {
                exc = cause;
            }
            this.A0K = exc.getClass().getName();
        } else if (exc == null) {
        } else {
            this.A0K = exc.getClass().getName();
        }
    }

    public boolean A08() {
        return this.A08 != null;
    }

    public boolean A09() {
        return this.A0E != null;
    }
}
