package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1y8 */
/* loaded from: classes2.dex */
public class C43871y8 extends AbstractC43881y9 {
    public static volatile C43871y8 A02;
    public final C01B A00;
    public final C43951yH A01;

    public C43871y8(C001200o c001200o, AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0EL c0el, C01B c01b, C43911yC c43911yC, AnonymousClass035 anonymousClass035, C0E7 c0e7, C41451tw c41451tw, C000500h c000500h) {
        super(c001200o, anonymousClass012, abstractC000600i, interfaceC002901k, c0el, c43911yC, anonymousClass035, c0e7, c41451tw, c000500h);
        this.A00 = c01b;
        this.A01 = new C43951yH(c001200o, abstractC000600i);
    }

    public static C43871y8 A00() {
        if (A02 == null) {
            synchronized (C43871y8.class) {
                if (A02 == null) {
                    A02 = new C43871y8(C001200o.A01, AnonymousClass012.A00(), AbstractC000600i.A00(), C002801j.A00(), C0EL.A00(), C01B.A00(), C43911yC.A00(), AnonymousClass035.A00(), C0E7.A00(), C41451tw.A00(), C000500h.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:425:0x01be, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0384, code lost:
        if (r8.A00() == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x048c, code lost:
        if (r3.contains("offsetfile.json") == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0541, code lost:
        if (r8.A00() != 1) goto L260;
     */
    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC43881y9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0J(X.InterfaceC02170Ad r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43871y8.A0J(X.0Ad, java.lang.String):boolean");
    }

    public final synchronized void A0K() {
        String A01;
        C44001yM A012 = A01();
        if (A012 != null && (A01 = A012.A01(0)) != null) {
            C43951yH c43951yH = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("downloadable/emoji_");
            sb.append(A01);
            String obj = sb.toString();
            ReentrantLock reentrantLock = c43951yH.A07;
            reentrantLock.lock();
            if (c43951yH.A00() == 2) {
                reentrantLock.unlock();
            } else {
                int A00 = c43951yH.A00();
                C43951yH.A08.get(A00);
                c43951yH.A03(1);
                synchronized (c43951yH) {
                    c43951yH.A02 = obj;
                }
                if (c43951yH.A04()) {
                    c43951yH.A03(2);
                } else {
                    c43951yH.A03(A00);
                }
                reentrantLock.unlock();
            }
        }
    }

    public synchronized void A0L(int i) {
        if (this.A00.A07(C01C.A43) <= 0) {
            return;
        }
        int A0G = A0G();
        if (A0G != 3 && A0G != 1) {
            A0H(1);
            this.A0E.AS1(new RunnableEBaseShape0S0101000_I0(this, i, 3));
        } else {
            AbstractC43891yA.A0G.get(Integer.valueOf(A0G));
        }
    }
}
