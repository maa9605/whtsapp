package X;

import android.app.Application;
import android.content.Context;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.msys.mci.DefaultUUID;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.JsonSerialization;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.msys.util.Provider;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.security.SecureRandom;

/* renamed from: X.1xH  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43361xH {
    public static volatile C43361xH A08;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final C01M A04;
    public final JniBridge A05;
    public final C43441xP A06;
    public final C43451xQ A07;

    public C43361xH(JniBridge jniBridge, C01M c01m, C43441xP c43441xP, C43451xQ c43451xQ) {
        this.A05 = jniBridge;
        this.A04 = c01m;
        this.A06 = c43441xP;
        this.A07 = c43451xQ;
    }

    public static C43361xH A00() {
        if (A08 == null) {
            synchronized (C43361xH.class) {
                JniBridge jniBridge = JniBridge.getInstance();
                C01M A00 = C01M.A00();
                if (C43441xP.A01 == null) {
                    synchronized (C43441xP.class) {
                        if (C43441xP.A01 == null) {
                            C43441xP.A01 = new C43441xP();
                        }
                    }
                }
                C43441xP c43441xP = C43441xP.A01;
                if (C43451xQ.A01 == null) {
                    synchronized (C43451xQ.class) {
                        if (C43451xQ.A01 == null) {
                            C43451xQ.A01 = new C43451xQ();
                        }
                    }
                }
                A08 = new C43361xH(jniBridge, A00, c43441xP, C43451xQ.A01);
            }
        }
        return A08;
    }

    public synchronized void A01() {
        if (this.A02) {
            JniBridge jniBridge = this.A05;
            if (jniBridge != null) {
                JniBridge.jvidispatchI();
                if (jniBridge.jniCallbacks != null) {
                    JniBridge.jvidispatchIO(0, jniBridge.getWajContext());
                    this.A02 = false;
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    public synchronized void A02(Application application) {
        if (this.A00) {
            return;
        }
        Log.i("WaMsysSetup/bootstrap");
        com.facebook.msys.mci.Log.registerLogger(new C0Iw());
        Proxies.configure(new ProxyProvider(ProxyProvider.newBuilder(new Provider() { // from class: X.1xR
            @Override // com.facebook.msys.util.Provider
            public Object get() {
                return DefaultCrypto.mCrypto;
            }
        }, new Provider() { // from class: X.1xS
            @Override // com.facebook.msys.util.Provider
            public Object get() {
                return DefaultUUID.mUUID;
            }
        })));
        Execution.initialize();
        FileManager.initialize(application.getCacheDir());
        this.A05.initWajContext();
        this.A00 = true;
    }

    public final synchronized void A03(Context context, C004902f c004902f, InterfaceC002901k interfaceC002901k, AnonymousClass035 anonymousClass035) {
        NotificationCenter notificationCenter;
        if (this.A03) {
            return;
        }
        C43451xQ c43451xQ = this.A07;
        NotificationCenter notificationCenter2 = new NotificationCenter();
        synchronized (c43451xQ) {
            c43451xQ.A00 = notificationCenter2;
        }
        String A02 = c004902f.A02();
        synchronized (c43451xQ) {
            notificationCenter = c43451xQ.A00;
            if (notificationCenter == null) {
                throw null;
            }
        }
        NetworkSession networkSession = new NetworkSession(A02, notificationCenter, new C43481xT(c004902f, interfaceC002901k, anonymousClass035, context.getCacheDir()));
        C43441xP c43441xP = this.A06;
        synchronized (c43441xP) {
            c43441xP.A00 = networkSession;
        }
        this.A03 = true;
    }

    public synchronized void A04(C001200o c001200o, C004902f c004902f, InterfaceC002901k interfaceC002901k, C002301c c002301c, AnonymousClass035 anonymousClass035, C000500h c000500h, String str) {
        NetworkSession networkSession;
        if (this.A02) {
            return;
        }
        Log.i("WaMsysSetup/bootstrapForReg");
        A02(c001200o.A00);
        A03(c001200o.A00, c004902f, interfaceC002901k, anonymousClass035);
        JniBridge jniBridge = this.A05;
        C43441xP c43441xP = this.A06;
        synchronized (c43441xP) {
            networkSession = c43441xP.A00;
            if (networkSession == null) {
                throw null;
            }
        }
        if (jniBridge.jniCallbacks != null) {
            if (0 != JniBridge.jvidispatchIOO(networkSession, jniBridge.getWajContext())) {
                JniBridge.jvidispatchIIOOOOO(0, c002301c.A04(), c002301c.A03(), str, c000500h.A0G(), jniBridge.getWajContext());
                JsonSerialization.initialize();
                this.A02 = true;
                return;
            }
            throw new IllegalStateException("wa-msys/failed to initialize WCRManager");
        }
        throw null;
    }

    public synchronized void A05(C001200o c001200o, C004902f c004902f, InterfaceC002901k interfaceC002901k, AnonymousClass035 anonymousClass035, C0J1 c0j1) {
        NetworkSession networkSession;
        if (this.A01) {
            return;
        }
        Log.i("WaMsysSetup/bootstrapForMMS");
        if (this.A04 != null) {
            try {
                byte[] bArr = new byte[32];
                SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                A03(c001200o.A00, c004902f, interfaceC002901k, anonymousClass035);
                JniBridge jniBridge = this.A05;
                C43441xP c43441xP = this.A06;
                synchronized (c43441xP) {
                    networkSession = c43441xP.A00;
                    if (networkSession == null) {
                        throw null;
                    }
                }
                if (jniBridge != null) {
                    JniBridge.jvidispatchIOOO(networkSession, c0j1, bArr);
                    JsonSerialization.initialize();
                    this.A01 = true;
                    return;
                }
                throw null;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        throw null;
    }
}
