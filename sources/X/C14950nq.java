package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.0nq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14950nq extends GestureDetector.SimpleOnGestureListener {
    public boolean A00 = true;
    public final /* synthetic */ C1UL A01;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C14950nq(C1UL c1ul) {
        this.A01 = c1ul;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        C1UL c1ul;
        View A05;
        if (this.A00 && (A05 = (c1ul = this.A01).A05(motionEvent)) != null && c1ul.A0M.A0E(A05) != null && (c1ul.A0I.A02(c1ul.A0M) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c1ul.A09;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                c1ul.A02 = x;
                c1ul.A03 = y;
                c1ul.A01 = 0.0f;
                c1ul.A00 = 0.0f;
                if (c1ul.A0I == null) {
                    throw null;
                }
            }
        }
    }
}
