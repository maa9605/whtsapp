package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2ie */
/* loaded from: classes2.dex */
public class ScaleGestureDetector$OnScaleGestureListenerC54382ie extends AbstractC54402ig implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Rect A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public InterfaceC72913an A0F;
    public C2Zb A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int[] A0N;
    public final ScaleGestureDetector A0O;
    public final View A0P;
    public final C13460lI A0Q;
    public final ArrayList A0R;

    public ScaleGestureDetector$OnScaleGestureListenerC54382ie(Context context, View view) {
        super(context);
        this.A00 = 1.0f;
        this.A0I = true;
        this.A06 = 0;
        this.A0R = new ArrayList(4);
        if (view == null) {
            this.A0P = this;
            view = this;
        } else {
            this.A0P = view;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        this.A0B = new Rect(i, iArr[1], this.A0P.getWidth() + i, this.A0P.getHeight() + iArr[1]);
        C13460lI c13460lI = new C13460lI(getContext(), this, new C83903ss(this));
        c13460lI.A06 = (int) ((1.0f / 1.0f) * c13460lI.A06);
        this.A0Q = c13460lI;
        c13460lI.A01 = 2000.0f;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A0O = scaleGestureDetector;
        if (Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(false);
        }
        View decorView = C018308n.A00(context).getWindow().getDecorView();
        C0AT.A0d(decorView, new C0V5() { // from class: X.3sd
            {
                ScaleGestureDetector$OnScaleGestureListenerC54382ie.this = this;
            }

            @Override // X.C0V5
            public final C07110Wv AHK(View view2, C07110Wv c07110Wv) {
                return ScaleGestureDetector$OnScaleGestureListenerC54382ie.this.A08(view2, c07110Wv);
            }
        });
        C0AT.A0L(decorView);
    }

    public static int A00(ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie, int i) {
        return scaleGestureDetector$OnScaleGestureListenerC54382ie.A06(i) + (scaleGestureDetector$OnScaleGestureListenerC54382ie.getRightOfDraggableArea() - i);
    }

    public static int A01(ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie, int i) {
        return scaleGestureDetector$OnScaleGestureListenerC54382ie.getLeftOfDraggableArea() - scaleGestureDetector$OnScaleGestureListenerC54382ie.A06(i);
    }

    public final int A02(int i) {
        int i2 = this.A04;
        int leftOfDraggableArea = getLeftOfDraggableArea();
        int A06 = A06(i);
        int i3 = leftOfDraggableArea - A06;
        int rightOfDraggableArea = A06 + (getRightOfDraggableArea() - i);
        if (i2 > (rightOfDraggableArea >> 1) + i3) {
            return rightOfDraggableArea;
        }
        return i3;
    }

    public final int A03(int i) {
        int A05 = A05(i);
        int A04 = A04(i);
        int i2 = this.A05;
        return Math.abs(i2 - A05) >= Math.abs(i2 - A04) ? A04 : A05;
    }

    public final int A04(int i) {
        int A07 = A07(i);
        return Math.max(A07 + (getBottomOfDraggableArea() - i), getTopOfDraggableArea() - A07);
    }

    public final int A05(int i) {
        int A07 = A07(i);
        return Math.min(A07 + (getBottomOfDraggableArea() - i), getTopOfDraggableArea() - A07);
    }

    public final int A06(int i) {
        return (int) (((1.0f - this.A00) * i) / 2.0f);
    }

    public final int A07(int i) {
        return (int) (((1.0f - this.A00) * i) / 2.0f);
    }

    public /* synthetic */ C07110Wv A08(View view, C07110Wv c07110Wv) {
        if (this.A0K) {
            View view2 = this.A0D;
            if (view2 != null) {
                view2.setPadding(c07110Wv.A02(), this.A0D.getPaddingTop(), c07110Wv.A03(), this.A0D.getPaddingBottom());
            }
            C07110Wv A0F = C0AT.A0F(view, c07110Wv);
            return A0F.A05(0, A0F.A04(), 0, A0F.A01());
        }
        View view3 = this.A0D;
        if (view3 != null) {
            view3.setPadding(0, 0, 0, 0);
        }
        return C0AT.A0F(view, c07110Wv);
    }

    public void A09() {
        int[] iArr = new int[2];
        View view = this.A0P;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        this.A0B = new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public final void A0A(float f) {
        if (this.A0C == null) {
            return;
        }
        Iterator it = this.A0R.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            try {
                int i = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity;
                if ((i & 48) == 48) {
                    view.setPivotY(0.0f);
                    view.setPadding(view.getPaddingLeft(), (int) (this.A06 * f), view.getPaddingRight(), view.getPaddingBottom());
                }
                if ((i & 80) == 80) {
                    view.setPivotY(view.getMeasuredHeight());
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) (this.A06 * f));
                }
                if ((i & 8388611) == 8388611) {
                    view.setPivotX(0.0f);
                    view.setPadding((int) (this.A06 * f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                }
                if ((i & 8388613) == 8388613) {
                    view.setPivotX(view.getMeasuredWidth());
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) (this.A06 * f), view.getPaddingBottom());
                }
            } catch (Exception unused) {
            }
            float f2 = 1.0f / f;
            view.setScaleX(f2);
            view.setScaleY(f2);
        }
    }

    public void A0B(final boolean z) {
        if (this.A0C == null || this.A0H) {
            return;
        }
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3am
            {
                ScaleGestureDetector$OnScaleGestureListenerC54382ie.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = ScaleGestureDetector$OnScaleGestureListenerC54382ie.this;
                View view = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C;
                if (view != null && scaleGestureDetector$OnScaleGestureListenerC54382ie.A0J) {
                    view.setPivotX(view.getMeasuredWidth() >> 1);
                    View view2 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C;
                    view2.setPivotY(view2.getMeasuredHeight() >> 1);
                    if (z) {
                        int i = scaleGestureDetector$OnScaleGestureListenerC54382ie.A09;
                        int i2 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0A;
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A09();
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0Q.A0J(scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C, i, i2);
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = i;
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = i2;
                    } else {
                        int A02 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A02(scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C.getWidth());
                        int A03 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A03(scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C.getHeight());
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A09();
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A0Q.A0J(scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C, A02, A03);
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = A02;
                        scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = A03;
                    }
                    scaleGestureDetector$OnScaleGestureListenerC54382ie.A0J = false;
                } else if (view == null || scaleGestureDetector$OnScaleGestureListenerC54382ie.A0K) {
                } else {
                    int A022 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A02(view.getWidth());
                    int A032 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A03(scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C.getHeight());
                    scaleGestureDetector$OnScaleGestureListenerC54382ie.A09();
                    scaleGestureDetector$OnScaleGestureListenerC54382ie.A0Q.A0J(scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C, A022, A032);
                    scaleGestureDetector$OnScaleGestureListenerC54382ie.A04 = A022;
                    scaleGestureDetector$OnScaleGestureListenerC54382ie.A05 = A032;
                }
            }
        });
        requestLayout();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.A0Q.A0B()) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.A0I) {
            canvas.clipRect(this.A0B);
        }
        super.dispatchDraw(canvas);
    }

    private int getBottomOfDraggableArea() {
        return this.A0B.bottom - this.A01;
    }

    public float getCurrentChildScale() {
        return this.A00;
    }

    private int getLeftOfDraggableArea() {
        return this.A01 + this.A0B.left;
    }

    private int getRightOfDraggableArea() {
        return this.A0B.right - this.A01;
    }

    private int getTopOfDraggableArea() {
        return this.A01 + this.A0B.top;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0Q.A0G(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A0C;
        if (view == null || this.A0K) {
            return;
        }
        if (!this.A0H) {
            view.setScaleX(this.A00);
            this.A0C.setScaleY(this.A00);
        }
        View view2 = this.A0C;
        int i5 = this.A04;
        view2.layout(i5, this.A05, view2.getWidth() + i5, this.A0C.getHeight() + this.A05);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0C == null) {
            return false;
        }
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        float f = scaleFactor;
        if (scaleFactor > 1.0f) {
            this.A00 = 1.0f;
            f = 1.0f;
        } else if (scaleFactor < 0.67f) {
            this.A00 = 0.67f;
            f = 0.67f;
        }
        this.A0C.setScaleX(f);
        this.A0C.setScaleY(this.A00);
        A0A(this.A00);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.A0C != null;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        View view = this.A0C;
        if (view == null) {
            return;
        }
        if (this.A0K) {
            if (this.A00 <= 0.85f) {
                this.A0J = true;
                InterfaceC72913an interfaceC72913an = this.A0F;
                if (interfaceC72913an != null) {
                    interfaceC72913an.AJU(true);
                }
                C2Zb c2Zb = this.A0G;
                if (c2Zb != null && c2Zb.A05 != null) {
                    c2Zb.A0C(0, getResources().getColor(R.color.black));
                    this.A0G.setPlayerElevation(6);
                    this.A0G.setVisibility(0);
                }
            }
            this.A0C.animate().scaleX(this.A00).scaleY(this.A00).setDuration(125L);
        } else {
            int i = (this.A00 > 0.85f ? 1 : (this.A00 == 0.85f ? 0 : -1));
            ViewPropertyAnimator animate = view.animate();
            if (i <= 0) {
                animate.scaleX(0.67f).scaleY(0.67f).setDuration(125L);
                this.A00 = 0.67f;
            } else {
                animate.scaleX(1.0f).scaleY(1.0f).setDuration(125L);
                this.A00 = 1.0f;
            }
        }
        this.A0C.setScaleX(this.A00);
        this.A0C.setScaleY(this.A00);
        A0A(this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
        if (r8.getY() <= ((r7.A0C.getHeight() + r7.A05) - A07(r7.A0C.getHeight()))) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.0lI r5 = r7.A0Q
            int r0 = r5.A03
            r4 = 1
            r6 = 0
            if (r0 == r4) goto L7a
            android.view.ScaleGestureDetector r0 = r7.A0O
            boolean r0 = r0.isInProgress()
            if (r0 != 0) goto L7a
            android.view.View r0 = r7.A0C
            if (r0 == 0) goto L8b
            float r2 = r8.getX()
            int r1 = r7.A04
            android.view.View r0 = r7.A0C
            int r0 = r0.getWidth()
            int r0 = r7.A06(r0)
            int r0 = r0 + r1
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L8b
            float r3 = r8.getX()
            int r2 = r7.A04
            android.view.View r0 = r7.A0C
            int r1 = r0.getWidth()
            int r1 = r1 + r2
            android.view.View r0 = r7.A0C
            int r0 = r0.getWidth()
            int r0 = r7.A06(r0)
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L8b
            float r2 = r8.getY()
            int r1 = r7.A05
            android.view.View r0 = r7.A0C
            int r0 = r0.getHeight()
            int r0 = r7.A07(r0)
            int r0 = r0 + r1
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L8b
            float r3 = r8.getY()
            int r2 = r7.A05
            android.view.View r0 = r7.A0C
            int r1 = r0.getHeight()
            int r1 = r1 + r2
            android.view.View r0 = r7.A0C
            int r0 = r0.getHeight()
            int r0 = r7.A07(r0)
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L8b
        L7a:
            boolean r0 = r7.A0M
            if (r0 != 0) goto L8b
            boolean r0 = r7.A0H
            if (r0 != 0) goto L8b
            android.view.ScaleGestureDetector r0 = r7.A0O
            r0.onTouchEvent(r8)
            r5.A08(r8)
            return r4
        L8b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetector$OnScaleGestureListenerC54382ie.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        View view2 = this.A0C;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0E = null;
        this.A0C = view;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.A0C, "scaleX", this.A00), ObjectAnimator.ofFloat(this.A0C, "scaleY", this.A00), ObjectAnimator.ofFloat(this.A0C, "translationX", 0.0f), ObjectAnimator.ofFloat(this.A0C, "translationY", 0.0f), ObjectAnimator.ofFloat(this.A0C, "alpha", 0.0f, 1.0f));
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(130L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.3al
            {
                ScaleGestureDetector$OnScaleGestureListenerC54382ie.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ScaleGestureDetector$OnScaleGestureListenerC54382ie scaleGestureDetector$OnScaleGestureListenerC54382ie = ScaleGestureDetector$OnScaleGestureListenerC54382ie.this;
                View view3 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C;
                if (view3 != null) {
                    scaleGestureDetector$OnScaleGestureListenerC54382ie.A0H = false;
                    view3.setPivotX(view3.getMeasuredWidth() >> 1);
                    View view4 = scaleGestureDetector$OnScaleGestureListenerC54382ie.A0C;
                    view4.setPivotY(view4.getMeasuredHeight() >> 1);
                }
            }
        });
        animatorSet.start();
        int[] iArr = this.A0N;
        if (iArr != null) {
            for (int i : iArr) {
                View findViewById = this.A0C.findViewById(i);
                if (findViewById != null) {
                    this.A0R.add(findViewById);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A0R.clear();
        this.A0C = null;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setChildPadding(int i) {
        this.A01 = i;
    }

    public void setClipToDependentView(boolean z) {
        this.A0I = z;
    }

    public void setControlView(C2Zb c2Zb) {
        this.A0G = c2Zb;
        this.A0D = c2Zb.findViewById(R.id.header);
    }

    public void setDismissListener(InterfaceC72913an interfaceC72913an) {
        this.A0F = interfaceC72913an;
    }

    public void setExitingFullScreen(boolean z) {
        this.A0J = z;
    }

    public void setFullscreen(boolean z) {
        this.A0K = z;
    }

    public void setLockChild(boolean z) {
        this.A0M = z;
    }
}
