package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0eg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09740eg extends ViewGroup.LayoutParams {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public C09740eg() {
        super(-1, -1);
        this.A00 = 0.0f;
    }

    public C09740eg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.A0s);
        this.A02 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
