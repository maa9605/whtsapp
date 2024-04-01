package X;

/* renamed from: X.0sn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17860sn {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public C17860sn(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }

    public C17860sn(C17860sn c17860sn) {
        this.A01 = c17860sn.A01;
        this.A02 = c17860sn.A02;
        this.A03 = c17860sn.A03;
        this.A00 = c17860sn.A00;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[");
        A0P.append(this.A01);
        A0P.append(" ");
        A0P.append(this.A02);
        A0P.append(" ");
        A0P.append(this.A03);
        A0P.append(" ");
        A0P.append(this.A00);
        A0P.append("]");
        return A0P.toString();
    }
}
