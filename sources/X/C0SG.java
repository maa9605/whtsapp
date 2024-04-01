package X;

/* renamed from: X.0SG  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SG {
    public int A00 = -1;
    public C1DV A01;
    public C1DX A02;
    public C24841Db A03;
    public C017708g A04;

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.A02);
        sb.append("\n ecLevel: ");
        sb.append(this.A01);
        sb.append("\n version: ");
        sb.append(this.A03);
        sb.append("\n maskPattern: ");
        sb.append(this.A00);
        C017708g c017708g = this.A04;
        if (c017708g == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(c017708g);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
