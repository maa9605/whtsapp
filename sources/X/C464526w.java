package X;

import java.util.ArrayList;

/* renamed from: X.26w */
/* loaded from: classes2.dex */
public class C464526w {
    public static volatile C464526w A0C;
    public final C018508q A00;
    public final C013306k A01;
    public final C013606n A02;
    public final C0EN A03;
    public final C0EJ A04;
    public final C03090Ed A05;
    public final C42031uu A06;
    public final C28M A07;
    public final C42021ut A08;
    public final C0EX A09;
    public final C0DV A0A;
    public final C014406v A0B = C014406v.A00("PaymentsMessageHandler", "infra", "COMMON");

    public C464526w(C018508q c018508q, C0EN c0en, C0DV c0dv, C0EJ c0ej, C013606n c013606n, C013306k c013306k, C0EX c0ex, C03090Ed c03090Ed, C42021ut c42021ut, C42031uu c42031uu, C28M c28m) {
        this.A00 = c018508q;
        this.A03 = c0en;
        this.A0A = c0dv;
        this.A04 = c0ej;
        this.A02 = c013606n;
        this.A01 = c013306k;
        this.A09 = c0ex;
        this.A05 = c03090Ed;
        this.A08 = c42021ut;
        this.A06 = c42031uu;
        this.A07 = c28m;
    }

    public static C464526w A00() {
        if (A0C == null) {
            synchronized (C464526w.class) {
                if (A0C == null) {
                    A0C = new C464526w(C018508q.A00(), C0EN.A00(), C0DV.A00(), C0EJ.A00(), C013606n.A03(), C013306k.A07(), C0EX.A00, C03090Ed.A00(), C42021ut.A00(), C42031uu.A00(), C28M.A00);
                }
            }
        }
        return A0C;
    }

    public void A01(AnonymousClass093 anonymousClass093) {
        C013306k c013306k = this.A01;
        if (!c013306k.A0k(anonymousClass093.A0J, anonymousClass093, c013306k.A0P(anonymousClass093.A0J, anonymousClass093.A0I))) {
            C014406v c014406v = this.A0B;
            StringBuilder A0P = C000200d.A0P("updatePaymentInfoWithoutMessage transaction was not updated: ");
            A0P.append(anonymousClass093.A0I);
            c014406v.A03(A0P.toString());
            return;
        }
        AnonymousClass093 A0P2 = c013306k.A0P(anonymousClass093.A0J, anonymousClass093.A0I);
        if (A0P2 != null) {
            C014406v c014406v2 = this.A0B;
            StringBuilder A0P3 = C000200d.A0P("updatePaymentInfoWithoutMessage updated transaction with trans id: ");
            A0P3.append(A0P2.A0I);
            c014406v2.A07(null, A0P3.toString(), null);
            C03090Ed c03090Ed = this.A05;
            c03090Ed.A0A.AS1(new RunnableC27981Po(c03090Ed, A0P2));
            C018508q c018508q = this.A00;
            c018508q.A02.post(new RunnableEBaseShape3S0200000_I0_3(this, A0P2, 33));
        }
    }

    public final void A02(C04420Kc c04420Kc, final C02590Ca c02590Ca, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            C0N2 A05 = ((C0N0) arrayList.get(0)).A05();
            if (A05 != null) {
                this.A0A.A01().A02(A05, new C28N() { // from class: X.3hd
                    {
                        C464526w.this = this;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:64:0x004f  */
                    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                    @Override // X.C28N
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void AH2(java.util.List r7) {
                        /*
                            r6 = this;
                            X.26w r2 = X.C464526w.this
                            X.0Ca r1 = r2
                            int r0 = r7.size()
                            r4 = 1
                            if (r0 != r4) goto L3b
                            r0 = 0
                            java.lang.Object r3 = r7.get(r0)
                            X.0N2 r3 = (X.C0N2) r3
                            if (r3 == 0) goto L65
                            java.lang.String r5 = r3.A07
                            X.28M r0 = r2.A07
                            r0.A02(r3)
                            X.0DV r0 = r2.A0A
                            X.0DX r0 = r0.A03()
                            X.49H r0 = r0.ACD()
                            if (r0 == 0) goto L5d
                            if (r1 == 0) goto L5d
                            int r1 = r3.A08()
                            if (r1 == r4) goto L45
                            r0 = 4
                            if (r1 == r0) goto L45
                            r0 = 5
                            if (r1 == r0) goto L3c
                            r0 = 6
                            if (r1 == r0) goto L45
                            r0 = 7
                            if (r1 == r0) goto L45
                        L3b:
                            return
                        L3c:
                            X.0N0 r0 = r3.A06
                            X.4Ic r0 = (X.C92234Ic) r0
                            if (r0 == 0) goto L3b
                            java.lang.String r4 = r0.A04
                            goto L4d
                        L45:
                            X.0N0 r0 = r3.A06
                            X.4Ib r0 = (X.C92224Ib) r0
                            if (r0 == 0) goto L3b
                            java.lang.String r4 = r0.A05
                        L4d:
                            if (r4 == 0) goto L3b
                            X.1ut r3 = r2.A08
                            X.01k r2 = r3.A0A
                            r1 = 4
                            java.lang.RunnableEBaseShape0S2100000_I0 r0 = new java.lang.RunnableEBaseShape0S2100000_I0
                            r0.<init>(r3, r5, r4, r1)
                            r2.AS1(r0)
                            return
                        L5d:
                            X.06v r1 = r2.A0B
                            java.lang.String r0 = "onRecvPaymentMethodUpdate: storeOrUpdatePaymentMethod failed"
                            r1.A04(r0)
                            return
                        L65:
                            r0 = 0
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C77083hd.AH2(java.util.List):void");
                    }
                });
            } else {
                C018508q c018508q = this.A00;
                c018508q.A02.post(new RunnableEBaseShape3S0200000_I0_3(this, c02590Ca, 32));
            }
        }
        this.A03.A07(c04420Kc);
    }
}
