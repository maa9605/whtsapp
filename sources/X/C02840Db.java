package X;

import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Db  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02840Db implements Iterator {
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B;
    public static final Pattern A0C = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern A0D = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern A0E = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d [0-2]\\d$");
    public static final Pattern A0F = Pattern.compile(":[0-5]\\d");
    public long A01;
    public final EnumC02830Da A04;
    public final C0DZ A05;
    public final CharSequence A06;
    public final String A07;
    public EnumC24601Cd A03 = EnumC24601Cd.NOT_READY;
    public C02850Dc A02 = null;
    public int A00 = 0;

    static {
        String A01 = A01(0, 3);
        StringBuilder A0X = C000200d.A0X("(?:[", "(\\[（［", "])?", "(?:", "[^(\\[（［)\\]）］]");
        C000200d.A1U(A0X, "+", "[", ")\\]）］", "])?");
        C000200d.A1U(A0X, "[^(\\[（［)\\]）］]", "+", "(?:[", "(\\[（［");
        C000200d.A1U(A0X, "]", "[^(\\[（［)\\]）］]", "+[", ")\\]）］");
        A0X.append("])");
        A0X.append(A01);
        A0X.append("[^(\\[（［)\\]）］]");
        A0X.append("*");
        A0A = Pattern.compile(A0X.toString());
        String A012 = A01(0, 2);
        String A013 = A01(0, 4);
        String A014 = A01(0, 19);
        String A0H = C000200d.A0H("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]", A013);
        StringBuilder A0P = C000200d.A0P("\\p{Nd}");
        A0P.append(A01(1, 19));
        String obj = A0P.toString();
        String A0I = C000200d.A0I("[", "(\\[（［+＋", "]");
        A09 = Pattern.compile(A0I);
        StringBuilder sb = new StringBuilder("\\p{Z}[^");
        sb.append("(\\[（［+＋");
        sb.append("\\p{Nd}]*");
        A08 = Pattern.compile(sb.toString());
        StringBuilder A0X2 = C000200d.A0X("(?:", A0I, A0H, ")", A012);
        C000200d.A1U(A0X2, obj, "(?:", A0H, obj);
        C000200d.A1T(A0X2, ")", A014, "(?:");
        A0X2.append(C0DZ.A0A);
        A0X2.append(")?");
        A0B = Pattern.compile(A0X2.toString(), 66);
    }

    public C02840Db(C0DZ c0dz, String str, String str2, EnumC02830Da enumC02830Da) {
        this.A05 = c0dz;
        this.A06 = str == null ? "" : str;
        this.A07 = str2;
        this.A04 = enumC02830Da;
        this.A01 = Long.MAX_VALUE;
    }

    public static CharSequence A00(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    public static String A01(int i, int i2) {
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder("{");
            sb.append(i);
            sb.append(",");
            sb.append(i2);
            sb.append("}");
            return sb.toString();
        }
        throw new IllegalArgumentException();
    }

    public static boolean A02(char c) {
        if (Character.isLetter(c) || Character.getType(c) == 6) {
            Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
            return of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
        }
        return false;
    }

    public static boolean A03(C10090fH c10090fH, C0DZ c0dz) {
        C10130fL A0E2;
        if (c10090fH.countryCodeSource_ == EnumC10100fI.FROM_DEFAULT_COUNTRY && (A0E2 = c0dz.A0E(c0dz.A0G(c10090fH.countryCode_))) != null) {
            C10140fM A0B2 = c0dz.A0B(A0E2.numberFormat_, C0DZ.A01(c10090fH));
            if (A0B2 != null) {
                String str = A0B2.nationalPrefixFormattingRule_;
                if (str.length() <= 0 || A0B2.nationalPrefixOptionalWhenFormatting_ || C0DZ.A02(str.substring(0, str.indexOf("$1")), false).toString().length() == 0) {
                    return true;
                }
                return c0dz.A0N(new StringBuilder(C0DZ.A02(c10090fH.rawInput_, false).toString()), A0E2, null);
            }
            return true;
        }
        return true;
    }

    public static boolean A04(C10090fH c10090fH, String str, C0DZ c0dz) {
        int i = 0;
        while (i < str.length() - 1) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt == 'X') {
                int i2 = i + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 != 'x' && charAt2 != 'X') {
                    if (!C0DZ.A02(str.substring(i), false).toString().equals(c10090fH.extension_)) {
                        return false;
                    }
                } else if (c0dz.A09(c10090fH, str.substring(i2)) != EnumC24611Ce.NSN_MATCH) {
                    return false;
                } else {
                    i = i2;
                }
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(X.C10090fH r9, java.lang.String r10, X.C0DZ r11, X.InterfaceC24591Cc r12) {
        /*
            r3 = 1
            java.lang.StringBuilder r4 = X.C0DZ.A02(r10, r3)
            r0 = 0
            java.lang.String[] r0 = A06(r11, r9, r0)
            boolean r0 = r12.A63(r11, r9, r4, r0)
            if (r0 == 0) goto L11
            return r3
        L11:
            int r7 = r9.countryCode_
            java.util.Set r1 = X.C24571Ca.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lb1
            java.util.Map r5 = X.C24571Ca.A00
            monitor-enter(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r5.containsKey(r6)     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto L88
            java.lang.Class<X.0Db> r2 = X.C02840Db.class
            java.lang.String r1 = "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lae
            r0.append(r7)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lae
            java.io.InputStream r0 = r2.getResourceAsStream(r0)     // Catch: java.lang.Throwable -> Lae
            r8 = 0
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L80
            r7.<init>(r0)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L80
            X.1Ch r0 = new X.1Ch     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            r0.readExternal(r7)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            java.util.List r0 = r0.metadata_     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
        L54:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            if (r0 == 0) goto L85
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            X.0fL r1 = (X.C10130fL) r1     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            int r0 = r1.countryCode_     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            r5.put(r0, r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6d
            goto L54
        L6a:
            r0 = move-exception
            r8 = r7
            goto L81
        L6d:
            r0 = move-exception
            r8 = r7
            goto L71
        L70:
            r0 = move-exception
        L71:
            java.util.logging.Logger r2 = X.C24571Ca.A02     // Catch: java.lang.Throwable -> L80
            java.util.logging.Level r1 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L80
            r2.log(r1, r0)     // Catch: java.lang.Throwable -> L80
            X.C24571Ca.A00(r8)     // Catch: java.lang.Throwable -> Lae
            goto L88
        L80:
            r0 = move-exception
        L81:
            X.C24571Ca.A00(r8)     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.lang.Throwable -> Lae
        L85:
            X.C24571Ca.A00(r7)     // Catch: java.lang.Throwable -> Lae
        L88:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r5.get(r6)
            X.0fL r0 = (X.C10130fL) r0
            if (r0 == 0) goto Lb1
            java.util.List r0 = r0.numberFormat_
            java.util.Iterator r1 = r0.iterator()
        L97:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r1.next()
            X.0fM r0 = (X.C10140fM) r0
            java.lang.String[] r0 = A06(r11, r9, r0)
            boolean r0 = r12.A63(r11, r9, r4, r0)
            if (r0 == 0) goto L97
            return r3
        Lae:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lae
            throw r0
        Lb1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02840Db.A05(X.0fH, java.lang.String, X.0DZ, X.1Cc):boolean");
    }

    public static String[] A06(C0DZ c0dz, C10090fH c10090fH, C10140fM c10140fM) {
        EnumC10160fO enumC10160fO = EnumC10160fO.RFC3966;
        if (c10140fM == null) {
            String A0H = c0dz.A0H(c10090fH, enumC10160fO);
            int indexOf = A0H.indexOf(59);
            if (indexOf < 0) {
                indexOf = A0H.length();
            }
            return A0H.substring(A0H.indexOf(45) + 1, indexOf).split("-");
        }
        return c0dz.A0I(C0DZ.A01(c10090fH), c10140fM, enumC10160fO).split("-");
    }

    public final C02850Dc A07(String str, int i) {
        char charAt;
        char charAt2;
        if (A0A.matcher(str).matches()) {
            EnumC02830Da enumC02830Da = this.A04;
            if (enumC02830Da.compareTo(EnumC02830Da.A04) >= 0) {
                if (i > 0 && !A09.matcher(str).lookingAt() && ((charAt2 = this.A06.charAt(i - 1)) == '%' || Character.getType(charAt2) == 26 || A02(charAt2))) {
                    return null;
                }
                int length = str.length() + i;
                CharSequence charSequence = this.A06;
                if (length < charSequence.length() && ((charAt = charSequence.charAt(length)) == '%' || Character.getType(charAt) == 26 || A02(charAt))) {
                    return null;
                }
            }
            C0DZ c0dz = this.A05;
            String str2 = this.A07;
            C10090fH c10090fH = new C10090fH();
            c0dz.A0K(str, str2, true, true, c10090fH);
            if (enumC02830Da.A00(c10090fH, str, c0dz)) {
                c10090fH.hasCountryCodeSource = false;
                c10090fH.countryCodeSource_ = EnumC10100fI.FROM_NUMBER_WITH_PLUS_SIGN;
                c10090fH.hasRawInput = false;
                c10090fH.rawInput_ = "";
                c10090fH.hasPreferredDomesticCarrierCode = false;
                c10090fH.preferredDomesticCarrierCode_ = "";
                return new C02850Dc(i, str, c10090fH);
            }
            return null;
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        C02850Dc c02850Dc;
        EnumC24601Cd enumC24601Cd = EnumC24601Cd.READY;
        EnumC24601Cd enumC24601Cd2 = this.A03;
        boolean z = false;
        z = false;
        if (enumC24601Cd2 == EnumC24601Cd.NOT_READY) {
            int i = this.A00;
            Pattern pattern = A0B;
            CharSequence charSequence = this.A06;
            Matcher matcher = pattern.matcher(charSequence);
            while (this.A01 > 0 && matcher.find(i)) {
                int start = matcher.start();
                CharSequence A00 = A00(C0DZ.A0O, charSequence.subSequence(start, matcher.end()));
                if (!A0C.matcher(A00).find() && !A0D.matcher(A00).find()) {
                    if (A0E.matcher(A00).find()) {
                        if (A0F.matcher(charSequence.toString().substring(A00.length() + start)).lookingAt()) {
                            continue;
                        }
                    }
                    String charSequence2 = A00.toString();
                    c02850Dc = A07(charSequence2, start);
                    if (c02850Dc != null) {
                        break;
                    }
                    Matcher matcher2 = A08.matcher(charSequence2);
                    if (matcher2.find()) {
                        String substring = charSequence2.substring(z ? 1 : 0, matcher2.start());
                        Pattern pattern2 = C0DZ.A0Q;
                        CharSequence A002 = A00(pattern2, substring);
                        c02850Dc = A07(A002.toString(), start);
                        if (c02850Dc != null) {
                            break;
                        }
                        this.A01--;
                        int end = matcher2.end();
                        c02850Dc = A07(A00(pattern2, charSequence2.substring(end)).toString(), start + end);
                        if (c02850Dc != null) {
                            break;
                        }
                        long j = this.A01 - 1;
                        this.A01 = j;
                        if (j <= 0) {
                            z = false;
                        } else {
                            while (matcher2.find()) {
                                end = matcher2.start();
                            }
                            z = false;
                            z = false;
                            z = false;
                            CharSequence A003 = A00(pattern2, charSequence2.substring(0, end));
                            if (!A003.equals(A002)) {
                                c02850Dc = A07(A003.toString(), start);
                                if (c02850Dc != null) {
                                    break;
                                }
                                this.A01--;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                }
                i = start + A00.length();
                this.A01--;
            }
            c02850Dc = null;
            this.A02 = c02850Dc;
            if (c02850Dc == null) {
                enumC24601Cd2 = EnumC24601Cd.DONE;
                this.A03 = enumC24601Cd2;
            } else {
                this.A00 = c02850Dc.A02.length() + c02850Dc.A00;
                this.A03 = enumC24601Cd;
                enumC24601Cd2 = enumC24601Cd;
            }
        }
        if (enumC24601Cd2 == enumC24601Cd) {
            return true;
        }
        return z;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            C02850Dc c02850Dc = this.A02;
            this.A02 = null;
            this.A03 = EnumC24601Cd.NOT_READY;
            return c02850Dc;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
