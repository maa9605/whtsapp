package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.0hK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC11180hK implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final int[] A08 = new int[2];

    public abstract InterfaceC10880gn A00();

    public abstract boolean A03();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public AbstractView$OnTouchListenerC11180hK(View view) {
        this.A07 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A04 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.A06 = tapTimeout;
        this.A05 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void A01() {
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.A01;
        if (runnable2 != null) {
            this.A07.removeCallbacks(runnable2);
        }
    }

    public boolean A02() {
        InterfaceC10880gn A00 = A00();
        if (A00 == null || !A00.AFo()) {
            return true;
        }
        A00.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r1 == 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (A02() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r1 != 3) goto L56;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractView$OnTouchListenerC11180hK.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.A03 = false;
        this.A00 = -1;
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }
}
