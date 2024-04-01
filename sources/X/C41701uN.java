package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1uN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41701uN {
    public static volatile C41701uN A08;
    public final AnonymousClass012 A00;
    public final C000500h A01;
    public final C05Q A02;
    public final C07B A03;
    public final C003701t A04;
    public final C23L A05;
    public final InterfaceC002901k A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);

    public C41701uN(AnonymousClass012 anonymousClass012, C003701t c003701t, InterfaceC002901k interfaceC002901k, C05Q c05q, C000500h c000500h, C23L c23l, C07B c07b) {
        this.A00 = anonymousClass012;
        this.A04 = c003701t;
        this.A06 = interfaceC002901k;
        this.A02 = c05q;
        this.A01 = c000500h;
        this.A05 = c23l;
        this.A03 = c07b;
    }

    public static C41701uN A00() {
        if (A08 == null) {
            synchronized (C41701uN.class) {
                if (A08 == null) {
                    A08 = new C41701uN(AnonymousClass012.A00(), C003701t.A00(), C002801j.A00(), C05Q.A00(), C000500h.A00(), C23L.A00(), C07B.A00());
                }
            }
        }
        return A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (X.C40841sx.A0g(r2, r4.A00, r4.A01, r5) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.AnonymousClass092 r5) {
        /*
            r4 = this;
            X.01t r2 = r4.A04
            r0 = 250(0xfa, float:3.5E-43)
            boolean r0 = r2.A0C(r0)
            if (r0 == 0) goto Le
            boolean r0 = r5 instanceof X.C09E
            if (r0 != 0) goto L19
        Le:
            X.012 r1 = r4.A00
            X.00h r0 = r4.A01
            boolean r1 = X.C40841sx.A0g(r2, r1, r0, r5)
            r0 = 0
            if (r1 == 0) goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 != 0) goto L1d
            return
        L1d:
            X.23L r1 = r4.A05
            r0 = 1
            r1.A07(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41701uN.A01(X.092):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (X.C40841sx.A0g(r5, r8.A00, r8.A01, r6) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(java.util.LinkedList r9, java.util.Random r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ThumbnailAutoDownload/enqueueThumbnailAutodownloadsToRetry num remaining:"
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            r3 = 0
            r4 = 0
        L16:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L84
            X.23L r2 = r8.A05
            monitor-enter(r2)
            java.util.Map r0 = r2.A01     // Catch: java.lang.Throwable -> L81
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L81
            monitor-exit(r2)
            r0 = 20
            if (r4 >= r0) goto L69
            int r1 = r1 - r4
            r0 = 5
            if (r1 > r0) goto L69
            java.lang.Object r0 = r9.pop()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.05Q r5 = r8.A02
            X.092 r6 = r5.A01(r0)
            if (r6 == 0) goto L16
            X.094 r0 = r6.A0n
            boolean r0 = r0.A02
            if (r0 != 0) goto L16
            X.01t r5 = r8.A04
            r0 = 250(0xfa, float:3.5E-43)
            boolean r0 = r5.A0C(r0)
            if (r0 == 0) goto L54
            boolean r0 = r6 instanceof X.C09E
            if (r0 != 0) goto L5f
        L54:
            X.012 r1 = r8.A00
            X.00h r0 = r8.A01
            boolean r1 = X.C40841sx.A0g(r5, r1, r0, r6)
            r0 = 0
            if (r1 == 0) goto L60
        L5f:
            r0 = 1
        L60:
            if (r0 == 0) goto L16
            r0 = 1
            r2.A07(r6, r0)
            int r4 = r4 + 1
            goto L16
        L69:
            r9.size()
            r0 = 5000(0x1388, float:7.006E-42)
            int r1 = r10.nextInt(r0)
            int r1 = r1 + r0
            X.01k r3 = r8.A06
            r0 = 26
            java.lang.RunnableEBaseShape0S0300000_I0_0 r2 = new java.lang.RunnableEBaseShape0S0300000_I0_0
            r2.<init>(r8, r9, r10, r0)
            long r0 = (long) r1
            r3.ASB(r2, r0)
            return
        L81:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L84:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A07
            r0.set(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41701uN.A02(java.util.LinkedList, java.util.Random):void");
    }
}
