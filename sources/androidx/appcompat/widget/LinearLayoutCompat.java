package androidx.appcompat.widget;

import X.C000200d;
import X.C09L;
import X.C0UY;
import X.C0Ux;
import X.C11190hL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public Drawable A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;

    public int getChildrenSkipCount() {
        return 0;
    }

    public int getLocationOffset() {
        return 0;
    }

    public int getNextLocationOffset() {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A06 = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A0N, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!obtainStyledAttributes.getBoolean(2, true)) {
            this.A0B = false;
        }
        this.A00 = obtainStyledAttributes.getFloat(4, -1.0f);
        this.A01 = obtainStyledAttributes.getInt(3, -1);
        this.A0C = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = C09L.A01(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.A08 = obtainStyledAttributes.getInt(8, 0);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    /* renamed from: A00 */
    public C11190hL generateDefaultLayoutParams() {
        int i = this.A07;
        if (i == 0) {
            return new C11190hL(-2);
        }
        if (i == 1) {
            return new C11190hL(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: A01 */
    public C11190hL generateLayoutParams(AttributeSet attributeSet) {
        return new C11190hL(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: A02 */
    public C11190hL generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C11190hL(layoutParams);
    }

    public void A03(Canvas canvas, int i) {
        this.A0A.setBounds(getPaddingLeft() + this.A04, i, (getWidth() - getPaddingRight()) - this.A04, this.A03 + i);
        this.A0A.draw(canvas);
    }

    public void A04(Canvas canvas, int i) {
        this.A0A.setBounds(i, getPaddingTop() + this.A04, this.A05 + i, (getHeight() - getPaddingBottom()) - this.A04);
        this.A0A.draw(canvas);
    }

    public boolean A05(int i) {
        if (i == 0) {
            return (this.A08 & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.A08 & 4) != 0;
        } else if ((this.A08 & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C11190hL;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.A01 == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.A02;
            if (this.A07 == 1 && (i = this.A06 & 112) != 48) {
                if (i == 16) {
                    i3 = (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.A09) / 2) + i3;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A09;
                }
            }
            return i3 + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A0A;
    }

    public int getDividerPadding() {
        return this.A04;
    }

    public int getDividerWidth() {
        return this.A05;
    }

    public int getGravity() {
        return this.A06;
    }

    public int getOrientation() {
        return this.A07;
    }

    public int getShowDividers() {
        return this.A08;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.A00;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.A0A == null) {
            return;
        }
        int i2 = this.A07;
        int i3 = 0;
        int childCount = getChildCount();
        if (i2 == 1) {
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && A05(i3)) {
                    A03(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin) - this.A03);
                }
                i3++;
            }
            if (A05(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.A03;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).bottomMargin;
                }
                A03(canvas, bottom);
                return;
            }
            return;
        }
        boolean A01 = C0Ux.A01(this);
        while (i3 < childCount) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && A05(i3)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt3.getLayoutParams();
                if (A01) {
                    left2 = childAt3.getRight() + marginLayoutParams.rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - marginLayoutParams.leftMargin) - this.A05;
                }
                A04(canvas, left2);
            }
            i3++;
        }
        if (A05(childCount)) {
            View childAt4 = getChildAt(childCount - 1);
            if (childAt4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt4.getLayoutParams();
                if (A01) {
                    left = childAt4.getLeft() - marginLayoutParams2.leftMargin;
                    i = this.A05;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + marginLayoutParams2.rightMargin;
                }
            } else if (A01) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.A05;
                right = left - i;
            }
            A04(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0186  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:465:0x0116, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r2).width != (-1)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x022d, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r10).width == (-1)) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0239, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r10).width != r5) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0418, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r12).height != (-1)) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x04ce, code lost:
        if (r6[3] != (-1)) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x0616, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r7).height != (-1)) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0637, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r7).height != (-1)) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x06ed, code lost:
        if (r6[3] != (-1)) goto L405;
     */
    /* JADX WARN: Removed duplicated region for block: B:605:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x042d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.A0B = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.A01 = i;
            return;
        }
        StringBuilder A0P = C000200d.A0P("base aligned child index out of range (0, ");
        A0P.append(getChildCount());
        A0P.append(")");
        throw new IllegalArgumentException(A0P.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.A0A) {
            return;
        }
        this.A0A = drawable;
        boolean z = false;
        if (drawable != null) {
            this.A05 = drawable.getIntrinsicWidth();
            this.A03 = drawable.getIntrinsicHeight();
        } else {
            this.A05 = 0;
            this.A03 = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.A04 = i;
    }

    public void setGravity(int i) {
        if (this.A06 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A06 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A06;
        if ((8388615 & i3) != i2) {
            this.A06 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A0C = z;
    }

    public void setOrientation(int i) {
        if (this.A07 != i) {
            this.A07 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A08) {
            requestLayout();
        }
        this.A08 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A06;
        if ((i3 & 112) != i2) {
            this.A06 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }
}
