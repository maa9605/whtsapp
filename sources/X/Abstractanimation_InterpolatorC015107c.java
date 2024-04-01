package X;

import android.view.animation.Interpolator;

/* renamed from: X.07c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class Abstractanimation.InterpolatorC015107c implements Interpolator {
    public final float A00;
    public final float[] A01;

    public Abstractanimation.InterpolatorC015107c(float[] fArr) {
        this.A01 = fArr;
        this.A00 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.A01;
        int length = fArr.length;
        int min = Math.min((int) ((length - 1) * f), length - 2);
        float f2 = this.A00;
        float f3 = (f - (min * f2)) / f2;
        float f4 = fArr[min];
        return ((fArr[min + 1] - f4) * f3) + f4;
    }
}
