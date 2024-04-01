package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1qq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39861qq extends AbstractC31511cO {
    public static final byte[] A02 = "\n".getBytes();
    public final C17Z A00;
    public final String A01;

    public C39861qq(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
        String str;
        String str2 = AnonymousClass175.A00;
        String str3 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                str = sb.toString();
                this.A01 = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", str2, str3, str, Build.MODEL, Build.ID);
                this.A00 = new C17Z(anonymousClass176.A03);
            }
        }
        str = null;
        this.A01 = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", str2, str3, str, Build.MODEL, Build.ID);
        this.A00 = new C17Z(anonymousClass176.A03);
    }

    public static void A02(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    @Override // X.AbstractC31511cO
    public final void A0D() {
        A06("Network initialized. User agent", this.A01);
    }

    public final int A0E(URL url, byte[] bArr) {
        AnonymousClass176 anonymousClass176;
        C07K.A1P(url);
        C07K.A1P(bArr);
        int length = bArr.length;
        HttpURLConnection httpURLConnection = null;
        A02(3, "POST bytes, url", Integer.valueOf(length), url, null);
        if (Log.isLoggable((String) C17L.A0C.A00, 2)) {
            A06("Post payload\n", new String(bArr));
        }
        OutputStream outputStream = null;
        try {
            anonymousClass176 = ((AnonymousClass174) this).A00;
            anonymousClass176.A00.getPackageName();
            httpURLConnection = A0G(url);
        } catch (IOException e) {
            e = e;
        }
        try {
            try {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setFixedLengthStreamingMode(length);
                httpURLConnection.connect();
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                A0H(httpURLConnection);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    C39761qg c39761qg = anonymousClass176.A04;
                    AnonymousClass176.A01(c39761qg);
                    c39761qg.A0E();
                }
                A07("POST status", Integer.valueOf(responseCode));
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    A09("Error closing http post connection output stream", e2);
                }
                httpURLConnection.disconnect();
                return responseCode;
            } finally {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e3) {
                        A09("Error closing http post connection output stream", e3);
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        } catch (IOException e4) {
            e = e4;
            A08("Network POST connection error", e);
        }
    }

    public final String A0F(C17P c17p, boolean z) {
        long j;
        String valueOf;
        C07K.A1P(c17p);
        StringBuilder sb = new StringBuilder();
        try {
            Map map = c17p.A03;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    A02(sb, str, (String) entry.getValue());
                }
            }
            long j2 = c17p.A02;
            A02(sb, "ht", String.valueOf(j2));
            if (((AnonymousClass174) this).A00.A03 != null) {
                A02(sb, "qt", String.valueOf(System.currentTimeMillis() - j2));
                if (z) {
                    C07K.A1T("_s");
                    C07K.A1b(true, "Short param name required");
                    String str2 = (String) map.get("_s");
                    if (str2 == null) {
                        str2 = "0";
                    }
                    try {
                        j = Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                        j = 0;
                    }
                    if (j == 0) {
                        valueOf = String.valueOf(c17p.A01);
                    } else {
                        valueOf = String.valueOf(j);
                    }
                    A02(sb, "z", valueOf);
                }
                return sb.toString();
            }
            throw null;
        } catch (UnsupportedEncodingException e) {
            A09("Failed to encode name or value", e);
            return null;
        }
    }

    public final HttpURLConnection A0G(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(((Number) C17L.A02.A00).intValue());
            httpURLConnection.setReadTimeout(((Number) C17L.A03.A00).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.A01);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public final void A0H(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            try {
                inputStream.close();
            } catch (IOException e) {
                A09("Error closing http connection input stream", e);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e2) {
                    A09("Error closing http connection input stream", e2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final boolean A0I() {
        C13H.A00();
        A0C();
        NetworkInfo networkInfo = null;
        try {
            networkInfo = ((ConnectivityManager) ((AnonymousClass174) this).A00.A00.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            A03("No network connectivity");
            return false;
        }
        return true;
    }
}
