package X;

/* renamed from: X.1WP  reason: invalid class name */
/* loaded from: classes.dex */
public class C1WP extends C18210tM {
    public static final int A01(int i) {
        if (i < 48 || i > 57) {
            int i2 = 65;
            if (i < 65 || i > 70) {
                i2 = 97;
                if (i < 97 || i > 102) {
                    return -1;
                }
            }
            return (i - i2) + 10;
        }
        return i - 48;
    }

    public C1WP(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public String A0G() {
        if (A0C()) {
            return null;
        }
        char charAt = this.A03.charAt(this.A01);
        if (charAt == '\'' || charAt == '\"') {
            StringBuilder sb = new StringBuilder();
            this.A01++;
            int intValue = A08().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = A08().intValue();
                    if (intValue == -1) {
                        break;
                    } else if (intValue != 10 && intValue != 13 && intValue != 12) {
                        int A01 = A01(intValue);
                        if (A01 != -1) {
                            int i = 1;
                            do {
                                intValue = A08().intValue();
                                int A012 = A01(intValue);
                                if (A012 == -1) {
                                    break;
                                }
                                A01 = (A01 << 4) + A012;
                                i++;
                            } while (i <= 5);
                            sb.append((char) A01);
                        }
                    } else {
                        intValue = A08().intValue();
                    }
                }
                sb.append((char) intValue);
                intValue = A08().intValue();
            }
            return sb.toString();
        }
        return null;
    }

    public String A0H() {
        int i;
        int i2;
        if (A0C()) {
            i2 = this.A01;
            i = i2;
        } else {
            i = this.A01;
            int charAt = this.A03.charAt(i);
            if (charAt == 45) {
                charAt = A04();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i2 = i;
            } else {
                int A04 = A04();
                while (true) {
                    if ((A04 < 65 || A04 > 90) && ((A04 < 97 || A04 > 122) && !((A04 >= 48 && A04 <= 57) || A04 == 45 || A04 == 95))) {
                        break;
                    }
                    A04 = A04();
                }
                i2 = this.A01;
            }
            this.A01 = i;
        }
        if (i2 == i) {
            return null;
        }
        String substring = this.A03.substring(i, i2);
        this.A01 = i2;
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0278, code lost:
        if (r11 == X.EnumC17720sZ.nth_of_type) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0284, code lost:
        if (r11 == X.EnumC17720sZ.nth_last_of_type) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e8, code lost:
        if (A0E('-') == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0337, code lost:
        if (r2 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03e3, code lost:
        throw new X.C17650sR("Invalid attribute simpleSelectors");
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03f8, code lost:
        throw new X.C17650sR(X.C000200d.A0H("Invalid or missing parameter section for pseudo class: ", r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0403, code lost:
        r0 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0405, code lost:
        if (r0 == null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x040b, code lost:
        if (r0.isEmpty() != false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x040d, code lost:
        r6.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0410, code lost:
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0se] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0se] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0se] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0se] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0se] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0se] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0sW] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0sW] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0sW] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0se] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.0sS, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A0I() {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1WP.A0I():java.util.List");
    }
}
