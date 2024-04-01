package com.whatsapp.components;

import X.C002301c;
import X.C2VZ;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class ButtonGroupView extends C2VZ {
    public int A00;
    public int A01;
    public C002301c A02;
    public final List A03;

    public ButtonGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 1;
        this.A03 = new LinkedList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A0R, 0, 0);
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(0)) {
                this.A01 = obtainStyledAttributes.getInt(0, 0);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        List list = this.A03;
        list.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                list.add(childAt);
            }
        }
        int size = list.size();
        if (size > 2) {
            throw new IllegalStateException("ButtonGroupView should not have more than 2 visible children!");
        }
        if (size == 1) {
            ((View) list.remove(0)).layout(0, 0, i3 - i, i4 - i2);
        } else if (size == 2) {
            View view = (View) list.remove(0);
            View view2 = (View) list.remove(0);
            int i6 = i4 - i2;
            int i7 = i3 - i;
            if (this.A00 == 2) {
                int i8 = i6 >> 1;
                view.layout(0, 0, i7, i8);
                view2.layout(0, i8, i7, i6);
                return;
            }
            int i9 = i7 >> 1;
            if (this.A02.A0M()) {
                view.layout(0, 0, i9, i6);
                view2.layout(i9, 0, i7, i6);
                return;
            }
            view.layout(i9, 0, i7, i6);
            view2.layout(0, 0, i9, i6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i4;
        int childCount = getChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.A01;
        if (!(i5 == 0)) {
            if (i5 == 2) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
            i3 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                if (getChildAt(i6).getVisibility() != 8) {
                    i3++;
                }
            }
            if (i3 > 2) {
                throw new IllegalStateException("ButtonGroupView more than 2 visible children not allowed!");
            }
        } else {
            int i7 = 0;
            int i8 = 0;
            i3 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    measureChild(childAt, i, i2);
                    i3++;
                    i7 = Math.max(i7, childAt.getMeasuredWidth());
                    childAt.getMeasuredHeight();
                    i8 = ViewGroup.combineMeasuredStates(i8, childAt.getMeasuredState());
                }
            }
            if (i3 > 2) {
                throw new IllegalStateException("ButtonGroupView more than 2 visible children not allowed!");
            }
            if (mode == 0) {
                this.A00 = 1;
            } else if ((i7 << 1) > size) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
        }
        if (i3 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.A00 == 1) {
            i4 = size / i3;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            makeMeasureSpec2 = i2;
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 / i3, mode2);
            i4 = size;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                measureChild(childAt2, makeMeasureSpec, makeMeasureSpec2);
                i10 = Math.max(i10, childAt2.getMeasuredHeight());
                i11 = ViewGroup.combineMeasuredStates(i11, childAt2.getMeasuredState());
            }
        }
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt3 = getChildAt(i13);
            if (childAt3.getVisibility() != 8) {
                childAt3.measure(makeMeasureSpec3, makeMeasureSpec4);
            }
        }
        if (this.A00 == 2) {
            i10 *= i3;
        }
        setMeasuredDimension(ViewGroup.resolveSizeAndState(size, i, i11), ViewGroup.resolveSizeAndState(i10, i2, i11 << 16));
    }
}
