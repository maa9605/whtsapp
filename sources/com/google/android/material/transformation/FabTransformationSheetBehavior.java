package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import java.util.Map;

/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map A00;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if ((((X.C08930cL) r1.getLayoutParams()).A0A instanceof com.google.android.material.transformation.FabTransformationScrimBehavior) == false) goto L28;
     */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0I(android.view.View r8, android.view.View r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            android.view.ViewParent r4 = r9.getParent()
            boolean r0 = r4 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r6 = 1
            if (r0 == 0) goto L6c
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r3 = r4.getChildCount()
            if (r10 == 0) goto L18
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3)
            r7.A00 = r0
        L18:
            r2 = 0
        L19:
            if (r2 >= r3) goto L67
            android.view.View r1 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            boolean r0 = r0 instanceof X.C08930cL
            if (r0 == 0) goto L34
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.0cL r0 = (X.C08930cL) r0
            X.0cJ r0 = r0.A0A
            boolean r5 = r0 instanceof com.google.android.material.transformation.FabTransformationScrimBehavior
            r0 = 1
            if (r5 != 0) goto L35
        L34:
            r0 = 0
        L35:
            if (r1 == r9) goto L54
            if (r0 != 0) goto L54
            java.util.Map r5 = r7.A00
            if (r10 != 0) goto L57
            if (r5 == 0) goto L54
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L54
            java.util.Map r0 = r7.A00
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            X.C0AT.A0V(r1, r0)
        L54:
            int r2 = r2 + 1
            goto L19
        L57:
            int r0 = r1.getImportantForAccessibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.put(r1, r0)
            r0 = 4
            X.C0AT.A0V(r1, r0)
            goto L54
        L67:
            if (r10 != 0) goto L6c
            r0 = 0
            r7.A00 = r0
        L6c:
            super.A0I(r8, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationSheetBehavior.A0I(android.view.View, android.view.View, boolean, boolean):boolean");
    }
}
