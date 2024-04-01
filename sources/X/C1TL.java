package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.1TL  reason: invalid class name */
/* loaded from: classes.dex */
public class C1TL implements InterfaceC13070kY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public GestureDetector.OnDoubleTapListener A08;
    public MotionEvent A09;
    public MotionEvent A0A;
    public VelocityTracker A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Handler A0J = new Handler() { // from class: X.0kZ
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C1TL c1tl = C1TL.this;
                c1tl.A0K.onShowPress(c1tl.A09);
            } else if (i == 2) {
                C1TL c1tl2 = C1TL.this;
                c1tl2.A0J.removeMessages(3);
                c1tl2.A0E = false;
                c1tl2.A0F = true;
                c1tl2.A0K.onLongPress(c1tl2.A09);
            } else if (i == 3) {
                C1TL c1tl3 = C1TL.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = c1tl3.A08;
                if (onDoubleTapListener != null) {
                    if (!c1tl3.A0I) {
                        onDoubleTapListener.onSingleTapConfirmed(c1tl3.A09);
                    } else {
                        c1tl3.A0E = true;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Unknown message ");
                sb.append(message);
                throw new RuntimeException(sb.toString());
            }
        }
    };
    public final GestureDetector.OnGestureListener A0K;
    public static final int A0M = ViewConfiguration.getLongPressTimeout();
    public static final int A0N = ViewConfiguration.getTapTimeout();
    public static final int A0L = ViewConfiguration.getDoubleTapTimeout();

    public C1TL(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.A0K = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.A08 = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context != null) {
            if (onGestureListener != null) {
                this.A0H = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.A06 = viewConfiguration.getScaledMinimumFlingVelocity();
                this.A05 = viewConfiguration.getScaledMaximumFlingVelocity();
                this.A07 = scaledTouchSlop * scaledTouchSlop;
                this.A04 = scaledDoubleTapSlop * scaledDoubleTapSlop;
                return;
            }
            throw new IllegalArgumentException("OnGestureListener must not be null");
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024f  */
    @Override // X.InterfaceC13070kY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean APj(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1TL.APj(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC13070kY
    public void ATD(boolean z) {
        this.A0H = z;
    }
}
