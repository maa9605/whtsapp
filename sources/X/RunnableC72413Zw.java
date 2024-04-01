package X;

import android.view.View;

/* renamed from: X.3Zw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC72413Zw extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass092 A01;
    public final /* synthetic */ C03900Hp A02;
    public final /* synthetic */ InterfaceC43821y3 A03;
    public final /* synthetic */ C42471vn A04;
    public final /* synthetic */ InterfaceC43851y6 A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ RunnableC72413Zw(C42471vn c42471vn, C03900Hp c03900Hp, AnonymousClass092 anonymousClass092, boolean z, Object obj, View view, InterfaceC43821y3 interfaceC43821y3, InterfaceC43851y6 interfaceC43851y6, boolean z2) {
        this.A04 = c42471vn;
        this.A02 = c03900Hp;
        this.A01 = anonymousClass092;
        this.A07 = z;
        this.A06 = obj;
        this.A00 = view;
        this.A03 = interfaceC43821y3;
        this.A05 = interfaceC43851y6;
        this.A08 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42471vn c42471vn = this.A04;
        C03900Hp c03900Hp = this.A02;
        AnonymousClass092 anonymousClass092 = this.A01;
        boolean z = this.A07;
        Object obj = this.A06;
        View view = this.A00;
        InterfaceC43821y3 interfaceC43821y3 = this.A03;
        InterfaceC43851y6 interfaceC43851y6 = this.A05;
        boolean z2 = this.A08;
        byte[] A08 = c03900Hp.A08();
        if (A08 != null && A08.length > 0) {
            c42471vn.A0D(new RunnableEBaseShape0S0500000_I0(anonymousClass092, obj, view, c42471vn.A05(anonymousClass092, true, z, C42471vn.A02(anonymousClass092)), interfaceC43821y3, 7));
        } else {
            c42471vn.A0D(new RunnableEBaseShape0S0400000_I0(obj, view, interfaceC43821y3, anonymousClass092, 14));
        }
        c42471vn.A04.A01(anonymousClass092, view, interfaceC43821y3, interfaceC43851y6, obj, z2);
    }
}
