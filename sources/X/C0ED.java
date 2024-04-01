package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.0ED */
/* loaded from: classes.dex */
public class C0ED {
    public static final int A05 = C0GP.A04;
    public static volatile C0ED A06;
    public final C02L A00;
    public final C01B A01;
    public final C003701t A02;
    public final C0DW A03;
    public final C05G A04;

    public C0ED(C003701t c003701t, C02L c02l, C01B c01b, C0DW c0dw, C05G c05g) {
        this.A02 = c003701t;
        this.A00 = c02l;
        this.A01 = c01b;
        this.A03 = c0dw;
        this.A04 = c05g;
    }

    public static C1P5 A00(C0WZ c0wz, Uri uri) {
        int length;
        Set A02;
        int length2;
        int length3;
        C1P5 c1p5 = new C1P5();
        c1p5.A04 = A03(uri);
        c1p5.A08 = uri.getQueryParameter("text");
        c1p5.A03 = uri.getQueryParameter("jid");
        String str = c1p5.A08;
        if (str != null) {
            String A0u = C002701i.A0u(str, A05);
            c1p5.A08 = A0u;
            c1p5.A08 = AnonymousClass024.A0K(A0u, 8000);
        }
        String queryParameter = uri.getQueryParameter("data");
        c1p5.A01 = queryParameter;
        String str2 = null;
        if (queryParameter != null && (length3 = queryParameter.length()) > 512) {
            StringBuilder A0P = C000200d.A0P("deeplinkhelper/parseChatUri/Stripping data due to being too long. Length = ");
            A0P.append(length3);
            A0P.append(", max = 512.");
            Log.w(A0P.toString());
            c1p5.A01 = null;
        }
        String queryParameter2 = uri.getQueryParameter("source");
        c1p5.A06 = queryParameter2;
        if (queryParameter2 != null && (length2 = queryParameter2.length()) > 32) {
            StringBuilder A0P2 = C000200d.A0P("deeplinkhelper/parseChatUri/Stripping source due to being too long. Length = ");
            A0P2.append(length2);
            A0P2.append(", max = 32.");
            Log.w(A0P2.toString());
            c1p5.A06 = null;
        }
        c1p5.A05 = uri.getQueryParameter("ref");
        String queryParameter3 = uri.getQueryParameter("source_url");
        if (queryParameter3 != null && (A02 = c0wz.A02(queryParameter3, AbstractC005302j.A02(c1p5.A04))) != null && !A02.isEmpty()) {
            c1p5.A01 = null;
            c1p5.A08 = null;
            return c1p5;
        }
        String queryParameter4 = uri.getQueryParameter("context");
        c1p5.A00 = queryParameter4;
        if (queryParameter4 == null) {
            c1p5.A00 = c1p5.A01;
        }
        String queryParameter5 = uri.getQueryParameter("icebreaker");
        if (queryParameter5 != null && (length = queryParameter5.length()) >= 140) {
            StringBuilder A0P3 = C000200d.A0P("deeplinkhelper/parseChatUri/parseIcebreaker/Stripping data due to being too long. Length = ");
            A0P3.append(length);
            A0P3.append(", max = 140.");
            Log.w(A0P3.toString());
        } else {
            str2 = queryParameter5;
        }
        c1p5.A02 = str2;
        c1p5.A07 = queryParameter3;
        return c1p5;
    }

    public static C0ED A01() {
        if (A06 == null) {
            synchronized (C0ED.class) {
                if (A06 == null) {
                    A06 = new C0ED(C003701t.A00(), C02L.A00(), C01B.A00(), C0DW.A00(), C05G.A00());
                }
            }
        }
        return A06;
    }

    public static UserJid A02(Uri uri) {
        String queryParameter = uri.getQueryParameter("phoneNumber");
        if ("wa.me".equals(uri.getHost())) {
            C000700j.A06(uri.getPathSegments().size() == 2);
            queryParameter = uri.getLastPathSegment();
        }
        if (queryParameter != null) {
            try {
                return UserJid.getFromIdentifier(queryParameter);
            } catch (C011305p unused) {
                return null;
            }
        }
        return null;
    }

    public static String A03(Uri uri) {
        String queryParameter = uri.getQueryParameter("phone");
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host)) {
            host = host.toLowerCase(Locale.US);
        }
        return "wa.me".equals(host) ? uri.getLastPathSegment() : queryParameter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x003f, code lost:
        if ("wa.me".equals(r11) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A04(android.net.Uri r19) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ED.A04(android.net.Uri):int");
    }

    public final int A05(List list) {
        String str = list.isEmpty() ? "" : list.get(0);
        String str2 = list.size() > 1 ? list.get(1) : "";
        if ("novi".equals(str)) {
            if (this.A03 != null) {
                return 1;
            }
            throw null;
        } else if ("upi".equals(str)) {
            if ("signup".equals(str2)) {
                C0DW c0dw = this.A03;
                return (c0dw.A04() && c0dw.A03.A04() && c0dw.A00.A0E(C01C.A1p)) ? 19 : 1;
            }
            return 1;
        } else if ("virality".equals(str)) {
            return 21;
        } else {
            return (list.isEmpty() && this.A03.A04()) ? 4 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0012, code lost:
        if (r5.A04.A02() == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A06(java.util.List r6) {
        /*
            r5 = this;
            X.02L r0 = r5.A00
            r0.A05()
            com.whatsapp.Me r0 = r0.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L14
            X.05G r0 = r5.A04
            boolean r0 = r0.A02()
            r2 = 1
            if (r0 != 0) goto L15
        L14:
            r2 = 0
        L15:
            X.01t r1 = r5.A02
            r0 = 504(0x1f8, float:7.06E-43)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L6f
            int r1 = r6.size()
            r0 = 2
            if (r1 < r0) goto L6f
            if (r2 == 0) goto L6f
            java.lang.Object r0 = r6.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = r0.toLowerCase(r1)
            java.lang.Object r0 = r6.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r0 = "account"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5c
            java.lang.String r0 = "delete"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            r0 = 22
            return r0
        L51:
            java.lang.String r0 = "request_info"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6f
            r0 = 23
            return r0
        L5c:
            java.lang.String r0 = "chats"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L6f
            java.lang.String r0 = "history"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6f
            r0 = 24
            return r0
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ED.A06(java.util.List):int");
    }

    public boolean A07(String str) {
        return !TextUtils.isEmpty(str) && 6 == A04(Uri.parse(str));
    }
}
