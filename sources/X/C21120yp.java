package X;

/* renamed from: X.0yp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21120yp {
    public static final C21120yp A04 = new C21120yp(1.0f, 1.0f, false);
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;

    public C21120yp(float f, float f2, boolean z) {
        C002701i.A1J(f > 0.0f);
        C002701i.A1J(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A03 = z;
        this.A02 = Math.round(f * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21120yp.class != obj.getClass()) {
            return false;
        }
        C21120yp c21120yp = (C21120yp) obj;
        return this.A01 == c21120yp.A01 && this.A00 == c21120yp.A00 && this.A03 == c21120yp.A03;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.A00) + ((Float.floatToRawIntBits(this.A01) + 527) * 31)) * 31) + (this.A03 ? 1 : 0);
    }
}
