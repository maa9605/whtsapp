package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.4C8  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4C8 extends C48B {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C013606n A03;
    public final C45A A04;
    public final C28S A05;
    public final C49682Lx A06;

    public C4C8(Context context, C018508q c018508q, C49682Lx c49682Lx, C0E7 c0e7, C894947f c894947f, C463026g c463026g, C013606n c013606n, C45A c45a, C28S c28s) {
        super(c463026g, c894947f.A04);
        this.A00 = context;
        this.A01 = c018508q;
        this.A06 = c49682Lx;
        this.A02 = c0e7;
        this.A03 = c013606n;
        this.A04 = c45a;
        this.A05 = c28s;
    }

    public void A00(final String str, String str2, final InterfaceC53332eX interfaceC53332eX) {
        ArrayList A0Y = C000200d.A0Y("PAY: verifyPaymentVpa called");
        A0Y.add(new C04P("action", "upi-get-vpa-name", null, (byte) 0));
        A0Y.add(new C04P("device-id", this.A06.A02(), null, (byte) 0));
        C000200d.A1A("vpa", str, A0Y);
        if (!TextUtils.isEmpty(str2)) {
            C000200d.A1A("url", str2, A0Y);
        }
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) A0Y.toArray(new C04P[0]), null, null);
        C463026g c463026g = super.A01;
        final Context context = this.A00;
        final C018508q c018508q = this.A01;
        final C0E7 c0e7 = this.A02;
        final C28S c28s = this.A05;
        c463026g.A0F("get", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4Gf
            @Override // X.C28V
            public void A02(C28Q c28q) {
                InterfaceC53332eX interfaceC53332eX2 = interfaceC53332eX;
                if (interfaceC53332eX2 != null) {
                    interfaceC53332eX2.AOF(false, false, null, null, null, false, c28q);
                }
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                InterfaceC53332eX interfaceC53332eX2 = interfaceC53332eX;
                if (interfaceC53332eX2 != null) {
                    interfaceC53332eX2.AOF(false, false, null, null, null, false, c28q);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
                if ("1".equals(r1.getString("blocked")) == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
                if ("1".equals(r1.getString("vpaValid")) == false) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
                if ("1".equals(r1.getString("verifiedMerchant")) == false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
                if ("1".equals(r1.getString("blocked")) == false) goto L40;
             */
            @Override // X.C28V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A04(X.C02590Ca r16) {
                /*
                    r15 = this;
                    java.lang.String r0 = "account"
                    r1 = r16
                    X.0Ca r4 = r1.A0D(r0)
                    if (r4 == 0) goto Lab
                    X.4Bk r3 = new X.4Bk
                    r3.<init>()
                    X.4C8 r2 = X.C4C8.this
                    X.06n r1 = r2.A03
                    r0 = 7
                    r3.A03(r1, r0, r4)
                    android.os.Bundle r0 = r3.A00
                    java.lang.String r4 = "jid"
                    r6 = 0
                    if (r0 == 0) goto La8
                    java.lang.String r0 = r0.getString(r4)
                L22:
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L43
                    X.45A r5 = r2.A04
                    java.lang.String r2 = r7
                    android.os.Bundle r1 = r3.A00
                    if (r1 == 0) goto L3f
                    java.lang.String r0 = "blocked"
                    java.lang.String r1 = r1.getString(r0)
                    java.lang.String r0 = "1"
                    boolean r1 = r0.equals(r1)
                    r0 = 1
                    if (r1 != 0) goto L40
                L3f:
                    r0 = 0
                L40:
                    r5.A05(r2, r0)
                L43:
                    X.2eX r7 = r6
                    if (r7 == 0) goto La3
                    android.os.Bundle r1 = r3.A00
                    java.lang.String r2 = "1"
                    if (r1 == 0) goto L5a
                    java.lang.String r0 = "vpaValid"
                    java.lang.String r0 = r1.getString(r0)
                    boolean r0 = r2.equals(r0)
                    r8 = 1
                    if (r0 != 0) goto L5b
                L5a:
                    r8 = 0
                L5b:
                    android.os.Bundle r1 = r3.A00
                    if (r1 == 0) goto L6c
                    java.lang.String r0 = "verifiedMerchant"
                    java.lang.String r0 = r1.getString(r0)
                    boolean r0 = r2.equals(r0)
                    r9 = 1
                    if (r0 != 0) goto L6d
                L6c:
                    r9 = 0
                L6d:
                    android.os.Bundle r1 = r3.A00
                    if (r1 == 0) goto La6
                    java.lang.String r0 = "vpaName"
                    java.lang.String r10 = r1.getString(r0)
                L77:
                    android.os.Bundle r1 = r3.A00
                    if (r1 == 0) goto La4
                    java.lang.String r0 = "vpaId"
                    java.lang.String r11 = r1.getString(r0)
                L81:
                    android.os.Bundle r0 = r3.A00
                    if (r0 == 0) goto L89
                    java.lang.String r6 = r0.getString(r4)
                L89:
                    com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.getNullable(r6)
                    android.os.Bundle r1 = r3.A00
                    if (r1 == 0) goto L9e
                    java.lang.String r0 = "blocked"
                    java.lang.String r0 = r1.getString(r0)
                    boolean r0 = r2.equals(r0)
                    r13 = 1
                    if (r0 != 0) goto L9f
                L9e:
                    r13 = 0
                L9f:
                    r14 = 0
                    r7.AOF(r8, r9, r10, r11, r12, r13, r14)
                La3:
                    return
                La4:
                    r11 = r6
                    goto L81
                La6:
                    r10 = r6
                    goto L77
                La8:
                    r0 = r6
                    goto L22
                Lab:
                    java.lang.String r0 = "PAY: IndiaUpiPayNonWaVpaAction verifyPaymentVpa: missing account node"
                    com.whatsapp.util.Log.e(r0)
                    X.2eX r0 = r6
                    if (r0 == 0) goto La3
                    r1 = 0
                    r3 = 0
                    r2 = r1
                    r4 = r3
                    r5 = r3
                    r6 = r1
                    r7 = r3
                    r0.AOF(r1, r2, r3, r4, r5, r6, r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C91774Gf.A04(X.0Ca):void");
            }
        }, 0L);
    }
}
