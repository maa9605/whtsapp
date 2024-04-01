package androidx.appcompat.widget;

import X.C0UY;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public int A00;
    public boolean A01;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = -1;
        int[] iArr = C0UY.A0F;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.A01 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r3 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r3 = android.view.View.MeasureSpec.getSize(r7)
            boolean r0 = r6.A01
            r2 = 0
            if (r0 == 0) goto L19
            int r0 = r6.A00
            if (r3 <= r0) goto L17
            int r1 = r6.getOrientation()
            r0 = 1
            if (r1 != r0) goto L17
            r6.setStacked(r2)
        L17:
            r6.A00 = r3
        L19:
            int r1 = r6.getOrientation()
            r0 = 1
            if (r1 == r0) goto L21
            r0 = 0
        L21:
            r4 = 1
            if (r0 != 0) goto Lca
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto Lca
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r3 = 1
        L33:
            super.onMeasure(r0, r8)
            boolean r0 = r6.A01
            if (r0 == 0) goto Lc7
            int r0 = r6.getOrientation()
            if (r0 == r4) goto Lc7
            int r1 = r6.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto Lc7
            r6.setStacked(r4)
        L4e:
            super.onMeasure(r7, r8)
        L51:
            r5 = 0
            int r1 = r6.getChildCount()
        L56:
            if (r5 >= r1) goto Laf
            android.view.View r0 = r6.getChildAt(r5)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lc4
            if (r5 < 0) goto Laf
            android.view.View r3 = r6.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r6.getPaddingTop()
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r0
            int r0 = r1.topMargin
            int r3 = r3 + r0
            int r0 = r1.bottomMargin
            int r3 = r3 + r0
            int r3 = r3 + r2
            int r0 = r6.getOrientation()
            if (r0 != r4) goto Lbe
            int r5 = r5 + r4
            int r1 = r6.getChildCount()
        L89:
            if (r5 >= r1) goto Lbc
            android.view.View r0 = r6.getChildAt(r5)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb9
            if (r5 < 0) goto Lbc
            android.view.View r0 = r6.getChildAt(r5)
            int r2 = r0.getPaddingTop()
            r1 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r1
            int r0 = (int) r0
            int r2 = r2 + r0
            int r2 = r2 + r3
        Laf:
            int r0 = r6.getMinimumHeight()
            if (r0 == r2) goto Lb8
            r6.setMinimumHeight(r2)
        Lb8:
            return
        Lb9:
            int r5 = r5 + 1
            goto L89
        Lbc:
            r2 = r3
            goto Laf
        Lbe:
            int r2 = r6.getPaddingBottom()
            int r2 = r2 + r3
            goto Laf
        Lc4:
            int r5 = r5 + 1
            goto L56
        Lc7:
            if (r3 == 0) goto L51
            goto L4e
        Lca:
            r0 = r7
            r3 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }
}
