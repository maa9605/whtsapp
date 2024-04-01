package X;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.3at  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C72973at {
    public final int A00;
    public final int A01;
    public final String A02;
    public static final String[] A03 = {"facebook.com", "www.facebook.com", "m.facebook.com"};
    public static final String[] A04 = {"fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch"};
    public static final String[] A09 = {"streamable.com", "www.streamable.com"};
    public static final String[] A05 = {"instagram.com", "www.instagram.com"};
    public static final String[] A06 = {"lassovideos.com", "www.lassovideos.com"};
    public static final String[] A07 = {"netflix.com", "www.netflix.com"};
    public static final String[] A08 = {"sharechat.com", "www.sharechat.com"};

    public C72973at(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = i;
    }

    public static int A00(int i) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                return -1;
                            }
                            return R.drawable.ic_pip_sharechat;
                        }
                        return R.drawable.ic_pip_lasso;
                    }
                    return R.drawable.ic_pip_fb_watch;
                }
                return R.drawable.ic_pip_youtube;
            }
            return R.drawable.ic_pip_instagram;
        }
        return R.drawable.ic_pip_facebook;
    }

    public static int A01(String str) {
        Uri parse = Uri.parse(C04310Jr.A03(str, C04310Jr.A03));
        if (A03(parse)) {
            return 5;
        }
        if (A04(parse, A03)) {
            return 2;
        }
        if (A04(parse, A05)) {
            return 3;
        }
        if (A04(parse, A09)) {
            return 1;
        }
        if (!TextUtils.isEmpty(A02(parse))) {
            return 4;
        }
        if (A04(parse, A06)) {
            return 6;
        }
        if (A04(parse, A07)) {
            return 7;
        }
        return A04(parse, A08) ? 8 : 0;
    }

    public static String A02(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return null;
        }
        if (!"m.youtube.com".equalsIgnoreCase(host) && !"www.youtube.com".equalsIgnoreCase(host) && !"youtube.com".equalsIgnoreCase(host)) {
            if ("youtu.be".equalsIgnoreCase(host)) {
                return uri.getLastPathSegment();
            }
            return null;
        }
        return uri.getQueryParameter("v");
    }

    public static boolean A03(Uri uri) {
        if (A04(uri, A04)) {
            return true;
        }
        return A04(uri, A03) && "1".equalsIgnoreCase(uri.getQueryParameter("fw"));
    }

    public static boolean A04(Uri uri, String[] strArr) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        for (String str : strArr) {
            if (host.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
