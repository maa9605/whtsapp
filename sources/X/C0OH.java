package X;

import android.os.Build;

/* renamed from: X.0OH  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OH {
    public static final C0OH A08 = new C0OH(new C0OG());
    public long A00;
    public long A01;
    public C015607h A02;
    public C07j A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public C0OH() {
        this.A03 = C07j.NOT_REQUIRED;
        this.A00 = -1L;
        this.A01 = -1L;
        this.A02 = new C015607h();
    }

    public C0OH(C0OG builder) {
        this.A03 = C07j.NOT_REQUIRED;
        this.A00 = -1L;
        this.A01 = -1L;
        this.A02 = new C015607h();
        this.A05 = false;
        int i = Build.VERSION.SDK_INT;
        this.A06 = false;
        this.A03 = builder.A03;
        this.A04 = false;
        this.A07 = false;
        if (i >= 24) {
            this.A02 = builder.A02;
            this.A00 = -1L;
            this.A01 = -1L;
        }
    }

    public C0OH(C0OH other) {
        this.A03 = C07j.NOT_REQUIRED;
        this.A00 = -1L;
        this.A01 = -1L;
        this.A02 = new C015607h();
        this.A05 = other.A05;
        this.A06 = other.A06;
        this.A03 = other.A03;
        this.A04 = other.A04;
        this.A07 = other.A07;
        this.A02 = other.A02;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || C0OH.class != o.getClass()) {
            return false;
        }
        C0OH c0oh = (C0OH) o;
        if (this.A05 == c0oh.A05 && this.A06 == c0oh.A06 && this.A04 == c0oh.A04 && this.A07 == c0oh.A07 && this.A00 == c0oh.A00 && this.A01 == c0oh.A01 && this.A03 == c0oh.A03) {
            return this.A02.equals(c0oh.A02);
        }
        return false;
    }

    public int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return this.A02.hashCode() + (((((((((((((this.A03.hashCode() * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
