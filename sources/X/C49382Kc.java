package X;

/* renamed from: X.2Kc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49382Kc {
    public long A00;
    public final C468628o A01;

    public C49382Kc(C468628o c468628o) {
        this.A01 = c468628o;
        this.A00 = 1L;
    }

    public C49382Kc(C468628o c468628o, long j) {
        this.A01 = c468628o;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49382Kc) {
            C49382Kc c49382Kc = (C49382Kc) obj;
            return this.A00 == c49382Kc.A00 && this.A01.equals(c49382Kc.A01);
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        return ((this.A01.hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
