package X;

import android.view.animation.Interpolator;

/* renamed from: X.0no  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation.InterpolatorC14930no implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
