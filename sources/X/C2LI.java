package X;

/* renamed from: X.2LI  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2LI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C0TS A04;
    public C0TS A05;

    public C2LI(C0TS c0ts, C0TS c0ts2, int i, int i2, int i3, int i4) {
        this.A05 = c0ts;
        this.A04 = c0ts2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ChangeInfo{oldHolder=");
        A0P.append(this.A05);
        A0P.append(", newHolder=");
        A0P.append(this.A04);
        A0P.append(", fromX=");
        A0P.append(this.A00);
        A0P.append(", fromY=");
        A0P.append(this.A01);
        A0P.append(", toX=");
        A0P.append(this.A02);
        A0P.append(", toY=");
        A0P.append(this.A03);
        A0P.append('}');
        return A0P.toString();
    }
}
