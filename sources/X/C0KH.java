package X;

/* renamed from: X.0KH  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KH {
    public final String A00;
    public final boolean A01;

    public C0KH(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final String toString() {
        String str = this.A00;
        boolean z = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
