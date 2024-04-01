package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2y6  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2y6 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0OC A02;
    public final /* synthetic */ AbstractC005302j A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ AnonymousClass273 A05;
    public final /* synthetic */ C010805j A06;
    public final /* synthetic */ C04420Kc A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ C2y6(AnonymousClass273 anonymousClass273, AbstractC005302j abstractC005302j, DeviceJid deviceJid, int i, C010805j c010805j, C0OC c0oc, long j, C04420Kc c04420Kc, String str) {
        this.A05 = anonymousClass273;
        this.A03 = abstractC005302j;
        this.A04 = deviceJid;
        this.A00 = i;
        this.A06 = c010805j;
        this.A02 = c0oc;
        this.A01 = j;
        this.A07 = c04420Kc;
        this.A08 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
        if (r0 == 0) goto L9;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r20 = this;
            r2 = r20
            X.273 r13 = r2.A05
            X.02j r4 = r2.A03
            com.whatsapp.jid.DeviceJid r3 = r2.A04
            int r15 = r2.A00
            X.05j r11 = r2.A06
            X.0OC r10 = r2.A02
            long r0 = r2.A01
            X.0Kc r14 = r2.A07
            java.lang.String r2 = r2.A08
            java.lang.String r5 = "RecvLocationMessageListener/onFinalLocationNotification/axolotl received a location notification; jid="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r4)
            java.lang.String r5 = "senderJid="
            r6.append(r5)
            r6.append(r3)
            java.lang.String r5 = "; retryCount="
            r6.append(r5)
            r6.append(r15)
            java.lang.String r5 = r6.toString()
            com.whatsapp.util.Log.i(r5)
            X.0IO r8 = X.C002701i.A0T(r3)
            int r5 = r11.A00
            r7 = -1008(0xfffffffffffffc10, float:NaN)
            r6 = -1005(0xfffffffffffffc13, float:NaN)
            r12 = 1
            r9 = 3
            if (r5 != r9) goto L91
            X.0Zq r5 = X.C0Zq.A00
            java.lang.String r5 = r5.getRawString()
            X.0QS r9 = new X.0QS
            r9.<init>(r5, r8)
            X.01J r5 = r13.A04
            byte[] r8 = r11.A02
            X.1Nd r8 = r5.A06(r9, r8, r10)
            int r9 = r8.A00
            if (r9 == 0) goto L81
            java.lang.String r8 = "axolotl error while decrypt-group-using-fast-fatchet; status="
            X.C000200d.A0r(r8, r9)
            r8 = -1001(0xfffffffffffffc17, float:NaN)
            if (r9 != r8) goto L87
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L81
        L69:
            X.04r r0 = r5.A08
            int r16 = r0.A02()
            X.08q r0 = r13.A01
            r19 = r2
            r18 = r3
            r17 = r4
            X.2y7 r12 = new X.2y7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            android.os.Handler r0 = r0.A02
            r0.post(r12)
        L81:
            X.0EG r0 = r13.A08
            r0.A0L(r14)
            return
        L87:
            if (r9 == r6) goto L8b
            if (r9 != r7) goto L81
        L8b:
            java.lang.String r0 = "axolotl|should try to send retry"
            com.whatsapp.util.Log.w(r0)
            goto L69
        L91:
            if (r5 != 0) goto Lb8
            X.01J r5 = r13.A04
            byte[] r0 = r11.A02
            X.1Nd r0 = r5.A04(r8, r0, r10)
        L9b:
            if (r0 == 0) goto L81
            int r1 = r0.A00
            if (r1 == 0) goto L81
            java.lang.String r0 = "axolotl error; status="
            X.C000200d.A0r(r0, r1)
            if (r1 == r6) goto Lb2
            if (r1 == r7) goto Lb2
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            if (r1 == r0) goto Lb2
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r1 != r0) goto L81
        Lb2:
            java.lang.String r0 = "axolotl|should try to send retry; status="
            X.C000200d.A0r(r0, r1)
            goto L69
        Lb8:
            if (r5 != r12) goto Lc3
            X.01J r5 = r13.A04
            byte[] r0 = r11.A02
            X.1Nd r0 = r5.A05(r8, r0, r10)
            goto L9b
        Lc3:
            java.lang.String r0 = "RecvLocationMessageListener/onFinalLocationNotification/axolotl unrecognized ciphertext type; stanzaKey="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r14)
            java.lang.String r0 = "; type="
            r1.append(r0)
            X.C000200d.A1G(r1, r5)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2y6.run():void");
    }
}
