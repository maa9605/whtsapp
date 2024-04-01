package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.0Xt */
/* loaded from: classes.dex */
public class C07320Xt {
    public static final Matrix A0G = new Matrix();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public Paint A06;
    public Paint A07;
    public PathMeasure A08;
    public Boolean A09;
    public String A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final C006702y A0E;
    public final C07330Xu A0F;

    public C07320Xt() {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = 255;
        this.A0A = null;
        this.A09 = null;
        this.A0E = new C006702y();
        this.A0F = new C07330Xu();
        this.A0C = new Path();
        this.A0D = new Path();
    }

    public C07320Xt(C07320Xt c07320Xt) {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A05 = 255;
        this.A0A = null;
        this.A09 = null;
        C006702y c006702y = new C006702y();
        this.A0E = c006702y;
        this.A0F = new C07330Xu(c07320Xt.A0F, c006702y);
        this.A0C = new Path(c07320Xt.A0C);
        this.A0D = new Path(c07320Xt.A0D);
        this.A01 = c07320Xt.A01;
        this.A00 = c07320Xt.A00;
        this.A03 = c07320Xt.A03;
        this.A02 = c07320Xt.A02;
        this.A04 = c07320Xt.A04;
        this.A05 = c07320Xt.A05;
        this.A0A = c07320Xt.A0A;
        String str = c07320Xt.A0A;
        if (str != null) {
            this.A0E.put(str, this);
        }
        this.A09 = c07320Xt.A09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0118, code lost:
        if (r0 != 0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A00(X.C07330Xu r21, android.graphics.Matrix r22, android.graphics.Canvas r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07320Xt.A00(X.0Xu, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return this.A05 / 255.0f;
    }

    public int getRootAlpha() {
        return this.A05;
    }

    public void setAlpha(float f) {
        this.A05 = (int) (f * 255.0f);
    }

    public void setRootAlpha(int i) {
        this.A05 = i;
    }
}
