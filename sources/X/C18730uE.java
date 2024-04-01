package X;

/* renamed from: X.0uE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18730uE {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public boolean A04 = false;

    public void A00(C016007m c016007m) {
        if (!this.A04) {
            double d = c016007m.A00;
            this.A02 = d;
            this.A01 = d;
            double d2 = c016007m.A01;
            this.A00 = d2;
            this.A03 = d2;
            this.A04 = true;
        }
        double d3 = c016007m.A00;
        if (d3 > this.A01) {
            this.A01 = d3;
        } else if (d3 < this.A02) {
            this.A02 = d3;
        }
        double d4 = this.A00;
        double d5 = this.A03;
        double A00 = C18740uF.A00(d4, d5);
        double d6 = c016007m.A01;
        double A002 = C18740uF.A00(d6, d5);
        double A003 = C18740uF.A00(d4, d6);
        if (Double.compare(A002, A00) > 0 || Double.compare(A003, A00) > 0) {
            if (A002 <= A003) {
                this.A00 = d6;
            } else {
                this.A03 = d6;
            }
        }
    }
}
