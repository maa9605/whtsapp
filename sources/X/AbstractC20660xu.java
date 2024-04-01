package X;

import android.content.res.TypedArray;

/* renamed from: X.0xu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20660xu {
    public final C20670xv A00 = new C20670xv();

    public AbstractC20660xu A00(TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            C20670xv c20670xv = this.A00;
            c20670xv.A0H = typedArray.getBoolean(3, c20670xv.A0H);
        }
        if (typedArray.hasValue(0)) {
            C20670xv c20670xv2 = this.A00;
            c20670xv2.A0G = typedArray.getBoolean(0, c20670xv2.A0G);
        }
        if (typedArray.hasValue(1)) {
            C20670xv c20670xv3 = this.A00;
            c20670xv3.A05 = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (c20670xv3.A05 & 16777215);
        }
        if (typedArray.hasValue(11)) {
            C20670xv c20670xv4 = this.A00;
            c20670xv4.A09 = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & c20670xv4.A09);
        }
        if (typedArray.hasValue(7)) {
            C20670xv c20670xv5 = this.A00;
            long j = typedArray.getInt(7, (int) c20670xv5.A0D);
            if (j >= 0) {
                c20670xv5.A0D = j;
            } else {
                StringBuilder sb = new StringBuilder("Given a negative duration: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (typedArray.hasValue(14)) {
            C20670xv c20670xv6 = this.A00;
            c20670xv6.A0A = typedArray.getInt(14, c20670xv6.A0A);
        }
        if (typedArray.hasValue(15)) {
            C20670xv c20670xv7 = this.A00;
            long j2 = typedArray.getInt(15, (int) c20670xv7.A0E);
            if (j2 >= 0) {
                c20670xv7.A0E = j2;
            } else {
                StringBuilder sb2 = new StringBuilder("Given a negative repeat delay: ");
                sb2.append(j2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (typedArray.hasValue(16)) {
            C20670xv c20670xv8 = this.A00;
            c20670xv8.A0B = typedArray.getInt(16, c20670xv8.A0B);
        }
        if (typedArray.hasValue(5)) {
            C20670xv c20670xv9 = this.A00;
            int i = typedArray.getInt(5, c20670xv9.A06);
            if (i == 1) {
                c20670xv9.A06 = 1;
            } else if (i == 2) {
                c20670xv9.A06 = 2;
            } else if (i != 3) {
                c20670xv9.A06 = 0;
            } else {
                c20670xv9.A06 = 3;
            }
        }
        if (typedArray.hasValue(17)) {
            C20670xv c20670xv10 = this.A00;
            if (typedArray.getInt(17, c20670xv10.A0C) != 1) {
                c20670xv10.A0C = 0;
            } else {
                c20670xv10.A0C = 1;
            }
        }
        if (typedArray.hasValue(6)) {
            C20670xv c20670xv11 = this.A00;
            float f = typedArray.getFloat(6, c20670xv11.A00);
            if (f >= 0.0f) {
                c20670xv11.A00 = f;
            } else {
                StringBuilder sb3 = new StringBuilder("Given invalid dropoff value: ");
                sb3.append(f);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        if (typedArray.hasValue(9)) {
            C20670xv c20670xv12 = this.A00;
            int dimensionPixelSize = typedArray.getDimensionPixelSize(9, c20670xv12.A08);
            if (dimensionPixelSize >= 0) {
                c20670xv12.A08 = dimensionPixelSize;
            } else {
                throw new IllegalArgumentException(C000200d.A0D("Given invalid width: ", dimensionPixelSize));
            }
        }
        if (typedArray.hasValue(8)) {
            C20670xv c20670xv13 = this.A00;
            int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, c20670xv13.A07);
            if (dimensionPixelSize2 >= 0) {
                c20670xv13.A07 = dimensionPixelSize2;
            } else {
                throw new IllegalArgumentException(C000200d.A0D("Given invalid height: ", dimensionPixelSize2));
            }
        }
        if (typedArray.hasValue(13)) {
            C20670xv c20670xv14 = this.A00;
            float f2 = typedArray.getFloat(13, c20670xv14.A02);
            if (f2 >= 0.0f) {
                c20670xv14.A02 = f2;
            } else {
                StringBuilder sb4 = new StringBuilder("Given invalid intensity value: ");
                sb4.append(f2);
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        if (typedArray.hasValue(19)) {
            C20670xv c20670xv15 = this.A00;
            float f3 = typedArray.getFloat(19, c20670xv15.A04);
            if (f3 >= 0.0f) {
                c20670xv15.A04 = f3;
            } else {
                StringBuilder sb5 = new StringBuilder("Given invalid width ratio: ");
                sb5.append(f3);
                throw new IllegalArgumentException(sb5.toString());
            }
        }
        if (typedArray.hasValue(10)) {
            C20670xv c20670xv16 = this.A00;
            float f4 = typedArray.getFloat(10, c20670xv16.A01);
            if (f4 >= 0.0f) {
                c20670xv16.A01 = f4;
            } else {
                StringBuilder sb6 = new StringBuilder("Given invalid height ratio: ");
                sb6.append(f4);
                throw new IllegalArgumentException(sb6.toString());
            }
        }
        if (typedArray.hasValue(18)) {
            C20670xv c20670xv17 = this.A00;
            c20670xv17.A03 = typedArray.getFloat(18, c20670xv17.A03);
        }
        return this;
    }

    public C20670xv A01() {
        C20670xv c20670xv = this.A00;
        int i = c20670xv.A0C;
        if (i != 1) {
            int[] iArr = c20670xv.A0J;
            int i2 = c20670xv.A05;
            iArr[0] = i2;
            int i3 = c20670xv.A09;
            iArr[1] = i3;
            iArr[2] = i3;
            iArr[3] = i2;
        } else {
            int[] iArr2 = c20670xv.A0J;
            int i4 = c20670xv.A09;
            iArr2[0] = i4;
            iArr2[1] = i4;
            int i5 = c20670xv.A05;
            iArr2[2] = i5;
            iArr2[3] = i5;
        }
        float[] fArr = c20670xv.A0I;
        if (i != 1) {
            float f = c20670xv.A02;
            float f2 = 1.0f - f;
            float f3 = c20670xv.A00;
            fArr[0] = Math.max((f2 - f3) / 2.0f, 0.0f);
            fArr[1] = Math.max((f2 - 0.001f) / 2.0f, 0.0f);
            float f4 = f + 1.0f;
            fArr[2] = Math.min((f4 + 0.001f) / 2.0f, 1.0f);
            fArr[3] = Math.min((f4 + f3) / 2.0f, 1.0f);
            return c20670xv;
        }
        fArr[0] = 0.0f;
        float f5 = c20670xv.A02;
        fArr[1] = Math.min(f5, 1.0f);
        fArr[2] = Math.min(f5 + c20670xv.A00, 1.0f);
        fArr[3] = 1.0f;
        return c20670xv;
    }
}
