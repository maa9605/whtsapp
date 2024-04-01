package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.0U2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0U2 extends ViewGroup.MarginLayoutParams {
    public int A00;

    public C0U2() {
        super(-2, -2);
        this.A00 = 0;
        this.A00 = 21;
    }

    public C0U2(int i, int i2) {
        super(i, i2);
        this.A00 = 0;
        this.A00 = 8388627;
    }

    public C0U2(C0U2 c0u2) {
        super((ViewGroup.MarginLayoutParams) c0u2);
        this.A00 = 0;
        this.A00 = c0u2.A00;
    }

    public C0U2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A01);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C0U2(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A00 = 0;
    }
}
