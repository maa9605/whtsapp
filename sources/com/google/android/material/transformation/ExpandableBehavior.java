package com.google.android.material.transformation;

import X.AbstractC08910cJ;
import X.C0AT;
import X.InterfaceC08300bC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.ExpandableBehavior;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC08910cJ {
    public int A00;

    public abstract boolean A0I(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.A00 = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
    }

    @Override // X.AbstractC08910cJ
    public boolean A08(CoordinatorLayout coordinatorLayout, final View view, int i) {
        if (!C0AT.A0h(view)) {
            List A06 = coordinatorLayout.A06(view);
            int size = A06.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                View view2 = (View) A06.get(i2);
                if (A0H(coordinatorLayout, view, view2)) {
                    final InterfaceC08300bC interfaceC08300bC = (InterfaceC08300bC) view2;
                    if (interfaceC08300bC != null) {
                        boolean AFF = interfaceC08300bC.AFF();
                        int i3 = this.A00;
                        if (!AFF ? i3 == 1 : !(i3 != 0 && i3 != 2)) {
                            final int i4 = AFF ? 1 : 2;
                            this.A00 = i4;
                            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.1Bb
                                {
                                    ExpandableBehavior.this = this;
                                }

                                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                public boolean onPreDraw() {
                                    View view3 = view;
                                    view3.getViewTreeObserver().removeOnPreDrawListener(this);
                                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                                    if (expandableBehavior.A00 == i4) {
                                        InterfaceC08300bC interfaceC08300bC2 = interfaceC08300bC;
                                        expandableBehavior.A0I((View) interfaceC08300bC2, view3, interfaceC08300bC2.AFF(), false);
                                    }
                                    return false;
                                }
                            });
                        }
                    }
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0D(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC08300bC interfaceC08300bC = (InterfaceC08300bC) view2;
        boolean AFF = interfaceC08300bC.AFF();
        int i = this.A00;
        if (AFF) {
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        this.A00 = AFF ? 1 : 2;
        return A0I((View) interfaceC08300bC, view, AFF, true);
    }
}
