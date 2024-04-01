package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2GM  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2GM {
    public static final Set A00 = new HashSet(Arrays.asList("audio", "image", "video", "kyc-id", "sticker", "document", "ptt", "gif", "md-app-state", "md-msg-hist", "ppic"));

    public static Pair A00(C02590Ca c02590Ca) {
        for (C02590Ca c02590Ca2 : c02590Ca.A0H("error")) {
            if (c02590Ca2 != null) {
                try {
                    int A05 = c02590Ca2.A05("code", 0);
                    if (A05 != 0) {
                        return new Pair(Integer.valueOf(A05), Integer.valueOf(c02590Ca2.A05("backoff", 0)));
                    }
                    continue;
                } catch (C0L4 e) {
                    Log.e("MediaConnFactory/getErrorCodeAndBackoffFromIqResponse CorruptStreamException ", e);
                }
            }
        }
        return null;
    }

    public static C02600Cb A01(C02590Ca c02590Ca, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C02590Ca A0E = c02590Ca.A0E("media_conn");
        C04P A0A = A0E.A0A("id");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        String A0G = A0E.A0G("auth");
        long A06 = A0E.A06("ttl");
        long A062 = A0E.A06("auth_ttl");
        long A07 = A0E.A07("max_buckets", 0L);
        int A05 = A0E.A05("is_new", 1);
        int A052 = A0E.A05("max_auto_download_retry", 3);
        int A053 = A0E.A05("max_manual_retry", 3);
        C02590Ca[] c02590CaArr = A0E.A03;
        ArrayList arrayList = new ArrayList();
        if (c02590CaArr != null) {
            for (C02590Ca c02590Ca2 : c02590CaArr) {
                if ("host".equals(c02590Ca2.A00)) {
                    String A0G2 = c02590Ca2.A0G("hostname");
                    C04P A0A2 = c02590Ca2.A0A("ip4");
                    if (A0A2 != null) {
                        str2 = A0A2.A03;
                    } else {
                        str2 = null;
                    }
                    C04P A0A3 = c02590Ca2.A0A("ip6");
                    if (A0A3 != null) {
                        str3 = A0A3.A03;
                    } else {
                        str3 = null;
                    }
                    C04P A0A4 = c02590Ca2.A0A("class");
                    if (A0A4 != null) {
                        str4 = A0A4.A03;
                    } else {
                        str4 = null;
                    }
                    C04P A0A5 = c02590Ca2.A0A("fallback_hostname");
                    if (A0A5 != null) {
                        str5 = A0A5.A03;
                    } else {
                        str5 = null;
                    }
                    C04P A0A6 = c02590Ca2.A0A("fallback_ip4");
                    if (A0A6 != null) {
                        str6 = A0A6.A03;
                    } else {
                        str6 = null;
                    }
                    C04P A0A7 = c02590Ca2.A0A("fallback_ip6");
                    if (A0A7 != null) {
                        str7 = A0A7.A03;
                    } else {
                        str7 = null;
                    }
                    C04P A0A8 = c02590Ca2.A0A("fallback_class");
                    if (A0A8 != null) {
                        str8 = A0A8.A03;
                    } else {
                        str8 = null;
                    }
                    C02590Ca A0D = c02590Ca2.A0D("upload");
                    Set set = A00;
                    Set A02 = A02(A0D, set);
                    Set A022 = A02(c02590Ca2.A0D("download"), set);
                    Set A023 = A02(c02590Ca2.A0D("download_buckets"), null);
                    C04P A0A9 = c02590Ca2.A0A("type");
                    if (A0A9 != null) {
                        str9 = A0A9.A03;
                    } else {
                        str9 = null;
                    }
                    C04P A0A10 = c02590Ca2.A0A("force_ip");
                    arrayList.add(new C40601sX(A0G2, str2, str3, str4, str5, str6, str7, str8, A02, A022, A023, str9, "true".equals(A0A10 != null ? A0A10.A03 : null)));
                }
            }
        }
        return new C02600Cb(A0G, A06, A062, A07, arrayList, j, str, A05 == 1, A052, A053);
    }

    public static Set A02(C02590Ca c02590Ca, Set set) {
        if (c02590Ca == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        C02590Ca[] c02590CaArr = c02590Ca.A03;
        if (c02590CaArr != null) {
            for (C02590Ca c02590Ca2 : c02590CaArr) {
                if (set == null || set.contains(c02590Ca2.A00)) {
                    hashSet.add(c02590Ca2.A00);
                }
            }
        }
        return hashSet;
    }
}
