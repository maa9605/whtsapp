package X;

import android.graphics.Path;
import android.util.Log;

/* renamed from: X.07Q  reason: invalid class name */
/* loaded from: classes.dex */
public class C07Q {
    public char A00;
    public float[] A01;

    public C07Q(char c, float[] fArr) {
        this.A00 = c;
        this.A01 = fArr;
    }

    public C07Q(C07Q c07q) {
        this.A00 = c07q.A00;
        float[] fArr = c07q.A01;
        int length = fArr.length - 0;
        int min = Math.min(length, length);
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        this.A01 = fArr2;
    }

    public static void A00(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = d3;
        double d5 = f2;
        double d6 = f5;
        double d7 = ((d5 * sin) + (d3 * cos)) / d6;
        double d8 = f6;
        double d9 = ((d5 * cos) + ((-f) * sin)) / d8;
        double d10 = f4;
        double d11 = ((d10 * sin) + (f3 * cos)) / d6;
        double d12 = ((d10 * cos) + ((-f3) * sin)) / d8;
        double d13 = d7 - d11;
        double d14 = d9 - d12;
        double d15 = (d7 + d11) / 2.0d;
        double d16 = (d9 + d12) / 2.0d;
        double d17 = (d14 * d14) + (d13 * d13);
        if (d17 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d18 = (1.0d / d17) - 0.25d;
        if (d18 < 0.0d) {
            StringBuilder sb = new StringBuilder("Points are too far apart ");
            sb.append(d17);
            Log.w("PathParser", sb.toString());
            float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
            A00(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d18);
        double d19 = d13 * sqrt2;
        double d20 = sqrt2 * d14;
        if (z == z2) {
            d = d15 - d20;
            d2 = d16 + d19;
        } else {
            d = d15 + d20;
            d2 = d16 - d19;
        }
        double atan2 = Math.atan2(d9 - d2, d7 - d);
        double atan22 = Math.atan2(d12 - d2, d11 - d) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d21 = d * d6;
        double d22 = d2 * d8;
        double d23 = (d21 * cos) - (d22 * sin);
        double d24 = (d22 * cos) + (d21 * sin);
        int ceil = (int) Math.ceil(Math.abs((4.0d * atan22) / 3.141592653589793d));
        double cos2 = Math.cos(atan2);
        double sin2 = Math.sin(atan2);
        double d25 = -d6;
        double d26 = d25 * cos;
        double d27 = d8 * sin;
        double d28 = (d26 * sin2) - (d27 * cos2);
        double d29 = d25 * sin;
        double d30 = d8 * cos;
        double d31 = (cos2 * d30) + (sin2 * d29);
        double d32 = atan22 / ceil;
        int i = 0;
        while (i < ceil) {
            double d33 = atan2 + d32;
            double sin3 = Math.sin(d33);
            double cos3 = Math.cos(d33);
            double d34 = (((d6 * cos) * cos3) + d23) - (d27 * sin3);
            double d35 = (d30 * sin3) + (d6 * sin * cos3) + d24;
            double d36 = (d26 * sin3) - (d27 * cos3);
            double d37 = (cos3 * d30) + (sin3 * d29);
            double d38 = d33 - atan2;
            double tan = Math.tan(d38 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d38)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d28 * sqrt3) + d4), (float) ((d31 * sqrt3) + d5), (float) (d34 - (sqrt3 * d36)), (float) (d35 - (sqrt3 * d37)), (float) d34, (float) d35);
            i++;
            d4 = d34;
            d5 = d35;
            atan2 = d33;
            d31 = d37;
            d28 = d36;
        }
    }

    public static void A01(C07Q[] c07qArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float[] fArr = new float[6];
        char c = 'm';
        char c2 = 0;
        char c3 = 'm';
        int i2 = 0;
        while (i2 < c07qArr.length) {
            C07Q c07q = c07qArr[i2];
            char c4 = c07q.A00;
            float[] fArr2 = c07q.A01;
            float f7 = fArr[c2];
            float f8 = fArr[1];
            float f9 = fArr[2];
            float f10 = fArr[3];
            float f11 = fArr[4];
            float f12 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case C0M6.A02 /* 72 */:
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f11, f12);
                    f7 = f11;
                    f9 = f11;
                    f8 = f12;
                    f10 = f12;
                default:
                    i = 2;
                    break;
            }
            int i3 = 0;
            while (i3 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        c4 = 'C';
                        int i4 = i3 + 2;
                        int i5 = i3 + 3;
                        int i6 = i3 + 4;
                        int i7 = i3 + 5;
                        path.cubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i4], fArr2[i5], fArr2[i6], fArr2[i7]);
                        f7 = fArr2[i6];
                        f8 = fArr2[i7];
                        f9 = fArr2[i4];
                        f10 = fArr2[i5];
                    } else if (c4 == 'H') {
                        c4 = 'H';
                        path.lineTo(fArr2[i3], f8);
                        f7 = fArr2[i3];
                    } else if (c4 == 'Q') {
                        c4 = 'Q';
                        int i8 = i3 + 1;
                        int i9 = i3 + 2;
                        int i10 = i3 + 3;
                        path.quadTo(fArr2[i3], fArr2[i8], fArr2[i9], fArr2[i10]);
                        f9 = fArr2[i3];
                        f10 = fArr2[i8];
                        f7 = fArr2[i9];
                        f8 = fArr2[i10];
                    } else if (c4 == 'V') {
                        c4 = 'V';
                        path.lineTo(f7, fArr2[i3]);
                        f8 = fArr2[i3];
                    } else if (c4 != 'a') {
                        if (c4 == 'c') {
                            int i11 = i3 + 2;
                            int i12 = i3 + 3;
                            int i13 = i3 + 4;
                            int i14 = i3 + 5;
                            path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                            f9 = fArr2[i11] + f7;
                            f10 = fArr2[i12] + f8;
                            f7 += fArr2[i13];
                            f = fArr2[i14];
                        } else if (c4 == 'h') {
                            path.rLineTo(fArr2[i3], 0.0f);
                            f7 += fArr2[i3];
                        } else if (c4 != 'q') {
                            if (c4 == 'v') {
                                path.rLineTo(0.0f, fArr2[i3]);
                                f2 = fArr2[i3];
                            } else if (c4 == 'L') {
                                int i15 = i3 + 1;
                                path.lineTo(fArr2[i3], fArr2[i15]);
                                f7 = fArr2[i3];
                                f8 = fArr2[i15];
                            } else if (c4 == 'M') {
                                f7 = fArr2[i3];
                                int i16 = i3 + 1;
                                f8 = fArr2[i16];
                                if (i3 > 0) {
                                    path.lineTo(fArr2[i3], fArr2[i16]);
                                } else {
                                    path.moveTo(fArr2[i3], fArr2[i16]);
                                    f11 = f7;
                                    f12 = f8;
                                }
                            } else if (c4 == 'S') {
                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                    f7 = (f7 * 2.0f) - f9;
                                    f8 = (f8 * 2.0f) - f10;
                                }
                                int i17 = i3 + 1;
                                int i18 = i3 + 2;
                                int i19 = i3 + 3;
                                path.cubicTo(f7, f8, fArr2[i3], fArr2[i17], fArr2[i18], fArr2[i19]);
                                f9 = fArr2[i3];
                                f10 = fArr2[i17];
                                f7 = fArr2[i18];
                                f8 = fArr2[i19];
                            } else if (c4 == 'T') {
                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                    f7 = (f7 * 2.0f) - f9;
                                    f8 = (f8 * 2.0f) - f10;
                                }
                                int i20 = i3 + 1;
                                path.quadTo(f7, f8, fArr2[i3], fArr2[i20]);
                                f10 = f8;
                                f9 = f7;
                                c4 = 'T';
                                f7 = fArr2[i3];
                                f8 = fArr2[i20];
                            } else if (c4 == 'l') {
                                int i21 = i3 + 1;
                                path.rLineTo(fArr2[i3], fArr2[i21]);
                                f7 += fArr2[i3];
                                f2 = fArr2[i21];
                            } else if (c4 == c) {
                                f7 += fArr2[i3];
                                int i22 = i3 + 1;
                                f8 += fArr2[i22];
                                float f13 = fArr2[i3];
                                float f14 = fArr2[i22];
                                if (i3 > 0) {
                                    path.rLineTo(f13, f14);
                                } else {
                                    path.rMoveTo(f13, f14);
                                    f12 = f8;
                                    f11 = f7;
                                }
                            } else if (c4 == 's') {
                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                    f3 = f7 - f9;
                                    f4 = f8 - f10;
                                } else {
                                    f3 = 0.0f;
                                    f4 = 0.0f;
                                }
                                int i23 = i3 + 1;
                                int i24 = i3 + 2;
                                int i25 = i3 + 3;
                                path.rCubicTo(f3, f4, fArr2[i3], fArr2[i23], fArr2[i24], fArr2[i25]);
                                f9 = fArr2[i3] + f7;
                                f10 = fArr2[i23] + f8;
                                f7 += fArr2[i24];
                                f = fArr2[i25];
                            } else if (c4 == 't') {
                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                    f5 = f7 - f9;
                                    f6 = f8 - f10;
                                } else {
                                    f6 = 0.0f;
                                    f5 = 0.0f;
                                }
                                int i26 = i3 + 1;
                                path.rQuadTo(f5, f6, fArr2[i3], fArr2[i26]);
                                f9 = f5 + f7;
                                f10 = f6 + f8;
                                f7 += fArr2[i3];
                                f8 += fArr2[i26];
                            }
                            f8 += f2;
                        } else {
                            int i27 = i3 + 1;
                            int i28 = i3 + 2;
                            int i29 = i3 + 3;
                            path.rQuadTo(fArr2[i3], fArr2[i27], fArr2[i28], fArr2[i29]);
                            f9 = fArr2[i3] + f7;
                            f10 = fArr2[i27] + f8;
                            f7 += fArr2[i28];
                            f = fArr2[i29];
                        }
                        f8 += f;
                    } else {
                        int i30 = i3 + 5;
                        int i31 = i3 + 6;
                        c4 = 'a';
                        A00(path, f7, f8, fArr2[i30] + f7, fArr2[i31] + f8, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f7 += fArr2[i30];
                        f8 += fArr2[i31];
                    }
                    i3 += i;
                    c3 = c4;
                    c = 'm';
                } else {
                    c4 = 'A';
                    int i32 = i3 + 5;
                    int i33 = i3 + 6;
                    A00(path, f7, f8, fArr2[i32], fArr2[i33], fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                    f7 = fArr2[i32];
                    f8 = fArr2[i33];
                }
                f10 = f8;
                f9 = f7;
                i3 += i;
                c3 = c4;
                c = 'm';
            }
            fArr[0] = f7;
            fArr[1] = f8;
            fArr[2] = f9;
            fArr[3] = f10;
            fArr[4] = f11;
            fArr[5] = f12;
            c3 = c07qArr[i2].A00;
            i2++;
            c2 = 0;
        }
    }
}
