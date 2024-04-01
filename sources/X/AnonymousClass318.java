package X;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.318  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass318 extends Transition {
    public int A00;
    public int A01;
    public final C1M7 A03;
    public final boolean A04;
    public final int[] A05 = new int[2];
    public final Rect A02 = new Rect();

    public AnonymousClass318(C1M7 c1m7, boolean z) {
        this.A03 = c1m7;
        this.A04 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (r0 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void A00(android.transition.TransitionValues r10, android.animation.ValueAnimator r11) {
        /*
            r9 = this;
            android.view.View r4 = r10.view
            boolean r0 = r4 instanceof com.whatsapp.mediaview.PhotoView
            if (r0 != 0) goto La
            boolean r0 = r4 instanceof com.whatsapp.components.button.ThumbnailButton
            if (r0 == 0) goto L69
        La:
            java.lang.Object r0 = r11.getAnimatedValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r7 = r0.floatValue()
            boolean r0 = r9.A04
            if (r0 == 0) goto L1c
            r0 = 1065353216(0x3f800000, float:1.0)
            float r7 = r0 - r7
        L1c:
            int[] r1 = r9.A05
            r4.getLocationOnScreen(r1)
            r0 = 1
            r8 = r1[r0]
            int r0 = r4.getHeight()
            int r1 = r8 + r0
            android.graphics.Rect r5 = r9.A02
            r6 = 0
            r5.left = r6
            int r0 = r4.getWidth()
            r5.right = r0
            int r0 = r9.A00
            r3 = 0
            if (r1 <= r0) goto L6d
            if (r0 <= 0) goto L6d
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6d
            int r2 = r4.getHeight()
            int r0 = r9.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 * r7
            int r0 = (int) r0
            int r2 = r2 - r0
            r5.bottom = r2
        L4d:
            int r1 = r9.A01
            if (r8 >= r1) goto L6a
            if (r1 <= 0) goto L6a
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6a
            int r1 = r1 - r8
            float r0 = (float) r1
            float r7 = r7 * r0
            int r0 = (int) r7
            r5.top = r0
            if (r0 != 0) goto L74
        L5f:
            int r0 = r4.getHeight()
            if (r2 != r0) goto L74
            r0 = 0
            X.C0AT.A0b(r4, r0)
        L69:
            return
        L6a:
            r5.top = r6
            goto L5f
        L6d:
            int r2 = r4.getHeight()
            r5.bottom = r2
            goto L4d
        L74:
            X.C0AT.A0b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass318.A00(android.transition.TransitionValues, android.animation.ValueAnimator):void");
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        if (this.A04) {
            return;
        }
        C1M7 c1m7 = this.A03;
        if (c1m7.A00(R.string.transition_clipper_top).equals(C0AT.A0G(transitionValues.view))) {
            View view = transitionValues.view;
            int[] iArr = this.A05;
            view.getLocationOnScreen(iArr);
            this.A01 = iArr[1];
        }
        if (c1m7.A00(R.string.transition_clipper_bottom).equals(C0AT.A0G(transitionValues.view))) {
            View view2 = transitionValues.view;
            int[] iArr2 = this.A05;
            view2.getLocationOnScreen(iArr2);
            this.A00 = transitionValues.view.getHeight() + iArr2[1];
        }
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        if (this.A04) {
            C1M7 c1m7 = this.A03;
            if (c1m7.A00(R.string.transition_clipper_top).equals(C0AT.A0G(transitionValues.view))) {
                View view = transitionValues.view;
                int[] iArr = this.A05;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (c1m7.A00(R.string.transition_clipper_bottom).equals(C0AT.A0G(transitionValues.view))) {
                View view2 = transitionValues.view;
                int[] iArr2 = this.A05;
                view2.getLocationOnScreen(iArr2);
                this.A00 = transitionValues.view.getHeight() + iArr2[1];
            }
        }
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, final TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatEvaluator(), 0, 1);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.310
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AnonymousClass318.this.A00(transitionValues2, valueAnimator);
            }
        });
        return ofObject;
    }
}
