package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1pk */
/* loaded from: classes.dex */
public final class C39201pk implements InterfaceC30001Zi, InterfaceC219110h, Handler.Callback, InterfaceC20920yV, InterfaceC21140yr {
    public int A00;
    public int A01;
    public long A03;
    public C21000yd A04;
    public C21110yo A05;
    public InterfaceC219210i A07;
    public boolean A09;
    public boolean A0A;
    public C1Z6[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final C1Z5 A0G;
    public final InterfaceC21060yj A0I;
    public final C21210yy A0K;
    public final C21220yz A0L;
    public final AbstractC222211m A0M;
    public final C222311n A0N;
    public final AnonymousClass122 A0O;
    public final C12Q A0P;
    public final C224512m A0Q;
    public final ArrayList A0R;
    public final AbstractC39181pi[] A0S;
    public final C1Z6[] A0T;
    public boolean A08 = false;
    public int A02 = 0;
    public boolean A0B = false;
    public final C21090ym A0J = new C21090ym();
    public C21200yx A06 = C21200yx.A02;
    public final C20990yc A0H = new C20990yc();

    public C39201pk(C1Z6[] c1z6Arr, AbstractC222211m abstractC222211m, C222311n c222311n, InterfaceC21060yj interfaceC21060yj, AnonymousClass122 anonymousClass122, Handler handler, C12Q c12q) {
        this.A0T = c1z6Arr;
        this.A0M = abstractC222211m;
        this.A0N = c222311n;
        this.A0I = interfaceC21060yj;
        this.A0O = anonymousClass122;
        this.A0E = handler;
        this.A0P = c12q;
        this.A0D = ((C1Z4) interfaceC21060yj).A03;
        this.A05 = C21110yo.A00(-9223372036854775807L, c222311n);
        int length = c1z6Arr.length;
        AbstractC39181pi[] abstractC39181piArr = new AbstractC39181pi[length];
        this.A0S = abstractC39181piArr;
        for (int i = 0; i < length; i++) {
            C1Z6 c1z6 = c1z6Arr[i];
            c1z6.AT9(i);
            abstractC39181piArr[i] = c1z6.A8n();
        }
        this.A0G = new C1Z5(this, c12q);
        this.A0R = new ArrayList();
        this.A0C = new C1Z6[0];
        this.A0L = new C21220yz();
        this.A0K = new C21210yy();
        abstractC222211m.A00 = anonymousClass122;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = c12q.A6o(this.A0F.getLooper(), this);
    }

    public static final void A00(C21160yt c21160yt) {
        synchronized (c21160yt) {
        }
        try {
            c21160yt.A0A.AEG(c21160yt.A00, c21160yt.A04);
        } finally {
            c21160yt.A01(true);
        }
    }

    public final long A01() {
        long j = this.A05.A0A;
        C21070yk c21070yk = this.A0J.A04;
        if (c21070yk == null) {
            return 0L;
        }
        return j - (this.A03 - c21070yk.A00);
    }

    public final long A02(C219010g c219010g, long j, boolean z) {
        A0A();
        this.A09 = false;
        A0C(2);
        C21090ym c21090ym = this.A0J;
        C21070yk c21070yk = c21090ym.A05;
        C21070yk c21070yk2 = c21070yk;
        while (true) {
            if (c21070yk2 == null) {
                break;
            }
            if (c219010g.equals(c21070yk2.A02.A03) && c21070yk2.A07) {
                c21090ym.A08(c21070yk2);
                break;
            }
            c21070yk2 = c21090ym.A00();
        }
        if (c21070yk != c21070yk2 || z) {
            for (C1Z6 c1z6 : this.A0C) {
                A0G(c1z6);
            }
            this.A0C = new C1Z6[0];
            c21070yk = null;
        }
        if (c21070yk2 != null) {
            A0E(c21070yk);
            if (c21070yk2.A06) {
                InterfaceC30011Zj interfaceC30011Zj = c21070yk2.A08;
                j = interfaceC30011Zj.ASL(j);
                interfaceC30011Zj.A7G(j - this.A0D, false);
            }
            A0D(j);
            A06();
        } else {
            c21090ym.A06(true);
            this.A05 = this.A05.A03(C220910z.A03, this.A0N);
            A0D(j);
        }
        A0I(false);
        this.A0Q.A00.sendEmptyMessage(2);
        return j;
    }

    public final Pair A03(C21000yd c21000yd) {
        AbstractC21230z0 abstractC21230z0 = this.A05.A03;
        AbstractC21230z0 abstractC21230z02 = c21000yd.A02;
        if (abstractC21230z0.A0D()) {
            return null;
        }
        if (abstractC21230z02.A0D()) {
            abstractC21230z02 = abstractC21230z0;
        }
        try {
            C21220yz c21220yz = this.A0L;
            C21210yy c21210yy = this.A0K;
            Pair A07 = abstractC21230z02.A07(c21220yz, c21210yy, c21000yd.A00, c21000yd.A01, 0L);
            if (abstractC21230z0 != abstractC21230z02 && abstractC21230z0.A04(A07.first) == -1) {
                if (A05(A07.first, abstractC21230z02, abstractC21230z0) != null) {
                    return A04(abstractC21230z0, abstractC21230z0.A08(-1, c21210yy, false).A00);
                }
                return null;
            }
            return A07;
        } catch (IndexOutOfBoundsException unused) {
            throw new C21050yi(abstractC21230z0, c21000yd.A00, c21000yd.A01);
        }
    }

    public final Pair A04(AbstractC21230z0 abstractC21230z0, int i) {
        return abstractC21230z0.A07(this.A0L, this.A0K, i, -9223372036854775807L, 0L);
    }

    public final Object A05(Object obj, AbstractC21230z0 abstractC21230z0, AbstractC21230z0 abstractC21230z02) {
        int A04 = abstractC21230z0.A04(obj);
        int A00 = abstractC21230z0.A00();
        int i = -1;
        for (int i2 = 0; i2 < A00 && i == -1; i2++) {
            A04 = abstractC21230z0.A03(A04, this.A0K, this.A0L, this.A02, this.A0B);
            if (A04 != -1) {
                i = abstractC21230z02.A04(abstractC21230z0.A0C(A04));
            } else {
                return null;
            }
        }
        if (i != -1) {
            return abstractC21230z02.A0C(i);
        }
        return null;
    }

    public final void A06() {
        int i;
        C21090ym c21090ym = this.A0J;
        C21070yk c21070yk = c21090ym.A04;
        long ABb = !c21070yk.A07 ? 0L : c21070yk.A08.ABb();
        boolean z = false;
        if (ABb == Long.MIN_VALUE) {
            A0K(false);
            return;
        }
        C21070yk c21070yk2 = c21090ym.A04;
        long j = c21070yk2 != null ? ABb - (this.A03 - c21070yk2.A00) : 0L;
        InterfaceC21060yj interfaceC21060yj = this.A0I;
        float f = this.A0G.ACS().A01;
        C1Z4 c1z4 = (C1Z4) interfaceC21060yj;
        AnonymousClass127 anonymousClass127 = c1z4.A08;
        synchronized (anonymousClass127) {
            i = anonymousClass127.A00 * anonymousClass127.A04;
        }
        boolean z2 = i >= c1z4.A00;
        long j2 = c1z4.A07;
        if (f > 1.0f) {
            if (f != 1.0f) {
                j2 = Math.round(j2 * f);
            }
            j2 = Math.min(j2, c1z4.A06);
        }
        if (j < j2) {
            c1z4.A01 = (c1z4.A09 || !z2) ? true : true;
        } else if (j >= c1z4.A06 || z2) {
            c1z4.A01 = false;
        }
        boolean z3 = c1z4.A01;
        A0K(z3);
        if (z3) {
            c21070yk.A08.A6V(this.A03 - c21070yk.A00);
        }
    }

    public final void A07() {
        int i;
        C20990yc c20990yc = this.A0H;
        C21110yo c21110yo = this.A05;
        if (c21110yo != c20990yc.A02 || c20990yc.A01 > 0 || c20990yc.A03) {
            Handler handler = this.A0E;
            int i2 = c20990yc.A01;
            if (c20990yc.A03) {
                i = c20990yc.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, c21110yo).sendToTarget();
            c20990yc.A02 = this.A05;
            c20990yc.A01 = 0;
            c20990yc.A03 = false;
        }
    }

    public final void A08() {
        C21090ym c21090ym = this.A0J;
        C21070yk c21070yk = c21090ym.A04;
        C21070yk c21070yk2 = c21090ym.A06;
        if (c21070yk == null || c21070yk.A07) {
            return;
        }
        if (c21070yk2 == null || c21070yk2.A01 == c21070yk) {
            for (C1Z6 c1z6 : this.A0C) {
                if (!c1z6.AEW()) {
                    return;
                }
            }
            c21070yk.A08.AGT();
        }
    }

    public final void A09() {
        this.A09 = false;
        C30301aF c30301aF = this.A0G.A03;
        if (!c30301aF.A03) {
            c30301aF.A00 = c30301aF.A04.A7X();
            c30301aF.A03 = true;
        }
        for (C1Z6 c1z6 : this.A0C) {
            c1z6.start();
        }
    }

    public final void A0A() {
        C1Z6[] c1z6Arr;
        C30301aF c30301aF = this.A0G.A03;
        if (c30301aF.A03) {
            c30301aF.A00(c30301aF.ACX());
            c30301aF.A03 = false;
        }
        for (C1Z6 c1z6 : this.A0C) {
            if (c1z6.ADF() == 2) {
                c1z6.stop();
            }
        }
    }

    public final void A0B() {
        long ACX;
        int i;
        C21090ym c21090ym = this.A0J;
        C21070yk c21070yk = c21090ym.A05;
        if (c21070yk != null) {
            long AR7 = c21070yk.A08.AR7();
            if (AR7 != -9223372036854775807L) {
                A0D(AR7);
                if (AR7 != this.A05.A0B) {
                    C21110yo c21110yo = this.A05;
                    this.A05 = c21110yo.A02(c21110yo.A05, AR7, c21110yo.A01, A01());
                    this.A0H.A00(4);
                }
            } else {
                C1Z5 c1z5 = this.A0G;
                C1Z6 c1z6 = c1z5.A00;
                if ((c1z6 == null || c1z6.AFE() || (!c1z5.A00.AFf() && c1z5.A00.AEW())) ? false : true) {
                    c1z5.A00();
                    ACX = c1z5.A01.ACX();
                } else {
                    ACX = c1z5.A03.ACX();
                }
                this.A03 = ACX;
                long j = ACX - c21070yk.A00;
                long j2 = this.A05.A0B;
                ArrayList arrayList = this.A0R;
                if (!arrayList.isEmpty()) {
                    C21110yo c21110yo2 = this.A05;
                    C219010g c219010g = c21110yo2.A05;
                    if (!c219010g.A00()) {
                        if (c21110yo2.A02 == j2) {
                            j2--;
                        }
                        int A04 = c21110yo2.A03.A04(c219010g.A04);
                        int i2 = this.A00;
                        if (i2 > 0) {
                            C20980yb c20980yb = (C20980yb) arrayList.get(i2 - 1);
                            while (c20980yb != null) {
                                int i3 = c20980yb.A00;
                                if (i3 <= A04 && (i3 != A04 || c20980yb.A01 <= j2)) {
                                    break;
                                }
                                i2--;
                                this.A00 = i2;
                                if (i2 <= 0) {
                                    break;
                                }
                                c20980yb = (C20980yb) arrayList.get(i2 - 1);
                            }
                        }
                        if (i2 < arrayList.size()) {
                            C20980yb c20980yb2 = (C20980yb) arrayList.get(i2);
                            while (c20980yb2 != null) {
                                if (c20980yb2.A02 != null && ((i = c20980yb2.A00) < A04 || (i == A04 && c20980yb2.A01 <= j2))) {
                                    i2++;
                                    this.A00 = i2;
                                    if (i2 >= arrayList.size()) {
                                        break;
                                    }
                                    c20980yb2 = (C20980yb) arrayList.get(i2);
                                } else {
                                    while (c20980yb2.A02 != null && c20980yb2.A00 == A04) {
                                        long j3 = c20980yb2.A01;
                                        if (j3 <= j2 || j3 > j) {
                                            break;
                                        }
                                        A0F(c20980yb2.A03);
                                        int i4 = this.A00;
                                        arrayList.remove(i4);
                                        if (i4 < arrayList.size()) {
                                            c20980yb2 = (C20980yb) arrayList.get(i4);
                                            if (c20980yb2 == null) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.A05.A0B = j;
            }
            this.A05.A0A = c21090ym.A04.A00();
            this.A05.A0C = A01();
        }
    }

    public final void A0C(int i) {
        C21110yo c21110yo = this.A05;
        if (c21110yo.A00 != i) {
            this.A05 = new C21110yo(c21110yo.A03, c21110yo.A08, c21110yo.A05, c21110yo.A02, c21110yo.A01, i, c21110yo.A09, c21110yo.A06, c21110yo.A07, c21110yo.A04, c21110yo.A0A, c21110yo.A0C, c21110yo.A0B);
        }
    }

    public final void A0D(long j) {
        C21070yk c21070yk = this.A0J.A05;
        if (c21070yk != null) {
            j += c21070yk.A00;
        }
        this.A03 = j;
        this.A0G.A03.A00(j);
        for (C1Z6 c1z6 : this.A0C) {
            c1z6.ARm(this.A03);
        }
    }

    public final void A0E(C21070yk c21070yk) {
        C21070yk c21070yk2 = this.A0J.A05;
        if (c21070yk2 == null || c21070yk == c21070yk2) {
            return;
        }
        C1Z6[] c1z6Arr = this.A0T;
        int length = c1z6Arr.length;
        boolean[] zArr = new boolean[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C1Z6 c1z6 = c1z6Arr[i2];
            zArr[i2] = c1z6.ADF() != 0;
            if (c21070yk2.A05.A03[i2] != null) {
                i++;
            }
            if (zArr[i2]) {
                if (!(c21070yk2.A05.A03[i2] != null) || (c1z6.AFC() && c1z6.ADI() == c21070yk.A0D[i2])) {
                    A0G(c1z6);
                }
            }
        }
        this.A05 = this.A05.A03(c21070yk2.A03, c21070yk2.A05);
        A0N(zArr, i);
    }

    public final void A0F(C21160yt c21160yt) {
        Looper looper = c21160yt.A03.getLooper();
        Handler handler = this.A0Q.A00;
        if (looper == handler.getLooper()) {
            A00(c21160yt);
            int i = this.A05.A00;
            if (i == 3 || i == 2) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        handler.obtainMessage(15, c21160yt).sendToTarget();
    }

    public final void A0G(C1Z6 c1z6) {
        C1Z5 c1z5 = this.A0G;
        if (c1z6 == c1z5.A00) {
            c1z5.A01 = null;
            c1z5.A00 = null;
        }
        if (c1z6.ADF() == 2) {
            c1z6.stop();
        }
        c1z6.A7D();
    }

    public final void A0H(C222311n c222311n) {
        int i;
        InterfaceC21060yj interfaceC21060yj = this.A0I;
        C1Z6[] c1z6Arr = this.A0T;
        C222111l c222111l = c222311n.A01;
        C1Z4 c1z4 = (C1Z4) interfaceC21060yj;
        int i2 = c1z4.A02;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < c1z6Arr.length; i3++) {
                if (c222111l.A02[i3] != null) {
                    switch (c1z6Arr[i3].ADa()) {
                        case 0:
                            i = EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                            break;
                        case 1:
                            i = 3538944;
                            break;
                        case 2:
                            i = 13107200;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            i = C42271vT.A09;
                            break;
                        case 6:
                            i = 0;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    i2 += i;
                }
            }
        }
        c1z4.A00 = i2;
        c1z4.A08.A01(i2);
    }

    public final void A0I(boolean z) {
        C219010g c219010g;
        C21070yk c21070yk = this.A0J.A04;
        if (c21070yk == null) {
            c219010g = this.A05.A05;
        } else {
            c219010g = c21070yk.A02.A03;
        }
        boolean z2 = !this.A05.A04.equals(c219010g);
        if (z2) {
            C21110yo c21110yo = this.A05;
            this.A05 = new C21110yo(c21110yo.A03, c21110yo.A08, c21110yo.A05, c21110yo.A02, c21110yo.A01, c21110yo.A00, c21110yo.A09, c21110yo.A06, c21110yo.A07, c219010g, c21110yo.A0A, c21110yo.A0C, c21110yo.A0B);
        } else {
            z2 = false;
        }
        C21110yo c21110yo2 = this.A05;
        c21110yo2.A0A = c21070yk == null ? c21110yo2.A0B : c21070yk.A00();
        this.A05.A0C = A01();
        if ((z2 || z) && c21070yk != null && c21070yk.A07) {
            A0H(c21070yk.A05);
        }
    }

    public final void A0J(boolean z) {
        C219010g c219010g = this.A0J.A05.A02.A03;
        long A02 = A02(c219010g, this.A05.A0B, true);
        if (A02 != this.A05.A0B) {
            C21110yo c21110yo = this.A05;
            this.A05 = c21110yo.A02(c219010g, A02, c21110yo.A01, A01());
            if (z) {
                this.A0H.A00(4);
            }
        }
    }

    public final void A0K(boolean z) {
        C21110yo c21110yo = this.A05;
        if (c21110yo.A09 != z) {
            this.A05 = new C21110yo(c21110yo.A03, c21110yo.A08, c21110yo.A05, c21110yo.A02, c21110yo.A01, c21110yo.A00, z, c21110yo.A06, c21110yo.A07, c21110yo.A04, c21110yo.A0A, c21110yo.A0C, c21110yo.A0B);
        }
    }

    public final void A0L(boolean z, boolean z2) {
        A0M(true, z, z);
        this.A0H.A01 += this.A01 + (z2 ? 1 : 0);
        this.A01 = 0;
        ((C1Z4) this.A0I).A01(true);
        A0C(1);
    }

    public final void A0M(boolean z, boolean z2, boolean z3) {
        C219010g c219010g;
        long j;
        C222311n c222311n;
        InterfaceC219210i interfaceC219210i;
        this.A0Q.A00.removeMessages(2);
        this.A09 = false;
        C30301aF c30301aF = this.A0G.A03;
        if (c30301aF.A03) {
            c30301aF.A00(c30301aF.ACX());
            c30301aF.A03 = false;
        }
        this.A03 = 0L;
        for (C1Z6 c1z6 : this.A0C) {
            try {
                A0G(c1z6);
            } catch (C20930yW | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0C = new C1Z6[0];
        C21090ym c21090ym = this.A0J;
        c21090ym.A06(!z2);
        A0K(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            c21090ym.A07 = AbstractC21230z0.A00;
            ArrayList arrayList = this.A0R;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C20980yb) it.next()).A03.A01(false);
            }
            arrayList.clear();
            this.A00 = 0;
        }
        C21110yo c21110yo = this.A05;
        if (z2) {
            c219010g = c21110yo.A04(this.A0B, this.A0L);
        } else {
            c219010g = c21110yo.A05;
        }
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0B;
            j2 = this.A05.A01;
        }
        AbstractC21230z0 abstractC21230z0 = z3 ? AbstractC21230z0.A00 : this.A05.A03;
        Object obj = z3 ? null : this.A05.A08;
        C21110yo c21110yo2 = this.A05;
        int i = c21110yo2.A00;
        C220910z c220910z = z3 ? C220910z.A03 : c21110yo2.A06;
        if (z3) {
            c222311n = this.A0N;
        } else {
            c222311n = c21110yo2.A07;
        }
        this.A05 = new C21110yo(abstractC21230z0, obj, c219010g, j, j2, i, false, c220910z, c222311n, c219010g, j, 0L, j);
        if (!z || (interfaceC219210i = this.A07) == null) {
            return;
        }
        interfaceC219210i.ARF(this);
        this.A07 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x005d, code lost:
        if (r20.A05.A00 != 3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0064, code lost:
        if (r7 == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0N(boolean[] r21, int r22) {
        /*
            r20 = this;
            r0 = r22
            X.1Z6[] r0 = new X.C1Z6[r0]
            r5 = r20
            r5.A0C = r0
            X.0ym r4 = r5.A0J
            X.0yk r3 = r4.A05
            r2 = 0
            r7 = 0
        Le:
            X.1Z6[] r6 = r5.A0T
            int r0 = r6.length
            if (r2 >= r0) goto Lae
            X.11n r0 = r3.A05
            X.0yv[] r0 = r0.A03
            r1 = r0[r2]
            r0 = 0
            if (r1 == 0) goto L1d
            r0 = 1
        L1d:
            if (r0 == 0) goto L99
            boolean r10 = r21[r2]
            int r9 = r7 + 1
            X.0yk r1 = r4.A05
            r11 = r6[r2]
            X.1Z6[] r0 = r5.A0C
            r0[r7] = r11
            int r0 = r11.ADF()
            if (r0 != 0) goto L98
            X.11n r6 = r1.A05
            X.0yv[] r0 = r6.A03
            r12 = r0[r2]
            X.11l r0 = r6.A01
            X.11k[] r0 = r0.A02
            r8 = r0[r2]
            r7 = 0
            if (r8 == 0) goto L51
            int r6 = r8.length()
        L44:
            X.0yg[] r13 = new X.C21030yg[r6]
        L46:
            if (r7 >= r6) goto L53
            X.0yg r0 = r8.AAG(r7)
            r13[r7] = r0
            int r7 = r7 + 1
            goto L46
        L51:
            r6 = 0
            goto L44
        L53:
            boolean r0 = r5.A08
            if (r0 == 0) goto L5f
            X.0yo r0 = r5.A05
            int r6 = r0.A00
            r0 = 3
            r7 = 1
            if (r6 == r0) goto L60
        L5f:
            r7 = 0
        L60:
            if (r10 != 0) goto L66
            r17 = 1
            if (r7 != 0) goto L68
        L66:
            r17 = 0
        L68:
            X.10s[] r0 = r1.A0D
            r14 = r0[r2]
            long r15 = r5.A03
            long r0 = r1.A00
            r18 = r0
            r11.A7Y(r12, r13, r14, r15, r17, r18)
            X.1Z5 r6 = r5.A0G
            if (r6 == 0) goto Lac
            X.12a r1 = r11.AB9()
            if (r1 == 0) goto L93
            X.12a r0 = r6.A01
            if (r1 == r0) goto L93
            if (r0 != 0) goto L9d
            r6.A01 = r1
            r6.A00 = r11
            X.1aF r0 = r6.A03
            X.0yp r0 = r0.A02
            r1.ATd(r0)
            r6.A00()
        L93:
            if (r7 == 0) goto L98
            r11.start()
        L98:
            r7 = r9
        L99:
            int r2 = r2 + 1
            goto Le
        L9d:
            java.lang.String r0 = "Multiple renderer media clocks enabled."
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r0)
            r2 = 2
            r1 = -1
            X.0yW r0 = new X.0yW
            r0.<init>(r2, r3, r1)
            throw r0
        Lac:
            r0 = 0
            throw r0
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39201pk.A0N(boolean[], int):void");
    }

    public final boolean A0O() {
        C21070yk c21070yk = this.A0J.A05;
        long j = c21070yk.A02.A01;
        if (j == -9223372036854775807L || this.A05.A0B < j) {
            return true;
        }
        C21070yk c21070yk2 = c21070yk.A01;
        if (c21070yk2 != null) {
            return c21070yk2.A07 || c21070yk2.A02.A03.A00();
        }
        return false;
    }

    @Override // X.InterfaceC220310t
    public void AJ0(InterfaceC220410u interfaceC220410u) {
        this.A0Q.A00.obtainMessage(10, interfaceC220410u).sendToTarget();
    }

    @Override // X.InterfaceC30001Zi
    public void ANG(InterfaceC30011Zj interfaceC30011Zj) {
        this.A0Q.A00.obtainMessage(9, interfaceC30011Zj).sendToTarget();
    }

    @Override // X.InterfaceC219110h
    public void AOn(InterfaceC219210i interfaceC219210i, AbstractC21230z0 abstractC21230z0, Object obj) {
        C224512m c224512m = this.A0Q;
        c224512m.A00.obtainMessage(8, new C20970ya(interfaceC219210i, abstractC21230z0, obj)).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:1009:0x083d, code lost:
        if (r6.A01 == null) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1050:0x08ea, code lost:
        if (r8.AFE() == false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1086:0x0955, code lost:
        if (A0O() != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1130:0x09d9, code lost:
        if (r19 == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x06cf, code lost:
        if (r10.A00 < 100) goto L453;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0aac: INVOKE  (r0 I:X.1pk), (r1 I:boolean), (r1 I:boolean) type: VIRTUAL call: X.1pk.A0L(boolean, boolean):void, block:B:1172:0x0aa5 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0acb: INVOKE  (r0 I:X.1pk), (r1 I:boolean), (r1 I:boolean) type: VIRTUAL call: X.1pk.A0L(boolean, boolean):void, block:B:1175:0x0ac4 */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0aea: INVOKE  (r0 I:X.1pk), (r1 I:boolean), (r1 I:boolean) type: VIRTUAL call: X.1pk.A0L(boolean, boolean):void, block:B:1178:0x0ae3 */
    /* JADX WARN: Removed duplicated region for block: B:1066:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:1209:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:742:0x02c7 A[Catch: RuntimeException -> 0x0aa4, IOException -> 0x0ac3, 0yW -> 0x0ae2, TryCatch #7 {0yW -> 0x0ae2, IOException -> 0x0ac3, RuntimeException -> 0x0aa4, blocks: (B:629:0x0007, B:630:0x000d, B:632:0x0011, B:1169:0x0aa0, B:633:0x0021, B:635:0x0034, B:638:0x0039, B:640:0x003d, B:642:0x0046, B:643:0x0049, B:644:0x004c, B:646:0x0051, B:648:0x0055, B:649:0x005a, B:650:0x005d, B:651:0x0066, B:654:0x006c, B:656:0x0078, B:657:0x007b, B:658:0x0080, B:660:0x008e, B:661:0x0091, B:662:0x0096, B:664:0x009c, B:666:0x00a1, B:668:0x00a5, B:676:0x00b5, B:678:0x00ce, B:680:0x00d4, B:681:0x00f4, B:683:0x00fa, B:686:0x0104, B:688:0x010c, B:689:0x010e, B:691:0x0112, B:693:0x0118, B:694:0x011c, B:696:0x0120, B:697:0x0125, B:701:0x0145, B:702:0x0154, B:704:0x015d, B:698:0x0128, B:700:0x012f, B:673:0x00af, B:705:0x016c, B:707:0x0176, B:709:0x017a, B:710:0x017f, B:712:0x0189, B:714:0x018d, B:716:0x01d6, B:717:0x01e5, B:718:0x01ea, B:720:0x01f4, B:722:0x024b, B:724:0x0255, B:726:0x026e, B:729:0x0275, B:731:0x028b, B:734:0x0297, B:742:0x02c7, B:743:0x02d5, B:744:0x02d9, B:745:0x02de, B:735:0x02b2, B:738:0x02c0, B:746:0x02df, B:748:0x02ee, B:750:0x02fb, B:751:0x02ff, B:753:0x0303, B:754:0x030c, B:758:0x0326, B:762:0x034b, B:764:0x0353, B:766:0x0359, B:767:0x0362, B:771:0x0386, B:760:0x032f, B:761:0x034a, B:772:0x038e, B:774:0x0396, B:776:0x039c, B:780:0x03c0, B:781:0x03c8, B:783:0x03cc, B:784:0x03ce, B:786:0x03d4, B:787:0x03d8, B:789:0x03e0, B:791:0x03ee, B:793:0x03fa, B:795:0x0416, B:797:0x041a, B:799:0x0424, B:800:0x042d, B:803:0x0434, B:806:0x043e, B:807:0x0456, B:809:0x0460, B:811:0x046a, B:814:0x0471, B:817:0x047b, B:818:0x0493, B:820:0x04a1, B:823:0x04a7, B:835:0x04e7, B:837:0x04ed, B:838:0x0507, B:826:0x04b4, B:828:0x04c2, B:830:0x04c8, B:841:0x0517, B:843:0x051a, B:831:0x04cd, B:833:0x04dd, B:839:0x050c, B:840:0x0511, B:844:0x051d, B:792:0x03f7, B:845:0x0522, B:846:0x0534, B:852:0x053e, B:853:0x053f, B:856:0x0545, B:857:0x054a, B:858:0x0552, B:859:0x055d, B:861:0x0577, B:900:0x0636, B:902:0x064c, B:888:0x0600, B:890:0x0616, B:904:0x0652, B:906:0x0668, B:907:0x066b, B:862:0x058c, B:866:0x05a7, B:908:0x066c, B:910:0x067d, B:912:0x0681, B:916:0x06af, B:918:0x06b5, B:920:0x06bb, B:922:0x06c1, B:924:0x06cb, B:956:0x0774, B:958:0x0778, B:960:0x077e, B:962:0x0784, B:963:0x0787, B:965:0x078b, B:966:0x078e, B:969:0x0794, B:972:0x07a5, B:973:0x07a8, B:976:0x07b0, B:978:0x07e2, B:981:0x07e9, B:983:0x07ee, B:985:0x07f6, B:987:0x07fc, B:989:0x0802, B:990:0x0805, B:991:0x0808, B:994:0x080d, B:996:0x0812, B:999:0x0820, B:1002:0x0828, B:1003:0x082b, B:1005:0x082f, B:1006:0x0834, B:1008:0x083a, B:1011:0x0840, B:1016:0x085f, B:1021:0x086d, B:1022:0x0873, B:1024:0x087b, B:1027:0x088b, B:1030:0x0896, B:1032:0x08a0, B:1039:0x08ae, B:1040:0x08b2, B:1042:0x08b6, B:1043:0x08bf, B:1044:0x08d1, B:1045:0x08d6, B:977:0x07de, B:926:0x06d1, B:928:0x06d7, B:935:0x0703, B:937:0x0707, B:940:0x0710, B:938:0x070c, B:943:0x0719, B:944:0x071f, B:946:0x072f, B:947:0x0731, B:949:0x0748, B:954:0x0757, B:955:0x075c, B:952:0x074e, B:931:0x06eb, B:932:0x06fa, B:913:0x0684, B:915:0x068a, B:1047:0x08db, B:1049:0x08e4, B:1052:0x08ee, B:1054:0x08f4, B:1056:0x08fa, B:1058:0x0900, B:1060:0x0904, B:1063:0x090b, B:1069:0x0919, B:1071:0x091e, B:1072:0x0921, B:1076:0x0931, B:1078:0x0939, B:1080:0x093f, B:1090:0x0962, B:1092:0x0968, B:1133:0x09e9, B:1134:0x09f1, B:1143:0x0a0f, B:1145:0x0a24, B:1139:0x09fa, B:1142:0x0a01, B:1144:0x0a1d, B:1081:0x0946, B:1083:0x094c, B:1085:0x0951, B:1087:0x0957, B:1089:0x095f, B:1094:0x096f, B:1096:0x0973, B:1098:0x097b, B:1101:0x0982, B:1105:0x099c, B:1107:0x09a5, B:1113:0x09b4, B:1115:0x09b8, B:1116:0x09ba, B:1118:0x09bf, B:1119:0x09c0, B:1120:0x09c1, B:1147:0x0a29, B:1148:0x0a2a, B:1108:0x09a8, B:1149:0x0a2b, B:1123:0x09c6, B:1125:0x09cd, B:1127:0x09d2, B:1131:0x09db, B:1150:0x0a2c, B:1151:0x0a3d, B:1154:0x0a43, B:1156:0x0a49, B:1157:0x0a50, B:1159:0x0a57, B:1161:0x0a64, B:1162:0x0a6c, B:1165:0x0a76, B:1168:0x0a7c), top: B:1189:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x064c A[Catch: RuntimeException -> 0x0aa4, IOException -> 0x0ac3, 0yW -> 0x0ae2, TryCatch #7 {0yW -> 0x0ae2, IOException -> 0x0ac3, RuntimeException -> 0x0aa4, blocks: (B:629:0x0007, B:630:0x000d, B:632:0x0011, B:1169:0x0aa0, B:633:0x0021, B:635:0x0034, B:638:0x0039, B:640:0x003d, B:642:0x0046, B:643:0x0049, B:644:0x004c, B:646:0x0051, B:648:0x0055, B:649:0x005a, B:650:0x005d, B:651:0x0066, B:654:0x006c, B:656:0x0078, B:657:0x007b, B:658:0x0080, B:660:0x008e, B:661:0x0091, B:662:0x0096, B:664:0x009c, B:666:0x00a1, B:668:0x00a5, B:676:0x00b5, B:678:0x00ce, B:680:0x00d4, B:681:0x00f4, B:683:0x00fa, B:686:0x0104, B:688:0x010c, B:689:0x010e, B:691:0x0112, B:693:0x0118, B:694:0x011c, B:696:0x0120, B:697:0x0125, B:701:0x0145, B:702:0x0154, B:704:0x015d, B:698:0x0128, B:700:0x012f, B:673:0x00af, B:705:0x016c, B:707:0x0176, B:709:0x017a, B:710:0x017f, B:712:0x0189, B:714:0x018d, B:716:0x01d6, B:717:0x01e5, B:718:0x01ea, B:720:0x01f4, B:722:0x024b, B:724:0x0255, B:726:0x026e, B:729:0x0275, B:731:0x028b, B:734:0x0297, B:742:0x02c7, B:743:0x02d5, B:744:0x02d9, B:745:0x02de, B:735:0x02b2, B:738:0x02c0, B:746:0x02df, B:748:0x02ee, B:750:0x02fb, B:751:0x02ff, B:753:0x0303, B:754:0x030c, B:758:0x0326, B:762:0x034b, B:764:0x0353, B:766:0x0359, B:767:0x0362, B:771:0x0386, B:760:0x032f, B:761:0x034a, B:772:0x038e, B:774:0x0396, B:776:0x039c, B:780:0x03c0, B:781:0x03c8, B:783:0x03cc, B:784:0x03ce, B:786:0x03d4, B:787:0x03d8, B:789:0x03e0, B:791:0x03ee, B:793:0x03fa, B:795:0x0416, B:797:0x041a, B:799:0x0424, B:800:0x042d, B:803:0x0434, B:806:0x043e, B:807:0x0456, B:809:0x0460, B:811:0x046a, B:814:0x0471, B:817:0x047b, B:818:0x0493, B:820:0x04a1, B:823:0x04a7, B:835:0x04e7, B:837:0x04ed, B:838:0x0507, B:826:0x04b4, B:828:0x04c2, B:830:0x04c8, B:841:0x0517, B:843:0x051a, B:831:0x04cd, B:833:0x04dd, B:839:0x050c, B:840:0x0511, B:844:0x051d, B:792:0x03f7, B:845:0x0522, B:846:0x0534, B:852:0x053e, B:853:0x053f, B:856:0x0545, B:857:0x054a, B:858:0x0552, B:859:0x055d, B:861:0x0577, B:900:0x0636, B:902:0x064c, B:888:0x0600, B:890:0x0616, B:904:0x0652, B:906:0x0668, B:907:0x066b, B:862:0x058c, B:866:0x05a7, B:908:0x066c, B:910:0x067d, B:912:0x0681, B:916:0x06af, B:918:0x06b5, B:920:0x06bb, B:922:0x06c1, B:924:0x06cb, B:956:0x0774, B:958:0x0778, B:960:0x077e, B:962:0x0784, B:963:0x0787, B:965:0x078b, B:966:0x078e, B:969:0x0794, B:972:0x07a5, B:973:0x07a8, B:976:0x07b0, B:978:0x07e2, B:981:0x07e9, B:983:0x07ee, B:985:0x07f6, B:987:0x07fc, B:989:0x0802, B:990:0x0805, B:991:0x0808, B:994:0x080d, B:996:0x0812, B:999:0x0820, B:1002:0x0828, B:1003:0x082b, B:1005:0x082f, B:1006:0x0834, B:1008:0x083a, B:1011:0x0840, B:1016:0x085f, B:1021:0x086d, B:1022:0x0873, B:1024:0x087b, B:1027:0x088b, B:1030:0x0896, B:1032:0x08a0, B:1039:0x08ae, B:1040:0x08b2, B:1042:0x08b6, B:1043:0x08bf, B:1044:0x08d1, B:1045:0x08d6, B:977:0x07de, B:926:0x06d1, B:928:0x06d7, B:935:0x0703, B:937:0x0707, B:940:0x0710, B:938:0x070c, B:943:0x0719, B:944:0x071f, B:946:0x072f, B:947:0x0731, B:949:0x0748, B:954:0x0757, B:955:0x075c, B:952:0x074e, B:931:0x06eb, B:932:0x06fa, B:913:0x0684, B:915:0x068a, B:1047:0x08db, B:1049:0x08e4, B:1052:0x08ee, B:1054:0x08f4, B:1056:0x08fa, B:1058:0x0900, B:1060:0x0904, B:1063:0x090b, B:1069:0x0919, B:1071:0x091e, B:1072:0x0921, B:1076:0x0931, B:1078:0x0939, B:1080:0x093f, B:1090:0x0962, B:1092:0x0968, B:1133:0x09e9, B:1134:0x09f1, B:1143:0x0a0f, B:1145:0x0a24, B:1139:0x09fa, B:1142:0x0a01, B:1144:0x0a1d, B:1081:0x0946, B:1083:0x094c, B:1085:0x0951, B:1087:0x0957, B:1089:0x095f, B:1094:0x096f, B:1096:0x0973, B:1098:0x097b, B:1101:0x0982, B:1105:0x099c, B:1107:0x09a5, B:1113:0x09b4, B:1115:0x09b8, B:1116:0x09ba, B:1118:0x09bf, B:1119:0x09c0, B:1120:0x09c1, B:1147:0x0a29, B:1148:0x0a2a, B:1108:0x09a8, B:1149:0x0a2b, B:1123:0x09c6, B:1125:0x09cd, B:1127:0x09d2, B:1131:0x09db, B:1150:0x0a2c, B:1151:0x0a3d, B:1154:0x0a43, B:1156:0x0a49, B:1157:0x0a50, B:1159:0x0a57, B:1161:0x0a64, B:1162:0x0a6c, B:1165:0x0a76, B:1168:0x0a7c), top: B:1189:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:965:0x078b A[Catch: RuntimeException -> 0x0aa4, IOException -> 0x0ac3, 0yW -> 0x0ae2, TryCatch #7 {0yW -> 0x0ae2, IOException -> 0x0ac3, RuntimeException -> 0x0aa4, blocks: (B:629:0x0007, B:630:0x000d, B:632:0x0011, B:1169:0x0aa0, B:633:0x0021, B:635:0x0034, B:638:0x0039, B:640:0x003d, B:642:0x0046, B:643:0x0049, B:644:0x004c, B:646:0x0051, B:648:0x0055, B:649:0x005a, B:650:0x005d, B:651:0x0066, B:654:0x006c, B:656:0x0078, B:657:0x007b, B:658:0x0080, B:660:0x008e, B:661:0x0091, B:662:0x0096, B:664:0x009c, B:666:0x00a1, B:668:0x00a5, B:676:0x00b5, B:678:0x00ce, B:680:0x00d4, B:681:0x00f4, B:683:0x00fa, B:686:0x0104, B:688:0x010c, B:689:0x010e, B:691:0x0112, B:693:0x0118, B:694:0x011c, B:696:0x0120, B:697:0x0125, B:701:0x0145, B:702:0x0154, B:704:0x015d, B:698:0x0128, B:700:0x012f, B:673:0x00af, B:705:0x016c, B:707:0x0176, B:709:0x017a, B:710:0x017f, B:712:0x0189, B:714:0x018d, B:716:0x01d6, B:717:0x01e5, B:718:0x01ea, B:720:0x01f4, B:722:0x024b, B:724:0x0255, B:726:0x026e, B:729:0x0275, B:731:0x028b, B:734:0x0297, B:742:0x02c7, B:743:0x02d5, B:744:0x02d9, B:745:0x02de, B:735:0x02b2, B:738:0x02c0, B:746:0x02df, B:748:0x02ee, B:750:0x02fb, B:751:0x02ff, B:753:0x0303, B:754:0x030c, B:758:0x0326, B:762:0x034b, B:764:0x0353, B:766:0x0359, B:767:0x0362, B:771:0x0386, B:760:0x032f, B:761:0x034a, B:772:0x038e, B:774:0x0396, B:776:0x039c, B:780:0x03c0, B:781:0x03c8, B:783:0x03cc, B:784:0x03ce, B:786:0x03d4, B:787:0x03d8, B:789:0x03e0, B:791:0x03ee, B:793:0x03fa, B:795:0x0416, B:797:0x041a, B:799:0x0424, B:800:0x042d, B:803:0x0434, B:806:0x043e, B:807:0x0456, B:809:0x0460, B:811:0x046a, B:814:0x0471, B:817:0x047b, B:818:0x0493, B:820:0x04a1, B:823:0x04a7, B:835:0x04e7, B:837:0x04ed, B:838:0x0507, B:826:0x04b4, B:828:0x04c2, B:830:0x04c8, B:841:0x0517, B:843:0x051a, B:831:0x04cd, B:833:0x04dd, B:839:0x050c, B:840:0x0511, B:844:0x051d, B:792:0x03f7, B:845:0x0522, B:846:0x0534, B:852:0x053e, B:853:0x053f, B:856:0x0545, B:857:0x054a, B:858:0x0552, B:859:0x055d, B:861:0x0577, B:900:0x0636, B:902:0x064c, B:888:0x0600, B:890:0x0616, B:904:0x0652, B:906:0x0668, B:907:0x066b, B:862:0x058c, B:866:0x05a7, B:908:0x066c, B:910:0x067d, B:912:0x0681, B:916:0x06af, B:918:0x06b5, B:920:0x06bb, B:922:0x06c1, B:924:0x06cb, B:956:0x0774, B:958:0x0778, B:960:0x077e, B:962:0x0784, B:963:0x0787, B:965:0x078b, B:966:0x078e, B:969:0x0794, B:972:0x07a5, B:973:0x07a8, B:976:0x07b0, B:978:0x07e2, B:981:0x07e9, B:983:0x07ee, B:985:0x07f6, B:987:0x07fc, B:989:0x0802, B:990:0x0805, B:991:0x0808, B:994:0x080d, B:996:0x0812, B:999:0x0820, B:1002:0x0828, B:1003:0x082b, B:1005:0x082f, B:1006:0x0834, B:1008:0x083a, B:1011:0x0840, B:1016:0x085f, B:1021:0x086d, B:1022:0x0873, B:1024:0x087b, B:1027:0x088b, B:1030:0x0896, B:1032:0x08a0, B:1039:0x08ae, B:1040:0x08b2, B:1042:0x08b6, B:1043:0x08bf, B:1044:0x08d1, B:1045:0x08d6, B:977:0x07de, B:926:0x06d1, B:928:0x06d7, B:935:0x0703, B:937:0x0707, B:940:0x0710, B:938:0x070c, B:943:0x0719, B:944:0x071f, B:946:0x072f, B:947:0x0731, B:949:0x0748, B:954:0x0757, B:955:0x075c, B:952:0x074e, B:931:0x06eb, B:932:0x06fa, B:913:0x0684, B:915:0x068a, B:1047:0x08db, B:1049:0x08e4, B:1052:0x08ee, B:1054:0x08f4, B:1056:0x08fa, B:1058:0x0900, B:1060:0x0904, B:1063:0x090b, B:1069:0x0919, B:1071:0x091e, B:1072:0x0921, B:1076:0x0931, B:1078:0x0939, B:1080:0x093f, B:1090:0x0962, B:1092:0x0968, B:1133:0x09e9, B:1134:0x09f1, B:1143:0x0a0f, B:1145:0x0a24, B:1139:0x09fa, B:1142:0x0a01, B:1144:0x0a1d, B:1081:0x0946, B:1083:0x094c, B:1085:0x0951, B:1087:0x0957, B:1089:0x095f, B:1094:0x096f, B:1096:0x0973, B:1098:0x097b, B:1101:0x0982, B:1105:0x099c, B:1107:0x09a5, B:1113:0x09b4, B:1115:0x09b8, B:1116:0x09ba, B:1118:0x09bf, B:1119:0x09c0, B:1120:0x09c1, B:1147:0x0a29, B:1148:0x0a2a, B:1108:0x09a8, B:1149:0x0a2b, B:1123:0x09c6, B:1125:0x09cd, B:1127:0x09d2, B:1131:0x09db, B:1150:0x0a2c, B:1151:0x0a3d, B:1154:0x0a43, B:1156:0x0a49, B:1157:0x0a50, B:1159:0x0a57, B:1161:0x0a64, B:1162:0x0a6c, B:1165:0x0a76, B:1168:0x0a7c), top: B:1189:0x0007 }] */
    /* JADX WARN: Type inference failed for: r10v23, types: [int] */
    /* JADX WARN: Type inference failed for: r10v25, types: [android.util.Pair] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleMessage(android.os.Message r39) {
        /*
            Method dump skipped, instructions count: 2848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39201pk.handleMessage(android.os.Message):boolean");
    }
}
