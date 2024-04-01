package com.google.android.material.behavior;

import X.AbstractC08910cJ;
import X.AbstractC13450lH;
import X.C13460lI;
import X.InterfaceC24251Ab;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class SwipeDismissBehavior extends AbstractC08910cJ {
    public C13460lI A04;
    public InterfaceC24251Ab A05;
    public boolean A06;
    public int A03 = 2;
    public float A02 = 0.5f;
    public float A01 = 0.0f;
    public float A00 = 0.5f;
    public final AbstractC13450lH A07 = new AbstractC13450lH() { // from class: X.1eJ
        public int A00 = -1;
        public int A01;

        {
            SwipeDismissBehavior.this = this;
        }

        @Override // X.AbstractC13450lH
        public int A00(View view) {
            return view.getWidth();
        }

        @Override // X.AbstractC13450lH
        public int A02(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = C0AT.A05(view) == 1;
            int i3 = SwipeDismissBehavior.this.A03;
            if (i3 == 0) {
                if (z) {
                    width = this.A01 - view.getWidth();
                    width2 = this.A01;
                } else {
                    width = this.A01;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.A01 - view.getWidth();
                width2 = view.getWidth() + this.A01;
            } else if (z) {
                width = this.A01;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.A01 - view.getWidth();
                width2 = this.A01;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // X.AbstractC13450lH
        public int A03(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // X.AbstractC13450lH
        public void A04(int i) {
            InterfaceC24251Ab interfaceC24251Ab = SwipeDismissBehavior.this.A05;
            if (interfaceC24251Ab != null) {
                C32751ee c32751ee = (C32751ee) interfaceC24251Ab;
                if (c32751ee == null) {
                    throw null;
                }
                if (i == 0) {
                    C1BJ.A00().A03(c32751ee.A00.A07);
                } else if (i != 1 && i != 2) {
                } else {
                    C1BJ.A00().A02(c32751ee.A00.A07);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x0084, code lost:
            if (java.lang.Math.abs(r2) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L33;
         */
        @Override // X.AbstractC13450lH
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void A05(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r0 = -1
                r8.A00 = r0
                int r7 = r9.getWidth()
                r4 = 1
                r3 = 0
                r6 = 0
                int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r0 == 0) goto L6b
                int r0 = X.C0AT.A05(r9)
                r2 = 0
                if (r0 != r4) goto L16
                r2 = 1
            L16:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r5.A03
                r0 = 2
                if (r1 == r0) goto L25
                if (r1 != 0) goto L5d
                if (r2 == 0) goto L58
                int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r0 >= 0) goto L87
            L25:
                int r0 = r9.getLeft()
                int r2 = r8.A01
                if (r0 >= r2) goto L56
                int r2 = r2 - r7
            L2e:
                X.0lI r1 = r5.A04
                int r0 = r9.getTop()
                boolean r0 = r1.A0E(r2, r0)
                if (r0 == 0) goto L43
                X.1Ac r0 = new X.1Ac
                r0.<init>(r9, r4)
                r9.postOnAnimation(r0)
            L42:
                return
            L43:
                if (r4 == 0) goto L42
                X.1Ab r1 = r5.A05
                if (r1 == 0) goto L42
                X.1ee r1 = (X.C32751ee) r1
                r0 = 8
                r9.setVisibility(r0)
                X.0cw r0 = r1.A00
                r0.A02(r3)
                return
            L56:
                int r2 = r2 + r7
                goto L2e
            L58:
                int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r0 <= 0) goto L87
                goto L25
            L5d:
                if (r1 != r4) goto L87
                if (r2 == 0) goto L66
                int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r0 <= 0) goto L87
                goto L25
            L66:
                int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r0 >= 0) goto L87
                goto L25
            L6b:
                int r2 = r9.getLeft()
                int r0 = r8.A01
                int r2 = r2 - r0
                int r0 = r9.getWidth()
                float r1 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r0 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                int r0 = java.lang.Math.abs(r2)
                if (r0 < r1) goto L87
                goto L25
            L87:
                int r2 = r8.A01
                r4 = 0
                goto L2e
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C32561eJ.A05(android.view.View, float, float):void");
        }

        @Override // X.AbstractC13450lH
        public void A06(View view, int i) {
            this.A00 = i;
            this.A01 = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // X.AbstractC13450lH
        public void A07(View view, int i, int i2, int i3, int i4) {
            float f = this.A01;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = (view.getWidth() * swipeDismissBehavior.A01) + f;
            float width2 = (view.getWidth() * swipeDismissBehavior.A00) + this.A01;
            float f2 = i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f2 - width) / (width2 - width))), 1.0f));
            }
        }

        @Override // X.AbstractC13450lH
        public boolean A08(View view, int i) {
            return this.A00 == -1 && SwipeDismissBehavior.this.A0I(view);
        }
    };

    public boolean A0I(View view) {
        return true;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.A06;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A06 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A06 = false;
        }
        if (z) {
            C13460lI c13460lI = this.A04;
            if (c13460lI == null) {
                c13460lI = new C13460lI(coordinatorLayout.getContext(), coordinatorLayout, this.A07);
                this.A04 = c13460lI;
            }
            return c13460lI.A0G(motionEvent);
        }
        return false;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0C(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C13460lI c13460lI = this.A04;
        if (c13460lI != null) {
            c13460lI.A08(motionEvent);
            return true;
        }
        return false;
    }
}
