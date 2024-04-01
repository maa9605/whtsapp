package X;

import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1Z9  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Z9 implements AnonymousClass137, InterfaceC21440zL, InterfaceC21130yq, InterfaceC219710n, AnonymousClass135, InterfaceC21400zH, InterfaceC21650zg, C10M, AnonymousClass121 {
    public InterfaceC06280Sk A00;
    public final C12Q A03;
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public final C21260z3 A02 = new C21260z3();
    public final C21220yz A01 = new C21220yz();

    @Override // X.AnonymousClass135
    public final void ANp() {
    }

    public C1Z9(InterfaceC06280Sk interfaceC06280Sk, C12Q c12q) {
        this.A00 = interfaceC06280Sk;
        this.A03 = c12q;
    }

    public final void A00() {
        C21250z2 c21250z2;
        C21260z3 c21260z3 = this.A02;
        ArrayList arrayList = c21260z3.A05;
        if (!arrayList.isEmpty() && !c21260z3.A00.A0D() && !c21260z3.A03) {
            c21250z2 = (C21250z2) arrayList.get(0);
        } else {
            c21250z2 = null;
        }
        A04(c21250z2);
    }

    public final void A01() {
        Iterator it = new ArrayList(this.A02.A05).iterator();
        while (it.hasNext()) {
            C21250z2 c21250z2 = (C21250z2) it.next();
            ALp(c21250z2.A00, c21250z2.A02);
        }
    }

    public final void A02(int i, C219010g c219010g) {
        InterfaceC06280Sk interfaceC06280Sk = this.A00;
        if (interfaceC06280Sk == null) {
            throw null;
        }
        if (c219010g != null) {
            C21250z2 c21250z2 = (C21250z2) this.A02.A06.get(c219010g);
            if (c21250z2 != null) {
                A04(c21250z2);
                return;
            } else {
                A03(AbstractC21230z0.A00, i, c219010g);
                return;
            }
        }
        AbstractC21230z0 A9X = interfaceC06280Sk.A9X();
        if (i >= A9X.A01()) {
            A9X = AbstractC21230z0.A00;
        }
        A03(A9X, i, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r5 != r3.A00.A9Y()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.AbstractC21230z0 r4, int r5, X.C219010g r6) {
        /*
            r3 = this;
            boolean r2 = r4.A0D()
            if (r2 == 0) goto L7
            r6 = 0
        L7:
            X.12Q r0 = r3.A03
            r0.A7X()
            X.0Sk r0 = r3.A00
            X.0z0 r0 = r0.A9X()
            if (r4 != r0) goto L1d
            X.0Sk r0 = r3.A00
            int r0 = r0.A9Y()
            r1 = 1
            if (r5 == r0) goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r6 == 0) goto L51
            boolean r0 = r6.A00()
            if (r0 == 0) goto L51
            if (r1 == 0) goto L41
            X.0Sk r0 = r3.A00
            int r1 = r0.A9R()
            int r0 = r6.A00
            if (r1 != r0) goto L41
            X.0Sk r0 = r3.A00
            int r1 = r0.A9S()
            int r0 = r6.A01
            if (r1 != r0) goto L41
            X.0Sk r0 = r3.A00
            r0.A9U()
        L41:
            X.0Sk r0 = r3.A00
            r0.A9U()
            X.0Sk r0 = r3.A00
            r0.ADX()
            X.0z4 r0 = new X.0z4
            r0.<init>()
            return
        L51:
            if (r1 == 0) goto L59
            X.0Sk r0 = r3.A00
            r0.A98()
            goto L41
        L59:
            if (r2 != 0) goto L41
            X.0yz r0 = r3.A01
            r4.A0A(r5, r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Z9.A03(X.0z0, int, X.10g):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r10 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A04(X.C21250z2 r10) {
        /*
            r9 = this;
            X.0Sk r0 = r9.A00
            if (r0 == 0) goto L5b
            if (r10 != 0) goto L51
            int r5 = r0.A9Y()
            X.0z3 r8 = r9.A02
            r4 = 0
            r10 = r4
            r7 = 0
        Lf:
            java.util.ArrayList r1 = r8.A05
            int r0 = r1.size()
            if (r7 >= r0) goto L3d
            java.lang.Object r6 = r1.get(r7)
            X.0z2 r6 = (X.C21250z2) r6
            X.0z0 r1 = r8.A00
            X.10g r0 = r6.A02
            java.lang.Object r0 = r0.A04
            int r3 = r1.A04(r0)
            r0 = -1
            if (r3 == r0) goto L3a
            X.0z0 r2 = r8.A00
            X.0yy r1 = r8.A04
            r0 = 0
            X.0yy r0 = r2.A08(r3, r1, r0)
            int r0 = r0.A00
            if (r0 != r5) goto L3a
            if (r10 != 0) goto L3f
            r10 = r6
        L3a:
            int r7 = r7 + 1
            goto Lf
        L3d:
            if (r10 != 0) goto L51
        L3f:
            X.0Sk r0 = r9.A00
            X.0z0 r1 = r0.A9X()
            int r0 = r1.A01()
            if (r5 < r0) goto L4d
            X.0z0 r1 = X.AbstractC21230z0.A00
        L4d:
            r9.A03(r1, r5, r4)
            return
        L51:
            X.0z0 r2 = r10.A01
            int r1 = r10.A00
            X.10g r0 = r10.A02
            r9.A03(r2, r1, r0)
            return
        L5b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Z9.A04(X.0z2):void");
    }

    @Override // X.InterfaceC21440zL
    public final void AHQ(String str, long j, long j2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21440zL
    public final void AHR(C21630ze c21630ze) {
        A04(this.A02.A01);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21440zL
    public final void AHS(C21630ze c21630ze) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21440zL
    public final void AHT(C21030yg c21030yg) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21440zL
    public final void AHV(int i) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21440zL
    public final void AHW(int i, long j, long j2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void AJb(int i, C219010g c219010g, C219610m c219610m) {
        A02(i, c219010g);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass137
    public final void AJd(int i, long j) {
        A04(this.A02.A01);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void ALL(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m) {
        A02(i, c219010g);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void ALM(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m) {
        A02(i, c219010g);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void ALP(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m, IOException iOException, boolean z) {
        A02(i, c219010g);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void ALV(int i, C219010g c219010g, C219510l c219510l, C219610m c219610m) {
        A02(i, c219010g);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21130yq
    public final void ALa(boolean z) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void ALo(int i, C219010g c219010g) {
        AbstractC21230z0 abstractC21230z0;
        C21260z3 c21260z3 = this.A02;
        if (c21260z3.A00.A04(c219010g.A04) != -1) {
            abstractC21230z0 = c21260z3.A00;
        } else {
            abstractC21230z0 = AbstractC21230z0.A00;
        }
        C21250z2 c21250z2 = new C21250z2(c219010g, abstractC21230z0, i);
        ArrayList arrayList = c21260z3.A05;
        arrayList.add(c21250z2);
        c21260z3.A06.put(c219010g, c21250z2);
        if (arrayList.size() == 1 && !c21260z3.A00.A0D()) {
            c21260z3.A01();
        }
        A02(i, c219010g);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void ALp(int i, C219010g c219010g) {
        A02(i, c219010g);
        C21260z3 c21260z3 = this.A02;
        Object remove = c21260z3.A06.remove(c219010g);
        if (remove != null) {
            ArrayList arrayList = c21260z3.A05;
            arrayList.remove(remove);
            C21250z2 c21250z2 = c21260z3.A02;
            if (c21250z2 != null && c219010g.equals(c21250z2.A02)) {
                c21260z3.A02 = arrayList.isEmpty() ? null : (C21250z2) arrayList.get(0);
            }
            Iterator it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC21130yq
    public final void AN0(C21120yp c21120yp) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21130yq
    public final void AN2(C20930yW c20930yW) {
        if (c20930yW.type == 0) {
            ArrayList arrayList = this.A02.A05;
            A04(arrayList.isEmpty() ? null : (C21250z2) arrayList.get(arrayList.size() - 1));
        } else {
            A00();
        }
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21130yq
    public final void AN3(boolean z, int i) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21130yq
    public final void AN4(int i) {
        this.A02.A01();
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC219710n
    public final void ANb(int i, C219010g c219010g) {
        C21260z3 c21260z3 = this.A02;
        c21260z3.A02 = (C21250z2) c21260z3.A06.get(c219010g);
        A02(i, c219010g);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass137
    public final void ANq(Surface surface) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21130yq
    public final void AOS() {
        C21260z3 c21260z3 = this.A02;
        if (c21260z3.A03) {
            c21260z3.A03 = false;
            c21260z3.A01();
            A00();
            Iterator it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass135
    public void APO(int i, int i2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21130yq
    public final void APd(AbstractC21230z0 abstractC21230z0, Object obj, int i) {
        C21260z3 c21260z3 = this.A02;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = c21260z3.A05;
            if (i2 >= arrayList.size()) {
                break;
            }
            C21250z2 A00 = c21260z3.A00((C21250z2) arrayList.get(i2), abstractC21230z0);
            arrayList.set(i2, A00);
            c21260z3.A06.put(A00.A02, A00);
            i2++;
        }
        C21250z2 c21250z2 = c21260z3.A02;
        if (c21250z2 != null) {
            c21260z3.A02 = c21260z3.A00(c21250z2, abstractC21230z0);
        }
        c21260z3.A00 = abstractC21230z0;
        c21260z3.A01();
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21130yq
    public final void APq(C220910z c220910z, C222111l c222111l) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass137
    public final void AQJ(String str, long j, long j2) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass137
    public final void AQK(C21630ze c21630ze) {
        A04(this.A02.A01);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass137
    public final void AQL(C21630ze c21630ze) {
        A00();
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass137
    public final void AQM(C21030yg c21030yg) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.AnonymousClass137
    public final void AQN(int i, int i2, int i3, float f) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }

    @Override // X.InterfaceC21400zH
    public void AQQ(float f) {
        A04(this.A02.A02);
        Iterator it = this.A04.iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        }
    }
}
