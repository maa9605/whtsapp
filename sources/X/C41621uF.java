package X;

/* renamed from: X.1uF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41621uF implements C0EM {
    public static volatile C41621uF A07;
    public C459924n A00;
    public C460124p A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass012 A04;
    public final C010605h A05;
    public final InterfaceC002901k A06;

    public C41621uF(AnonymousClass012 anonymousClass012, InterfaceC002901k interfaceC002901k, C010605h c010605h) {
        this.A04 = anonymousClass012;
        this.A06 = interfaceC002901k;
        this.A05 = c010605h;
    }

    public static C41621uF A00() {
        if (A07 == null) {
            synchronized (C41621uF.class) {
                if (A07 == null) {
                    A07 = new C41621uF(AnonymousClass012.A00(), C002801j.A00(), C010605h.A03);
                }
            }
        }
        return A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r6 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void A01(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto Ld
            boolean r0 = r5.A03     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L16
            X.05h r0 = r5.A05     // Catch: java.lang.Throwable -> L54
            r0.A00(r5)     // Catch: java.lang.Throwable -> L54
            goto L16
        Ld:
            boolean r0 = r5.A03     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L16
            X.05h r0 = r5.A05     // Catch: java.lang.Throwable -> L54
            r0.A01(r5)     // Catch: java.lang.Throwable -> L54
        L16:
            r0 = 1
            r5.A02 = r0     // Catch: java.lang.Throwable -> L54
            boolean r0 = r5.A03     // Catch: java.lang.Throwable -> L54
            r5.A03 = r6     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L48
            if (r6 != 0) goto L52
            X.24n r0 = r5.A00     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L4a
            X.24p r0 = r5.A01     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L4a
            long r3 = r0.A00     // Catch: java.lang.Throwable -> L54
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r0
            X.012 r0 = r5.A04     // Catch: java.lang.Throwable -> L54
            long r1 = r0.A05()     // Catch: java.lang.Throwable -> L54
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4a
            X.24n r4 = r5.A00     // Catch: java.lang.Throwable -> L54
            X.24p r0 = r5.A01     // Catch: java.lang.Throwable -> L54
            X.094 r3 = r0.A01     // Catch: java.lang.Throwable -> L54
            boolean r2 = r0.A03     // Catch: java.lang.Throwable -> L54
            boolean r1 = r0.A02     // Catch: java.lang.Throwable -> L54
            X.1ry r0 = r4.A00     // Catch: java.lang.Throwable -> L54
            r0.A08(r3, r2, r1)     // Catch: java.lang.Throwable -> L54
            goto L4a
        L48:
            if (r6 != 0) goto L52
        L4a:
            r0 = 0
            r5.A01 = r0     // Catch: java.lang.Throwable -> L50
            r5.A00 = r0     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r5)
            return
        L54:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41621uF.A01(boolean):void");
    }

    @Override // X.C0EM
    public void AIL(boolean z) {
        boolean z2;
        if (z) {
            synchronized (this) {
                this.A02 = false;
                z2 = this.A03;
            }
            if (z2) {
                this.A06.ASB(new RunnableEBaseShape4S0100000_I0_4(this, 36), 10000L);
            }
        }
    }
}
