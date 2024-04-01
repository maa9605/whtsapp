package X;

/* renamed from: X.2D3  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2D3 {
    public boolean A00;
    public final int A01;
    public final C50322Rg A02;
    public final String A03;
    public final String A04;

    public C2D3(String str, String str2, boolean z, int i, C50322Rg c50322Rg) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = z;
        this.A01 = i;
        this.A02 = c50322Rg;
    }

    public Object clone() {
        return new C2D3(this.A04, this.A03, this.A00, this.A01, this.A02);
    }
}
