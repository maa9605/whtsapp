package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.0tz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18590tz {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A09;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public Matrix A0L;
    public VelocityTracker A0M;
    public C0T1 A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final long A0V;
    public float A06 = 1.0f;
    public final float[] A0Y = new float[2];
    public float A0A = 1.0f;
    public float A07 = 1.0f;
    public float A08 = 1.0f;
    public final AbstractRunnableC18610u1 A0X = new AbstractRunnableC18610u1() { // from class: X.1Ww
        @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
        public void run() {
            C18590tz c18590tz = C18590tz.this;
            C0T1 c0t1 = c18590tz.A0N;
            float f = c18590tz.A0B;
            float f2 = c18590tz.A0C;
            C06390Sx c06390Sx = (C06390Sx) c0t1;
            c06390Sx.A05();
            C0SK c0sk = c06390Sx.A0O;
            if (c0sk != null && c0sk.A08(f, f2)) {
                C0T4 c0t4 = c06390Sx.A0M;
                C0SK c0sk2 = c06390Sx.A0O;
                C0SK c0sk3 = c0t4.A0D;
                if (c0sk3 != null && c0sk3 != c0sk2) {
                    c0sk3.A02();
                }
                c0t4.A0D = c0sk2;
            } else if (c06390Sx.A0U != null) {
                C0T4 c0t42 = c06390Sx.A0M;
                C0SK c0sk4 = c0t42.A0D;
                if (c0sk4 != null) {
                    c0sk4.A02();
                }
                c0t42.A0D = null;
                C0T4 c0t43 = c06390Sx.A0M;
                InterfaceC18310tW interfaceC18310tW = c0t43.A0B;
                if (interfaceC18310tW == null) {
                    return;
                }
                interfaceC18310tW.ALh(c0t43.A0R.A05(f, f2));
            } else {
                throw null;
            }
        }
    };
    public final AbstractRunnableC18610u1 A0W = new AbstractRunnableC18610u1() { // from class: X.1Wx
        @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
        public void run() {
            C18590tz c18590tz = C18590tz.this;
            c18590tz.A0T = false;
            C0T1 c0t1 = c18590tz.A0N;
            float f = c18590tz.A0B;
            float f2 = c18590tz.A0C;
            C06390Sx c06390Sx = (C06390Sx) c0t1;
            C0SK c0sk = c06390Sx.A0O;
            if (c0sk != null && c0sk.A07(f, f2)) {
                return;
            }
            if (c06390Sx.A0U != null) {
                c06390Sx.A05();
                return;
            }
            throw null;
        }
    };

    public C18590tz(Context context, C0T1 c0t1) {
        this.A0N = c0t1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0U = viewConfiguration.getScaledTouchSlop();
        this.A0V = ViewConfiguration.getLongPressTimeout();
        this.A0G = ViewConfiguration.getDoubleTapTimeout();
        this.A0F = viewConfiguration.getScaledDoubleTapSlop();
        this.A09 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0S = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
    }
}
