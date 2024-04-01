package X;

/* renamed from: X.1Y2  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y2 {
    public static final C1Y2 A03 = new C1Y2();
    public int A00 = Integer.MAX_VALUE;
    public boolean A02 = true;
    public boolean A01 = true;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1Y2) {
            C1Y2 c1y2 = (C1Y2) obj;
            return this.A00 == c1y2.A00 && this.A02 == c1y2.A02 && this.A01 == c1y2.A01;
        }
        return false;
    }

    public int hashCode() {
        return (this.A00 ^ (this.A02 ? 4194304 : 0)) ^ (this.A01 ? 8388608 : 0);
    }
}
