package X;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;

/* renamed from: X.0lI */
/* loaded from: classes.dex */
public class C13460lI {
    public static final Interpolator A0L = new Interpolator() { // from class: X.0lF
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public float A00;
    public float A01;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public OverScroller A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public int[] A0F;
    public int[] A0G;
    public int[] A0H;
    public final ViewGroup A0I;
    public final AbstractC13450lH A0J;
    public int A02 = -1;
    public final Runnable A0K = new Runnable() { // from class: X.0lG
        {
            C13460lI.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13460lI.this.A06(0);
        }
    };

    public C13460lI(Context context, ViewGroup viewGroup, AbstractC13450lH abstractC13450lH) {
        if (abstractC13450lH != null) {
            this.A0I = viewGroup;
            this.A0J = abstractC13450lH;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.A04 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.A06 = viewConfiguration.getScaledTouchSlop();
            this.A00 = viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.A09 = new OverScroller(context, A0L);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public final int A00(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.A0I.getWidth();
        float abs = Math.abs(i);
        float f = width >> 1;
        float sin = (((float) Math.sin((Math.min(1.0f, abs / width) - 0.5f) * 0.47123894f)) * f) + f;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            i4 = Math.round(Math.abs(sin / abs2) * 1000.0f) << 2;
        } else {
            i4 = (int) (((abs / i3) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    public View A01(int i, int i2) {
        ViewGroup viewGroup = this.A0I;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.A0J != null) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                    return childAt;
                }
            } else {
                throw null;
            }
        }
        return null;
    }

    public void A02() {
        this.A02 = -1;
        float[] fArr = this.A0B;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            Arrays.fill(this.A0H, 0);
            Arrays.fill(this.A0F, 0);
            Arrays.fill(this.A0G, 0);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public final void A03() {
        this.A07.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A00);
        float xVelocity = this.A07.getXVelocity(this.A02);
        float f = this.A01;
        float f2 = this.A00;
        float abs = Math.abs(xVelocity);
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            if (xVelocity <= 0.0f) {
                f2 = -f2;
            }
            xVelocity = f2;
        }
        float yVelocity = this.A07.getYVelocity(this.A02);
        float f3 = this.A01;
        float f4 = this.A00;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            yVelocity = 0.0f;
        } else if (abs2 > f4) {
            if (yVelocity <= 0.0f) {
                f4 = -f4;
            }
            yVelocity = f4;
        }
        this.A0A = true;
        this.A0J.A05(this.A08, xVelocity, yVelocity);
        this.A0A = false;
        if (this.A03 == 1) {
            A06(0);
        }
    }

    public final void A04(float f, float f2, int i) {
        int i2 = A0C(f, f2, i, 1) ? 1 : 0;
        if (A0C(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (A0C(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (A0C(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.A0F;
            iArr[i] = iArr[i] | i2;
            if (this.A0J == null) {
                throw null;
            }
        }
    }

    public final void A05(float f, float f2, int i) {
        float[] fArr = this.A0B;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0C;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0D;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0E;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0H;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0F;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0G;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A0B = fArr2;
            fArr = fArr2;
            this.A0C = fArr3;
            this.A0D = fArr4;
            this.A0E = fArr5;
            this.A0H = iArr;
            this.A0F = iArr2;
            this.A0G = iArr3;
        }
        this.A0D[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A0C;
        this.A0E[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0H;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.A0I;
        int i5 = i3 < viewGroup.getLeft() + this.A04 ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.A04) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.A04) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.A04) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.A05 |= 1 << i;
    }

    public void A06(int i) {
        this.A0I.removeCallbacks(this.A0K);
        if (this.A03 != i) {
            this.A03 = i;
            this.A0J.A04(i);
            if (this.A03 == 0) {
                this.A08 = null;
            }
        }
    }

    public final void A07(int i) {
        float[] fArr = this.A0B;
        if (fArr != null) {
            int i2 = this.A05;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.A0C[i] = 0.0f;
                this.A0D[i] = 0.0f;
                this.A0E[i] = 0.0f;
                this.A0H[i] = 0;
                this.A0F[i] = 0;
                this.A0G[i] = 0;
                this.A05 = i2 & (i3 ^ (-1));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0062, code lost:
        if (r10.A02 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0064, code lost:
        A03();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A08(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13460lI.A08(android.view.MotionEvent):void");
    }

    public final void A09(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A0D(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0D[pointerId] = x;
                this.A0E[pointerId] = y;
            }
        }
    }

    public void A0A(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0I;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            this.A0J.A06(view, i);
            A06(1);
            return;
        }
        StringBuilder A0P = C000200d.A0P("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0P.append(viewGroup);
        A0P.append(")");
        throw new IllegalArgumentException(A0P.toString());
    }

    public boolean A0B() {
        if (this.A03 == 2) {
            boolean computeScrollOffset = this.A09.computeScrollOffset();
            int currX = this.A09.getCurrX();
            int currY = this.A09.getCurrY();
            int left = currX - this.A08.getLeft();
            int top = currY - this.A08.getTop();
            if (left != 0) {
                C0AT.A0S(this.A08, left);
            }
            if (top != 0) {
                C0AT.A0T(this.A08, top);
            }
            if (left != 0 || top != 0) {
                this.A0J.A07(this.A08, currX, currY, left, top);
            }
            if (computeScrollOffset) {
                if (currX == this.A09.getFinalX() && currY == this.A09.getFinalY()) {
                    this.A09.abortAnimation();
                }
            }
            this.A0I.post(this.A0K);
        }
        return this.A03 == 2;
    }

    public final boolean A0C(float f, float f2, int i, int i2) {
        int i3;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.A0H[i] & i2) == i2 && (0 & i2) != 0 && (this.A0G[i] & i2) != i2 && (i3 = this.A0F[i] & i2) != i2) {
            float f3 = this.A06;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f && this.A0J == null) {
                    throw null;
                }
                if (i3 == 0 && abs > f3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0D(int i) {
        if ((this.A05 & (1 << i)) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    public boolean A0E(int i, int i2) {
        if (this.A0A) {
            return A0F(i, i2, (int) this.A07.getXVelocity(this.A02), (int) this.A07.getYVelocity(this.A02));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean A0F(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        AbstractC13450lH abstractC13450lH;
        int left = this.A08.getLeft();
        int top = this.A08.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.A09.abortAnimation();
            A06(0);
            return false;
        }
        View view = this.A08;
        int i7 = (int) this.A01;
        int i8 = (int) this.A00;
        int i9 = i8;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i9 = 0;
        } else if (abs <= i8) {
            i9 = i3;
        } else if (i3 <= 0) {
            i9 = -i8;
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i8 = 0;
        } else if (abs2 <= i8) {
            i8 = i4;
        } else if (i4 <= 0) {
            i8 = -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i9);
        int abs6 = Math.abs(i8);
        int i10 = abs5 + abs6;
        int i11 = abs3 + abs4;
        if (i9 != 0) {
            f = abs5;
            f2 = i10;
        } else {
            f = abs3;
            f2 = i11;
        }
        float f3 = f / f2;
        float f4 = abs4;
        float f5 = i11;
        if (i8 != 0) {
            f4 = abs6;
            f5 = i10;
        }
        float A00 = A00(i6, i8, abstractC13450lH.A01(view)) * (f4 / f5);
        this.A09.startScroll(left, top, i5, i6, (int) (A00 + (A00(i5, i9, this.A0J.A00(view)) * f3)));
        A06(2);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x00cf, code lost:
        if (r6 != r7) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0G(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13460lI.A0G(android.view.MotionEvent):boolean");
    }

    public final boolean A0H(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        AbstractC13450lH abstractC13450lH = this.A0J;
        boolean z = abstractC13450lH.A00(view) > 0;
        boolean z2 = abstractC13450lH.A01(view) > 0;
        if (!z) {
            return z2 && Math.abs(f2) > ((float) this.A06);
        } else if (!z2) {
            return Math.abs(f) > ((float) this.A06);
        } else {
            float f3 = f2 * f2;
            int i = this.A06;
            return f3 + (f * f) > ((float) (i * i));
        }
    }

    public boolean A0I(View view, int i) {
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view == null || !this.A0J.A08(view, i)) {
            return false;
        }
        this.A02 = i;
        A0A(view, i);
        return true;
    }

    public boolean A0J(View view, int i, int i2) {
        this.A08 = view;
        this.A02 = -1;
        boolean A0F = A0F(i, i2, 0, 0);
        if (!A0F && this.A03 == 0 && this.A08 != null) {
            this.A08 = null;
        }
        return A0F;
    }
}
