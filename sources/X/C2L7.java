package X;

/* renamed from: X.2L7  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2L7 implements InterfaceC010405f {
    public C2L8 A00;
    public AnonymousClass296 A01;
    public boolean A02;
    public final AbstractC000600i A03;
    public final C018508q A04;
    public final C49172Iw A05;
    public final AnonymousClass012 A06;
    public final C05Y A07;

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
    }

    public C2L7(AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, C05Y c05y, C49172Iw c49172Iw) {
        this.A06 = anonymousClass012;
        this.A04 = c018508q;
        this.A03 = abstractC000600i;
        this.A07 = c05y;
        this.A05 = c49172Iw;
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        this.A04.A0G(new RunnableEBaseShape0S0101000_I0(this, C40731sm.A01(c02590Ca), 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r10 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b9, code lost:
        if (r4.A04 == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    @Override // X.InterfaceC010405f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void APJ(java.lang.String r22, X.C02590Ca r23) {
        /*
            r21 = this;
            r3 = r21
            X.00i r9 = r3.A03
            X.0L3 r8 = X.C0L3.UNKNOWN
            java.lang.String r6 = "result"
            java.lang.String r7 = "type"
            r2 = 0
            r5 = r23
            if (r23 == 0) goto L51
            X.04P r0 = r5.A0A(r7)
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.A03
        L17:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L51
            java.lang.String r0 = "device"
            X.0Ca r4 = r5.A0D(r0)
            if (r4 == 0) goto L51
            java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r9 = r4.A08(r1, r0, r9)
            com.whatsapp.jid.DeviceJid r9 = (com.whatsapp.jid.DeviceJid) r9
            if (r9 == 0) goto L51
            java.lang.String r0 = "companion-props"
            X.0Ca r0 = r5.A0D(r0)
            if (r0 == 0) goto L9f
            goto L3c
        L3a:
            r0 = r2
            goto L17
        L3c:
            byte[] r1 = r0.A01     // Catch: X.C0JX -> L9a
            X.3zR r0 = X.C87303zR.A05     // Catch: X.C0JX -> L9a
            X.0AZ r4 = X.C0AZ.A03(r0, r1)     // Catch: X.C0JX -> L9a
            X.3zR r4 = (X.C87303zR) r4     // Catch: X.C0JX -> L9a
            if (r4 == 0) goto La0
            int r0 = r4.A01
            X.0L3 r10 = X.C0L3.A00(r0)
            if (r10 != 0) goto La1
            goto La0
        L51:
            r8 = r2
            X.2L8 r0 = r3.A00
            if (r0 == 0) goto Lc7
            boolean r0 = r3.A02
            if (r0 != 0) goto Lc7
            r0 = -1
            if (r23 == 0) goto Lc7
            X.04P r4 = r5.A0A(r7)
            if (r4 == 0) goto L98
            java.lang.String r4 = r4.A03
        L66:
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto Lc7
            java.lang.String r4 = "retry-ts"
            X.0Ca r5 = r5.A0D(r4)
            if (r5 == 0) goto Lc7
            java.lang.String r4 = "ts"
            X.04P r4 = r5.A0A(r4)
            if (r4 == 0) goto L7e
            java.lang.String r2 = r4.A03
        L7e:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto Lc7
            long r4 = X.AnonymousClass024.A03(r2, r0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto Lc7
            X.08q r2 = r3.A04
            r1 = 2
            java.lang.RunnableEBaseShape0S0100100_I0 r0 = new java.lang.RunnableEBaseShape0S0100100_I0
            r0.<init>(r3, r4, r1)
            r2.A0G(r0)
            return
        L98:
            r4 = r2
            goto L66
        L9a:
            java.lang.String r0 = "DevicePairRequestProtocolHelper/parseDeviceInfo/failed to parse companion props"
            com.whatsapp.util.Log.e(r0)
        L9f:
            r4 = r2
        La0:
            r10 = r8
        La1:
            X.012 r0 = r3.A06
            long r12 = r0.A05()
            if (r4 == 0) goto Ld6
            java.lang.String r11 = r4.A03
        Lab:
            r16 = 0
            X.296 r0 = r3.A01
            if (r0 == 0) goto Ld4
            int r1 = r0.A01
        Lb3:
            if (r4 == 0) goto Lbb
            boolean r0 = r4.A04
            r19 = 1
            if (r0 != 0) goto Lbd
        Lbb:
            r19 = 0
        Lbd:
            r14 = r12
            r20 = r2
            r18 = r1
            X.0JV r8 = new X.0JV
            r8.<init>(r9, r10, r11, r12, r14, r16, r18, r19, r20)
        Lc7:
            X.08q r2 = r3.A04
            r1 = 40
            java.lang.RunnableEBaseShape0S0200000_I0_0 r0 = new java.lang.RunnableEBaseShape0S0200000_I0_0
            r0.<init>(r3, r8, r1)
            r2.A0G(r0)
            return
        Ld4:
            r1 = 0
            goto Lb3
        Ld6:
            r11 = r2
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2L7.APJ(java.lang.String, X.0Ca):void");
    }
}
