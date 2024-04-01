package X;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1sZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC40621sZ {
    public static final Pattern A01 = Pattern.compile("la\\(s\\)");
    public static final Pattern A00 = Pattern.compile("à\\(s\\)");

    public static String A00(C002301c c002301c, long j) {
        Calendar calendar = Calendar.getInstance(c002301c.A0I());
        calendar.setTimeInMillis(j);
        return A03(c002301c, calendar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01(X.C002301c r5, java.lang.String r6, long r7) {
        /*
            java.lang.String r3 = r5.A04()
            int r2 = r3.hashCode()
            r1 = 3246(0xcae, float:4.549E-42)
            r0 = 0
            r4 = 1
            if (r2 == r1) goto L57
            r1 = 3588(0xe04, float:5.028E-42)
            if (r2 != r1) goto L92
            java.lang.String r1 = "pt"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = 1
        L1b:
            r3 = 13
            r2 = 11
            if (r1 == 0) goto L61
            if (r1 != r4) goto L92
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTimeInMillis(r7)
            int r1 = r1.get(r2)
            if (r1 == 0) goto L50
            if (r1 == r4) goto L4e
            if (r1 != r3) goto L3c
            X.0DF r0 = r5.A02()
            boolean r0 = r0.A00
            r0 = r0 ^ 1
        L3c:
            java.util.regex.Pattern r1 = X.AbstractC40621sZ.A00
            java.util.regex.Matcher r1 = r1.matcher(r6)
            if (r0 == 0) goto L4b
            java.lang.String r0 = "à"
        L46:
            java.lang.String r0 = r1.replaceAll(r0)
            return r0
        L4b:
            java.lang.String r0 = "às"
            goto L46
        L4e:
            r0 = 1
            goto L3c
        L50:
            X.0DF r0 = r5.A02()
            boolean r0 = r0.A00
            goto L3c
        L57:
            java.lang.String r1 = "es"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L92
            r1 = 0
            goto L1b
        L61:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r7)
            int r0 = r0.get(r2)
            if (r0 == r4) goto L78
            if (r0 != r3) goto L85
            X.0DF r0 = r5.A02()
            boolean r0 = r0.A00
            if (r0 != 0) goto L85
        L78:
            java.util.regex.Pattern r0 = X.AbstractC40621sZ.A01
            java.util.regex.Matcher r1 = r0.matcher(r6)
            java.lang.String r0 = "la"
            java.lang.String r0 = r1.replaceAll(r0)
            return r0
        L85:
            java.util.regex.Pattern r0 = X.AbstractC40621sZ.A01
            java.util.regex.Matcher r1 = r0.matcher(r6)
            java.lang.String r0 = "las"
            java.lang.String r0 = r1.replaceAll(r0)
            return r0
        L92:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC40621sZ.A01(X.01c, java.lang.String, long):java.lang.String");
    }

    public static String A02(C002301c c002301c, String str, Calendar calendar) {
        String A05;
        int[] iArr;
        int[] iArr2;
        String A052;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                z = !z;
            } else if (z) {
                sb.append(charAt);
            } else if ("aBhHKm".indexOf(charAt) != -1) {
                int i2 = i;
                while (i2 < length && str.charAt(i2) == charAt) {
                    i2++;
                }
                int i3 = i2 - i;
                if (charAt == 'B') {
                    Locale A0I = c002301c.A0I();
                    C59702tB c59702tB = (C59702tB) AbstractC59712tC.A00.get(AbstractC003201n.A05(A0I));
                    if (c59702tB == null && (c59702tB = (C59702tB) AbstractC59712tC.A00.get(A0I.getLanguage())) == null) {
                        if (calendar.get(9) == 0) {
                            A05 = c002301c.A05(210);
                        } else {
                            A05 = c002301c.A05(219);
                        }
                    } else {
                        int i4 = calendar.get(11);
                        if (calendar.get(12) == 0 && (iArr = c59702tB.A00) != null && (iArr2 = c59702tB.A01) != null) {
                            for (int i5 = 0; i5 < iArr.length; i5++) {
                                if (iArr[i5] == i4) {
                                    A05 = c002301c.A05(iArr2[i5]);
                                    break;
                                }
                            }
                        }
                        A05 = c002301c.A05(c59702tB.A02[i4]);
                    }
                    sb.append(A05);
                } else if (charAt == 'H') {
                    sb.append(String.format(c002301c.A0I(), i3 == 1 ? "%d" : "%02d", Integer.valueOf(calendar.get(11))));
                } else if (charAt == 'K') {
                    sb.append(String.format(c002301c.A0I(), i3 == 1 ? "%d" : "%02d", Integer.valueOf(calendar.get(10))));
                } else if (charAt == 'a') {
                    if (calendar.get(9) == 0) {
                        A052 = c002301c.A05(210);
                    } else {
                        A052 = c002301c.A05(219);
                    }
                    sb.append(A052);
                } else if (charAt == 'h') {
                    sb.append(A04(c002301c, calendar, i3));
                } else if (charAt == 'm') {
                    sb.append(String.format(c002301c.A0I(), i3 == 1 ? "%d" : "%02d", Integer.valueOf(calendar.get(12))));
                }
                i = i2 - 1;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 == 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A03(X.C002301c r3, java.util.Calendar r4) {
        /*
            X.0DF r0 = r3.A02()
            boolean r0 = r0.A00
            if (r0 == 0) goto L13
            r2 = 224(0xe0, float:3.14E-43)
        La:
            java.lang.String r0 = r3.A05(r2)
            java.lang.String r0 = A02(r3, r0, r4)
            return r0
        L13:
            java.util.Locale r0 = r3.A0I()
            int r1 = X.AbstractC003201n.A00(r0)
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            r2 = 223(0xdf, float:3.12E-43)
            if (r1 != r0) goto La
        L23:
            r2 = 222(0xde, float:3.11E-43)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC40621sZ.A03(X.01c, java.util.Calendar):java.lang.String");
    }

    public static String A04(C002301c c002301c, Calendar calendar, int i) {
        int i2 = calendar.get(10);
        if (i2 == 0) {
            i2 = 12;
        }
        return String.format(c002301c.A0I(), i == 1 ? "%d" : "%02d", Integer.valueOf(i2));
    }

    public static String A05(C002301c c002301c, Calendar calendar, Calendar calendar2) {
        int i;
        String A05;
        int i2 = 0;
        if (c002301c.A02().A00) {
            i = 228;
            if (calendar.get(11) == calendar2.get(11)) {
                i = 229;
            }
        } else {
            int A002 = AbstractC003201n.A00(c002301c.A0I());
            if (A002 != 2 && A002 != 3) {
                i = 227;
                if (calendar.get(11) != calendar2.get(11)) {
                    i = 225;
                    if (calendar.get(9) == calendar2.get(9)) {
                        i = 226;
                    }
                }
            } else {
                String A052 = c002301c.A05(222);
                return c002301c.A0C(230, A02(c002301c, A052, calendar), A02(c002301c, A052, calendar2));
            }
        }
        String A053 = c002301c.A05(i);
        int length = A053.length();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (i2 < length) {
            char charAt = A053.charAt(i2);
            if (charAt == '\'') {
                z = !z;
            } else if (z) {
                sb.append(charAt);
            } else if ("ahHKm".indexOf(charAt) != -1) {
                int i3 = i2;
                while (i3 < length && A053.charAt(i3) == charAt) {
                    i3++;
                }
                int i4 = i3 - i2;
                if (charAt == 'H') {
                    Calendar calendar3 = calendar2;
                    if (!z2) {
                        calendar3 = calendar;
                    }
                    sb.append(String.format(c002301c.A0I(), i4 == 1 ? "%d" : "%02d", Integer.valueOf(calendar3.get(11))));
                } else if (charAt != 'K') {
                    if (charAt == 'a') {
                        Calendar calendar4 = calendar2;
                        if (!z3) {
                            calendar4 = calendar;
                        }
                        if (calendar4.get(9) == 0) {
                            A05 = c002301c.A05(210);
                        } else {
                            A05 = c002301c.A05(219);
                        }
                        sb.append(A05);
                        z3 = true;
                    } else if (charAt == 'h') {
                        Calendar calendar5 = calendar2;
                        if (!z2) {
                            calendar5 = calendar;
                        }
                        sb.append(A04(c002301c, calendar5, i4));
                    } else if (charAt == 'm') {
                        Calendar calendar6 = calendar2;
                        if (!z4) {
                            calendar6 = calendar;
                        }
                        sb.append(String.format(c002301c.A0I(), i4 == 1 ? "%d" : "%02d", Integer.valueOf(calendar6.get(12))));
                        z4 = true;
                    }
                    i2 = i3 - 1;
                } else {
                    Calendar calendar7 = calendar2;
                    if (!z2) {
                        calendar7 = calendar;
                    }
                    sb.append(String.format(c002301c.A0I(), i4 == 1 ? "%d" : "%02d", Integer.valueOf(calendar7.get(10))));
                }
                z2 = true;
                i2 = i3 - 1;
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }
}
