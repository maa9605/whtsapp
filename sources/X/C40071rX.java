package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.1rX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40071rX {
    public static volatile C40071rX A03;
    public String A00 = "faq.whatsapp.com";
    public final C002301c A01;
    public final C006602x A02;

    public C40071rX(C006602x c006602x, C002301c c002301c) {
        this.A02 = c006602x;
        this.A01 = c002301c;
    }

    public static Uri.Builder A00() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        return builder;
    }

    public Uri A01(String str) {
        return A03("general", str, null);
    }

    public Uri A02(String str, String str2) {
        Uri.Builder A00 = A00();
        A00.appendPath("general");
        A00.appendPath(str);
        A00.appendPath(str2);
        A04(A00);
        return A00.build();
    }

    public Uri A03(String str, String str2, String str3) {
        Uri.Builder A00 = A00();
        A00.appendPath(str);
        if (!TextUtils.isEmpty(str2)) {
            A00.appendPath(str2);
        }
        A04(A00);
        if (!TextUtils.isEmpty(str3)) {
            A00.encodedFragment(str3);
        }
        return A00.build();
    }

    public final void A04(Uri.Builder builder) {
        C002301c c002301c = this.A01;
        builder.appendQueryParameter("lg", c002301c.A04());
        builder.appendQueryParameter("lc", c002301c.A03());
        builder.appendQueryParameter("eea", this.A02.A07(C01C.A0I) ? "1" : "0");
    }
}
