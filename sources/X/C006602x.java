package X;

import android.util.Pair;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.02x */
/* loaded from: classes.dex */
public class C006602x {
    public static final C006702y A06;
    public static final Charset A07;
    public static final Pattern A08;
    public static volatile C006602x A09;
    public final AnonymousClass031 A02;
    public final C02L A03;
    public final C001200o A04;
    public final Object A05 = new Object();
    public String A01 = "";
    public AnonymousClass032 A00 = new AnonymousClass032(0);

    static {
        C006702y c006702y = new C006702y(59);
        A06 = c006702y;
        c006702y.put("af", Arrays.asList("ZA", "NA"));
        C006702y c006702y2 = A06;
        c006702y2.put("ar", Arrays.asList("EG", "SA", "SY", "IQ"));
        c006702y2.put("sq", Arrays.asList("AL", "XK", "GR", "MK", "IT"));
        c006702y2.put("az", Collections.singletonList("AZ"));
        c006702y2.put("bn", Arrays.asList("IN", "BD"));
        c006702y2.put("bg", Collections.singletonList("BG"));
        c006702y2.put("ca", Arrays.asList("ES", "AD"));
        c006702y2.put("zh-Hans", Arrays.asList("MY", "SG", "CN", "HK"));
        c006702y2.put("zh-Hant", Arrays.asList("HK", "TW", "MY", "MO"));
        c006702y2.put("hr", Arrays.asList("HR", "BA"));
        c006702y2.put("cs", Collections.singletonList("CZ"));
        c006702y2.put("da", Collections.singletonList("DK"));
        c006702y2.put("nl", Arrays.asList("NL", "BE", "SR"));
        c006702y2.put("en", Arrays.asList("IN", "PK", "ZA", "GB", "US"));
        c006702y2.put("et", Collections.singletonList("EE"));
        c006702y2.put("fil", Collections.singletonList("PH"));
        c006702y2.put("fi", Collections.singletonList("FI"));
        c006702y2.put("fr", Collections.singletonList("FR"));
        c006702y2.put("de", Arrays.asList("DE", "AT", "CH"));
        c006702y2.put("el", Arrays.asList("GR", "CY"));
        c006702y2.put("gu", Collections.singletonList("IN"));
        c006702y2.put("he", Collections.singletonList("IL"));
        c006702y2.put("hi", Collections.singletonList("IN"));
        c006702y2.put("hu", Arrays.asList("HU", "RO"));
        c006702y2.put("id", Collections.singletonList("ID"));
        c006702y2.put("ga", Arrays.asList("IE", "GB"));
        c006702y2.put("it", Arrays.asList("IT", "CH"));
        c006702y2.put("ja", Collections.singletonList("JP"));
        c006702y2.put("kn", Collections.singletonList("IN"));
        c006702y2.put("kk", Arrays.asList("KZ", "UZ", "MN"));
        c006702y2.put("ko", Collections.singletonList("KR"));
        c006702y2.put("lo", Collections.singletonList("LA"));
        c006702y2.put("lv", Collections.singletonList("LV"));
        c006702y2.put("lt", Collections.singletonList("LT"));
        c006702y2.put("mk", Collections.singletonList("MK"));
        c006702y2.put("ms", Collections.singletonList("MY"));
        c006702y2.put("ml", Collections.singletonList("IN"));
        c006702y2.put("mr", Collections.singletonList("IN"));
        c006702y2.put("nb", Collections.singletonList("NO"));
        c006702y2.put("fa", Arrays.asList("IR", "AF"));
        c006702y2.put("pl", Collections.singletonList("PL"));
        c006702y2.put("pt-BR", Collections.singletonList("BR"));
        c006702y2.put("pt-PT", Arrays.asList("PT", "AO", "BR", "MZ"));
        c006702y2.put("pa", Collections.singletonList("IN"));
        c006702y2.put("ro", Arrays.asList("RO", "MD"));
        c006702y2.put("ru", Arrays.asList("RU", "KZ", "KG", "UA"));
        c006702y2.put("sr", Arrays.asList("RS", "BA", "ME"));
        c006702y2.put("sk", Collections.singletonList("SK"));
        c006702y2.put("sl", Collections.singletonList("SI"));
        c006702y2.put("es", Arrays.asList("MX", "AR", "CL", "CO", "ES", "PE"));
        c006702y2.put("sw", Arrays.asList("TZ", "KE", "RW", "BI"));
        c006702y2.put("sv", Arrays.asList("SE", "FI"));
        c006702y2.put("ta", Arrays.asList("IN", "LK", "MY", "SG"));
        c006702y2.put("te", Collections.singletonList("IN"));
        c006702y2.put("th", Arrays.asList("TH", "LA"));
        c006702y2.put("tr", Collections.singletonList("TR"));
        c006702y2.put("uk", Collections.singletonList("UA"));
        c006702y2.put("ur", Arrays.asList("PK", "IN"));
        c006702y2.put("uz", Arrays.asList("UZ", "RU", "KZ", "KG"));
        c006702y2.put("vi", Collections.singletonList("VN"));
        A07 = Charset.forName("UTF-8");
        A08 = Pattern.compile("\t");
    }

    public C006602x(C001200o c001200o, C02L c02l, AnonymousClass031 anonymousClass031) {
        this.A04 = c001200o;
        this.A03 = c02l;
        this.A02 = anonymousClass031;
    }

    public static C006602x A00() {
        if (A09 == null) {
            synchronized (C006602x.class) {
                if (A09 == null) {
                    A09 = new C006602x(C001200o.A01, C02L.A00(), AnonymousClass031.A00());
                }
            }
        }
        return A09;
    }

    public static String A01(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = (String) C0Sa.A01.get(parseInt);
            return "ZZ".equals(str2) ? (String) C0Sa.A00.get(parseInt) : str2;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String A02(String str, String str2) {
        Pattern pattern;
        try {
            int parseInt = Integer.parseInt(str);
            String str3 = (String) C0Sa.A01.get(parseInt);
            if (str3 == null) {
                return "ZZ";
            }
            if (str3.equals("ZZ")) {
                List list = (List) C0Sa.A02.get(parseInt);
                for (int i = 0; i < list.size(); i++) {
                    Pair pair = (Pair) list.get(i);
                    Object obj = pair.second;
                    if (obj instanceof String) {
                        pattern = Pattern.compile((String) obj);
                        list.set(i, Pair.create(pair.first, pattern));
                    } else {
                        pattern = (Pattern) obj;
                    }
                    if (pattern.matcher(str2).matches()) {
                        return (String) pair.first;
                    }
                }
                return "ZZ";
            }
            return str3;
        } catch (NumberFormatException unused) {
            return "ZZ";
        }
    }

    public String A03(C002301c c002301c, String str) {
        String str2;
        synchronized (this.A05) {
            String A04 = AbstractC003201n.A04(c002301c.A0I());
            if (!A04.equals(this.A01)) {
                List<C1Qg> A042 = A04(A04);
                if (A042.isEmpty()) {
                    A042 = A04("en");
                }
                this.A00 = new AnonymousClass032(A042.size());
                for (C1Qg c1Qg : A042) {
                    this.A00.A03(c1Qg.A00, c1Qg.A01);
                }
                this.A01 = A04;
            }
            str2 = (String) this.A00.A01(str);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List A04(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r1 = "country_names_"
            java.lang.String r0 = ".tsv"
            java.lang.String r1 = X.C000200d.A0I(r1, r9, r0)
            r3 = 0
            X.00o r0 = r8.A04     // Catch: java.io.IOException -> L60
            android.app.Application r0 = r0.A00     // Catch: java.io.IOException -> L60
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L60
            java.io.InputStream r2 = r0.open(r1)     // Catch: java.io.IOException -> L60
            java.nio.charset.Charset r1 = X.C006602x.A07     // Catch: java.io.IOException -> L60
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L60
            r0.<init>(r2, r1)     // Catch: java.io.IOException -> L60
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.io.IOException -> L60
            r7.<init>(r0)     // Catch: java.io.IOException -> L60
            r0 = 243(0xf3, float:3.4E-43)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L56
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r7.readLine()     // Catch: java.lang.Throwable -> L54
        L2c:
            if (r1 == 0) goto L50
            java.util.regex.Pattern r0 = X.C006602x.A08     // Catch: java.lang.Throwable -> L54
            java.lang.String[] r6 = r0.split(r1)     // Catch: java.lang.Throwable -> L54
            int r4 = r6.length     // Catch: java.lang.Throwable -> L54
            r3 = 2
            r2 = 0
            r1 = 1
            r0 = 0
            if (r4 != r3) goto L3c
            r0 = 1
        L3c:
            X.C000700j.A07(r0)     // Catch: java.lang.Throwable -> L54
            r2 = r6[r2]     // Catch: java.lang.Throwable -> L54
            r1 = r6[r1]     // Catch: java.lang.Throwable -> L54
            X.1Qg r0 = new X.1Qg     // Catch: java.lang.Throwable -> L54
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L54
            r5.add(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r7.readLine()     // Catch: java.lang.Throwable -> L54
            goto L2c
        L50:
            r7.close()     // Catch: java.io.IOException -> L5e
            goto L73
        L54:
            r0 = move-exception
            goto L58
        L56:
            r0 = move-exception
            r5 = r3
        L58:
            throw r0     // Catch: java.lang.Throwable -> L59
        L59:
            r0 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L5d
        L5d:
            throw r0     // Catch: java.io.IOException -> L5e
        L5e:
            r2 = move-exception
            goto L62
        L60:
            r2 = move-exception
            r5 = r3
        L62:
            java.lang.String r1 = "countryutils/getcountrylist error:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
        L73:
            if (r5 != 0) goto L79
            java.util.List r5 = java.util.Collections.emptyList()
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006602x.A04(java.lang.String):java.util.List");
    }

    public boolean A05() {
        C02L c02l = this.A03;
        c02l.A05();
        Me me = c02l.A00;
        if (me == null) {
            return false;
        }
        try {
            return "eu".equals(this.A02.A03(me.cc));
        } catch (IOException e) {
            StringBuilder A0P = C000200d.A0P("countryutils/is-eu failed for ");
            A0P.append(me.cc);
            Log.e(A0P.toString(), e);
            return false;
        }
    }

    public boolean A06() {
        C02L c02l = this.A03;
        c02l.A05();
        Me me = c02l.A00;
        if (me == null) {
            return false;
        }
        return "IN".equals(A02(me.cc, me.number));
    }

    public boolean A07(String str) {
        return "eu".equals(str) || A05();
    }

    public boolean A08(String str) {
        C02L c02l = this.A03;
        c02l.A05();
        Me me = c02l.A00;
        if (me == null) {
            return false;
        }
        return str.equals(A02(me.cc, me.number));
    }
}
