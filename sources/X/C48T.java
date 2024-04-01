package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.48T  reason: invalid class name */
/* loaded from: classes3.dex */
public class C48T {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C28S A03;
    public final C463026g A04;
    public final C895947p A05;
    public final C48R A06;
    public final C899048w A07;
    public final AnonymousClass499 A08;
    public final C49B A09;
    public final C49682Lx A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;

    public C48T(AnonymousClass012 anonymousClass012, Context context, C018508q c018508q, C895947p c895947p, C49682Lx c49682Lx, C0E7 c0e7, AnonymousClass499 anonymousClass499, C463026g c463026g, C28S c28s, C899048w c899048w, String str, List list, String str2, String str3) {
        C000700j.A06((TextUtils.isEmpty(str2) ^ true) == (TextUtils.isEmpty(str3) ^ true));
        this.A00 = context;
        this.A01 = c018508q;
        this.A05 = c895947p;
        this.A0A = c49682Lx;
        this.A02 = c0e7;
        this.A08 = anonymousClass499;
        this.A04 = c463026g;
        this.A03 = c28s;
        this.A07 = c899048w;
        this.A09 = new C49B(anonymousClass012, c463026g);
        this.A06 = new C48R(context, c018508q, c0e7, c463026g, c28s, c899048w, "PIN");
        this.A0B = "BR";
        this.A0C = str;
        this.A0F = list;
        this.A0D = str2;
        this.A0E = str3;
    }

    public final void A00(final C49A c49a, String str, final C77743ih c77743ih) {
        C895947p c895947p = this.A05;
        List list = this.A0F;
        InterfaceC895847o interfaceC895847o = new InterfaceC895847o() { // from class: X.4CP
            @Override // X.InterfaceC895847o
            public void AJs(C28Q c28q) {
                C77743ih c77743ih2 = c77743ih;
                if (c77743ih2 != null) {
                    c77743ih2.A00(c28q);
                }
            }

            @Override // X.InterfaceC895847o
            public void APL(String[] strArr) {
                final C48T c48t = C48T.this;
                C463026g c463026g = c48t.A04;
                C04P[] c04pArr = {new C04P("action", "reset-payment-pin", null, (byte) 0), new C04P("country", c48t.A0B, null, (byte) 0), new C04P("token", strArr[0], null, (byte) 0), new C04P("credential-id", c48t.A0C, null, (byte) 0), new C04P("device-id", c48t.A0A.A02(), null, (byte) 0)};
                C49B c49b = c48t.A09;
                final C49A c49a2 = c49a;
                C02590Ca c02590Ca = new C02590Ca("account", c04pArr, c49a2.A00(C49B.A00("RESET", null, null, c49b.A00.A05() / 1000, strArr[1], null, new Object[0])));
                final C77743ih c77743ih2 = c77743ih;
                final Context context = c48t.A00;
                final C018508q c018508q = c48t.A01;
                final C0E7 c0e7 = c48t.A02;
                final C28S c28s = c48t.A03;
                c463026g.A0F("set", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4Gr
                    @Override // X.C28V
                    public void A02(C28Q c28q) {
                        C77743ih c77743ih3 = c77743ih2;
                        if (c77743ih3 != null) {
                            c77743ih3.A00(c28q);
                        }
                    }

                    @Override // X.C28V
                    public void A03(C28Q c28q) {
                        C77743ih c77743ih3 = c77743ih2;
                        if (c77743ih3 != null) {
                            c77743ih3.A00(c28q);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
                    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
                    @Override // X.C28V
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void A04(X.C02590Ca r5) {
                        /*
                            r4 = this;
                            java.lang.String r0 = "account"
                            X.0Ca r0 = r5.A0D(r0)
                            if (r0 == 0) goto L2d
                            X.28Q r3 = X.C28Q.A00(r0)
                            if (r3 == 0) goto L2e
                            int r1 = r3.A00
                            if (r1 == 0) goto L2e
                            r0 = 1448(0x5a8, float:2.029E-42)
                            if (r1 != r0) goto L25
                            X.48T r0 = X.C48T.this
                            X.48w r2 = r0.A07
                            X.49A r0 = r7
                            X.3i3 r0 = r0.A00
                            java.lang.String r1 = r0.A05
                            java.lang.String r0 = "PIN"
                            r2.A04(r1, r0, r3)
                        L25:
                            X.3ih r0 = r6
                            if (r0 == 0) goto L2c
                            r0.A00(r3)
                        L2c:
                            return
                        L2d:
                            r3 = 0
                        L2e:
                            X.48T r0 = X.C48T.this
                            X.499 r2 = r0.A08
                            r2.A02()
                            r0 = 0
                            r2.A03(r0)
                            goto L25
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C91884Gr.A04(X.0Ca):void");
                    }
                }, 30000L);
            }
        };
        if (c895947p != null) {
            final C895647m c895647m = new C895647m(2, interfaceC895847o);
            if ("token".equals(c49a.A00.A03)) {
                InterfaceC002901k interfaceC002901k = c895947p.A05;
                C2OR c2or = c895947p.A03;
                C0EU c0eu = c895947p.A01;
                C49692Lz c49692Lz = c895947p.A04;
                C0E7 c0e7 = c895947p.A00;
                C463026g c463026g = c895947p.A02;
                interfaceC002901k.ARy(new C4GL(c2or, c0eu, c49692Lz, c0e7, c463026g, list, null, 0, c895647m), new Void[0]);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0FK("fbpay_pin", str));
                interfaceC002901k.ARy(new C4GL(c2or, c0eu, c49692Lz, c0e7, c463026g, arrayList, null, 1, c895647m), new Void[0]);
                return;
            }
            c895647m.A00(1, str);
            c895947p.A05.ARy(new C4GL(c895947p.A03, c895947p.A01, c895947p.A04, c895947p.A00, c895947p.A02, list, new InterfaceC895747n() { // from class: X.4Bt
                @Override // X.InterfaceC895747n
                public void AJs(C28Q c28q) {
                    C895647m c895647m2 = C895647m.this;
                    if (c895647m2.A01.compareAndSet(false, true)) {
                        c895647m2.A02.decrementAndGet();
                        c895647m2.A00.AJs(c28q);
                    }
                }

                @Override // X.InterfaceC895747n
                public void API(String str2) {
                    C895647m.this.A00(0, str2);
                }
            }, -1, null), new Void[0]);
            return;
        }
        throw null;
    }
}
