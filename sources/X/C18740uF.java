package X;

/* renamed from: X.0uF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18740uF {
    public final C016007m A00;
    public final C016007m A01;

    public C18740uF(C016007m c016007m, C016007m c016007m2) {
        double d = c016007m.A00;
        double d2 = c016007m2.A00;
        if (d <= d2) {
            this.A01 = c016007m;
            this.A00 = c016007m2;
            return;
        }
        StringBuilder A0P = C000200d.A0P("Southern latitude (");
        A0P.append(d);
        A0P.append(") exceeds Northern latitude (");
        A0P.append(d2);
        A0P.append(").");
        throw new IllegalArgumentException(A0P.toString());
    }

    public static double A00(double d, double d2) {
        double d3 = d - d2;
        return d3 + (d3 < 0.0d ? 360 : 0);
    }

    public C016007m A01() {
        double d;
        C016007m c016007m = this.A01;
        double d2 = c016007m.A00;
        C016007m c016007m2 = this.A00;
        double d3 = (d2 + c016007m2.A00) / 2.0d;
        double d4 = c016007m.A01;
        double d5 = c016007m2.A01;
        int i = (d4 > d5 ? 1 : (d4 == d5 ? 0 : -1));
        double d6 = d4 + d5;
        if (i <= 0) {
            d = d6 / 2.0d;
        } else {
            double d7 = (d6 + 360.0d) / 2.0d;
            d = d7 - (d7 <= 180.0d ? 0.0d : 360.0d);
        }
        return new C016007m(d3, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18740uF) {
            C18740uF c18740uF = (C18740uF) obj;
            return this.A00.equals(c18740uF.A00) && this.A01.equals(c18740uF.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() + ((this.A00.hashCode() + 527) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LatLngBounds");
        sb.append("{northeast=");
        sb.append(this.A00);
        sb.append(", southwest=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }
}
