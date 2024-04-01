package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.1MF  reason: invalid class name */
/* loaded from: classes.dex */
public class C1MF extends C0J8 {
    public String A00;
    public final String A01;

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0006, code lost:
        if (r5 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1MF(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4)
            if (r2 != 0) goto L8
            r0 = 0
            if (r5 == 0) goto L9
        L8:
            r0 = 1
        L9:
            X.C000700j.A07(r0)
            r1.A00 = r5
            r1.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1MF.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.C0J9
    public String A8B(C05080Nf c05080Nf, C01B c01b, boolean z) {
        Uri.Builder A01;
        if (!TextUtils.isEmpty(this.A00)) {
            A01 = Uri.parse(new Uri.Builder().scheme("https").encodedAuthority(c05080Nf.A02).encodedPath(this.A00).build().toString()).buildUpon().appendQueryParameter("direct_ip", String.valueOf(c05080Nf.A00 == 0 ? 0 : 1));
            if (z) {
                A01.appendQueryParameter("auth", c05080Nf.A01);
            }
            String str = this.A03;
            if (!TextUtils.isEmpty(str)) {
                A01.appendQueryParameter("hash", str);
            }
        } else {
            A01 = A01(c05080Nf);
        }
        String str2 = c05080Nf.A03;
        if (str2 != null) {
            C0J8.A00(A01, c01b.A0E(C01C.A1Z) ? "_nc_cat" : "bucket_id", str2);
        }
        String str3 = this.A01;
        if (str3 != null) {
            A01.appendQueryParameter("mode", str3);
        }
        return A01.build().toString();
    }
}
