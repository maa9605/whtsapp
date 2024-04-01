package X;

/* renamed from: X.0sr */
/* loaded from: classes.dex */
public class C17900sr implements Cloneable {
    public float A00;
    public EnumC18080t9 A01;

    public C17900sr(float f) {
        this.A00 = f;
        this.A01 = EnumC18080t9.px;
    }

    public C17900sr(float f, EnumC18080t9 enumC18080t9) {
        this.A00 = f;
        this.A01 = enumC18080t9;
    }

    public float A00(float f) {
        int ordinal = this.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            if (ordinal != 7) {
                                return this.A00;
                            }
                            return (this.A00 * f) / 6.0f;
                        }
                        return (this.A00 * f) / 72.0f;
                    }
                    return (this.A00 * f) / 25.4f;
                }
                return (this.A00 * f) / 2.54f;
            }
            return this.A00 * f;
        }
        return this.A00;
    }

    public float A01(C18130tE c18130tE) {
        if (this.A01 == EnumC18080t9.percent) {
            C18110tC c18110tC = c18130tE.A03;
            C17860sn c17860sn = c18110tC.A02;
            if (c17860sn == null && (c17860sn = c18110tC.A03) == null) {
                return this.A00;
            }
            float f = c17860sn.A03;
            float f2 = c17860sn.A00;
            if (f == f2) {
                return (this.A00 * f) / 100.0f;
            }
            return (this.A00 * ((float) (Math.sqrt((f2 * f2) + (f * f)) / 1.414213562373095d))) / 100.0f;
        }
        return A02(c18130tE);
    }

    public float A02(C18130tE c18130tE) {
        float f;
        float textSize;
        float f2;
        float f3;
        switch (this.A01.ordinal()) {
            case 0:
                return this.A00;
            case 1:
                f = this.A00;
                textSize = c18130tE.A03.A00.getTextSize();
                return f * textSize;
            case 2:
                f = this.A00;
                textSize = c18130tE.A03.A00.getTextSize() / 2.0f;
                return f * textSize;
            case 3:
                f = this.A00;
                textSize = c18130tE.A00;
                return f * textSize;
            case 4:
                f2 = this.A00 * c18130tE.A00;
                f3 = 2.54f;
                return f2 / f3;
            case 5:
                f2 = this.A00 * c18130tE.A00;
                f3 = 25.4f;
                return f2 / f3;
            case 6:
                f2 = this.A00 * c18130tE.A00;
                f3 = 72.0f;
                return f2 / f3;
            case 7:
                f2 = this.A00 * c18130tE.A00;
                f3 = 6.0f;
                return f2 / f3;
            case 8:
                C18110tC c18110tC = c18130tE.A03;
                C17860sn c17860sn = c18110tC.A02;
                if (c17860sn == null && (c17860sn = c18110tC.A03) == null) {
                    return this.A00;
                }
                f2 = this.A00 * c17860sn.A03;
                f3 = 100.0f;
                return f2 / f3;
            default:
                return this.A00;
        }
    }

    public float A03(C18130tE c18130tE) {
        if (this.A01 == EnumC18080t9.percent) {
            C18110tC c18110tC = c18130tE.A03;
            C17860sn c17860sn = c18110tC.A02;
            if (c17860sn == null && (c17860sn = c18110tC.A03) == null) {
                return this.A00;
            }
            return (this.A00 * c17860sn.A00) / 100.0f;
        }
        return A02(c18130tE);
    }

    public float A04(C18130tE c18130tE, float f) {
        if (this.A01 == EnumC18080t9.percent) {
            return (this.A00 * f) / 100.0f;
        }
        return A02(c18130tE);
    }

    public boolean A05() {
        return this.A00 < 0.0f;
    }

    public boolean A06() {
        return this.A00 == 0.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.A00));
        sb.append(this.A01);
        return sb.toString();
    }
}
