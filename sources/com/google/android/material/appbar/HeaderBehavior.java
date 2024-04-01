package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: classes.dex */
public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public int A00;
    public int A01;
    public int A02;
    public VelocityTracker A03;
    public OverScroller A04;
    public Runnable A05;
    public boolean A06;

    public abstract int A0J();

    public abstract int A0K(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    public abstract boolean A0M(View view);

    public HeaderBehavior() {
        this.A00 = -1;
        this.A02 = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1;
        this.A02 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r2 != 3) goto L17;
     */
    @Override // X.AbstractC08910cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0B(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.A02
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.A02 = r0
        L12:
            int r0 = r9.getAction()
            r5 = 2
            r4 = 1
            if (r0 != r5) goto L1f
            boolean r0 = r6.A06
            if (r0 == 0) goto L1f
            return r4
        L1f:
            int r2 = r9.getActionMasked()
            r3 = 0
            if (r2 == 0) goto L67
            r1 = -1
            if (r2 == r4) goto L58
            if (r2 == r5) goto L38
            r0 = 3
            if (r2 == r0) goto L58
        L2e:
            android.view.VelocityTracker r0 = r6.A03
            if (r0 == 0) goto L35
            r0.addMovement(r9)
        L35:
            boolean r0 = r6.A06
            return r0
        L38:
            int r0 = r6.A00
            if (r0 == r1) goto L2e
            int r0 = r9.findPointerIndex(r0)
            if (r0 == r1) goto L2e
            float r0 = r9.getY(r0)
            int r2 = (int) r0
            int r0 = r6.A01
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r6.A02
            if (r1 <= r0) goto L2e
            r6.A06 = r4
            r6.A01 = r2
            goto L2e
        L58:
            r6.A06 = r3
            r6.A00 = r1
            android.view.VelocityTracker r0 = r6.A03
            if (r0 == 0) goto L2e
            r0.recycle()
            r0 = 0
            r6.A03 = r0
            goto L2e
        L67:
            r6.A06 = r3
            float r0 = r9.getX()
            int r2 = (int) r0
            float r0 = r9.getY()
            int r1 = (int) r0
            boolean r0 = r6.A0M(r8)
            if (r0 == 0) goto L2e
            boolean r0 = r7.A0H(r8, r2, r1)
            if (r0 == 0) goto L2e
            r6.A01 = r1
            int r0 = r9.getPointerId(r3)
            r6.A00 = r0
            android.view.VelocityTracker r0 = r6.A03
            if (r0 != 0) goto L2e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.A03 = r0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0B(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r8 != 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r5 != false) goto L30;
     */
    @Override // X.AbstractC08910cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C(final androidx.coordinatorlayout.widget.CoordinatorLayout r21, final android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public void A0L(CoordinatorLayout coordinatorLayout, View view, int i) {
        A0K(coordinatorLayout, view, i, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
    }
}
