package X;

/* renamed from: X.42C  reason: invalid class name */
/* loaded from: classes3.dex */
public class C42C {
    public final int A00;
    public final int A01;

    public C42C(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42C) {
            C42C c42c = (C42C) obj;
            return this.A01 == c42c.A01 && this.A00 == c42c.A00;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("x");
        sb.append(this.A00);
        return sb.toString();
    }
}
