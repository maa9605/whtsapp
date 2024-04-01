package X;

import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: X.1iT */
/* loaded from: classes.dex */
public class C35021iT extends C0DJ {
    public final /* synthetic */ C1KI A00;

    public C35021iT(C1KI c1ki) {
        this.A00 = c1ki;
    }

    @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        final ImageView imageView = this.A00.A01;
        imageView.post(new Runnable() { // from class: X.1Fy
            {
                C35021iT.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C35021iT c35021iT = C35021iT.this;
                c35021iT.A00.A02.A0o.removeView(imageView);
            }
        });
    }
}
