package X;

/* renamed from: X.0HN  reason: invalid class name */
/* loaded from: classes.dex */
public class C0HN {
    public final int A00;
    public final String A01;

    public C0HN(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("IntegrityCheckResult{result=");
        A0P.append(this.A00);
        A0P.append(", jidSuffix='");
        A0P.append(this.A01);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
