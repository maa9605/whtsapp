package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0Ub  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06610Ub implements C0O8 {
    public C0O8 A00;
    public final /* synthetic */ C0CN A01;

    public C06610Ub(C0CN c0cn, C0O8 c0o8) {
        this.A01 = c0cn;
        this.A00 = c0o8;
    }

    @Override // X.C0O8
    public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
        return this.A00.AGv(c0u0, menuItem);
    }

    @Override // X.C0O8
    public boolean AJ5(C0U0 c0u0, Menu menu) {
        return this.A00.AJ5(c0u0, menu);
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        this.A00.AJK(c0u0);
        C0CN c0cn = this.A01;
        if (c0cn.A09 != null) {
            c0cn.A08.getDecorView().removeCallbacks(c0cn.A0O);
        }
        if (c0cn.A0K != null) {
            C0TT c0tt = c0cn.A0M;
            if (c0tt != null) {
                c0tt.A00();
            }
            C0TT A0E = C0AT.A0E(c0cn.A0K);
            A0E.A02(0.0f);
            c0cn.A0M = A0E;
            C06680Un c06680Un = new C06680Un() { // from class: X.1ni
                @Override // X.C0TU
                public void AH8(View view) {
                    C0CN c0cn2 = C06610Ub.this.A01;
                    c0cn2.A0K.setVisibility(8);
                    PopupWindow popupWindow = c0cn2.A09;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    } else if (c0cn2.A0K.getParent() instanceof View) {
                        C0AT.A0L((View) c0cn2.A0K.getParent());
                    }
                    c0cn2.A0K.removeAllViews();
                    c0cn2.A0M.A06(null);
                    c0cn2.A0M = null;
                }
            };
            View view = (View) A0E.A01.get();
            if (view != null) {
                A0E.A05(view, c06680Un);
            }
        }
        AnonymousClass091 anonymousClass091 = c0cn.A0k;
        if (anonymousClass091 != null) {
            anonymousClass091.APM(c0cn.A0J);
        }
        c0cn.A0J = null;
    }

    @Override // X.C0O8
    public boolean ANE(C0U0 c0u0, Menu menu) {
        return this.A00.ANE(c0u0, menu);
    }
}
