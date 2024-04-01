package X;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: X.3XO  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3XO extends Scroller {
    public float A00;

    public C3XO(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        float f = this.A00;
        if (f != 0.0f) {
            i5 = (int) (f * i5);
        }
        super.startScroll(i, i2, i3, i4, i5);
    }
}
