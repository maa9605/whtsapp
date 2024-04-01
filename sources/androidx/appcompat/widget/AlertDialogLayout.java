package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A00(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return A00(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        /*
            r13 = this;
            int r12 = r13.getPaddingLeft()
            int r17 = r17 - r15
            int r0 = r13.getPaddingRight()
            int r11 = r17 - r0
            int r17 = r17 - r12
            int r0 = r13.getPaddingRight()
            int r17 = r17 - r0
            int r2 = r13.getMeasuredHeight()
            int r4 = r13.getChildCount()
            int r3 = r13.A06
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            r0 = 16
            if (r1 == r0) goto La4
            r0 = 80
            if (r1 == r0) goto L9a
            int r1 = r13.getPaddingTop()
        L30:
            android.graphics.drawable.Drawable r0 = r13.A0A
            r7 = 0
            if (r0 != 0) goto L95
            r10 = 0
        L36:
            if (r7 >= r4) goto Lb0
            android.view.View r8 = r13.getChildAt(r7)
            if (r8 == 0) goto L81
            int r2 = r8.getVisibility()
            r0 = 8
            if (r2 == r0) goto L81
            int r6 = r8.getMeasuredWidth()
            int r9 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()
            X.0hL r5 = (X.C11190hL) r5
            int r2 = r5.A01
            if (r2 >= 0) goto L59
            r2 = r3
        L59:
            int r0 = X.C0AT.A05(r13)
            int r0 = X.C07O.A01(r2, r0)
            r2 = r0 & 7
            r0 = 1
            if (r2 == r0) goto L89
            r0 = 5
            if (r2 == r0) goto L84
            int r2 = r5.leftMargin
            int r2 = r2 + r12
        L6c:
            boolean r0 = r13.A05(r7)
            if (r0 == 0) goto L73
            int r1 = r1 + r10
        L73:
            int r0 = r5.topMargin
            int r1 = r1 + r0
            int r6 = r6 + r2
            int r0 = r9 + r1
            r8.layout(r2, r1, r6, r0)
            int r0 = r5.bottomMargin
            int r9 = r9 + r0
            int r9 = r9 + r1
            r1 = r9
        L81:
            int r7 = r7 + 1
            goto L36
        L84:
            int r2 = r11 - r6
            int r0 = r5.rightMargin
            goto L93
        L89:
            r0 = 2
            int r2 = r17 - r6
            int r2 = r2 / r0
            int r2 = r2 + r12
            int r0 = r5.leftMargin
            int r2 = r2 + r0
            int r0 = r5.rightMargin
        L93:
            int r2 = r2 - r0
            goto L6c
        L95:
            int r10 = r0.getIntrinsicHeight()
            goto L36
        L9a:
            int r1 = r13.getPaddingTop()
            int r1 = r1 + r18
            int r1 = r1 - r16
            int r1 = r1 - r2
            goto L30
        La4:
            int r0 = r13.getPaddingTop()
            int r18 = r18 - r16
            int r18 = r18 - r2
            int r1 = r18 >> 1
            int r1 = r1 + r0
            goto L30
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        ViewGroup viewGroup = null;
        View view2 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    viewGroup = childAt;
                } else if ((id != R.id.contentPanel && id != R.id.customPanel) || view2 != null) {
                    super.onMeasure(i, i2);
                    return;
                } else {
                    view2 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (viewGroup != null) {
            viewGroup.measure(i, 0);
            i4 = viewGroup.getMinimumHeight();
            if (i4 <= 0) {
                if (viewGroup instanceof ViewGroup) {
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2.getChildCount() == 1) {
                        View childAt2 = viewGroup2.getChildAt(0);
                        i4 = childAt2.getMinimumHeight();
                        if (i4 <= 0) {
                            i4 = 0;
                            if (childAt2 instanceof ViewGroup) {
                                ViewGroup viewGroup3 = (ViewGroup) childAt2;
                                if (viewGroup3.getChildCount() == 1) {
                                    i4 = A00(viewGroup3.getChildAt(0));
                                }
                            }
                        }
                    }
                }
                i4 = 0;
            }
            i5 = viewGroup.getMeasuredHeight() - i4;
            paddingBottom += i4;
            i3 = View.combineMeasuredStates(i3, viewGroup.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view2 != null) {
            view2.measure(i, mode != 0 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode) : 0);
            i6 = view2.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingBottom;
        if (viewGroup != null) {
            int i9 = paddingBottom - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            viewGroup.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingBottom = i9 + viewGroup.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, viewGroup.getMeasuredState());
        }
        if (view2 != null && i8 > 0) {
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingBottom = (paddingBottom - i6) + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt3 = getChildAt(i11);
            if (childAt3.getVisibility() != 8) {
                i10 = Math.max(i10, childAt3.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt4 = getChildAt(i12);
                if (childAt4.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt4.getLayoutParams();
                    if (marginLayoutParams.width == -1) {
                        int i13 = marginLayoutParams.height;
                        marginLayoutParams.height = childAt4.getMeasuredHeight();
                        measureChildWithMargins(childAt4, makeMeasureSpec, 0, i2, 0);
                        marginLayoutParams.height = i13;
                    }
                }
            }
        }
    }
}
