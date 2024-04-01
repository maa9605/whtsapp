package X;

import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.11Z  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11Z {
    public static final Pattern A01 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A02 = Pattern.compile("(\\S+?):(\\S+)");
    public final StringBuilder A00 = new StringBuilder();

    public static int A00(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return 2;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 0;
                }
                break;
        }
        C000200d.A17("Invalid anchor value: ", str, "WebvttCueParser");
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r4.equals("left") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r4.equals("end") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r4.equals("center") != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(java.lang.String r9, X.C11W r10) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11Z.A01(java.lang.String, X.11W):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /* JADX WARN: Type inference failed for: r1v26, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(java.lang.String r17, X.C11X r18, android.text.SpannableStringBuilder r19, java.util.List r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11Z.A02(java.lang.String, X.11X, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A03(java.lang.String r17, java.lang.String r18, X.C11W r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11Z.A03(java.lang.String, java.lang.String, X.11W, java.util.List):void");
    }

    public static boolean A04(String str, Matcher matcher, C223812f c223812f, C11W c11w, StringBuilder sb, List list) {
        try {
            c11w.A07 = C221011a.A01(matcher.group(1));
            c11w.A06 = C221011a.A01(matcher.group(2));
            A01(matcher.group(3), c11w);
            sb.setLength(0);
            while (true) {
                String A07 = c223812f.A07();
                if (!TextUtils.isEmpty(A07)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(A07.trim());
                } else {
                    A03(str, sb.toString(), c11w, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder A0P = C000200d.A0P("Skipping cue with bad header: ");
            A0P.append(matcher.group());
            Log.w("WebvttCueParser", A0P.toString());
            return false;
        }
    }
}
