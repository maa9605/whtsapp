package X;

/* renamed from: X.3yB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86733yB extends AnonymousClass258 {
    public final /* synthetic */ C25L A00;

    public C86733yB(C25L c25l) {
        this.A00 = c25l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r16.equals(r4.callWaitingInfo.A04) == false) goto L27;
     */
    @Override // X.AnonymousClass258
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(java.lang.String r16) {
        /*
            r15 = this;
            X.C000700j.A01()
            X.25L r9 = r15.A00
            android.os.Handler r0 = r9.A0K
            r5 = 28
            r0.removeMessages(r5)
            java.lang.String r1 = "voip/service/selfManagedConnectionListener/onShowIncomingCallUi "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r13 = r16
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r3 = 1
            r10 = 0
            if (r4 == 0) goto L32
            X.1Qu r0 = r4.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r0 = r13.equals(r0)
            r2 = 1
            if (r0 != 0) goto L33
        L32:
            r2 = 0
        L33:
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r4)
            if (r0 == 0) goto L6e
            boolean r0 = r4.callEnding
            if (r0 != 0) goto L6e
            java.lang.String r0 = r4.callId
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L47
            if (r2 == 0) goto L6e
        L47:
            long r0 = r9.A0C
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L6f
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r6 = r6 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r9.A0k = r0
        L5a:
            if (r2 != 0) goto L65
            com.whatsapp.jid.UserJid r11 = r4.peerJid
            boolean r12 = r4.videoEnabled
            boolean r14 = r4.isGroupCall
            r9.A0v(r10, r11, r12, r13, r14)
        L65:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L6c
            r9.A0h(r4, r3, r2)
        L6c:
            r9.A10 = r3
        L6e:
            return
        L6f:
            java.lang.String r0 = "selfManagedConnectionNewCallTs is not set"
            X.C000700j.A08(r10, r0)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86733yB.A01(java.lang.String):void");
    }
}
