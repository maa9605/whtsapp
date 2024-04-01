package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.47r */
/* loaded from: classes3.dex */
public class C896147r {
    public final Context A00;
    public final C018508q A01;
    public final C02L A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C013606n A05;
    public final C47Y A06;
    public final C28S A07;
    public final C463026g A08;
    public final C0DV A09;
    public final InterfaceC896047q A0A;
    public final C48z A0B;

    public C896147r(AnonymousClass012 anonymousClass012, Context context, C018508q c018508q, C02L c02l, C0DV c0dv, C0E7 c0e7, C463026g c463026g, C48z c48z, C013606n c013606n, C47Y c47y, C28S c28s, InterfaceC896047q interfaceC896047q) {
        this.A04 = anonymousClass012;
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A09 = c0dv;
        this.A03 = c0e7;
        this.A08 = c463026g;
        this.A0B = c48z;
        this.A05 = c013606n;
        this.A06 = c47y;
        this.A07 = c28s;
        this.A0A = interfaceC896047q;
    }

    public void A00(final C0N7 c0n7) {
        C92224Ib c92224Ib = (C92224Ib) c0n7.A06;
        if (c92224Ib != null) {
            if (TextUtils.isEmpty(c92224Ib.A06)) {
                new C48L(this.A00, this.A01, this.A03, this.A08, this.A07, new C48K() { // from class: X.3hp
                    {
                        C896147r.this = this;
                    }

                    @Override // X.C48K
                    public final void AOC(String str, C28Q c28q) {
                        C896147r.this.A03(c0n7, str);
                    }
                }).A00(c0n7.A07);
                return;
            } else {
                A02(c0n7);
                return;
            }
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* renamed from: A01 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(X.C0N7 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "PAY: BrazilDeviceBindingAction starts to bind device"
            java.util.ArrayList r3 = X.C000200d.A0Y(r0)
            java.lang.String r5 = "action"
            java.lang.String r1 = "br-bind-network-token"
            r2 = 0
            r4 = 0
            X.04P r0 = new X.04P
            r0.<init>(r5, r1, r2, r4)
            r3.add(r0)
            java.lang.String r5 = r15.A07
            java.lang.String r1 = "credential-id"
            X.04P r0 = new X.04P
            r0.<init>(r1, r5, r2, r4)
            r3.add(r0)
            r9 = r14
            X.012 r8 = r14.A04
            X.02L r5 = r14.A02
            byte[] r0 = X.C05V.A03(r8, r5, r4)
            if (r0 == 0) goto Le6
            java.lang.String r7 = X.C02A.A03(r0)
            java.lang.String r0 = "client-reference-id"
            X.C000200d.A1A(r0, r7, r3)
            X.48z r1 = r14.A0B
            int r0 = r15.A01
            java.lang.String r6 = r1.A01(r0)
            java.lang.String r0 = "device-id"
            X.C000200d.A1A(r0, r6, r3)
            byte[] r0 = X.C05V.A03(r8, r5, r4)
            if (r0 == 0) goto Le5
            java.lang.String r1 = X.C02A.A03(r0)
            java.lang.String r0 = "nonce"
            X.C000200d.A1A(r0, r1, r3)
            X.47Y r5 = r14.A06
            java.lang.String r8 = r5.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L9a
            java.lang.String r0 = "C=US,ST=California,L=Menlo Park,O=Facebook,OU=WhatsApp,CN="
            java.lang.String r1 = X.C000200d.A0H(r0, r6)
            com.whatsapp.wamsys.JniBridge r0 = r5.A03
            byte[] r8 = r8.getBytes()
            byte[] r1 = r1.getBytes()
            if (r0 == 0) goto Le4
            r0 = 5
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r0, r8, r1)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L9a
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            java.lang.String r0 = "\u0000"
            java.lang.String[] r0 = r1.split(r0)
            r1 = r0[r4]
        L84:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "device-csr"
            X.C000200d.A1A(r0, r1, r3)
        L8f:
            X.0N0 r0 = r15.A06
            X.4Ib r0 = (X.C92224Ib) r0
            if (r0 == 0) goto Le3
            java.lang.String r0 = r0.A06
            if (r5 == 0) goto Le2
            goto L9c
        L9a:
            r1 = r2
            goto L84
        L9c:
            java.lang.String r1 = r5.A05(r6, r4)     // Catch: org.json.JSONException -> La9
            java.lang.String r0 = X.C47Y.A01(r6, r7, r0)     // Catch: org.json.JSONException -> La9
            java.lang.String r1 = r5.A04(r1, r0)     // Catch: org.json.JSONException -> La9
            goto Lb0
        La9:
            r1 = move-exception
            java.lang.String r0 = "PAY: generateDeviceBindingJwsToken threw creating json string: "
            com.whatsapp.util.Log.w(r0, r1)
            r1 = r2
        Lb0:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "jws-token"
            X.C000200d.A1A(r0, r1, r3)
        Lbb:
            X.04P[] r0 = new X.C04P[r4]
            java.lang.Object[] r1 = r3.toArray(r0)
            X.04P[] r1 = (X.C04P[]) r1
            java.lang.String r0 = "account"
            X.0Ca r3 = new X.0Ca
            r3.<init>(r0, r1, r2, r2)
            X.26g r1 = r14.A08
            android.content.Context r10 = r14.A00
            X.08q r11 = r14.A01
            X.0E7 r12 = r14.A03
            X.28S r13 = r14.A07
            X.4GN r8 = new X.4GN
            r8.<init>(r10, r11, r12, r13)
            r5 = 0
            java.lang.String r2 = "set"
            r4 = r8
            r1.A0F(r2, r3, r4, r5)
            return
        Le2:
            throw r2
        Le3:
            throw r2
        Le4:
            throw r2
        Le5:
            throw r2
        Le6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C896147r.A02(X.0N7):void");
    }

    public void A03(final C0N7 c0n7, String str) {
        C92224Ib c92224Ib = (C92224Ib) c0n7.A06;
        if (TextUtils.isEmpty(str) || c92224Ib == null) {
            this.A0A.AJL(null, null, new C28Q());
            return;
        }
        c92224Ib.A06 = str;
        this.A09.A01().A02(c0n7, new C28N() { // from class: X.3hq
            {
                C896147r.this = this;
            }

            @Override // X.C28N
            public final void AH2(List list) {
                C896147r.this.A02(c0n7);
            }
        });
    }
}
