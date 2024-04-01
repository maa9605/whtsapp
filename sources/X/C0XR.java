package X;

/* renamed from: X.0XR  reason: invalid class name */
/* loaded from: classes.dex */
public class C0XR {
    public final int A00;
    public final String A01;

    public C0XR(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0XR)) {
            C0XR c0xr = (C0XR) obj;
            return this.A01.equals(c0xr.A01) && this.A00 == c0xr.A00;
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(":");
        sb.append(this.A00);
        return sb.toString();
    }
}
