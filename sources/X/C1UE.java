package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1UE  reason: invalid class name */
/* loaded from: classes.dex */
public class C1UE extends AbstractC08920cK implements InterfaceC15190oE {
    public float A00;
    public float A01;
    public int A04;
    public int A05;
    public int A09;
    public int A0A;
    public RecyclerView A0B;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final Drawable A0L;
    public final Drawable A0M;
    public final StateListDrawable A0N;
    public final StateListDrawable A0O;
    public static final int[] A0U = {16842919};
    public static final int[] A0T = new int[0];
    public int A07 = 0;
    public int A06 = 0;
    public boolean A0D = false;
    public boolean A0C = false;
    public int A08 = 0;
    public int A03 = 0;
    public final int[] A0S = new int[2];
    public final int[] A0R = new int[2];
    public final ValueAnimator A0K = ValueAnimator.ofFloat(0.0f, 1.0f);
    public int A02 = 0;
    public final Runnable A0Q = new Runnable() { // from class: X.0ne
        @Override // java.lang.Runnable
        public void run() {
            C1UE c1ue = C1UE.this;
            int i = c1ue.A02;
            if (i == 1) {
                c1ue.A0K.cancel();
            } else if (i != 2) {
                return;
            }
            c1ue.A02 = 3;
            ValueAnimator valueAnimator = c1ue.A0K;
            valueAnimator.setFloatValues(((Number) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    };
    public final AbstractC15200oF A0P = new AbstractC15200oF() { // from class: X.1UD
        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
            if (r5 < r4.A0H) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
            if (r9 < r4.A0H) goto L30;
         */
        @Override // X.AbstractC15200oF
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void A01(androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
            /*
                r12 = this;
                X.1UE r4 = X.C1UE.this
                int r10 = r13.computeHorizontalScrollOffset()
                int r2 = r13.computeVerticalScrollOffset()
                androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
                int r11 = r0.computeVerticalScrollRange()
                int r9 = r4.A06
                int r0 = r11 - r9
                r3 = 1
                r1 = 0
                if (r0 <= 0) goto L1d
                int r5 = r4.A0H
                r0 = 1
                if (r9 >= r5) goto L1e
            L1d:
                r0 = 0
            L1e:
                r4.A0D = r0
                androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
                int r6 = r0.computeHorizontalScrollRange()
                int r5 = r4.A07
                int r0 = r6 - r5
                if (r0 <= 0) goto L31
                int r0 = r4.A0H
                r8 = 1
                if (r5 >= r0) goto L32
            L31:
                r8 = 0
            L32:
                r4.A0C = r8
                boolean r0 = r4.A0D
                if (r0 != 0) goto L42
                if (r8 != 0) goto L42
                int r0 = r4.A08
                if (r0 == 0) goto L41
                r4.A04(r1)
            L41:
                return
            L42:
                r7 = 1073741824(0x40000000, float:2.0)
                if (r0 == 0) goto L5a
                float r2 = (float) r2
                float r0 = (float) r9
                float r1 = r0 / r7
                float r1 = r1 + r2
                float r1 = r1 * r0
                float r0 = (float) r11
                float r1 = r1 / r0
                int r0 = (int) r1
                r4.A09 = r0
                int r0 = r9 * r9
                int r0 = r0 / r11
                int r0 = java.lang.Math.min(r9, r0)
                r4.A0A = r0
            L5a:
                if (r8 == 0) goto L70
                float r2 = (float) r10
                float r0 = (float) r5
                float r1 = r0 / r7
                float r1 = r1 + r2
                float r1 = r1 * r0
                float r0 = (float) r6
                float r1 = r1 / r0
                int r0 = (int) r1
                r4.A04 = r0
                int r0 = r5 * r5
                int r0 = r0 / r6
                int r0 = java.lang.Math.min(r5, r0)
                r4.A05 = r0
            L70:
                int r0 = r4.A08
                if (r0 == 0) goto L76
                if (r0 != r3) goto L41
            L76:
                r4.A04(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1UD.A01(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    };

    @Override // X.InterfaceC15190oE
    public void ANv(boolean z) {
    }

    public C1UE(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.A0O = stateListDrawable;
        this.A0M = drawable;
        this.A0N = stateListDrawable2;
        this.A0L = drawable2;
        this.A0I = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.A0J = Math.max(i, drawable.getIntrinsicWidth());
        this.A0E = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.A0F = Math.max(i, drawable2.getIntrinsicWidth());
        this.A0H = i2;
        this.A0G = i3;
        this.A0O.setAlpha(255);
        this.A0M.setAlpha(255);
        this.A0K.addListener(new AnimatorListenerAdapter() { // from class: X.0nf
            public boolean A00 = false;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.A00 = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (this.A00) {
                    this.A00 = false;
                    return;
                }
                C1UE c1ue = C1UE.this;
                if (((Number) c1ue.A0K.getAnimatedValue()).floatValue() == 0.0f) {
                    c1ue.A02 = 0;
                    c1ue.A04(0);
                    return;
                }
                c1ue.A02 = 2;
                c1ue.A0B.invalidate();
            }
        });
        this.A0K.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ng
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int floatValue = (int) (((Number) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1UE c1ue = C1UE.this;
                c1ue.A0O.setAlpha(floatValue);
                c1ue.A0M.setAlpha(floatValue);
                c1ue.A0B.invalidate();
            }
        });
        RecyclerView recyclerView2 = this.A0B;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0l(this);
                RecyclerView recyclerView3 = this.A0B;
                recyclerView3.A15.remove(this);
                if (recyclerView3.A0U == this) {
                    recyclerView3.A0U = null;
                }
                this.A0B.A0n(this.A0P);
                this.A0B.removeCallbacks(this.A0Q);
            }
            this.A0B = recyclerView;
            recyclerView.A0k(this);
            RecyclerView recyclerView4 = this.A0B;
            recyclerView4.A15.add(this);
            recyclerView4.A0m(this.A0P);
        }
    }

    @Override // X.AbstractC08920cK
    public void A02(Canvas canvas, RecyclerView recyclerView, C0Y0 c0y0) {
        if (this.A07 == this.A0B.getWidth() && this.A06 == this.A0B.getHeight()) {
            if (this.A02 != 0) {
                if (this.A0D) {
                    int i = this.A07;
                    int i2 = this.A0I;
                    int i3 = i - i2;
                    int i4 = this.A09;
                    int i5 = this.A0A;
                    int i6 = i4 - (i5 >> 1);
                    StateListDrawable stateListDrawable = this.A0O;
                    stateListDrawable.setBounds(0, 0, i2, i5);
                    Drawable drawable = this.A0M;
                    drawable.setBounds(0, 0, this.A0J, this.A06);
                    if (C0AT.A05(this.A0B) == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i2, i6);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i2, -i6);
                    } else {
                        canvas.translate(i3, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i6);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i3, -i6);
                    }
                }
                if (this.A0C) {
                    int i7 = this.A06;
                    int i8 = this.A0E;
                    int i9 = i7 - i8;
                    int i10 = this.A04;
                    int i11 = this.A05;
                    int i12 = i10 - (i11 >> 1);
                    StateListDrawable stateListDrawable2 = this.A0N;
                    stateListDrawable2.setBounds(0, 0, i11, i8);
                    Drawable drawable2 = this.A0L;
                    drawable2.setBounds(0, 0, this.A07, this.A0F);
                    canvas.translate(0.0f, i9);
                    drawable2.draw(canvas);
                    canvas.translate(i12, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i12, -i9);
                    return;
                }
                return;
            }
            return;
        }
        this.A07 = this.A0B.getWidth();
        this.A06 = this.A0B.getHeight();
        A04(0);
    }

    public void A03() {
        int i = this.A02;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.A0K.cancel();
        }
        this.A02 = 1;
        ValueAnimator valueAnimator = this.A0K;
        valueAnimator.setFloatValues(((Number) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(int r5) {
        /*
            r4 = this;
            r2 = 2
            if (r5 != r2) goto L4a
            int r0 = r4.A08
            if (r0 == r2) goto L15
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.C1UE.A0U
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0B
            java.lang.Runnable r0 = r4.A0Q
            r1.removeCallbacks(r0)
        L15:
            r4.A03()
        L18:
            int r0 = r4.A08
            if (r0 != r2) goto L37
            if (r5 == r2) goto L34
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.C1UE.A0T
            r1.setState(r0)
            r1 = 1200(0x4b0, float:1.682E-42)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            java.lang.Runnable r3 = r4.A0Q
            r0.removeCallbacks(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0B
            long r0 = (long) r1
            r2.postDelayed(r3, r0)
        L34:
            r4.A08 = r5
            return
        L37:
            r0 = 1
            if (r5 != r0) goto L34
            r1 = 1500(0x5dc, float:2.102E-42)
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            java.lang.Runnable r3 = r4.A0Q
            r0.removeCallbacks(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0B
            long r0 = (long) r1
            r2.postDelayed(r3, r0)
            goto L34
        L4a:
            if (r5 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            r0.invalidate()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UE.A04(int):void");
    }

    public boolean A05(float f, float f2) {
        if (C0AT.A05(this.A0B) == 1) {
            if (f > (this.A0I >> 1)) {
                return false;
            }
        } else if (f < this.A07 - this.A0I) {
            return false;
        }
        int i = this.A09;
        int i2 = this.A0A >> 1;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0 > 0) goto L21;
     */
    @Override // X.InterfaceC15190oE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AL6(androidx.recyclerview.widget.RecyclerView r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r8.A08
            r3 = 1
            r2 = 2
            if (r0 != r3) goto L5e
            float r1 = r10.getX()
            float r0 = r10.getY()
            boolean r7 = r8.A05(r1, r0)
            float r6 = r10.getX()
            float r4 = r10.getY()
            int r1 = r8.A06
            int r0 = r8.A0E
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L38
            int r4 = r8.A04
            int r0 = r8.A05
            int r1 = r0 >> 1
            int r0 = r4 - r1
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L38
            int r1 = r1 + r4
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L39
        L38:
            r1 = 0
        L39:
            int r0 = r10.getAction()
            if (r0 != 0) goto L61
            if (r7 != 0) goto L51
            if (r1 == 0) goto L61
        L43:
            r8.A03 = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A00 = r0
        L4d:
            r8.A04(r2)
            return r3
        L51:
            if (r1 != 0) goto L43
            r8.A03 = r2
            float r0 = r10.getY()
            int r0 = (int) r0
            float r0 = (float) r0
            r8.A01 = r0
            goto L4d
        L5e:
            if (r0 != r2) goto L61
            return r3
        L61:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UE.AL6(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r5 > (r1 + r3)) goto L21;
     */
    @Override // X.InterfaceC15190oE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void APi(androidx.recyclerview.widget.RecyclerView r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1UE.APi(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):void");
    }
}
