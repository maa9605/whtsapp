package X;

import com.whatsapp.util.Log;

/* renamed from: X.1tZ */
/* loaded from: classes2.dex */
public class C41221tZ {
    public static volatile C41221tZ A0B;
    public final C018508q A00;
    public final C03160Eo A01;
    public final AnonymousClass012 A02;
    public final C000500h A03;
    public final C41181tV A04;
    public final C05M A05;
    public final C03340Fh A06;
    public final C0C9 A07;
    public final C03180Eq A08;
    public final C41521u3 A09;
    public final C40301ry A0A;

    public C41221tZ(AnonymousClass012 anonymousClass012, C018508q c018508q, C05M c05m, C41181tV c41181tV, C03160Eo c03160Eo, C41521u3 c41521u3, C0C9 c0c9, C03180Eq c03180Eq, C40301ry c40301ry, C000500h c000500h, C03340Fh c03340Fh) {
        this.A02 = anonymousClass012;
        this.A00 = c018508q;
        this.A05 = c05m;
        this.A04 = c41181tV;
        this.A01 = c03160Eo;
        this.A09 = c41521u3;
        this.A07 = c0c9;
        this.A08 = c03180Eq;
        this.A0A = c40301ry;
        this.A03 = c000500h;
        this.A06 = c03340Fh;
    }

    public static C41221tZ A00() {
        if (A0B == null) {
            synchronized (C41221tZ.class) {
                if (A0B == null) {
                    A0B = new C41221tZ(AnonymousClass012.A00(), C018508q.A00(), C05M.A00(), C41181tV.A00(), C03160Eo.A00(), C41521u3.A00(), C0C9.A00(), C03180Eq.A00(), C40301ry.A00(), C000500h.A00(), C03340Fh.A00);
                }
            }
        }
        return A0B;
    }

    public void A01(AbstractC005302j abstractC005302j, boolean z) {
        C41181tV c41181tV = this.A04;
        c41181tV.A0G.A01(8, abstractC005302j);
        C0IT A07 = c41181tV.A07.A07(abstractC005302j);
        if (A07 == null) {
            C000200d.A0v("msgstore/setchatunseen/nochat/", abstractC005302j);
        } else {
            StringBuilder A0T = C000200d.A0T("msgstore/setchatunseen/", abstractC005302j, "/");
            A0T.append(A07.A0H());
            Log.i(A0T.toString());
            A07.A0J(-1, 0, 0, 0);
            c41181tV.A05.A01(new RunnableEBaseShape0S0310000_I0(c41181tV, z, abstractC005302j, A07, 0), 1);
        }
        this.A06.A05(abstractC005302j);
        if (z) {
            this.A09.A07(abstractC005302j, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a7, code lost:
        if (r14 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(X.AbstractC005302j r18, boolean r19, X.AnonymousClass094 r20, java.lang.Integer r21, boolean r22) {
        /*
            r17 = this;
            r1 = r17
            X.1tV r11 = r1.A04
            r12 = r18
            boolean r0 = r11.A08(r12)
            if (r0 == 0) goto L7c
            r9 = 0
            r6 = r21
            if (r21 == 0) goto L34
            X.05M r0 = r1.A05
            X.0R3 r5 = r0.A08(r12)
            X.0Eq r0 = r1.A08
            X.092 r0 = r0.A03(r12)
            r7 = r20
            if (r0 == 0) goto L29
            X.094 r0 = r0.A0n
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L34
        L29:
            int r8 = r5.A00
            r10 = -1
            if (r8 != r10) goto L8a
            int r0 = r6.intValue()
            if (r0 != r10) goto L8a
        L34:
            r13 = r9
            r14 = 0
        L36:
            if (r22 == 0) goto L4b
            X.1ry r4 = r1.A0A
            android.os.Handler r3 = r4.A02()
            r2 = 27
            java.lang.RunnableEBaseShape3S0200000_I0_3 r0 = new java.lang.RunnableEBaseShape3S0200000_I0_3
            r0.<init>(r4, r12, r2)
            r3.post(r0)
            r4.A03()
        L4b:
            X.1ry r4 = r1.A0A
            if (r14 == 0) goto L50
            r9 = r13
        L50:
            android.os.Handler r3 = r4.A02()
            r2 = 30
            java.lang.RunnableEBaseShape0S0300000_I0_0 r0 = new java.lang.RunnableEBaseShape0S0300000_I0_0
            r0.<init>(r4, r9, r12, r2)
            r3.post(r0)
            r15 = 0
            r16 = r19
            r11.A04(r12, r13, r14, r15, r16)
            X.08q r5 = r1.A00
            r0 = 11
            java.lang.RunnableEBaseShape1S0200000_I0_1 r4 = new java.lang.RunnableEBaseShape1S0200000_I0_1
            r4.<init>(r1, r12, r0)
            r2 = 300(0x12c, double:1.48E-321)
            android.os.Handler r0 = r5.A02
            r0.postDelayed(r4, r2)
            if (r19 == 0) goto L7c
            X.1u3 r2 = r1.A09
            r0 = 1
            r2.A07(r12, r0)
        L7c:
            X.00h r3 = r1.A03
            X.012 r0 = r1.A02
            long r1 = r0.A05()
            java.lang.String r0 = "last_read_conversation_time"
            X.C000200d.A0h(r3, r0, r1)
            return
        L8a:
            java.lang.String r4 = " req="
            java.lang.String r3 = " local="
            java.lang.String r2 = "app/setConversationSeen/qr/invalid  "
            if (r8 <= 0) goto Lcb
            int r8 = r6.intValue()
            if (r8 == r10) goto Lca
            X.0C9 r0 = r1.A07
            X.05Q r0 = r0.A0H
            X.092 r13 = r0.A05(r7)
            if (r13 == 0) goto Laa
            int r14 = r5.A00
            if (r14 < r8) goto Laa
            int r14 = r14 - r8
            if (r14 != 0) goto L4b
            goto L36
        Laa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r7)
            r1.append(r3)
            int r0 = r5.A00
            r1.append(r0)
            r1.append(r4)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0)
        Lca:
            return
        Lcb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r7)
            r1.append(r3)
            int r0 = r5.A00
            r1.append(r0)
            r1.append(r4)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41221tZ.A02(X.02j, boolean, X.094, java.lang.Integer, boolean):void");
    }

    public void A03(AbstractC005302j abstractC005302j, boolean z, boolean z2) {
        A02(abstractC005302j, z, null, null, z2);
    }
}
