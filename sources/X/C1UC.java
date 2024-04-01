package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1UC  reason: invalid class name */
/* loaded from: classes.dex */
public class C1UC extends AbstractC08920cK {
    public static final int[] A03 = {16843284};
    public int A00;
    public Drawable A01;
    public final Rect A02 = new Rect();

    public C1UC(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A03);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A01 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.A00 = i;
    }

    @Override // X.AbstractC08920cK
    public void A00(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.A0S == null || this.A01 == null) {
            return;
        }
        int i3 = 0;
        if (this.A00 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                Rect rect = this.A02;
                RecyclerView.A03(childAt, rect);
                int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.A01.setBounds(i2, round - this.A01.getIntrinsicHeight(), width, round);
                this.A01.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i3);
            C0SV c0sv = recyclerView.A0S;
            Rect rect2 = this.A02;
            if (c0sv != null) {
                RecyclerView.A03(childAt2, rect2);
                int round2 = Math.round(childAt2.getTranslationX()) + rect2.right;
                this.A01.setBounds(round2 - this.A01.getIntrinsicWidth(), i, round2, height);
                this.A01.draw(canvas);
                i3++;
            } else {
                throw null;
            }
        }
        canvas.restore();
    }

    @Override // X.AbstractC08920cK
    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
        Drawable drawable = this.A01;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.A00 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
