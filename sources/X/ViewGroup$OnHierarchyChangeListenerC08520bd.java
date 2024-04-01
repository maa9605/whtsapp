package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0bd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewGroup$OnHierarchyChangeListenerC08520bd extends AbstractC08530be implements ViewGroup.OnHierarchyChangeListener {
    public int[] A00;

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
    }

    public ViewGroup$OnHierarchyChangeListenerC08520bd(Context context) {
        super(context);
        this.A00 = new int[4];
        setOnHierarchyChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        int childCount = getChildCount();
        if (this.A00.length < childCount) {
            this.A00 = new int[childCount];
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        if (childCount > 1 && size > 0) {
            View childAt = getChildAt(0);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            int size2 = View.MeasureSpec.getSize(i) - childAt.getMeasuredWidth();
            boolean z = false;
            int i3 = 0;
            for (int i4 = 1; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, 0), i2);
                this.A00[i4] = childAt2.getMeasuredWidth();
                i3 += this.A00[i4];
                if (childAt2.getMeasuredWidth() > size2 / (childCount - 1)) {
                    z = true;
                }
            }
            if (z) {
                for (int i5 = 1; i5 < childCount; i5++) {
                    getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec((this.A00[i5] * size2) / i3, 1073741824), i2);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
