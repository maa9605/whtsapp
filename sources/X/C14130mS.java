package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.0mS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14130mS {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public C14130mS(int i, int i2) {
        this.A07 = Color.red(i);
        this.A05 = Color.green(i);
        this.A04 = Color.blue(i);
        this.A08 = i;
        this.A06 = i2;
    }

    public final void A00() {
        int A03;
        int A032;
        if (this.A02) {
            return;
        }
        int i = this.A08;
        int A05 = C09990f7.A05(-1, i, 4.5f);
        int A052 = C09990f7.A05(-1, i, 3.0f);
        if (A05 != -1 && A052 != -1) {
            this.A00 = C09990f7.A03(-1, A05);
            this.A01 = C09990f7.A03(-1, A052);
            this.A02 = true;
            return;
        }
        int A053 = C09990f7.A05(-16777216, i, 4.5f);
        int A054 = C09990f7.A05(-16777216, i, 3.0f);
        if (A053 != -1 && A054 != -1) {
            this.A00 = C09990f7.A03(-16777216, A053);
            this.A01 = C09990f7.A03(-16777216, A054);
            this.A02 = true;
            return;
        }
        if (A05 != -1) {
            A03 = C09990f7.A03(-1, A05);
        } else {
            A03 = C09990f7.A03(-16777216, A053);
        }
        this.A00 = A03;
        if (A052 != -1) {
            A032 = C09990f7.A03(-1, A052);
        } else {
            A032 = C09990f7.A03(-16777216, A054);
        }
        this.A01 = A032;
        this.A02 = true;
    }

    public float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        C09990f7.A06(this.A07, this.A05, this.A04, fArr);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14130mS.class != obj.getClass()) {
            return false;
        }
        C14130mS c14130mS = (C14130mS) obj;
        return this.A06 == c14130mS.A06 && this.A08 == c14130mS.A08;
    }

    public int hashCode() {
        return (this.A08 * 31) + this.A06;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Palette$Swatch");
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.A08));
        sb.append(']');
        sb.append(" [HSL: ");
        sb.append(Arrays.toString(A01()));
        sb.append(']');
        sb.append(" [Population: ");
        sb.append(this.A06);
        sb.append(']');
        sb.append(" [Title Text: #");
        A00();
        sb.append(Integer.toHexString(this.A01));
        sb.append(']');
        sb.append(" [Body Text: #");
        A00();
        sb.append(Integer.toHexString(this.A00));
        sb.append(']');
        return sb.toString();
    }
}
