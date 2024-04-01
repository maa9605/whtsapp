package X;

/* renamed from: X.1x7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43261x7 {
    public int A00;
    public int A01;
    public int A02;
    public boolean A06;
    public int A04 = -1;
    public int A03 = -1;
    public int A05 = 0;

    public C43261x7(int i, int i2, int i3, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A06 = z;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("container: ");
        A0P.append(this.A01);
        A0P.append(", video: ");
        A0P.append(this.A02);
        A0P.append(", audio: ");
        A0P.append(this.A00);
        A0P.append(", problems: ");
        A0P.append(this.A06);
        return A0P.toString();
    }
}
