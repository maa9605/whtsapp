package X;

/* renamed from: X.0XS  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XS {
    public final String A00;
    public final C0XR A01;

    public C0XS(String str, C0XR c0xr) {
        this.A00 = str;
        this.A01 = c0xr;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0XS)) {
            C0XS c0xs = (C0XS) obj;
            return this.A00.equals(c0xs.A00) && this.A01.equals(c0xs.A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }
}
