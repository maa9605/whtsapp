package X;

/* renamed from: X.0tB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18100tB {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04 = false;

    public C18100tB(float f, float f2, float f3, float f4) {
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = f;
        this.A03 = f2;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            this.A00 = (float) (f3 / sqrt);
            this.A01 = (float) (f4 / sqrt);
        }
    }

    public void A00(float f, float f2) {
        float f3 = f - this.A02;
        float f4 = f2 - this.A03;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            f3 = (float) (f3 / sqrt);
            f4 = (float) (f4 / sqrt);
        }
        float f5 = this.A00;
        if (f3 == (-f5) && f4 == (-this.A01)) {
            this.A04 = true;
            this.A00 = -f4;
            this.A01 = f3;
            return;
        }
        this.A00 = f5 + f3;
        this.A01 += f4;
    }

    public void A01(C18100tB c18100tB) {
        float f = c18100tB.A00;
        float f2 = this.A00;
        if (f == (-f2)) {
            float f3 = c18100tB.A01;
            if (f3 == (-this.A01)) {
                this.A04 = true;
                this.A00 = -f3;
                this.A01 = c18100tB.A00;
                return;
            }
        }
        this.A00 = f2 + f;
        this.A01 += c18100tB.A01;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("(");
        A0P.append(this.A02);
        A0P.append(",");
        A0P.append(this.A03);
        A0P.append(" ");
        A0P.append(this.A00);
        A0P.append(",");
        A0P.append(this.A01);
        A0P.append(")");
        return A0P.toString();
    }
}
