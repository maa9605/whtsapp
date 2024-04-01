package X;

/* renamed from: X.20n */
/* loaded from: classes2.dex */
public class C451320n {
    public final /* synthetic */ C41711uO A00;
    public final /* synthetic */ boolean A01;

    public C451320n(C41711uO c41711uO, boolean z) {
        this.A00 = c41711uO;
        this.A01 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0072, code lost:
        if (r5 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(X.C07D r10, int r11) {
        /*
            r9 = this;
            boolean r0 = r9.A01
            if (r0 == 0) goto L13
            X.1uO r4 = r9.A00
            r3 = 1
            X.02d r2 = r4.A0I
            r1 = 6
            java.lang.RunnableEBaseShape0S0210000_I0 r0 = new java.lang.RunnableEBaseShape0S0210000_I0
            r0.<init>(r4, r10, r3, r1)
            r2.execute(r0)
            return
        L13:
            X.1uO r0 = r9.A00
            java.util.Set r3 = r0.A00
            monitor-enter(r3)
            java.util.Iterator r8 = r3.iterator()     // Catch: java.lang.Throwable -> Lc9
        L1c:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Lc7
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> Lc9
            X.1zB r4 = (X.C44501zB) r4     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r4 instanceof X.C450720h     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto Lac
            boolean r0 = r4 instanceof X.C20P     // Catch: java.lang.Throwable -> Lc9
            if (r0 != 0) goto L98
            boolean r0 = r4 instanceof X.C20Q     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto L1c
            X.20Q r4 = (X.C20Q) r4     // Catch: java.lang.Throwable -> Lc9
            java.util.Set r0 = r10.A00     // Catch: java.lang.Throwable -> Lc9
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc9
            r7 = 1
            r2 = 0
            if (r0 != r7) goto L74
            X.20R r6 = r4.A00     // Catch: java.lang.Throwable -> Lc9
            X.1uO r1 = r6.A03     // Catch: java.lang.Throwable -> Lc9
            java.util.Iterator r0 = r10.iterator()     // Catch: java.lang.Throwable -> Lc9
            X.0Jl r0 = (X.C04250Jl) r0     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Lc9
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r0.getRawString()     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lc6
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto Lc5
            X.0JV r0 = r1.A03(r0)     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto L74
            java.lang.String r5 = r0.A07     // Catch: java.lang.Throwable -> Lc9
            if (r5 == 0) goto L74
            r2 = 2131889846(0x7f120eb6, float:1.9414367E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Lc9
            r0 = 0
            r1[r0] = r5     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r5 = r6.getString(r2, r1)     // Catch: java.lang.Throwable -> Lc9
            if (r5 != 0) goto L7d
        L74:
            X.20R r6 = r4.A00     // Catch: java.lang.Throwable -> Lc9
            r0 = 2131888085(0x7f1207d5, float:1.9410795E38)
            java.lang.String r5 = r6.getString(r0)     // Catch: java.lang.Throwable -> Lc9
        L7d:
            X.0E7 r0 = r6.A02     // Catch: java.lang.Throwable -> Lc9
            boolean r1 = r0.A05()     // Catch: java.lang.Throwable -> Lc9
            r0 = 2131888364(0x7f1208ec, float:1.9411361E38)
            if (r1 == 0) goto L8b
            r0 = 2131888084(0x7f1207d4, float:1.9410793E38)
        L8b:
            java.lang.String r2 = r6.getString(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.RunnableEBaseShape0S2100000_I0 r0 = new java.lang.RunnableEBaseShape0S2100000_I0     // Catch: java.lang.Throwable -> Lc9
            r0.<init>(r4, r5, r2, r7)     // Catch: java.lang.Throwable -> Lc9
            r6.runOnUiThread(r0)     // Catch: java.lang.Throwable -> Lc9
            goto L1c
        L98:
            X.20P r4 = (X.C20P) r4     // Catch: java.lang.Throwable -> Lc9
            X.1z5 r1 = r4.A00     // Catch: java.lang.Throwable -> Lc9
            boolean r0 = r1.A04()     // Catch: java.lang.Throwable -> Lc9
            if (r0 == 0) goto L1c
            java.lang.String r0 = "SyncdDeleteAllDataApiHandler/onDeviceLogoutError"
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> Lc9
            r1.A03()     // Catch: java.lang.Throwable -> Lc9
            goto L1c
        Lac:
            X.20h r4 = (X.C450720h) r4     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = "MDOptInManager/Device_Logout_Failed/errorCode: "
            X.C000200d.A0q(r0, r11)     // Catch: java.lang.Throwable -> Lc9
            X.0Jk r1 = r4.A00     // Catch: java.lang.Throwable -> Lc9
            if (r1 == 0) goto Lbc
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lc9
            r1.A5S(r0)     // Catch: java.lang.Throwable -> Lc9
        Lbc:
            X.20l r0 = r4.A01     // Catch: java.lang.Throwable -> Lc9
            X.1uO r0 = r0.A02     // Catch: java.lang.Throwable -> Lc9
            r0.A01(r4)     // Catch: java.lang.Throwable -> Lc9
            goto L1c
        Lc5:
            throw r2     // Catch: java.lang.Throwable -> Lc9
        Lc6:
            throw r2     // Catch: java.lang.Throwable -> Lc9
        Lc7:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc9
            return
        Lc9:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C451320n.A00(X.07D, int):void");
    }
}
