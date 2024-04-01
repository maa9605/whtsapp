package X;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Cw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24791Cw implements C1XV {
    public long A02;
    public Rect A03;
    public C1XV A04;
    public C39051pU A05;
    public final InterfaceC19090up A07;
    public final ScheduledExecutorService A09;
    public boolean A06 = false;
    public long A01 = 2000;
    public long A00 = 1000;
    public final Runnable A08 = new Runnable() { // from class: X.0uz
        @Override // java.lang.Runnable
        public void run() {
            C24791Cw c24791Cw = C24791Cw.this;
            synchronized (c24791Cw) {
                c24791Cw.A06 = false;
                if (c24791Cw.A07.now() - c24791Cw.A02 > 2000) {
                    C39051pU c39051pU = c24791Cw.A05;
                    if (c39051pU != null) {
                        c39051pU.A06.clear();
                    }
                } else {
                    c24791Cw.A00();
                }
            }
        }
    };

    public C24791Cw(C1XV c1xv, C39051pU c39051pU, InterfaceC19090up interfaceC19090up, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = c1xv;
        this.A05 = c39051pU;
        this.A07 = interfaceC19090up;
        this.A09 = scheduledExecutorService;
    }

    public final synchronized void A00() {
        if (!this.A06) {
            this.A06 = true;
            this.A09.schedule(this.A08, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 == false) goto L8;
     */
    @Override // X.C1XV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A7T(android.graphics.drawable.Drawable r3, android.graphics.Canvas r4, int r5) {
        /*
            r2 = this;
            X.0up r0 = r2.A07
            long r0 = r0.now()
            r2.A02 = r0
            X.1XV r0 = r2.A04
            if (r0 == 0) goto L13
            boolean r1 = r0.A7T(r3, r4, r5)
            r0 = 1
            if (r1 != 0) goto L14
        L13:
            r0 = 0
        L14:
            r2.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24791Cw.A7T(android.graphics.drawable.Drawable, android.graphics.Canvas, int):boolean");
    }

    @Override // X.InterfaceC19190v0
    public int AAI(int i) {
        C1XV c1xv = this.A04;
        if (c1xv == null) {
            return 0;
        }
        return c1xv.AAI(i);
    }

    @Override // X.C1XV
    public int AAf() {
        C1XV c1xv = this.A04;
        if (c1xv == null) {
            return -1;
        }
        return c1xv.AAf();
    }

    @Override // X.C1XV
    public int AAg() {
        C1XV c1xv = this.A04;
        if (c1xv == null) {
            return -1;
        }
        return c1xv.AAg();
    }

    @Override // X.C1XV
    public void ASh(int i) {
        C1XV c1xv = this.A04;
        if (c1xv != null) {
            c1xv.ASh(i);
        }
    }

    @Override // X.C1XV
    public void ASn(Rect rect) {
        C1XV c1xv = this.A04;
        if (c1xv != null) {
            c1xv.ASn(rect);
        }
        this.A03 = rect;
    }

    @Override // X.C1XV
    public void ASq(ColorFilter colorFilter) {
        C1XV c1xv = this.A04;
        if (c1xv != null) {
            c1xv.ASq(colorFilter);
        }
    }

    @Override // X.InterfaceC19190v0
    public int getFrameCount() {
        C1XV c1xv = this.A04;
        if (c1xv == null) {
            return 0;
        }
        return c1xv.getFrameCount();
    }

    @Override // X.InterfaceC19190v0
    public int getLoopCount() {
        C1XV c1xv = this.A04;
        if (c1xv == null) {
            return 0;
        }
        return c1xv.getLoopCount();
    }
}
