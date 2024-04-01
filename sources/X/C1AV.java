package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.1AV  reason: invalid class name */
/* loaded from: classes.dex */
public class C1AV extends FrameLayout.LayoutParams {
    public float A00;
    public int A01;

    public C1AV() {
        super(-1, -1);
        this.A01 = 0;
        this.A00 = 0.5f;
    }

    public C1AV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 0;
        this.A00 = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A0M);
        this.A01 = obtainStyledAttributes.getInt(0, 0);
        this.A00 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public C1AV(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A01 = 0;
        this.A00 = 0.5f;
    }
}
