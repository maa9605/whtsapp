package X;

/* renamed from: X.14A  reason: invalid class name */
/* loaded from: classes.dex */
public final class C14A {
    public final Object A00;
    public final String A01 = "LocationListener";

    public C14A(Object obj) {
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14A) {
            C14A c14a = (C14A) obj;
            return this.A00 == c14a.A00 && this.A01.equals(c14a.A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode() + (System.identityHashCode(this.A00) * 31);
    }
}
