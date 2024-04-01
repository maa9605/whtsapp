package X;

/* renamed from: X.0l0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13280l0 {
    public float A00;
    public float A01;
    public float A02;
    public int A05;
    public int A06;
    public int A07;
    public long A09 = Long.MIN_VALUE;
    public long A0A = -1;
    public long A08 = 0;
    public int A03 = 0;
    public int A04 = 0;

    public final float A00(long j) {
        long j2 = this.A09;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.A0A;
        if (j3 >= 0 && j >= j3) {
            float f = this.A00;
            float f2 = 1.0f - f;
            float f3 = ((float) (j - j3)) / this.A05;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            } else if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            return (f3 * f) + f2;
        }
        float f4 = ((float) (j - j2)) / this.A07;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return f4 * 0.5f;
    }
}
