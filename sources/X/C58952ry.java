package X;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.2ry  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58952ry {
    public static String A00(String str) {
        try {
            String host = new URL(str).getHost();
            if (C72973at.A03(Uri.parse(C04310Jr.A03(str, C04310Jr.A03)))) {
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append("/watch");
                return sb.toString();
            }
            return host;
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
