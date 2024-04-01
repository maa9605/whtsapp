package X;

/* renamed from: X.10g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C219010g {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;

    public C219010g(Object obj) {
        this.A04 = obj;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = -1L;
        this.A02 = Long.MIN_VALUE;
    }

    public C219010g(Object obj, int i, int i2, long j) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = Long.MIN_VALUE;
    }

    public C219010g(Object obj, int i, int i2, long j, long j2) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = j2;
    }

    public C219010g(Object obj, long j, long j2) {
        this.A04 = obj;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = j;
        this.A02 = j2;
    }

    public boolean A00() {
        return this.A00 != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C219010g.class != obj.getClass()) {
            return false;
        }
        C219010g c219010g = (C219010g) obj;
        return this.A04.equals(c219010g.A04) && this.A00 == c219010g.A00 && this.A01 == c219010g.A01 && this.A03 == c219010g.A03 && this.A02 == c219010g.A02;
    }

    public int hashCode() {
        return ((((((((this.A04.hashCode() + 527) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03)) * 31) + ((int) this.A02);
    }
}
