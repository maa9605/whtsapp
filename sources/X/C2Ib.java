package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2Ib  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Ib implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C49042Ie A00;

    public C2Ib(C49042Ie c49042Ie) {
        this.A00 = c49042Ie;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int[] iArr = new int[2];
        C49042Ie c49042Ie = this.A00;
        View view = c49042Ie.A07;
        view.getLocationOnScreen(iArr);
        if (!c49042Ie.isShowing()) {
            c49042Ie.A04();
        } else if (c49042Ie.A01 != iArr[0]) {
            c49042Ie.A04();
            view.post(new RunnableEBaseShape1S0100000_I0_1(this, 45));
        }
    }
}
