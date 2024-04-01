package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4C5  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4C5 extends C48B {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C28S A03;
    public final C49682Lx A04;

    public C4C5(Context context, C018508q c018508q, C3NV c3nv, C49682Lx c49682Lx, C0E7 c0e7, C463026g c463026g, C28S c28s) {
        super(c463026g, c3nv);
        this.A00 = context;
        this.A01 = c018508q;
        this.A04 = c49682Lx;
        this.A02 = c0e7;
        this.A03 = c28s;
    }

    public static final void A00(List list, C894647c c894647c, AnonymousClass093 anonymousClass093, String str) {
        C4GJ c4gj = (C4GJ) anonymousClass093.A09;
        C894547b c894547b = c4gj.A06;
        if (c894547b != null) {
            long j = c894547b.A01;
            if (j > 0) {
                list.add(new C04P("start-ts", j / 1000));
            }
            long j2 = c894547b.A00;
            if (j2 > 0) {
                list.add(new C04P("end-ts", j2 / 1000));
            }
            String str2 = c894547b.A05;
            if (str2 != null) {
                list.add(new C04P("amount-rule", str2, null, (byte) 0));
            }
            String str3 = c894547b.A09;
            if (str3 != null) {
                list.add(new C04P("original-amount", str3, null, (byte) 0));
            }
            String str4 = c894547b.A07;
            if (str4 != null) {
                list.add(new C04P("mandate-info", str4, null, (byte) 0));
            }
            String str5 = c894547b.A04;
            if (str5 != null) {
                list.add(new C04P("frequency-rule", str5, null, (byte) 0));
            }
            list.add(new C04P("is-revocable", c894547b.A0B ? "1" : "0", null, (byte) 0));
            if (str != null) {
                list.add(new C04P("seq-no", str, null, (byte) 0));
            } else {
                String str6 = c4gj.A0D;
                if (str6 != null) {
                    list.add(new C04P("seq-no", str6, null, (byte) 0));
                }
            }
            if (c894647c == null || !c894647c.A00() || TextUtils.isEmpty(c894647c.A06)) {
                return;
            }
            list.add(new C04P("mandate-update-info", c894647c.A06, null, (byte) 0));
            return;
        }
        throw null;
    }

    public void A01(AnonymousClass093 anonymousClass093, C894647c c894647c, final C3NS c3ns) {
        ArrayList A0Y = C000200d.A0Y("PAY: rejectPayeeMandate called");
        C000200d.A1A("action", "upi-reject-mandate-request", A0Y);
        A02(A0Y, anonymousClass093);
        A00(A0Y, c894647c, anonymousClass093, null);
        final C3NV c3nv = super.A00;
        if (c3nv != null) {
            c3nv.A04("upi-reject-mandate-request");
        }
        C02590Ca[] A03 = A03(anonymousClass093);
        C463026g c463026g = super.A01;
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) A0Y.toArray(new C04P[0]), A03, null);
        final Context context = this.A00;
        final C018508q c018508q = this.A01;
        final C0E7 c0e7 = this.A02;
        final C28S c28s = this.A03;
        c463026g.A0F("set", c02590Ca, new C91754Gd(context, c018508q, c0e7, c28s, c3nv) { // from class: X.4IN
            @Override // X.C91754Gd, X.C28V
            public void A02(C28Q c28q) {
                super.A02(c28q);
                C3NS c3ns2 = c3ns;
                if (c3ns2 != null) {
                    c3ns2.ANl(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A03(C28Q c28q) {
                super.A03(c28q);
                C3NS c3ns2 = c3ns;
                if (c3ns2 != null) {
                    c3ns2.ANl(c28q);
                }
            }

            @Override // X.C91754Gd, X.C28V
            public void A04(C02590Ca c02590Ca2) {
                super.A04(c02590Ca2);
                C3NS c3ns2 = c3ns;
                if (c3ns2 != null) {
                    c3ns2.ANl(null);
                }
            }
        }, 0L);
    }

    public final void A02(List list, AnonymousClass093 anonymousClass093) {
        list.add(new C04P("id", anonymousClass093.A0I, null, (byte) 0));
        list.add(new C04P("device-id", this.A04.A02(), null, (byte) 0));
        C014006r c014006r = anonymousClass093.A07;
        if (c014006r != null) {
            list.add(new C04P("amount", c014006r.toString(), null, (byte) 0));
            C4GJ c4gj = (C4GJ) anonymousClass093.A09;
            if (c4gj != null) {
                C894547b c894547b = c4gj.A06;
                if (c894547b != null) {
                    list.add(new C04P("sender-vpa", c4gj.A0B, null, (byte) 0));
                    if (!TextUtils.isEmpty(c4gj.A0C)) {
                        list.add(new C04P("sender-vpa-id", c4gj.A0C, null, (byte) 0));
                    }
                    list.add(new C04P("receiver-vpa", c4gj.A09, null, (byte) 0));
                    if (!TextUtils.isEmpty(c4gj.A0A)) {
                        list.add(new C04P("receiver-vpa-id", c4gj.A0A, null, (byte) 0));
                    }
                    if (TextUtils.isEmpty(c894547b.A08)) {
                        return;
                    }
                    list.add(new C04P("mandate-no", c894547b.A08, null, (byte) 0));
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C02590Ca[] A03(X.AnonymousClass093 r12) {
        /*
            r11 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0K8 r0 = r12.A09
            if (r0 == 0) goto L94
            X.27p r1 = r0.A00
            if (r1 == 0) goto L94
            X.26g r5 = r11.A01
            int r0 = r1.A01()
            long r7 = (long) r0
            int r9 = r1.A00
            X.06o r10 = r1.A01
            java.lang.String r6 = "amount"
            X.0Ca r0 = r5.A04(r6, r7, r9, r10)
        L1e:
            if (r0 == 0) goto L23
            r4.add(r0)
        L23:
            X.0K8 r0 = r12.A09
            X.4GJ r0 = (X.C4GJ) r0
            X.47b r1 = r0.A06
            if (r1 == 0) goto La2
            X.27p r0 = r1.A02
            if (r0 == 0) goto L54
            X.26g r5 = r11.A01
            int r0 = r0.A01()
            long r7 = (long) r0
            X.27p r0 = r1.A02
            int r9 = r0.A00
            X.06o r10 = r0.A01
            java.lang.String r6 = "original-amount"
            X.0Ca r0 = r5.A04(r6, r7, r9, r10)
        L42:
            if (r0 == 0) goto L47
            r4.add(r0)
        L47:
            int r0 = r4.size()
            X.0Ca[] r0 = new X.C02590Ca[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.0Ca[] r0 = (X.C02590Ca[]) r0
            return r0
        L54:
            java.lang.String r0 = r1.A09
            if (r0 == 0) goto L47
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r0)
            X.06o r0 = X.C013806p.A05
            int r2 = r0.A9i()
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            int r1 = r3.compareTo(r0)
            r0 = 0
            if (r1 < 0) goto L6d
            r0 = 1
        L6d:
            X.C000700j.A07(r0)
            r0 = 6
            java.math.BigDecimal r2 = r3.setScale(r2, r0)
            X.26g r5 = r11.A01
            X.06o r10 = X.C013806p.A05
            X.0DX r1 = r5.A02(r10)
            java.lang.String r0 = r10.A9K()
            int r9 = r1.A9N(r0)
            double r2 = r2.doubleValue()
            double r0 = (double) r9
            double r2 = r2 * r0
            int r0 = (int) r2
            long r7 = (long) r0
            java.lang.String r6 = "original-amount"
            X.0Ca r0 = r5.A04(r6, r7, r9, r10)
            goto L42
        L94:
            X.06r r2 = r12.A07
            if (r2 == 0) goto L23
            X.26g r1 = r11.A01
            X.06o r0 = X.C013806p.A05
            X.0Ca r0 = r1.A03(r2, r0)
            goto L1e
        La2:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4C5.A03(X.093):X.0Ca[]");
    }
}
