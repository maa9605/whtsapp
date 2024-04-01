package X;

import android.text.TextUtils;

/* renamed from: X.4EY  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4EY implements InterfaceC03640Gm, InterfaceC899549c {
    public InterfaceC28001Pq A00;
    public C0DV A01;
    public C4EW A02;
    public final ActivityC02270An A03;
    public final C03090Ed A04;
    public final C0GZ A05;
    public final C03550Gd A06;
    public final C42021ut A07;
    public final C0EU A08;
    public final C0EX A09;
    public final C463026g A0A;
    public final C28O A0B;
    public final C28021Ps A0D;
    public final InterfaceC002901k A0E;
    public final boolean A0G;
    public final C014406v A0C = C014406v.A00("PaymentDataPresenter", "payment", "COMMON");
    public final boolean A0F = true;

    public C4EY(ActivityC02270An activityC02270An, InterfaceC002901k interfaceC002901k, C0DV c0dv, C28021Ps c28021Ps, C0EU c0eu, C0GZ c0gz, C463026g c463026g, C28O c28o, C03550Gd c03550Gd, C0EX c0ex, C03090Ed c03090Ed, C42021ut c42021ut, boolean z) {
        this.A03 = activityC02270An;
        this.A0E = interfaceC002901k;
        this.A0D = c28021Ps;
        this.A01 = c0dv;
        this.A08 = c0eu;
        this.A05 = c0gz;
        this.A0A = c463026g;
        this.A0B = c28o;
        this.A06 = c03550Gd;
        this.A09 = c0ex;
        this.A04 = c03090Ed;
        this.A07 = c42021ut;
        this.A0G = z;
    }

    public synchronized void A00(boolean z) {
        try {
            C4EW c4ew = this.A02;
            if (c4ew != null) {
                c4ew.A05(true);
            }
            ActivityC02270An activityC02270An = this.A03;
            InterfaceC002901k interfaceC002901k = this.A0E;
            C4EW c4ew2 = new C4EW(activityC02270An, interfaceC002901k, this.A01, this.A0D, this.A04, this.A07, this.A0F, this.A0G, z);
            this.A02 = c4ew2;
            interfaceC002901k.ARy(c4ew2, new Void[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        if ((r1.A01.A05() - r1.A04().getLong("payments_methods_last_sync_time", 0)) > java.util.concurrent.TimeUnit.HOURS.toMillis(1)) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(boolean r8, boolean r9) {
        /*
            r7 = this;
            boolean r3 = r7.A0G
            if (r3 == 0) goto L10
            X.4EX r1 = new X.4EX
            r1.<init>()
            r7.A00 = r1
            X.0EX r0 = r7.A09
            r0.A01(r1)
        L10:
            X.0GZ r0 = r7.A05
            boolean r0 = r0.A09()
            if (r0 != 0) goto L20
            X.0Gd r0 = r7.A06
            boolean r0 = r0.A09()
            if (r0 == 0) goto L53
        L20:
            if (r9 != 0) goto L43
            X.0EU r1 = r7.A08
            X.012 r0 = r1.A01
            long r5 = r0.A05()
            android.content.SharedPreferences r4 = r1.A04()
            r1 = 0
            java.lang.String r0 = "payments_methods_last_sync_time"
            long r0 = r4.getLong(r0, r1)
            long r5 = r5 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L49
        L43:
            X.26g r1 = r7.A0A
            r0 = 2
            r1.A05(r0, r7)
        L49:
            if (r3 == 0) goto L53
            if (r8 == 0) goto L53
            X.28O r1 = r7.A0B
            r0 = 0
            r1.A01(r0, r7)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4EY.A01(boolean, boolean):void");
    }

    @Override // X.InterfaceC899549c
    public void AGy(boolean z) {
        ActivityC02270An activityC02270An = this.A03;
        if (activityC02270An instanceof InterfaceC899549c) {
            ((InterfaceC899549c) activityC02270An).AGy(z);
        }
    }

    @Override // X.InterfaceC899549c
    public void AMp(C0N2 c0n2) {
        ActivityC02270An activityC02270An = this.A03;
        if (activityC02270An instanceof InterfaceC899549c) {
            ((InterfaceC899549c) activityC02270An).AMp(c0n2);
        }
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        C014406v c014406v = this.A0C;
        StringBuilder sb = new StringBuilder("getPaymentMethods/getPaymentTransactions/onRequestError. paymentNetworkError: ");
        sb.append(c28q);
        c014406v.A04(sb.toString());
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        C014406v c014406v = this.A0C;
        StringBuilder sb = new StringBuilder("getPaymentMethods/getPaymentTransactions/onResponseError. paymentNetworkError: ");
        sb.append(c28q);
        c014406v.A04(sb.toString());
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        if (c468228k instanceof C77113hg) {
            this.A0C.A03("init/getMethods/onResponseSuccess");
            A00(false);
        } else if (!(c468228k instanceof C77153hk)) {
        } else {
            C014406v c014406v = this.A0C;
            c014406v.A03("init/getTransactions/onResponseSuccess");
            C77153hk c77153hk = (C77153hk) c468228k;
            C60332uJ c60332uJ = c77153hk.A00;
            if (c60332uJ != null) {
                if (!c60332uJ.A01 && !TextUtils.isEmpty(c60332uJ.A00)) {
                    this.A0B.A01(c77153hk.A00.A00, this);
                }
            } else {
                c014406v.A03("unexpected payment transaction result type.");
            }
            A00(false);
        }
    }
}
