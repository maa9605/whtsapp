package X;

import com.whatsapp.util.Log;

/* renamed from: X.2JX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2JX implements InterfaceC010405f {
    public final C018508q A00;
    public final C2JW A01;
    public final C05Y A02;
    public final C70683Tf A03 = new C70683Tf();

    public C2JX(C018508q c018508q, C05Y c05y, C2JW c2jw) {
        this.A00 = c018508q;
        this.A02 = c05y;
        this.A01 = c2jw;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        this.A00.A0G(new RunnableEBaseShape5S0100000_I0_5(this.A01, 9));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("GetCTWAContextIQ/response-error");
        C02590Ca A0D = c02590Ca.A0D("error");
        if (A0D != null) {
            this.A00.A0G(new RunnableEBaseShape0S0101000_I0(this, A0D.A05("code", 0), 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // X.InterfaceC010405f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void APJ(java.lang.String r12, X.C02590Ca r13) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            X.0Ca r4 = r13.A0D(r0)
            if (r4 == 0) goto L94
            java.lang.String r0 = "headline"
            java.lang.String r6 = X.C70683Tf.A00(r4, r0)
            java.lang.String r0 = "body"
            java.lang.String r7 = X.C70683Tf.A00(r4, r0)
            java.lang.String r0 = "source"
            X.0Ca r1 = r4.A0D(r0)
            java.lang.String r3 = "url"
            r10 = 0
            if (r1 == 0) goto L94
            java.lang.String r0 = "id"
            java.lang.String r5 = X.C70683Tf.A00(r1, r0)
            java.lang.String r0 = "type"
            java.lang.String r2 = X.C70683Tf.A00(r1, r0)
            java.lang.String r1 = X.C70683Tf.A00(r1, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L94
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L94
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L94
            X.3Tb r8 = new X.3Tb
            r8.<init>(r5, r2, r1)
            java.lang.String r0 = "thumbnail"
            X.0Ca r2 = r4.A0D(r0)
            if (r2 == 0) goto L92
            java.lang.String r1 = X.C70683Tf.A00(r2, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L92
            java.lang.String r0 = "bytes"
            X.0Ca r0 = r2.A0D(r0)
            if (r0 == 0) goto L90
            byte[] r0 = r0.A01
        L62:
            X.3Tc r9 = new X.3Tc
            r9.<init>(r1, r0)
        L67:
            java.lang.String r0 = "video"
            X.0Ca r0 = r4.A0D(r0)
            if (r0 == 0) goto L7e
            java.lang.String r1 = X.C70683Tf.A00(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7e
            X.3Td r10 = new X.3Td
            r10.<init>(r1)
        L7e:
            X.3Te r5 = new X.3Te
            r5.<init>(r6, r7, r8, r9, r10)
            X.08q r2 = r11.A00
            r1 = 42
            java.lang.RunnableEBaseShape3S0200000_I0_3 r0 = new java.lang.RunnableEBaseShape3S0200000_I0_3
            r0.<init>(r11, r5, r1)
            r2.A0G(r0)
            return
        L90:
            r0 = r10
            goto L62
        L92:
            r9 = r10
            goto L67
        L94:
            java.lang.String r1 = "GetCTWAContextIQ/onSuccess corrupted-response context iq="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
            X.08q r2 = r11.A00
            r1 = 8
            java.lang.RunnableEBaseShape5S0100000_I0_5 r0 = new java.lang.RunnableEBaseShape5S0100000_I0_5
            r0.<init>(r11, r1)
            r2.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2JX.APJ(java.lang.String, X.0Ca):void");
    }
}
