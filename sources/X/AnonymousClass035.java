package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.security.KeyManagementException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: X.035 */
/* loaded from: classes.dex */
public class AnonymousClass035 {
    public static volatile AnonymousClass035 A0I;
    public C0QP A00;
    public C09220cs A01;
    public C0XK A02;
    public C0XK A03;
    public C0PE A04;
    public final C01B A05;
    public final C001200o A06;
    public final C003701t A07;
    public final C03L A08;
    public final C03M A09;
    public final C03O A0A;
    public final C03G A0B;
    public final C03H A0C;
    public final C03P A0D;
    public final C03N A0E;
    public final C03I A0F;
    public final C03R A0G;
    public final String A0H;

    public AnonymousClass035(C003701t c003701t, C001200o c001200o, C01B c01b, C03G c03g, C03I c03i, C03L c03l, C03H c03h, C03M c03m, C03N c03n, C03O c03o, C03P c03p, C03R c03r) {
        this.A07 = c003701t;
        this.A06 = c001200o;
        this.A05 = c01b;
        this.A0B = c03g;
        this.A0F = c03i;
        this.A08 = c03l;
        this.A0C = c03h;
        this.A09 = c03m;
        this.A0E = c03n;
        this.A0A = c03o;
        this.A0D = c03p;
        this.A0G = c03r;
        if (c03o != null) {
            this.A0H = "TLS_AES_128_GCM_SHA256";
            return;
        }
        throw null;
    }

    public static AnonymousClass035 A00() {
        C03L c03l;
        C03H c03h;
        C03P c03p;
        C03Q c03q;
        C03H c03h2;
        if (A0I == null) {
            synchronized (AnonymousClass035.class) {
                if (A0I == null) {
                    C003701t A00 = C003701t.A00();
                    C001200o c001200o = C001200o.A01;
                    C01B A002 = C01B.A00();
                    if (C03G.A01 == null) {
                        synchronized (C03G.class) {
                            if (C03G.A01 == null) {
                                synchronized (C03H.class) {
                                    c03h2 = C03H.A00;
                                    if (c03h2 == null) {
                                        c03h2 = new C03H();
                                        C03H.A00 = c03h2;
                                    }
                                }
                                C03G.A01 = new C03G(c03h2);
                            }
                        }
                    }
                    C03G c03g = C03G.A01;
                    if (C03I.A04 == null) {
                        synchronized (C03I.class) {
                            if (C03I.A04 == null) {
                                C03I.A04 = new C03I(C03J.A02());
                            }
                        }
                    }
                    C03I c03i = C03I.A04;
                    synchronized (C03L.class) {
                        c03l = C03L.A04;
                        if (c03l == null) {
                            c03l = new C03L();
                            C03L.A04 = c03l;
                        }
                    }
                    synchronized (C03H.class) {
                        c03h = C03H.A00;
                        if (c03h == null) {
                            c03h = new C03H();
                            C03H.A00 = c03h;
                        }
                    }
                    if (C03M.A00 == null) {
                        synchronized (C03M.class) {
                            if (C03M.A00 == null) {
                                C03M.A00 = new C03M();
                            }
                        }
                    }
                    C03M c03m = C03M.A00;
                    if (C03N.A00 == null) {
                        synchronized (C03N.class) {
                            if (C03N.A00 == null) {
                                C03N.A00 = new C03N();
                            }
                        }
                    }
                    C03N c03n = C03N.A00;
                    C03O A003 = C03O.A00();
                    synchronized (C03P.class) {
                        c03p = C03P.A01;
                        if (c03p == null) {
                            synchronized (C03Q.class) {
                                c03q = C03Q.A00;
                                if (c03q == null) {
                                    c03q = new C03Q();
                                    C03Q.A00 = c03q;
                                }
                            }
                            c03p = new C03P(c03q);
                            C03P.A01 = c03p;
                        }
                    }
                    A0I = new AnonymousClass035(A00, c001200o, A002, c03g, c03i, c03l, c03h, c03m, c03n, A003, c03p, C03R.A02);
                }
            }
        }
        return A0I;
    }

    public synchronized C0QP A01() {
        C0QP c0qp;
        c0qp = this.A00;
        if (c0qp == null) {
            c0qp = new C0QP(this.A06.A00, this.A08);
            this.A00 = c0qp;
        }
        return c0qp;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0cs] */
    public synchronized C09220cs A02() {
        C09220cs c09220cs;
        C09220cs c09220cs2 = this.A01;
        c09220cs = c09220cs2;
        if (c09220cs2 == null) {
            ?? r2 = new C0PF(this.A06.A00, this.A08) { // from class: X.0cs
                public static final TrustManager[] A00 = {new X509TrustManager() { // from class: X.2b8
                    @Override // javax.net.ssl.X509TrustManager
                    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }
                }};

                @Override // X.C0PF
                public SSLSocketFactory A02(SSLContext sSLContext, SSLSessionCache sSLSessionCache) {
                    try {
                        sSLContext.init(null, A00, null);
                        return sSLContext.getSocketFactory();
                    } catch (KeyManagementException e) {
                        Log.e(e);
                        throw new RuntimeException(e);
                    }
                }
            };
            this.A01 = r2;
            c09220cs = r2;
        }
        return c09220cs;
    }

    public synchronized C0XK A03(boolean z) {
        if (z) {
            C0XK c0xk = this.A03;
            if (c0xk == null) {
                c0xk = new C0XK(this.A07, this.A0B, this.A0F, this.A0C, this.A09, this.A0E, this.A0A, this.A0D, this.A0G, this.A0H) { // from class: X.1MD
                    @Override // X.C0XK
                    public boolean A01() {
                        return this.A00.A0C(311);
                    }
                };
                this.A03 = c0xk;
            }
            return c0xk;
        }
        C0XK c0xk2 = this.A02;
        if (c0xk2 == null) {
            c0xk2 = new C0XK(this.A07, this.A0B, this.A0F, this.A0C, this.A09, this.A0E, this.A0A, this.A0D, this.A0G, this.A0H) { // from class: X.1ME
                @Override // X.C0XK
                public boolean A01() {
                    return this.A00.A0C(312);
                }
            };
            this.A02 = c0xk2;
        }
        return c0xk2;
    }

    public synchronized C0PE A04() {
        C0PE c0pe;
        c0pe = this.A04;
        if (c0pe == null) {
            c0pe = new C0PE(this.A06.A00, this.A08);
            this.A04 = c0pe;
        }
        return c0pe;
    }
}
