package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.0J8  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0J8 implements C0J9 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C0J8(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str)) {
            str4 = AnonymousClass024.A0I(str);
        } else {
            str4 = null;
        }
        this.A03 = str4;
        this.A01 = str2;
        this.A00 = str3 == null ? "mms" : str3;
        this.A02 = str;
    }

    public static Uri.Builder A00(Uri.Builder builder, String str, String str2) {
        Uri build = builder.build();
        if (build.getQueryParameter(str) == null) {
            return builder.appendQueryParameter(str, str2);
        }
        builder.clearQuery();
        for (String str3 : build.getQueryParameterNames()) {
            if (str.equals(str3)) {
                builder.appendQueryParameter(str3, str2);
            } else {
                builder.appendQueryParameter(str3, build.getQueryParameter(str3));
            }
        }
        return builder;
    }

    public Uri.Builder A01(C05080Nf c05080Nf) {
        String str = this.A03;
        if (str != null) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme("https").encodedAuthority(c05080Nf.A02).appendPath(this.A00).appendPath(this.A01).appendEncodedPath(AnonymousClass024.A0I(str)).appendQueryParameter("direct_ip", String.valueOf(c05080Nf.A00 == 0 ? 0 : 1));
            return builder;
        }
        throw null;
    }
}
