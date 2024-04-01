package X;

import android.view.View;

/* renamed from: X.1AY  reason: invalid class name */
/* loaded from: classes.dex */
public class C1AY {
    public int A00;
    public int A01;
    public int A02;
    public final View A03;

    public C1AY(View view) {
        this.A03 = view;
    }

    public final void A00() {
        View view = this.A03;
        C0AT.A0T(view, this.A02 - (view.getTop() - this.A01));
        C0AT.A0S(view, 0 - (view.getLeft() - this.A00));
    }

    public boolean A01(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A00();
            return true;
        }
        return false;
    }
}
