package X;

import java.util.Locale;

/* renamed from: X.0tM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18210tM {
    public int A00;
    public int A01 = 0;
    public C17810si A02 = new C17810si();
    public String A03;

    public static boolean A00(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public C18210tM(String str) {
        String trim = str.trim();
        this.A03 = trim;
        this.A00 = trim.length();
    }

    public float A01() {
        float A00 = this.A02.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A00)) {
            this.A01 = this.A02.A00;
        }
        return A00;
    }

    public float A02() {
        A0D();
        float A00 = this.A02.A00(this.A03, this.A01, this.A00);
        if (!Float.isNaN(A00)) {
            this.A01 = this.A02.A00;
        }
        return A00;
    }

    public float A03(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        A0D();
        return A01();
    }

    public int A04() {
        int i = this.A01;
        int i2 = this.A00;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.A01 = i3;
        if (i3 < i2) {
            return this.A03.charAt(i3);
        }
        return -1;
    }

    public C17900sr A05() {
        float A01 = A01();
        if (Float.isNaN(A01)) {
            return null;
        }
        EnumC18080t9 A06 = A06();
        if (A06 == null) {
            return new C17900sr(A01, EnumC18080t9.px);
        }
        return new C17900sr(A01, A06);
    }

    public EnumC18080t9 A06() {
        if (A0C()) {
            return null;
        }
        if (this.A03.charAt(this.A01) == '%') {
            this.A01++;
            return EnumC18080t9.percent;
        }
        int i = this.A01;
        if (i > this.A00 - 2) {
            return null;
        }
        try {
            EnumC18080t9 valueOf = EnumC18080t9.valueOf(this.A03.substring(i, i + 2).toLowerCase(Locale.US));
            this.A01 += 2;
            return valueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public Boolean A07(Object obj) {
        if (obj == null) {
            return null;
        }
        A0D();
        int i = this.A01;
        if (i != this.A00) {
            char charAt = this.A03.charAt(i);
            if (charAt == '0' || charAt == '1') {
                this.A01++;
                return Boolean.valueOf(charAt == '1');
            }
            return null;
        }
        return null;
    }

    public Integer A08() {
        int i = this.A01;
        if (i == this.A00) {
            return null;
        }
        String str = this.A03;
        this.A01 = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public String A09() {
        if (A0C()) {
            return null;
        }
        int i = this.A01;
        char charAt = this.A03.charAt(i);
        if (charAt == '\'' || charAt == '\"') {
            int A04 = A04();
            while (A04 != -1) {
                if (A04 != charAt) {
                    A04 = A04();
                } else {
                    int i2 = this.A01 + 1;
                    this.A01 = i2;
                    return this.A03.substring(i + 1, i2 - 1);
                }
            }
            this.A01 = i;
            return null;
        }
        return null;
    }

    public String A0A(char c, boolean z) {
        if (A0C()) {
            return null;
        }
        char charAt = this.A03.charAt(this.A01);
        if ((z || !A00(charAt)) && charAt != c) {
            int i = this.A01;
            int A04 = A04();
            while (A04 != -1 && A04 != c && (z || !A00(A04))) {
                A04 = A04();
            }
            return this.A03.substring(i, this.A01);
        }
        return null;
    }

    public void A0B() {
        while (true) {
            int i = this.A01;
            if (i >= this.A00 || !A00(this.A03.charAt(i))) {
                return;
            }
            this.A01++;
        }
    }

    public boolean A0C() {
        return this.A01 == this.A00;
    }

    public boolean A0D() {
        A0B();
        int i = this.A01;
        if (i != this.A00 && this.A03.charAt(i) == ',') {
            this.A01++;
            A0B();
            return true;
        }
        return false;
    }

    public boolean A0E(char c) {
        int i = this.A01;
        if (i < this.A00 && this.A03.charAt(i) == c) {
            this.A01++;
            return true;
        }
        return false;
    }

    public boolean A0F(String str) {
        int length = str.length();
        int i = this.A01;
        if (i <= this.A00 - length && this.A03.substring(i, i + length).equals(str)) {
            this.A01 += length;
            return true;
        }
        return false;
    }
}
