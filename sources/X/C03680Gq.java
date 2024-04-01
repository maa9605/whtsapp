package X;

/* renamed from: X.0Gq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03680Gq {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public C03680Gq(String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("=");
        sb.append(this.A02 ? "skipped" : this.A00);
        return sb.toString();
    }
}
