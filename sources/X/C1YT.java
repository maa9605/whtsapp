package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1YT  reason: invalid class name */
/* loaded from: classes.dex */
public class C1YT extends AbstractC20370xQ {
    public long A00;
    public boolean A01;
    public final Choreographer.FrameCallback A02 = new Choreographer.FrameCallback() { // from class: X.0xM
        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            C20380xR c20380xR;
            C1YT c1yt = C1YT.this;
            if (!c1yt.A01 || (c20380xR = ((AbstractC20370xQ) c1yt).A00) == null) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            double d = uptimeMillis - c1yt.A00;
            CopyOnWriteArraySet copyOnWriteArraySet = c20380xR.A04;
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
            Set<C20350xO> set = c20380xR.A03;
            for (C20350xO c20350xO : set) {
                boolean A01 = c20350xO.A01();
                if (A01 && c20350xO.A07) {
                    set.remove(c20350xO);
                } else {
                    double d2 = d / 1000.0d;
                    if (!A01 || !c20350xO.A07) {
                        if (d2 > 0.064d) {
                            d2 = 0.064d;
                        }
                        double d3 = c20350xO.A04 + d2;
                        c20350xO.A04 = d3;
                        C20360xP c20360xP = c20350xO.A05;
                        double d4 = c20360xP.A01;
                        double d5 = c20360xP.A00;
                        C20340xN c20340xN = c20350xO.A08;
                        double d6 = c20340xN.A00;
                        double d7 = c20340xN.A01;
                        C20340xN c20340xN2 = c20350xO.A0A;
                        double d8 = c20340xN2.A00;
                        double d9 = c20340xN2.A01;
                        while (d3 >= 0.001d) {
                            d3 -= 0.001d;
                            c20350xO.A04 = d3;
                            if (d3 < 0.001d) {
                                C20340xN c20340xN3 = c20350xO.A09;
                                c20340xN3.A00 = d6;
                                c20340xN3.A01 = d7;
                            }
                            double d10 = c20350xO.A01;
                            double d11 = ((d10 - d8) * d4) - (d5 * d7);
                            double d12 = (d11 * 0.001d * 0.5d) + d7;
                            double d13 = ((d10 - (((d7 * 0.001d) * 0.5d) + d6)) * d4) - (d5 * d12);
                            double d14 = (d13 * 0.001d * 0.5d) + d7;
                            double d15 = ((d10 - (((d12 * 0.001d) * 0.5d) + d6)) * d4) - (d5 * d14);
                            d8 = (d14 * 0.001d) + d6;
                            d9 = (d15 * 0.001d) + d7;
                            d6 = ((((d12 + d14) * 2.0d) + d7 + d9) * 0.16666666666666666d * 0.001d) + d6;
                            d7 = ((((d13 + d15) * 2.0d) + d11 + (((d10 - d8) * d4) - (d5 * d9))) * 0.16666666666666666d * 0.001d) + d7;
                        }
                        c20340xN2.A00 = d8;
                        c20340xN2.A01 = d9;
                        c20340xN.A00 = d6;
                        c20340xN.A01 = d7;
                        if (d3 > 0.0d) {
                            double d16 = d3 / 0.001d;
                            C20340xN c20340xN4 = c20350xO.A09;
                            double d17 = 1.0d - d16;
                            double d18 = (c20340xN4.A00 * d17) + (d6 * d16);
                            c20340xN.A00 = d18;
                            d6 = d18;
                            double d19 = (c20340xN4.A01 * d17) + (d7 * d16);
                            c20340xN.A01 = d19;
                            d7 = d19;
                        }
                        if (c20350xO.A01()) {
                            if (d4 > 0.0d) {
                                double d20 = c20350xO.A01;
                                c20350xO.A03 = d20;
                                c20340xN.A00 = d20;
                            } else {
                                c20350xO.A01 = d6;
                                c20350xO.A03 = d6;
                            }
                            if (0.0d != d7) {
                                c20340xN.A01 = 0.0d;
                                c20350xO.A0B.A00(c20350xO.A0C);
                            }
                            A01 = true;
                        }
                        if (c20350xO.A07) {
                            c20350xO.A07 = false;
                        }
                        boolean z = false;
                        if (A01) {
                            z = true;
                            c20350xO.A07 = true;
                        }
                        Iterator it2 = c20350xO.A06.iterator();
                        while (it2.hasNext()) {
                            C1YU c1yu = (C1YU) it2.next();
                            c1yu.A01(c20350xO);
                            if (z) {
                                c1yu.A00(c20350xO);
                            }
                        }
                    }
                }
            }
            if (set.isEmpty()) {
                c20380xR.A00 = true;
            }
            Iterator it3 = copyOnWriteArraySet.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw null;
            }
            if (c20380xR.A00) {
                c20380xR.A01.A01();
            }
            c1yt.A00 = uptimeMillis;
            c1yt.A03.postFrameCallback(c1yt.A02);
        }
    };
    public final Choreographer A03;

    public C1YT(Choreographer choreographer) {
        this.A03 = choreographer;
    }

    @Override // X.AbstractC20370xQ
    public void A00() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A00 = SystemClock.uptimeMillis();
        Choreographer choreographer = this.A03;
        Choreographer.FrameCallback frameCallback = this.A02;
        choreographer.removeFrameCallback(frameCallback);
        choreographer.postFrameCallback(frameCallback);
    }

    @Override // X.AbstractC20370xQ
    public void A01() {
        this.A01 = false;
        this.A03.removeFrameCallback(this.A02);
    }
}
