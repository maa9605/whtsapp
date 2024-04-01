package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0DZ */
/* loaded from: classes.dex */
public class C0DZ {
    public static C0DZ A09;
    public static final String A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final Map A0E;
    public static final Map A0F;
    public static final Logger A0G = Logger.getLogger(C0DZ.class.getName());
    public static final Pattern A0H;
    public static final Pattern A0I;
    public static final Pattern A0J;
    public static final Pattern A0K;
    public static final Pattern A0L;
    public static final Pattern A0M;
    public static final Pattern A0N;
    public static final Pattern A0O;
    public static final Pattern A0P;
    public static final Pattern A0Q;
    public static final Pattern A0R;
    public static final Pattern A0S;
    public static final Pattern A0T;
    public AnonymousClass031 A01;
    public String A02 = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
    public Map A03 = null;
    public final Set A08 = new HashSet(320);
    public final Set A07 = new HashSet(35);
    public final Map A05 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Set A06 = new HashSet();
    public C10060fE A00 = new C10060fE(100);

    public static ArrayList A03(int i, HashMap hashMap, ArrayList arrayList, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(str);
        return arrayList2;
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('0', '0');
        hashMap.put('1', '1');
        hashMap.put('2', '2');
        hashMap.put('3', '3');
        hashMap.put('4', '4');
        hashMap.put('5', '5');
        hashMap.put('6', '6');
        hashMap.put('7', '7');
        hashMap.put('8', '8');
        hashMap.put('9', '9');
        HashMap hashMap2 = new HashMap(40);
        hashMap2.put('A', '2');
        hashMap2.put('B', '2');
        hashMap2.put('C', '2');
        hashMap2.put('D', '3');
        hashMap2.put('E', '3');
        hashMap2.put('F', '3');
        hashMap2.put('G', '4');
        hashMap2.put('H', '4');
        hashMap2.put('I', '4');
        hashMap2.put('J', '5');
        hashMap2.put('K', '5');
        hashMap2.put('L', '5');
        hashMap2.put('M', '6');
        hashMap2.put('N', '6');
        hashMap2.put('O', '6');
        hashMap2.put('P', '7');
        hashMap2.put('Q', '7');
        hashMap2.put('R', '7');
        hashMap2.put('S', '7');
        hashMap2.put('T', '8');
        hashMap2.put('U', '8');
        hashMap2.put('V', '8');
        hashMap2.put('W', '9');
        hashMap2.put('X', '9');
        hashMap2.put('Y', '9');
        hashMap2.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        A0E = unmodifiableMap;
        HashMap hashMap3 = new HashMap(100);
        hashMap3.putAll(unmodifiableMap);
        hashMap3.putAll(hashMap);
        A0F = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.putAll(hashMap);
        hashMap4.put('+', '+');
        hashMap4.put('*', '*');
        Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        for (Character ch : A0E.keySet()) {
            char charValue = ch.charValue();
            Character valueOf = Character.valueOf(Character.toLowerCase(charValue));
            Character valueOf2 = Character.valueOf(charValue);
            hashMap5.put(valueOf, valueOf2);
            hashMap5.put(valueOf2, valueOf2);
        }
        hashMap5.putAll(hashMap);
        hashMap5.put('-', '-');
        hashMap5.put((char) 65293, '-');
        hashMap5.put((char) 8208, '-');
        hashMap5.put((char) 8209, '-');
        hashMap5.put((char) 8210, '-');
        hashMap5.put((char) 8211, '-');
        hashMap5.put((char) 8212, '-');
        hashMap5.put((char) 8213, '-');
        hashMap5.put((char) 8722, '-');
        hashMap5.put('/', '/');
        hashMap5.put((char) 65295, '/');
        hashMap5.put(' ', ' ');
        hashMap5.put((char) 12288, ' ');
        hashMap5.put((char) 8288, ' ');
        hashMap5.put('.', '.');
        hashMap5.put((char) 65294, '.');
        Collections.unmodifiableMap(hashMap5);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(A0E.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(A0E.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        A0C = sb.toString();
        A0N = Pattern.compile("[+＋]+");
        A0P = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        A0H = Pattern.compile("(\\p{Nd})");
        A0T = Pattern.compile("[+＋\\p{Nd}]");
        A0O = Pattern.compile("[\\\\/] *x");
        A0Q = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        A0R = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        A0D = C000200d.A0M(C000200d.A0P("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*"), A0C, "\\p{Nd}", "]*");
        String A0N2 = C000200d.A0N(C000200d.A0X(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[", ",xｘ#＃~～", "]|int|anexo|ｉｎｔ)", "[:\\.．]?[  \\t,-]*", "(\\p{Nd}{1,7})"), "#?|", "[- ]+(", "\\p{Nd}", "{1,5})#");
        A0B = A0N2;
        A0A = C000200d.A0N(C000200d.A0X(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[", "xｘ#＃~～", "]|int|anexo|ｉｎｔ)", "[:\\.．]?[  \\t,-]*", "(\\p{Nd}{1,7})"), "#?|", "[- ]+(", "\\p{Nd}", "{1,5})#");
        StringBuilder A0P2 = C000200d.A0P("(?:");
        A0P2.append(A0N2);
        A0P2.append(")$");
        A0J = Pattern.compile(A0P2.toString(), 66);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A0D);
        sb2.append("(?:");
        sb2.append(A0B);
        sb2.append(")?");
        A0S = Pattern.compile(sb2.toString(), 66);
        A0M = Pattern.compile("(\\D+)");
        A0L = Pattern.compile("(\\$\\d)");
        Pattern.compile("\\$NP");
        Pattern.compile("\\$FG");
        A0I = Pattern.compile("\\$CC");
        A0K = Pattern.compile("\\(?\\$1\\)?");
    }

    public C0DZ(AnonymousClass031 anonymousClass031) {
        this.A01 = anonymousClass031;
    }

    public static synchronized C0DZ A00() {
        synchronized (C0DZ.class) {
            C0DZ c0dz = A09;
            if (c0dz == null) {
                HashMap hashMap = new HashMap(286);
                ArrayList arrayList = new ArrayList(25);
                arrayList.add("US");
                arrayList.add("AG");
                arrayList.add("AI");
                arrayList.add("AS");
                arrayList.add("BB");
                arrayList.add("BM");
                arrayList.add("BS");
                arrayList.add("CA");
                arrayList.add("DM");
                arrayList.add("DO");
                arrayList.add("GD");
                arrayList.add("GU");
                arrayList.add("JM");
                arrayList.add("KN");
                arrayList.add("KY");
                arrayList.add("LC");
                arrayList.add("MP");
                arrayList.add("MS");
                arrayList.add("PR");
                arrayList.add("SX");
                arrayList.add("TC");
                arrayList.add("TT");
                arrayList.add("VC");
                arrayList.add("VG");
                arrayList.add("VI");
                hashMap.put(1, arrayList);
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add("RU");
                arrayList2.add("KZ");
                hashMap.put(7, arrayList2);
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add("EG");
                hashMap.put(43, A03(41, hashMap, A03(40, hashMap, A03(39, hashMap, A03(36, hashMap, A03(34, hashMap, A03(33, hashMap, A03(32, hashMap, A03(31, hashMap, A03(30, hashMap, A03(27, hashMap, A03(20, hashMap, arrayList3, "ZA"), "GR"), "NL"), "BE"), "FR"), "ES"), "HU"), "IT"), "RO"), "CH"), "AT"));
                ArrayList arrayList4 = new ArrayList(4);
                arrayList4.add("GB");
                arrayList4.add("GG");
                arrayList4.add("IM");
                arrayList4.add("JE");
                hashMap.put(44, arrayList4);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add("DK");
                hashMap.put(46, A03(45, hashMap, arrayList5, "SE"));
                ArrayList arrayList6 = new ArrayList(2);
                arrayList6.add("NO");
                arrayList6.add("SJ");
                hashMap.put(60, A03(58, hashMap, A03(57, hashMap, A03(56, hashMap, A03(55, hashMap, A03(54, hashMap, A03(53, hashMap, A03(52, hashMap, A03(51, hashMap, A03(49, hashMap, A03(48, hashMap, A03(47, hashMap, arrayList6, "PL"), "DE"), "PE"), "MX"), "CU"), "AR"), "BR"), "CL"), "CO"), "VE"), "MY"));
                ArrayList arrayList7 = new ArrayList(3);
                arrayList7.add("AU");
                arrayList7.add("CC");
                arrayList7.add("CX");
                hashMap.put(61, arrayList7);
                ArrayList arrayList8 = new ArrayList(1);
                arrayList8.add("ID");
                hashMap.put(62, arrayList8);
                ArrayList arrayList9 = new ArrayList(1);
                arrayList9.add("PH");
                hashMap.put(63, arrayList9);
                ArrayList arrayList10 = new ArrayList(1);
                arrayList10.add("NZ");
                hashMap.put(64, arrayList10);
                ArrayList arrayList11 = new ArrayList(1);
                arrayList11.add("SG");
                hashMap.put(65, arrayList11);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add("TH");
                hashMap.put(66, arrayList12);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add("JP");
                hashMap.put(81, arrayList13);
                ArrayList arrayList14 = new ArrayList(1);
                arrayList14.add("KR");
                hashMap.put(82, arrayList14);
                ArrayList arrayList15 = new ArrayList(1);
                arrayList15.add("VN");
                hashMap.put(84, arrayList15);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add("CN");
                hashMap.put(86, arrayList16);
                ArrayList arrayList17 = new ArrayList(1);
                arrayList17.add("TR");
                hashMap.put(90, arrayList17);
                ArrayList arrayList18 = new ArrayList(1);
                arrayList18.add("IN");
                hashMap.put(91, arrayList18);
                ArrayList arrayList19 = new ArrayList(1);
                arrayList19.add("PK");
                hashMap.put(92, arrayList19);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add("AF");
                hashMap.put(93, arrayList20);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add("LK");
                hashMap.put(94, arrayList21);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add("MM");
                hashMap.put(95, arrayList22);
                ArrayList arrayList23 = new ArrayList(1);
                arrayList23.add("IR");
                hashMap.put(98, arrayList23);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add("SS");
                hashMap.put(211, arrayList24);
                ArrayList arrayList25 = new ArrayList(2);
                arrayList25.add("MA");
                arrayList25.add("EH");
                hashMap.put(212, arrayList25);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList26.add("DZ");
                hashMap.put(261, A03(260, hashMap, A03(258, hashMap, A03(257, hashMap, A03(256, hashMap, A03(255, hashMap, A03(254, hashMap, A03(253, hashMap, A03(252, hashMap, A03(251, hashMap, A03(250, hashMap, A03(249, hashMap, A03(248, hashMap, A03(247, hashMap, A03(246, hashMap, A03(245, hashMap, A03(244, hashMap, A03(243, hashMap, A03(242, hashMap, A03(241, hashMap, A03(240, hashMap, A03(239, hashMap, A03(238, hashMap, A03(237, hashMap, A03(236, hashMap, A03(235, hashMap, A03(234, hashMap, A03(233, hashMap, A03(232, hashMap, A03(231, hashMap, A03(230, hashMap, A03(229, hashMap, A03(228, hashMap, A03(227, hashMap, A03(226, hashMap, A03(225, hashMap, A03(224, hashMap, A03(223, hashMap, A03(222, hashMap, A03(221, hashMap, A03(220, hashMap, A03(218, hashMap, A03(216, hashMap, A03(213, hashMap, arrayList26, "TN"), "LY"), "GM"), "SN"), "MR"), "ML"), "GN"), "CI"), "BF"), "NE"), "TG"), "BJ"), "MU"), "LR"), "SL"), "GH"), "NG"), "TD"), "CF"), "CM"), "CV"), "ST"), "GQ"), "GA"), "CG"), "CD"), "AO"), "GW"), "IO"), "AC"), "SC"), "SD"), "RW"), "ET"), "SO"), "DJ"), "KE"), "TZ"), "UG"), "BI"), "MZ"), "ZM"), "MG"));
                ArrayList arrayList27 = new ArrayList(2);
                arrayList27.add("RE");
                arrayList27.add("YT");
                hashMap.put(357, A03(356, hashMap, A03(355, hashMap, A03(354, hashMap, A03(353, hashMap, A03(352, hashMap, A03(351, hashMap, A03(350, hashMap, A03(299, hashMap, A03(298, hashMap, A03(297, hashMap, A03(291, hashMap, A03(290, hashMap, A03(269, hashMap, A03(268, hashMap, A03(267, hashMap, A03(266, hashMap, A03(265, hashMap, A03(264, hashMap, A03(263, hashMap, A03(262, hashMap, arrayList27, "ZW"), "NA"), "MW"), "LS"), "BW"), "SZ"), "KM"), "SH"), "ER"), "AW"), "FO"), "GL"), "GI"), "PT"), "LU"), "IE"), "IS"), "AL"), "MT"), "CY"));
                ArrayList arrayList28 = new ArrayList(2);
                arrayList28.add("FI");
                arrayList28.add("AX");
                hashMap.put(509, A03(508, hashMap, A03(507, hashMap, A03(506, hashMap, A03(505, hashMap, A03(504, hashMap, A03(503, hashMap, A03(502, hashMap, A03(501, hashMap, A03(500, hashMap, A03(423, hashMap, A03(421, hashMap, A03(420, hashMap, A03(389, hashMap, A03(387, hashMap, A03(386, hashMap, A03(385, hashMap, A03(382, hashMap, A03(381, hashMap, A03(380, hashMap, A03(379, hashMap, A03(378, hashMap, A03(377, hashMap, A03(376, hashMap, A03(375, hashMap, A03(374, hashMap, A03(373, hashMap, A03(372, hashMap, A03(371, hashMap, A03(370, hashMap, A03(359, hashMap, A03(358, hashMap, arrayList28, "BG"), "LT"), "LV"), "EE"), "MD"), "AM"), "BY"), "AD"), "MC"), "SM"), "VA"), "UA"), "RS"), "ME"), "HR"), "SI"), "BA"), "MK"), "CZ"), "SK"), "LI"), "FK"), "BZ"), "GT"), "SV"), "HN"), "NI"), "CR"), "PA"), "PM"), "HT"));
                ArrayList arrayList29 = new ArrayList(3);
                arrayList29.add("GP");
                arrayList29.add("BL");
                arrayList29.add("MF");
                hashMap.put(590, arrayList29);
                ArrayList arrayList30 = new ArrayList(1);
                arrayList30.add("BO");
                hashMap.put(591, arrayList30);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add("GY");
                hashMap.put(592, arrayList31);
                ArrayList arrayList32 = new ArrayList(1);
                arrayList32.add("EC");
                hashMap.put(593, arrayList32);
                ArrayList arrayList33 = new ArrayList(1);
                arrayList33.add("GF");
                hashMap.put(594, arrayList33);
                ArrayList arrayList34 = new ArrayList(1);
                arrayList34.add("PY");
                hashMap.put(595, arrayList34);
                ArrayList arrayList35 = new ArrayList(1);
                arrayList35.add("MQ");
                hashMap.put(596, arrayList35);
                ArrayList arrayList36 = new ArrayList(1);
                arrayList36.add("SR");
                hashMap.put(597, arrayList36);
                ArrayList arrayList37 = new ArrayList(1);
                arrayList37.add("UY");
                hashMap.put(598, arrayList37);
                ArrayList arrayList38 = new ArrayList(2);
                arrayList38.add("CW");
                arrayList38.add("BQ");
                hashMap.put(599, arrayList38);
                ArrayList arrayList39 = new ArrayList(1);
                arrayList39.add("TL");
                hashMap.put(998, A03(996, hashMap, A03(995, hashMap, A03(994, hashMap, A03(993, hashMap, A03(992, hashMap, A03(979, hashMap, A03(977, hashMap, A03(976, hashMap, A03(975, hashMap, A03(974, hashMap, A03(973, hashMap, A03(972, hashMap, A03(971, hashMap, A03(970, hashMap, A03(968, hashMap, A03(967, hashMap, A03(966, hashMap, A03(965, hashMap, A03(964, hashMap, A03(963, hashMap, A03(962, hashMap, A03(961, hashMap, A03(960, hashMap, A03(888, hashMap, A03(886, hashMap, A03(883, hashMap, A03(882, hashMap, A03(881, hashMap, A03(880, hashMap, A03(878, hashMap, A03(870, hashMap, A03(856, hashMap, A03(855, hashMap, A03(853, hashMap, A03(852, hashMap, A03(850, hashMap, A03(808, hashMap, A03(800, hashMap, A03(692, hashMap, A03(691, hashMap, A03(690, hashMap, A03(689, hashMap, A03(688, hashMap, A03(687, hashMap, A03(686, hashMap, A03(685, hashMap, A03(683, hashMap, A03(682, hashMap, A03(681, hashMap, A03(680, hashMap, A03(679, hashMap, A03(678, hashMap, A03(677, hashMap, A03(676, hashMap, A03(675, hashMap, A03(674, hashMap, A03(673, hashMap, A03(672, hashMap, A03(670, hashMap, arrayList39, "NF"), "BN"), "NR"), "PG"), "TO"), "SB"), "VU"), "FJ"), "PW"), "WF"), "CK"), "NU"), "WS"), "KI"), "NC"), "TV"), "PF"), "TK"), "FM"), "MH"), "001"), "001"), "KP"), "HK"), "MO"), "KH"), "LA"), "001"), "001"), "BD"), "001"), "001"), "001"), "TW"), "001"), "MV"), "LB"), "JO"), "SY"), "IQ"), "KW"), "SA"), "YE"), "OM"), "PS"), "AE"), "IL"), "BH"), "QA"), "BT"), "MN"), "NP"), "001"), "TJ"), "TM"), "AZ"), "GE"), "KG"), "UZ"));
                if (A09 == null) {
                    C0DZ c0dz2 = new C0DZ(AnonymousClass031.A00());
                    A09 = c0dz2;
                    c0dz2.A03 = hashMap;
                    c0dz2.A02 = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
                    for (Map.Entry entry : hashMap.entrySet()) {
                        List list = (List) entry.getValue();
                        if (list.size() == 1 && "001".equals(list.get(0))) {
                            c0dz2.A06.add(entry.getKey());
                        } else {
                            c0dz2.A08.addAll(list);
                        }
                    }
                    if (c0dz2.A08.remove("001")) {
                        A0G.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
                    }
                    c0dz2.A07.addAll((Collection) c0dz2.A03.get(1));
                }
                return A09;
            }
            return c0dz;
        }
    }

    public static String A01(C10090fH c10090fH) {
        StringBuilder sb = new StringBuilder(c10090fH.italianLeadingZero_ ? "0" : "");
        sb.append(c10090fH.secondLeadingZero_ ? "0" : "");
        sb.append(c10090fH.nationalNumber_);
        return sb.toString();
    }

    public static StringBuilder A02(String str, boolean z) {
        char[] charArray;
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            int digit = Character.digit(c, 10);
            if (digit != -1) {
                sb.append(digit);
            } else if (z) {
                sb.append(c);
            }
        }
        return sb;
    }

    public static final void A04(int i, EnumC10160fO enumC10160fO, StringBuilder sb) {
        int ordinal = enumC10160fO.ordinal();
        if (ordinal == 0) {
            sb.insert(0, i);
            sb.insert(0, '+');
        } else if (ordinal == 1) {
            sb.insert(0, " ");
            sb.insert(0, i);
            sb.insert(0, '+');
        } else if (ordinal != 3) {
        } else {
            sb.insert(0, "-");
            sb.insert(0, i);
            sb.insert(0, '+');
            sb.insert(0, "tel:");
        }
    }

    public static void A05(StringBuilder sb) {
        String obj;
        String obj2 = sb.toString();
        if (A0R.matcher(obj2).matches()) {
            Map map = A0F;
            int length = obj2.length();
            StringBuilder sb2 = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                Object obj3 = map.get(Character.valueOf(Character.toUpperCase(obj2.charAt(i))));
                if (obj3 != null) {
                    sb2.append(obj3);
                }
            }
            obj = sb2.toString();
        } else {
            obj = A02(obj2, false).toString();
        }
        sb.replace(0, sb.length(), obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0101, code lost:
        if (r1 == X.EnumC24631Cg.TOO_LONG) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A06(java.lang.String r10, X.C10130fL r11, java.lang.StringBuilder r12, boolean r13, X.C10090fH r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DZ.A06(java.lang.String, X.0fL, java.lang.StringBuilder, boolean, X.0fH):int");
    }

    public int A07(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i = 1;
            while (i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (this.A03.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
                i++;
                if (i > 3) {
                    break;
                }
            }
        }
        return 0;
    }

    public EnumC24611Ce A08(C10090fH c10090fH, C10090fH c10090fH2) {
        EnumC24611Ce enumC24611Ce = EnumC24611Ce.SHORT_NSN_MATCH;
        EnumC24611Ce enumC24611Ce2 = EnumC24611Ce.NO_MATCH;
        C10090fH c10090fH3 = new C10090fH();
        c10090fH3.A00(c10090fH);
        C10090fH c10090fH4 = new C10090fH();
        c10090fH4.A00(c10090fH2);
        c10090fH3.hasRawInput = false;
        c10090fH3.rawInput_ = "";
        c10090fH3.hasCountryCodeSource = false;
        EnumC10100fI enumC10100fI = EnumC10100fI.FROM_NUMBER_WITH_PLUS_SIGN;
        c10090fH3.countryCodeSource_ = enumC10100fI;
        c10090fH3.hasPreferredDomesticCarrierCode = false;
        c10090fH3.preferredDomesticCarrierCode_ = "";
        c10090fH4.hasRawInput = false;
        c10090fH4.rawInput_ = "";
        c10090fH4.hasCountryCodeSource = false;
        c10090fH4.countryCodeSource_ = enumC10100fI;
        c10090fH4.hasPreferredDomesticCarrierCode = false;
        c10090fH4.preferredDomesticCarrierCode_ = "";
        if (c10090fH3.hasExtension && c10090fH3.extension_.length() == 0) {
            c10090fH3.hasExtension = false;
            c10090fH3.extension_ = "";
        }
        boolean z = c10090fH4.hasExtension;
        if (z && c10090fH4.extension_.length() == 0) {
            c10090fH4.hasExtension = false;
            z = false;
            c10090fH4.extension_ = "";
        }
        if (c10090fH3.hasExtension && z && !c10090fH3.extension_.equals(c10090fH4.extension_)) {
            return enumC24611Ce2;
        }
        int i = c10090fH3.countryCode_;
        int i2 = c10090fH4.countryCode_;
        if (i != 0 && i2 != 0) {
            if (c10090fH3.A01(c10090fH4)) {
                return EnumC24611Ce.EXACT_MATCH;
            }
            if (i == i2) {
                String valueOf = String.valueOf(c10090fH3.nationalNumber_);
                String valueOf2 = String.valueOf(c10090fH4.nationalNumber_);
                if (valueOf.endsWith(valueOf2) || valueOf2.endsWith(valueOf)) {
                    return enumC24611Ce;
                }
            }
            return enumC24611Ce2;
        }
        c10090fH3.hasCountryCode = true;
        c10090fH3.countryCode_ = i2;
        if (c10090fH3.A01(c10090fH4)) {
            return EnumC24611Ce.NSN_MATCH;
        }
        String valueOf3 = String.valueOf(c10090fH3.nationalNumber_);
        String valueOf4 = String.valueOf(c10090fH4.nationalNumber_);
        return (valueOf3.endsWith(valueOf4) || valueOf4.endsWith(valueOf3)) ? enumC24611Ce : enumC24611Ce2;
    }

    public EnumC24611Ce A09(C10090fH c10090fH, String str) {
        try {
            return A08(c10090fH, A0F(str, "ZZ"));
        } catch (C24581Cb e) {
            if (e.errorType == EnumC10110fJ.INVALID_COUNTRY_CODE) {
                String A0G2 = A0G(c10090fH.countryCode_);
                try {
                    if (!A0G2.equals("ZZ")) {
                        EnumC24611Ce A08 = A08(c10090fH, A0F(str, A0G2));
                        return A08 == EnumC24611Ce.EXACT_MATCH ? EnumC24611Ce.NSN_MATCH : A08;
                    }
                    C10090fH c10090fH2 = new C10090fH();
                    A0K(str, null, false, false, c10090fH2);
                    return A08(c10090fH, c10090fH2);
                } catch (C24581Cb unused) {
                    return EnumC24611Ce.NOT_A_NUMBER;
                }
            }
            return EnumC24611Ce.NOT_A_NUMBER;
        }
    }

    public final EnumC24621Cf A0A(String str, C10130fL c10130fL) {
        EnumC24621Cf enumC24621Cf = EnumC24621Cf.FIXED_LINE_OR_MOBILE;
        EnumC24621Cf enumC24621Cf2 = EnumC24621Cf.UNKNOWN;
        C10150fN c10150fN = c10130fL.generalDesc_;
        if (c10150fN.hasNationalNumberPattern && A0M(str, c10150fN)) {
            if (A0M(str, c10130fL.personalNumber_)) {
                return EnumC24621Cf.PERSONAL_NUMBER;
            }
            if (A0M(str, c10130fL.tollFree_)) {
                return EnumC24621Cf.TOLL_FREE;
            }
            if (A0M(str, c10130fL.sharedCost_)) {
                return EnumC24621Cf.SHARED_COST;
            }
            if (A0M(str, c10130fL.voip_)) {
                return EnumC24621Cf.VOIP;
            }
            if (A0M(str, c10130fL.premiumRate_)) {
                return EnumC24621Cf.PREMIUM_RATE;
            }
            if (A0M(str, c10130fL.pager_)) {
                return EnumC24621Cf.PAGER;
            }
            if (A0M(str, c10130fL.uan_)) {
                return EnumC24621Cf.UAN;
            }
            if (A0M(str, c10130fL.voicemail_)) {
                return EnumC24621Cf.VOICEMAIL;
            }
            if (A0M(str, c10130fL.fixedLine_)) {
                return (c10130fL.sameMobileAndFixedLinePattern_ || A0M(str, c10130fL.mobile_)) ? enumC24621Cf : EnumC24621Cf.FIXED_LINE;
            } else if (!c10130fL.sameMobileAndFixedLinePattern_ && A0M(str, c10130fL.mobile_)) {
                return EnumC24621Cf.MOBILE;
            }
        }
        return enumC24621Cf2;
    }

    public C10140fM A0B(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10140fM c10140fM = (C10140fM) it.next();
            int size = c10140fM.leadingDigitsPattern_.size();
            if (size != 0) {
                if (!this.A00.A00((String) c10140fM.leadingDigitsPattern_.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.A00.A00(c10140fM.pattern_).matcher(str).matches()) {
                return c10140fM;
            }
        }
        return null;
    }

    public C10130fL A0C(int i) {
        Map map = this.A04;
        synchronized (map) {
            Map map2 = this.A03;
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                if (!map.containsKey(valueOf)) {
                    A0J("001", i);
                }
                return (C10130fL) map.get(valueOf);
            }
            return null;
        }
    }

    public final C10130fL A0D(int i, String str) {
        return "001".equals(str) ? A0C(i) : A0E(str);
    }

    public C10130fL A0E(String str) {
        if (str != null && this.A08.contains(str)) {
            Map map = this.A05;
            synchronized (map) {
                if (!map.containsKey(str)) {
                    A0J(str, 0);
                }
            }
            return (C10130fL) map.get(str);
        }
        return null;
    }

    public C10090fH A0F(String str, String str2) {
        C10090fH c10090fH = new C10090fH();
        A0K(str, str2, false, true, c10090fH);
        return c10090fH;
    }

    public String A0G(int i) {
        List list = (List) this.A03.get(Integer.valueOf(i));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public String A0H(C10090fH c10090fH, EnumC10160fO enumC10160fO) {
        List list;
        if (c10090fH.nationalNumber_ == 0 && c10090fH.hasRawInput) {
            String str = c10090fH.rawInput_;
            if (str.length() > 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        EnumC10160fO enumC10160fO2 = EnumC10160fO.E164;
        sb.setLength(0);
        int i = c10090fH.countryCode_;
        String A01 = A01(c10090fH);
        if (enumC10160fO == enumC10160fO2) {
            sb.append(A01);
            A04(i, enumC10160fO2, sb);
        } else if (!this.A03.containsKey(Integer.valueOf(i))) {
            sb.append(A01);
        } else {
            C10130fL A0D2 = A0D(i, A0G(i));
            if (A0D2 != null) {
                if (A0D2.intlNumberFormat_.size() != 0 && enumC10160fO != EnumC10160fO.NATIONAL) {
                    list = A0D2.intlNumberFormat_;
                } else {
                    list = A0D2.numberFormat_;
                }
                C10140fM A0B2 = A0B(list, A01);
                if (A0B2 != null) {
                    A01 = A0I(A01, A0B2, enumC10160fO);
                }
                sb.append(A01);
                if (c10090fH.hasExtension) {
                    String str2 = c10090fH.extension_;
                    if (str2.length() > 0) {
                        if (enumC10160fO == EnumC10160fO.RFC3966) {
                            sb.append(";ext=");
                            sb.append(str2);
                        } else if (A0D2.hasPreferredExtnPrefix) {
                            sb.append(A0D2.preferredExtnPrefix_);
                            sb.append(str2);
                        } else {
                            sb.append(" ext. ");
                            sb.append(str2);
                        }
                    }
                }
                A04(i, enumC10160fO, sb);
            } else {
                throw null;
            }
        }
        return sb.toString();
    }

    public final String A0I(String str, C10140fM c10140fM, EnumC10160fO enumC10160fO) {
        String replaceAll;
        EnumC10160fO enumC10160fO2 = EnumC10160fO.NATIONAL;
        String str2 = c10140fM.format_;
        Matcher matcher = this.A00.A00(c10140fM.pattern_).matcher(str);
        String str3 = c10140fM.nationalPrefixFormattingRule_;
        if (enumC10160fO == enumC10160fO2 && str3 != null && str3.length() > 0) {
            replaceAll = matcher.replaceAll(A0L.matcher(str2).replaceFirst(str3));
        } else {
            replaceAll = matcher.replaceAll(str2);
        }
        if (enumC10160fO == EnumC10160fO.RFC3966) {
            Matcher matcher2 = A0P.matcher(replaceAll);
            if (matcher2.lookingAt()) {
                replaceAll = matcher2.replaceFirst("");
            }
            return matcher2.reset(replaceAll).replaceAll("-");
        }
        return replaceAll;
    }

    public void A0J(String str, int i) {
        boolean equals = "001".equals(str);
        C10120fK A01 = this.A01.A01(str);
        if (A01 != null) {
            C10130fL c10130fL = new C10130fL();
            String str2 = A01.A02;
            c10130fL.hasId = true;
            c10130fL.id_ = str2;
            int i2 = A01.A00;
            c10130fL.hasCountryCode = true;
            c10130fL.countryCode_ = i2;
            String str3 = A01.A01;
            c10130fL.hasInternationalPrefix = true;
            c10130fL.internationalPrefix_ = str3;
            LinkedList linkedList = new LinkedList();
            String[] strArr = A01.A0A;
            if (strArr != null) {
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    C10140fM c10140fM = new C10140fM();
                    String str4 = strArr[i3];
                    c10140fM.hasPattern = true;
                    c10140fM.pattern_ = str4;
                    String str5 = A01.A08[i3];
                    c10140fM.hasFormat = true;
                    c10140fM.format_ = str5;
                    String[] strArr2 = A01.A09;
                    if (strArr2 != null && i3 < strArr2.length && strArr2[i3] != null && !strArr2[i3].equals("N/A")) {
                        String[] split = TextUtils.split(strArr2[i3], "#");
                        for (String str6 : split) {
                            if (str6 != null) {
                                c10140fM.leadingDigitsPattern_.add(str6);
                            } else {
                                throw null;
                            }
                        }
                        continue;
                    }
                    c10130fL.intlNumberFormat_.add(c10140fM);
                    c10130fL.numberFormat_.add(c10140fM);
                    StringBuilder sb = new StringBuilder("(");
                    sb.append(c10140fM.pattern_);
                    sb.append(")");
                    linkedList.add(sb.toString());
                }
            }
            C10150fN c10150fN = new C10150fN();
            String join = TextUtils.join("|", linkedList);
            c10150fN.hasNationalNumberPattern = true;
            c10150fN.nationalNumberPattern_ = join;
            c10150fN.hasPossibleNumberPattern = true;
            c10150fN.possibleNumberPattern_ = join;
            c10130fL.hasGeneralDesc = true;
            c10130fL.generalDesc_ = c10150fN;
            c10130fL.hasPersonalNumber = true;
            c10130fL.personalNumber_ = c10150fN;
            if (equals) {
                this.A04.put(Integer.valueOf(i), c10130fL);
                return;
            } else {
                this.A05.put(str, c10130fL);
                return;
            }
        }
        throw new RuntimeException(C000200d.A0H("empty metadata: ", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, X.C10090fH r25) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DZ.A0K(java.lang.String, java.lang.String, boolean, boolean, X.0fH):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x004e, code lost:
        if (r1 != r0.countryCode_) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0L(X.C10090fH r10) {
        /*
            r9 = this;
            X.1Cf r7 = X.EnumC24621Cf.UNKNOWN
            int r8 = r10.countryCode_
            java.util.Map r1 = r9.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r1.get(r0)
            java.util.List r2 = (java.util.List) r2
            r5 = 0
            r6 = 0
            r1 = 1
            if (r2 != 0) goto L6f
            java.lang.String r4 = A01(r10)
            java.util.logging.Logger r3 = X.C0DZ.A0G
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = "Missing/invalid country_code ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = ") for number "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3.log(r2, r0)
        L36:
            int r1 = r10.countryCode_
            X.0fL r2 = r9.A0D(r1, r5)
            if (r2 == 0) goto L50
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L51
            X.0fL r0 = r9.A0E(r5)
            if (r0 == 0) goto Lb5
            int r0 = r0.countryCode_
            if (r1 == r0) goto L51
        L50:
            return r6
        L51:
            X.0fN r0 = r2.generalDesc_
            java.lang.String r1 = A01(r10)
            boolean r0 = r0.hasNationalNumberPattern
            if (r0 != 0) goto L68
            int r1 = r1.length()
            r0 = 2
            if (r1 <= r0) goto L50
            r0 = 16
            if (r1 > r0) goto L50
        L66:
            r6 = 1
            return r6
        L68:
            X.1Cf r0 = r9.A0A(r1, r2)
            if (r0 == r7) goto L50
            goto L66
        L6f:
            int r0 = r2.size()
            if (r0 != r1) goto L7c
            java.lang.Object r5 = r2.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            goto L36
        L7c:
            java.lang.String r4 = A01(r10)
            java.util.Iterator r8 = r2.iterator()
        L84:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            X.0fL r2 = r9.A0E(r3)
            if (r2 == 0) goto Lc1
            boolean r0 = r2.hasLeadingDigits
            if (r0 == 0) goto Lae
            X.0fE r1 = r9.A00
            java.lang.String r0 = r2.leadingDigits_
            java.util.regex.Pattern r0 = r1.A00(r0)
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.lookingAt()
            if (r0 == 0) goto L84
        Lac:
            r5 = r3
            goto L36
        Lae:
            X.1Cf r0 = r9.A0A(r4, r2)
            if (r0 == r7) goto L84
            goto Lac
        Lb5:
            java.lang.String r0 = "Invalid region code: "
            java.lang.String r1 = X.C000200d.A0H(r0, r5)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Lc1:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DZ.A0L(X.0fH):boolean");
    }

    public final boolean A0M(String str, C10150fN c10150fN) {
        return this.A00.A00(c10150fN.possibleNumberPattern_).matcher(str).matches() && this.A00.A00(c10150fN.nationalNumberPattern_).matcher(str).matches();
    }

    public boolean A0N(StringBuilder sb, C10130fL c10130fL, StringBuilder sb2) {
        int length = sb.length();
        String str = c10130fL.nationalPrefixForParsing_;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.A00.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A00 = this.A00.A00(c10130fL.generalDesc_.nationalNumberPattern_);
                boolean matches = A00.matcher(sb).matches();
                int groupCount = matcher.groupCount();
                String str2 = c10130fL.nationalPrefixTransformRule_;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!matches || A00.matcher(sb3.toString()).matches()) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                    return false;
                } else if (!matches || A00.matcher(sb.substring(matcher.end())).matches()) {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
