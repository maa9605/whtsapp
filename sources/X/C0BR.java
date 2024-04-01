package X;

/* renamed from: X.0BR  reason: invalid class name */
/* loaded from: classes.dex */
public class C0BR {
    public final Class A00;
    public final boolean A01;

    public C0BR(Class cls, boolean z) {
        this.A00 = cls;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0BR) {
            C0BR c0br = (C0BR) obj;
            return c0br.A00.equals(this.A00) && c0br.A01 == this.A01;
        }
        return false;
    }

    public int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A01).hashCode();
    }
}
