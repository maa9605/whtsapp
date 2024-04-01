package X;

/* renamed from: X.0zv */
/* loaded from: classes.dex */
public final class C21800zv {
    public final C21820zx A00;
    public final C21820zx A01;

    public C21800zv(C21820zx c21820zx) {
        this.A00 = c21820zx;
        this.A01 = c21820zx;
    }

    public C21800zv(C21820zx c21820zx, C21820zx c21820zx2) {
        this.A00 = c21820zx;
        this.A01 = c21820zx2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21800zv.class != obj.getClass()) {
            return false;
        }
        C21800zv c21800zv = (C21800zv) obj;
        return this.A00.equals(c21800zv.A00) && this.A01.equals(c21800zv.A01);
    }

    public int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public String toString() {
        String obj;
        StringBuilder A0P = C000200d.A0P("[");
        C21820zx c21820zx = this.A00;
        A0P.append(c21820zx);
        C21820zx c21820zx2 = this.A01;
        if (c21820zx.equals(c21820zx2)) {
            obj = "";
        } else {
            StringBuilder A0P2 = C000200d.A0P(", ");
            A0P2.append(c21820zx2);
            obj = A0P2.toString();
        }
        return C000200d.A0L(A0P, obj, "]");
    }
}
