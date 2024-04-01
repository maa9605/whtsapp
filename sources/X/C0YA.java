package X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0YA  reason: invalid class name */
/* loaded from: classes.dex */
public class C0YA implements View.OnLongClickListener, View.OnAttachStateChangeListener, View.OnHoverListener {
    public static C0YA A09;
    public static C0YA A0A;
    public C11540hv A02;
    public boolean A03;
    public final int A04;
    public final View A05;
    public final CharSequence A06;
    public final Runnable A08 = new Runnable() { // from class: X.0ht
        @Override // java.lang.Runnable
        public void run() {
            C0YA.this.A02(false);
        }
    };
    public final Runnable A07 = new Runnable() { // from class: X.0hu
        @Override // java.lang.Runnable
        public void run() {
            C0YA.this.A01();
        }
    };
    public int A00 = Integer.MAX_VALUE;
    public int A01 = Integer.MAX_VALUE;

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public C0YA(View view, CharSequence charSequence) {
        this.A05 = view;
        this.A06 = charSequence;
        this.A04 = C13160kh.A02(ViewConfiguration.get(view.getContext()));
        this.A05.setOnLongClickListener(this);
        this.A05.setOnHoverListener(this);
    }

    public static void A00(C0YA c0ya) {
        C0YA c0ya2 = A0A;
        if (c0ya2 != null) {
            c0ya2.A05.removeCallbacks(c0ya2.A08);
        }
        A0A = c0ya;
        if (c0ya != null) {
            c0ya.A05.postDelayed(c0ya.A08, ViewConfiguration.getLongPressTimeout());
        }
    }

    public void A01() {
        if (A09 == this) {
            A09 = null;
            C11540hv c11540hv = this.A02;
            if (c11540hv != null) {
                View view = c11540hv.A02;
                if (view.getParent() != null) {
                    ((WindowManager) c11540hv.A00.getSystemService("window")).removeView(view);
                }
                this.A02 = null;
                this.A00 = Integer.MAX_VALUE;
                this.A01 = Integer.MAX_VALUE;
                this.A05.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (A0A == this) {
            A00(null);
        }
        this.A05.removeCallbacks(this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02(boolean r20) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YA.A02(boolean):void");
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.A02 == null || !this.A03) {
            View view2 = this.A05;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    this.A00 = Integer.MAX_VALUE;
                    this.A01 = Integer.MAX_VALUE;
                    A01();
                }
            } else if (view2.isEnabled() && this.A02 == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int abs = Math.abs(x - this.A00);
                int i = this.A04;
                if (abs > i || Math.abs(y - this.A01) > i) {
                    this.A00 = x;
                    this.A01 = y;
                    A00(this);
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.A00 = view.getWidth() >> 1;
        this.A01 = view.getHeight() >> 1;
        A02(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        A01();
    }
}
