package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0Ia */
/* loaded from: classes.dex */
public class C04000Ia {
    public static volatile C04000Ia A06;
    public AtomicInteger A00 = new AtomicInteger();
    public boolean A01 = false;
    public final C01B A02;
    public final C003701t A03;
    public final AnonymousClass035 A04;
    public final C004902f A05;

    public C04000Ia(C003701t c003701t, C004902f c004902f, C01B c01b, AnonymousClass035 anonymousClass035) {
        this.A03 = c003701t;
        this.A05 = c004902f;
        this.A02 = c01b;
        this.A04 = anonymousClass035;
    }

    public static C04000Ia A00() {
        if (A06 == null) {
            synchronized (C04000Ia.class) {
                if (A06 == null) {
                    A06 = new C04000Ia(C003701t.A00(), C004902f.A00(), C01B.A00(), AnonymousClass035.A00());
                }
            }
        }
        return A06;
    }

    public C05070Ne A01(String str, InterfaceC05060Nd interfaceC05060Nd) {
        return new C05070Ne(this.A04, str, this.A05.A02(), interfaceC05060Nd, A06(), A05());
    }

    public InterfaceC02170Ad A02(URL url, long j, long j2, C05080Nf c05080Nf) {
        Pair A0H = C002701i.A0H(this.A04, url, this.A05.A02(), j, j2, c05080Nf, A06(), A05(), this.A03.A0C(72));
        return new C0JL((HttpURLConnection) A0H.first, (Boolean) A0H.second);
    }

    public final InterfaceC02170Ad A03(URL url, String str, String str2) {
        C0XK c0xk;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        if (A06()) {
            C0XK A03 = this.A04.A03(false);
            c0xk = A03;
            if (A05()) {
                httpsURLConnection.setHostnameVerifier(new C0XL(str, HttpsURLConnection.getDefaultHostnameVerifier()));
                c0xk = A03;
            }
        } else {
            c0xk = this.A04.A04();
        }
        int A92 = c0xk.A92();
        httpsURLConnection.setSSLSocketFactory(c0xk);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str2);
        httpsURLConnection.setRequestProperty("Host", str);
        httpsURLConnection.setRequestProperty("User-Agent", this.A05.A02());
        try {
            httpsURLConnection.connect();
            return new C0JL(httpsURLConnection, Boolean.valueOf(c0xk.A92() == A92));
        } catch (IllegalArgumentException e) {
            throw new IOException(e);
        }
    }

    public void A04() {
        if (this.A00.addAndGet(1) > 15) {
            Log.i("Disable WATLS stack.");
            this.A01 = true;
        }
    }

    public boolean A05() {
        if (A06()) {
            C003701t c003701t = this.A03;
            if (c003701t.A0D(58)) {
                return c003701t.A0C(58);
            }
            return this.A02.A0E(C01C.A2c);
        }
        return false;
    }

    public final boolean A06() {
        if (this.A01) {
            return false;
        }
        C003701t c003701t = this.A03;
        if (c003701t.A0D(48)) {
            return c003701t.A0C(48);
        }
        return this.A02.A0E(C01C.A2b);
    }
}
