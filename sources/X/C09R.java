package X;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.09R */
/* loaded from: classes.dex */
public class C09R {
    public static final C09R A01 = new C09R("XXX");
    public final String A00;

    public C09R(String str) {
        if (str.length() == 3) {
            this.A00 = str.toUpperCase(Locale.US);
            return;
        }
        throw new IllegalArgumentException(C000200d.A0H("invalid currency code; currencyCode=", str));
    }

    public static int A00(String str) {
        Number number = (Number) AbstractC59692tA.A01.get(str.toUpperCase(Locale.US));
        if (number == null) {
            return 2;
        }
        return number.intValue();
    }

    public final C2RW A01(C002301c c002301c, int i, boolean z) {
        C2RW A012 = C2RW.A01(c002301c, z);
        A012.A00 = this.A00;
        A012.A01 = A02(c002301c);
        A012.A06(i);
        return A012;
    }

    public String A02(C002301c c002301c) {
        HashMap hashMap = AbstractC59692tA.A02;
        String str = this.A00;
        Number number = (Number) hashMap.get(str);
        if (number == null) {
            return str;
        }
        return A04(c002301c.A05(number.intValue()));
    }

    public String A03(C002301c c002301c, BigDecimal bigDecimal, boolean z) {
        return A01(c002301c, bigDecimal.scale(), z).A05(bigDecimal);
    }

    public final String A04(String str) {
        if (str.isEmpty()) {
            return this.A00;
        }
        AbstractC59762tH abstractC59762tH = AbstractC59762tH.A03;
        if (abstractC59762tH.A01(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2);
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            String[] strArr = (String[]) AbstractC59662t7.A00.get(Integer.valueOf(codePointAt));
            if (strArr != null && strArr.length != 0) {
                if (strArr.length == 1) {
                    sb.append(strArr[0]);
                } else {
                    int length2 = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr[i2];
                        if (!abstractC59762tH.A01(str2)) {
                            i2++;
                        } else if (str2 != null) {
                            sb.append(str2);
                        }
                    }
                    sb.appendCodePoint(codePointAt);
                }
            } else {
                sb.appendCodePoint(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C09R.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C09R) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
