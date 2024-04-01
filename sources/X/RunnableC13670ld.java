package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.0ld  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC13670ld extends AnimationSet implements Runnable {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final ViewGroup A04;

    public RunnableC13670ld(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.A00 = true;
        this.A04 = viewGroup;
        this.A03 = view;
        addAnimation(animation);
        this.A04.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.A00 = true;
        if (this.A01) {
            return !this.A02;
        }
        if (!super.getTransformation(j, transformation)) {
            this.A01 = true;
            View$OnAttachStateChangeListenerC13130ke.A00(this.A04, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f) {
        this.A00 = true;
        if (this.A01) {
            return !this.A02;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.A01 = true;
            View$OnAttachStateChangeListenerC13130ke.A00(this.A04, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.A01 && this.A00) {
            this.A00 = false;
            this.A04.post(this);
            return;
        }
        this.A04.endViewTransition(this.A03);
        this.A02 = true;
    }
}
