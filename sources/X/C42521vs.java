package X;

import java.util.List;

/* renamed from: X.1vs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42521vs {
    public final C42551vv A00;

    public C42521vs(C42551vv c42551vv) {
        this.A00 = c42551vv;
    }

    public final List A00(String str) {
        String[] strArr;
        String str2;
        if (str == null) {
            strArr = null;
            str2 = "";
        } else {
            strArr = new String[]{str};
            str2 = "installed_id= ?";
        }
        return A01("installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)", strArr, str2, "getInstalledStickerPacks/QUERY");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f0, code lost:
        if (android.text.TextUtils.isEmpty(r12) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0100, code lost:
        if (android.text.TextUtils.isEmpty(r11) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0110, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A01(java.lang.String r14, java.lang.String[] r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42521vs.A01(java.lang.String, java.lang.String[], java.lang.String, java.lang.String):java.util.List");
    }
}
