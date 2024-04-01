package X;

import android.text.TextUtils;

/* renamed from: X.0GR */
/* loaded from: classes.dex */
public class C0GR {
    public static volatile C0GR A06;
    public InterfaceC013706o A00;
    public C03650Gn A01;
    public boolean A02;
    public final C000500h A03;
    public final C0GS A04;
    public final C014406v A05 = C014406v.A00("PaymentsCountryManager", "infra", "COMMON");

    public C0GR(C000500h c000500h, C0GS c0gs) {
        this.A03 = c000500h;
        this.A04 = c0gs;
    }

    public static C0GR A00() {
        if (A06 == null) {
            synchronized (C0GR.class) {
                if (A06 == null) {
                    A06 = new C0GR(C000500h.A00(), C0GS.A00);
                }
            }
        }
        return A06;
    }

    public synchronized InterfaceC013706o A01() {
        if (!this.A02) {
            A03();
        }
        return this.A00;
    }

    public synchronized C03650Gn A02() {
        if (!this.A02) {
            A03();
        }
        return this.A01;
    }

    public final synchronized void A03() {
        C014406v c014406v = this.A05;
        c014406v.A03("tryInitFromMock: no mockedCountry");
        C000500h c000500h = this.A03;
        String A0H = c000500h.A0H();
        String A0J = c000500h.A0J();
        if (!TextUtils.isEmpty(A0J) && !TextUtils.isEmpty(A0H)) {
            C03650Gn A01 = C03650Gn.A01(A0H);
            if (A01 == C03650Gn.A0F) {
                StringBuilder sb = new StringBuilder();
                sb.append("not enabled with unsupported country code: ");
                sb.append(A0H);
                c014406v.A03(sb.toString());
                this.A01 = null;
                this.A00 = null;
            } else {
                String str = A01.A02;
                InterfaceC013706o interfaceC013706o = C03650Gn.A00(str).A09;
                if (interfaceC013706o == C013806p.A06) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("not enabled; could not find default currency with country code: ");
                    sb2.append(str);
                    c014406v.A03(sb2.toString());
                    this.A01 = null;
                    this.A00 = null;
                } else {
                    this.A01 = A01;
                    this.A00 = interfaceC013706o;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("init enabled for country: ");
                    sb3.append(str);
                    sb3.append(" and default currency: ");
                    sb3.append(interfaceC013706o.A9K());
                    c014406v.A07(null, sb3.toString(), null);
                }
            }
            this.A02 = true;
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("phoneNumber:");
            sb4.append(A0J);
            sb4.append(" countryCode:");
            sb4.append(A0H);
            c014406v.A07(null, sb4.toString(), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0013, code lost:
        if (r1.A0B == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean A04() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A02     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L8
            r2.A03()     // Catch: java.lang.Throwable -> L18
        L8:
            X.0Gn r1 = r2.A01     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L15
            X.06o r0 = r2.A00     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L15
            boolean r1 = r1.A0B     // Catch: java.lang.Throwable -> L18
            r0 = 1
            if (r1 != 0) goto L16
        L15:
            r0 = 0
        L16:
            monitor-exit(r2)
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0GR.A04():boolean");
    }
}
