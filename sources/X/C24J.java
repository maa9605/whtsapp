package X;

/* renamed from: X.24J  reason: invalid class name */
/* loaded from: classes2.dex */
public class C24J {
    public long A00;
    public long A01;
    public final String A02;

    public C24J(String str) {
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("bootstrapSessionId=");
        A0P.append(this.A02);
        return A0P.toString();
    }
}
