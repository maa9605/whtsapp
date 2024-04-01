package com.google.android.exoplayer2.ui;

import X.C222811u;
import X.InterfaceC222511p;
import X.RunnableC222611q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public float A00;
    public int A01;
    public InterfaceC222511p A02;
    public final RunnableC222611q A03;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C222811u.A00, 0, 0);
            try {
                this.A01 = obtainStyledAttributes.getInt(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A03 = new RunnableC222611q(this);
    }

    public int getResizeMode() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x004d, code lost:
        if (r9 > 0.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0074, code lost:
        if (r9 > 0.0f) goto L27;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            super.onMeasure(r12, r13)
            float r0 = r11.A00
            r10 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto Lb
            return
        Lb:
            int r5 = r11.getMeasuredWidth()
            int r4 = r11.getMeasuredHeight()
            float r8 = (float) r5
            float r7 = (float) r4
            float r6 = r8 / r7
            float r3 = r11.A00
            float r9 = r3 / r6
            r0 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r0
            float r1 = java.lang.Math.abs(r9)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r2 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L3f
            X.11q r1 = r11.A03
            r0 = 0
            r1.A01 = r3
            r1.A00 = r6
            r1.A02 = r0
            boolean r0 = r1.A03
            if (r0 != 0) goto L3e
            r1.A03 = r2
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.A04
            r0.post(r1)
        L3e:
            return
        L3f:
            int r1 = r11.A01
            if (r1 == 0) goto L72
            if (r1 == r2) goto L76
            r0 = 2
            if (r1 == r0) goto L4f
            r0 = 4
            if (r1 != r0) goto L51
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 <= 0) goto L76
        L4f:
            float r7 = r7 * r3
            int r5 = (int) r7
        L51:
            X.11q r1 = r11.A03
            r1.A01 = r3
            r1.A00 = r6
            r1.A02 = r2
            boolean r0 = r1.A03
            if (r0 != 0) goto L64
            r1.A03 = r2
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r1.A04
            r0.post(r1)
        L64:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            super.onMeasure(r1, r0)
            return
        L72:
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 <= 0) goto L4f
        L76:
            float r8 = r8 / r3
            int r4 = (int) r8
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC222511p interfaceC222511p) {
        this.A02 = interfaceC222511p;
    }

    public void setResizeMode(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            requestLayout();
        }
    }
}
