package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.1xI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43371xI {
    public static volatile C43371xI A01;
    public final AbstractC000600i A00;

    public C43371xI(AbstractC000600i abstractC000600i) {
        this.A00 = abstractC000600i;
    }

    public static C43371xI A00() {
        if (A01 == null) {
            synchronized (C43371xI.class) {
                if (A01 == null) {
                    A01 = new C43371xI(AbstractC000600i.A00());
                }
            }
        }
        return A01;
    }

    public String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse.getQueryParameter("oe") == null || parse.getQueryParameter("oh") == null) {
            C000200d.A13("DirectPathUtils/direct_path missing signature or expiry ", str);
            this.A00.A09("DirectPathUtils/verifyDirectPath", null, false);
            return null;
        }
        return str;
    }
}
