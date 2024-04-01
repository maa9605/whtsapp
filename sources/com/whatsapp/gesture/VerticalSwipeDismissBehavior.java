package com.whatsapp.gesture;

import X.AbstractC08910cJ;
import X.AbstractC13450lH;
import X.C0AT;
import X.C13460lI;
import X.InterfaceC61212vm;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class VerticalSwipeDismissBehavior extends AbstractC08910cJ {
    public float A01;
    public int A03;
    public VelocityTracker A04;
    public C13460lI A05;
    public InterfaceC61212vm A06;
    public WeakReference A07;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float A02 = 0.0f;
    public float A00 = 0.2f;
    public boolean A08 = true;
    public final AbstractC13450lH A0D = new AbstractC13450lH() { // from class: X.3BT
        public int A00 = -1;
        public int A01;

        @Override // X.AbstractC13450lH
        public int A01(View view) {
            return view.getHeight();
        }

        @Override // X.AbstractC13450lH
        public int A02(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // X.AbstractC13450lH
        public int A03(View view, int i, int i2) {
            int width = this.A01 - view.getWidth();
            return Math.min(Math.max(width, i), view.getWidth() + this.A01);
        }

        @Override // X.AbstractC13450lH
        public void A04(int i) {
            InterfaceC61212vm interfaceC61212vm = VerticalSwipeDismissBehavior.this.A06;
            if (interfaceC61212vm != null) {
                interfaceC61212vm.AJc(i);
            }
        }

        @Override // X.AbstractC13450lH
        public void A05(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC61212vm interfaceC61212vm;
            InterfaceC61212vm interfaceC61212vm2;
            this.A00 = -1;
            VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = VerticalSwipeDismissBehavior.this;
            if (verticalSwipeDismissBehavior.A0J(view, f2, this.A01)) {
                int top = view.getTop();
                int i2 = this.A01;
                if (top < i2) {
                    i = i2 - view.getHeight();
                } else {
                    i = i2 + view.getHeight();
                }
                z = true;
            } else {
                i = this.A01;
                z = false;
            }
            if (verticalSwipeDismissBehavior.A08) {
                if (z && (interfaceC61212vm2 = verticalSwipeDismissBehavior.A06) != null) {
                    interfaceC61212vm2.AJR(view);
                } else if (!verticalSwipeDismissBehavior.A05.A0E(view.getLeft(), i)) {
                } else {
                    view.postOnAnimation(new RunnableEBaseShape1S0210000_I1(verticalSwipeDismissBehavior, view, z, 1));
                }
            } else if (verticalSwipeDismissBehavior.A05.A0E(view.getLeft(), i)) {
                view.postOnAnimation(new RunnableEBaseShape1S0210000_I1(verticalSwipeDismissBehavior, view, z, 1));
            } else if (!z || (interfaceC61212vm = verticalSwipeDismissBehavior.A06) == null) {
            } else {
                interfaceC61212vm.AJR(view);
            }
        }

        @Override // X.AbstractC13450lH
        public void A06(View view, int i) {
            if (this.A00 == -1) {
                this.A00 = i;
                this.A01 = view.getTop();
            }
            ViewParent parent = view.getParent();
            if (parent != null) {
                if (parent instanceof CoordinatorLayout) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        if (((C08930cL) viewGroup.getChildAt(i2).getLayoutParams()).A0A == VerticalSwipeDismissBehavior.this) {
                            return;
                        }
                    }
                }
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // X.AbstractC13450lH
        public void A07(View view, int i, int i2, int i3, int i4) {
            InterfaceC61212vm interfaceC61212vm = VerticalSwipeDismissBehavior.this.A06;
            if (interfaceC61212vm != null) {
                interfaceC61212vm.AOl(view, Math.min(1.0f, (Math.abs(i2) * 1.0f) / view.getHeight()));
            }
        }

        @Override // X.AbstractC13450lH
        public boolean A08(View view, int i) {
            return !VerticalSwipeDismissBehavior.this.A0C;
        }
    };

    public VerticalSwipeDismissBehavior(Context context) {
        this.A01 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.AbstractC08910cJ
    public void A05(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        WeakReference weakReference = this.A07;
        if (weakReference != null && view2 == weakReference.get() && this.A0A) {
            VelocityTracker velocityTracker = this.A04;
            if (velocityTracker == null) {
                yVelocity = 0.0f;
            } else {
                velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A01);
                yVelocity = this.A04.getYVelocity(this.A03);
            }
            if (!A0J(view, yVelocity, 0)) {
                if (this.A05.A0J(view, view.getLeft(), 0)) {
                    view.postOnAnimation(new RunnableEBaseShape1S0210000_I1(this, view, false, 1));
                }
            } else {
                this.A06.AJR(view);
            }
            this.A0A = false;
        }
    }

    @Override // X.AbstractC08910cJ
    public void A07(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (view2 != this.A07.get()) {
            return;
        }
        int top = view.getTop();
        if (i2 > 0) {
            if (!view2.canScrollVertically(1)) {
                iArr[1] = i2;
                C0AT.A0T(view, -i2);
                this.A0A = true;
            } else if (top > 0) {
                int min = Math.min(i2, top);
                iArr[1] = min;
                C0AT.A0T(view, -min);
            }
        } else if (i2 < 0) {
            if (!view2.canScrollVertically(-1)) {
                iArr[1] = i2;
                C0AT.A0T(view, -i2);
                this.A0A = true;
            } else if (top < 0) {
                int max = Math.max(i2, top);
                iArr[1] = max;
                C0AT.A0T(view, -max);
            }
        }
        if (this.A0A) {
            this.A06.AOl(view, Math.min(1.0f, (Math.abs(view.getTop()) * 1.0f) / view.getHeight()));
        }
    }

    @Override // X.AbstractC08910cJ
    public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
        int top = view.getTop();
        coordinatorLayout.A0B(view, i);
        if (this.A0A) {
            C0AT.A0T(view, top - view.getTop());
        }
        this.A07 = new WeakReference(A0I(view));
        return true;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A04;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A04 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A04;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A04 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        boolean z = this.A09;
        if (actionMasked == 0) {
            z = coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A09 = z;
            WeakReference weakReference = this.A07;
            if (weakReference != null && (view2 = (View) weakReference.get()) != null && coordinatorLayout.A0H(view2, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.A03 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.A0C = true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A0C = false;
            this.A09 = false;
            this.A03 = -1;
        }
        if (z) {
            C13460lI c13460lI = this.A05;
            if (c13460lI == null) {
                if (this.A0B) {
                    float f = this.A02;
                    c13460lI = new C13460lI(coordinatorLayout.getContext(), coordinatorLayout, this.A0D);
                    c13460lI.A06 = (int) ((1.0f / f) * c13460lI.A06);
                } else {
                    c13460lI = new C13460lI(coordinatorLayout.getContext(), coordinatorLayout, this.A0D);
                }
                this.A05 = c13460lI;
            }
            return c13460lI.A0G(motionEvent);
        }
        return false;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0C(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A04;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A04 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A04;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A04 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        C13460lI c13460lI = this.A05;
        if (c13460lI != null) {
            c13460lI.A08(motionEvent);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0E(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        this.A07.get();
        return false;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.A0A = false;
        return (i & 2) != 0;
    }

    public final View A0I(View view) {
        if (C0AT.A0i(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A0I = A0I(viewGroup.getChildAt(i));
                if (A0I != null) {
                    return A0I;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean A0J(View view, float f, int i) {
        if (Math.abs(f) > (view.getHeight() << 1)) {
            return true;
        }
        return Math.abs(view.getTop() - i) >= Math.round(((float) view.getHeight()) * 0.2f);
    }
}
