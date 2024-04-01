package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.2Ae */
/* loaded from: classes2.dex */
public abstract class C2Ae {
    public static Map A00 = new HashMap();

    static {
        A02("bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt lo ms my nqo osa root sah ses sg su th to vi wo yo yue zh", new C2Ae() { // from class: X.2Qw
        });
        A02("am as bn fa gu hi kn zu", new C2Ae() { // from class: X.2Qx
        });
        A02("ff fr hy kab", new C2Ae() { // from class: X.2Qy
        });
        A01("pt", new C2Ae() { // from class: X.2Qz
        });
        A02("ast ca de en et fi fy gl ia io it ji nl pt_PT sc scn sv sw ur yi", new C2Ae() { // from class: X.2R0
        });
        A01("si", new C2Ae() { // from class: X.2R1
        });
        A02("ak bho guw ln mg nso pa ti wa", new C2Ae() { // from class: X.2R2
        });
        A01("tzm", new C2Ae() { // from class: X.2R3
        });
        A02("af an asa az bem bez bg brx ce cgg chr ckb dv ee el eo es eu fo fur gsw ha haw hu jgo jmc ka kaj kcg kk kkj kl ks ksb ku ky lb lg mas mgo ml mn mr nah nb nd ne nn nnh no nr ny nyn om or os pap ps rm rof rwk saq sd sdh seh sn so sq ss ssy st syr ta te teo tig tk tn tr ts ug uz ve vo vun wae xh xog", new C2Ae() { // from class: X.2R4
        });
        A01("da", new C2Ae() { // from class: X.2R5
        });
        A01("is", new C2Ae() { // from class: X.2R6
        });
        A01("mk", new C2Ae() { // from class: X.2R7
        });
        A02("ceb fil tl", new C2Ae() { // from class: X.2R8
        });
        A02("lv prg", new C2Ae() { // from class: X.2R9
        });
        A01("lag", new C2Ae() { // from class: X.2RA
        });
        A01("ksh", new C2Ae() { // from class: X.2RB
        });
        A02("iu naq se sma smi smj smn sms", new C2Ae() { // from class: X.2RC
        });
        A01("shi", new C2Ae() { // from class: X.2RD
        });
        A02("mo ro", new C2Ae() { // from class: X.2RE
        });
        A02("bs hr sh sr", new C2Ae() { // from class: X.2RF
        });
        A01("gd", new C2Ae() { // from class: X.2RG
        });
        A01("sl", new C2Ae() { // from class: X.2RH
        });
        A02("dsb hsb", new C2Ae() { // from class: X.2RI
        });
        A02("he iw", new C2Ae() { // from class: X.2RJ
        });
        A02("cs sk", new C2Ae() { // from class: X.2RK
        });
        A01("pl", new C2Ae() { // from class: X.2RL
        });
        A01("be", new C2Ae() { // from class: X.2RM
        });
        A01("lt", new C2Ae() { // from class: X.2RN
        });
        A01("mt", new C2Ae() { // from class: X.2RO
        });
        A02("ru uk", new C2Ae() { // from class: X.2RP
        });
        A01("br", new C2Ae() { // from class: X.2RQ
        });
        A01("ga", new C2Ae() { // from class: X.2RR
        });
        A01("gv", new C2Ae() { // from class: X.2RS
        });
        A01("kw", new C2Ae() { // from class: X.2RT
        });
        A02("ar ars", new C2Ae() { // from class: X.2RU
        });
        A01("cy", new C2Ae() { // from class: X.2RV
        });
    }

    public static C2Ae A00(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            Map map = A00;
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("_");
            sb.append(country);
            C2Ae c2Ae = (C2Ae) map.get(sb.toString());
            if (c2Ae != null) {
                return c2Ae;
            }
        }
        C2Ae c2Ae2 = (C2Ae) A00.get(language);
        if (c2Ae2 != null) {
            return c2Ae2;
        }
        C2Ae c2Ae3 = (C2Ae) A00.get("root");
        if (c2Ae3 != null) {
            return c2Ae3;
        }
        throw new NullPointerException("No plural rule found for 'root' locale.");
    }

    public static void A01(String str, C2Ae c2Ae) {
        A00.put(str, c2Ae);
        if (!"pt_PT".equals(str)) {
            return;
        }
        Iterator it = C47192Ag.A00.iterator();
        while (true) {
            C06440Td c06440Td = (C06440Td) it;
            if (!c06440Td.hasNext()) {
                return;
            }
            Map map = A00;
            StringBuilder sb = new StringBuilder("pt_");
            sb.append((String) c06440Td.next());
            map.put(sb.toString(), c2Ae);
        }
    }

    public static void A02(String str, C2Ae c2Ae) {
        for (String str2 : str.split(" ")) {
            A01(str2, c2Ae);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:1074:0x014e, code lost:
        if (r4 <= 19.0d) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1080:0x0161, code lost:
        if (r4 <= 19) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1387:0x044a, code lost:
        if (r1 <= 19.0d) goto L470;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A03(double r22, long r24, int r26, int r27, long r28, long r30) {
        /*
            Method dump skipped, instructions count: 2078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2Ae.A03(double, long, int, int, long, long):int");
    }

    public int A04(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            int indexOf = str.indexOf(46);
            try {
                if (indexOf == -1) {
                    long parseLong = Long.parseLong(str);
                    return A03(parseLong, parseLong, 0, 0, 0L, 0L);
                }
                double parseDouble = Double.parseDouble(str);
                long parseLong2 = indexOf == 0 ? 0L : Long.parseLong(str.substring(0, indexOf));
                String substring = str.substring(indexOf + 1);
                int length = substring.length();
                int i = length;
                while (i > 0) {
                    int i2 = i - 1;
                    if (substring.charAt(i2) != '0') {
                        break;
                    }
                    i = i2;
                }
                return A03(parseDouble, parseLong2, length, i, Long.parseLong(substring), i != 0 ? Long.parseLong(substring.substring(0, i)) : 0L);
            } catch (NumberFormatException unused) {
                return 0;
            }
        } else if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            return A03(longValue, longValue, 0, 0, 0L, 0L);
        } else {
            return 0;
        }
    }
}
