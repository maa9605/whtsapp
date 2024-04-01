package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.net.Socket;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.27F */
/* loaded from: classes2.dex */
public class C27F extends HandlerThread {
    public long A00;
    public C2S7 A01;
    public HandlerC467828f A02;
    public C2S8 A03;
    public C2S9 A04;
    public C2SA A05;
    public C40581sV A06;
    public final C01L A07;
    public final C04920Mm A08;
    public final AbstractC000600i A09;
    public final C02L A0A;
    public final C0E4 A0B;
    public final C005002g A0C;
    public final C01B A0D;
    public final C0EL A0E;
    public final C41651uI A0F;
    public final C0E7 A0G;
    public final C02E A0H;
    public final AnonymousClass012 A0I;
    public final C001200o A0J;
    public final C000500h A0K;
    public final C002301c A0L;
    public final C0C9 A0M;
    public final C05E A0N;
    public final C0EV A0O;
    public final C01H A0P;
    public final C003701t A0Q;
    public final C006202t A0R;
    public final AnonymousClass011 A0S;
    public final C0ES A0T;
    public final C26c A0U;
    public final C41481tz A0V;
    public final C41461tx A0W;
    public final C26V A0X;
    public final InterfaceC463226i A0Y;
    public final C26X A0Z;
    public final C2S6 A0a;
    public final C26j A0b;
    public final C26j A0c;
    public final C26j A0d;
    public final C40291rx A0e;
    public final C0EE A0f;
    public final C0EF A0g;
    public final C26W A0h;
    public final C010205d A0i;
    public final C462826e A0j;
    public final C42321vY A0k;
    public final C0EJ A0l;
    public final C462926f A0m;
    public final C03740Gw A0n;
    public final C463026g A0o;
    public final C0DV A0p;
    public final C451620q A0q;
    public final C42101v5 A0r;
    public final C0KR A0s;
    public final C462726d A0t;
    public final C05U A0u;
    public final C42151vF A0v;
    public final C05G A0w;
    public final C462526a A0x;
    public final C26Z A0y;
    public final C0EZ A0z;
    public final AnonymousClass035 A10;
    public final C03070Ea A11;
    public final C006602x A12;
    public final C0L6 A13;
    public final C41981up A14;
    public final Random A15;

    public C27F(InterfaceC463226i interfaceC463226i, AnonymousClass012 anonymousClass012, C003701t c003701t, C01H c01h, AbstractC000600i abstractC000600i, C02L c02l, C03070Ea c03070Ea, C001200o c001200o, C005002g c005002g, C0EL c0el, AnonymousClass011 anonymousClass011, C41981up c41981up, C01B c01b, C01L c01l, C26V c26v, C006602x c006602x, C42151vF c42151vF, C42101v5 c42101v5, C0L6 c0l6, C26W c26w, C40291rx c40291rx, C02E c02e, C002301c c002301c, C26X c26x, C05U c05u, C0DV c0dv, C451620q c451620q, C26Z c26z, C0C9 c0c9, C42321vY c42321vY, C0ES c0es, C0E4 c0e4, C0EF c0ef, C41481tz c41481tz, C0EE c0ee, C462526a c462526a, AnonymousClass035 anonymousClass035, C006202t c006202t, C0EV c0ev, C26c c26c, C04920Mm c04920Mm, C0EJ c0ej, C05E c05e, C0E7 c0e7, C0KR c0kr, C000500h c000500h, C462726d c462726d, C41651uI c41651uI, C0EZ c0ez, C462826e c462826e, C462926f c462926f, C03740Gw c03740Gw, C463026g c463026g, C41461tx c41461tx, C05G c05g, C010205d c010205d) {
        super("ConnectionThread", 1);
        this.A0b = new C26j("connection_thread/logged_flag/connected", false);
        this.A0c = new C26j("connection_thread/logged_flag/disconnecting", false);
        this.A0d = new C26j("connection_thread/logged_flag/quit", false);
        this.A0Y = interfaceC463226i;
        this.A0J = c001200o;
        this.A09 = abstractC000600i;
        this.A0S = anonymousClass011;
        this.A0D = c01b;
        this.A0e = c40291rx;
        this.A0I = anonymousClass012;
        this.A0Q = c003701t;
        this.A0P = c01h;
        this.A0A = c02l;
        this.A11 = c03070Ea;
        this.A0C = c005002g;
        this.A0E = c0el;
        this.A14 = c41981up;
        this.A07 = c01l;
        this.A0X = c26v;
        this.A12 = c006602x;
        this.A0v = c42151vF;
        this.A0r = c42101v5;
        this.A13 = c0l6;
        this.A0h = c26w;
        this.A0H = c02e;
        this.A0L = c002301c;
        this.A0Z = c26x;
        this.A0u = c05u;
        this.A0p = c0dv;
        this.A0q = c451620q;
        this.A0y = c26z;
        this.A0M = c0c9;
        this.A0k = c42321vY;
        this.A0T = c0es;
        this.A0B = c0e4;
        this.A0g = c0ef;
        this.A0V = c41481tz;
        this.A0f = c0ee;
        this.A0x = c462526a;
        this.A10 = anonymousClass035;
        this.A0R = c006202t;
        this.A0O = c0ev;
        this.A0U = c26c;
        this.A08 = c04920Mm;
        this.A0l = c0ej;
        this.A0N = c05e;
        this.A0G = c0e7;
        this.A0s = c0kr;
        this.A0K = c000500h;
        this.A0t = c462726d;
        this.A0F = c41651uI;
        this.A0z = c0ez;
        this.A0j = c462826e;
        this.A0m = c462926f;
        this.A0n = c03740Gw;
        this.A0o = c463026g;
        this.A0W = c41461tx;
        this.A0w = c05g;
        this.A0i = c010205d;
        this.A15 = new Random();
        this.A0a = new C2S6(anonymousClass035);
    }

    public static void A00(C006202t c006202t, C000500h c000500h, C02590Ca c02590Ca) {
        String str;
        C04P A0A = c02590Ca.A0A("location");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || str.length() < 40) {
            c006202t.A03(2795, str, 0);
            c006202t.A03(2795, str, 1);
            if (c000500h != null) {
                if (TextUtils.isEmpty(str)) {
                    C000200d.A0f(c000500h, "last_datacenter");
                    return;
                } else {
                    C000200d.A0i(c000500h, "last_datacenter", str);
                    return;
                }
            }
            throw null;
        }
    }

    public static void A01(C2S7 c2s7) {
        Log.i("ConnectionThread/closeSocket");
        if (c2s7 != null) {
            try {
                Socket socket = c2s7.A00;
                if (!socket.isOutputShutdown()) {
                    socket.shutdownOutput();
                }
            } catch (Exception unused) {
            }
            try {
                Socket socket2 = c2s7.A00;
                if (!socket2.isInputShutdown()) {
                    socket2.shutdownInput();
                }
            } catch (Exception unused2) {
            }
            try {
                Socket socket3 = c2s7.A00;
                if (socket3.isClosed()) {
                    return;
                }
                socket3.close();
                return;
            } catch (Exception e) {
                Log.i("ConnectionSocketDefault/closeSocket ", e);
                return;
            }
        }
        throw null;
    }

    public final void A02(int i, int i2, int i3, long j, boolean z, int i4, long j2) {
        int i5;
        long j3;
        C07410Yc c07410Yc = new C07410Yc();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c07410Yc.A04 = Integer.valueOf(i);
        c07410Yc.A07 = Long.valueOf(i2);
        c07410Yc.A08 = Long.valueOf(i3);
        c07410Yc.A06 = Long.valueOf(elapsedRealtime - j);
        C40291rx c40291rx = this.A0e;
        c07410Yc.A00 = Boolean.valueOf(!c40291rx.A0G());
        c07410Yc.A01 = Boolean.valueOf(z);
        if (i != 1 && i != 5) {
            c07410Yc.A09 = Long.valueOf(j2);
        }
        Object obj = c40291rx.A1X;
        synchronized (obj) {
            C463326k c463326k = c40291rx.A06;
            i5 = c463326k.A00;
            j3 = c463326k.A02;
        }
        if (i5 != 0) {
            if (j3 > 0) {
                Long valueOf = Long.valueOf(j3);
                if (valueOf != null) {
                    if (j - valueOf.longValue() < TimeUnit.SECONDS.toMillis(10L)) {
                        c07410Yc.A05 = Long.valueOf(elapsedRealtime - j3);
                        Integer valueOf2 = Integer.valueOf(i5);
                        if (valueOf2 != null) {
                            int intValue = valueOf2.intValue();
                            int i6 = 1;
                            if (intValue != 1) {
                                i6 = 2;
                                if (intValue != 2) {
                                    i6 = 3;
                                    if (intValue == 3) {
                                        i6 = 4;
                                    }
                                }
                            }
                            c07410Yc.A03 = Integer.valueOf(i6);
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
            c07410Yc.A03 = 3;
        } else {
            c07410Yc.A03 = 3;
        }
        if (i4 == 0) {
            c07410Yc.A02 = 1;
        } else if (i4 != 1) {
            if (i4 == 2) {
                c07410Yc.A02 = 3;
            } else if (i4 == 3) {
                c07410Yc.A02 = 4;
            } else if (i4 == 4) {
                c07410Yc.A02 = 5;
            } else if (i4 == 5) {
                c07410Yc.A02 = 6;
            } else {
                c07410Yc.A02 = null;
            }
        } else {
            c07410Yc.A02 = 2;
        }
        AnonymousClass011 anonymousClass011 = this.A0S;
        if (i == 1) {
            anonymousClass011.A0B(c07410Yc, null, false);
            synchronized (obj) {
                C463326k c463326k2 = c40291rx.A06;
                c463326k2.A00 = 0;
                c463326k2.A02 = 0L;
                c463326k2.A01 = 0;
            }
            return;
        }
        anonymousClass011.A09(c07410Yc, 1);
        AnonymousClass011.A01(c07410Yc, "");
        synchronized (obj) {
            c40291rx.A06.A01++;
        }
    }

    public final void A03(boolean z) {
        boolean hasMessages = hasMessages(0);
        removeCallbacksAndMessages(null);
        C26j c26j = this.A0b;
        if (c26j.A00) {
            C26j c26j2 = this.A0c;
            if (!c26j2.A00) {
                if (z) {
                    Log.i("xmpp/connection/forced_disconnect/reader_thread/mark_finished");
                    HandlerC467828f handlerC467828f = this.A02;
                    if (handlerC467828f != null) {
                        handlerC467828f.A00 = true;
                    }
                    A01(this.A01);
                    this.A04.ASU();
                    ((Handler) this.A0Y).obtainMessage(4, 1, 0).sendToTarget();
                    c26j.A00(false);
                    if (this.A0d.A00) {
                        Log.i("xmpp/connection/quit during forced disconnect");
                        this.A05.quit();
                        quit();
                        return;
                    }
                    return;
                }
                sendEmptyMessageDelayed(0, 10000L);
                this.A04.ASc(Message.obtain(null, 0, 13, 0));
                c26j2.A00(true);
                return;
            }
        }
        if (!hasMessages || !z) {
            return;
        }
        C2S8 c2s8 = this.A03;
        if (c2s8 != null) {
            Log.w("xmpp/connection/fire-logout-timeout");
            c2s8.sendEmptyMessage(0);
            return;
        }
        throw null;
    }

    public final void A04(boolean z) {
        this.A0b.A00(false);
        this.A0c.A00(false);
        if (!this.A0d.A00) {
            removeMessages(0);
            this.A04.ASU();
            ((Handler) this.A0Y).obtainMessage(4, z ? 1 : 0, 0).sendToTarget();
        } else {
            Log.i("xmpp/connection/quit");
            this.A05.quit();
            quit();
        }
        removeCallbacksAndMessages(null);
    }

    public final void A05(boolean z, long j) {
        if (j > 0) {
            long j2 = this.A00;
            if (j2 > j) {
                C000200d.A1I(C000200d.A0S("xmpp/connection/recv/disconnect/skip disconnectRequestTime:", j, " lastConnectedTime:"), j2);
                return;
            }
        }
        A03(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2S8] */
    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        this.A03 = new Handler() { // from class: X.2S8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.getLooper());
                C27F.this = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    C27F c27f = C27F.this;
                    if (C0L6.A01()) {
                        Log.i("xmpp/connection/logout/timeout/skip-voip-active");
                        c27f.A03.sendEmptyMessageDelayed(0, 10000L);
                        c27f.A04.ASc(Message.obtain(null, 0, 22, 0));
                        return;
                    }
                    Log.i("xmpp/connection/logout/timeout/close-socket");
                    C27F.A01(c27f.A01);
                } else if (i != 1) {
                    if (i == 2) {
                        Log.w("connection active timeout fired");
                        removeMessages(2);
                        C27F.this.A05(true, 0L);
                    }
                } else {
                    AnonymousClass094 anonymousClass094 = (AnonymousClass094) message.obj;
                    C27F c27f2 = C27F.this;
                    AnonymousClass092 A0F = c27f2.A0M.A0F(anonymousClass094);
                    if (A0F == null || C0D6.A00(A0F.A08, 4) >= 0) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder("message receipt timeout fired; messageKey=");
                    sb.append(anonymousClass094);
                    sb.append("; fMessage.status=");
                    sb.append(A0F.A08);
                    Log.w(sb.toString());
                    removeMessages(1);
                    c27f2.A05(true, 0L);
                }
            }
        };
        C2SA c2sa = new C2SA(new C2SB(this), this.A09, this.A0E, this.A0g, this.A0F);
        this.A05 = c2sa;
        c2sa.start();
        C462826e c462826e = this.A0j;
        synchronized (c462826e) {
            if (!c462826e.A00) {
                C010205d c010205d = c462826e.A04;
                c010205d.A02((C0EK) c462826e.A0J.get());
                c010205d.A02(c462826e.A03);
                c010205d.A02(c462826e.A0I.A02);
                c010205d.A02(c462826e.A0G);
                c010205d.A02(c462826e.A02);
                c010205d.A02((C0EK) c462826e.A0L.get());
                c010205d.A02((C0EK) c462826e.A0K.get());
                c010205d.A02(c462826e.A09);
                c010205d.A02(c462826e.A0C);
                c010205d.A02((C0EK) c462826e.A0N.get());
                c010205d.A02(c462826e.A08);
                c010205d.A02((C0EK) c462826e.A0M.get());
                c010205d.A02(c462826e.A0E);
                c010205d.A02(c462826e.A0F);
                c010205d.A02(c462826e.A0B);
                c010205d.A02(c462826e.A0A);
                c010205d.A02(c462826e.A0D);
                c010205d.A02(c462826e.A07);
                c010205d.A02(c462826e.A05);
                c010205d.A02(c462826e.A01);
                c010205d.A02(c462826e.A0H);
                c010205d.A02(c462826e.A06);
                c462826e.A00 = true;
            }
        }
    }
}
