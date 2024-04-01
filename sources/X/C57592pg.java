package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.2pg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C57592pg extends Animation {
    public boolean A00;
    public final /* synthetic */ CircularRevealView A01;

    public C57592pg(CircularRevealView circularRevealView, boolean z) {
        this.A01 = circularRevealView;
        this.A00 = z;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        CircularRevealView circularRevealView = this.A01;
        if (this.A00) {
            f = 1.0f - f;
        }
        circularRevealView.A00 = f;
        circularRevealView.invalidate();
    }
}
