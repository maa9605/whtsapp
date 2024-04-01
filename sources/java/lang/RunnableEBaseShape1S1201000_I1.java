package java.lang;

/* loaded from: classes2.dex */
public class RunnableEBaseShape1S1201000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableEBaseShape1S1201000_I1(Object obj, Object obj2, String str, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A00 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A04
            switch(r0) {
                case 0: goto L72;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r8 = r10.A01
            X.3d1 r8 = (X.C74293d1) r8
            java.lang.Object r1 = r10.A02
            byte[] r1 = (byte[]) r1
            java.lang.String r9 = r10.A03
            int r7 = r10.A00
            X.01J r0 = r8.A07
            X.04r r0 = r0.A08
            int r6 = r0.A02()
            r5 = 1
            if (r1 == 0) goto L63
            int r4 = X.AnonymousClass029.A08(r1)
            java.lang.String r1 = "voip/encryption/onE2EDecryptionFailed.  message.id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r3 = "; serverRegistrationId="
            r0.append(r3)
            r0.append(r4)
            java.lang.String r2 = "; localRegistrationId="
            r0.append(r2)
            X.C000200d.A1F(r0, r6)
            if (r4 == r6) goto L63
            java.lang.String r1 = "voip/encryption/onE2EDecryptionFailed registration id received did not match local; message.id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            r0.append(r3)
            r0.append(r4)
            r0.append(r2)
            X.C000200d.A1F(r0, r6)
            r0 = 1
        L54:
            java.lang.String r1 = "voip/encryption/onE2EDecryptionFailed reject at retry: "
            if (r0 == 0) goto L65
            java.lang.String r0 = " sending local pre keys to server; localRegistrationId="
            X.C000200d.A0t(r1, r7, r0, r6)
            X.0E4 r0 = r8.A02
            r0.A01()
            return
        L63:
            r0 = 0
            goto L54
        L65:
            if (r7 <= r5) goto L5
            java.lang.String r0 = " sending get prekey digest; localRegistrationId="
            X.C000200d.A0t(r1, r7, r0, r6)
            X.0E4 r0 = r8.A02
            r0.A03()
            return
        L72:
            java.lang.Object r0 = r10.A01
            X.3lb r0 = (X.C79403lb) r0
            java.lang.Object r3 = r10.A02
            X.23w r3 = (X.InterfaceC458223w) r3
            java.lang.String r2 = r10.A03
            int r1 = r10.A00
            boolean r0 = r0.A03
            r3.ALI(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape1S1201000_I1.run():void");
    }
}
