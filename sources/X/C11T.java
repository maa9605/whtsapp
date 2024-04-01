package X;

import java.util.regex.Pattern;

/* renamed from: X.11T  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11T {
    public static final Pattern A02 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final C223812f A00 = new C223812f();
    public final StringBuilder A01 = new StringBuilder();

    public static String A00(C223812f c223812f, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = c223812f.A01;
        int i2 = c223812f.A00;
        while (i < i2 && !z) {
            char c = (char) c223812f.A02[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        c223812f.A0C(i - i);
        return sb.toString();
    }

    public static String A01(C223812f c223812f, StringBuilder sb) {
        A02(c223812f);
        if (c223812f.A00 - c223812f.A01 == 0) {
            return null;
        }
        String A00 = A00(c223812f, sb);
        if ("".equals(A00)) {
            StringBuilder A0P = C000200d.A0P("");
            A0P.append((char) c223812f.A01());
            return A0P.toString();
        }
        return A00;
    }

    public static void A02(C223812f c223812f) {
        while (true) {
            boolean z = true;
            while (true) {
                int i = c223812f.A00;
                int i2 = c223812f.A01;
                if (i - i2 > 0 && z) {
                    byte[] bArr = c223812f.A02;
                    byte b = bArr[i2];
                    char c = (char) b;
                    if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                        break;
                    }
                    if (i2 + 2 <= i) {
                        int i3 = i2 + 1;
                        if (b == 47) {
                            int i4 = i3 + 1;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i) {
                                        break;
                                    } else if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i = i5 + 1;
                                        i4 = i;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                c223812f.A0C(i - i2);
                            }
                        } else {
                            continue;
                        }
                    }
                    z = false;
                } else {
                    return;
                }
            }
            c223812f.A0C(1);
        }
    }
}
