package X;

import android.text.TextUtils;
import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: X.1xL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43401xL {
    public static C43401xL A01;
    public final byte[] A00;

    public C43401xL(C000500h c000500h) {
        byte[] bArr;
        String string = c000500h.A00.getString("upload_token_random_bytes", null);
        if (TextUtils.isEmpty(string) || (bArr = Base64.decode(string, 3)) == null) {
            bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            C000200d.A0i(c000500h, "upload_token_random_bytes", Base64.encodeToString(bArr, 3));
        }
        this.A00 = bArr;
    }
}
