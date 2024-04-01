package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.0oC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15170oC extends ViewGroup.MarginLayoutParams {
    public C0TS A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C15170oC(int i, int i2) {
        super(i, i2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C15170oC(C15170oC c15170oC) {
        super((ViewGroup.LayoutParams) c15170oC);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C15170oC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C15170oC(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C15170oC(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public boolean A00() {
        return (this.A00.A00 & 2) != 0;
    }
}
