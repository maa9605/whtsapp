package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xml.sax.Attributes;

/* renamed from: X.0tO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18230tO {
    public int A00;
    public C18090tA A02 = null;
    public InterfaceC18040t5 A01 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public EnumC18200tL A03 = null;
    public StringBuilder A04 = null;
    public boolean A08 = false;
    public StringBuilder A05 = null;

    public static void A0O(StringBuilder sb, char c) {
        sb.append(c);
        sb.append(" path segment");
        Log.e("SVGParser", sb.toString());
    }

    public static float A00(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return ((f2 - f) * f3) + f;
        }
        if (f3 < 3.0f) {
            return f2;
        }
        if (f3 < 4.0f) {
            return ((4.0f - f3) * (f2 - f)) + f;
        }
        return f;
    }

    public static float A01(String str) {
        int length = str.length();
        if (length != 0) {
            return A02(str, length);
        }
        throw new C18140tF("Invalid float value (empty string)");
    }

    public static float A02(String str, int i) {
        float A00 = new C17810si().A00(str, 0, i);
        if (Float.isNaN(A00)) {
            throw new C18140tF(C000200d.A0H("Invalid float value: ", str));
        }
        return A00;
    }

    public static int A03(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r7 <= 0.5f) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(float r5, float r6, float r7) {
        /*
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            float r5 = r5 % r1
            if (r0 >= 0) goto L9
            float r5 = r5 + r1
        L9:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5b
            r6 = 0
        L17:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L28
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L55
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L55
        L28:
            float r6 = r6 + r1
            float r6 = r6 * r2
        L2a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = A00(r2, r6, r0)
            float r4 = A00(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = A00(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = A03(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = A03(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = A03(r3)
            r0 = r0 | r1
            return r0
        L55:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
            goto L2a
        L5b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18230tO.A04(float, float, float):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x020f, code lost:
        throw new X.C18140tF(X.C000200d.A0H("Invalid transform list: ", r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0223, code lost:
        throw new X.C18140tF(X.C000200d.A0H("Invalid transform list: ", r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022d, code lost:
        throw new X.C18140tF(X.C000200d.A0H("Invalid transform list: ", r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0237, code lost:
        throw new X.C18140tF(X.C000200d.A0H("Invalid transform list: ", r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0241, code lost:
        throw new X.C18140tF(X.C000200d.A0H("Invalid transform list: ", r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024d, code lost:
        throw new X.C18140tF(X.C000200d.A0H("Bad transform function encountered in transform list: ", r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024e, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f7, code lost:
        throw new X.C18140tF(X.C000200d.A0H("Invalid transform list: ", r20));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.graphics.Matrix A05(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18230tO.A05(java.lang.String):android.graphics.Matrix");
    }

    public static C1WX A06(String str) {
        long j;
        int i;
        int i2 = 4;
        if (str.charAt(0) != '#') {
            String lowerCase = str.toLowerCase(Locale.US);
            boolean startsWith = lowerCase.startsWith("rgba(");
            if (!startsWith) {
                if (!lowerCase.startsWith("rgb(")) {
                    boolean startsWith2 = lowerCase.startsWith("hsla(");
                    if (!startsWith2) {
                        if (!lowerCase.startsWith("hsl(")) {
                            Number number = (Number) C18160tH.A00.get(lowerCase);
                            if (number != null) {
                                return new C1WX(number.intValue());
                            }
                            throw new C18140tF(C000200d.A0H("Invalid colour keyword: ", lowerCase));
                        }
                    } else {
                        i2 = 5;
                    }
                    C18210tM c18210tM = new C18210tM(str.substring(i2));
                    c18210tM.A0B();
                    float A01 = c18210tM.A01();
                    float A03 = c18210tM.A03(A01);
                    if (!Float.isNaN(A03)) {
                        c18210tM.A0E('%');
                    }
                    float A032 = c18210tM.A03(A03);
                    boolean isNaN = Float.isNaN(A032);
                    if (!isNaN) {
                        c18210tM.A0E('%');
                    }
                    if (startsWith2) {
                        float A033 = c18210tM.A03(A032);
                        c18210tM.A0B();
                        if (Float.isNaN(A033) || !c18210tM.A0E(')')) {
                            throw new C18140tF(C000200d.A0H("Bad hsla() colour value: ", str));
                        }
                        return new C1WX((A03(A033 * 256.0f) << 24) | A04(A01, A03, A032));
                    }
                    c18210tM.A0B();
                    if (isNaN || !c18210tM.A0E(')')) {
                        throw new C18140tF(C000200d.A0H("Bad hsl() colour value: ", str));
                    }
                    return new C1WX(A04(A01, A03, A032) | (-16777216));
                }
            } else {
                i2 = 5;
            }
            C18210tM c18210tM2 = new C18210tM(str.substring(i2));
            c18210tM2.A0B();
            float A012 = c18210tM2.A01();
            if (!Float.isNaN(A012) && c18210tM2.A0E('%')) {
                A012 = (A012 * 256.0f) / 100.0f;
            }
            float A034 = c18210tM2.A03(A012);
            if (!Float.isNaN(A034) && c18210tM2.A0E('%')) {
                A034 = (A034 * 256.0f) / 100.0f;
            }
            float A035 = c18210tM2.A03(A034);
            if (!Float.isNaN(A035) && c18210tM2.A0E('%')) {
                A035 = (A035 * 256.0f) / 100.0f;
            }
            if (startsWith) {
                float A036 = c18210tM2.A03(A035);
                c18210tM2.A0B();
                if (Float.isNaN(A036) || !c18210tM2.A0E(')')) {
                    throw new C18140tF(C000200d.A0H("Bad rgba() colour value: ", str));
                }
                return new C1WX((A03(A036 * 256.0f) << 24) | (A03(A012) << 16) | (A03(A034) << 8) | A03(A035));
            }
            c18210tM2.A0B();
            if (Float.isNaN(A035) || !c18210tM2.A0E(')')) {
                throw new C18140tF(C000200d.A0H("Bad rgb() colour value: ", str));
            }
            return new C1WX((A03(A012) << 16) | (-16777216) | (A03(A034) << 8) | A03(A035));
        }
        int length = str.length();
        C17800sh c17800sh = null;
        if (1 < length) {
            long j2 = 0;
            int i3 = 1;
            while (i3 < length) {
                char charAt = str.charAt(i3);
                if (charAt < '0' || charAt > '9') {
                    if (charAt >= 'A' && charAt <= 'F') {
                        j = j2 * 16;
                        i = charAt - 'A';
                    } else if (charAt < 'a' || charAt > 'f') {
                        break;
                    } else {
                        j = j2 * 16;
                        i = charAt - 'a';
                    }
                    j2 = j + i + 10;
                } else {
                    j2 = (j2 * 16) + (charAt - '0');
                }
                if (j2 > 4294967295L) {
                    break;
                }
                i3++;
            }
            if (i3 != 1) {
                c17800sh = new C17800sh(j2, i3);
            }
        }
        if (c17800sh != null) {
            int i4 = c17800sh.A00;
            if (i4 == 4) {
                int i5 = (int) c17800sh.A01;
                int i6 = i5 & 3840;
                int i7 = i5 & 240;
                int i8 = i5 & 15;
                return new C1WX(i8 | (i6 << 8) | (-16777216) | (i6 << 12) | (i7 << 8) | (i7 << 4) | (i8 << 4));
            } else if (i4 != 5) {
                if (i4 != 7) {
                    if (i4 == 9) {
                        int i9 = (int) c17800sh.A01;
                        return new C1WX((i9 << 24) | (i9 >>> 8));
                    }
                    throw new C18140tF(C000200d.A0H("Bad hex colour value: ", str));
                }
                return new C1WX(((int) c17800sh.A01) | (-16777216));
            } else {
                int i10 = (int) c17800sh.A01;
                int i11 = 61440 & i10;
                int i12 = i10 & 3840;
                int i13 = i10 & 240;
                int i14 = i10 & 15;
                return new C1WX((i14 << 24) | (i14 << 28) | (i11 << 8) | (i11 << 4) | (i12 << 4) | i12 | i13 | (i13 >> 4));
            }
        }
        throw new C18140tF(C000200d.A0H("Bad hex colour value: ", str));
    }

    public static C17900sr A07(C18210tM c18210tM) {
        if (c18210tM.A0F("auto")) {
            return new C17900sr(0.0f);
        }
        return c18210tM.A05();
    }

    public static C17900sr A08(String str) {
        int length = str.length();
        if (length != 0) {
            EnumC18080t9 enumC18080t9 = EnumC18080t9.px;
            int i = length - 1;
            char charAt = str.charAt(i);
            if (charAt == '%') {
                length = i;
                enumC18080t9 = EnumC18080t9.percent;
            } else if (length > 2 && Character.isLetter(charAt)) {
                int i2 = length - 2;
                if (Character.isLetter(str.charAt(i2))) {
                    length = i2;
                    try {
                        enumC18080t9 = EnumC18080t9.valueOf(str.substring(i2).toLowerCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                        throw new C18140tF(C000200d.A0H("Invalid length unit specifier: ", str));
                    }
                }
            }
            try {
                return new C17900sr(A02(str, length), enumC18080t9);
            } catch (NumberFormatException e) {
                throw new C18140tF(C000200d.A0H("Invalid length value: ", str), e);
            }
        }
        throw new C18140tF("Invalid length value (empty string)");
    }

    public static EnumC17940sv A09(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1657669071) {
            if (str.equals("oblique")) {
                return EnumC17940sv.Oblique;
            }
            return null;
        } else if (hashCode == -1178781136) {
            if (str.equals("italic")) {
                return EnumC17940sv.Italic;
            }
            return null;
        } else if (hashCode == -1039745817 && str.equals("normal")) {
            return EnumC17940sv.Normal;
        } else {
            return null;
        }
    }

    public static AbstractC18060t7 A0A(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3387192) {
            if (hashCode == 1442907498 && str.equals("currentColor")) {
                return C1WY.A00;
            }
        } else if (str.equals("none")) {
            return C1WX.A02;
        }
        try {
            return A06(str);
        } catch (C18140tF unused) {
            return null;
        }
    }

    public static AbstractC18060t7 A0B(String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            if (indexOf != -1) {
                String trim = str.substring(4, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                return new C1WZ(trim, trim2.length() > 0 ? A0A(trim2) : null);
            }
            return new C1WZ(str.substring(4).trim(), null);
        }
        return A0A(str);
    }

    public static Float A0C(String str) {
        try {
            float A01 = A01(str);
            if (A01 < 0.0f) {
                A01 = 0.0f;
            } else if (A01 > 1.0f) {
                A01 = 1.0f;
            }
            return Float.valueOf(A01);
        } catch (C18140tF unused) {
            return null;
        }
    }

    public static String A0D(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            if (str.endsWith(")")) {
                return str.substring(4, str.length() - 1).trim();
            }
            return str.substring(4).trim();
        }
        return null;
    }

    public static List A0E(String str) {
        C18210tM c18210tM = new C18210tM(str);
        ArrayList arrayList = null;
        do {
            String A09 = c18210tM.A09();
            if (A09 == null && (A09 = c18210tM.A0A(',', true)) == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(A09);
            c18210tM.A0D();
        } while (!c18210tM.A0C());
        return arrayList;
    }

    public static List A0F(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            C18210tM c18210tM = new C18210tM(str);
            c18210tM.A0B();
            while (!c18210tM.A0C()) {
                float A01 = c18210tM.A01();
                if (Float.isNaN(A01)) {
                    StringBuilder A0P = C000200d.A0P("Invalid length list value: ");
                    int i = c18210tM.A01;
                    int i2 = i;
                    while (!c18210tM.A0C() && !C18210tM.A00(c18210tM.A03.charAt(i2))) {
                        i2 = c18210tM.A01 + 1;
                        c18210tM.A01 = i2;
                    }
                    A0P.append(c18210tM.A03.substring(i, c18210tM.A01));
                    throw new C18140tF(A0P.toString());
                }
                EnumC18080t9 A06 = c18210tM.A06();
                if (A06 == null) {
                    A06 = EnumC18080t9.px;
                }
                arrayList.add(new C17900sr(A01, A06));
                c18210tM.A0D();
            }
            return arrayList;
        }
        throw new C18140tF("Invalid length list (empty string)");
    }

    public static final void A0G(C11910iX c11910iX, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC18190tK.A00(attributes.getLocalName(i)) == EnumC18190tK.points) {
                C18210tM c18210tM = new C18210tM(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c18210tM.A0B();
                while (!c18210tM.A0C()) {
                    float A01 = c18210tM.A01();
                    if (!Float.isNaN(A01)) {
                        c18210tM.A0D();
                        float A012 = c18210tM.A01();
                        if (!Float.isNaN(A012)) {
                            c18210tM.A0D();
                            arrayList.add(Float.valueOf(A01));
                            arrayList.add(Float.valueOf(A012));
                        } else {
                            throw new C18140tF(C000200d.A0I("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                        }
                    } else {
                        throw new C18140tF(C000200d.A0I("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                }
                c11910iX.A00 = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c11910iX.A00[i2] = ((Number) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0404, code lost:
        if (r12.equals("visible") != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x040b, code lost:
        if (r12.equals("auto") != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x040d, code lost:
        r6 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0416, code lost:
        if (r12.equals("scroll") != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x041f, code lost:
        if (r12.equals("hidden") != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0421, code lost:
        r6 = java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0H(X.C18020t3 r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18230tO.A0H(X.0t3, java.lang.String, java.lang.String):void");
    }

    public static final void A0I(InterfaceC18030t4 interfaceC18030t4, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18190tK.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        C18210tM c18210tM = new C18210tM(trim);
                        HashSet hashSet = new HashSet();
                        while (!c18210tM.A0C()) {
                            String A0A = c18210tM.A0A(' ', false);
                            if (A0A.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(A0A.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c18210tM.A0B();
                        }
                        interfaceC18030t4.ATm(hashSet);
                        continue;
                    case 53:
                        interfaceC18030t4.ATl(trim);
                        continue;
                    case 54:
                        C18210tM c18210tM2 = new C18210tM(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!c18210tM2.A0C()) {
                            hashSet2.add(c18210tM2.A0A(' ', false));
                            c18210tM2.A0B();
                        }
                        interfaceC18030t4.ATo(hashSet2);
                        continue;
                    case 55:
                        List A0E = A0E(trim);
                        interfaceC18030t4.ATn(A0E != null ? new HashSet(A0E) : new HashSet(0));
                        continue;
                }
            } else {
                C18210tM c18210tM3 = new C18210tM(trim);
                HashSet hashSet3 = new HashSet();
                while (!c18210tM3.A0C()) {
                    String A0A2 = c18210tM3.A0A(' ', false);
                    int indexOf = A0A2.indexOf(45);
                    if (indexOf != -1) {
                        A0A2 = A0A2.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(A0A2, "", "").getLanguage());
                    c18210tM3.A0B();
                }
                interfaceC18030t4.ATx(hashSet3);
            }
        }
    }

    public static final void A0J(AbstractC29261Wb abstractC29261Wb, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (!qName.equals("id") && !qName.equals("xml:id")) {
                if (qName.equals("xml:space")) {
                    String trim = attributes.getValue(i).trim();
                    if ("default".equals(trim)) {
                        abstractC29261Wb.A02 = Boolean.FALSE;
                        return;
                    } else if ("preserve".equals(trim)) {
                        abstractC29261Wb.A02 = Boolean.TRUE;
                        return;
                    } else {
                        throw new C18140tF(C000200d.A0H("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                }
            } else {
                abstractC29261Wb.A03 = attributes.getValue(i).trim();
                return;
            }
        }
    }

    public static final void A0K(AbstractC29261Wb abstractC29261Wb, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ordinal = EnumC18190tK.A00(attributes.getLocalName(i)).ordinal();
                if (ordinal == 0) {
                    C1WP c1wp = new C1WP(trim);
                    ArrayList arrayList = null;
                    while (!c1wp.A0C()) {
                        String A0A = c1wp.A0A(' ', false);
                        if (A0A != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(A0A);
                            c1wp.A0B();
                        }
                    }
                    abstractC29261Wb.A04 = arrayList;
                } else if (ordinal != 72) {
                    C18020t3 c18020t3 = abstractC29261Wb.A00;
                    if (c18020t3 == null) {
                        c18020t3 = new C18020t3();
                        abstractC29261Wb.A00 = c18020t3;
                    }
                    A0H(c18020t3, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C18210tM c18210tM = new C18210tM(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String A0A2 = c18210tM.A0A(':', false);
                        c18210tM.A0B();
                        if (c18210tM.A0E(':')) {
                            c18210tM.A0B();
                            String A0A3 = c18210tM.A0A(';', true);
                            if (A0A3 != null) {
                                c18210tM.A0B();
                                if (c18210tM.A0C() || c18210tM.A0E(';')) {
                                    C18020t3 c18020t32 = abstractC29261Wb.A01;
                                    if (c18020t32 == null) {
                                        c18020t32 = new C18020t3();
                                        abstractC29261Wb.A01 = c18020t32;
                                    }
                                    A0H(c18020t32, A0A2, A0A3);
                                    c18210tM.A0B();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A0L(AbstractC20440xX abstractC20440xX, String str) {
        C18210tM c18210tM = new C18210tM(str);
        c18210tM.A0B();
        String A0A = c18210tM.A0A(' ', false);
        if ("defer".equals(A0A)) {
            c18210tM.A0B();
            A0A = c18210tM.A0A(' ', false);
        }
        EnumC17820sj enumC17820sj = (EnumC17820sj) C18150tG.A00.get(A0A);
        EnumC17830sk enumC17830sk = null;
        c18210tM.A0B();
        if (!c18210tM.A0C()) {
            String A0A2 = c18210tM.A0A(' ', false);
            int hashCode = A0A2.hashCode();
            if (hashCode == 3347527) {
                if (A0A2.equals("meet")) {
                    enumC17830sk = EnumC17830sk.meet;
                }
                throw new C18140tF(C000200d.A0H("Invalid preserveAspectRatio definition: ", str));
            }
            if (hashCode == 109526418 && A0A2.equals("slice")) {
                enumC17830sk = EnumC17830sk.slice;
            }
            throw new C18140tF(C000200d.A0H("Invalid preserveAspectRatio definition: ", str));
        }
        abstractC20440xX.A00 = new C17840sl(enumC17820sj, enumC17830sk);
    }

    public static final void A0M(AbstractC11890iV abstractC11890iV, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18190tK.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                A0L(abstractC11890iV, trim);
            } else if (ordinal == 80) {
                C18210tM c18210tM = new C18210tM(trim);
                c18210tM.A0B();
                float A01 = c18210tM.A01();
                c18210tM.A0D();
                float A012 = c18210tM.A01();
                c18210tM.A0D();
                float A013 = c18210tM.A01();
                c18210tM.A0D();
                float A014 = c18210tM.A01();
                if (Float.isNaN(A01) || Float.isNaN(A012) || Float.isNaN(A013) || Float.isNaN(A014)) {
                    throw new C18140tF("Invalid viewBox definition - should have four numbers");
                }
                if (A013 < 0.0f) {
                    throw new C18140tF("Invalid viewBox. width cannot be negative");
                }
                if (A014 >= 0.0f) {
                    abstractC11890iV.A00 = new C17860sn(A01, A012, A013, A014);
                } else {
                    throw new C18140tF("Invalid viewBox. height cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    public static final void A0N(AbstractC11850iR abstractC11850iR, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18190tK.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                abstractC11850iR.A00 = A0F(trim);
            } else if (ordinal == 10) {
                abstractC11850iR.A01 = A0F(trim);
            } else if (ordinal == 82) {
                abstractC11850iR.A02 = A0F(trim);
            } else if (ordinal == 83) {
                abstractC11850iR.A03 = A0F(trim);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:1008:0x0a96, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1017:0x0b3c, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1038:0x0ca5, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1063:0x0ecc, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x026c, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:952:0x0587, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:974:0x0747, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09ee A[Catch: IOException -> 0x10a9, XmlPullParserException -> 0x10b2, all -> 0x10bb, TryCatch #7 {IOException -> 0x10a9, XmlPullParserException -> 0x10b2, blocks: (B:11:0x0043, B:27:0x0081, B:29:0x0089, B:31:0x008d, B:33:0x0091, B:34:0x009c, B:35:0x00a1, B:37:0x00a5, B:39:0x00a9, B:40:0x00b4, B:41:0x00b9, B:43:0x00bf, B:684:0x0f52, B:686:0x0f62, B:688:0x0f66, B:690:0x0f6a, B:691:0x0f71, B:693:0x0f7a, B:695:0x0f7e, B:697:0x0f82, B:698:0x0f89, B:699:0x0f8d, B:701:0x0f93, B:44:0x00c4, B:46:0x00ce, B:47:0x00e4, B:49:0x00f0, B:51:0x00f8, B:52:0x00fc, B:54:0x0104, B:57:0x010e, B:60:0x0115, B:62:0x011f, B:63:0x0121, B:64:0x0125, B:66:0x012a, B:68:0x012e, B:69:0x0157, B:70:0x0161, B:72:0x0167, B:74:0x016e, B:76:0x0172, B:82:0x017c, B:77:0x0173, B:79:0x0177, B:81:0x017b, B:83:0x0181, B:85:0x018b, B:86:0x01a1, B:88:0x01ad, B:89:0x01b5, B:91:0x01bf, B:94:0x01c7, B:97:0x01ce, B:99:0x01d8, B:100:0x01da, B:101:0x01f1, B:102:0x01f4, B:103:0x01fa, B:105:0x01fe, B:702:0x0f9c, B:703:0x0fa1, B:106:0x021b, B:108:0x021f, B:109:0x0236, B:111:0x023c, B:119:0x0269, B:120:0x026c, B:121:0x026f, B:122:0x0276, B:123:0x027d, B:125:0x0289, B:126:0x0290, B:127:0x0291, B:129:0x029b, B:131:0x02a5, B:114:0x0253, B:116:0x025f, B:117:0x0266, B:132:0x02a8, B:704:0x0fa2, B:705:0x0fa7, B:133:0x02b1, B:135:0x02b5, B:137:0x02b9, B:139:0x02dd, B:140:0x02e3, B:706:0x0fa8, B:707:0x0faf, B:708:0x0fb0, B:709:0x0fb5, B:141:0x02ed, B:143:0x02f1, B:145:0x02f5, B:146:0x0309, B:148:0x030f, B:150:0x0325, B:152:0x032f, B:154:0x0339, B:155:0x033b, B:156:0x033e, B:158:0x0349, B:159:0x034f, B:710:0x0fb6, B:711:0x0fbd, B:712:0x0fbe, B:713:0x0fc3, B:160:0x0359, B:162:0x035d, B:163:0x0371, B:165:0x0377, B:169:0x0391, B:175:0x03ae, B:170:0x0398, B:172:0x03a2, B:174:0x03ac, B:176:0x03b1, B:178:0x03be, B:179:0x03c4, B:714:0x0fc4, B:715:0x0fc9, B:180:0x03ce, B:182:0x03d2, B:716:0x0fca, B:717:0x0fcf, B:183:0x03f5, B:185:0x03f9, B:718:0x0fd0, B:719:0x0fd5, B:186:0x0419, B:188:0x041d, B:720:0x0fd6, B:721:0x0fdb, B:189:0x043d, B:192:0x0445, B:194:0x044b, B:198:0x0467, B:200:0x046f, B:202:0x0474, B:203:0x0486, B:205:0x048c, B:208:0x0496, B:209:0x049a, B:722:0x0fdc, B:723:0x0fe1, B:210:0x04a0, B:212:0x04a4, B:214:0x04a8, B:215:0x04ba, B:217:0x04c0, B:219:0x04d8, B:221:0x04de, B:223:0x04ed, B:224:0x04f0, B:226:0x04f8, B:233:0x0504, B:234:0x0508, B:725:0x0fe3, B:726:0x0fee, B:727:0x0fef, B:728:0x0ff6, B:235:0x050a, B:236:0x050d, B:729:0x0ff7, B:730:0x0ffe, B:731:0x0fff, B:732:0x1004, B:237:0x0516, B:239:0x051a, B:733:0x1005, B:734:0x100a, B:240:0x0534, B:242:0x0538, B:243:0x054f, B:245:0x0555, B:254:0x0584, B:255:0x0587, B:256:0x058a, B:257:0x0591, B:258:0x0598, B:260:0x05a4, B:261:0x05ab, B:262:0x05ac, B:264:0x05b8, B:265:0x05bf, B:266:0x05c0, B:268:0x05cc, B:269:0x05d3, B:248:0x056c, B:250:0x0578, B:251:0x057f, B:270:0x05d4, B:735:0x100b, B:736:0x1010, B:271:0x05db, B:273:0x05df, B:274:0x05f3, B:276:0x05f9, B:285:0x061d, B:287:0x0629, B:288:0x0630, B:293:0x064c, B:289:0x0631, B:290:0x0638, B:291:0x063f, B:292:0x0646, B:294:0x064f, B:737:0x1011, B:738:0x1016, B:295:0x0658, B:297:0x065c, B:739:0x1017, B:740:0x101c, B:298:0x067f, B:300:0x0683, B:741:0x101d, B:742:0x1022, B:301:0x06a6, B:303:0x06aa, B:304:0x06c2, B:306:0x06c8, B:310:0x06e2, B:334:0x0744, B:335:0x0747, B:336:0x074b, B:338:0x0757, B:339:0x075e, B:340:0x075f, B:341:0x0766, B:312:0x06e6, B:314:0x06ec, B:315:0x06f1, B:317:0x06f7, B:743:0x1023, B:744:0x102a, B:318:0x06fc, B:319:0x0703, B:321:0x0709, B:322:0x070e, B:324:0x0714, B:745:0x102b, B:746:0x1032, B:325:0x0719, B:327:0x0723, B:329:0x072d, B:330:0x0730, B:332:0x073c, B:333:0x0743, B:342:0x076d, B:747:0x1033, B:748:0x1038, B:343:0x0776, B:345:0x077a, B:346:0x0793, B:348:0x079b, B:352:0x07b9, B:354:0x07cb, B:355:0x07d2, B:461:0x0a1c, B:356:0x07d3, B:358:0x07e3, B:363:0x07fc, B:364:0x0805, B:366:0x080c, B:447:0x09e5, B:449:0x09ee, B:451:0x09f4, B:459:0x0a08, B:367:0x0813, B:369:0x081d, B:372:0x082a, B:373:0x082b, B:374:0x0830, B:376:0x0843, B:379:0x0850, B:380:0x0852, B:381:0x0856, B:383:0x0872, B:386:0x087f, B:387:0x0883, B:388:0x0894, B:390:0x08aa, B:393:0x08b8, B:394:0x08bc, B:396:0x08c2, B:398:0x08d0, B:401:0x08de, B:403:0x08e2, B:404:0x08e4, B:405:0x08ea, B:407:0x08f8, B:409:0x0904, B:410:0x0906, B:413:0x0914, B:415:0x091e, B:418:0x092c, B:419:0x092d, B:420:0x0931, B:422:0x0951, B:425:0x095f, B:426:0x0966, B:433:0x098e, B:437:0x09b2, B:445:0x09ca, B:446:0x09cc, B:460:0x0a12, B:436:0x09ab, B:365:0x0808, B:462:0x0a22, B:749:0x1039, B:750:0x103e, B:463:0x0a29, B:465:0x0a2d, B:466:0x0a42, B:468:0x0a48, B:485:0x0a93, B:486:0x0a96, B:487:0x0a99, B:489:0x0aa5, B:490:0x0aac, B:491:0x0aad, B:492:0x0ab4, B:493:0x0abb, B:495:0x0ac1, B:496:0x0ac6, B:498:0x0acc, B:753:0x1047, B:754:0x104e, B:473:0x0a65, B:475:0x0a6b, B:476:0x0a70, B:478:0x0a76, B:751:0x103f, B:752:0x1046, B:479:0x0a7b, B:481:0x0a87, B:482:0x0a8e, B:499:0x0ad1, B:755:0x104f, B:756:0x1054, B:500:0x0ada, B:502:0x0ade, B:503:0x0af6, B:505:0x0afc, B:516:0x0b39, B:517:0x0b3c, B:518:0x0b3f, B:520:0x0b4b, B:521:0x0b52, B:522:0x0b53, B:524:0x0b5b, B:525:0x0b5e, B:527:0x0b64, B:757:0x1055, B:758:0x105c, B:528:0x0b67, B:530:0x0b73, B:531:0x0b7a, B:532:0x0b7b, B:533:0x0b82, B:508:0x0b15, B:510:0x0b1d, B:511:0x0b26, B:534:0x0b89, B:759:0x105d, B:760:0x1062, B:535:0x0b92, B:537:0x0b96, B:538:0x0bab, B:540:0x0bb1, B:541:0x0bc5, B:547:0x0be4, B:543:0x0bc9, B:544:0x0bd0, B:545:0x0bd7, B:546:0x0bde, B:548:0x0be7, B:761:0x1063, B:762:0x1068, B:549:0x0bf0, B:551:0x0bf4, B:552:0x0c0c, B:554:0x0c12, B:555:0x0c26, B:561:0x0c45, B:557:0x0c2a, B:558:0x0c31, B:559:0x0c38, B:560:0x0c3f, B:562:0x0c48, B:763:0x1069, B:764:0x106e, B:563:0x0c4f, B:565:0x0c53, B:566:0x0c6b, B:568:0x0c71, B:578:0x0ca2, B:579:0x0ca5, B:580:0x0ca8, B:582:0x0cb4, B:583:0x0cbb, B:584:0x0cbc, B:585:0x0cc3, B:586:0x0cca, B:587:0x0cce, B:589:0x0cd8, B:591:0x0ce2, B:571:0x0c88, B:573:0x0c94, B:574:0x0c9b, B:592:0x0ce5, B:765:0x106f, B:766:0x1074, B:593:0x0cee, B:595:0x0cf2, B:596:0x0d0a, B:598:0x0d10, B:603:0x0d2c, B:605:0x0d38, B:606:0x0d3f, B:613:0x0d61, B:607:0x0d40, B:609:0x0d4c, B:610:0x0d53, B:611:0x0d54, B:612:0x0d5b, B:614:0x0d64, B:767:0x1075, B:768:0x107a, B:615:0x0d6b, B:616:0x0d71, B:618:0x0d75, B:769:0x107b, B:770:0x1080, B:619:0x0d92, B:621:0x0d96, B:622:0x0dae, B:624:0x0db4, B:626:0x0dcb, B:628:0x0dd3, B:629:0x0dd8, B:631:0x0dde, B:771:0x1081, B:772:0x1088, B:632:0x0de2, B:633:0x0de5, B:773:0x1089, B:774:0x108e, B:634:0x0dee, B:636:0x0df2, B:637:0x0e0a, B:639:0x0e10, B:644:0x0e2c, B:646:0x0e38, B:647:0x0e3f, B:650:0x0e4d, B:648:0x0e40, B:649:0x0e47, B:651:0x0e50, B:775:0x108f, B:776:0x1094, B:652:0x0e57, B:654:0x0e5b, B:777:0x1095, B:778:0x109a, B:655:0x0e7b, B:656:0x0e94, B:658:0x0e9a, B:667:0x0ec9, B:669:0x0ecf, B:670:0x0ed6, B:671:0x0edd, B:673:0x0ee9, B:674:0x0ef0, B:668:0x0ecc, B:661:0x0eb1, B:663:0x0ebd, B:664:0x0ec4, B:675:0x0ef1, B:677:0x0ef5, B:678:0x0ef9, B:679:0x0efc, B:692:0x0f74, B:680:0x0f00, B:682:0x0f38, B:683:0x0f4a), top: B:804:0x0043, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:992:0x0808 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C18090tA A0P(java.io.InputStream r35) {
        /*
            Method dump skipped, instructions count: 4614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18230tO.A0P(java.io.InputStream):X.0tA");
    }

    public final void A0Q(AbstractC38991pO abstractC38991pO, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = EnumC18190tK.A00(attributes.getLocalName(i)).ordinal();
            if (ordinal == 23) {
                abstractC38991pO.A00 = A05(trim);
            } else if (ordinal != 24) {
                if (ordinal != 26) {
                    if (ordinal == 60) {
                        try {
                            abstractC38991pO.A01 = EnumC17880sp.valueOf(trim);
                        } catch (IllegalArgumentException unused) {
                            throw new C18140tF(C000200d.A0I("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC38991pO.A03 = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                abstractC38991pO.A02 = Boolean.FALSE;
            } else if ("userSpaceOnUse".equals(trim)) {
                abstractC38991pO.A02 = Boolean.TRUE;
            } else {
                throw new C18140tF("Invalid value for attribute gradientUnits");
            }
        }
    }

    public final void A0R(InterfaceC17890sq interfaceC17890sq, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC18190tK.A00(attributes.getLocalName(i)) == EnumC18190tK.transform) {
                interfaceC17890sq.AU4(A05(attributes.getValue(i)));
            }
        }
    }

    public final void A0S(String str) {
        AbstractC25261Er abstractC25261Er = (AbstractC25261Er) this.A01;
        int size = abstractC25261Er.A01.size();
        C18050t6 c18050t6 = size == 0 ? null : (C18050t6) abstractC25261Er.A01.get(size - 1);
        if (c18050t6 instanceof C29271Wc) {
            C29271Wc c29271Wc = (C29271Wc) c18050t6;
            c29271Wc.A00 = C000200d.A0L(new StringBuilder(), c29271Wc.A00, str);
            return;
        }
        this.A01.A58(new C29271Wc(str));
    }
}
