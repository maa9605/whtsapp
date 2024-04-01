package X;

/* renamed from: X.0zx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21820zx {
    public static final C21820zx A02 = new C21820zx(0, 0);
    public final long A00;
    public final long A01;

    public C21820zx(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21820zx.class != obj.getClass()) {
            return false;
        }
        C21820zx c21820zx = (C21820zx) obj;
        return this.A01 == c21820zx.A01 && this.A00 == c21820zx.A00;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[timeUs=");
        A0P.append(this.A01);
        A0P.append(", position=");
        A0P.append(this.A00);
        A0P.append("]");
        return A0P.toString();
    }
}
