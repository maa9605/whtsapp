package androidx.constraintlayout.widget;

import X.AbstractC07040Wj;
import X.C0Wg;
import X.C0YF;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Group extends AbstractC07040Wj {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC07040Wj
    public void A04(AttributeSet attributeSet) {
        super.A04(attributeSet);
    }

    @Override // X.AbstractC07040Wj
    public void A07(ConstraintLayout constraintLayout) {
        C0YF c0yf = ((C0Wg) getLayoutParams()).A0r;
        c0yf.A09(0);
        c0yf.A08(0);
    }

    @Override // X.AbstractC07040Wj, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A01();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        A01();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        A01();
    }
}
