package X;

import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.2MQ */
/* loaded from: classes2.dex */
public abstract class C2MQ {
    public static volatile C2MQ A09;
    public long A00 = -1;
    public WeakReference A01;
    public final AnonymousClass012 A02;
    public final C002301c A03;
    public final C50212Qr A04;
    public final AnonymousClass011 A05;
    public final C455822q A06;
    public final C004902f A07;
    public final InterfaceC002901k A08;

    public C2MQ(AnonymousClass012 anonymousClass012, C455822q c455822q, C004902f c004902f, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C002301c c002301c, C50212Qr c50212Qr) {
        this.A02 = anonymousClass012;
        this.A06 = c455822q;
        this.A07 = c004902f;
        this.A08 = interfaceC002901k;
        this.A05 = anonymousClass011;
        this.A03 = c002301c;
        this.A04 = c50212Qr;
    }

    public final AbstractC61452wB A00() {
        AbstractC61452wB c3c0;
        AbstractC61452wB abstractC61452wB;
        C000700j.A01();
        WeakReference weakReference = this.A01;
        if (weakReference == null || (abstractC61452wB = (AbstractC61452wB) weakReference.get()) == null || this.A02.A05() - this.A00 >= TimeUnit.HOURS.toMillis(4L) || abstractC61452wB.A02) {
            if (!(this instanceof C53702hN)) {
                c3c0 = new C66653Bx((C53712hO) this);
            } else {
                c3c0 = new C3C0((C53702hN) this);
            }
            this.A01 = new WeakReference(c3c0);
            this.A00 = this.A02.A05();
            return c3c0;
        }
        return abstractC61452wB;
    }

    public AbstractC61452wB A01(CharSequence charSequence, boolean z) {
        if (!(this instanceof C53702hN)) {
            return new C66663By((C53712hO) this, charSequence, z);
        }
        return new C3C1((C53702hN) this, charSequence, z);
    }

    public final HttpsURLConnection A02(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setRequestProperty("User-Agent", this.A07.A02());
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.connect();
        return httpsURLConnection;
    }
}
