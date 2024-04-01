package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.303  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass303 {
    public C3H8 A00;
    public boolean A01;
    public boolean A02;
    public final int A03;
    public final PointF A04 = new PointF();
    public final PointF A06 = new PointF();
    public final PointF A05 = new PointF();

    public AnonymousClass303(C3H8 c3h8, Context context) {
        this.A00 = c3h8;
        this.A03 = ViewConfiguration.get(context).getScaledPagingTouchSlop() >> 2;
    }

    public static final void A00(PointF pointF, MotionEvent motionEvent) {
        pointF.set(0.0f, 0.0f);
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            pointF.x = motionEvent.getX(i) + pointF.x;
            pointF.y = motionEvent.getY(i) + pointF.y;
        }
        float f = pointerCount;
        pointF.x /= f;
        pointF.y /= f;
    }
}
