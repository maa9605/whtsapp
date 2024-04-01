package X;

import android.animation.Animator;
import android.view.animation.Animation;

/* renamed from: X.0XN  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XN {
    public final Animator A00;
    public final Animation A01;

    public C0XN(Animator animator) {
        this.A01 = null;
        this.A00 = animator;
    }

    public C0XN(Animation animation) {
        this.A01 = animation;
        this.A00 = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}
