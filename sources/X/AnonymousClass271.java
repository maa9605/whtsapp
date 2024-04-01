package X;

/* renamed from: X.271  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass271 {
    public static volatile AnonymousClass271 A07;
    public final C018508q A00;
    public final C06M A01;
    public final C05W A02;
    public final AnonymousClass075 A03;
    public final C0C9 A04;
    public final C41681uL A05;
    public final InterfaceC002901k A06;

    public AnonymousClass271(C018508q c018508q, InterfaceC002901k interfaceC002901k, C05W c05w, C0C9 c0c9, AnonymousClass075 anonymousClass075, C41681uL c41681uL, C06M c06m) {
        this.A00 = c018508q;
        this.A06 = interfaceC002901k;
        this.A02 = c05w;
        this.A04 = c0c9;
        this.A03 = anonymousClass075;
        this.A05 = c41681uL;
        this.A01 = c06m;
    }

    public static AnonymousClass271 A00() {
        if (A07 == null) {
            synchronized (AnonymousClass271.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass271(C018508q.A00(), C002801j.A00(), C05W.A00(), C0C9.A00(), AnonymousClass075.A00(), C41681uL.A00(), C06M.A00);
                }
            }
        }
        return A07;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1.A05 != r21) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(com.whatsapp.jid.UserJid r19, byte[] r20, long r21, int r23, X.C05200Ns r24) {
        /*
            r18 = this;
            r8 = r18
            X.075 r7 = r8.A03
            X.060 r3 = r7.A04
            r9 = r19
            X.08l r1 = r3.A0E(r9)
            r6 = 1
            if (r1 == 0) goto L16
            long r4 = r1.A05
            int r2 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            r0 = 1
            if (r2 == 0) goto L17
        L16:
            r0 = 0
        L17:
            r4 = r20
            r2 = r24
            r11 = r23
            if (r20 == 0) goto L6f
            if (r0 != 0) goto L6f
            boolean r2 = r7.A05(r9, r4, r11, r2)
        L25:
            if (r1 == 0) goto L2f
            int r0 = r1.A02
            if (r0 <= 0) goto L6c
            byte[] r0 = r1.A09
            if (r0 == 0) goto L6c
        L2f:
            r10 = 0
        L30:
            r15 = 0
            if (r1 == 0) goto L3b
            int r0 = r1.A02
            if (r0 <= 0) goto L69
            byte[] r0 = r1.A09
            if (r0 == 0) goto L69
        L3b:
            r12 = r15
        L3c:
            X.08l r0 = r3.A0E(r9)
            if (r0 != 0) goto L66
            r13 = r15
        L43:
            if (r1 == 0) goto L64
            X.0Ns r14 = r1.A00()
        L49:
            if (r0 == 0) goto L4f
            X.0Ns r15 = r0.A00()
        L4f:
            int r16 = X.C0O2.A00(r1)
            int r17 = X.C0O2.A00(r0)
            if (r2 == 0) goto L63
            X.01k r0 = r8.A06
            X.2mV r7 = new X.2mV
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.AS1(r7)
        L63:
            return
        L64:
            r14 = r15
            goto L49
        L66:
            java.lang.String r13 = r0.A08
            goto L43
        L69:
            java.lang.String r12 = r1.A08
            goto L3c
        L6c:
            int r10 = r1.A03
            goto L30
        L6f:
            boolean r2 = r7.A04(r9, r11, r2, r6)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass271.A01(com.whatsapp.jid.UserJid, byte[], long, int, X.0Ns):void");
    }
}
