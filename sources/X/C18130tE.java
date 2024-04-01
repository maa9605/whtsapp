package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.0tE */
/* loaded from: classes.dex */
public class C18130tE {
    public static HashSet A07;
    public float A00 = 96.0f;
    public Canvas A01;
    public C18090tA A02;
    public C18110tC A03;
    public Stack A04;
    public Stack A05;
    public Stack A06;

    public C18130tE(Canvas canvas) {
        this.A01 = canvas;
    }

    public static int A00(int i, float f) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
        if (r10 != 9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a A[PHI: r3 
      PHI: (r3v2 float) = (r3v0 float), (r3v1 float) binds: [B:57:0x0057, B:62:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Matrix A01(X.C17860sn r12, X.C17860sn r13, X.C17840sl r14) {
        /*
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            X.0sj r11 = r14.A00
            if (r11 == 0) goto L79
            float r8 = r12.A03
            float r7 = r13.A03
            float r10 = r8 / r7
            float r5 = r12.A00
            float r1 = r13.A00
            float r9 = r5 / r1
            float r0 = r13.A01
            float r4 = -r0
            float r0 = r13.A02
            float r3 = -r0
            X.0sl r0 = X.C17840sl.A03
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L31
            float r1 = r12.A01
            float r0 = r12.A02
            r6.preTranslate(r1, r0)
            r6.preScale(r10, r9)
            r6.preTranslate(r4, r3)
            return r6
        L31:
            X.0sk r2 = r14.A01
            X.0sk r0 = X.EnumC17830sk.slice
            if (r2 != r0) goto L74
            float r2 = java.lang.Math.max(r10, r9)
        L3b:
            float r8 = r8 / r2
            float r5 = r5 / r2
            int r10 = r11.ordinal()
            r0 = 2
            r9 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L70
            r0 = 3
            if (r10 == r0) goto L6e
            r0 = 5
            if (r10 == r0) goto L70
            r0 = 6
            if (r10 == r0) goto L6e
            r0 = 8
            if (r10 == r0) goto L70
            r0 = 9
            if (r10 == r0) goto L6e
        L57:
            switch(r10) {
                case 4: goto L6a;
                case 5: goto L6a;
                case 6: goto L6a;
                case 7: goto L68;
                case 8: goto L68;
                case 9: goto L68;
                default: goto L5a;
            }
        L5a:
            float r1 = r12.A01
            float r0 = r12.A02
            r6.preTranslate(r1, r0)
            r6.preScale(r2, r2)
            r6.preTranslate(r4, r3)
            return r6
        L68:
            float r1 = r1 - r5
            goto L6c
        L6a:
            float r1 = r1 - r5
            float r1 = r1 / r9
        L6c:
            float r3 = r3 - r1
            goto L5a
        L6e:
            float r7 = r7 - r8
            goto L72
        L70:
            float r7 = r7 - r8
            float r7 = r7 / r9
        L72:
            float r4 = r4 - r7
            goto L57
        L74:
            float r2 = java.lang.Math.min(r10, r9)
            goto L3b
        L79:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A01(X.0sn, X.0sn, X.0sl):android.graphics.Matrix");
    }

    public static final Typeface A02(String str, Integer num, EnumC17940sv enumC17940sv) {
        int i;
        boolean z = enumC17940sv == EnumC17940sv.Italic;
        if (num.intValue() > 500) {
            i = 1;
            if (z) {
                i = 3;
            }
        } else {
            i = 0;
            if (z) {
                i = 2;
            }
        }
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    return Typeface.create(Typeface.SANS_SERIF, i);
                }
                return null;
            case -1431958525:
                if (str.equals("monospace")) {
                    return Typeface.create(Typeface.MONOSPACE, i);
                }
                return null;
            case -1081737434:
                if (str.equals("fantasy")) {
                    return Typeface.create(Typeface.SANS_SERIF, i);
                }
                return null;
            case 109326717:
                if (str.equals("serif")) {
                    return Typeface.create(Typeface.SERIF, i);
                }
                return null;
            case 1126973893:
                if (str.equals("cursive")) {
                    return Typeface.create(Typeface.SANS_SERIF, i);
                }
                return null;
            default:
                return null;
        }
    }

    public static final C17860sn A03(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C17860sn(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static void A04(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC17920st interfaceC17920st) {
        double d;
        float radians;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 != 0.0f && f4 != 0.0f) {
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians2 = (float) Math.toRadians(f5 % 360.0d);
            float cos = (float) Math.cos(radians2);
            float sin = (float) Math.sin(radians2);
            float f8 = (f - f6) / 2.0f;
            float f9 = (f2 - f7) / 2.0f;
            float f10 = (sin * f9) + (cos * f8);
            float f11 = (f9 * cos) + ((-sin) * f8);
            float f12 = abs * abs;
            float f13 = abs2 * abs2;
            float f14 = f10 * f10;
            float f15 = f11 * f11;
            float f16 = (f15 / f13) + (f14 / f12);
            if (f16 > 1.0f) {
                float sqrt = (float) Math.sqrt(f16);
                abs *= sqrt;
                abs2 *= sqrt;
                f12 = abs * abs;
                f13 = abs2 * abs2;
            }
            float f17 = z == z2 ? -1.0f : 1.0f;
            float f18 = f12 * f13;
            float f19 = f12 * f15;
            float f20 = f13 * f14;
            float f21 = ((f18 - f19) - f20) / (f19 + f20);
            if (f21 < 0.0f) {
                f21 = 0.0f;
            }
            float sqrt2 = (float) (Math.sqrt(f21) * f17);
            float f22 = ((abs * f11) / abs2) * sqrt2;
            float f23 = sqrt2 * (-((abs2 * f10) / abs));
            float f24 = ((cos * f22) - (sin * f23)) + ((f + f6) / 2.0f);
            float f25 = (cos * f23) + (sin * f22) + ((f2 + f7) / 2.0f);
            float f26 = (f10 - f22) / abs;
            float f27 = (f11 - f23) / abs2;
            float f28 = ((-f10) - f22) / abs;
            float f29 = ((-f11) - f23) / abs2;
            float f30 = (f27 * f27) + (f26 * f26);
            float degrees = (float) Math.toDegrees(Math.acos(f26 / ((float) Math.sqrt(f30))) * (f27 < 0.0f ? -1.0f : 1.0f));
            double degrees2 = Math.toDegrees(Math.acos(((f27 * f29) + (f26 * f28)) / ((float) Math.sqrt(((f29 * f29) + (f28 * f28)) * f30))) * ((f26 * f29) - (f27 * f28) < 0.0f ? -1.0f : 1.0f));
            if (z2 || degrees2 <= 0.0d) {
                d = 360.0d;
                if (z2 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            double d2 = degrees2 % d;
            int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
            double radians3 = Math.toRadians(degrees % 360.0f);
            double radians4 = (float) (Math.toRadians(d2) / ceil);
            double d3 = radians4 / 2.0d;
            double sin2 = (Math.sin(d3) * 1.3333333333333333d) / (Math.cos(d3) + 1.0d);
            int i = ceil * 6;
            float[] fArr = new float[i];
            int i2 = 0;
            for (int i3 = 0; i3 < ceil; i3++) {
                double d4 = (i3 * radians) + radians3;
                double cos2 = Math.cos(d4);
                double sin3 = Math.sin(d4);
                int i4 = i2 + 1;
                fArr[i2] = (float) (cos2 - (sin2 * sin3));
                int i5 = i4 + 1;
                fArr[i4] = (float) ((cos2 * sin2) + sin3);
                double d5 = d4 + radians4;
                double cos3 = Math.cos(d5);
                double sin4 = Math.sin(d5);
                int i6 = i5 + 1;
                fArr[i5] = (float) ((sin2 * sin4) + cos3);
                int i7 = i6 + 1;
                fArr[i6] = (float) (sin4 - (sin2 * cos3));
                int i8 = i7 + 1;
                fArr[i7] = (float) cos3;
                i2 = i8 + 1;
                fArr[i8] = (float) sin4;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(abs, abs2);
            matrix.postRotate(f5);
            matrix.postTranslate(f24, f25);
            matrix.mapPoints(fArr);
            fArr[i - 2] = f6;
            fArr[i - 1] = f7;
            for (int i9 = 0; i9 < i; i9 += 6) {
                interfaceC17920st.A71(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]);
            }
            return;
        }
        interfaceC17920st.AG0(f6, f7);
    }

    public static final void A05(C18110tC c18110tC, boolean z, AbstractC18060t7 abstractC18060t7) {
        int i;
        C18020t3 c18020t3 = c18110tC.A04;
        float floatValue = (z ? c18020t3.A0O : c18020t3.A0T).floatValue();
        if (abstractC18060t7 instanceof C1WX) {
            i = ((C1WX) abstractC18060t7).A00;
        } else if (!(abstractC18060t7 instanceof C1WY)) {
            return;
        } else {
            i = c18020t3.A02.A00;
        }
        int A00 = A00(i, floatValue);
        if (z) {
            c18110tC.A00.setColor(A00);
        } else {
            c18110tC.A01.setColor(A00);
        }
    }

    public static void A06(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static final boolean A07(C18020t3 c18020t3, long j) {
        return (j & c18020t3.A00) != 0;
    }

    public final Path.FillType A08() {
        EnumC17930su enumC17930su = this.A03.A04.A06;
        if (enumC17930su != null && enumC17930su == EnumC17930su.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    public final Path A09(C12540jb c12540jb) {
        C17900sr c17900sr = c12540jb.A00;
        float A02 = c17900sr != null ? c17900sr.A02(this) : 0.0f;
        C17900sr c17900sr2 = c12540jb.A01;
        float A03 = c17900sr2 != null ? c17900sr2.A03(this) : 0.0f;
        float A01 = c12540jb.A02.A01(this);
        float f = A02 - A01;
        float f2 = A03 - A01;
        float f3 = A02 + A01;
        float f4 = A03 + A01;
        if (((AbstractC39021pR) c12540jb).A00 == null) {
            float f5 = 2.0f * A01;
            ((AbstractC39021pR) c12540jb).A00 = new C17860sn(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * A01;
        Path path = new Path();
        path.moveTo(A02, f2);
        float f7 = A02 + f6;
        float f8 = A03 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, A03);
        float f9 = A03 + f6;
        path.cubicTo(f3, f9, f7, f4, A02, f4);
        float f10 = A02 - f6;
        path.cubicTo(f10, f4, f, f9, f, A03);
        path.cubicTo(f, f8, f10, f2, A02, f2);
        path.close();
        return path;
    }

    public final Path A0A(C12440jQ c12440jQ) {
        C17900sr c17900sr = c12440jQ.A00;
        float A02 = c17900sr != null ? c17900sr.A02(this) : 0.0f;
        C17900sr c17900sr2 = c12440jQ.A01;
        float A03 = c17900sr2 != null ? c17900sr2.A03(this) : 0.0f;
        float A022 = c12440jQ.A02.A02(this);
        float A032 = c12440jQ.A03.A03(this);
        float f = A02 - A022;
        float f2 = A03 - A032;
        float f3 = A02 + A022;
        float f4 = A03 + A032;
        if (((AbstractC39021pR) c12440jQ).A00 == null) {
            ((AbstractC39021pR) c12440jQ).A00 = new C17860sn(f, f2, A022 * 2.0f, 2.0f * A032);
        }
        float f5 = A022 * 0.5522848f;
        float f6 = 0.5522848f * A032;
        Path path = new Path();
        path.moveTo(A02, f2);
        float f7 = A02 + f5;
        float f8 = A03 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, A03);
        float f9 = f6 + A03;
        path.cubicTo(f3, f9, f7, f4, A02, f4);
        float f10 = A02 - f5;
        path.cubicTo(f10, f4, f, f9, f, A03);
        path.cubicTo(f, f8, f10, f2, A02, f2);
        path.close();
        return path;
    }

    public final Path A0B(C11910iX c11910iX) {
        Path path = new Path();
        float[] fArr = c11910iX.A00;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c11910iX.A00;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c11910iX instanceof C10440g3) {
            path.close();
        }
        if (((AbstractC39021pR) c11910iX).A00 == null) {
            ((AbstractC39021pR) c11910iX).A00 = A03(path);
        }
        return path;
    }

    public final Path A0C(C11900iW c11900iW) {
        float A02;
        float A03;
        C17900sr c17900sr = c11900iW.A01;
        if (c17900sr == null && c11900iW.A02 == null) {
            A02 = 0.0f;
            A03 = 0.0f;
        } else {
            if (c17900sr == null) {
                A02 = c11900iW.A02.A03(this);
            } else {
                C17900sr c17900sr2 = c11900iW.A02;
                A02 = c17900sr.A02(this);
                if (c17900sr2 != null) {
                    A03 = c11900iW.A02.A03(this);
                }
            }
            A03 = A02;
        }
        float min = Math.min(A02, c11900iW.A03.A02(this) / 2.0f);
        float min2 = Math.min(A03, c11900iW.A00.A03(this) / 2.0f);
        C17900sr c17900sr3 = c11900iW.A04;
        float A022 = c17900sr3 != null ? c17900sr3.A02(this) : 0.0f;
        C17900sr c17900sr4 = c11900iW.A05;
        float A032 = c17900sr4 != null ? c17900sr4.A03(this) : 0.0f;
        float A023 = c11900iW.A03.A02(this);
        float A033 = c11900iW.A00.A03(this);
        if (((AbstractC39021pR) c11900iW).A00 == null) {
            ((AbstractC39021pR) c11900iW).A00 = new C17860sn(A022, A032, A023, A033);
        }
        float f = A022 + A023;
        float f2 = A032 + A033;
        Path path = new Path();
        if (min != 0.0f && min2 != 0.0f) {
            float f3 = min * 0.5522848f;
            float f4 = 0.5522848f * min2;
            float f5 = A032 + min2;
            path.moveTo(A022, f5);
            float f6 = f5 - f4;
            float f7 = A022 + min;
            float f8 = f7 - f3;
            path.cubicTo(A022, f6, f8, A032, f7, A032);
            float f9 = f - min;
            path.lineTo(f9, A032);
            float f10 = f9 + f3;
            path.cubicTo(f10, A032, f, f6, f, f5);
            float f11 = f2 - min2;
            path.lineTo(f, f11);
            float f12 = f11 + f4;
            path.cubicTo(f, f12, f10, f2, f9, f2);
            path.lineTo(f7, f2);
            path.cubicTo(f8, f2, A022, f12, A022, f11);
            path.lineTo(A022, f5);
        } else {
            path.moveTo(A022, A032);
            path.lineTo(f, A032);
            path.lineTo(f, f2);
            path.lineTo(A022, f2);
            path.lineTo(A022, A032);
        }
        path.close();
        return path;
    }

    public final Path A0D(AbstractC39021pR abstractC39021pR, C17860sn c17860sn) {
        Path A0E;
        C18050t6 A04 = ((C18050t6) abstractC39021pR).A01.A04(this.A03.A04.A0W);
        boolean z = false;
        if (A04 == null) {
            A06("ClipPath reference '%s' not found", this.A03.A04.A0W);
            return null;
        }
        C12530ja c12530ja = (C12530ja) A04;
        this.A06.push(this.A03);
        this.A03 = A0H(c12530ja);
        Boolean bool = c12530ja.A00;
        z = (bool == null || bool.booleanValue()) ? true : true;
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c17860sn.A01, c17860sn.A02);
            matrix.preScale(c17860sn.A03, c17860sn.A00);
        }
        Matrix matrix2 = ((C20590xm) c12530ja).A00;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C18050t6 c18050t6 : ((AbstractC25261Er) c12530ja).A01) {
            if ((c18050t6 instanceof AbstractC39021pR) && (A0E = A0E((AbstractC39021pR) c18050t6, true)) != null) {
                path.op(A0E, Path.Op.UNION);
            }
        }
        if (this.A03.A04.A0W != null) {
            C17860sn c17860sn2 = ((AbstractC39021pR) c12530ja).A00;
            if (c17860sn2 == null) {
                c17860sn2 = A03(path);
                ((AbstractC39021pR) c12530ja).A00 = c17860sn2;
            }
            Path A0D = A0D(c12530ja, c17860sn2);
            if (A0D != null) {
                path.op(A0D, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.A03 = (C18110tC) this.A06.pop();
        return path;
    }

    public final Path A0E(AbstractC39021pR abstractC39021pR, boolean z) {
        Path path;
        Path A0D;
        this.A06.push(this.A03);
        C18110tC c18110tC = new C18110tC(this.A03);
        this.A03 = c18110tC;
        A0g(c18110tC, abstractC39021pR);
        if (A0i() && A0k()) {
            if (abstractC39021pR instanceof C11840iQ) {
                if (!z) {
                    A06("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                C11840iQ c11840iQ = (C11840iQ) abstractC39021pR;
                C18050t6 A04 = ((C18050t6) abstractC39021pR).A01.A04(c11840iQ.A04);
                if (A04 == null) {
                    A06("Use reference '%s' not found", c11840iQ.A04);
                    this.A03 = (C18110tC) this.A06.pop();
                    return null;
                } else if (!(A04 instanceof AbstractC39021pR)) {
                    this.A03 = (C18110tC) this.A06.pop();
                    return null;
                } else {
                    path = A0E((AbstractC39021pR) A04, false);
                    if (path == null) {
                        return null;
                    }
                    if (((AbstractC39021pR) c11840iQ).A00 == null) {
                        ((AbstractC39021pR) c11840iQ).A00 = A03(path);
                    }
                    Matrix matrix = ((C20590xm) c11840iQ).A00;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                }
            } else if (abstractC39021pR instanceof AbstractC20600xn) {
                AbstractC20600xn abstractC20600xn = (AbstractC20600xn) abstractC39021pR;
                if (abstractC39021pR instanceof C11920iY) {
                    path = new C29291We(((C11920iY) abstractC39021pR).A00).A02;
                    if (abstractC39021pR.A00 == null) {
                        abstractC39021pR.A00 = A03(path);
                    }
                } else if (abstractC39021pR instanceof C11900iW) {
                    path = A0C((C11900iW) abstractC39021pR);
                } else if (abstractC39021pR instanceof C12540jb) {
                    path = A09((C12540jb) abstractC39021pR);
                } else if (abstractC39021pR instanceof C12440jQ) {
                    path = A0A((C12440jQ) abstractC39021pR);
                } else {
                    if (abstractC39021pR instanceof C11910iX) {
                        path = A0B((C11910iX) abstractC39021pR);
                    }
                    return null;
                }
                if (path != null) {
                    if (((AbstractC39021pR) abstractC20600xn).A00 == null) {
                        ((AbstractC39021pR) abstractC20600xn).A00 = A03(path);
                    }
                    Matrix matrix2 = abstractC20600xn.A00;
                    if (matrix2 != null) {
                        path.transform(matrix2);
                    }
                    path.setFillType(A08());
                }
                return null;
            } else if (!(abstractC39021pR instanceof C10400fz)) {
                A06("Invalid %s element found in clipPath definition", abstractC39021pR.A00());
                return null;
            } else {
                C10400fz c10400fz = (C10400fz) abstractC39021pR;
                List list = ((AbstractC11850iR) c10400fz).A02;
                float f = 0.0f;
                float A02 = (list == null || list.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A02.get(0)).A02(this);
                List list2 = ((AbstractC11850iR) c10400fz).A03;
                float A03 = (list2 == null || list2.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A03.get(0)).A03(this);
                List list3 = ((AbstractC11850iR) c10400fz).A00;
                float A022 = (list3 == null || list3.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A00.get(0)).A02(this);
                List list4 = ((AbstractC11850iR) c10400fz).A01;
                if (list4 != null && list4.size() != 0) {
                    f = ((C17900sr) ((AbstractC11850iR) c10400fz).A01.get(0)).A03(this);
                }
                if (this.A03.A04.A0C != EnumC17980sz.Start) {
                    C1Wi c1Wi = new C1Wi(this);
                    A0d(c10400fz, c1Wi);
                    float f2 = c1Wi.A00;
                    if (this.A03.A04.A0C == EnumC17980sz.Middle) {
                        f2 /= 2.0f;
                    }
                    A02 -= f2;
                }
                if (((AbstractC39021pR) c10400fz).A00 == null) {
                    C29321Wh c29321Wh = new C29321Wh(this, A02, A03);
                    A0d(c10400fz, c29321Wh);
                    RectF rectF = c29321Wh.A02;
                    ((AbstractC39021pR) c10400fz).A00 = new C17860sn(rectF.left, rectF.top, rectF.width(), c29321Wh.A02.height());
                }
                path = new Path();
                A0d(c10400fz, new C29311Wg(this, A02 + A022, A03 + f, path));
                Matrix matrix3 = c10400fz.A00;
                if (matrix3 != null) {
                    path.transform(matrix3);
                }
                path.setFillType(A08());
            }
            if (this.A03.A04.A0W != null && (A0D = A0D(abstractC39021pR, abstractC39021pR.A00)) != null) {
                path.op(A0D, Path.Op.INTERSECT);
            }
            this.A03 = (C18110tC) this.A06.pop();
            return path;
        }
        this.A03 = (C18110tC) this.A06.pop();
        return null;
    }

    public final C17860sn A0F(C17900sr c17900sr, C17900sr c17900sr2, C17900sr c17900sr3, C17900sr c17900sr4) {
        float f;
        float f2;
        float f3;
        if (c17900sr != null) {
            f = c17900sr.A02(this);
        } else {
            f = 0.0f;
        }
        float A03 = c17900sr2 != null ? c17900sr2.A03(this) : 0.0f;
        C18110tC c18110tC = this.A03;
        C17860sn c17860sn = c18110tC.A02;
        if (c17860sn == null) {
            c17860sn = c18110tC.A03;
        }
        if (c17900sr3 != null) {
            f2 = c17900sr3.A02(this);
        } else {
            f2 = c17860sn.A03;
        }
        if (c17900sr4 != null) {
            f3 = c17900sr4.A03(this);
        } else {
            f3 = c17860sn.A00;
        }
        return new C17860sn(f, A03, f2, f3);
    }

    public final EnumC17980sz A0G() {
        EnumC17980sz enumC17980sz;
        C18020t3 c18020t3 = this.A03.A04;
        if (c18020t3.A0E != EnumC18000t1.LTR && (enumC17980sz = c18020t3.A0C) != EnumC17980sz.Middle) {
            EnumC17980sz enumC17980sz2 = EnumC17980sz.Start;
            return enumC17980sz == enumC17980sz2 ? EnumC17980sz.End : enumC17980sz2;
        }
        return c18020t3.A0C;
    }

    public final C18110tC A0H(C18050t6 c18050t6) {
        C18110tC c18110tC = new C18110tC();
        A0f(c18110tC, C18020t3.A00());
        A0b(c18050t6, c18110tC);
        return c18110tC;
    }

    public final String A0I(String str, boolean z, boolean z2) {
        if (this.A03.A07) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void A0J() {
        this.A01.restore();
        this.A03 = (C18110tC) this.A06.pop();
    }

    public final void A0K() {
        this.A01.save();
        this.A06.push(this.A03);
        this.A03 = new C18110tC(this.A03);
    }

    public final void A0L() {
        int i;
        C18020t3 c18020t3 = this.A03.A04;
        AbstractC18060t7 abstractC18060t7 = c18020t3.A0K;
        if (abstractC18060t7 instanceof C1WX) {
            i = ((C1WX) abstractC18060t7).A00;
        } else if (!(abstractC18060t7 instanceof C1WY)) {
            return;
        } else {
            i = c18020t3.A02.A00;
        }
        Float f = c18020t3.A0U;
        if (f != null) {
            i = A00(i, f.floatValue());
        }
        this.A01.drawColor(i);
    }

    public final void A0M(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C17870so c17870so = this.A03.A04.A01;
        if (c17870so != null) {
            f += c17870so.A01.A02(this);
            f2 += this.A03.A04.A01.A03.A03(this);
            f5 -= this.A03.A04.A01.A02.A02(this);
            f6 -= this.A03.A04.A01.A00.A03(this);
        }
        this.A01.clipRect(f, f2, f5, f6);
    }

    public final void A0N(Path path) {
        C18110tC c18110tC = this.A03;
        if (c18110tC.A04.A0F != EnumC18010t2.NonScalingStroke) {
            this.A01.drawPath(path, c18110tC.A01);
            return;
        }
        Matrix matrix = this.A01.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.A01.setMatrix(new Matrix());
        Shader shader = this.A03.A01.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.A01.drawPath(path2, this.A03.A01);
        this.A01.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void A0O(AbstractC38991pO abstractC38991pO, String str) {
        C18050t6 A04 = ((C18050t6) abstractC38991pO).A01.A04(str);
        if (A04 == null) {
            Log.w("SVGAndroidRenderer", String.format("Gradient reference '%s' not found", str));
        } else if (!(A04 instanceof AbstractC38991pO)) {
            A06("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (A04 == abstractC38991pO) {
            A06("Circular reference in gradient href attribute '%s'", str);
        } else {
            AbstractC38991pO abstractC38991pO2 = (AbstractC38991pO) A04;
            if (abstractC38991pO.A02 == null) {
                abstractC38991pO.A02 = abstractC38991pO2.A02;
            }
            if (abstractC38991pO.A00 == null) {
                abstractC38991pO.A00 = abstractC38991pO2.A00;
            }
            if (abstractC38991pO.A01 == null) {
                abstractC38991pO.A01 = abstractC38991pO2.A01;
            }
            if (abstractC38991pO.A04.isEmpty()) {
                abstractC38991pO.A04 = abstractC38991pO2.A04;
            }
            try {
                if (abstractC38991pO instanceof C1E0) {
                    C1E0 c1e0 = (C1E0) abstractC38991pO;
                    C1E0 c1e02 = (C1E0) A04;
                    if (c1e0.A00 == null) {
                        c1e0.A00 = c1e02.A00;
                    }
                    if (c1e0.A02 == null) {
                        c1e0.A02 = c1e02.A02;
                    }
                    if (c1e0.A01 == null) {
                        c1e0.A01 = c1e02.A01;
                    }
                    if (c1e0.A03 == null) {
                        c1e0.A03 = c1e02.A03;
                    }
                } else {
                    C1D1 c1d1 = (C1D1) abstractC38991pO;
                    C1D1 c1d12 = (C1D1) A04;
                    if (c1d1.A00 == null) {
                        c1d1.A00 = c1d12.A00;
                    }
                    if (c1d1.A01 == null) {
                        c1d1.A01 = c1d12.A01;
                    }
                    if (c1d1.A04 == null) {
                        c1d1.A04 = c1d12.A04;
                    }
                    if (c1d1.A02 == null) {
                        c1d1.A02 = c1d12.A02;
                    }
                    if (c1d1.A03 == null) {
                        c1d1.A03 = c1d12.A03;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str2 = abstractC38991pO2.A03;
            if (str2 != null) {
                A0O(abstractC38991pO, str2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0168  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0P(X.AbstractC20600xn r26) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0P(X.0xn):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c4 A[PHI: r4 
      PHI: (r4v2 float) = (r4v0 float), (r4v1 float) binds: [B:125:0x00c1, B:137:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0Q(X.C10460g5 r12, X.C18100tB r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0Q(X.0g5, X.0tB):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x000a, code lost:
        if (r1 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0R(X.C20570xk r7, X.AbstractC39021pR r8) {
        /*
            r6 = this;
            java.lang.Boolean r0 = r7.A05
            r4 = 0
            if (r0 == 0) goto Lc
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L6c
            X.0sr r0 = r7.A01
            if (r0 == 0) goto L67
            float r2 = r0.A02(r6)
        L19:
            X.0sr r0 = r7.A00
            if (r0 == 0) goto L62
            float r3 = r0.A03(r6)
        L21:
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L61
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L61
            r6.A0K()
            X.0tC r0 = r6.A0H(r7)
            r6.A03 = r0
            X.0t3 r1 = r0.A04
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r1.A0P = r0
            java.lang.Boolean r0 = r7.A04
            if (r0 == 0) goto L5b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5b
            android.graphics.Canvas r2 = r6.A01
            X.0sn r0 = r8.A00
            float r1 = r0.A01
            float r0 = r0.A02
            r2.translate(r1, r0)
            android.graphics.Canvas r2 = r6.A01
            X.0sn r0 = r8.A00
            float r1 = r0.A03
            float r0 = r0.A00
            r2.scale(r1, r0)
        L5b:
            r6.A0U(r7, r4)
            r6.A0J()
        L61:
            return
        L62:
            X.0sn r0 = r8.A00
            float r3 = r0.A00
            goto L21
        L67:
            X.0sn r0 = r8.A00
            float r2 = r0.A03
            goto L19
        L6c:
            X.0sr r0 = r7.A01
            r3 = 1067030938(0x3f99999a, float:1.2)
            if (r0 == 0) goto L88
            float r2 = r0.A04(r6, r5)
        L77:
            X.0sr r0 = r7.A00
            if (r0 == 0) goto L7f
            float r3 = r0.A04(r6, r5)
        L7f:
            X.0sn r1 = r8.A00
            float r0 = r1.A03
            float r2 = r2 * r0
            float r0 = r1.A00
            float r3 = r3 * r0
            goto L21
        L88:
            r2 = 1067030938(0x3f99999a, float:1.2)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0R(X.0xk, X.1pR):void");
    }

    public final void A0S(C10450g4 c10450g4, String str) {
        C18050t6 A04 = ((C18050t6) c10450g4).A01.A04(str);
        if (A04 == null) {
            Log.w("SVGAndroidRenderer", String.format("Pattern reference '%s' not found", str));
        } else if (!(A04 instanceof C10450g4)) {
            A06("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (A04 == c10450g4) {
            A06("Circular reference in pattern href attribute '%s'", str);
        } else {
            C10450g4 c10450g42 = (C10450g4) A04;
            if (c10450g4.A06 == null) {
                c10450g4.A06 = c10450g42.A06;
            }
            if (c10450g4.A05 == null) {
                c10450g4.A05 = c10450g42.A05;
            }
            if (c10450g4.A00 == null) {
                c10450g4.A00 = c10450g42.A00;
            }
            if (c10450g4.A03 == null) {
                c10450g4.A03 = c10450g42.A03;
            }
            if (c10450g4.A04 == null) {
                c10450g4.A04 = c10450g42.A04;
            }
            if (c10450g4.A02 == null) {
                c10450g4.A02 = c10450g42.A02;
            }
            if (c10450g4.A01 == null) {
                c10450g4.A01 = c10450g42.A01;
            }
            if (((AbstractC25261Er) c10450g4).A01.isEmpty()) {
                ((AbstractC25261Er) c10450g4).A01 = ((AbstractC25261Er) c10450g42).A01;
            }
            if (((AbstractC11890iV) c10450g4).A00 == null) {
                ((AbstractC11890iV) c10450g4).A00 = ((AbstractC11890iV) c10450g42).A00;
            }
            if (((AbstractC20440xX) c10450g4).A00 == null) {
                ((AbstractC20440xX) c10450g4).A00 = ((AbstractC20440xX) c10450g42).A00;
            }
            String str2 = c10450g42.A07;
            if (str2 != null) {
                A0S(c10450g4, str2);
            }
        }
    }

    public final void A0T(C10430g2 c10430g2, C17860sn c17860sn, C17860sn c17860sn2, C17840sl c17840sl) {
        if (c17860sn.A03 != 0.0f && c17860sn.A00 != 0.0f) {
            if (c17840sl == null && (c17840sl = ((AbstractC20440xX) c10430g2).A00) == null) {
                c17840sl = C17840sl.A02;
            }
            A0g(this.A03, c10430g2);
            if (A0i()) {
                C18110tC c18110tC = this.A03;
                c18110tC.A03 = c17860sn;
                if (!c18110tC.A04.A0M.booleanValue()) {
                    A0M(c17860sn.A01, c17860sn.A02, c17860sn.A03, c17860sn.A00);
                }
                A0Z(c10430g2, this.A03.A03);
                Canvas canvas = this.A01;
                if (c17860sn2 != null) {
                    canvas.concat(A01(this.A03.A03, c17860sn2, c17840sl));
                    this.A03.A02 = ((AbstractC11890iV) c10430g2).A00;
                } else {
                    C17860sn c17860sn3 = this.A03.A03;
                    canvas.translate(c17860sn3.A01, c17860sn3.A02);
                }
                boolean A0j = A0j();
                A0L();
                A0U(c10430g2, true);
                if (A0j) {
                    A0W(c10430g2);
                }
                A0X(c10430g2);
            }
        }
    }

    public final void A0U(InterfaceC18040t5 interfaceC18040t5, boolean z) {
        if (z) {
            this.A05.push(interfaceC18040t5);
            this.A04.push(this.A01.getMatrix());
        }
        for (C18050t6 c18050t6 : interfaceC18040t5.A8t()) {
            A0a(c18050t6);
        }
        if (z) {
            this.A05.pop();
            this.A04.pop();
        }
    }

    public final void A0V(AbstractC39021pR abstractC39021pR) {
        AbstractC18060t7 abstractC18060t7 = this.A03.A04.A0G;
        if (abstractC18060t7 instanceof C1WZ) {
            A0h(true, abstractC39021pR.A00, (C1WZ) abstractC18060t7);
        }
        AbstractC18060t7 abstractC18060t72 = this.A03.A04.A0J;
        if (abstractC18060t72 instanceof C1WZ) {
            A0h(false, abstractC39021pR.A00, (C1WZ) abstractC18060t72);
        }
    }

    public final void A0W(AbstractC39021pR abstractC39021pR) {
        if (this.A03.A04.A0a != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.A01.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.A01.saveLayer(null, paint2, 31);
            C20570xk c20570xk = (C20570xk) this.A02.A04(this.A03.A04.A0a);
            A0R(c20570xk, abstractC39021pR);
            this.A01.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.A01.saveLayer(null, paint3, 31);
            A0R(c20570xk, abstractC39021pR);
            this.A01.restore();
            this.A01.restore();
        }
        A0J();
    }

    public final void A0X(AbstractC39021pR abstractC39021pR) {
        if (((C18050t6) abstractC39021pR).A00 == null || abstractC39021pR.A00 == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.A04.peek()).invert(matrix)) {
            C17860sn c17860sn = abstractC39021pR.A00;
            float f = c17860sn.A01;
            float f2 = c17860sn.A02;
            float f3 = f + c17860sn.A03;
            int i = 2;
            float f4 = f2 + c17860sn.A00;
            float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
            matrix.preConcat(this.A01.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            do {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                int i2 = i + 1;
                if (fArr[i2] < rectF.top) {
                    rectF.top = fArr[i2];
                }
                if (fArr[i2] > rectF.bottom) {
                    rectF.bottom = fArr[i2];
                }
                i += 2;
            } while (i <= 6);
            AbstractC39021pR abstractC39021pR2 = (AbstractC39021pR) this.A05.peek();
            C17860sn c17860sn2 = abstractC39021pR2.A00;
            if (c17860sn2 == null) {
                float f7 = rectF.left;
                float f8 = rectF.top;
                abstractC39021pR2.A00 = new C17860sn(f7, f8, rectF.right - f7, rectF.bottom - f8);
                return;
            }
            float f9 = rectF.left;
            float f10 = rectF.top;
            float f11 = rectF.right - f9;
            float f12 = rectF.bottom - f10;
            float f13 = c17860sn2.A01;
            if (f9 < f13) {
                c17860sn2.A01 = f9;
                f13 = f9;
            }
            float f14 = c17860sn2.A02;
            if (f10 < f14) {
                c17860sn2.A02 = f10;
                f14 = f10;
            }
            float f15 = f9 + f11;
            if (f15 > c17860sn2.A03 + f13) {
                c17860sn2.A03 = f15 - f13;
            }
            float f16 = f10 + f12;
            if (f16 > c17860sn2.A00 + f14) {
                c17860sn2.A00 = f16 - f14;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x002b, code lost:
        if (r0.booleanValue() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0192, code lost:
        if (r0.booleanValue() != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0Y(X.AbstractC39021pR r19, android.graphics.Path r20) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0Y(X.1pR, android.graphics.Path):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x004e, code lost:
        if (r0.booleanValue() != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0Z(X.AbstractC39021pR r7, X.C17860sn r8) {
        /*
            r6 = this;
            X.0tC r0 = r6.A03
            X.0t3 r0 = r0.A04
            java.lang.String r2 = r0.A0W
            if (r2 != 0) goto L9
            return
        L9:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L1b
            android.graphics.Path r1 = r6.A0D(r7, r8)
            if (r1 == 0) goto L1a
            android.graphics.Canvas r0 = r6.A01
            r0.clipPath(r1)
        L1a:
            return
        L1b:
            X.0tA r0 = r7.A01
            X.0t6 r5 = r0.A04(r2)
            r4 = 1
            r3 = 0
            if (r5 != 0) goto L35
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.0tC r0 = r6.A03
            X.0t3 r0 = r0.A04
            java.lang.String r0 = r0.A0W
            r1[r3] = r0
            java.lang.String r0 = "ClipPath reference '%s' not found"
            A06(r0, r1)
            return
        L35:
            X.0ja r5 = (X.C12530ja) r5
            java.util.List r0 = r5.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L45
            android.graphics.Canvas r0 = r6.A01
            r0.clipRect(r3, r3, r3, r3)
            return
        L45:
            java.lang.Boolean r0 = r5.A00
            if (r0 == 0) goto L50
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L51
        L50:
            r2 = 1
        L51:
            boolean r0 = r7 instanceof X.C20590xm
            if (r0 == 0) goto L6b
            if (r2 != 0) goto L6b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r7.A00()
            r1[r3] = r0
            java.lang.String r0 = "<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "SVGAndroidRenderer"
            android.util.Log.w(r0, r1)
            return
        L6b:
            android.graphics.Canvas r0 = r6.A01
            r0.save()
            java.util.Stack r1 = r6.A06
            X.0tC r0 = r6.A03
            r1.push(r0)
            X.0tC r1 = r6.A03
            X.0tC r0 = new X.0tC
            r0.<init>(r1)
            r6.A03 = r0
            if (r2 != 0) goto L9a
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            float r1 = r8.A01
            float r0 = r8.A02
            r2.preTranslate(r1, r0)
            float r1 = r8.A03
            float r0 = r8.A00
            r2.preScale(r1, r0)
            android.graphics.Canvas r0 = r6.A01
            r0.concat(r2)
        L9a:
            android.graphics.Matrix r1 = r5.A00
            if (r1 == 0) goto La3
            android.graphics.Canvas r0 = r6.A01
            r0.concat(r1)
        La3:
            X.0tC r0 = r6.A0H(r5)
            r6.A03 = r0
            X.0sn r0 = r5.A00
            r6.A0Z(r5, r0)
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            java.util.List r0 = r5.A01
            java.util.Iterator r2 = r0.iterator()
        Lb9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r1 = r2.next()
            X.0t6 r1 = (X.C18050t6) r1
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r6.A0c(r1, r4, r3, r0)
            goto Lb9
        Lce:
            android.graphics.Canvas r0 = r6.A01
            r0.clipPath(r3)
            android.graphics.Canvas r0 = r6.A01
            r0.restore()
            java.util.Stack r0 = r6.A06
            java.lang.Object r0 = r0.pop()
            X.0tC r0 = (X.C18110tC) r0
            r6.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0Z(X.1pR, X.0sn):void");
    }

    public final void A0a(C18050t6 c18050t6) {
        Path.FillType fillType;
        C17900sr c17900sr;
        C17900sr c17900sr2;
        Path.FillType fillType2;
        C17900sr c17900sr3;
        String str;
        int indexOf;
        Set ADQ;
        C17900sr c17900sr4;
        Boolean bool;
        EnumC17930su enumC17930su = EnumC17930su.EvenOdd;
        if (c18050t6 instanceof InterfaceC17910ss) {
            return;
        }
        A0K();
        if ((c18050t6 instanceof AbstractC29261Wb) && (bool = ((AbstractC29261Wb) c18050t6).A02) != null) {
            this.A03.A07 = bool.booleanValue();
        }
        if (c18050t6 instanceof C10430g2) {
            C10430g2 c10430g2 = (C10430g2) c18050t6;
            A0T(c10430g2, A0F(c10430g2.A02, c10430g2.A03, c10430g2.A01, c10430g2.A00), ((AbstractC11890iV) c10430g2).A00, ((AbstractC20440xX) c10430g2).A00);
        } else {
            if (c18050t6 instanceof C11840iQ) {
                C11840iQ c11840iQ = (C11840iQ) c18050t6;
                EnumC18080t9 enumC18080t9 = EnumC18080t9.percent;
                C17900sr c17900sr5 = c11840iQ.A01;
                if ((c17900sr5 == null || !c17900sr5.A06()) && ((c17900sr4 = c11840iQ.A00) == null || !c17900sr4.A06())) {
                    A0g(this.A03, c11840iQ);
                    if (A0i()) {
                        C18050t6 A04 = ((C18050t6) c11840iQ).A01.A04(c11840iQ.A04);
                        if (A04 == null) {
                            A06("Use reference '%s' not found", c11840iQ.A04);
                        } else {
                            Matrix matrix = ((C20590xm) c11840iQ).A00;
                            if (matrix != null) {
                                this.A01.concat(matrix);
                            }
                            C17900sr c17900sr6 = c11840iQ.A02;
                            float A02 = c17900sr6 != null ? c17900sr6.A02(this) : 0.0f;
                            C17900sr c17900sr7 = c11840iQ.A03;
                            this.A01.translate(A02, c17900sr7 != null ? c17900sr7.A03(this) : 0.0f);
                            A0Z(c11840iQ, ((AbstractC39021pR) c11840iQ).A00);
                            boolean A0j = A0j();
                            this.A05.push(c11840iQ);
                            this.A04.push(this.A01.getMatrix());
                            if (A04 instanceof C10430g2) {
                                C10430g2 c10430g22 = (C10430g2) A04;
                                C17860sn A0F = A0F(null, null, c11840iQ.A01, c11840iQ.A00);
                                A0K();
                                A0T(c10430g22, A0F, ((AbstractC11890iV) c10430g22).A00, ((AbstractC20440xX) c10430g22).A00);
                                A0J();
                            } else if (A04 instanceof C10420g1) {
                                C17900sr c17900sr8 = c11840iQ.A01;
                                if (c17900sr8 == null) {
                                    c17900sr8 = new C17900sr(100.0f, enumC18080t9);
                                }
                                C17900sr c17900sr9 = c11840iQ.A00;
                                if (c17900sr9 == null) {
                                    c17900sr9 = new C17900sr(100.0f, enumC18080t9);
                                }
                                C17860sn A0F2 = A0F(null, null, c17900sr8, c17900sr9);
                                A0K();
                                AbstractC11890iV abstractC11890iV = (AbstractC11890iV) A04;
                                if (A0F2.A03 != 0.0f && A0F2.A00 != 0.0f) {
                                    C17840sl c17840sl = ((AbstractC20440xX) abstractC11890iV).A00;
                                    if (c17840sl == null) {
                                        c17840sl = C17840sl.A02;
                                    }
                                    A0g(this.A03, abstractC11890iV);
                                    C18110tC c18110tC = this.A03;
                                    c18110tC.A03 = A0F2;
                                    if (!c18110tC.A04.A0M.booleanValue()) {
                                        A0M(A0F2.A01, A0F2.A02, A0F2.A03, A0F2.A00);
                                    }
                                    C17860sn c17860sn = abstractC11890iV.A00;
                                    if (c17860sn != null) {
                                        this.A01.concat(A01(this.A03.A03, c17860sn, c17840sl));
                                        this.A03.A02 = abstractC11890iV.A00;
                                    } else {
                                        Canvas canvas = this.A01;
                                        C17860sn c17860sn2 = this.A03.A03;
                                        canvas.translate(c17860sn2.A01, c17860sn2.A02);
                                    }
                                    boolean A0j2 = A0j();
                                    A0U(abstractC11890iV, true);
                                    if (A0j2) {
                                        A0W(abstractC11890iV);
                                    }
                                    A0X(abstractC11890iV);
                                }
                                A0J();
                            } else {
                                A0a(A04);
                            }
                            this.A05.pop();
                            this.A04.pop();
                            if (A0j) {
                                A0W(c11840iQ);
                            }
                            A0X(c11840iQ);
                        }
                    }
                }
            } else if (c18050t6 instanceof C11880iU) {
                C20590xm c20590xm = (C20590xm) c18050t6;
                A0g(this.A03, c20590xm);
                if (A0i()) {
                    Matrix matrix2 = c20590xm.A00;
                    if (matrix2 != null) {
                        this.A01.concat(matrix2);
                    }
                    A0Z(c20590xm, ((AbstractC39021pR) c20590xm).A00);
                    boolean A0j3 = A0j();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = ((AbstractC25261Er) c20590xm).A01.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C18050t6 c18050t62 = (C18050t6) it.next();
                        if (c18050t62 instanceof InterfaceC18030t4) {
                            InterfaceC18030t4 interfaceC18030t4 = (InterfaceC18030t4) c18050t62;
                            if (interfaceC18030t4.ACn() == null && ((ADQ = interfaceC18030t4.ADQ()) == null || (!ADQ.isEmpty() && ADQ.contains(language)))) {
                                Set ACo = interfaceC18030t4.ACo();
                                if (ACo != null) {
                                    if (A07 == null) {
                                        synchronized (C18130tE.class) {
                                            HashSet hashSet = new HashSet();
                                            A07 = hashSet;
                                            hashSet.add("Structure");
                                            A07.add("BasicStructure");
                                            A07.add("ConditionalProcessing");
                                            A07.add("Image");
                                            A07.add("Style");
                                            A07.add("ViewportAttribute");
                                            A07.add("Shape");
                                            A07.add("BasicText");
                                            A07.add("PaintAttribute");
                                            A07.add("BasicPaintAttribute");
                                            A07.add("OpacityAttribute");
                                            A07.add("BasicGraphicsAttribute");
                                            A07.add("Marker");
                                            A07.add("Gradient");
                                            A07.add("Pattern");
                                            A07.add("Clip");
                                            A07.add("BasicClip");
                                            A07.add("Mask");
                                            A07.add("View");
                                        }
                                    }
                                    if (!ACo.isEmpty() && A07.containsAll(ACo)) {
                                    }
                                }
                                Set ACq = interfaceC18030t4.ACq();
                                if (ACq != null) {
                                    ACq.isEmpty();
                                } else {
                                    Set ACp = interfaceC18030t4.ACp();
                                    if (ACp != null) {
                                        ACp.isEmpty();
                                    } else {
                                        A0a(c18050t62);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (A0j3) {
                        A0W(c20590xm);
                    }
                    A0X(c20590xm);
                }
            } else if (c18050t6 instanceof C20590xm) {
                C20590xm c20590xm2 = (C20590xm) c18050t6;
                A0g(this.A03, c20590xm2);
                if (A0i()) {
                    Matrix matrix3 = c20590xm2.A00;
                    if (matrix3 != null) {
                        this.A01.concat(matrix3);
                    }
                    A0Z(c20590xm2, ((AbstractC39021pR) c20590xm2).A00);
                    boolean A0j4 = A0j();
                    A0U(c20590xm2, true);
                    if (A0j4) {
                        A0W(c20590xm2);
                    }
                    A0X(c20590xm2);
                }
            } else if (c18050t6 instanceof C12430jP) {
                C12430jP c12430jP = (C12430jP) c18050t6;
                C17900sr c17900sr10 = c12430jP.A02;
                if (c17900sr10 != null && !c17900sr10.A06() && (c17900sr3 = c12430jP.A01) != null && !c17900sr3.A06() && (str = c12430jP.A05) != null) {
                    C17840sl c17840sl2 = ((AbstractC20440xX) c12430jP).A00;
                    if (c17840sl2 == null) {
                        c17840sl2 = C17840sl.A02;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) != -1 && indexOf >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                        byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        if (decodeByteArray != null) {
                            C17860sn c17860sn3 = new C17860sn(0.0f, 0.0f, decodeByteArray.getWidth(), decodeByteArray.getHeight());
                            A0g(this.A03, c12430jP);
                            if (A0i() && A0k()) {
                                Matrix matrix4 = c12430jP.A00;
                                if (matrix4 != null) {
                                    this.A01.concat(matrix4);
                                }
                                C17900sr c17900sr11 = c12430jP.A03;
                                float A022 = c17900sr11 != null ? c17900sr11.A02(this) : 0.0f;
                                C17900sr c17900sr12 = c12430jP.A04;
                                float A03 = c17900sr12 != null ? c17900sr12.A03(this) : 0.0f;
                                float A023 = c12430jP.A02.A02(this);
                                float A024 = c12430jP.A01.A02(this);
                                C18110tC c18110tC2 = this.A03;
                                C17860sn c17860sn4 = new C17860sn(A022, A03, A023, A024);
                                c18110tC2.A03 = c17860sn4;
                                if (!c18110tC2.A04.A0M.booleanValue()) {
                                    A0M(c17860sn4.A01, c17860sn4.A02, c17860sn4.A03, c17860sn4.A00);
                                }
                                ((AbstractC39021pR) c12430jP).A00 = this.A03.A03;
                                A0X(c12430jP);
                                A0Z(c12430jP, ((AbstractC39021pR) c12430jP).A00);
                                boolean A0j5 = A0j();
                                A0L();
                                this.A01.save();
                                this.A01.concat(A01(this.A03.A03, c17860sn3, c17840sl2));
                                this.A01.drawBitmap(decodeByteArray, 0.0f, 0.0f, new Paint(this.A03.A04.A0B != EnumC17970sy.optimizeSpeed ? 2 : 0));
                                this.A01.restore();
                                if (A0j5) {
                                    A0W(c12430jP);
                                }
                            }
                        }
                    }
                }
            } else if (c18050t6 instanceof C11920iY) {
                C11920iY c11920iY = (C11920iY) c18050t6;
                if (c11920iY.A00 != null) {
                    A0g(this.A03, c11920iY);
                    if (A0i() && A0k()) {
                        C18110tC c18110tC3 = this.A03;
                        if (c18110tC3.A06 || c18110tC3.A05) {
                            Matrix matrix5 = ((AbstractC20600xn) c11920iY).A00;
                            if (matrix5 != null) {
                                this.A01.concat(matrix5);
                            }
                            Path path = new C29291We(c11920iY.A00).A02;
                            if (((AbstractC39021pR) c11920iY).A00 == null) {
                                ((AbstractC39021pR) c11920iY).A00 = A03(path);
                            }
                            A0X(c11920iY);
                            A0V(c11920iY);
                            A0Z(c11920iY, ((AbstractC39021pR) c11920iY).A00);
                            boolean A0j6 = A0j();
                            C18110tC c18110tC4 = this.A03;
                            if (c18110tC4.A05) {
                                EnumC17930su enumC17930su2 = c18110tC4.A04.A07;
                                if (enumC17930su2 != null && enumC17930su2 == enumC17930su) {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                } else {
                                    fillType2 = Path.FillType.WINDING;
                                }
                                path.setFillType(fillType2);
                                A0Y(c11920iY, path);
                            }
                            if (this.A03.A06) {
                                A0N(path);
                            }
                            A0P(c11920iY);
                            if (A0j6) {
                                A0W(c11920iY);
                            }
                        }
                    }
                }
            } else if (c18050t6 instanceof C11900iW) {
                C11900iW c11900iW = (C11900iW) c18050t6;
                C17900sr c17900sr13 = c11900iW.A03;
                if (c17900sr13 != null && (c17900sr2 = c11900iW.A00) != null && !c17900sr13.A06() && !c17900sr2.A06()) {
                    A0g(this.A03, c11900iW);
                    if (A0i() && A0k()) {
                        Matrix matrix6 = ((AbstractC20600xn) c11900iW).A00;
                        if (matrix6 != null) {
                            this.A01.concat(matrix6);
                        }
                        Path A0C = A0C(c11900iW);
                        A0X(c11900iW);
                        A0V(c11900iW);
                        A0Z(c11900iW, ((AbstractC39021pR) c11900iW).A00);
                        boolean A0j7 = A0j();
                        if (this.A03.A05) {
                            A0Y(c11900iW, A0C);
                        }
                        if (this.A03.A06) {
                            A0N(A0C);
                        }
                        if (A0j7) {
                            A0W(c11900iW);
                        }
                    }
                }
            } else if (c18050t6 instanceof C12540jb) {
                C12540jb c12540jb = (C12540jb) c18050t6;
                C17900sr c17900sr14 = c12540jb.A02;
                if (c17900sr14 != null && !c17900sr14.A06()) {
                    A0g(this.A03, c12540jb);
                    if (A0i() && A0k()) {
                        Matrix matrix7 = ((AbstractC20600xn) c12540jb).A00;
                        if (matrix7 != null) {
                            this.A01.concat(matrix7);
                        }
                        Path A09 = A09(c12540jb);
                        A0X(c12540jb);
                        A0V(c12540jb);
                        A0Z(c12540jb, ((AbstractC39021pR) c12540jb).A00);
                        boolean A0j8 = A0j();
                        if (this.A03.A05) {
                            A0Y(c12540jb, A09);
                        }
                        if (this.A03.A06) {
                            A0N(A09);
                        }
                        if (A0j8) {
                            A0W(c12540jb);
                        }
                    }
                }
            } else if (c18050t6 instanceof C12440jQ) {
                C12440jQ c12440jQ = (C12440jQ) c18050t6;
                C17900sr c17900sr15 = c12440jQ.A02;
                if (c17900sr15 != null && (c17900sr = c12440jQ.A03) != null && !c17900sr15.A06() && !c17900sr.A06()) {
                    A0g(this.A03, c12440jQ);
                    if (A0i() && A0k()) {
                        Matrix matrix8 = ((AbstractC20600xn) c12440jQ).A00;
                        if (matrix8 != null) {
                            this.A01.concat(matrix8);
                        }
                        Path A0A = A0A(c12440jQ);
                        A0X(c12440jQ);
                        A0V(c12440jQ);
                        A0Z(c12440jQ, ((AbstractC39021pR) c12440jQ).A00);
                        boolean A0j9 = A0j();
                        if (this.A03.A05) {
                            A0Y(c12440jQ, A0A);
                        }
                        if (this.A03.A06) {
                            A0N(A0A);
                        }
                        if (A0j9) {
                            A0W(c12440jQ);
                        }
                    }
                }
            } else if (c18050t6 instanceof C11930iZ) {
                C11930iZ c11930iZ = (C11930iZ) c18050t6;
                A0g(this.A03, c11930iZ);
                if (A0i() && A0k() && this.A03.A06) {
                    Matrix matrix9 = ((AbstractC20600xn) c11930iZ).A00;
                    if (matrix9 != null) {
                        this.A01.concat(matrix9);
                    }
                    C17900sr c17900sr16 = c11930iZ.A00;
                    float A025 = c17900sr16 == null ? 0.0f : c17900sr16.A02(this);
                    C17900sr c17900sr17 = c11930iZ.A02;
                    float A032 = c17900sr17 == null ? 0.0f : c17900sr17.A03(this);
                    C17900sr c17900sr18 = c11930iZ.A01;
                    float A026 = c17900sr18 == null ? 0.0f : c17900sr18.A02(this);
                    C17900sr c17900sr19 = c11930iZ.A03;
                    r4 = c17900sr19 != null ? c17900sr19.A03(this) : 0.0f;
                    if (((AbstractC39021pR) c11930iZ).A00 == null) {
                        ((AbstractC39021pR) c11930iZ).A00 = new C17860sn(Math.min(A025, A026), Math.min(A032, r4), Math.abs(A026 - A025), Math.abs(r4 - A032));
                    }
                    Path path2 = new Path();
                    path2.moveTo(A025, A032);
                    path2.lineTo(A026, r4);
                    A0X(c11930iZ);
                    A0V(c11930iZ);
                    A0Z(c11930iZ, ((AbstractC39021pR) c11930iZ).A00);
                    boolean A0j10 = A0j();
                    A0N(path2);
                    A0P(c11930iZ);
                    if (A0j10) {
                        A0W(c11930iZ);
                    }
                }
            } else if (c18050t6 instanceof C10440g3) {
                C11910iX c11910iX = (C11910iX) c18050t6;
                A0g(this.A03, c11910iX);
                if (A0i() && A0k()) {
                    C18110tC c18110tC5 = this.A03;
                    if (c18110tC5.A06 || c18110tC5.A05) {
                        Matrix matrix10 = ((AbstractC20600xn) c11910iX).A00;
                        if (matrix10 != null) {
                            this.A01.concat(matrix10);
                        }
                        if (c11910iX.A00.length >= 2) {
                            Path A0B = A0B(c11910iX);
                            A0X(c11910iX);
                            A0V(c11910iX);
                            A0Z(c11910iX, ((AbstractC39021pR) c11910iX).A00);
                            boolean A0j11 = A0j();
                            if (this.A03.A05) {
                                A0Y(c11910iX, A0B);
                            }
                            if (this.A03.A06) {
                                A0N(A0B);
                            }
                            A0P(c11910iX);
                            if (A0j11) {
                                A0W(c11910iX);
                            }
                        }
                    }
                }
            } else if (c18050t6 instanceof C11910iX) {
                C11910iX c11910iX2 = (C11910iX) c18050t6;
                A0g(this.A03, c11910iX2);
                if (A0i() && A0k()) {
                    C18110tC c18110tC6 = this.A03;
                    if (c18110tC6.A06 || c18110tC6.A05) {
                        Matrix matrix11 = ((AbstractC20600xn) c11910iX2).A00;
                        if (matrix11 != null) {
                            this.A01.concat(matrix11);
                        }
                        if (c11910iX2.A00.length >= 2) {
                            Path A0B2 = A0B(c11910iX2);
                            A0X(c11910iX2);
                            EnumC17930su enumC17930su3 = this.A03.A04.A07;
                            if (enumC17930su3 != null && enumC17930su3 == enumC17930su) {
                                fillType = Path.FillType.EVEN_ODD;
                            } else {
                                fillType = Path.FillType.WINDING;
                            }
                            A0B2.setFillType(fillType);
                            A0V(c11910iX2);
                            A0Z(c11910iX2, ((AbstractC39021pR) c11910iX2).A00);
                            boolean A0j12 = A0j();
                            if (this.A03.A05) {
                                A0Y(c11910iX2, A0B2);
                            }
                            if (this.A03.A06) {
                                A0N(A0B2);
                            }
                            A0P(c11910iX2);
                            if (A0j12) {
                                A0W(c11910iX2);
                            }
                        }
                    }
                }
            } else if (c18050t6 instanceof C10400fz) {
                C10400fz c10400fz = (C10400fz) c18050t6;
                A0g(this.A03, c10400fz);
                if (A0i()) {
                    Matrix matrix12 = c10400fz.A00;
                    if (matrix12 != null) {
                        this.A01.concat(matrix12);
                    }
                    List list = ((AbstractC11850iR) c10400fz).A02;
                    float A027 = (list == null || list.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A02.get(0)).A02(this);
                    List list2 = ((AbstractC11850iR) c10400fz).A03;
                    float A033 = (list2 == null || list2.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A03.get(0)).A03(this);
                    List list3 = ((AbstractC11850iR) c10400fz).A00;
                    float A028 = (list3 == null || list3.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A00.get(0)).A02(this);
                    List list4 = ((AbstractC11850iR) c10400fz).A01;
                    if (list4 != null && list4.size() != 0) {
                        r4 = ((C17900sr) ((AbstractC11850iR) c10400fz).A01.get(0)).A03(this);
                    }
                    EnumC17980sz A0G = A0G();
                    if (A0G != EnumC17980sz.Start) {
                        C1Wi c1Wi = new C1Wi(this);
                        A0d(c10400fz, c1Wi);
                        float f = c1Wi.A00;
                        if (A0G == EnumC17980sz.Middle) {
                            f /= 2.0f;
                        }
                        A027 -= f;
                    }
                    if (((AbstractC39021pR) c10400fz).A00 == null) {
                        C29321Wh c29321Wh = new C29321Wh(this, A027, A033);
                        A0d(c10400fz, c29321Wh);
                        RectF rectF = c29321Wh.A02;
                        ((AbstractC39021pR) c10400fz).A00 = new C17860sn(rectF.left, rectF.top, rectF.width(), c29321Wh.A02.height());
                    }
                    A0X(c10400fz);
                    A0V(c10400fz);
                    A0Z(c10400fz, ((AbstractC39021pR) c10400fz).A00);
                    boolean A0j13 = A0j();
                    A0d(c10400fz, new C29301Wf(this, A027 + A028, A033 + r4));
                    if (A0j13) {
                        A0W(c10400fz);
                    }
                }
            }
        }
        A0J();
    }

    public final void A0b(C18050t6 c18050t6, C18110tC c18110tC) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (c18050t6 instanceof AbstractC29261Wb) {
                arrayList.add(0, c18050t6);
            }
            InterfaceC18040t5 interfaceC18040t5 = c18050t6.A00;
            if (interfaceC18040t5 == null) {
                break;
            }
            c18050t6 = (C18050t6) interfaceC18040t5;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0g(c18110tC, (AbstractC29261Wb) it.next());
        }
        C18110tC c18110tC2 = this.A03;
        c18110tC.A02 = c18110tC2.A02;
        c18110tC.A03 = c18110tC2.A03;
    }

    public final void A0c(C18050t6 c18050t6, boolean z, Path path, Matrix matrix) {
        Path A0B;
        if (A0i()) {
            this.A01.save();
            this.A06.push(this.A03);
            C18110tC c18110tC = new C18110tC(this.A03);
            this.A03 = c18110tC;
            if (c18050t6 instanceof C11840iQ) {
                if (z) {
                    C11840iQ c11840iQ = (C11840iQ) c18050t6;
                    A0g(c18110tC, c11840iQ);
                    if (A0i() && A0k()) {
                        Matrix matrix2 = ((C20590xm) c11840iQ).A00;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        C18050t6 A04 = ((C18050t6) c11840iQ).A01.A04(c11840iQ.A04);
                        if (A04 == null) {
                            A06("Use reference '%s' not found", c11840iQ.A04);
                        } else {
                            A0Z(c11840iQ, ((AbstractC39021pR) c11840iQ).A00);
                            A0c(A04, false, path, matrix);
                        }
                    }
                } else {
                    A06("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (c18050t6 instanceof C11920iY) {
                C11920iY c11920iY = (C11920iY) c18050t6;
                A0g(c18110tC, c11920iY);
                if (A0i() && A0k()) {
                    Matrix matrix3 = ((AbstractC20600xn) c11920iY).A00;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path2 = new C29291We(c11920iY.A00).A02;
                    C17860sn c17860sn = ((AbstractC39021pR) c11920iY).A00;
                    if (c17860sn == null) {
                        c17860sn = A03(path2);
                        ((AbstractC39021pR) c11920iY).A00 = c17860sn;
                    }
                    A0Z(c11920iY, c17860sn);
                    path.setFillType(A08());
                    path.addPath(path2, matrix);
                }
            } else if (c18050t6 instanceof C10400fz) {
                C10400fz c10400fz = (C10400fz) c18050t6;
                A0g(c18110tC, c10400fz);
                if (A0i()) {
                    Matrix matrix4 = c10400fz.A00;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = ((AbstractC11850iR) c10400fz).A02;
                    float f = 0.0f;
                    float A02 = (list == null || list.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A02.get(0)).A02(this);
                    List list2 = ((AbstractC11850iR) c10400fz).A03;
                    float A03 = (list2 == null || list2.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A03.get(0)).A03(this);
                    List list3 = ((AbstractC11850iR) c10400fz).A00;
                    float A022 = (list3 == null || list3.size() == 0) ? 0.0f : ((C17900sr) ((AbstractC11850iR) c10400fz).A00.get(0)).A02(this);
                    List list4 = ((AbstractC11850iR) c10400fz).A01;
                    if (list4 != null && list4.size() != 0) {
                        f = ((C17900sr) ((AbstractC11850iR) c10400fz).A01.get(0)).A03(this);
                    }
                    if (this.A03.A04.A0C != EnumC17980sz.Start) {
                        C1Wi c1Wi = new C1Wi(this);
                        A0d(c10400fz, c1Wi);
                        float f2 = c1Wi.A00;
                        if (this.A03.A04.A0C == EnumC17980sz.Middle) {
                            f2 /= 2.0f;
                        }
                        A02 -= f2;
                    }
                    C17860sn c17860sn2 = ((AbstractC39021pR) c10400fz).A00;
                    if (c17860sn2 == null) {
                        C29321Wh c29321Wh = new C29321Wh(this, A02, A03);
                        A0d(c10400fz, c29321Wh);
                        RectF rectF = c29321Wh.A02;
                        c17860sn2 = new C17860sn(rectF.left, rectF.top, rectF.width(), c29321Wh.A02.height());
                        ((AbstractC39021pR) c10400fz).A00 = c17860sn2;
                    }
                    A0Z(c10400fz, c17860sn2);
                    Path path3 = new Path();
                    A0d(c10400fz, new C29311Wg(this, A02 + A022, A03 + f, path3));
                    path.setFillType(A08());
                    path.addPath(path3, matrix);
                }
            } else if (c18050t6 instanceof AbstractC20600xn) {
                AbstractC20600xn abstractC20600xn = (AbstractC20600xn) c18050t6;
                A0g(c18110tC, abstractC20600xn);
                if (A0i() && A0k()) {
                    Matrix matrix5 = abstractC20600xn.A00;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (abstractC20600xn instanceof C11900iW) {
                        A0B = A0C((C11900iW) abstractC20600xn);
                    } else if (abstractC20600xn instanceof C12540jb) {
                        A0B = A09((C12540jb) abstractC20600xn);
                    } else if (abstractC20600xn instanceof C12440jQ) {
                        A0B = A0A((C12440jQ) abstractC20600xn);
                    } else if (abstractC20600xn instanceof C11910iX) {
                        A0B = A0B((C11910iX) abstractC20600xn);
                    }
                    A0Z(abstractC20600xn, ((AbstractC39021pR) abstractC20600xn).A00);
                    path.setFillType(A08());
                    path.addPath(A0B, matrix);
                }
            } else {
                A06("Invalid %s element found in clipPath definition", c18050t6.toString());
            }
            this.A01.restore();
            this.A03 = (C18110tC) this.A06.pop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x00e5, code lost:
        if (r0.size() <= 0) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0d(X.AbstractC20280xA r16, X.AbstractC18120tD r17) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0d(X.0xA, X.0tD):void");
    }

    public final void A0e(AbstractC20280xA abstractC20280xA, StringBuilder sb) {
        Iterator it = ((AbstractC25261Er) abstractC20280xA).A01.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C18050t6 c18050t6 = (C18050t6) it.next();
            if (c18050t6 instanceof AbstractC20280xA) {
                A0e((AbstractC20280xA) c18050t6, sb);
            } else if (c18050t6 instanceof C29271Wc) {
                sb.append(A0I(((C29271Wc) c18050t6).A00, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0037, code lost:
        if (r6 == X.C1WX.A02) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x007c, code lost:
        if (r6 == X.C1WX.A02) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0f(X.C18110tC r14, X.C18020t3 r15) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0f(X.0tC, X.0t3):void");
    }

    public final void A0g(C18110tC c18110tC, AbstractC29261Wb abstractC29261Wb) {
        boolean z = ((C18050t6) abstractC29261Wb).A00 == null;
        C18020t3 c18020t3 = c18110tC.A04;
        Boolean bool = Boolean.TRUE;
        c18020t3.A0L = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c18020t3.A0M = bool;
        c18020t3.A01 = null;
        c18020t3.A0W = null;
        Float valueOf = Float.valueOf(1.0f);
        c18020t3.A0P = valueOf;
        c18020t3.A0I = C1WX.A01;
        c18020t3.A0R = valueOf;
        c18020t3.A0a = null;
        c18020t3.A0H = null;
        c18020t3.A0Q = valueOf;
        c18020t3.A0K = null;
        c18020t3.A0U = valueOf;
        c18020t3.A0F = EnumC18010t2.None;
        C18020t3 c18020t32 = abstractC29261Wb.A00;
        if (c18020t32 != null) {
            A0f(c18110tC, c18020t32);
        }
        List list = this.A02.A01.A00;
        if (list != null && !list.isEmpty()) {
            for (C17730sa c17730sa : this.A02.A01.A00) {
                if (C17790sg.A04(null, c17730sa.A00, abstractC29261Wb)) {
                    A0f(c18110tC, c17730sa.A02);
                }
            }
        }
        C18020t3 c18020t33 = abstractC29261Wb.A01;
        if (c18020t33 != null) {
            A0f(c18110tC, c18020t33);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x005b, code lost:
        if (r2.booleanValue() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0116, code lost:
        if (r2.booleanValue() == false) goto L210;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0h(boolean r25, X.C17860sn r26, X.C1WZ r27) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18130tE.A0h(boolean, X.0sn, X.1WZ):void");
    }

    public final boolean A0i() {
        Boolean bool = this.A03.A04.A0L;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean A0j() {
        C18050t6 A04;
        C18020t3 c18020t3 = this.A03.A04;
        float floatValue = c18020t3.A0P.floatValue();
        if (floatValue < 1.0f || c18020t3.A0a != null) {
            Canvas canvas = this.A01;
            int i = (int) (floatValue * 256.0f);
            if (i < 0) {
                i = 0;
            } else if (i > 255) {
                i = 255;
            }
            canvas.saveLayerAlpha(null, i, 31);
            this.A06.push(this.A03);
            C18110tC c18110tC = new C18110tC(this.A03);
            this.A03 = c18110tC;
            String str = c18110tC.A04.A0a;
            if (str != null && ((A04 = this.A02.A04(str)) == null || !(A04 instanceof C20570xk))) {
                A06("Mask reference '%s' not found", this.A03.A04.A0a);
                this.A03.A04.A0a = null;
            }
            return true;
        }
        return false;
    }

    public final boolean A0k() {
        Boolean bool = this.A03.A04.A0N;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
