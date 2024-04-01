package X;

import android.graphics.Point;

/* renamed from: X.0tl */
/* loaded from: classes.dex */
public final class C18450tl {
    public final C0T4 A00;
    public final float[] A02 = new float[2];
    public final C18630u3 A01 = new C18630u3();

    public static float A02(double d) {
        return ((float) (d + 180.0d)) / 360.0f;
    }

    public C18450tl(C0T4 c0t4) {
        this.A00 = c0t4;
    }

    public static double A00(double d) {
        return ((Math.atan(Math.exp((1.0d - (d * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public static float A01(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return (float) (0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d));
    }

    public double A03(float f) {
        C06390Sx c06390Sx = this.A00.A0E;
        return f / (((float) c06390Sx.A0J) * c06390Sx.A0C);
    }

    public Point A04(C016007m c016007m) {
        double d = c016007m.A00;
        double d2 = c016007m.A01;
        float[] fArr = this.A02;
        A07(A02(d2), A01(d), fArr);
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public C016007m A05(float f, float f2) {
        float[] fArr = this.A02;
        A09(f, f2, fArr);
        return new C016007m(A00(fArr[1]), (fArr[0] * 360.0d) - 180.0d);
    }

    public C18800uL A06() {
        C0T4 c0t4;
        C06390Sx c06390Sx = this.A00.A0E;
        float f = 0;
        C016007m A05 = A05(f, c06390Sx.A0D - c0t4.A04);
        C016007m A052 = A05(c06390Sx.A0F - c0t4.A05, c06390Sx.A0D - c0t4.A04);
        C016007m A053 = A05(f, c0t4.A06);
        C016007m A054 = A05(c06390Sx.A0F - c0t4.A05, c0t4.A06);
        C18730uE c18730uE = new C18730uE();
        c18730uE.A00(A05);
        c18730uE.A00(A053);
        c18730uE.A00(A052);
        c18730uE.A00(A054);
        return new C18800uL(A05, A052, A053, A054, new C18740uF(new C016007m(c18730uE.A02, c18730uE.A03), new C016007m(c18730uE.A01, c18730uE.A00)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
        if ((r4 - r11) < (r2 - r8)) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(double r11, double r13, float[] r15) {
        /*
            r10 = this;
            X.0u3 r6 = r10.A01
            r10.A0A(r6)
            double r4 = r6.A01
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L11
            double r1 = r6.A02
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
        L11:
            double r0 = r4 - r11
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            double r2 = (double) r0
            double r2 = r2 + r11
            double r8 = r6.A02
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L2f
            double r6 = r2 - r8
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r2 - r0
            double r4 = r4 - r11
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L2f
        L2b:
            r10.A08(r11, r13, r15)
            return
        L2f:
            r11 = r2
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18450tl.A07(double, double, float[]):void");
    }

    public void A08(double d, double d2, float[] fArr) {
        C06390Sx c06390Sx = this.A00.A0E;
        double d3 = c06390Sx.A02;
        C18630u3 c18630u3 = this.A01;
        A0A(c18630u3);
        double d4 = c18630u3.A01;
        if (d4 > d3 || d3 > c18630u3.A02) {
            d3 += (int) Math.ceil(d4 - d3);
        }
        float f = (float) c06390Sx.A0J;
        fArr[0] = ((float) (d - d3)) * f;
        fArr[1] = ((float) (d2 - c06390Sx.A03)) * f;
        c06390Sx.A0k.mapVectors(fArr);
        fArr[0] = fArr[0] + c06390Sx.A04;
        fArr[1] = fArr[1] + c06390Sx.A05;
    }

    public void A09(float f, float f2, float[] fArr) {
        C06390Sx c06390Sx = this.A00.A0E;
        fArr[0] = f - c06390Sx.A04;
        fArr[1] = f2 - c06390Sx.A05;
        c06390Sx.A0l.mapVectors(fArr);
        double d = c06390Sx.A02;
        float f3 = fArr[0];
        float f4 = (float) c06390Sx.A0J;
        fArr[0] = (float) (d + (f3 / f4));
        fArr[1] = (float) (c06390Sx.A03 + (fArr[1] / f4));
        float f5 = fArr[0];
        if (f5 > 1.0f) {
            fArr[0] = f5 - 1.0f;
        } else if (f5 >= 0.0f) {
        } else {
            fArr[0] = f5 + 1.0f;
        }
    }

    public final void A0A(C18630u3 c18630u3) {
        C06390Sx c06390Sx = this.A00.A0E;
        double d = c06390Sx.A03;
        double d2 = c06390Sx.A01;
        c18630u3.A03 = d - d2;
        c18630u3.A00 = d + d2;
        double d3 = c06390Sx.A02;
        double d4 = c06390Sx.A00;
        double d5 = d3 - d4;
        c18630u3.A01 = d5;
        double d6 = d3 + d4;
        c18630u3.A02 = d6;
        if (d5 < 0.0d) {
            double ceil = (int) Math.ceil(-d5);
            c18630u3.A01 = d5 + ceil;
            c18630u3.A02 = d6 + ceil;
        }
    }
}
