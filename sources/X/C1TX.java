package X;

import android.view.View;

/* renamed from: X.1TX  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TX implements InterfaceC12940kL {
    public final /* synthetic */ C0BA A00;

    public C1TX(C0BA c0ba) {
        this.A00 = c0ba;
    }

    public void A00() {
        C0BA c0ba = this.A00;
        C0XM c0xm = c0ba.A0C;
        View view = c0xm == null ? null : c0xm.A04;
        if (view != null) {
            c0ba.A06().A04 = null;
            view.clearAnimation();
        }
        c0ba.A06().A03 = null;
    }
}
