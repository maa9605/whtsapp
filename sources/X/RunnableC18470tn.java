package X;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.0tn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC18470tn implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public Matrix A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float[] A0D = new float[2];
    public final View A0E;
    public final OverScroller A0F;
    public final C0T0 A0G;

    public RunnableC18470tn(View view, C0T0 c0t0) {
        this.A0E = view;
        this.A0G = c0t0;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0F = overScroller;
        overScroller.setFriction(0.035f);
    }

    @Override // java.lang.Runnable
    public void run() {
        OverScroller overScroller;
        boolean z;
        int i;
        int i2;
        if (this.A08) {
            C06390Sx c06390Sx = (C06390Sx) this.A0G;
            c06390Sx.A0M.A04();
            c06390Sx.A05();
            return;
        }
        if (!this.A0C) {
            if (this.A09) {
                this.A0F.forceFinished(true);
                this.A01 = 0.0f;
            } else if (this.A0A) {
                this.A0F.forceFinished(true);
                this.A00 = 0.0f;
            }
            this.A0A = false;
            this.A09 = false;
            this.A0C = true;
        }
        if (this.A0F.computeScrollOffset()) {
            this.A0D[0] = overScroller.getCurrX();
            this.A0D[1] = overScroller.getCurrY();
            Matrix matrix = this.A06;
            if (matrix != null) {
                matrix.mapPoints(this.A0D);
            }
            float[] fArr = this.A0D;
            float f = fArr[0];
            float f2 = fArr[1];
            if (this.A0B) {
                this.A0B = false;
                this.A02 = f;
                this.A03 = f2;
            }
            ((C06390Sx) this.A0G).A0A(f - this.A02, f2 - this.A03);
            this.A02 = f;
            this.A03 = f2;
            z = true;
        } else {
            z = false;
        }
        double d = this.A01;
        if (d < -0.01d || d > 0.01d) {
            long j = this.A05;
            int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i3 == 0) {
                this.A05 = uptimeMillis;
                i = 1;
            } else {
                i = ((int) (uptimeMillis - j)) / 10;
                this.A05 = j + (i * 10);
            }
            float pow = (float) (Math.pow(0.9150000214576721d, i) * d);
            this.A01 = pow;
            C06390Sx c06390Sx2 = (C06390Sx) this.A0G;
            if (c06390Sx2.A0K(pow + 1.0f, c06390Sx2.A08, c06390Sx2.A09)) {
                z = true;
            } else {
                this.A01 = 0.0f;
            }
        }
        double d2 = this.A00;
        if (d2 >= -0.01d && d2 <= 0.01d) {
            if (!z) {
                this.A0C = false;
                this.A07 = false;
                C06390Sx c06390Sx3 = (C06390Sx) this.A0G;
                c06390Sx3.A0M.A04();
                c06390Sx3.A05();
                return;
            }
        } else {
            long j2 = this.A04;
            int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (i4 == 0) {
                this.A04 = uptimeMillis2;
                i2 = 1;
            } else {
                i2 = ((int) (uptimeMillis2 - j2)) / 10;
                this.A04 = j2 + (i2 * 10);
            }
            float pow2 = (float) (Math.pow(0.8500000238418579d, i2) * d2);
            this.A00 = pow2;
            C06390Sx c06390Sx4 = (C06390Sx) this.A0G;
            c06390Sx4.A0B(c06390Sx4.A0B + pow2, c06390Sx4.A08, c06390Sx4.A09);
        }
        View view = this.A0E;
        view.invalidate();
        view.postOnAnimation(this);
    }
}
