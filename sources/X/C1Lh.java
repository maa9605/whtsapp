package X;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: X.1Lh  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Lh {
    public static C04W A00 = new C04W(16);
    public static HashMap A01 = new HashMap();

    public static C05920Qu A00(String str) {
        if (str == null) {
            return null;
        }
        return (C05920Qu) A00.get(str);
    }

    public static void A01(final C018508q c018508q, InterfaceC002901k interfaceC002901k, final C01B c01b, final C002301c c002301c, final String str, InterfaceC26921Lg interfaceC26921Lg) {
        if (!TextUtils.isEmpty(str)) {
            C05920Qu A002 = A00(str);
            if (A002 != null) {
                if (interfaceC26921Lg != null) {
                    interfaceC26921Lg.AMf(A002, true);
                    return;
                }
                return;
            }
            AbstractCollection abstractCollection = (AbstractCollection) A01.get(str);
            if (abstractCollection != null) {
                abstractCollection.add(interfaceC26921Lg);
                return;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(interfaceC26921Lg);
            A01.put(str, arrayList);
            final C05920Qu c05920Qu = new C05920Qu(str);
            interfaceC002901k.AS1(new Runnable() { // from class: X.1Jk
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    String str2;
                    int i2;
                    final C05920Qu c05920Qu2 = C05920Qu.this;
                    C002301c c002301c2 = c002301c;
                    C018508q c018508q2 = c018508q;
                    final String str3 = str;
                    C01B c01b2 = c01b;
                    try {
                        try {
                            TrafficStats.setThreadStatsTag(5);
                            String A04 = c002301c2.A04();
                            c05920Qu2.A05 = 0L;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            URL url = new URL(c05920Qu2.A0G);
                            String host = url.getHost();
                            if (host != null) {
                                try {
                                    host = IDN.toASCII(host);
                                } catch (IllegalArgumentException unused) {
                                }
                                host = host.toLowerCase(Locale.ENGLISH);
                            }
                            String protocol = url.getProtocol();
                            if (protocol != null) {
                                protocol = protocol.toLowerCase(Locale.ENGLISH);
                            }
                            URI uri = url.toURI();
                            URL url2 = new URI(protocol, uri.getUserInfo(), host, uri.getPort(), uri.getPath(), uri.getQuery(), url.getRef()).toURL();
                            HttpURLConnection A03 = C05920Qu.A03(url2, A04);
                            String str4 = "";
                            if (A03 != null) {
                                A03.setInstanceFollowRedirects(true);
                                try {
                                    A03.connect();
                                    i = A03.getResponseCode();
                                } catch (ProtocolException e) {
                                    String lowerCase = e.toString().toLowerCase(Locale.US);
                                    if (!lowerCase.contains("too many redirects") && !lowerCase.contains("too many follow-up requests")) {
                                        throw e;
                                    }
                                    i = 303;
                                }
                                int i3 = i / 100;
                                if (i3 != 2) {
                                    int i4 = 3;
                                    if (i3 == 3) {
                                        C05920Qu.A05(A03);
                                        A03 = C05920Qu.A03(url2, null);
                                        if (A03 != null) {
                                            A03.setInstanceFollowRedirects(false);
                                            A03.connect();
                                            int responseCode = A03.getResponseCode();
                                            int i5 = 0;
                                            String str5 = "";
                                            while (true) {
                                                i2 = responseCode / 100;
                                                if (i2 != i4 || i5 >= 20) {
                                                    break;
                                                }
                                                String headerField = A03.getHeaderField("Location");
                                                if (!TextUtils.isEmpty(headerField)) {
                                                    String headerField2 = A03.getHeaderField("Set-Cookie");
                                                    if (headerField2 != null) {
                                                        String[] split = headerField2.split(";");
                                                        if (split.length > 0) {
                                                            headerField2 = split[0];
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(str5)) {
                                                        str5 = C000200d.A0H(str5, "; ");
                                                    }
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(str5);
                                                    sb.append(headerField2);
                                                    str5 = sb.toString();
                                                    C05920Qu.A05(A03);
                                                    A03 = C05920Qu.A03(new URL(headerField), null);
                                                    if (A03 == null) {
                                                        break;
                                                    }
                                                    A03.setInstanceFollowRedirects(false);
                                                    A03.setRequestProperty("Cookie", str5);
                                                    A03.connect();
                                                    responseCode = A03.getResponseCode();
                                                    i5++;
                                                    i4 = 3;
                                                } else {
                                                    break;
                                                }
                                            }
                                            if (i2 != 2) {
                                                C05920Qu.A05(A03);
                                            }
                                        }
                                    }
                                }
                                try {
                                    String headerField3 = A03.getHeaderField("Content-Type");
                                    if (headerField3 != null) {
                                        Matcher matcher = C05920Qu.A0H.matcher(headerField3);
                                        if (matcher.find()) {
                                            String group = matcher.group(1);
                                            if (group == null) {
                                                throw null;
                                            }
                                            str4 = group.trim().toUpperCase(Locale.US);
                                        }
                                    }
                                    String contentType = A03.getContentType();
                                    int contentLength = A03.getContentLength();
                                    InputStream inputStream = A03.getInputStream();
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    byte[] bArr = new byte[1024];
                                    int i6 = 0;
                                    do {
                                        int read = inputStream.read(bArr, 0, 1024);
                                        if (read == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, read);
                                        i6 += read;
                                        if (i6 > 65536) {
                                            break;
                                        }
                                    } while (!C05920Qu.A0I.matcher(new String(byteArrayOutputStream.toByteArray(), "UTF-8")).find());
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    inputStream.close();
                                    try {
                                        String str6 = str4;
                                        if (TextUtils.isEmpty(str4)) {
                                            str6 = "UTF-8";
                                        }
                                        str2 = new String(byteArray, str6);
                                    } catch (UnsupportedEncodingException unused2) {
                                        str2 = new String(byteArray, "UTF-8");
                                    }
                                    String A09 = c05920Qu2.A09(url2, str2, str4, contentType, contentLength);
                                    if (TextUtils.isEmpty(str4) && !TextUtils.isEmpty(A09)) {
                                        try {
                                            String str7 = new String(byteArray, A09);
                                            c05920Qu2.A0A();
                                            c05920Qu2.A09(url2, str7, A09, contentType, contentLength);
                                        } catch (UnsupportedEncodingException unused3) {
                                        }
                                    }
                                    c05920Qu2.A06 = byteArray.length;
                                    C05920Qu.A05(A03);
                                    if (!TextUtils.isEmpty(c05920Qu2.A0D)) {
                                        c05920Qu2.A0D = Html.fromHtml(c05920Qu2.A0D).toString();
                                    }
                                    if (!TextUtils.isEmpty(c05920Qu2.A0A)) {
                                        c05920Qu2.A0A = Html.fromHtml(c05920Qu2.A0A).toString();
                                    }
                                    c05920Qu2.A05 = SystemClock.uptimeMillis() - uptimeMillis;
                                } finally {
                                    C05920Qu.A05(A03);
                                }
                            }
                            if (c05920Qu2.A0C()) {
                                c018508q2.A02.post(new Runnable() { // from class: X.1Jj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object obj;
                                        boolean z = r1;
                                        String str8 = str3;
                                        C05920Qu c05920Qu3 = c05920Qu2;
                                        HashMap hashMap = C1Lh.A01;
                                        if (z) {
                                            obj = hashMap.remove(str8);
                                        } else {
                                            obj = hashMap.get(str8);
                                        }
                                        AbstractCollection abstractCollection2 = (AbstractCollection) obj;
                                        if (abstractCollection2 != null) {
                                            Iterator it = abstractCollection2.iterator();
                                            while (it.hasNext()) {
                                                InterfaceC26921Lg interfaceC26921Lg2 = (InterfaceC26921Lg) it.next();
                                                if (interfaceC26921Lg2 != null) {
                                                    interfaceC26921Lg2.AMf(c05920Qu3, z);
                                                }
                                            }
                                        }
                                        if (c05920Qu3 != null) {
                                            C1Lh.A00.put(str8, c05920Qu3);
                                        }
                                    }
                                });
                                boolean A0E = c01b2.A0E(C01C.A2f);
                                try {
                                    c05920Qu2.A0B(c05920Qu2.A0B);
                                } catch (C26911Lf e2) {
                                    if (A0E) {
                                        c05920Qu2.A0B(c05920Qu2.A0C);
                                    } else {
                                        throw e2;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (IOException | RuntimeException | URISyntaxException unused4) {
                    }
                    TrafficStats.clearThreadStatsTag();
                    c018508q2.A02.post(new Runnable() { // from class: X.1Jj
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            boolean z = r1;
                            String str8 = str3;
                            C05920Qu c05920Qu3 = c05920Qu2;
                            HashMap hashMap = C1Lh.A01;
                            if (z) {
                                obj = hashMap.remove(str8);
                            } else {
                                obj = hashMap.get(str8);
                            }
                            AbstractCollection abstractCollection2 = (AbstractCollection) obj;
                            if (abstractCollection2 != null) {
                                Iterator it = abstractCollection2.iterator();
                                while (it.hasNext()) {
                                    InterfaceC26921Lg interfaceC26921Lg2 = (InterfaceC26921Lg) it.next();
                                    if (interfaceC26921Lg2 != null) {
                                        interfaceC26921Lg2.AMf(c05920Qu3, z);
                                    }
                                }
                            }
                            if (c05920Qu3 != null) {
                                C1Lh.A00.put(str8, c05920Qu3);
                            }
                        }
                    });
                }
            });
        } else if (interfaceC26921Lg == null) {
        } else {
            interfaceC26921Lg.AMf(null, true);
        }
    }
}
