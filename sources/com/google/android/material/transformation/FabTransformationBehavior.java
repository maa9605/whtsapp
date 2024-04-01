package com.google.android.material.transformation;

import X.C08280bA;
import X.C08580bj;
import X.C08590bk;
import X.C08930cL;
import X.C0AT;
import X.C24511Be;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect A00;
    public final RectF A01;
    public final RectF A02;
    public final int[] A03;

    public FabTransformationBehavior() {
        this.A00 = new Rect();
        this.A01 = new RectF();
        this.A02 = new RectF();
        this.A03 = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new Rect();
        this.A01 = new RectF();
        this.A02 = new RectF();
        this.A03 = new int[2];
    }

    public static final float A00(C24511Be c24511Be, C08590bk c08590bk, float f) {
        long j = c08590bk.A02;
        long j2 = c08590bk.A03;
        C08590bk A03 = c24511Be.A00.A03("expansion");
        float f2 = ((float) (((A03.A02 + A03.A03) + 17) - j)) / ((float) j2);
        TimeInterpolator timeInterpolator = c08590bk.A04;
        if (timeInterpolator == null) {
            timeInterpolator = C08580bj.A02;
        }
        return ((0.0f - f) * timeInterpolator.getInterpolation(f2)) + f;
    }

    public static final void A01(View view, View view2, boolean z, boolean z2, C24511Be c24511Be, List list) {
        ObjectAnimator ofFloat;
        float A00 = C0AT.A00(view2) - C0AT.A00(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-A00);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -A00);
        }
        c24511Be.A00.A03("elevation").A00(ofFloat);
        list.add(ofFloat);
    }

    @Override // X.AbstractC08910cJ
    public void A0G(C08930cL c08930cL) {
        if (c08930cL.A01 == 0) {
            c08930cL.A01 = 80;
        }
    }

    @Override // X.AbstractC08910cJ
    public boolean A0H(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof C08280bA) {
                int i = ((C08280bA) view2).A0F.A00;
                return i == 0 || i == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0158, code lost:
        if (r2 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0141 A[LOOP:0: B:118:0x013f->B:119:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0082  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.AnimatorSet A0J(final android.view.View r23, final android.view.View r24, final boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.A0J(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final void A0K(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.A03;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }
}
