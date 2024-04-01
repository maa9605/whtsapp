package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0FO */
/* loaded from: classes.dex */
public class C0FO {
    public static volatile C0FO A09;
    public final C018508q A00;
    public final C03160Eo A01;
    public final C05W A02;
    public final C0GJ A03;
    public final C05M A04;
    public final C03340Fh A05;
    public final C0CA A06;
    public final C0EF A07;
    public final C0EN A08;

    public C0FO(C018508q c018508q, C05M c05m, C0EN c0en, C03160Eo c03160Eo, C05W c05w, C0EF c0ef, C0GJ c0gj, C0CA c0ca, C03340Fh c03340Fh) {
        this.A00 = c018508q;
        this.A04 = c05m;
        this.A08 = c0en;
        this.A01 = c03160Eo;
        this.A02 = c05w;
        this.A07 = c0ef;
        this.A03 = c0gj;
        this.A06 = c0ca;
        this.A05 = c03340Fh;
    }

    public static C0FO A00() {
        if (A09 == null) {
            synchronized (C0FO.class) {
                if (A09 == null) {
                    A09 = new C0FO(C018508q.A00(), C05M.A00(), C0EN.A00(), C03160Eo.A00(), C05W.A00(), C0EF.A00(), C0GJ.A00(), C0CA.A00(), C03340Fh.A00);
                }
            }
        }
        return A09;
    }

    public void A01() {
        this.A05.A02();
        this.A01.A02();
    }

    public void A02(AbstractC005302j abstractC005302j) {
        C05M c05m = this.A04;
        if (c05m.A0E(abstractC005302j)) {
            C0CA c0ca = this.A06;
            long A05 = c05m.A05(abstractC005302j);
            c0ca.A00.A0C();
            c0ca.A0G(abstractC005302j, A05, abstractC005302j);
            this.A05.A02();
            UserJid of = UserJid.of(abstractC005302j);
            if (of != null) {
                C0GJ c0gj = this.A03;
                C06C A0A = this.A02.A0A(of);
                C000700j.A01();
                Iterator it = c0gj.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (c0g5.hasNext()) {
                        ((C0P0) c0g5.next()).A00(A0A);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void A03(AbstractC005302j abstractC005302j, Collection collection) {
        this.A01.A02();
        this.A05.A05(abstractC005302j);
        if (collection == null || !this.A07.A01(abstractC005302j)) {
            return;
        }
        this.A08.A0A(collection);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.AbstractC005302j r5, boolean r6) {
        /*
            r4 = this;
            X.05M r1 = r4.A04
            boolean r0 = r1.A0E(r5)
            if (r0 == 0) goto L24
            X.0CA r3 = r4.A06
            long r1 = r1.A05(r5)
            X.05M r0 = r3.A00
            r0.A0C()
            boolean r0 = r3.A0G(r5, r1, r5)
            if (r0 != 0) goto L2e
            X.0Fh r0 = r4.A05
            r0.A05(r5)
        L1e:
            if (r6 == 0) goto L23
            r0.A06(r5)
        L23:
            return
        L24:
            X.0CA r0 = r4.A06
            r0.A0E(r5)
            X.0Eo r0 = r4.A01
            r0.A02()
        L2e:
            X.0Fh r0 = r4.A05
            r0.A02()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FO.A04(X.02j, boolean):void");
    }
}
