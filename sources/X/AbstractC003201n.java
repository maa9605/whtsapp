package X;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.01n */
/* loaded from: classes.dex */
public abstract class AbstractC003201n {
    public static HashSet A00;
    public static final Pattern A03 = Pattern.compile("[A-Z]{2}|[0-9]{3}");
    public static final Pattern A02 = Pattern.compile("[a-z]{2,3}");
    public static final Object A01 = new Object();
    public static final String[] A04 = A0B('0');

    public static int A00(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            language = C000200d.A0I(language, "-", country);
        }
        C006802z c006802z = AbstractC50222Qs.A00;
        Number number = (Number) c006802z.get(language);
        if (number != null) {
            return number.intValue();
        }
        Number number2 = (Number) c006802z.getOrDefault(country, null);
        if (number2 != null) {
            return number2.intValue();
        }
        return 1;
    }

    public static String A01(Locale locale) {
        String language = locale.getLanguage();
        return "zh".equals(language) ? "Hans".equals(A02(locale)) ? "zh-Hans" : "zh-Hant" : language;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x003c, code lost:
        if (r3.equals("zh") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x005b, code lost:
        if (r3.equals("uz") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0065, code lost:
        if (r3.equals("sr") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x006f, code lost:
        if (r3.equals("pa") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0079, code lost:
        if (r3.equals("az") == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A02(java.util.Locale r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC003201n.A02(java.util.Locale):java.lang.String");
    }

    public static String A03(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
            if (i >= 28) {
                return decimalFormatSymbols.getDigitStrings()[0];
            }
            return Character.toString(decimalFormatSymbols.getZeroDigit());
        }
        return Character.toString(java.text.DecimalFormatSymbols.getInstance(locale).getZeroDigit());
    }

    public static String A04(Locale locale) {
        String language = locale.getLanguage();
        int hashCode = language.hashCode();
        if (hashCode != 3365) {
            if (hashCode != 3374) {
                if (hashCode != 3588) {
                    if (hashCode != 3704) {
                        if (hashCode == 3886 && language.equals("zh")) {
                            return "Hans".equals(A02(locale)) ? "zh-Hans" : "zh-Hant";
                        }
                    } else if (language.equals("tl")) {
                        return "fil";
                    }
                } else if (language.equals("pt")) {
                    return C47192Ag.A00.contains(locale.getCountry()) ? "pt-PT" : "pt-BR";
                }
            } else if (language.equals("iw")) {
                return "he";
            }
        } else if (language.equals("in")) {
            return "id";
        }
        return language;
    }

    public static String A05(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        return C0Wm.A01(locale).A00.AVZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0034, code lost:
        if (r2.equals("fil") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0045, code lost:
        if (r2.equals("zh") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0050, code lost:
        if (r2.equals("uz") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x005a, code lost:
        if (r2.equals("sr") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0064, code lost:
        if (r2.equals("sk") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006e, code lost:
        if (r2.equals("pa") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0078, code lost:
        if (r2.equals("id") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0082, code lost:
        if (r2.equals("he") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x008c, code lost:
        if (r2.equals("az") == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(java.util.Locale r5) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC003201n.A06(java.util.Locale):java.lang.String");
    }

    public static String A07(Locale locale, String str) {
        String[] A0B;
        Pattern compile;
        String str2;
        char charAt;
        String[] strArr = (String[]) C2Qt.A02.get(locale.getLanguage());
        if (strArr == null) {
            return str;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
            if (i >= 28) {
                A0B = decimalFormatSymbols.getDigitStrings();
            } else {
                char[] digits = decimalFormatSymbols.getDigits();
                A0B = new String[10];
                int i2 = 0;
                do {
                    A0B[i2] = Character.toString(digits[i2]);
                    i2++;
                } while (i2 < 10);
            }
        } else {
            A0B = A0B(java.text.DecimalFormatSymbols.getInstance(locale).getZeroDigit());
        }
        if (Arrays.equals(strArr, A0B)) {
            compile = Pattern.compile("[0-9]");
        } else if (Arrays.equals(A04, A0B)) {
            StringBuilder sb = new StringBuilder(19);
            sb.append(strArr[0]);
            int i3 = 1;
            do {
                sb.append('|');
                sb.append(strArr[i3]);
                i3++;
            } while (i3 < 10);
            compile = Pattern.compile(sb.toString());
        } else {
            StringBuilder A0P = C000200d.A0P("[0-9]|");
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append(strArr[0]);
            int i4 = 1;
            do {
                sb2.append('|');
                sb2.append(strArr[i4]);
                i4++;
            } while (i4 < 10);
            A0P.append(sb2.toString());
            compile = Pattern.compile(A0P.toString());
        }
        Matcher matcher = compile.matcher(str);
        if (matcher.find()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(length);
            int i5 = 0;
            do {
                int start = matcher.start();
                if (i5 < start) {
                    sb3.append(str.substring(i5, start));
                }
                String group = matcher.group();
                if (group.length() == 1 && '0' <= (charAt = group.charAt(0)) && charAt <= '9') {
                    str2 = A0B[charAt - '0'];
                } else {
                    str2 = "";
                }
                if (str2.isEmpty()) {
                    int i6 = 0;
                    while (true) {
                        if (group.equals(strArr[i6])) {
                            str2 = A0B[i6];
                            break;
                        }
                        i6++;
                        if (i6 >= 10) {
                            break;
                        }
                    }
                }
                if (!str2.isEmpty()) {
                    group = str2;
                }
                sb3.append(group);
                i5 = matcher.end();
            } while (matcher.find());
            if (i5 < length) {
                sb3.append(str.substring(i5));
            }
            return sb3.toString();
        }
        return str;
    }

    public static String A08(Locale[] localeArr) {
        int length = localeArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length * 6);
        sb.append(A05(localeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(',');
            sb.append(A05(localeArr[i]));
        }
        return sb.toString();
    }

    public static Locale A09(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Locale.forLanguageTag(str);
        }
        return C0Wm.A00(str).A00.A8E(0);
    }

    public static boolean A0A(Locale locale) {
        return "en".equals(locale.getLanguage()) && "en-US".equals(C2Af.A00(locale.getCountry()));
    }

    public static String[] A0B(char c) {
        String[] strArr = new String[10];
        int i = 0;
        do {
            strArr[i] = Character.toString((char) (c + i));
            i++;
        } while (i < 10);
        return strArr;
    }
}
