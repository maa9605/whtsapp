package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.1B3  reason: invalid class name */
/* loaded from: classes.dex */
public class C1B3 extends ViewGroup {
    public int A00;
    public int A01;
    public boolean A02;

    public C1B3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipGroupStyle);
        this.A02 = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C08550bg.A0V, 0, 0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.A00;
    }

    public int getLineSpacing() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            return;
        }
        boolean z2 = true;
        if (C0AT.A05(this) == 1) {
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingRight;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (Build.VERSION.SDK_INT >= 17) {
                        i6 = marginLayoutParams.getMarginStart();
                    } else {
                        i6 = marginLayoutParams.leftMargin;
                    }
                    i5 = C07O.A09(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i8 + i6;
                if (!this.A02 && measuredWidth > i7) {
                    i9 = this.A01 + paddingTop;
                    i8 = paddingLeft;
                }
                int i11 = i8 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                paddingTop = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, paddingTop);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, paddingTop);
                }
                i8 += childAt.getMeasuredWidth() + i6 + i5 + this.A00;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r9 == 1073741824) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r13 = r19
            int r10 = android.view.View.MeasureSpec.getSize(r13)
            int r9 = android.view.View.MeasureSpec.getMode(r13)
            r11 = r20
            int r8 = android.view.View.MeasureSpec.getSize(r11)
            int r7 = android.view.View.MeasureSpec.getMode(r11)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 == r1) goto L1f
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != r0) goto L20
        L1f:
            r6 = r10
        L20:
            r12 = r18
            int r17 = r12.getPaddingLeft()
            int r2 = r12.getPaddingTop()
            int r0 = r12.getPaddingRight()
            int r6 = r6 - r0
            r16 = r2
            r5 = 0
            r4 = 0
        L33:
            int r0 = r12.getChildCount()
            if (r5 >= r0) goto L90
            android.view.View r15 = r12.getChildAt(r5)
            int r1 = r15.getVisibility()
            r0 = 8
            if (r1 == r0) goto L88
            r12.measureChild(r15, r13, r11)
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L8d
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r14 = r1.leftMargin
            int r3 = r1.rightMargin
        L56:
            int r1 = r17 + r14
            int r0 = r15.getMeasuredWidth()
            int r0 = r0 + r1
            if (r0 <= r6) goto L6b
            boolean r0 = r12.A02
            if (r0 != 0) goto L6b
            int r17 = r12.getPaddingLeft()
            int r0 = r12.A01
            int r16 = r2 + r0
        L6b:
            int r1 = r17 + r14
            int r0 = r15.getMeasuredWidth()
            int r0 = r0 + r1
            int r2 = r15.getMeasuredHeight()
            int r2 = r2 + r16
            if (r0 <= r4) goto L7b
            r4 = r0
        L7b:
            int r14 = r14 + r3
            int r1 = r15.getMeasuredWidth()
            int r1 = r1 + r14
            int r0 = r12.A00
            int r1 = r1 + r0
            int r1 = r1 + r17
            r17 = r1
        L88:
            int r5 = r5 + 1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L33
        L8d:
            r3 = 0
            r14 = 0
            goto L56
        L90:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 == r1) goto La5
            if (r9 == r0) goto L97
            r10 = r4
        L97:
            if (r7 == r1) goto La0
            if (r7 == r0) goto L9c
            r8 = r2
        L9c:
            r12.setMeasuredDimension(r10, r8)
            return
        La0:
            int r8 = java.lang.Math.min(r2, r8)
            goto L9c
        La5:
            int r10 = java.lang.Math.min(r4, r10)
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B3.onMeasure(int, int):void");
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
    }

    public void setLineSpacing(int i) {
        this.A01 = i;
    }

    public void setSingleLine(boolean z) {
        this.A02 = z;
    }
}
