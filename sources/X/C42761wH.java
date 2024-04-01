package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1wH */
/* loaded from: classes2.dex */
public class C42761wH {
    public static volatile C42761wH A09;
    public final AnonymousClass012 A01;
    public final C0C9 A02;
    public final C05D A03;
    public final C05E A04;
    public final C0E9 A05;
    public final C42781wJ A06;
    public final C42791wK A07;
    public final C06F A00 = new C06F(250);
    public final Set A08 = new HashSet();

    public C42761wH(AnonymousClass012 anonymousClass012, C0C9 c0c9, C42781wJ c42781wJ, C0E9 c0e9, C05D c05d, C05E c05e, C42791wK c42791wK) {
        this.A01 = anonymousClass012;
        this.A02 = c0c9;
        this.A06 = c42781wJ;
        this.A05 = c0e9;
        this.A03 = c05d;
        this.A04 = c05e;
        this.A07 = c42791wK;
    }

    public static C42761wH A00() {
        if (A09 == null) {
            synchronized (C42761wH.class) {
                if (A09 == null) {
                    A09 = new C42761wH(AnonymousClass012.A00(), C0C9.A00(), C42781wJ.A00(), C0E9.A00(), C05D.A00(), C05E.A00(), C42791wK.A00());
                }
            }
        }
        return A09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0016, code lost:
        if (X.C003101m.A0P(r1) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A01(X.AnonymousClass092 r10) {
        /*
            r9 = this;
            X.094 r0 = r10.A0n
            X.02j r1 = r0.A00
            boolean r0 = X.C003101m.A0U(r1)
            r8 = 0
            if (r0 != 0) goto L18
            boolean r0 = X.C003101m.A0Z(r1)
            if (r0 != 0) goto L18
            boolean r1 = X.C003101m.A0P(r1)
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            X.C000700j.A06(r0)
            X.1wL r0 = r9.A02(r10)
            int r7 = r10.A06
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Collection r0 = r0.values()
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
            r4 = 0
        L2e:
            boolean r0 = r6.hasNext()
            r3 = 13
            r2 = 5
            r1 = 8
            if (r0 == 0) goto L51
            java.lang.Object r0 = r6.next()
            X.1wM r0 = (X.C42811wM) r0
            int r0 = r0.A00()
            if (r0 == r2) goto L4e
            if (r0 == r1) goto L4a
            if (r0 == r3) goto L4c
            goto L2e
        L4a:
            int r8 = r8 + 1
        L4c:
            int r5 = r5 + 1
        L4e:
            int r4 = r4 + 1
            goto L2e
        L51:
            if (r8 < r7) goto L56
            r3 = 8
        L55:
            return r3
        L56:
            if (r5 >= r7) goto L55
            r3 = 4
            if (r4 < r7) goto L55
            r3 = 5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42761wH.A01(X.092):int");
    }

    public C42801wL A02(AnonymousClass092 anonymousClass092) {
        C42801wL A01;
        AnonymousClass012 anonymousClass012 = this.A01;
        long A04 = anonymousClass012.A04();
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        C06F c06f = this.A00;
        C42801wL c42801wL = (C42801wL) c06f.A04(anonymousClass094);
        if (c42801wL != null) {
            return c42801wL;
        }
        C42781wJ c42781wJ = this.A06;
        if (c42781wJ.A03()) {
            A01 = c42781wJ.A01(anonymousClass092.A0p);
        } else {
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            if (!C003101m.A0U(abstractC005302j) && !C003101m.A0Z(abstractC005302j)) {
                A01 = this.A07.A02(anonymousClass092);
            } else {
                A01 = this.A07.A01(anonymousClass094);
            }
        }
        c06f.A08(anonymousClass094, A01);
        C000200d.A0e(anonymousClass012, A04, this.A03, "ReceiptManager/getMessageReceipts");
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x004c, code lost:
        if (X.C003101m.A0Z(r12) != false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(X.AnonymousClass092 r29, com.whatsapp.jid.DeviceJid r30, int r31, long r32) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42761wH.A03(X.092, com.whatsapp.jid.DeviceJid, int, long):boolean");
    }
}
