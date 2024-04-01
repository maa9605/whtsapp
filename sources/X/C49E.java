package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.49E  reason: invalid class name */
/* loaded from: classes3.dex */
public class C49E {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public C49E() {
    }

    public C49E(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A03 = A02(str);
        this.A04 = A01(str2);
        this.A0A = A02(str3);
        this.A01 = A02(str4);
        this.A09 = A02(str5);
        this.A07 = A02(str6);
        this.A00 = A02(str7);
        this.A06 = A02(str8);
        this.A05 = A01(str9);
        this.A0B = A02(str10);
        this.A08 = A02(str11);
        String str12 = this.A0B;
        if (str12 != null) {
            this.A0B = str12.toLowerCase(Locale.US);
        }
    }

    public static C49E A00(Uri uri, boolean z) {
        if (uri == null) {
            return null;
        }
        String str = "01";
        if ("upi".equalsIgnoreCase(uri.getScheme())) {
            String queryParameter = uri.getQueryParameter("mode");
            if (queryParameter != null) {
                str = queryParameter;
            } else if (!z) {
                str = "04";
            }
            return new C49E(uri.getQueryParameter("pn"), uri.getQueryParameter("am"), uri.getQueryParameter("tr"), uri.getQueryParameter("mc"), uri.getQueryParameter("tid"), uri.getQueryParameter("url"), str, uri.getQueryParameter("purpose"), uri.getQueryParameter("mam"), uri.getQueryParameter("pa"), uri.getQueryParameter("sign"));
        }
        try {
            HashMap A03 = A03(uri.toString().trim());
            HashMap A032 = A03((String) A03.get("26"));
            HashMap A033 = A03((String) A03.get("27"));
            return new C49E((String) A03.get("59"), (String) A03.get("54"), (String) A033.get("01"), (String) A03.get("52"), null, (String) A033.get("02"), null, null, (String) A032.get("02"), (String) A032.get("01"), null);
        } catch (Exception unused) {
            Log.e("PAY: unknown uri");
            return null;
        }
    }

    public static final String A01(String str) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "0".equals(str) || "0.0".equals(str) || "0.00".equals(str)) {
            return null;
        }
        return str.trim();
    }

    public static final String A02(String str) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return str.trim();
    }

    public static HashMap A03(String str) {
        String str2;
        int i;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                int length = str.length();
                if (i2 >= length) {
                    break;
                }
                int i3 = i2 + 2;
                String str3 = null;
                if (i3 < length) {
                    str2 = str.substring(i2, i3);
                } else {
                    str2 = null;
                }
                int i4 = i3 + 2;
                if (i4 < length) {
                    i = Integer.parseInt(str.substring(i3, i4));
                } else {
                    i = -1;
                }
                if (str2 == null || i == -1) {
                    i2 = i3;
                } else {
                    i2 = i + i4;
                    if (i2 <= length) {
                        str3 = str.substring(i4, i2);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        i2 = i4;
                    } else {
                        hashMap.put(str2, str3);
                    }
                }
            }
        }
        return hashMap;
    }

    public static final void A04(StringBuffer stringBuffer, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.append("&");
        }
        stringBuffer.append(str);
        stringBuffer.append("=");
        stringBuffer.append(Uri.encode(str2, "@"));
    }

    public String A05() {
        StringBuffer stringBuffer = new StringBuffer();
        A04(stringBuffer, "pn", this.A03);
        A04(stringBuffer, "am", this.A04);
        A04(stringBuffer, "tr", this.A0A);
        A04(stringBuffer, "mc", this.A01);
        A04(stringBuffer, "tid", this.A09);
        A04(stringBuffer, "url", this.A07);
        A04(stringBuffer, "mode", this.A00);
        A04(stringBuffer, "purpose", this.A06);
        A04(stringBuffer, "mam", this.A05);
        A04(stringBuffer, "pa", this.A0B);
        A04(stringBuffer, "sign", this.A08);
        String obj = stringBuffer.toString();
        StringBuilder A0P = C000200d.A0P("upi://pay");
        A0P.append(TextUtils.isEmpty(obj) ? "" : C000200d.A0H("?", obj));
        return A0P.toString();
    }
}
