package com.google.android.material.floatingactionbutton;

import X.AbstractC08910cJ;
import X.C08280bA;
import X.C08290bB;
import X.C08550bg;
import X.C08930cL;
import X.C1B2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior extends AbstractC08910cJ {
    public Rect A00;
    public boolean A01;

    public FloatingActionButton$BaseBehavior() {
        this.A01 = true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A0U);
        this.A01 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // X.AbstractC08910cJ
    public boolean A01(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        C08280bA c08280bA = (C08280bA) view;
        Rect rect2 = c08280bA.A0C;
        rect.set(c08280bA.getLeft() + rect2.left, c08280bA.getTop() + rect2.top, c08280bA.getRight() - rect2.right, c08280bA.getBottom() - rect2.bottom);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x005d  */
    @Override // X.AbstractC08910cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9) {
        /*
            r6 = this;
            X.0bA r8 = (X.C08280bA) r8
            java.util.List r5 = r7.A06(r8)
            int r4 = r5.size()
            r3 = 0
        Lb:
            if (r3 >= r4) goto L1f
            java.lang.Object r2 = r5.get(r3)
            android.view.View r2 = (android.view.View) r2
            boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout
            if (r0 == 0) goto L7c
            com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
            boolean r0 = r6.A0J(r7, r2, r8)
            if (r0 == 0) goto L93
        L1f:
            r7.A0B(r8, r9)
            android.graphics.Rect r4 = r8.A0C
            if (r4 == 0) goto L60
            int r0 = r4.centerX()
            if (r0 <= 0) goto L60
            int r0 = r4.centerY()
            if (r0 <= 0) goto L60
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r2 = r8.getRight()
            int r1 = r7.getWidth()
            int r0 = r5.rightMargin
            int r1 = r1 - r0
            if (r2 < r1) goto L6e
            int r3 = r4.right
        L47:
            int r2 = r8.getBottom()
            int r1 = r7.getHeight()
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            if (r2 < r1) goto L62
            int r0 = r4.bottom
        L56:
            if (r0 == 0) goto L5b
            X.C0AT.A0T(r8, r0)
        L5b:
            if (r3 == 0) goto L60
            X.C0AT.A0S(r8, r3)
        L60:
            r0 = 1
            return r0
        L62:
            int r1 = r8.getTop()
            int r0 = r5.topMargin
            if (r1 > r0) goto L5b
            int r0 = r4.top
            int r0 = -r0
            goto L56
        L6e:
            int r1 = r8.getLeft()
            int r0 = r5.leftMargin
            if (r1 > r0) goto L7a
            int r0 = r4.left
            int r3 = -r0
            goto L47
        L7a:
            r3 = 0
            goto L47
        L7c:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            boolean r0 = r1 instanceof X.C08930cL
            if (r0 == 0) goto L93
            X.0cL r1 = (X.C08930cL) r1
            X.0cJ r0 = r1.A0A
            boolean r0 = r0 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L93
            boolean r0 = r6.A0I(r2, r8)
            if (r0 == 0) goto L93
            goto L1f
        L93:
            int r3 = r3 + 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior.A08(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // X.AbstractC08910cJ
    public boolean A0D(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C08280bA c08280bA = (C08280bA) view;
        if (view2 instanceof AppBarLayout) {
            A0J(coordinatorLayout, (AppBarLayout) view2, c08280bA);
        } else {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof C08930cL) && (((C08930cL) layoutParams).A0A instanceof BottomSheetBehavior)) {
                A0I(view2, c08280bA);
                return false;
            }
        }
        return false;
    }

    @Override // X.AbstractC08910cJ
    public void A0G(C08930cL c08930cL) {
        if (c08930cL.A01 == 0) {
            c08930cL.A01 = 80;
        }
    }

    public final boolean A0I(View view, C08280bA c08280bA) {
        boolean z;
        C08930cL c08930cL = (C08930cL) c08280bA.getLayoutParams();
        if (!this.A01) {
            z = false;
        } else if (c08930cL.A05 != view.getId()) {
            z = false;
        } else {
            z = false;
            if (((C08290bB) c08280bA).A00 == 0) {
                z = true;
            }
        }
        if (z) {
            if (view.getTop() < (c08280bA.getHeight() >> 1) + ((ViewGroup.MarginLayoutParams) c08280bA.getLayoutParams()).topMargin) {
                c08280bA.A04(false);
                return true;
            }
            c08280bA.A05(false);
            return true;
        }
        return false;
    }

    public final boolean A0J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C08280bA c08280bA) {
        boolean z;
        C08930cL c08930cL = (C08930cL) c08280bA.getLayoutParams();
        if (!this.A01) {
            z = false;
        } else if (c08930cL.A05 != appBarLayout.getId()) {
            z = false;
        } else {
            z = false;
            if (((C08290bB) c08280bA).A00 == 0) {
                z = true;
            }
        }
        if (z) {
            Rect rect = this.A00;
            if (rect == null) {
                rect = new Rect();
                this.A00 = rect;
            }
            C1B2.A00(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                c08280bA.A04(false);
                return true;
            }
            c08280bA.A05(false);
            return true;
        }
        return false;
    }
}
