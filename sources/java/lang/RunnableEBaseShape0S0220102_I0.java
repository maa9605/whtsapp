package java.lang;

import X.GestureDetector$OnGestureListenerC61252vq;
import android.view.View;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0220102_I0 extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public long A02 = -1;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public final int A07;

    public RunnableEBaseShape0S0220102_I0(View view, GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq, int i) {
        this.A07 = i;
        this.A04 = view;
        this.A03 = gestureDetector$OnGestureListenerC61252vq;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f;
        float f2;
        float f3;
        float f4;
        switch (this.A07) {
            case 0:
                if (this.A06) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.A02;
                float f5 = j != -1 ? (float) (currentTimeMillis - j) : 0.0f;
                if (j == -1) {
                    this.A02 = currentTimeMillis;
                }
                if (f5 >= 100.0f) {
                    f = this.A00;
                    f2 = this.A01;
                } else {
                    float f6 = this.A00;
                    float f7 = 100.0f - f5;
                    f = (f6 / f7) * 10.0f;
                    float f8 = this.A01;
                    f2 = (f8 / f7) * 10.0f;
                    if (Math.abs(f) > Math.abs(f6) || f == Float.NaN) {
                        f = f6;
                    }
                    if (Math.abs(f2) > Math.abs(f8) || f2 == Float.NaN) {
                        f2 = f8;
                    }
                }
                ((GestureDetector$OnGestureListenerC61252vq) this.A03).A03(f, f2);
                float f9 = this.A00 - f;
                this.A00 = f9;
                float f10 = this.A01 - f2;
                this.A01 = f10;
                if (f9 == 0.0f && f10 == 0.0f) {
                    this.A05 = false;
                    this.A06 = true;
                }
                if (this.A06) {
                    return;
                }
                ((View) this.A04).post(this);
                return;
            case 1:
                if (this.A06) {
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                long j2 = this.A02;
                float f11 = j2 != -1 ? ((float) (currentTimeMillis2 - j2)) / 1000.0f : 0.0f;
                GestureDetector$OnGestureListenerC61252vq gestureDetector$OnGestureListenerC61252vq = (GestureDetector$OnGestureListenerC61252vq) this.A03;
                boolean A03 = gestureDetector$OnGestureListenerC61252vq.A03(this.A00 * f11, this.A01 * f11);
                this.A02 = currentTimeMillis2;
                float f12 = f11 * 1000.0f;
                float f13 = this.A00;
                if (f13 > 0.0f) {
                    f3 = f13 - f12;
                    this.A00 = f3;
                    if (f3 < 0.0f) {
                        this.A00 = 0.0f;
                        f3 = 0.0f;
                    }
                } else {
                    f3 = f13 + f12;
                    this.A00 = f3;
                    if (f3 > 0.0f) {
                        this.A00 = 0.0f;
                        f3 = 0.0f;
                    }
                }
                float f14 = this.A01;
                if (f14 > 0.0f) {
                    f4 = f14 - f12;
                    this.A01 = f4;
                    if (f4 < 0.0f) {
                        this.A01 = 0.0f;
                        f4 = 0.0f;
                    }
                } else {
                    f4 = f14 + f12;
                    this.A01 = f4;
                    if (f4 > 0.0f) {
                        this.A01 = 0.0f;
                        f4 = 0.0f;
                    }
                }
                if ((f3 == 0.0f && f4 == 0.0f) || !A03) {
                    this.A05 = false;
                    this.A06 = true;
                    gestureDetector$OnGestureListenerC61252vq.A02(false);
                }
                if (this.A06) {
                    return;
                }
                ((View) this.A04).post(this);
                return;
            default:
                return;
        }
    }
}
