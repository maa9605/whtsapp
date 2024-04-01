package X;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.1t9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40961t9 {
    public static final Pattern A01 = Pattern.compile("(?<=\nEND:VCARD)\\s*\r?\n", 2);
    public static final Pattern A00 = Pattern.compile("\r?\n");

    public static List A00(String str) {
        List asList = Arrays.asList(A01.split(str, 258));
        int i = 1;
        int min = Math.min(asList.size(), 257) - ((asList.size() <= 0 || !((String) asList.get(asList.size() - 1)).isEmpty()) ? 0 : 0);
        return min < asList.size() ? asList.subList(0, min) : asList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ce, code lost:
        throw new X.C43301xB(X.C000200d.A0L(X.C000200d.A0P("END:VCARD != \""), r6.A0E, "\""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02e6, code lost:
        throw new X.C43301xB(X.C000200d.A0I("Expected String \"BEGIN:VCARD\" did not come (Instead, \"", r2, "\" came)"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        r6.A0B = (java.lang.System.currentTimeMillis() - r15) + r6.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
        if (r9 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016a, code lost:
        if (r0 == false) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0167 -> B:47:0x0130). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0167 -> B:48:0x0145). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(java.lang.String r17, X.C43271x8 r18) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40961t9.A01(java.lang.String, X.1x8):void");
    }
}
