package com.google.android.material.bottomsheet;

import X.AbstractC08910cJ;
import X.AbstractC08940cM;
import X.AbstractC13450lH;
import X.C000200d;
import X.C08550bg;
import X.C08930cL;
import X.C0AT;
import X.C13460lI;
import X.C32591eN;
import X.RunnableC24301Ag;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class BottomSheetBehavior extends AbstractC08910cJ {
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
    public int A0B;
    public VelocityTracker A0C;
    public C13460lI A0D;
    public AbstractC08940cM A0E;
    public WeakReference A0F;
    public WeakReference A0G;
    public Map A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final AbstractC13450lH A0P;

    public BottomSheetBehavior() {
        this.A0I = true;
        this.A0B = 4;
        this.A0P = new AbstractC13450lH() { // from class: X.1eM
            {
                BottomSheetBehavior.this = this;
            }

            @Override // X.AbstractC13450lH
            public int A01(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.A0J) {
                    return bottomSheetBehavior.A08;
                }
                return bottomSheetBehavior.A02;
            }

            @Override // X.AbstractC13450lH
            public int A02(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // X.AbstractC13450lH
            public int A03(View view, int i, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.A0I ? bottomSheetBehavior.A03 : 0;
                int i4 = bottomSheetBehavior.A0J ? bottomSheetBehavior.A08 : bottomSheetBehavior.A02;
                if (i >= i3) {
                    i3 = i;
                    if (i > i4) {
                        return i4;
                    }
                }
                return i3;
            }

            @Override // X.AbstractC13450lH
            public void A04(int i) {
                if (i == 1) {
                    BottomSheetBehavior.this.A0M(1);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:78:0x0087, code lost:
                if (r5 < java.lang.Math.abs(r5 - r7.A02)) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x0089, code lost:
                r3 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
                if (r0 > r3) goto L16;
             */
            @Override // X.AbstractC13450lH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A05(android.view.View r9, float r10, float r11) {
                /*
                    r8 = this;
                    r6 = 3
                    r2 = 0
                    int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                    if (r0 >= 0) goto L27
                    com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r0 = r4.A0I
                    if (r0 == 0) goto L9c
                    int r3 = r4.A03
                Le:
                    X.0lI r1 = r4.A0D
                    int r0 = r9.getLeft()
                    boolean r0 = r1.A0E(r0, r3)
                    if (r0 == 0) goto La7
                    r0 = 2
                    r4.A0M(r0)
                    X.1Ag r0 = new X.1Ag
                    r0.<init>(r4, r9, r6)
                    r9.postOnAnimation(r0)
                    return
                L27:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    r4 = r7
                    boolean r0 = r7.A0J
                    if (r0 == 0) goto L4c
                    boolean r0 = r7.A0R(r9, r11)
                    if (r0 == 0) goto L4c
                    int r1 = r9.getTop()
                    int r0 = r7.A02
                    if (r1 > r0) goto L48
                    float r1 = java.lang.Math.abs(r10)
                    float r0 = java.lang.Math.abs(r11)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L4c
                L48:
                    int r3 = r7.A08
                    r6 = 5
                    goto Le
                L4c:
                    int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                    if (r0 == 0) goto L60
                    float r1 = java.lang.Math.abs(r10)
                    float r0 = java.lang.Math.abs(r11)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 > 0) goto L60
                    int r3 = r7.A02
                L5e:
                    r6 = 4
                    goto Le
                L60:
                    int r5 = r9.getTop()
                    boolean r0 = r7.A0I
                    if (r0 == 0) goto L7b
                    int r2 = r7.A03
                    int r0 = r5 - r2
                    int r1 = java.lang.Math.abs(r0)
                    int r3 = r7.A02
                    int r5 = r5 - r3
                    int r0 = java.lang.Math.abs(r5)
                    if (r1 >= r0) goto L5e
                    r3 = r2
                    goto Le
                L7b:
                    int r3 = r7.A04
                    if (r5 >= r3) goto L8b
                    int r0 = r7.A02
                    int r0 = r5 - r0
                    int r0 = java.lang.Math.abs(r0)
                    if (r5 >= r0) goto La4
                L89:
                    r3 = 0
                    goto Le
                L8b:
                    int r0 = r5 - r3
                    int r2 = java.lang.Math.abs(r0)
                    int r1 = r7.A02
                    int r5 = r5 - r1
                    int r0 = java.lang.Math.abs(r5)
                    if (r2 < r0) goto La4
                    r3 = r1
                    goto L5e
                L9c:
                    int r0 = r9.getTop()
                    int r3 = r4.A04
                    if (r0 <= r3) goto L89
                La4:
                    r6 = 6
                    goto Le
                La7:
                    r4.A0M(r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C32581eM.A05(android.view.View, float, float):void");
            }

            @Override // X.AbstractC13450lH
            public void A07(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.A0L(i2);
            }

            @Override // X.AbstractC13450lH
            public boolean A08(View view, int i) {
                WeakReference weakReference;
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = bottomSheetBehavior.A0B;
                if (i2 == 1 || bottomSheetBehavior.A0O) {
                    return false;
                }
                return ((i2 == 3 && bottomSheetBehavior.A01 == i && (view2 = (View) bottomSheetBehavior.A0F.get()) != null && view2.canScrollVertically(-1)) || (weakReference = bottomSheetBehavior.A0G) == null || weakReference.get() != view) ? false : true;
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.A0I = true;
        this.A0B = 4;
        this.A0P = new AbstractC13450lH() { // from class: X.1eM
            {
                BottomSheetBehavior.this = this;
            }

            @Override // X.AbstractC13450lH
            public int A01(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.A0J) {
                    return bottomSheetBehavior.A08;
                }
                return bottomSheetBehavior.A02;
            }

            @Override // X.AbstractC13450lH
            public int A02(View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // X.AbstractC13450lH
            public int A03(View view, int i2, int i22) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.A0I ? bottomSheetBehavior.A03 : 0;
                int i4 = bottomSheetBehavior.A0J ? bottomSheetBehavior.A08 : bottomSheetBehavior.A02;
                if (i2 >= i3) {
                    i3 = i2;
                    if (i2 > i4) {
                        return i4;
                    }
                }
                return i3;
            }

            @Override // X.AbstractC13450lH
            public void A04(int i2) {
                if (i2 == 1) {
                    BottomSheetBehavior.this.A0M(1);
                }
            }

            @Override // X.AbstractC13450lH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A05(android.view.View r9, float r10, float r11) {
                /*
                    r8 = this;
                    r6 = 3
                    r2 = 0
                    int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                    if (r0 >= 0) goto L27
                    com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    boolean r0 = r4.A0I
                    if (r0 == 0) goto L9c
                    int r3 = r4.A03
                Le:
                    X.0lI r1 = r4.A0D
                    int r0 = r9.getLeft()
                    boolean r0 = r1.A0E(r0, r3)
                    if (r0 == 0) goto La7
                    r0 = 2
                    r4.A0M(r0)
                    X.1Ag r0 = new X.1Ag
                    r0.<init>(r4, r9, r6)
                    r9.postOnAnimation(r0)
                    return
                L27:
                    com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                    r4 = r7
                    boolean r0 = r7.A0J
                    if (r0 == 0) goto L4c
                    boolean r0 = r7.A0R(r9, r11)
                    if (r0 == 0) goto L4c
                    int r1 = r9.getTop()
                    int r0 = r7.A02
                    if (r1 > r0) goto L48
                    float r1 = java.lang.Math.abs(r10)
                    float r0 = java.lang.Math.abs(r11)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L4c
                L48:
                    int r3 = r7.A08
                    r6 = 5
                    goto Le
                L4c:
                    int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                    if (r0 == 0) goto L60
                    float r1 = java.lang.Math.abs(r10)
                    float r0 = java.lang.Math.abs(r11)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 > 0) goto L60
                    int r3 = r7.A02
                L5e:
                    r6 = 4
                    goto Le
                L60:
                    int r5 = r9.getTop()
                    boolean r0 = r7.A0I
                    if (r0 == 0) goto L7b
                    int r2 = r7.A03
                    int r0 = r5 - r2
                    int r1 = java.lang.Math.abs(r0)
                    int r3 = r7.A02
                    int r5 = r5 - r3
                    int r0 = java.lang.Math.abs(r5)
                    if (r1 >= r0) goto L5e
                    r3 = r2
                    goto Le
                L7b:
                    int r3 = r7.A04
                    if (r5 >= r3) goto L8b
                    int r0 = r7.A02
                    int r0 = r5 - r0
                    int r0 = java.lang.Math.abs(r0)
                    if (r5 >= r0) goto La4
                L89:
                    r3 = 0
                    goto Le
                L8b:
                    int r0 = r5 - r3
                    int r2 = java.lang.Math.abs(r0)
                    int r1 = r7.A02
                    int r5 = r5 - r1
                    int r0 = java.lang.Math.abs(r5)
                    if (r2 < r0) goto La4
                    r3 = r1
                    goto L5e
                L9c:
                    int r0 = r9.getTop()
                    int r3 = r4.A04
                    if (r0 <= r3) goto L89
                La4:
                    r6 = 6
                    goto Le
                La7:
                    r4.A0M(r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C32581eM.A05(android.view.View, float, float):void");
            }

            @Override // X.AbstractC13450lH
            public void A07(View view, int i2, int i22, int i3, int i4) {
                BottomSheetBehavior.this.A0L(i22);
            }

            @Override // X.AbstractC13450lH
            public boolean A08(View view, int i2) {
                WeakReference weakReference;
                View view2;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i22 = bottomSheetBehavior.A0B;
                if (i22 == 1 || bottomSheetBehavior.A0O) {
                    return false;
                }
                return ((i22 == 3 && bottomSheetBehavior.A01 == i2 && (view2 = (View) bottomSheetBehavior.A0F.get()) != null && view2.canScrollVertically(-1)) || (weakReference = bottomSheetBehavior.A0G) == null || weakReference.get() != view) ? false : true;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A0G);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null && (i = peekValue.data) == -1) {
            A0N(i);
        } else {
            A0N(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.A0J = obtainStyledAttributes.getBoolean(1, false);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        if (this.A0I != z) {
            this.A0I = z;
            if (this.A0G != null) {
                A0K();
            }
            A0M((z && this.A0B == 6) ? 3 : this.A0B);
        }
        this.A0N = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.A00 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static BottomSheetBehavior A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C08930cL) {
            AbstractC08910cJ abstractC08910cJ = ((C08930cL) layoutParams).A0A;
            if (abstractC08910cJ instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) abstractC08910cJ;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @Override // X.AbstractC08910cJ
    public Parcelable A03(CoordinatorLayout coordinatorLayout, View view) {
        return new C32591eN(View.BaseSavedState.EMPTY_STATE, this.A0B);
    }

    @Override // X.AbstractC08910cJ
    public void A04(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        int i = ((C32591eN) parcelable).A00;
        if (i != 1 && i != 2) {
            this.A0B = i;
        } else {
            this.A0B = 4;
        }
    }

    @Override // X.AbstractC08910cJ
    public void A05(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        int top = view.getTop();
        int i2 = this.A0I ? this.A03 : 0;
        int i3 = 3;
        if (top == i2) {
            A0M(3);
        } else if (view2 == this.A0F.get() && this.A0L) {
            if (this.A06 <= 0) {
                if (this.A0J) {
                    VelocityTracker velocityTracker = this.A0C;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A00);
                        yVelocity = this.A0C.getYVelocity(this.A01);
                    }
                    if (A0R(view, yVelocity)) {
                        i2 = this.A08;
                        i3 = 5;
                    }
                }
                if (this.A06 == 0) {
                    int top2 = view.getTop();
                    if (this.A0I) {
                        int i4 = this.A03;
                        int abs = Math.abs(top2 - i4);
                        i2 = this.A02;
                        if (abs < Math.abs(top2 - i2)) {
                            i2 = i4;
                        }
                    } else {
                        int i5 = this.A04;
                        if (top2 < i5) {
                            i2 = i5;
                            if (top2 < Math.abs(top2 - this.A02)) {
                                i2 = 0;
                            }
                        } else {
                            int abs2 = Math.abs(top2 - i5);
                            i2 = this.A02;
                            if (abs2 < Math.abs(top2 - i2)) {
                                i2 = i5;
                            }
                        }
                        i3 = 6;
                    }
                } else {
                    i2 = this.A02;
                }
                i3 = 4;
            }
            if (this.A0D.A0J(view, view.getLeft(), i2)) {
                A0M(2);
                view.postOnAnimation(new RunnableC24301Ag(this, view, i3));
            } else {
                A0M(i3);
            }
            this.A0L = false;
        }
    }

    @Override // X.AbstractC08910cJ
    public void A07(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view2 == this.A0F.get()) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                int i5 = this.A0I ? this.A03 : 0;
                if (i4 < i5) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    C0AT.A0T(view, -i6);
                    A0M(3);
                } else {
                    iArr[1] = i2;
                    C0AT.A0T(view, -i2);
                    A0M(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                int i7 = this.A02;
                if (i4 > i7 && !this.A0J) {
                    int i8 = top - i7;
                    iArr[1] = i8;
                    C0AT.A0T(view, -i8);
                    A0M(4);
                } else {
                    iArr[1] = i2;
                    C0AT.A0T(view, -i2);
                    A0M(1);
                }
            }
            A0L(view.getTop());
            this.A06 = i2;
            this.A0L = true;
        }
    }

    @Override // X.AbstractC08910cJ
    public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.A0B(view, i);
        this.A08 = coordinatorLayout.getHeight();
        if (this.A0M) {
            int i2 = this.A0A;
            if (i2 == 0) {
                i2 = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
                this.A0A = i2;
            }
            this.A07 = Math.max(i2, this.A08 - ((coordinatorLayout.getWidth() * 9) >> 4));
        } else {
            this.A07 = this.A09;
        }
        int max = Math.max(0, this.A08 - view.getHeight());
        this.A03 = max;
        int i3 = this.A08;
        int i4 = i3 / 2;
        this.A04 = i4;
        A0K();
        int i5 = this.A0B;
        if (i5 == 3) {
            C0AT.A0T(view, this.A0I ? max : 0);
        } else if (i5 == 6) {
            C0AT.A0T(view, i4);
        } else if (this.A0J && i5 == 5) {
            C0AT.A0T(view, i3);
        } else if (i5 != 4) {
            if (i5 == 1 || i5 == 2) {
                C0AT.A0T(view, top - view.getTop());
            }
        } else {
            C0AT.A0T(view, this.A02);
        }
        if (this.A0D == null) {
            this.A0D = new C13460lI(coordinatorLayout.getContext(), coordinatorLayout, this.A0P);
        }
        this.A0G = new WeakReference(view);
        this.A0F = new WeakReference(A0J(view));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0081, code lost:
        if (r9.A0H(r10, r1, r8.A05) != false) goto L66;
     */
    @Override // X.AbstractC08910cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0B(androidx.coordinatorlayout.widget.CoordinatorLayout r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            boolean r0 = r10.isShown()
            r2 = 0
            r4 = 1
            if (r0 != 0) goto Lb
            r8.A0K = r4
            return r2
        Lb:
            int r5 = r11.getActionMasked()
            r3 = 0
            r6 = -1
            if (r5 != 0) goto L1e
            r8.A01 = r6
            android.view.VelocityTracker r0 = r8.A0C
            if (r0 == 0) goto L1e
            r0.recycle()
            r8.A0C = r3
        L1e:
            android.view.VelocityTracker r0 = r8.A0C
            if (r0 != 0) goto L28
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r8.A0C = r0
        L28:
            r0.addMovement(r11)
            if (r5 == 0) goto L4c
            if (r5 == r4) goto L41
            r0 = 3
            if (r5 == r0) goto L41
        L32:
            boolean r0 = r8.A0K
            if (r0 != 0) goto L87
            X.0lI r0 = r8.A0D
            if (r0 == 0) goto L87
            boolean r0 = r0.A0G(r11)
            if (r0 == 0) goto L87
            return r4
        L41:
            r8.A0O = r2
            r8.A01 = r6
            boolean r0 = r8.A0K
            if (r0 == 0) goto L32
            r8.A0K = r2
            return r2
        L4c:
            float r0 = r11.getX()
            int r1 = (int) r0
            float r0 = r11.getY()
            int r7 = (int) r0
            r8.A05 = r7
            java.lang.ref.WeakReference r0 = r8.A0F
            if (r0 == 0) goto L76
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L76
            boolean r0 = r9.A0H(r0, r1, r7)
            if (r0 == 0) goto L76
            int r0 = r11.getActionIndex()
            int r0 = r11.getPointerId(r0)
            r8.A01 = r0
            r8.A0O = r4
        L76:
            int r0 = r8.A01
            if (r0 != r6) goto L83
            int r0 = r8.A05
            boolean r1 = r9.A0H(r10, r1, r0)
            r0 = 1
            if (r1 == 0) goto L84
        L83:
            r0 = 0
        L84:
            r8.A0K = r0
            goto L32
        L87:
            java.lang.ref.WeakReference r0 = r8.A0F
            if (r0 == 0) goto L91
            java.lang.Object r3 = r0.get()
            android.view.View r3 = (android.view.View) r3
        L91:
            r0 = 2
            if (r5 != r0) goto Lc8
            if (r3 == 0) goto Lc8
            boolean r0 = r8.A0K
            if (r0 != 0) goto Lc8
            int r0 = r8.A0B
            if (r0 == r4) goto Lc8
            float r0 = r11.getX()
            int r1 = (int) r0
            float r0 = r11.getY()
            int r0 = (int) r0
            boolean r0 = r9.A0H(r3, r1, r0)
            if (r0 != 0) goto Lc8
            X.0lI r0 = r8.A0D
            if (r0 == 0) goto Lc8
            int r0 = r8.A05
            float r1 = (float) r0
            float r0 = r11.getY()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            X.0lI r0 = r8.A0D
            int r0 = r0.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lc8
            r2 = 1
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0B(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.AbstractC08910cJ
    public boolean A0C(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.A0B == 1 && actionMasked == 0) {
                return true;
            }
            C13460lI c13460lI = this.A0D;
            if (c13460lI != null) {
                c13460lI.A08(motionEvent);
            }
            if (actionMasked == 0) {
                this.A01 = -1;
                VelocityTracker velocityTracker = this.A0C;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A0C = null;
                }
            }
            VelocityTracker velocityTracker2 = this.A0C;
            if (velocityTracker2 == null) {
                velocityTracker2 = VelocityTracker.obtain();
                this.A0C = velocityTracker2;
            }
            velocityTracker2.addMovement(motionEvent);
            if (actionMasked == 2 && !this.A0K) {
                float abs = Math.abs(this.A05 - motionEvent.getY());
                C13460lI c13460lI2 = this.A0D;
                if (abs > c13460lI2.A06) {
                    c13460lI2.A0A(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            return !this.A0K;
        }
        return false;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0E(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return view2 == this.A0F.get() && this.A0B != 3;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.A06 = 0;
        this.A0L = false;
        return (i & 2) != 0;
    }

    public final int A0I() {
        if (this.A0M) {
            return -1;
        }
        return this.A09;
    }

    public View A0J(View view) {
        if (C0AT.A0i(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A0J = A0J(viewGroup.getChildAt(i));
                if (A0J != null) {
                    return A0J;
                }
            }
            return null;
        }
        return null;
    }

    public final void A0K() {
        if (this.A0I) {
            this.A02 = Math.max(this.A08 - this.A07, this.A03);
        } else {
            this.A02 = this.A08 - this.A07;
        }
    }

    public void A0L(int i) {
        AbstractC08940cM abstractC08940cM;
        View view = (View) this.A0G.get();
        if (view != null && (abstractC08940cM = this.A0E) != null) {
            int i2 = this.A02;
            if (i > i2) {
                abstractC08940cM.A00(view, (i2 - i) / (this.A08 - i2));
            } else {
                abstractC08940cM.A00(view, (i2 - i) / (i2 - (this.A0I ? this.A03 : 0)));
            }
        }
    }

    public void A0M(int i) {
        AbstractC08940cM abstractC08940cM;
        if (this.A0B == i) {
            return;
        }
        this.A0B = i;
        if (i == 6 || i == 3) {
            A0Q(true);
        } else if (i == 5 || i == 4) {
            A0Q(false);
        }
        View view = (View) this.A0G.get();
        if (view == null || (abstractC08940cM = this.A0E) == null) {
            return;
        }
        abstractC08940cM.A01(view, i);
    }

    public final void A0N(int i) {
        WeakReference weakReference;
        View view;
        if (i == -1) {
            if (this.A0M) {
                return;
            }
            this.A0M = true;
        } else if (!this.A0M && this.A09 == i) {
            return;
        } else {
            this.A0M = false;
            this.A09 = Math.max(0, i);
            this.A02 = this.A08 - i;
        }
        if (this.A0B != 4 || (weakReference = this.A0G) == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void A0O(final int i) {
        if (i == this.A0B) {
            return;
        }
        WeakReference weakReference = this.A0G;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.A0J && i == 5)) {
                this.A0B = i;
                return;
            }
            return;
        }
        final View view = (View) weakReference.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && C0AT.A0g(view)) {
            view.post(new Runnable() { // from class: X.1Ae
                {
                    BottomSheetBehavior.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.A0P(view, i);
                }
            });
        } else {
            A0P(view, i);
        }
    }

    public void A0P(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.A02;
        } else if (i == 6) {
            i2 = this.A04;
            if (this.A0I && i2 <= (i3 = this.A03)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = this.A0I ? this.A03 : 0;
        } else if (this.A0J && i == 5) {
            i2 = this.A08;
        } else {
            throw new IllegalArgumentException(C000200d.A0D("Illegal state argument: ", i));
        }
        if (this.A0D.A0J(view, view.getLeft(), i2)) {
            A0M(2);
            view.postOnAnimation(new RunnableC24301Ag(this, view, i));
            return;
        }
        A0M(i);
    }

    public final void A0Q(boolean z) {
        WeakReference weakReference = this.A0G;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            if (z) {
                if (this.A0H == null) {
                    this.A0H = new HashMap(childCount);
                } else {
                    return;
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != this.A0G.get()) {
                    Map map = this.A0H;
                    if (!z) {
                        if (map != null && map.containsKey(childAt)) {
                            C0AT.A0V(childAt, ((Number) this.A0H.get(childAt)).intValue());
                        }
                    } else {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C0AT.A0V(childAt, 4);
                    }
                }
            }
            if (z) {
                return;
            }
            this.A0H = null;
        }
    }

    public boolean A0R(View view, float f) {
        if (this.A0N) {
            return true;
        }
        if (view.getTop() < this.A02) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.A02)) / ((float) this.A09) > 0.5f;
    }
}
