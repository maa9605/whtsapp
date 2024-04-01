package X;

import android.view.View;

/* renamed from: X.3Zx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC72423Zx extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass092 A01;
    public final /* synthetic */ C03900Hp A02;
    public final /* synthetic */ InterfaceC43821y3 A03;
    public final /* synthetic */ C42471vn A04;
    public final /* synthetic */ Object A05;

    public /* synthetic */ RunnableC72423Zx(C42471vn c42471vn, C03900Hp c03900Hp, AnonymousClass092 anonymousClass092, Object obj, View view, InterfaceC43821y3 interfaceC43821y3) {
        this.A04 = c42471vn;
        this.A02 = c03900Hp;
        this.A01 = anonymousClass092;
        this.A05 = obj;
        this.A00 = view;
        this.A03 = interfaceC43821y3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C42471vn c42471vn = this.A04;
        C03900Hp c03900Hp = this.A02;
        AnonymousClass092 anonymousClass092 = this.A01;
        Object obj = this.A05;
        View view = this.A00;
        InterfaceC43821y3 interfaceC43821y3 = this.A03;
        byte[] A08 = c03900Hp.A08();
        if (A08 != null && A08.length > 0) {
            c42471vn.A0D(new RunnableEBaseShape0S0500000_I0(anonymousClass092, obj, view, c42471vn.A04(anonymousClass092), interfaceC43821y3, 8));
        } else {
            c42471vn.A0D(new RunnableEBaseShape0S0400000_I0(obj, view, interfaceC43821y3, anonymousClass092, 15));
        }
    }
}
