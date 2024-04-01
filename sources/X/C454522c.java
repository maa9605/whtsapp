package X;

/* renamed from: X.22c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C454522c {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C454522c(int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i3;
    }

    public C454522c(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("{maxKb=");
        A0P.append(this.A02);
        A0P.append(", quality=");
        A0P.append(this.A03);
        A0P.append(", maxEdge=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
