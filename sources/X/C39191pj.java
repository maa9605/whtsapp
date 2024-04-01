package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1pj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39191pj extends AbstractC06270Sj implements InterfaceC06290Sl {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C21110yo A04;
    public C21120yp A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Handler A0A;
    public final Handler A0B;
    public final C39201pk A0C;
    public final C21210yy A0D;
    public final AbstractC222211m A0E;
    public final C222311n A0F;
    public final ArrayDeque A0G;
    public final CopyOnWriteArraySet A0H;

    public C39191pj(C1Z6[] c1z6Arr, AbstractC222211m abstractC222211m, InterfaceC21060yj interfaceC21060yj, AnonymousClass122 anonymousClass122, C12Q c12q, final Looper looper) {
        StringBuilder A0P = C000200d.A0P("Init ");
        A0P.append(Integer.toHexString(System.identityHashCode(this)));
        A0P.append(" [");
        A0P.append("ExoPlayerLib/2.9.6");
        A0P.append("] [");
        A0P.append(C08M.A02);
        A0P.append("]");
        Log.i("ExoPlayerImpl", A0P.toString());
        int length = c1z6Arr.length;
        C002701i.A1K(length > 0);
        if (abstractC222211m != null) {
            this.A0E = abstractC222211m;
            this.A09 = false;
            this.A0H = new CopyOnWriteArraySet();
            this.A0F = new C222311n(new C21180yv[length], new InterfaceC222011k[length], null);
            this.A0D = new C21210yy();
            this.A05 = C21120yp.A04;
            this.A0A = new Handler(looper) { // from class: X.0yY
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    C39191pj c39191pj = C39191pj.this;
                    if (c39191pj != null) {
                        int i = message.what;
                        if (i != 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    C20930yW c20930yW = (C20930yW) message.obj;
                                    Iterator it = c39191pj.A0H.iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC21130yq) it.next()).AN2(c20930yW);
                                    }
                                    return;
                                }
                                throw new IllegalStateException();
                            }
                            C21120yp c21120yp = (C21120yp) message.obj;
                            if (c39191pj.A05.equals(c21120yp)) {
                                return;
                            }
                            c39191pj.A05 = c21120yp;
                            Iterator it2 = c39191pj.A0H.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC21130yq) it2.next()).AN0(c21120yp);
                            }
                            return;
                        }
                        C21110yo c21110yo = (C21110yo) message.obj;
                        int i2 = message.arg1;
                        int i3 = message.arg2;
                        boolean z = i3 != -1;
                        int i4 = c39191pj.A02 - i2;
                        c39191pj.A02 = i4;
                        if (i4 == 0) {
                            if (c21110yo.A02 == -9223372036854775807L) {
                                c21110yo = c21110yo.A01(c21110yo.A05, 0L, c21110yo.A01);
                            }
                            if ((!c39191pj.A04.A03.A0D() || c39191pj.A06) && c21110yo.A03.A0D()) {
                                c39191pj.A00 = 0;
                                c39191pj.A01 = 0;
                                c39191pj.A03 = 0L;
                            }
                            int i5 = c39191pj.A06 ? 0 : 2;
                            boolean z2 = c39191pj.A07;
                            c39191pj.A06 = false;
                            c39191pj.A07 = false;
                            c39191pj.A01(c21110yo, z, i3, i5, z2, false);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            };
            this.A04 = C21110yo.A00(0L, this.A0F);
            this.A0G = new ArrayDeque();
            C39201pk c39201pk = new C39201pk(c1z6Arr, abstractC222211m, this.A0F, interfaceC21060yj, anonymousClass122, this.A0A, c12q);
            this.A0C = c39201pk;
            this.A0B = new Handler(c39201pk.A0F.getLooper());
            return;
        }
        throw null;
    }

    public final C21110yo A00(boolean z, boolean z2, int i) {
        int A04;
        C219010g c219010g;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A03 = 0L;
            c219010g = this.A04.A04(false, super.A00);
        } else {
            this.A01 = A9Y();
            if (A04()) {
                A04 = this.A00;
            } else {
                C21110yo c21110yo = this.A04;
                A04 = c21110yo.A03.A04(c21110yo.A05.A04);
            }
            this.A00 = A04;
            this.A03 = A9U();
            c219010g = this.A04.A05;
        }
        long j = z ? 0L : this.A04.A0B;
        return new C21110yo(z2 ? AbstractC21230z0.A00 : this.A04.A03, z2 ? null : this.A04.A08, c219010g, j, z ? -9223372036854775807L : this.A04.A01, i, false, z2 ? C220910z.A03 : this.A04.A06, z2 ? this.A0F : this.A04.A07, c219010g, j, 0L, j);
    }

    public final void A01(C21110yo c21110yo, boolean z, int i, int i2, boolean z2, boolean z3) {
        ArrayDeque arrayDeque = this.A0G;
        boolean z4 = !arrayDeque.isEmpty();
        arrayDeque.addLast(new C20960yZ(c21110yo, this.A04, this.A0H, this.A0E, z, i, i2, z2, this.A09, z3));
        this.A04 = c21110yo;
        if (z4) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            C20960yZ c20960yZ = (C20960yZ) arrayDeque.peekFirst();
            if (c20960yZ.A0A || c20960yZ.A01 == 0) {
                for (InterfaceC21130yq interfaceC21130yq : c20960yZ.A04) {
                    C21110yo c21110yo2 = c20960yZ.A02;
                    interfaceC21130yq.APd(c21110yo2.A03, c21110yo2.A08, c20960yZ.A01);
                }
            }
            if (c20960yZ.A08) {
                for (InterfaceC21130yq interfaceC21130yq2 : c20960yZ.A04) {
                    interfaceC21130yq2.AN4(c20960yZ.A00);
                }
            }
            if (c20960yZ.A0B) {
                AbstractC222211m abstractC222211m = c20960yZ.A03;
                C21110yo c21110yo3 = c20960yZ.A02;
                C222311n c222311n = c21110yo3.A07;
                Object obj = c222311n.A02;
                C39351pz c39351pz = (C39351pz) abstractC222211m;
                if (c39351pz != null) {
                    c39351pz.A00 = (C221811i) obj;
                    for (InterfaceC21130yq interfaceC21130yq3 : c20960yZ.A04) {
                        interfaceC21130yq3.APq(c21110yo3.A06, c222311n.A01);
                    }
                } else {
                    throw null;
                }
            }
            if (c20960yZ.A05) {
                for (InterfaceC21130yq interfaceC21130yq4 : c20960yZ.A04) {
                    interfaceC21130yq4.ALa(c20960yZ.A02.A09);
                }
            }
            if (c20960yZ.A07) {
                for (InterfaceC21130yq interfaceC21130yq5 : c20960yZ.A04) {
                    interfaceC21130yq5.AN3(c20960yZ.A06, c20960yZ.A02.A00);
                }
            }
            if (c20960yZ.A09) {
                for (InterfaceC21130yq interfaceC21130yq6 : c20960yZ.A04) {
                    interfaceC21130yq6.AOS();
                }
            }
            arrayDeque.removeFirst();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        if (r13 != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(boolean r12, boolean r13) {
        /*
            r11 = this;
            r3 = 1
            r2 = 0
            if (r12 == 0) goto L7
            r1 = 1
            if (r13 == 0) goto L8
        L7:
            r1 = 0
        L8:
            r4 = r11
            boolean r0 = r11.A08
            if (r0 == r1) goto L1c
            r11.A08 = r1
            X.1pk r0 = r11.A0C
            X.12m r0 = r0.A0Q
            android.os.Handler r0 = r0.A00
            android.os.Message r0 = r0.obtainMessage(r3, r1, r2)
            r0.sendToTarget()
        L1c:
            boolean r0 = r11.A09
            if (r0 == r12) goto L2c
            r11.A09 = r12
            X.0yo r5 = r11.A04
            r6 = 0
            r7 = 4
            r8 = 1
            r9 = r2
            r10 = r3
            r4.A01(r5, r6, r7, r8, r9, r10)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39191pj.A02(boolean, boolean):void");
    }

    public boolean A03() {
        return !A04() && this.A04.A05.A00();
    }

    public final boolean A04() {
        return this.A04.A03.A0D() || this.A02 > 0;
    }

    @Override // X.InterfaceC06280Sk
    public void A5D(InterfaceC21130yq interfaceC21130yq) {
        this.A0H.add(interfaceC21130yq);
    }

    @Override // X.InterfaceC06280Sk
    public long A8b() {
        if (A03()) {
            C21110yo c21110yo = this.A04;
            return c21110yo.A04.equals(c21110yo.A05) ? C20910yU.A01(this.A04.A0A) : A9q();
        } else if (A04()) {
            return this.A03;
        } else {
            C21110yo c21110yo2 = this.A04;
            if (c21110yo2.A04.A03 != c21110yo2.A05.A03) {
                return C20910yU.A01(c21110yo2.A03.A0A(A9Y(), super.A00).A02);
            }
            long j = c21110yo2.A0A;
            C21110yo c21110yo3 = this.A04;
            C219010g c219010g = c21110yo3.A04;
            C219010g c219010g2 = c219010g;
            if (c219010g.A00()) {
                C21210yy A09 = c21110yo3.A03.A09(c219010g.A04, this.A0D);
                c21110yo3 = this.A04;
                c219010g2 = c21110yo3.A04;
                j = A09.A03.A02[c219010g2.A00];
                if (j == Long.MIN_VALUE) {
                    j = A09.A01;
                }
            }
            long A01 = C20910yU.A01(j);
            AbstractC21230z0 abstractC21230z0 = c21110yo3.A03;
            Object obj = c219010g2.A04;
            C21210yy c21210yy = this.A0D;
            abstractC21230z0.A09(obj, c21210yy);
            return A01 + C20910yU.A01(c21210yy.A02);
        }
    }

    @Override // X.InterfaceC06280Sk
    public long A98() {
        if (A03()) {
            C21110yo c21110yo = this.A04;
            AbstractC21230z0 abstractC21230z0 = c21110yo.A03;
            Object obj = c21110yo.A05.A04;
            C21210yy c21210yy = this.A0D;
            abstractC21230z0.A09(obj, c21210yy);
            return C20910yU.A01(this.A04.A01) + C20910yU.A01(c21210yy.A02);
        }
        return A9U();
    }

    @Override // X.InterfaceC06280Sk
    public int A9R() {
        if (A03()) {
            return this.A04.A05.A00;
        }
        return -1;
    }

    @Override // X.InterfaceC06280Sk
    public int A9S() {
        if (A03()) {
            return this.A04.A05.A01;
        }
        return -1;
    }

    @Override // X.InterfaceC06280Sk
    public long A9U() {
        if (A04()) {
            return this.A03;
        }
        C21110yo c21110yo = this.A04;
        C219010g c219010g = c21110yo.A05;
        if (c219010g.A00()) {
            return C20910yU.A01(c21110yo.A0B);
        }
        long A01 = C20910yU.A01(c21110yo.A0B);
        AbstractC21230z0 abstractC21230z0 = this.A04.A03;
        Object obj = c219010g.A04;
        C21210yy c21210yy = this.A0D;
        abstractC21230z0.A09(obj, c21210yy);
        return A01 + C20910yU.A01(c21210yy.A02);
    }

    @Override // X.InterfaceC06280Sk
    public AbstractC21230z0 A9X() {
        return this.A04.A03;
    }

    @Override // X.InterfaceC06280Sk
    public int A9Y() {
        if (A04()) {
            return this.A01;
        }
        C21110yo c21110yo = this.A04;
        return c21110yo.A03.A09(c21110yo.A05.A04, this.A0D).A00;
    }

    @Override // X.InterfaceC06280Sk
    public long A9q() {
        if (A03()) {
            C21110yo c21110yo = this.A04;
            c21110yo.A03.A09(c21110yo.A05.A04, this.A0D);
            return C20910yU.A01(-9223372036854775807L);
        }
        AbstractC21230z0 A9X = A9X();
        if (A9X.A0D()) {
            return -9223372036854775807L;
        }
        return C20910yU.A01(A9X.A0A(A9Y(), super.A00).A02);
    }

    @Override // X.InterfaceC06280Sk
    public boolean ACR() {
        return this.A09;
    }

    @Override // X.InterfaceC06280Sk
    public int ACT() {
        return this.A04.A00;
    }

    @Override // X.InterfaceC06280Sk
    public long ADX() {
        return Math.max(0L, C20910yU.A01(this.A04.A0C));
    }

    @Override // X.InterfaceC06280Sk
    public void ARO(InterfaceC21130yq interfaceC21130yq) {
        this.A0H.remove(interfaceC21130yq);
    }

    @Override // X.InterfaceC06280Sk
    public void ASI(int i, long j) {
        boolean A0D;
        long A00;
        AbstractC21230z0 abstractC21230z0 = this.A04.A03;
        if (i >= 0 && ((A0D = abstractC21230z0.A0D()) || i < abstractC21230z0.A01())) {
            this.A07 = true;
            this.A02++;
            if (A03()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                this.A0A.obtainMessage(0, 1, -1, this.A04).sendToTarget();
                return;
            }
            this.A01 = i;
            int i2 = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
            if (A0D) {
                this.A03 = i2 == 0 ? 0L : j;
                this.A00 = 0;
            } else {
                if (i2 == 0) {
                    abstractC21230z0.A0A(i, super.A00);
                    A00 = 0;
                } else {
                    A00 = C20910yU.A00(j);
                }
                Pair A07 = abstractC21230z0.A07(super.A00, this.A0D, i, A00, 0L);
                this.A03 = C20910yU.A01(A00);
                this.A00 = abstractC21230z0.A04(A07.first);
            }
            this.A0C.A0Q.A00.obtainMessage(3, new C21000yd(abstractC21230z0, i, C20910yU.A00(j))).sendToTarget();
            Iterator it = this.A0H.iterator();
            while (it.hasNext()) {
                ((InterfaceC21130yq) it.next()).AN4(1);
            }
            return;
        }
        throw new C21050yi(abstractC21230z0, i, j);
    }

    @Override // X.InterfaceC06280Sk
    public void ATc(boolean z) {
        A02(z, false);
    }
}
