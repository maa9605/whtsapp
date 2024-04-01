package X;

/* renamed from: X.1xi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43631xi {
    public final String A00;
    public final boolean A01;

    public C43631xi(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[hash=");
        A0P.append(this.A00);
        A0P.append(", optimistic=");
        A0P.append(this.A01);
        A0P.append("]");
        return A0P.toString();
    }
}
