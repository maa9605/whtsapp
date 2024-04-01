package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: X.1AS  reason: invalid class name */
/* loaded from: classes.dex */
public class C1AS extends LinearLayout.LayoutParams {
    public int A00;
    public Interpolator A01;

    public C1AS() {
        super(-1, -2);
        this.A00 = 1;
    }

    public C1AS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A08);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C1AS(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A00 = 1;
    }

    public C1AS(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A00 = 1;
    }

    public C1AS(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.A00 = 1;
    }
}
