package X;

/* renamed from: X.1D4  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1D4 {
    public C1DF A00;
    public final C1D3 A01;

    public C1D4(C1D3 c1d3) {
        this.A01 = c1d3;
    }

    public String toString() {
        try {
            C1DF c1df = this.A00;
            if (c1df == null) {
                c1df = this.A01.A00();
                this.A00 = c1df;
            }
            return c1df.toString();
        } catch (C33151fR unused) {
            return "";
        }
    }
}
