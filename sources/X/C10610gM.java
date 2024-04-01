package X;

/* renamed from: X.0gM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10610gM {
    public static C10610gM A03;
    public int A00;
    public long A01;
    public long A02;

    public void A00(long j, double d, double d2) {
        float f;
        float f2;
        double d3;
        double d4 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = Math.sin(d4);
        double sin2 = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (sin * 0.03341960161924362d) + d4 + 1.796593063d + 3.141592653589793d;
        double sin3 = Math.sin(2.0d * sin2) * (-0.0069d);
        double round = sin3 + (sin * 0.0053d) + ((float) Math.round((f - 9.0E-4f) - d3)) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin2));
        double d5 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin4 >= 1.0d) {
            this.A00 = 1;
            this.A02 = -1L;
            this.A01 = -1L;
        } else if (sin4 <= -1.0d) {
            this.A00 = 0;
            this.A02 = -1L;
            this.A01 = -1L;
        } else {
            double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
            long round2 = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            this.A02 = round2;
            long round3 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.A01 = round3;
            if (round3 >= j || round2 <= j) {
                this.A00 = 1;
            } else {
                this.A00 = 0;
            }
        }
    }
}
