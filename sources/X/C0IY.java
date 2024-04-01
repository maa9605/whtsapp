package X;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0IY */
/* loaded from: classes.dex */
public class C0IY extends AnonymousClass038 implements C0IZ {
    public static volatile C0IY A0L;
    public C02600Cb A00;
    public boolean A01;
    public boolean A02;
    public final AbstractC000600i A05;
    public final C01B A06;
    public final C010005b A07;
    public final AnonymousClass012 A08;
    public final C003701t A09;
    public final C04000Ia A0A;
    public final C0J3 A0B;
    public final C02O A0C;
    public final C0J4 A0D;
    public final C0J2 A0E;
    public final InterfaceC002901k A0F;
    public final C03R A0G;
    public volatile C05380Om A0K;
    public final Object A0I = new Object();
    public final Object A0H = new Object();
    public final AtomicBoolean A0J = new AtomicBoolean(false);
    public final Handler A04 = new Handler(Looper.getMainLooper()) { // from class: X.0J6
        {
            C0IY.this = this;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                C0IY.this.A05();
            }
        }
    };
    public final long A03 = 1000;

    public C0IY(AnonymousClass012 anonymousClass012, C003701t c003701t, C03R c03r, AbstractC000600i abstractC000600i, C0J2 c0j2, InterfaceC002901k interfaceC002901k, C01B c01b, C010005b c010005b, C04000Ia c04000Ia, C02O c02o, C03020Dv c03020Dv, C0J3 c0j3, C0J4 c0j4) {
        this.A08 = anonymousClass012;
        this.A09 = c003701t;
        this.A0G = c03r;
        this.A05 = abstractC000600i;
        this.A0E = c0j2;
        this.A0F = interfaceC002901k;
        this.A06 = c01b;
        this.A07 = c010005b;
        this.A0A = c04000Ia;
        this.A0C = c02o;
        this.A0B = c0j3;
        this.A0D = c0j4;
        c03020Dv.A01(this);
    }

    public static C0IY A00() {
        if (A0L == null) {
            synchronized (C0IY.class) {
                if (A0L == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C03R c03r = C03R.A02;
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    if (C0J2.A02 == null) {
                        synchronized (C0J2.class) {
                            if (C0J2.A02 == null) {
                                C0J2.A02 = new C0J2(C0HW.A00(), C04000Ia.A00());
                            }
                        }
                    }
                    A0L = new C0IY(A00, A002, c03r, A003, C0J2.A02, C002801j.A00(), C01B.A00(), C010005b.A07, C04000Ia.A00(), C02O.A00(), C03020Dv.A00(), C0J3.A00(), new C0J4());
                }
            }
        }
        return A0L;
    }

    public final C0J7 A02(String str, String str2, String str3, int i) {
        return new C0J7(C38001nO.A02(this.A08, this.A09, this.A0G, this.A05, this.A06, this, this.A07, this.A0A, A03(), str, str2, str3, i, this.A03, 0));
    }

    public C02600Cb A03() {
        C02600Cb c02600Cb;
        synchronized (this.A0H) {
            c02600Cb = this.A00;
        }
        return c02600Cb;
    }

    public void A04() {
        boolean z;
        Log.i("routeselector/requestroutesandwaitforauth");
        if (A0E() && A0D()) {
            Log.i("routeselector/requestroutesandwaitforauth/waiting for response");
            C000700j.A00();
            long uptimeMillis = SystemClock.uptimeMillis();
            while (A0D()) {
                C05380Om c05380Om = this.A0K;
                synchronized (c05380Om) {
                    z = c05380Om.A00 > 0;
                }
                if (!z) {
                    Log.w("routeselector/waitforroutingresponse/giving up because no request in flight");
                    return;
                }
                Object obj = this.A0I;
                synchronized (obj) {
                    try {
                        obj.wait(1000L);
                    } catch (InterruptedException e) {
                        Log.w("routeselector/waitforroutingresponse/interrupted while waiting on route selection", e);
                    }
                    if (A0D()) {
                        Log.w("routeselector/waitforroutingresponse/routing response still not available");
                    }
                    if (20000 + uptimeMillis < SystemClock.uptimeMillis()) {
                        Log.w("routeselector/waitforroutingresponse/waited too long for routing response! Give up");
                        return;
                    }
                }
            }
        }
    }

    public final void A05() {
        if (this.A0B.A01()) {
            Log.i("routeselector/requestupdatedroutinginfo throttled");
            return;
        }
        C05380Om c05380Om = this.A0K;
        C02600Cb A03 = A03();
        String str = A03 == null ? null : A03.A09;
        synchronized (c05380Om) {
            Log.i("routeselector/requestupdatedroutinginfo");
            if (c05380Om.A00 == 0) {
                C05Y c05y = c05380Om.A02;
                String A02 = c05y.A02();
                if (c05y.A0B(124, A02, new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "w:m", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("media_conn", str != null ? new C04P[]{new C04P("last_id", str, null, (byte) 0)} : null, null, null)), c05380Om, 32000L)) {
                    c05380Om.A00 = c05380Om.A01.A03();
                } else {
                    Log.i("app/sendgetmediaroutinginfo not sent");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/requestupdatedroutinginfo/not sending request; inFlightMediaRoutingRequestTime=");
            sb.append(c05380Om.A00);
            Log.w(sb.toString());
        }
    }

    public final void A06() {
        Log.i("routeselector/setuprouterequesttimer");
        C02600Cb A03 = A03();
        if (A03 == null) {
            return;
        }
        Handler handler = this.A04;
        handler.removeMessages(0);
        long A032 = (A03.A02 - this.A08.A03()) - 60000;
        C000200d.A0u("routeselector/settimerorupdateroutes/creating timer task with delay ", A032);
        handler.sendEmptyMessageDelayed(0, A032);
    }

    public final void A07() {
        if ((!A0C() || this.A01) && this.A02) {
            this.A0F.AS1(new Runnable() { // from class: X.1QI
                {
                    C0IY.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0IY.this.A0E();
                }
            });
        }
    }

    public void A08(int i) {
        C000200d.A0q("routeselector/onmediatransfererrororresponsecode/code ", i);
        if (i == 401 || i == 403) {
            A05();
        }
    }

    public void A09(int i, int i2) {
        long j;
        C000200d.A0r("routeselector/onmediaroutingrequesterror/code ", i);
        if (503 != i) {
            if (507 != i || i2 <= 0) {
                return;
            }
            C0J3 c0j3 = this.A0B;
            long j2 = i2;
            synchronized (c0j3) {
                long A05 = c0j3.A01.A05();
                long min = Math.min(j2, 10800L);
                Long.signum(min);
                c0j3.A00 = (min * 1000) + A05;
                StringBuilder sb = new StringBuilder();
                sb.append("ChatdMediaThrottleManager/setThrottle until ");
                sb.append(c0j3.A00);
                Log.i(sb.toString());
            }
            return;
        }
        C0J3 c0j32 = this.A0B;
        synchronized (c0j32) {
            j = 0;
            c0j32.A00 = 0L;
            Log.i("ChatdMediaThrottleManager/resetThrottle");
        }
        Handler handler = this.A04;
        C0J4 c0j4 = this.A0D;
        long A01 = c0j4.A00.A01();
        if (A01 != 0) {
            long j3 = A01 * 1000;
            j = ((3 * j3) / 4) + Math.abs(c0j4.A01.nextLong() % (j3 / 2));
            StringBuilder sb2 = new StringBuilder("fibonaccibackoffhandler/sleep/");
            sb2.append(j);
            sb2.append(" milliseconds");
            Log.i(sb2.toString());
        }
        handler.sendEmptyMessageDelayed(0, j);
    }

    public final void A0A(C02600Cb c02600Cb) {
        boolean z;
        StringBuilder A0P = C000200d.A0P("routeselector/setroutinginfo/got a RoutingResponse with ");
        A0P.append(c02600Cb.A0A.size());
        A0P.append(" route classes");
        Log.i(A0P.toString());
        this.A0D.A00.A02();
        synchronized (this.A0H) {
            C02600Cb c02600Cb2 = this.A00;
            if (c02600Cb2 != null && !(z = c02600Cb.A0B)) {
                this.A00 = new C02600Cb(c02600Cb.A08, c02600Cb.A05, c02600Cb.A03, c02600Cb.A06, c02600Cb2.A0A, c02600Cb.A07, c02600Cb.A09, z, c02600Cb.A00, c02600Cb.A01);
                Log.i("routeselector/setroutinginfo/previous hosts retained");
            } else {
                this.A00 = c02600Cb;
                Iterator it = super.A00.iterator();
                while (true) {
                    C0G5 c0g5 = (C0G5) it;
                    if (!c0g5.hasNext()) {
                        break;
                    }
                    ((C1QJ) c0g5.next()).AMQ(c02600Cb);
                }
            }
        }
        Object obj = this.A0I;
        synchronized (obj) {
            obj.notifyAll();
        }
        A06();
    }

    public final void A0B(final String str, final String str2, final String str3, final int i) {
        boolean A0E;
        C003701t c003701t = this.A09;
        if (c003701t.A0D(15)) {
            A0E = c003701t.A0C(15);
        } else {
            A0E = this.A06.A0E(C01C.A0g);
        }
        if (A0E) {
            return;
        }
        this.A0F.AS1(new Runnable() { // from class: X.1QH
            {
                C0IY.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C02600Cb A03;
                final C0IY c0iy = C0IY.this;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                int i2 = i;
                c0iy.A0E();
                synchronized (c0iy.A0I) {
                    A03 = c0iy.A03();
                }
                if (A03 != null) {
                    c0iy.A02(str4, str5, str6, i2).A00(new C0SC() { // from class: X.1nN
                        @Override // X.C0SC
                        public final C1PV ARu(C05080Nf c05080Nf) {
                            C0JL c0jl;
                            C0IY c0iy2 = c0iy;
                            String str7 = c05080Nf.A02;
                            C0J2 c0j2 = c0iy2.A0E;
                            String str8 = c05080Nf.A05;
                            C000200d.A14("prewarmer/sendrequest/checking authority ", str7);
                            try {
                                try {
                                    try {
                                        TrafficStats.setThreadStatsTag(2);
                                        Uri.Builder builder = new Uri.Builder();
                                        builder.scheme("https").encodedAuthority(str7).appendPath("prewarm");
                                        URL url = new URL(builder.build().toString());
                                        SystemClock.elapsedRealtime();
                                        InterfaceC02170Ad A032 = c0j2.A00.A03(url, str8, "POST");
                                        try {
                                            SystemClock.elapsedRealtime();
                                            c0jl.A6H();
                                            c0jl.close();
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } finally {
                                                try {
                                                    ((C0JL) A032).close();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        }
                                    } catch (IOException e) {
                                        if (C0HW.A05(e)) {
                                            c0j2.A00.A04();
                                        }
                                        Log.w("prewarmer/sendrequest/error opening connection", e);
                                    }
                                } catch (MalformedURLException e2) {
                                    Log.e("prewarmer/sendrequest/error forming URL", e2);
                                }
                                TrafficStats.clearThreadStatsTag();
                                return C1PV.A02(c05080Nf);
                            } catch (Throwable th2) {
                                TrafficStats.clearThreadStatsTag();
                                throw th2;
                            }
                        }
                    });
                }
            }
        });
    }

    public final boolean A0C() {
        C003701t c003701t = this.A09;
        if (c003701t.A0D(149)) {
            return c003701t.A0C(149);
        }
        return this.A06.A0E(C01C.A1U);
    }

    public final boolean A0D() {
        AnonymousClass012 anonymousClass012 = this.A08;
        C02600Cb c02600Cb = this.A00;
        return c02600Cb == null || c02600Cb.A02 <= anonymousClass012.A03();
    }

    public final boolean A0E() {
        Log.i("routeselector/requestroutinginfoifnulloralmostexpired");
        if (A0C() && this.A0J.compareAndSet(false, true)) {
            C02600Cb c02600Cb = null;
            String string = this.A0C.A01("route_selector_prefs").getString("media_conn", null);
            AnonymousClass012 anonymousClass012 = this.A08;
            if (string != null) {
                try {
                    c02600Cb = AnonymousClass029.A0N(anonymousClass012, new JSONObject(string));
                } catch (JSONException e) {
                    Log.e("routingresponse/can't parse json", e);
                }
            }
            synchronized (this.A0H) {
                if (this.A00 == null && c02600Cb != null && c02600Cb.A02 > anonymousClass012.A03()) {
                    A0A(c02600Cb);
                }
            }
        }
        C02600Cb A03 = A03();
        if (A03 != null) {
            StringBuilder A0P = C000200d.A0P("routeselector/isroutinginfonulloralmostexpired/expiring at ");
            long j = A03.A04;
            A0P.append(j);
            A0P.append(" (");
            AnonymousClass012 anonymousClass0122 = this.A08;
            A0P.append(j - anonymousClass0122.A03());
            A0P.append("ms from now)");
            Log.i(A0P.toString());
            if (j > anonymousClass0122.A03() + 120000) {
                if (!this.A04.hasMessages(0)) {
                    A06();
                }
                return false;
            }
        }
        A05();
        return true;
    }

    @Override // X.C0IZ
    public void AHG() {
        this.A01 = false;
    }

    @Override // X.C0IZ
    public void AHH() {
        this.A01 = true;
        if (A0C()) {
            A07();
        }
    }
}
