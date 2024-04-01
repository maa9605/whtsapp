package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.2tG */
/* loaded from: classes2.dex */
public class C59752tG {
    public static Pattern A00;
    public static final SparseArray A01;
    public static final C59732tE A02;
    public static final HashSet A03;
    public static final HashSet A04;
    public static final HashSet A05;

    static {
        C59732tE c59732tE = new C59732tE();
        A02 = c59732tE;
        c59732tE.A00("fub", "CM", "TD", "NG");
        C59732tE c59732tE2 = A02;
        c59732tE2.A00("af", "NA", "ZA");
        c59732tE2.A00("agq", "CM");
        c59732tE2.A00("yay", "NG");
        c59732tE2.A00("bss", "CM");
        c59732tE2.A00("agg", "PG");
        c59732tE2.A00("ast", "ES");
        c59732tE2.A00("avu", "CD", "SS");
        c59732tE2.A00("az", "AZ");
        c59732tE2.A00("bkc", "CM", "GA");
        c59732tE2.A00("ksf", "CM");
        c59732tE2.A00("bfd", "CM");
        c59732tE2.A00("bjt", "SN");
        c59732tE2.A00("bcn", "NG");
        c59732tE2.A00("bas", "CM");
        c59732tE2.A00("bsq", "LR");
        c59732tE2.A00("bkv", "NG");
        c59732tE2.A00("bom", "NG");
        c59732tE2.A00("btt", "NG");
        c59732tE2.A00("bin", "NG");
        c59732tE2.A00("bmq", "BF", "ML");
        c59732tE2.A00("bs", "BA", "HR", "XK", "ME", "RS");
        c59732tE2.A00("fue", "BJ", "TG");
        c59732tE2.A00("br", "FR");
        c59732tE2.A00("bys", "NG");
        c59732tE2.A00("bwr", "NG");
        c59732tE2.A00("cky", "NG");
        c59732tE2.A00("ca", "AD", "FR", "IT", "ES");
        c59732tE2.A00("tzm", "MA");
        c59732tE2.A00("fuq", "NG");
        c59732tE2.A00("ckl", "NG");
        c59732tE2.A00("asg", "NG");
        c59732tE2.A00("co", "FR", "IT");
        c59732tE2.A00("crh", "RU");
        c59732tE2.A00("hr", "BA", "HR", "XK", "ME", "RS");
        c59732tE2.A00("mfn", "NG");
        c59732tE2.A00("cs", "CZ", "SK");
        c59732tE2.A00("dbq", "CM", "NG");
        c59732tE2.A00("dnj", "CI", "LR");
        c59732tE2.A00("dzg", "TD", "NE");
        c59732tE2.A00("ddn", "BJ");
        c59732tE2.A00("dgh", "NG");
        c59732tE2.A00("dow", "CM");
        c59732tE2.A00("dua", "CM");
        c59732tE2.A00("nl", "AW", "BE", "CW", "NL", "SX", "SR");
        c59732tE2.A00("igb", "NG");
        c59732tE2.A00("etr", "PG");
        c59732tE2.A00("enn", "NG");
        c59732tE2.A00("kjy", "PG");
        c59732tE2.A00("et", "EE");
        c59732tE2.A00("ich", "NG");
        c59732tE2.A00("ee", "BJ", "GH", "TG");
        c59732tE2.A00("ewo", "CM");
        c59732tE2.A00("fo", "FO");
        c59732tE2.A00("fmp", "CM");
        c59732tE2.A00("fi", "FI", "SE");
        c59732tE2.A00("fr", "BE", "BJ", "BF", "BI", "CM", "CA", "CF", "CG", "CD", "TD", "KM", "DJ", "GQ", "FR", "GA", "HT", "CI", "LU", "MG", "ML", "MC", "NE", "RW", "SN", "SC", "CH", "TG", "VU");
        c59732tE2.A00("fur", "IT");
        c59732tE2.A00("ff", "CM", "GN", "MR", "SN");
        c59732tE2.A00("gaj", "PG");
        c59732tE2.A00("gl", "ES");
        c59732tE2.A00("gby", "NG");
        c59732tE2.A00("gba", "CF");
        c59732tE2.A00("gmm", "CM");
        c59732tE2.A00("de", "AT", "BE", "DE", "LI", "LU", "CH");
        c59732tE2.A00("tof", "PG");
        c59732tE2.A00("god", "CI");
        c59732tE2.A00("ank", "NG");
        c59732tE2.A00("gkn", "NG");
        c59732tE2.A00("gux", "BJ", "BF", "NE", "TG");
        c59732tE2.A00("gde", "CM", "NG");
        c59732tE2.A00("gkp", "GN");
        c59732tE2.A00("kl", "GL");
        c59732tE2.A00("jgk", "NG");
        c59732tE2.A00("ha", "BJ", "CM", "TD", "GH", "CI", "NE", "NG", "SD", "TG");
        c59732tE2.A00("haw", "US");
        c59732tE2.A00("hbb", "NG");
        c59732tE2.A00("hu", "HU");
        c59732tE2.A00("dud", "NG");
        c59732tE2.A00("jab", "NG");
        c59732tE2.A00("iby", "NG");
        c59732tE2.A00("is", "IS");
        c59732tE2.A00("idu", "NG");
        c59732tE2.A00("ig", "GQ");
        c59732tE2.A00("ige", "NG");
        c59732tE2.A00("ikx", "UG");
        c59732tE2.A00("ikk", "NG");
        c59732tE2.A00("ikw", "NG");
        c59732tE2.A00("smn", "FI");
        c59732tE2.A00("ga", "IE", "GB");
        c59732tE2.A00("atg", "NG");
        c59732tE2.A00("izi", "NG");
        c59732tE2.A00("dyo", "GM", "SN");
        c59732tE2.A00("jbu", "CM", "NG");
        c59732tE2.A00("kab", "DZ");
        c59732tE2.A00("kea", "CV");
        c59732tE2.A00("tbd", "PG");
        c59732tE2.A00("hig", "NG");
        c59732tE2.A00("kai", "NG");
        c59732tE2.A00("kkj", "CM", "CF", "CG");
        c59732tE2.A00("kzr", "CM", "TD");
        c59732tE2.A00("naq", "NA");
        c59732tE2.A00("geb", "PG");
        c59732tE2.A00("okr", "NG");
        c59732tE2.A00("ksh", "DE");
        c59732tE2.A00("ses", "ML");
        c59732tE2.A00("khq", "ML");
        c59732tE2.A00("kun", "ER", "ET");
        c59732tE2.A00("kup", "PG");
        c59732tE2.A00("kub", "CM", "NG");
        c59732tE2.A00("kpe", "GN", "LR");
        c59732tE2.A00("nmg", "CM", "GQ");
        c59732tE2.A00("ku", "SY", "TR");
        c59732tE2.A00("lkt", "US");
        c59732tE2.A00("hia", "NG");
        c59732tE2.A00("lag", "TZ");
        c59732tE2.A00("lv", "LV");
        c59732tE2.A00("lmp", "CM");
        c59732tE2.A00("ln", "CG", "CD");
        c59732tE2.A00("liv", new String[0]);
        c59732tE2.A00("lt", "LT");
        c59732tE2.A00("yaz", "NG");
        c59732tE2.A00("nds", "BR", "DE", "NL");
        c59732tE2.A00("dsb", "DE");
        c59732tE2.A00("lu", "CD");
        c59732tE2.A00("lb", "BE", "FR", "DE", "LU");
        c59732tE2.A00("mda", "NG");
        c59732tE2.A00("mg", "MG");
        c59732tE2.A00("mt", "MT");
        c59732tE2.A00("mi", "NZ");
        c59732tE2.A00("arn", "CL");
        c59732tE2.A00("mas", "KE", "TZ");
        c59732tE2.A00("bin", "ML");
        c59732tE2.A00("mql", "BJ", "TG");
        c59732tE2.A00("mbo", "CM");
        c59732tE2.A00("mbu", "NG");
        c59732tE2.A00("mif", "CM");
        c59732tE2.A00("mzm", "NG");
        c59732tE2.A00("mua", "CM", "TD");
        c59732tE2.A00("sur", "NG");
        c59732tE2.A00("nv", "US");
        c59732tE2.A00("anc", "NG");
        c59732tE2.A00("nnh", "CM");
        c59732tE2.A00("jgo", "CM");
        c59732tE2.A00("fuv", "CM", "NG");
        c59732tE2.A00("nin", "NG");
        c59732tE2.A00("dgi", "BF");
        c59732tE2.A00("se", "FI", "SE", "NO");
        c59732tE2.A00("nso", "ZA");
        c59732tE2.A00("ann", "NG");
        c59732tE2.A00("oc", "FR", "IT", "MC", "ES");
        c59732tE2.A00("pbi", "CM");
        c59732tE2.A00("pip", "NG");
        c59732tE2.A00("pl", "PL");
        c59732tE2.A00("pt", "AO", "BR", "CV", "GQ", "GW", "MO", "MZ", "PT", "ST", "TL");
        c59732tE2.A00("prg", new String[0]);
        c59732tE2.A00("fuf", "GN", "ML", "SN", "SL");
        c59732tE2.A00("qu", "AR", "BO", "CO", "EC", "PE");
        c59732tE2.A00("ro", "MD", "RO");
        c59732tE2.A00("cla", "NG");
        c59732tE2.A00("sav", "SN");
        c59732tE2.A00("sg", "CF", "TD", "CD");
        c59732tE2.A00("gd", "GB");
        c59732tE2.A00("seh", "MZ");
        c59732tE2.A00("sr", "BA", "HR", "XK", "ME", "RS");
        c59732tE2.A00("sh", "BA", "HR", "XK", "ME", "RS");
        c59732tE2.A00("srr", "GM", "SN");
        c59732tE2.A00("scn", "IT");
        c59732tE2.A00("sld", "BF");
        c59732tE2.A00("sms", "FI");
        c59732tE2.A00("sk", "CZ", "SK");
        c59732tE2.A00("sl", "SI");
        c59732tE2.A00("sok", "TD");
        c59732tE2.A00("es", "AR", "BZ", "BO", "IC", "EA", "CL", "CO", "CR", "CU", "DO", "EC", "SV", "GQ", "GT", "HN", "MX", "NI", "PA", "PY", "PE", "PR", "ES", "US", "UY", "VE");
        c59732tE2.A00("srn", "SR");
        c59732tE2.A00("gsw", "AT", "FR", "DE", "LI", "CH");
        c59732tE2.A00("shi", "MA");
        c59732tE2.A00("tal", "NG");
        c59732tE2.A00("tmh", "ML");
        c59732tE2.A00("taq", "BF", "ML");
        c59732tE2.A00("tan", "NG");
        c59732tE2.A00("twq", "NE");
        c59732tE2.A00("blt", "LA", "VN");
        c59732tE2.A00("yer", "NG");
        c59732tE2.A00("tuq", "TD", "LY", "NE", "NG");
        c59732tE2.A00("ttr", "NG");
        c59732tE2.A00("tik", "CM");
        c59732tE2.A00("to", "TO");
        c59732tE2.A00("dts", "ML");
        c59732tE2.A00("kdl", "NG");
        c59732tE2.A00("tsw", "NG");
        c59732tE2.A00("tr", "TR");
        c59732tE2.A00("tk", "TM");
        c59732tE2.A00("hsb", "DE");
        c59732tE2.A00("vai", "LR", "SL");
        c59732tE2.A00("vi", "KH", "VN");
        c59732tE2.A00("vo", new String[0]);
        c59732tE2.A00("vut", "CM", "NG");
        c59732tE2.A00("wja", "NG");
        c59732tE2.A00("wa", "BE");
        c59732tE2.A00("wae", "AT", "IT", "LI", "CH");
        c59732tE2.A00("wji", "NG");
        c59732tE2.A00("cy", "GB");
        c59732tE2.A00("fy", "NL");
        c59732tE2.A00("fuh", "BJ", "BF", "NE");
        c59732tE2.A00("yba", "NG");
        c59732tE2.A00("yav", "CM");
        c59732tE2.A00("yle", "PG");
        c59732tE2.A00("yll", "PG");
        c59732tE2.A00("yo", "BJ", "NG");
        c59732tE2.A00("dje", "NE");
        c59732tE2.A00("gnd", "CM");
        SparseArray sparseArray = new SparseArray();
        A01 = sparseArray;
        sparseArray.append(237, new C59742tF("ast", "ksf", "bas", "ca", "cs", "dua", "nl", "ee", "ewo", "fo", "fr", "gl", "kl", "hu", "is", "ga", "dyo", "kea", "kkj", "nmg", "lkt", "lag", "ln", "lu", "mas", "nnh", "jgo", "pt", "qu", "seh", "sk", "es", "to", "vai", "vi", "wae", "cy", "fy", "yav", "yo"));
        SparseArray sparseArray2 = A01;
        sparseArray2.append(238, new C59742tF("af", "agq", "bss", "bfd", "bas", "bkv", "btt", "nl", "igb", "ewo", "fr", "fur", "gaj", "gby", "kl", "jab", "atg", "jbu", "kkj", "naq", "ksh", "ku", "nmg", "lmp", "ln", "mda", "mg", "mas", "mzm", "jgo", "nin", "ann", "ro", "sg", "scn", "srn", "yer", "tr", "wa", "cy", "yav", "yle"));
        sparseArray2.append(252, new C59742tF("agg", "ast", "az", "br", "ca", "co", "cs", "nl", "etr", "et", "fr", "gl", "de", "tof", "god", "hu", "tbd", "geb", "ksh", "kup", "nds", "lb", "arn", "oc", "sg", "sk", "es", "gsw", "dts", "tr", "tk", "vo", "wa", "wae", "fy", "yll"));
        sparseArray2.append(267, new C59742tF("mt"));
        sparseArray2.append(299, new C59742tF("agq", "bss", "bfd", "bas", "bkv", "btt", "ddn", "igb", "kjy", "ich", "gux", "haw", "jab", "iby", "idu", "jbu", "kub", "nmg", "lv", "mda", "mi", "mas", "mql", "nin", "prg", "gd", "to", "yba", "yav"));
        sparseArray2.append(305, new C59742tF("az", "crh", "tr"));
        sparseArray2.append(316, new C59742tF("lv"));
        sparseArray2.append(322, new C59742tF("dsb", "nv", "pl", "hsb"));
        sparseArray2.append(353, new C59742tF("bs", "hr", "cs", "dzg", "et", "fi", "smn", "geb", "khq", "ses", "kun", "lkt", "lv", "lt", "dsb", "se", "nso", "prg", "sr", "sh", "sms", "sk", "sl", "taq", "twq", "tuq", "hsb", "wae", "dje"));
        sparseArray2.append(409, new C59742tF("ckl", "ank", "ha", "ikx", "kai", "hia", "mbu", "anc", "nin", "pip", "tal", "tan", "wja", "wji"));
        sparseArray2.append(448, new C59742tF("naq"));
        sparseArray2.append(449, new C59742tF("naq"));
        sparseArray2.append(559, new C59742tF("liv"));
        sparseArray2.append(593, new C59742tF("fmp", "dud", "tmh"));
        sparseArray2.append(595, new C59742tF("fub", "yay", "bkc", "bjt", "bcn", "bas", "bsq", "bmq", "fue", "bys", "bwr", "cky", "fuq", "ckl", "asg", "dbq", "dnj", "dgh", "dow", "dua", "enn", "ff", "gby", "gba", "gmm", "ank", "gde", "gkp", "jgk", "ha", "hbb", "ikx", "kkj", "hig", "kzr", "kai", "kpe", "nmg", "hia", "bin", "mbo", "mbu", "mif", "mzm", "mua", "sur", "anc", "fuv", "nin", "dgi", "pbi", "pip", "fuf", "cla", "sav", "srr", "sld", "sok", "tal", "tan", "yer", "ttr", "tik", "kdl", "tsw", "vai", "vut", "wja", "wji", "fuh", "gnd"));
        sparseArray2.append(7693, new C59742tF("tzm", "kab", "okr", "shi", "tmh", "taq"));
        sparseArray2.append(7771, new C59742tF("tzm", "kab", "shi"));
        sparseArray2.append(7789, new C59742tF("tzm", "kab", "shi", "tmh", "taq"));
        sparseArray2.append(7817, new C59742tF(new String[0]));
        sparseArray2.append(7841, new C59742tF("izi", "yaz", "blt", "vi"));
        sparseArray2.append(7865, new C59742tF("yay", "bom", "bin", "mfn", "dzg", "igb", "enn", "gkn", "iby", "ikk", "ikw", "izi", "okr", "yaz", "blt", "tan", "tuq", "vi", "yo"));
        sparseArray2.append(7883, new C59742tF("avu", "mfn", "igb", "enn", "iby", "ig", "ige", "ikk", "ikw", "izi", "okr", "blt", "tan", "vi"));
        A05 = new HashSet(Arrays.asList("abq", "ab", "ady", "av", "az", "ba", "be", "bs", "bg", "bua", "ce", "ckt", "cu", "cv", "crh", "dar", "dng", "myv", "evn", "gag", "inh", "kbd", "xal", "krc", "kaa", "kk", "kjh", "kca", "ky", "kv", "koi", "kpy", "kum", "lbe", "lez", "mk", "mns", "chm", "mdf", "mn", "ttt", "gld", "yrk", "nog", "os", "ru", "rue", "sr", "sh", "cjs", "alt", "tab", "tg", "tt", "tkr", "tk", "tyv", "ude", "udm", "uk", "uz", "mrj", "sah"));
        A04 = new HashSet(Arrays.asList("AM", "AZ", "BY", "BA", "BG", "GE", "KZ", "XK", "KG", "MK", "MD", "MN", "ME", "RU", "RS", "TJ", "TM", "UA", "UZ"));
        A03 = new HashSet(Arrays.asList(1072, 1074, 1075, 1077, 1082, 1084, 1085, 1086, 1088, 1089, 1090, 1091, 1093, 1096, 1097, 1100, 1109, 1110, 1112, 1121, 1141, 1199, 1211, 1231, 1281, 1307, 1309, 1319, 42649));
        A00 = Pattern.compile("^[a-z0-9\\-]+$");
    }

    public static Set A00(String str, String str2, String str3, Collection collection) {
        String[] split = str.split("\\.");
        int length = split.length;
        int i = 0;
        String str4 = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                if (str4 != null && !z) {
                    int length2 = str4.length();
                    ArrayList arrayList = new ArrayList(2);
                    int i3 = 0;
                    while (i3 < length2) {
                        int codePointAt = str4.codePointAt(i3);
                        if (z2) {
                            z2 = true;
                            if (A03.contains(Integer.valueOf(codePointAt))) {
                                continue;
                                i3 += Character.charCount(codePointAt);
                            }
                        }
                        z2 = false;
                        if (A01.get(codePointAt) == null) {
                            continue;
                        } else if (arrayList.size() >= 2) {
                            return null;
                        } else {
                            arrayList.add(Integer.valueOf(codePointAt));
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                    if (z2) {
                        HashSet hashSet = A04;
                        if (hashSet.contains(str3) || hashSet.contains(str2)) {
                            return null;
                        }
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            if (A05.contains(((Locale) it.next()).getLanguage())) {
                                return null;
                            }
                        }
                        HashSet hashSet2 = new HashSet(length2);
                        while (i < length2) {
                            int codePointAt2 = str4.codePointAt(i);
                            hashSet2.add(Integer.valueOf(codePointAt2));
                            i += Character.charCount(codePointAt2);
                        }
                        return hashSet2;
                    } else if (arrayList.isEmpty()) {
                        return null;
                    } else {
                        AnonymousClass036 anonymousClass036 = new AnonymousClass036(arrayList.size());
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            int intValue = ((Number) it2.next()).intValue();
                            C59742tF c59742tF = (C59742tF) A01.get(intValue);
                            Collection collection2 = c59742tF.A01;
                            if (!collection2.contains(str3) && !collection2.contains(str2)) {
                                Iterator it3 = collection.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (c59742tF.A00.contains(((Locale) it3.next()).getLanguage())) {
                                            break;
                                        }
                                    } else {
                                        anonymousClass036.add(Integer.valueOf(intValue));
                                        break;
                                    }
                                }
                            }
                        }
                        if (!anonymousClass036.isEmpty()) {
                            return anonymousClass036;
                        }
                    }
                }
                return null;
            }
            String str5 = split[i2];
            boolean matches = true ^ A00.matcher(str5).matches();
            if (matches) {
                if (str4 != null) {
                    return null;
                }
                str4 = str5;
            }
            i2++;
            z = matches;
        }
    }
}
