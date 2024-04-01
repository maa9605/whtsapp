package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.3KG  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KG extends C3BL {
    public static final Uri A00 = Uri.parse("content://com.whatsapp.provider.media/items");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3KG(X.C001200o r8, X.C01B r9, X.C2AQ r10, X.C02C r11, java.lang.String r12, int r13) {
        /*
            r7 = this;
            android.net.Uri r0 = X.C3KG.A00
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "bucketId"
            r6 = r12
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r12)
            r0 = 1
            java.lang.String r1 = "include"
            if (r13 == r0) goto L30
            r0 = 2
            if (r13 == r0) goto L2a
            r0 = 4
            if (r13 != r0) goto L1d
            java.lang.String r0 = "video"
            r2.appendQueryParameter(r1, r0)
        L1d:
            android.net.Uri r4 = r2.build()
            r5 = 2
            r1 = r8
            r0 = r7
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L2a:
            java.lang.String r0 = "gif"
            r2.appendQueryParameter(r1, r0)
            goto L1d
        L30:
            java.lang.String r0 = "images"
            r2.appendQueryParameter(r1, r0)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3KG.<init>(X.00o, X.01B, X.2AQ, X.02C, java.lang.String, int):void");
    }

    @Override // X.InterfaceC52142a8
    public HashMap A8a() {
        return new HashMap();
    }
}
