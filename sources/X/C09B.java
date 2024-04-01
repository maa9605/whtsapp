package X;

/* renamed from: X.09B */
/* loaded from: classes.dex */
public abstract class C09B extends AnonymousClass097 {
    public C09B(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
    }

    public C09B(AnonymousClass094 anonymousClass094, long j, C24D c24d, boolean z, boolean z2, byte b) {
        super(anonymousClass094, j, b);
        A1K(c24d, z, z2);
    }

    public C09B(AnonymousClass097 anonymousClass097, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z, byte b) {
        super(anonymousClass097, anonymousClass094, j, c09h, z, b);
    }

    @Override // X.AnonymousClass092
    public C03900Hp A0E() {
        C03900Hp A0E = super.A0E();
        if (A0E != null) {
            return A0E;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x020e, code lost:
        if (((X.AnonymousClass097) r10).A00 > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0218, code lost:
        if (android.text.TextUtils.isEmpty(((X.AnonymousClass097) r10).A09) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0222, code lost:
        if (android.text.TextUtils.isEmpty(((X.AnonymousClass097) r10).A07) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x000c, code lost:
        if (r5.A0U != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C48622Fy A1H(X.C02L r11, X.C48622Fy r12, boolean r13, boolean r14, X.C0CM r15, byte[] r16) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09B.A1H(X.02L, X.2Fy, boolean, boolean, X.0CM, byte[]):X.2Fy");
    }

    public void A1I(C48622Fy c48622Fy, C40551sS c40551sS) {
        C02L c02l = c40551sS.A00;
        boolean z = c40551sS.A04;
        C48622Fy A1H = A1H(c02l, c48622Fy, z, c40551sS.A03, c40551sS.A02, c40551sS.A05);
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null && ((z || c09h.A0U != null) && A1H != null)) {
            C04030Id A18 = A18();
            if (A18 == null) {
                throw null;
            }
            byte[] A06 = A18.A06();
            if (A06 != null) {
                C0AN A00 = C0AN.A00(A06);
                A1H.A02();
                C24D.A0D((C24D) A1H.A00, A00);
                return;
            }
            return;
        }
        C000200d.A1G(C000200d.A0P("FMessageVideo/unable to send encrypted media message due to missing; media_wa_type="), this.A0m);
    }

    public void A1J(C24D c24d) {
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null) {
            if ((c24d.A00 & 32) == 32) {
                byte[] A06 = c24d.A0B.A06();
                if (A06.length > 0) {
                    C04030Id A18 = A18();
                    if (A18 != null) {
                        synchronized (A18) {
                            A18.A03(A06, null);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            C0Ho.A0D(c09h, c24d.A0E);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x005e, code lost:
        if ((r3 & 256) == 256) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0060, code lost:
        r4.A08 = r13.A04;
        r4.A06 = r13.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00ad, code lost:
        if (r14 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b2, code lost:
        if ((r13.A00 & 1) == 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b4, code lost:
        A1E(r13.A0K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00bf, code lost:
        if (android.text.TextUtils.isEmpty(r13.A0G) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00c1, code lost:
        ((X.AnonymousClass097) r12).A04 = X.AnonymousClass024.A0K(r13.A0G, 65536);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00cd, code lost:
        if (r14 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00d2, code lost:
        if ((r13.A00 & 2048) == 2048) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d4, code lost:
        X.C000200d.A1K(X.C000200d.A0P("FMessageVideoCommon/buildE2eMessage/sending video with directPath not set; message.key="), r12.A0n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00df, code lost:
        r3 = r13.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00e5, code lost:
        if ((r3 & 262144) != 262144) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00eb, code lost:
        if ((r3 & 1048576) != 1048576) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00f0, code lost:
        if ((r3 & 524288) != 524288) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00f2, code lost:
        r5 = new X.C05610Pk();
        r5.A03 = r13.A0J;
        r3 = r13.A0D.A06();
        r1 = r13.A0C.A06();
        r5.A05 = android.util.Base64.encodeToString(r3, 2);
        r5.A04 = android.util.Base64.encodeToString(r1, 2);
        r5.A07 = r13.A0A.A06();
        r5.A02 = r13.A06 * 1000;
        r12.A0N = r5;
        A0U(2048);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0125, code lost:
        ((X.AnonymousClass097) r12).A00 = r13.A03;
        X.C0Ho.A0D(r4, r13.A0E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x012e, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x012f, code lost:
        r4.A0G = r13.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0051, code lost:
        if (r14 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.C24D r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09B.A1K(X.24D, boolean, boolean):void");
    }
}
