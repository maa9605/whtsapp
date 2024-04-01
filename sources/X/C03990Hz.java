package X;

/* renamed from: X.0Hz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03990Hz {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public C03990Hz(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C03990Hz.class != obj.getClass()) {
            return false;
        }
        C03990Hz c03990Hz = (C03990Hz) obj;
        return this.A00 == c03990Hz.A00 && this.A01 == c03990Hz.A01 && this.A02 == c03990Hz.A02;
    }

    public int hashCode() {
        return (((this.A00 * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0);
    }
}
