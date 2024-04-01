package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0Qu */
/* loaded from: classes.dex */
public class C05920Qu {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C26901Le A07;
    public C72973at A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public byte[] A0F;
    public final String A0G;
    public static final Pattern A0I = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0M = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public static final Pattern A0L = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0K = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0J = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\')", 34);
    public static final Pattern A0H = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);

    public boolean A0D() {
        return false;
    }

    public C05920Qu(String str) {
        this.A0G = str;
    }

    public static final String A00(String str) {
        Uri parse;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(C04310Jr.A03(str, C04310Jr.A03))) != null) {
            String host = parse.getHost();
            if ("pbs.twimg.com".equalsIgnoreCase(host) || "www.pbs.twimg.com".equalsIgnoreCase(host)) {
                if (str.endsWith(":small")) {
                    return str.replace(":small", ":thumb");
                }
                if (str.endsWith(":medium")) {
                    return str.replace(":medium", ":thumb");
                }
                if (!str.endsWith(":large")) {
                    return str;
                }
                return str.replace(":large", ":thumb");
            }
            return str;
        }
        return str;
    }

    public static final String A01(URL url, String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
            if (str.startsWith("//")) {
                StringBuilder sb = new StringBuilder();
                sb.append(url.getProtocol());
                sb.append(":");
                sb.append(str);
                return sb.toString();
            }
            try {
                str2 = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), str2, null, null).toURL().toString();
                return str2;
            } catch (MalformedURLException e) {
                Log.e("WebPageInfo/parseHtml", e);
                return str2;
            } catch (URISyntaxException unused) {
                return str2;
            }
        }
        return str2;
    }

    public static String A02(HashMap hashMap, String... strArr) {
        for (String str : strArr) {
            String str2 = (String) hashMap.get(str);
            if (str2 != null) {
                return str2.trim();
            }
        }
        return null;
    }

    public static HttpURLConnection A03(URL url, String str) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        httpURLConnection.setReadTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        if (str != null) {
            httpURLConnection.setRequestProperty("Accept-Language", str);
        }
        StringBuilder A0P = C000200d.A0P("WhatsApp/");
        A0P.append("2.21.9.15".replace(' ', '_'));
        A0P.append(" A");
        httpURLConnection.setRequestProperty("User-Agent", A0P.toString());
        return httpURLConnection;
    }

    public static HashMap A04(String str) {
        HashMap hashMap = new HashMap();
        Matcher matcher = A0J.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null) {
                group2 = matcher.group(3);
            }
            hashMap.put(group, group2);
        }
        return hashMap;
    }

    public static void A05(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            AnonymousClass024.A0R(httpURLConnection.getInputStream());
        } catch (IOException unused) {
        }
        httpURLConnection.disconnect();
    }

    public static byte[] A06(Bitmap bitmap) {
        int min = Math.min(140, Math.min(bitmap.getWidth(), bitmap.getHeight()));
        int min2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, new Rect((bitmap.getWidth() - min2) >> 1, (bitmap.getHeight() - min2) >> 1, (bitmap.getWidth() + min2) >> 1, (bitmap.getHeight() + min2) >> 1), new Rect(0, 0, min, min), paint);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final C26901Le A07(String str, String str2, int i) {
        HttpURLConnection A03;
        if (!"image/gif".equals(str2) || i == -1) {
            return null;
        }
        if (str.endsWith("giphy.gif")) {
            try {
                if (new URI(str).getHost().contains("giphy.com")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.substring(0, str.length() - 9));
                    sb.append("200.mp4");
                    str = sb.toString();
                    try {
                        A03 = A03(new URL(str), null);
                        if (A03 != null) {
                            try {
                                try {
                                    String headerField = A03.getHeaderField("Content-Type");
                                    if (headerField.equals("video/mp4")) {
                                        C26901Le c26901Le = new C26901Le(str, A03.getContentLength(), headerField);
                                        A05(A03);
                                        return c26901Le;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    A05(A03);
                                    throw th;
                                }
                            } catch (IOException e) {
                                e = e;
                                Log.e("IOException", e);
                                A05(A03);
                                return new C26901Le(str, i, str2);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th2) {
                        th = th2;
                        A05(A03);
                        throw th;
                    }
                    A05(A03);
                }
            } catch (URISyntaxException e3) {
                Log.w("Unable to create uri", e3);
            }
        }
        return new C26901Le(str, i, str2);
    }

    public final C26901Le A08(Map map, String... strArr) {
        C26901Le A07;
        int length = strArr.length;
        int i = 0;
        while (true) {
            HttpURLConnection httpURLConnection = null;
            if (i >= length) {
                return null;
            }
            String str = (String) map.get(strArr[i]);
            if (str != null && Patterns.WEB_URL.matcher(str).matches()) {
                try {
                    try {
                        httpURLConnection = A03(new URL(str), null);
                        if (httpURLConnection != null && (A07 = A07(str, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength())) != null) {
                            return A07;
                        }
                    } catch (IOException e) {
                        Log.e(e);
                    }
                } finally {
                    A05(httpURLConnection);
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x0238, code lost:
        if ("video/mp4".equalsIgnoreCase((java.lang.String) r30.get("og:video:type")) == false) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A09(java.net.URL r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, int r39) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05920Qu.A09(java.net.URL, java.lang.String, java.lang.String, java.lang.String, int):java.lang.String");
    }

    public void A0A() {
        this.A0D = null;
        this.A0A = null;
        this.A09 = null;
        this.A0B = null;
        this.A0E = false;
        this.A02 = 0;
    }

    public void A0B(String str) {
        this.A03 = 0L;
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        URL url = new URL(str);
        if (str.equals(URLDecoder.decode(str, "UTF-8"))) {
            url = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
        }
        HttpURLConnection A03 = A03(url, null);
        if (A03 == null) {
            return;
        }
        A03.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        A03.setReadTimeout(20000);
        InputStream inputStream = A03.getInputStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            int i = 0;
            do {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStream.close();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    int i2 = options.outWidth;
                    this.A01 = i2;
                    int i3 = options.outHeight;
                    this.A00 = i3;
                    if (i2 >= 100 && i3 >= 100) {
                        options.inDither = true;
                        options.inScaled = false;
                        options.inPreferQualityOverSpeed = true;
                        Bitmap bitmap = C002701i.A0N(byteArray, new C0DH(140, 140, null, true, options)).A02;
                        if (bitmap != null) {
                            byte[] A06 = A06(bitmap);
                            this.A0F = A06;
                            this.A04 = A06.length;
                            bitmap.recycle();
                        }
                    }
                    this.A03 = System.currentTimeMillis() - currentTimeMillis;
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i += read;
            } while (i <= 307200);
            this.A04 = Long.MAX_VALUE;
            this.A03 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb = new StringBuilder();
            sb.append("image too large ");
            sb.append(str);
            throw new IOException(sb.toString()) { // from class: X.1Lf
            };
        } finally {
        }
    }

    public boolean A0C() {
        boolean z;
        boolean z2 = !TextUtils.isEmpty(this.A0D);
        boolean z3 = !TextUtils.isEmpty(this.A0A);
        C26901Le c26901Le = this.A07;
        if (c26901Le != null) {
            String str = c26901Le.A01;
            if ("image/gif".equals(str) || "video/mp4".equals(str)) {
                z = true;
                return !z2 ? true : true;
            }
        }
        z = false;
        return !z2 ? true : true;
    }
}
