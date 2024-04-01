package com.whatsapp.web;

import X.C000500h;
import X.C002301c;
import X.C005102h;
import X.C01B;
import X.C0EE;
import X.C41991uq;
import android.content.BroadcastReceiver;

/* loaded from: classes2.dex */
public class WebSessionVerificationReceiver extends BroadcastReceiver {
    public C01B A00;
    public C005102h A01;
    public C000500h A02;
    public C002301c A03;
    public C0EE A04;
    public C41991uq A05;
    public final Object A06;
    public volatile boolean A07;

    public WebSessionVerificationReceiver() {
        this(0);
    }

    public WebSessionVerificationReceiver(int i) {
        this.A07 = false;
        this.A06 = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d4, code lost:
        r17.A02.A0D().putString("web_session_verification_browser_ids", null).putLong("web_session_verification_when_millis", -1).apply();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e9, code lost:
        return;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r18, android.content.Intent r19) {
        /*
            r17 = this;
            r8 = r17
            boolean r0 = r8.A07
            r13 = r18
            if (r0 != 0) goto L20
            java.lang.Object r1 = r8.A06
            monitor-enter(r1)
            boolean r0 = r8.A07     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L1b
            java.lang.Object r0 = X.AnonymousClass029.A0Y(r13)     // Catch: java.lang.Throwable -> L1d
            X.0C5 r0 = (X.C0C5) r0     // Catch: java.lang.Throwable -> L1d
            r0.A2H(r8)     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r8.A07 = r0     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L20:
            X.00h r0 = r8.A02
            android.content.SharedPreferences r0 = r0.A00
            java.lang.String r6 = "web_session_verification_browser_ids"
            r5 = 0
            java.lang.String r1 = r0.getString(r6, r5)
            if (r1 == 0) goto Leb
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            if (r0 == 0) goto Leb
            java.util.Iterator r2 = r0.iterator()
        L3d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld4
            java.lang.Object r1 = r2.next()
            X.1uq r0 = r8.A05
            if (r0 == 0) goto Lea
            if (r1 == 0) goto L3d
            java.util.Map r0 = r0.A05()
            java.lang.Object r11 = r0.get(r1)
            X.1wU r11 = (X.C42881wU) r11
            if (r11 == 0) goto L3d
            X.01B r3 = r8.A00
            X.01c r10 = r8.A03
            X.0EE r2 = r8.A04
            X.02h r7 = r8.A01
            long r0 = r11.A06
            java.lang.String r16 = X.AbstractC40621sZ.A00(r10, r0)
            X.02l r9 = X.C0DU.A00(r13)
            java.lang.String r0 = "other_notifications@1"
            r9.A0J = r0
            r0 = 2131888496(0x7f120970, float:1.9411629E38)
            java.lang.String r0 = r10.A06(r0)
            r9.A0B(r0)
            long r0 = r11.A04
            android.app.Notification r4 = r9.A07
            r4.when = r0
            r0 = 2131888496(0x7f120970, float:1.9411629E38)
            java.lang.String r0 = r10.A06(r0)
            r9.A0A(r0)
            r15 = 2131888495(0x7f12096f, float:1.9411627E38)
            r1 = 2
            java.lang.Object[] r14 = new java.lang.Object[r1]
            java.lang.String r0 = r11.A08
            r12 = 0
            r14[r12] = r0
            r4 = 1
            r14[r4] = r16
            java.lang.String r0 = r10.A0D(r15, r14)
            r9.A09(r0)
            android.content.Intent r0 = X.C20R.A00(r13, r3, r2, r12)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r13, r12, r0, r12)
            r9.A09 = r0
            X.0Np r3 = new X.0Np
            r3.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r11.A08
            r1[r12] = r0
            r1[r4] = r16
            java.lang.String r0 = r10.A0D(r15, r1)
            r3.A07(r0)
            r9.A08(r3)
            r0 = 16
            r9.A05(r0, r4)
            r1 = 2131231577(0x7f080359, float:1.8079239E38)
            android.app.Notification r0 = r9.A07
            r0.icon = r1
            r1 = 15
            android.app.Notification r0 = r9.A01()
            r7.A03(r5, r1, r0)
        Ld4:
            X.00h r0 = r8.A02
            android.content.SharedPreferences$Editor r0 = r0.A0D()
            android.content.SharedPreferences$Editor r3 = r0.putString(r6, r5)
            r1 = -1
            java.lang.String r0 = "web_session_verification_when_millis"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            r0.apply()
            return
        Lea:
            throw r5
        Leb:
            java.lang.String r0 = "WebSessionVerificationReceiver/onReceive/ browserIds are missing from prefs"
            com.whatsapp.util.Log.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.web.WebSessionVerificationReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
