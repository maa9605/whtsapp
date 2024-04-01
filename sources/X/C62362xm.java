package X;

import android.text.TextUtils;
import com.whatsapp.jobqueue.job.HSMRehydrationUtil$SendStructUnavailableException;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.2xm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C62362xm {
    public static Pattern A00;

    public static C47812Cr A00(C41291tg c41291tg, Locale[] localeArr, String str, String str2) {
        C47812Cr A03 = c41291tg.A03(localeArr, str);
        if (A03 != null) {
            if (A03.A02.size() != 0) {
                return A03;
            }
            StringBuilder sb = new StringBuilder("HSMRehydrationUtil/requestLanguagePack/error server had no hsm pack for namespace, loggableString=");
            sb.append(str2);
            Log.e(sb.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException(1002);
        }
        StringBuilder sb2 = new StringBuilder("HSMRehydrationUtil/requestLanguagePack/error missing hsm pack after requirements satisfied, loggableString=");
        sb2.append(str2);
        Log.e(sb2.toString());
        throw new HSMRehydrationUtil$SendStructUnavailableException(1002);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x011e, code lost:
        r3 = new java.lang.StringBuilder("HSMRehydrationUtil/validateMessageAndBuildHsmText/error cannot find plural exception for loc=");
        r3.append(r5);
        r3.append("; loggableParameters=");
        r3.append(r27);
        com.whatsapp.util.Log.w(r3.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x065e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01(android.content.Context r23, X.C47812Cr r24, X.C2G3 r25, X.C47822Cs r26, java.lang.String r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62362xm.A01(android.content.Context, X.2Cr, X.2G3, X.2Cs, java.lang.String, boolean, boolean):java.lang.String");
    }

    public static void A02(C2G3 c2g3, String str) {
        if ((c2g3.A00 & 2) != 2 || TextUtils.isEmpty(c2g3.A06) || (c2g3.A00 & 1) != 1 || TextUtils.isEmpty(c2g3.A09)) {
            StringBuilder sb = new StringBuilder("HSMRehydrationUtil/validateHsmMessage/error hsm missing element, loggableString=");
            sb.append(str);
            Log.e(sb.toString());
            throw new HSMRehydrationUtil$SendStructUnavailableException(null);
        }
    }
}
