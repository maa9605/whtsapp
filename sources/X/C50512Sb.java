package X;

import android.content.ContentUris;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.2Sb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50512Sb {
    public static final Uri A00;

    static {
        StringBuilder A0P = C000200d.A0P("content://");
        A0P.append("com.whatsapp.provider.contact");
        A0P.append("/contacts");
        A00 = Uri.parse(A0P.toString());
    }

    public static long A00(Uri uri) {
        C000700j.A06(A01(uri));
        return ContentUris.parseId(uri);
    }

    public static boolean A01(Uri uri) {
        return uri != null && TextUtils.equals(uri.getScheme(), "content") && TextUtils.equals(uri.getAuthority(), "com.whatsapp.provider.contact");
    }
}
