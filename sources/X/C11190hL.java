package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.0hL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11190hL extends ViewGroup.MarginLayoutParams {
    public float A00;
    public int A01;

    public C11190hL(int i) {
        super(i, -2);
        this.A01 = -1;
        this.A00 = 0.0f;
    }

    public C11190hL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A0O);
        this.A00 = obtainStyledAttributes.getFloat(3, 0.0f);
        this.A01 = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C11190hL(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A01 = -1;
    }
}
