package X;

/* renamed from: X.0PN  reason: invalid class name */
/* loaded from: classes.dex */
public class C0PN extends C0PJ {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    @Override // X.C0PJ
    public /* bridge */ /* synthetic */ C0PJ A00(C0PJ c0pj) {
        A02((C0PN) c0pj);
        return this;
    }

    @Override // X.C0PJ
    public C0PJ A01(C0PJ c0pj, C0PJ c0pj2) {
        C0PN c0pn = (C0PN) c0pj;
        C0PN c0pn2 = (C0PN) c0pj2;
        if (c0pn2 == null) {
            c0pn2 = new C0PN();
        }
        if (c0pn == null) {
            c0pn2.A02(this);
            return c0pn2;
        }
        c0pn2.systemTimeS = this.systemTimeS - c0pn.systemTimeS;
        c0pn2.userTimeS = this.userTimeS - c0pn.userTimeS;
        c0pn2.childSystemTimeS = this.childSystemTimeS - c0pn.childSystemTimeS;
        c0pn2.childUserTimeS = this.childUserTimeS - c0pn.childUserTimeS;
        return c0pn2;
    }

    public void A02(C0PN c0pn) {
        this.userTimeS = c0pn.userTimeS;
        this.systemTimeS = c0pn.systemTimeS;
        this.childUserTimeS = c0pn.childUserTimeS;
        this.childSystemTimeS = c0pn.childSystemTimeS;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0PN.class != obj.getClass()) {
            return false;
        }
        C0PN c0pn = (C0PN) obj;
        return Double.compare(c0pn.systemTimeS, this.systemTimeS) == 0 && Double.compare(c0pn.userTimeS, this.userTimeS) == 0 && Double.compare(c0pn.childSystemTimeS, this.childSystemTimeS) == 0 && Double.compare(c0pn.childUserTimeS, this.childUserTimeS) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.userTimeS);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.childSystemTimeS);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.childUserTimeS);
        return (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CpuMetrics{userTimeS=");
        A0P.append(this.userTimeS);
        A0P.append(", systemTimeS=");
        A0P.append(this.systemTimeS);
        A0P.append(", childUserTimeS=");
        A0P.append(this.childUserTimeS);
        A0P.append(", childSystemTimeS=");
        A0P.append(this.childSystemTimeS);
        A0P.append('}');
        return A0P.toString();
    }
}
