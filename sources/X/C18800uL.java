package X;

/* renamed from: X.0uL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18800uL {
    public final C016007m A00;
    public final C016007m A01;
    public final C016007m A02;
    public final C016007m A03;
    public final C18740uF A04;

    public C18800uL(C016007m c016007m, C016007m c016007m2, C016007m c016007m3, C016007m c016007m4, C18740uF c18740uF) {
        this.A02 = c016007m;
        this.A03 = c016007m2;
        this.A00 = c016007m3;
        this.A01 = c016007m4;
        this.A04 = c18740uF;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18800uL) {
            C18800uL c18800uL = (C18800uL) obj;
            C016007m c016007m = this.A02;
            if (c016007m == null) {
                if (c18800uL.A02 != null) {
                    return false;
                }
            } else if (!c016007m.equals(c18800uL.A02)) {
                return false;
            }
            C016007m c016007m2 = this.A03;
            if (c016007m2 == null) {
                if (c18800uL.A03 != null) {
                    return false;
                }
            } else if (!c016007m2.equals(c18800uL.A03)) {
                return false;
            }
            C016007m c016007m3 = this.A00;
            if (c016007m3 == null) {
                if (c18800uL.A00 != null) {
                    return false;
                }
            } else if (!c016007m3.equals(c18800uL.A00)) {
                return false;
            }
            C016007m c016007m4 = this.A01;
            if (c016007m4 == null) {
                if (c18800uL.A01 != null) {
                    return false;
                }
            } else if (!c016007m4.equals(c18800uL.A01)) {
                return false;
            }
            C18740uF c18740uF = this.A04;
            C18740uF c18740uF2 = c18800uL.A04;
            return c18740uF == null ? c18740uF2 == null : c18740uF.equals(c18740uF2);
        }
        return false;
    }

    public int hashCode() {
        C016007m c016007m = this.A02;
        int hashCode = (527 + (c016007m != null ? c016007m.hashCode() : 0)) * 31;
        C016007m c016007m2 = this.A03;
        int hashCode2 = (hashCode + (c016007m2 != null ? c016007m2.hashCode() : 0)) * 31;
        C016007m c016007m3 = this.A00;
        int hashCode3 = (hashCode2 + (c016007m3 != null ? c016007m3.hashCode() : 0)) * 31;
        C016007m c016007m4 = this.A01;
        int hashCode4 = (hashCode3 + (c016007m4 != null ? c016007m4.hashCode() : 0)) * 31;
        C18740uF c18740uF = this.A04;
        return hashCode4 + (c18740uF != null ? c18740uF.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VisibleRegion");
        sb.append("{nearLeft=");
        sb.append(this.A02);
        sb.append(", nearRight=");
        sb.append(this.A03);
        sb.append(", farLeft=");
        sb.append(this.A00);
        sb.append(", farRight=");
        sb.append(this.A01);
        sb.append(", latLngBounds=");
        sb.append(this.A04);
        sb.append("}");
        return sb.toString();
    }
}
