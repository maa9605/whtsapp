package X;

import android.view.View;

/* renamed from: X.2vp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC61242vp extends RunnableEmptyBase implements Runnable {
    public long A00;
    public boolean A01;
    public final View A02;
    public final GestureDetector$OnGestureListenerC61252vq A03;

    public RunnableC61242vp(View view, GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq) {
        this.A02 = view;
        this.A03 = gestureDetector$OnGestureListenerC61252vq;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.A01) {
            return;
        }
        long j = this.A00;
        if (j == 0) {
            j = System.currentTimeMillis();
            this.A00 = j;
        }
        if (((float) (System.currentTimeMillis() - j)) / ((float) 0) >= 1.0f) {
            this.A01 = true;
        }
        View view = this.A02;
        view.invalidate();
        if (this.A01) {
            return;
        }
        view.post(this);
    }
}
