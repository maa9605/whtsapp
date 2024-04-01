package X;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: X.0pl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16050pl implements TypeEvaluator {
    public Rect A00;

    public C16050pl() {
    }

    public C16050pl(Rect rect) {
        this.A00 = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
        Rect rect3 = this.A00;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.A00;
    }
}
