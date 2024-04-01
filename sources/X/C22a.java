package X;

/* renamed from: X.22a  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C22a {
    public final boolean A00;
    public final boolean A01;

    public C22a(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("[interactive=");
        A0P.append(this.A01);
        A0P.append(", has_status=");
        A0P.append(this.A00);
        A0P.append("]");
        return A0P.toString();
    }
}
