package X;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: X.1ra */
/* loaded from: classes2.dex */
public class C40101ra {
    public static final ConnPerRoute A0H = new ConnPerRoute() { // from class: X.2mH
        public final int getMaxForRoute(HttpRoute httpRoute) {
            return 2;
        }
    };
    public String A00;
    public final Context A02;
    public final AbstractC000600i A03;
    public final C03310Fe A04;
    public final C55652ly A05;
    public final C49792Mk A06;
    public final C000800k A07;
    public final AnonymousClass034 A08;
    public final C02F A09;
    public final InterfaceC002901k A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final SSLSocketFactory A0F;
    public final DefaultHttpClient A0G;
    public final AtomicInteger A0E = new AtomicInteger(0);
    public boolean A01 = true;

    public C40101ra(Context context, AbstractC000600i abstractC000600i, C004902f c004902f, C0EL c0el, AnonymousClass034 anonymousClass034, C03310Fe c03310Fe, C49792Mk c49792Mk, C02F c02f, String str, C000800k c000800k, InterfaceC002901k interfaceC002901k, String str2) {
        String str3;
        this.A02 = context;
        this.A03 = abstractC000600i;
        this.A08 = anonymousClass034;
        this.A04 = c03310Fe;
        this.A06 = c49792Mk;
        this.A09 = c02f;
        this.A0B = str;
        this.A07 = c000800k;
        this.A0A = interfaceC002901k;
        synchronized (c004902f) {
            if (c004902f.A01 == null) {
                c004902f.A01 = C004902f.A01(c004902f.A02, "2.21.9.15");
            }
            str3 = c004902f.A01;
        }
        this.A0D = str3;
        this.A0F = new SSLSocketFactory(c0el) { // from class: X.2m2
            public final C0EL A01;
            public final SSLSocketFactory A02 = C40731sm.A0Y();
            public final int A00 = 3;

            {
                this.A01 = c0el;
            }

            @Override // javax.net.SocketFactory
            public Socket createSocket(String str4, int i) {
                return new C55682m1((SSLSocket) this.A02.createSocket(str4, i), this.A00, this.A01);
            }

            @Override // javax.net.SocketFactory
            public Socket createSocket(String str4, int i, InetAddress inetAddress, int i2) {
                return new C55682m1((SSLSocket) this.A02.createSocket(str4, i, inetAddress, i2), this.A00, this.A01);
            }

            @Override // javax.net.SocketFactory
            public Socket createSocket(InetAddress inetAddress, int i) {
                return new C55682m1((SSLSocket) this.A02.createSocket(inetAddress, i), this.A00, this.A01);
            }

            @Override // javax.net.SocketFactory
            public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
                return new C55682m1((SSLSocket) this.A02.createSocket(inetAddress, i, inetAddress2, i2), this.A00, this.A01);
            }

            @Override // javax.net.ssl.SSLSocketFactory
            public Socket createSocket(Socket socket, String str4, int i, boolean z) {
                return new C55682m1((SSLSocket) this.A02.createSocket(socket, str4, i, z), this.A00, this.A01);
            }

            @Override // javax.net.ssl.SSLSocketFactory
            public String[] getDefaultCipherSuites() {
                return this.A02.getDefaultCipherSuites();
            }

            @Override // javax.net.ssl.SSLSocketFactory
            public String[] getSupportedCipherSuites() {
                return this.A02.getSupportedCipherSuites();
            }
        };
        C55652ly c55652ly = new C55652ly(c0el);
        this.A05 = c55652ly;
        C55672m0 c55672m0 = new C55672m0(c0el);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        basicHttpParams.setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, A0H);
        ConnManagerParams.getMaxConnectionsPerRoute(basicHttpParams).getMaxForRoute(new HttpRoute(new HttpHost("backup.googleapis.com")));
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, true);
        HttpProtocolParams.setUserAgent(basicHttpParams, this.A0D);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("https", new LayeredSocketFactory() { // from class: X.2mK
            public final SSLSocketFactory A00 = C40731sm.A0Y();

            @Override // org.apache.http.conn.scheme.SocketFactory
            public Socket connectSocket(Socket socket, String str4, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
                if (socket == null) {
                    socket = createSocket();
                }
                socket.bind(new InetSocketAddress(inetAddress, i2));
                socket.connect(new InetSocketAddress(str4, i), HttpConnectionParams.getConnectionTimeout(httpParams));
                socket.setSoTimeout(HttpConnectionParams.getSoTimeout(httpParams));
                return this.A00.createSocket(socket, str4, i, true);
            }

            @Override // org.apache.http.conn.scheme.SocketFactory
            public Socket createSocket() {
                return this.A00.createSocket();
            }

            @Override // org.apache.http.conn.scheme.LayeredSocketFactory
            public Socket createSocket(Socket socket, String str4, int i, boolean z) {
                return this.A00.createSocket(socket, str4, i, z);
            }

            @Override // org.apache.http.conn.scheme.SocketFactory
            public boolean isSecure(Socket socket) {
                return socket instanceof SSLSocket;
            }
        }, 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        defaultHttpClient.setRoutePlanner(new DefaultHttpRoutePlanner(schemeRegistry));
        defaultHttpClient.addResponseInterceptor(c55672m0);
        defaultHttpClient.addRequestInterceptor(c55652ly);
        this.A0G = defaultHttpClient;
        this.A0C = str2;
    }

    public static String A00(String str) {
        return new URI("https", null, "backup.googleapis.com", -1, str, null, null).toASCIIString().replaceAll("\\+", "%2B");
    }

    public static HttpResponse A01(C40101ra c40101ra, HttpRequestBase httpRequestBase) {
        if (c40101ra != null) {
            httpRequestBase.getURI();
            httpRequestBase.setHeader("Host", "backup.googleapis.com");
            StringBuilder sb = new StringBuilder("Bearer ");
            sb.append(c40101ra.A00);
            httpRequestBase.setHeader("Authorization", sb.toString());
            return c40101ra.A0G.execute(httpRequestBase);
        }
        throw null;
    }

    public static void A02(AbstractC000600i abstractC000600i, String str, int i) {
        if (i < 400 || i >= 500) {
            return;
        }
        String A0H2 = C000200d.A0H("gdrive-api-v2/unhandled/error/", str);
        StringBuilder sb = new StringBuilder("status-code = ");
        sb.append(i);
        abstractC000600i.A09(A0H2, sb.toString(), false);
    }

    public static final boolean A03(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        StringBuilder A0P = C000200d.A0P("gdrive-api-v2/rename-local/file/failed ");
        A0P.append(file.getAbsolutePath());
        A0P.append(" -> ");
        A0P.append(file2.getAbsolutePath());
        Log.e(A0P.toString());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair A04(java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40101ra.A04(java.lang.String, int, java.lang.String, java.lang.String):android.util.Pair");
    }

    public C40171rh A05(String str) {
        HttpURLConnection httpURLConnection;
        if (A09()) {
            Log.i("gdrive-api-v2/get-backup/api disabled");
            return null;
        }
        TrafficStats.setThreadStatsTag(13);
        try {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("clients/wa/backups/");
                sb.append(str);
                httpURLConnection = A06("GET", sb.toString(), null, null, false);
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        C40171rh A00 = C40171rh.A00(this.A03, this.A04, this, str, httpURLConnection.getInputStream());
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return A00;
                    } else if (responseCode == 401) {
                        A08();
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return null;
                    } else if (responseCode != 403) {
                        if (responseCode != 404) {
                            httpURLConnection.getURL();
                            String A0D = AnonymousClass024.A0D(httpURLConnection.getErrorStream());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("gdrive-api-v2/get-backup/failed ");
                            sb2.append(A0D);
                            Log.e(sb2.toString());
                            throw new C640131s(A0D);
                        }
                        throw new C639331k(AnonymousClass024.A0D(httpURLConnection.getErrorStream()));
                    } else {
                        throw new C639831p();
                    }
                } catch (IOException e) {
                    e = e;
                    Log.e(e);
                    throw new C640131s(e.getMessage());
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    public HttpURLConnection A06(String str, String str2, Map map, String str3, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/v1/");
            sb.append(str2);
            return A07(str, new URI("https", null, "backup.googleapis.com", -1, sb.toString(), null, null).toASCIIString(), map, str3, z);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
    }

    public HttpURLConnection A07(String str, String str2, Map map, String str3, boolean z) {
        String str4 = this.A0C;
        if (str4 != null) {
            if (map == null) {
                map = new HashMap(1);
            }
            C000700j.A08(true ^ map.containsKey("mode"), "mode param should not be included in params");
            map.put("mode", str4);
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(C40061rW.A0C(str2, map)).openConnection();
        httpsURLConnection.setSSLSocketFactory(this.A0F);
        httpsURLConnection.setRequestProperty("Host", "backup.googleapis.com");
        httpsURLConnection.setHostnameVerifier(new C0XL("backup.googleapis.com", new BrowserCompatHostnameVerifier()));
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(this.A00);
        httpsURLConnection.setRequestProperty("Authorization", sb.toString());
        httpsURLConnection.setRequestProperty("User-Agent", this.A0D);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str);
        if (str3 != null) {
            httpsURLConnection.setRequestProperty("Content-Type", str3);
        }
        httpsURLConnection.setDoOutput(z);
        this.A0E.incrementAndGet();
        return httpsURLConnection;
    }

    public boolean A08() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-api-v2/auth-request asking GoogleAuthUtil for auth token: ");
            String str = this.A0B;
            sb.append(C40061rW.A0B(str));
            Log.i(sb.toString());
            final String str2 = this.A00;
            if (str2 != null) {
                Context context = this.A02;
                C07K.A1U("Calling this from your main thread can lead to deadlock");
                C226313g.A02(context);
                final Bundle bundle = new Bundle();
                String str3 = context.getApplicationInfo().packageName;
                bundle.putString("clientPackageName", str3);
                if (!bundle.containsKey("androidPackageName")) {
                    bundle.putString("androidPackageName", str3);
                }
                C226313g.A00(context, C226313g.A00, new InterfaceC226413h() { // from class: X.1aa
                    @Override // X.InterfaceC226413h
                    public final /* synthetic */ Object AX6(IBinder iBinder) {
                        InterfaceC233816k c31461cJ;
                        if (iBinder == null) {
                            c31461cJ = null;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            if (queryLocalInterface instanceof InterfaceC233816k) {
                                c31461cJ = (InterfaceC233816k) queryLocalInterface;
                            } else {
                                c31461cJ = new C31461cJ(iBinder);
                            }
                        }
                        Bundle AWe = c31461cJ.AWe(str2, bundle);
                        C226313g.A03(AWe);
                        String string = AWe.getString("Error");
                        if (AWe.getBoolean("booleanResult")) {
                            return null;
                        }
                        throw new C0TP(string);
                    }
                });
            }
            this.A00 = C30331aK.A04(this.A02, str);
            Log.i("gdrive-api-v2/auth-request/received-auth-token");
            return true;
        } catch (C39441q8 e) {
            Log.e("gdrive-api-v2/auth-request Google Play services is unavailable, if it was unavailable from the beginning code would not have reached here, so, most likely it became unavailable while the backup/restore was in progress");
            Log.e("gdrive-api-v2/auth-request", e);
            this.A00 = null;
            throw new C639631n(e);
        } catch (C0TO e2) {
            StringBuilder A0P = C000200d.A0P("gdrive-api-v2/auth-request permission to access Google Drive for ");
            A0P.append(C40061rW.A0B(this.A0B));
            A0P.append(" is not available and we cannot ask user for permission either.");
            Log.i(A0P.toString());
            throw new C639631n(e2);
        } catch (C0TP e3) {
            Log.e("gdrive-api-v2/auth-request", e3);
            if (!"BadUsername".equals(e3.getMessage())) {
                if ("ServiceUnavailable".equals(e3.getMessage())) {
                    return false;
                }
                this.A00 = null;
                throw new C639631n(e3);
            }
            throw new C639531m(e3);
        } catch (IOException e4) {
            Log.e("gdrive-api-v2/auth-request", e4);
            this.A00 = null;
            return false;
        } catch (NullPointerException e5) {
            StringBuilder A0P2 = C000200d.A0P("gdrive-api-v2/auth-request unexpected NullPointerException while trying to get  auth token for the account ");
            A0P2.append(C40061rW.A0B(this.A0B));
            Log.e(A0P2.toString());
            Log.e("gdrive-api-v2/auth-request", e5);
            this.A00 = null;
            throw new C639631n(e5);
        } catch (SecurityException e6) {
            Log.e("gdrive-api-v2/auth-request", e6);
            this.A00 = null;
            throw new C639631n(e6);
        }
    }

    public synchronized boolean A09() {
        return !this.A01;
    }

    public final boolean A0A(File file, long j, String str) {
        String A09 = C40061rW.A09(this.A08, this.A09, file, j);
        if (str.equals(A09)) {
            return true;
        }
        StringBuilder A0P = C000200d.A0P("gdrive-api-v2/save-file/check-md5 ");
        A0P.append(file.getAbsolutePath());
        A0P.append(" downloaded but its MD5(");
        A0P.append(A09);
        A0P.append(") does not match remote md5(");
        A0P.append(str);
        A0P.append(").");
        Log.e(A0P.toString());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x00ea, code lost:
        if (A0A(r8, r8.length(), r35.A02) == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x024f, code lost:
        com.whatsapp.util.Log.i(java.lang.String.format(java.util.Locale.ENGLISH, "gdrive-util/write-file/disconnected after downloading %d bytes from %s to %s (new size: %d)", java.lang.Long.valueOf(r6), r12.getURL(), r8.getAbsolutePath(), java.lang.Long.valueOf(r8.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x034e, code lost:
        if (r4 == null) goto L139;
     */
    /* JADX WARN: Not initialized variable reg: 31, insn: 0x033f: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r31 I:??[OBJECT, ARRAY]), block:B:344:0x033f */
    /* JADX WARN: Removed duplicated region for block: B:247:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0B(java.io.File r34, X.C40051rV r35, X.InterfaceC40331s1 r36, X.AbstractC40111rb r37) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40101ra.A0B(java.io.File, X.1rV, X.1s1, X.1rb):boolean");
    }
}
