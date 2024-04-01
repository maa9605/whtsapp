package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1rx */
/* loaded from: classes2.dex */
public class C40291rx {
    public static volatile C40291rx A1f;
    public int A00;
    public long A03;
    public HandlerThread A04;
    public UserJid A05;
    public C27F A07;
    public C0KL A08;
    public C0KL A09;
    public C0KS A0A;
    public final C03020Dv A0K;
    public final C01L A0L;
    public final C04920Mm A0M;
    public final AbstractC000600i A0N;
    public final C018508q A0O;
    public final C02L A0P;
    public final C0E4 A0Q;
    public final C005002g A0R;
    public final C01B A0S;
    public final C0EL A0T;
    public final C010005b A0U;
    public final C41651uI A0V;
    public final C0E7 A0W;
    public final C02E A0X;
    public final C462626b A0Y;
    public final AnonymousClass012 A0Z;
    public final C001200o A0a;
    public final C005102h A0b;
    public final C000500h A0c;
    public final C002301c A0d;
    public final C0C9 A0e;
    public final C05E A0f;
    public final C0EV A0g;
    public final C01H A0h;
    public final C003701t A0i;
    public final C0HA A0j;
    public final C006202t A0k;
    public final AnonymousClass011 A0l;
    public final C0ES A0m;
    public final C26c A0n;
    public final C41481tz A0o;
    public final C41461tx A0p;
    public final C26V A0q;
    public final C010605h A0r;
    public final C22J A0s;
    public final C26X A0t;
    public final C010105c A0x;
    public final C05Y A0y;
    public final C22M A11;
    public final C0EE A12;
    public final C0EF A13;
    public final C26W A14;
    public final C010205d A15;
    public final C462826e A16;
    public final C42321vY A17;
    public final C0EJ A18;
    public final C462926f A19;
    public final C03740Gw A1A;
    public final C463026g A1B;
    public final C0DV A1C;
    public final C451620q A1D;
    public final C42101v5 A1E;
    public final C26Y A1F;
    public final C0KR A1G;
    public final C462726d A1H;
    public final C05U A1I;
    public final C42151vF A1J;
    public final C05G A1K;
    public final C462526a A1L;
    public final C0ER A1M;
    public final C41901uh A1N;
    public final C26Z A1O;
    public final C0EZ A1P;
    public final AnonymousClass035 A1Q;
    public final C03070Ea A1R;
    public final C006602x A1S;
    public final C0L6 A1U;
    public final C41981up A1V;
    public final C41991uq A1W;
    public volatile boolean A1a;
    public volatile boolean A1b;
    public static final long A1d = TimeUnit.MINUTES.toMillis(15);
    public static final AtomicBoolean A1e = new AtomicBoolean();
    public static CountDownLatch A1c = new CountDownLatch(1);
    public final HandlerC463126h A0z = new HandlerC463126h(this, Looper.getMainLooper());
    public final Random A1Y = new Random();
    public final Object A1X = new Object();
    public boolean A0E = false;
    public long A01 = -1;
    public final C26j A0w = new C26j("message_handler/logged_flag/must_reconnect", true);
    public final C26j A0v = new C26j("message_handler/logged_flag/must_ignore_network_once", false);
    public final C26j A0u = new C26j("message_handler/logged_flag/disconnected", true);
    public C463326k A06 = new C463326k();
    public AtomicBoolean A0C = new AtomicBoolean();
    public AtomicBoolean A0D = new AtomicBoolean();
    public C0HC A0B = new C0HC("MessageHandler/networkLostTimer");
    public boolean A0F = false;
    public volatile boolean A1Z = true;
    public long A02 = 0;
    public boolean A0G = false;
    public final BroadcastReceiver A0H = new BroadcastReceiver() { // from class: X.26l
        {
            C40291rx.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION".equals(intent.getAction())) {
                C40291rx.this.A11.ARc();
            }
        }
    };
    public final Handler A0J = new Handler(new Handler.Callback() { // from class: X.3M1
        {
            C40291rx.this = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean z;
            C40291rx c40291rx = C40291rx.this;
            boolean z2 = message.arg1 != 0;
            long j = message.getData().getLong("networkId");
            synchronized (c40291rx.A1X) {
                z = false;
                if (c40291rx.A0E != z2) {
                    if (z2) {
                        Log.i("xmpp/handler/network/up");
                        c40291rx.A0C(false, true, false);
                    } else {
                        Log.i("xmpp/handler/network/down");
                        C0KS c0ks = c40291rx.A0A;
                        if (c0ks != null) {
                            c0ks.AST(true);
                        }
                        long A00 = c40291rx.A0B.A00();
                        if (A00 > 0) {
                            C0OY c0oy = new C0OY();
                            c0oy.A00 = Long.valueOf(A00);
                            c40291rx.A0l.A0B(c0oy, null, false);
                        }
                    }
                    c40291rx.A0E = z2;
                    c40291rx.A01 = j;
                    z = true;
                } else if (z2) {
                    long j2 = c40291rx.A01;
                    if (j != j2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("xmpp/handler/network/switch old=");
                        sb.append(j2);
                        sb.append(" new=");
                        sb.append(j);
                        Log.i(sb.toString());
                        C0KS c0ks2 = c40291rx.A0A;
                        if (c0ks2 != null) {
                            c0ks2.AST(true);
                        }
                        c40291rx.A01 = j;
                        z = true;
                    }
                    c40291rx.A0C(false, false, true);
                }
            }
            if (z) {
                C0HC c0hc = c40291rx.A0B;
                c0hc.A01 = 0L;
                c0hc.A00 = 0L;
                c40291rx.A0j.A05(c40291rx.A0W.A04());
            }
            return true;
        }
    });
    public final BroadcastReceiver A0I = new BroadcastReceiver() { // from class: X.26m
        {
            C40291rx.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.whatsapp.MessageHandler.LOGOUT_ACTION".equals(intent.getAction())) {
                Log.i("xmpp/handler/logout-timer/timeout");
                C40291rx c40291rx = C40291rx.this;
                if (!c40291rx.A0G()) {
                    c40291rx.A05();
                    c40291rx.A06();
                    return;
                } else if (C0L6.A01()) {
                    c40291rx.A04();
                    c40291rx.A0s.A01();
                    return;
                } else {
                    C0KS c0ks = c40291rx.A0A;
                    if (c0ks != null) {
                        c0ks.AST(false);
                        return;
                    } else {
                        Log.i("xmpp/handler/logout-timer ignoring due to null sending channel");
                        return;
                    }
                }
            }
            StringBuilder sb = new StringBuilder("unknown intent received in logout receiver ");
            sb.append(intent);
            Log.w(sb.toString());
        }
    };
    public final C0J5 A1T = new C0J5(1, 17280);
    public final HandlerC463626n A10 = new Handler(Looper.getMainLooper()) { // from class: X.26n
        public final boolean A00 = C005002g.A01();

        {
            C40291rx.this = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:125:0x00cc, code lost:
            if (r2 >= 0) goto L33;
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r15) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.HandlerC463626n.handleMessage(android.os.Message):void");
        }
    };

    /* JADX WARN: Type inference failed for: r0v75, types: [X.26n] */
    public C40291rx(C001200o c001200o, AnonymousClass012 anonymousClass012, C003701t c003701t, C01H c01h, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, C03070Ea c03070Ea, C005002g c005002g, C0EL c0el, AnonymousClass011 anonymousClass011, C41981up c41981up, C41991uq c41991uq, C01B c01b, C01L c01l, C26V c26v, C006602x c006602x, C42151vF c42151vF, C42101v5 c42101v5, C05Y c05y, C0L6 c0l6, C26W c26w, C02E c02e, C002301c c002301c, C26X c26x, C05U c05u, C26Y c26y, C0DV c0dv, C451620q c451620q, C26Z c26z, C0ES c0es, C0C9 c0c9, C42321vY c42321vY, C0ER c0er, C0E4 c0e4, C0EF c0ef, C010005b c010005b, C41481tz c41481tz, C0HA c0ha, C0EE c0ee, C462526a c462526a, AnonymousClass035 anonymousClass035, C462626b c462626b, C006202t c006202t, C0EV c0ev, C26c c26c, C04920Mm c04920Mm, C0EJ c0ej, C05E c05e, C0E7 c0e7, C0KR c0kr, C000500h c000500h, C462726d c462726d, C41651uI c41651uI, C0EZ c0ez, C462826e c462826e, C462926f c462926f, C03740Gw c03740Gw, C463026g c463026g, C005102h c005102h, C41461tx c41461tx, C010105c c010105c, C05G c05g, C03020Dv c03020Dv, C010205d c010205d, C41901uh c41901uh, C010605h c010605h) {
        C22M c22l;
        this.A0a = c001200o;
        this.A0Z = anonymousClass012;
        this.A0i = c003701t;
        this.A0h = c01h;
        this.A0O = c018508q;
        this.A0N = abstractC000600i;
        this.A0P = c02l;
        this.A1R = c03070Ea;
        this.A0R = c005002g;
        this.A0T = c0el;
        this.A0l = anonymousClass011;
        this.A1V = c41981up;
        this.A1W = c41991uq;
        this.A0S = c01b;
        this.A0L = c01l;
        this.A0q = c26v;
        this.A1S = c006602x;
        this.A1J = c42151vF;
        this.A1E = c42101v5;
        this.A0y = c05y;
        this.A1U = c0l6;
        this.A14 = c26w;
        this.A0X = c02e;
        this.A0d = c002301c;
        this.A0t = c26x;
        this.A1I = c05u;
        this.A1F = c26y;
        this.A1C = c0dv;
        this.A1D = c451620q;
        this.A1O = c26z;
        this.A0m = c0es;
        this.A0e = c0c9;
        this.A17 = c42321vY;
        this.A1M = c0er;
        this.A0Q = c0e4;
        this.A13 = c0ef;
        this.A0U = c010005b;
        this.A0o = c41481tz;
        this.A0j = c0ha;
        this.A12 = c0ee;
        this.A1L = c462526a;
        this.A1Q = anonymousClass035;
        this.A0Y = c462626b;
        this.A0k = c006202t;
        this.A0g = c0ev;
        this.A0n = c26c;
        this.A0M = c04920Mm;
        this.A18 = c0ej;
        this.A0f = c05e;
        this.A0W = c0e7;
        this.A1G = c0kr;
        this.A0c = c000500h;
        this.A1H = c462726d;
        this.A0V = c41651uI;
        this.A1P = c0ez;
        this.A16 = c462826e;
        this.A19 = c462926f;
        this.A1A = c03740Gw;
        this.A1B = c463026g;
        this.A0b = c005102h;
        this.A0p = c41461tx;
        this.A0x = c010105c;
        this.A1K = c05g;
        this.A0K = c03020Dv;
        this.A15 = c010205d;
        this.A1N = c41901uh;
        this.A0r = c010605h;
        this.A0s = new C22J(c001200o, c01b, c02e, Looper.getMainLooper(), c010005b);
        Application application = c001200o.A00;
        application.registerReceiver(this.A0I, new IntentFilter("com.whatsapp.MessageHandler.LOGOUT_ACTION"), "com.whatsapp.permission.BROADCAST", null);
        application.registerReceiver(new BroadcastReceiver() { // from class: X.26o
            {
                C40291rx.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if ("com.whatsapp.MessageHandler.RECONNECT_ACTION".equals(intent.getAction())) {
                    Log.i("xmpp/handler/reconnect");
                    C40291rx.this.A08(intent.getIntExtra("connect_reason", 0));
                    return;
                }
                StringBuilder sb = new StringBuilder("unknown intent received in reconnect receiver ");
                sb.append(intent);
                Log.w(sb.toString());
            }
        }, new IntentFilter("com.whatsapp.MessageHandler.RECONNECT_ACTION"), "com.whatsapp.permission.BROADCAST", null);
        if (Build.VERSION.SDK_INT >= 29) {
            c22l = new C22N(this.A0X, this, this.A0Y);
        } else {
            c22l = new C22L(this.A0a, this, this.A0Y, this.A0W);
        }
        this.A11 = c22l;
        c03020Dv.A01(new C0IZ() { // from class: X.26p
            {
                C40291rx.this = this;
            }

            @Override // X.C0IZ
            public void AHG() {
                C40291rx.this.A0B.A03();
            }

            @Override // X.C0IZ
            public void AHH() {
                C0HC c0hc = C40291rx.this.A0B;
                c0hc.A01 = 0L;
                c0hc.A00 = 0L;
            }
        });
    }

    public static C40291rx A00() {
        if (A1f == null) {
            synchronized (C40291rx.class) {
                if (A1f == null) {
                    C001200o c001200o = C001200o.A01;
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C003701t A002 = C003701t.A00();
                    C01H A003 = C01H.A00();
                    C018508q A004 = C018508q.A00();
                    AbstractC000600i A005 = AbstractC000600i.A00();
                    C02L A006 = C02L.A00();
                    C03070Ea A007 = C03070Ea.A00();
                    C005002g A008 = C005002g.A00();
                    C0EL A009 = C0EL.A00();
                    AnonymousClass011 A0010 = AnonymousClass011.A00();
                    C41981up A0011 = C41981up.A00();
                    C41991uq A0012 = C41991uq.A00();
                    C01B A0013 = C01B.A00();
                    C01L A0014 = C01L.A00();
                    C26V c26v = C26V.A05;
                    C006602x A0015 = C006602x.A00();
                    C42151vF A0016 = C42151vF.A00();
                    C42101v5 A0017 = C42101v5.A00();
                    C05Y A01 = C05Y.A01();
                    C0L6 A0018 = C0L6.A00();
                    if (C26W.A03 == null) {
                        synchronized (C26W.class) {
                            if (C26W.A03 == null) {
                                AbstractC000600i.A00();
                                C02L.A00();
                                C01B.A00();
                                C05W A0019 = C05W.A00();
                                C451620q A0020 = C451620q.A00();
                                C41481tz.A01();
                                C018808t A0021 = C018808t.A00();
                                C03740Gw.A00();
                                C26W.A03 = new C26W(A0019, A0020, A0021);
                            }
                        }
                    }
                    C26W c26w = C26W.A03;
                    C02E A0022 = C02E.A00();
                    C002301c A0023 = C002301c.A00();
                    C26X A0024 = C26X.A00();
                    C05U A012 = C05U.A01();
                    C26Y c26y = C26Y.A01;
                    C0DV A0025 = C0DV.A00();
                    C451620q A0026 = C451620q.A00();
                    if (C26Z.A00 == null) {
                        synchronized (C26Z.class) {
                            if (C26Z.A00 == null) {
                                C26Z.A00 = new C26Z();
                            }
                        }
                    }
                    C26Z c26z = C26Z.A00;
                    C0ES A0027 = C0ES.A00();
                    C0C9 A0028 = C0C9.A00();
                    C42321vY A0029 = C42321vY.A00();
                    C0ER A0030 = C0ER.A00();
                    C0E4 A0031 = C0E4.A00();
                    C0EF A0032 = C0EF.A00();
                    C010005b c010005b = C010005b.A07;
                    C41481tz A013 = C41481tz.A01();
                    C0HA A0033 = C0HA.A00();
                    C0EE A0034 = C0EE.A00();
                    C462526a A0035 = C462526a.A00();
                    AnonymousClass035 A0036 = AnonymousClass035.A00();
                    C462626b A0037 = C462626b.A00();
                    C006202t A0038 = C006202t.A00();
                    C0EV A0039 = C0EV.A00();
                    C26c A0040 = C26c.A00();
                    C04920Mm A0041 = C04920Mm.A00();
                    C0EJ A0042 = C0EJ.A00();
                    C05E A0043 = C05E.A00();
                    C0E7 A0044 = C0E7.A00();
                    C0KR A0045 = C0KR.A00();
                    C000500h A0046 = C000500h.A00();
                    C462726d c462726d = C462726d.A00;
                    C41651uI c41651uI = C41651uI.A00;
                    C0EZ A0047 = C0EZ.A00();
                    if (C462826e.A0O == null) {
                        synchronized (C462826e.class) {
                            if (C462826e.A0O == null) {
                                if (C463926q.A06 == null) {
                                    synchronized (C463926q.class) {
                                        if (C463926q.A06 == null) {
                                            C463926q.A06 = new C463926q(C002801j.A00(), C0EG.A00(), C41541u6.A00(), C0ES.A00(), C22P.A00(), C05E.A00());
                                        }
                                    }
                                }
                                C463926q c463926q = C463926q.A06;
                                if (C464026r.A03 == null) {
                                    synchronized (C464026r.class) {
                                        if (C464026r.A03 == null) {
                                            C464026r.A03 = new C464026r(c001200o, C0EG.A00());
                                        }
                                    }
                                }
                                C464026r c464026r = C464026r.A03;
                                C41711uO A0048 = C41711uO.A00();
                                if (AnonymousClass220.A0I == null) {
                                    synchronized (AnonymousClass220.class) {
                                        if (AnonymousClass220.A0I == null) {
                                            AnonymousClass012 A0049 = AnonymousClass012.A00();
                                            C003701t A0050 = C003701t.A00();
                                            AbstractC000600i A0051 = AbstractC000600i.A00();
                                            InterfaceC002901k A0052 = C002801j.A00();
                                            C0EG A0053 = C0EG.A00();
                                            C01B A0054 = C01B.A00();
                                            C0EN A0055 = C0EN.A00();
                                            C05W A0056 = C05W.A00();
                                            C04480Ki c04480Ki = C04480Ki.A01;
                                            if (C04930Mn.A02 == null) {
                                                synchronized (C04930Mn.class) {
                                                    if (C04930Mn.A02 == null) {
                                                        C03070Ea A0057 = C03070Ea.A00();
                                                        C0EG A0058 = C0EG.A00();
                                                        C0EZ.A00();
                                                        C04930Mn.A02 = new C04930Mn(A0057, A0058);
                                                    }
                                                }
                                            }
                                            AnonymousClass220.A0I = new AnonymousClass220(c001200o, A0049, A0050, A0051, A0052, A0053, A0054, A0055, A0056, c04480Ki, C04930Mn.A02, C04940Mo.A01, C42131v9.A00(), C0HA.A00(), C0EV.A00(), C04950Mp.A00(), C0EJ.A00(), C006502w.A00());
                                        }
                                    }
                                }
                                AnonymousClass220 anonymousClass220 = AnonymousClass220.A0I;
                                if (C464126s.A08 == null) {
                                    synchronized (C464126s.class) {
                                        if (C464126s.A08 == null) {
                                            C464126s.A08 = new C464126s(AnonymousClass012.A00(), AbstractC000600i.A00(), C0EG.A00(), C0ES.A00(), C41581uB.A00(), C0EE.A00(), C0EJ.A00(), C0FF.A00());
                                        }
                                    }
                                }
                                C464126s c464126s = C464126s.A08;
                                if (C464226t.A04 == null) {
                                    synchronized (C464226t.class) {
                                        if (C464226t.A04 == null) {
                                            C464226t.A04 = new C464226t(C002801j.A00(), C0EG.A00(), C41541u6.A00(), C0EJ.A00());
                                        }
                                    }
                                }
                                C464226t c464226t = C464226t.A04;
                                if (C464326u.A02 == null) {
                                    synchronized (C464326u.class) {
                                        if (C464326u.A02 == null) {
                                            C0EG.A00();
                                            C464326u.A02 = new C464326u(C44341yu.A00(), C0EJ.A00());
                                        }
                                    }
                                }
                                C464326u c464326u = C464326u.A02;
                                C010205d A0059 = C010205d.A00();
                                if (C464426v.A0F == null) {
                                    synchronized (C464426v.class) {
                                        if (C464426v.A0F == null) {
                                            C464426v.A0F = new C464426v(AnonymousClass012.A00(), C003701t.A00(), C002801j.A00(), C0EG.A00(), C0EN.A00(), C0DV.A00(), C0C9.A00(), C0EU.A00(), C0EJ.A00(), C07A.A01(), C0DW.A00(), C464526w.A00(), C41821uZ.A00(), C464626x.A00());
                                        }
                                    }
                                }
                                C464426v c464426v = C464426v.A0F;
                                if (C464726y.A0I == null) {
                                    synchronized (C464726y.class) {
                                        if (C464726y.A0I == null) {
                                            AnonymousClass012 A0060 = AnonymousClass012.A00();
                                            C018508q A0061 = C018508q.A00();
                                            AbstractC000600i A0062 = AbstractC000600i.A00();
                                            InterfaceC002901k A0063 = C002801j.A00();
                                            AnonymousClass011 A0064 = AnonymousClass011.A00();
                                            C0EG A0065 = C0EG.A00();
                                            C0C9 A0066 = C0C9.A00();
                                            C464826z c464826z = C464826z.A00;
                                            if (AnonymousClass270.A00 == null) {
                                                synchronized (AnonymousClass270.class) {
                                                    if (AnonymousClass270.A00 == null) {
                                                        AnonymousClass270.A00 = new AnonymousClass270();
                                                    }
                                                }
                                            }
                                            C464726y.A0I = new C464726y(A0060, A0061, A0062, A0063, A0064, A0065, A0066, c464826z, AnonymousClass270.A00, C41321tj.A00(), AnonymousClass271.A00(), AnonymousClass272.A00(), C0EJ.A00(), AnonymousClass075.A00(), C000500h.A00(), C06L.A00(), C06K.A00(), C06M.A00);
                                        }
                                    }
                                }
                                C464726y c464726y = C464726y.A0I;
                                if (AnonymousClass273.A0A == null) {
                                    synchronized (AnonymousClass273.class) {
                                        if (AnonymousClass273.A0A == null) {
                                            AnonymousClass273.A0A = new AnonymousClass273(C018508q.A00(), AbstractC000600i.A00(), C0EG.A00(), C0E6.A00(), C05Y.A01(), C01R.A02, C0E4.A00(), C01J.A00(), C0EJ.A00(), C41461tx.A00());
                                        }
                                    }
                                }
                                AnonymousClass273 anonymousClass273 = AnonymousClass273.A0A;
                                if (AnonymousClass274.A01 == null) {
                                    synchronized (AnonymousClass274.class) {
                                        if (AnonymousClass274.A01 == null) {
                                            AnonymousClass274.A01 = new AnonymousClass274(C41951um.A00());
                                        }
                                    }
                                }
                                AnonymousClass274 anonymousClass274 = AnonymousClass274.A01;
                                if (AnonymousClass275.A04 == null) {
                                    synchronized (AnonymousClass275.class) {
                                        if (AnonymousClass275.A04 == null) {
                                            InterfaceC002901k A0067 = C002801j.A00();
                                            C0EG A0068 = C0EG.A00();
                                            C0EJ A0069 = C0EJ.A00();
                                            if (AnonymousClass276.A01 == null) {
                                                synchronized (AnonymousClass276.class) {
                                                    if (AnonymousClass276.A01 == null) {
                                                        AnonymousClass276.A01 = new AnonymousClass276(C41421tt.A00());
                                                    }
                                                }
                                            }
                                            AnonymousClass275.A04 = new AnonymousClass275(A0067, A0068, A0069, AnonymousClass276.A01);
                                        }
                                    }
                                }
                                AnonymousClass275 anonymousClass275 = AnonymousClass275.A04;
                                if (AnonymousClass277.A0D == null) {
                                    synchronized (AnonymousClass277.class) {
                                        if (AnonymousClass277.A0D == null) {
                                            AnonymousClass277.A0D = new AnonymousClass277(C018508q.A00(), C05X.A00(), AbstractC000600i.A00(), C02L.A00(), C0EG.A00(), C40261rr.A00(), C22P.A00(), C04470Kh.A00(), C0EJ.A00(), C000500h.A00(), C41401tr.A01(), C04960Mq.A00(), C41711uO.A00());
                                        }
                                    }
                                }
                                AnonymousClass277 anonymousClass277 = AnonymousClass277.A0D;
                                C41841ub A0070 = C41841ub.A00();
                                if (C22G.A0O == null) {
                                    synchronized (C22G.class) {
                                        if (C22G.A0O == null) {
                                            C22G.A0O = new C22G(c001200o, C018508q.A00(), AbstractC000600i.A00(), C002801j.A00(), C0EG.A00(), C41541u6.A00(), C05Y.A01(), C05W.A00(), C04480Ki.A01, c26y, C22I.A00(), AnonymousClass008.A01, C03510Fz.A03, C06T.A02, C03320Ff.A00, C011505r.A00(), C41321tj.A00(), C22X.A00(), C04920Mm.A00(), C04470Kh.A00(), C0EJ.A00(), C04400Ka.A00(), C41691uM.A00(), C0KQ.A00());
                                        }
                                    }
                                }
                                C22G c22g = C22G.A0O;
                                if (AnonymousClass278.A02 == null) {
                                    synchronized (AnonymousClass278.class) {
                                        if (AnonymousClass278.A02 == null) {
                                            AnonymousClass278.A02 = new AnonymousClass278(C002801j.A00(), AnonymousClass035.A00());
                                        }
                                    }
                                }
                                AnonymousClass278 anonymousClass278 = AnonymousClass278.A02;
                                if (AnonymousClass279.A0B == null) {
                                    synchronized (AnonymousClass279.class) {
                                        if (AnonymousClass279.A0B == null) {
                                            AnonymousClass279.A0B = new AnonymousClass279(AbstractC000600i.A00(), C02L.A00(), C002801j.A00(), C0EG.A00(), C05W.A00(), C0C9.A00(), C03180Eq.A00(), C011505r.A00(), C0EJ.A00(), C456723a.A00(), C07A.A01());
                                        }
                                    }
                                }
                                C462826e.A0O = new C462826e(c463926q, c464026r, A0048, anonymousClass220, c464126s, c464226t, c464326u, A0059, c464426v, c464726y, anonymousClass273, anonymousClass274, anonymousClass275, anonymousClass277, A0070, c22g, anonymousClass278, AnonymousClass279.A0B, C007203d.A00(new InterfaceC007103c() { // from class: X.27A
                                    @Override // X.InterfaceC007103c
                                    public final Object get() {
                                        if (C1u5.A1V == null) {
                                            synchronized (C1u5.class) {
                                                if (C1u5.A1V == null) {
                                                    C001200o c001200o2 = C001200o.A01;
                                                    AnonymousClass012 A0071 = AnonymousClass012.A00();
                                                    C003701t A0072 = C003701t.A00();
                                                    C018508q A0073 = C018508q.A00();
                                                    AbstractC000600i A0074 = AbstractC000600i.A00();
                                                    C02L A0075 = C02L.A00();
                                                    InterfaceC002901k A0076 = C002801j.A00();
                                                    C05M A0077 = C05M.A00();
                                                    C0EL A0078 = C0EL.A00();
                                                    AnonymousClass011 A0079 = AnonymousClass011.A00();
                                                    C41181tV A0080 = C41181tV.A00();
                                                    C0EG A0081 = C0EG.A00();
                                                    C01B A0082 = C01B.A00();
                                                    C0EB A0083 = C0EB.A00();
                                                    C41541u6 A0084 = C41541u6.A00();
                                                    C0EN A0085 = C0EN.A00();
                                                    C0E6 A0086 = C0E6.A00();
                                                    C05W A0087 = C05W.A00();
                                                    C0ED A014 = C0ED.A01();
                                                    C0EO A0088 = C0EO.A00();
                                                    C0E3 A06 = C0E3.A06();
                                                    C01R c01r = C01R.A02;
                                                    C0EP A0089 = C0EP.A00();
                                                    C41521u3 A0090 = C41521u3.A00();
                                                    C002301c A0091 = C002301c.A00();
                                                    C05U A015 = C05U.A01();
                                                    C0DV A0092 = C0DV.A00();
                                                    C40261rr A0093 = C40261rr.A00();
                                                    C0C9 A0094 = C0C9.A00();
                                                    C41561u9 A0095 = C41561u9.A00();
                                                    C0ER A0096 = C0ER.A00();
                                                    C0ES A0097 = C0ES.A00();
                                                    C009905a c009905a = C009905a.A02;
                                                    C00A c00a = C00A.A00;
                                                    C0E4 A0098 = C0E4.A00();
                                                    C0EF A0099 = C0EF.A00();
                                                    C41571uA A00100 = C41571uA.A00();
                                                    C41581uB A00101 = C41581uB.A00();
                                                    C41591uC A00102 = C41591uC.A00();
                                                    C41601uD A00103 = C41601uD.A00();
                                                    C40411sD A00104 = C40411sD.A00();
                                                    C0EE A00105 = C0EE.A00();
                                                    C41421tt A00106 = C41421tt.A00();
                                                    C01J A00107 = C01J.A00();
                                                    C0EC A00108 = C0EC.A00();
                                                    C06T c06t = C06T.A02;
                                                    C0ET A00109 = C0ET.A00();
                                                    C0EU A00110 = C0EU.A00();
                                                    C0EV A00111 = C0EV.A00();
                                                    C0E9 A00112 = C0E9.A00();
                                                    C41611uE A00113 = C41611uE.A00();
                                                    C0EJ A00114 = C0EJ.A00();
                                                    C0E7 A00115 = C0E7.A00();
                                                    C41621uF A00116 = C41621uF.A00();
                                                    C41631uG A00117 = C41631uG.A00();
                                                    AnonymousClass075 A00118 = AnonymousClass075.A00();
                                                    C41641uH A00119 = C41641uH.A00();
                                                    C41451tw A00120 = C41451tw.A00();
                                                    C41651uI c41651uI2 = C41651uI.A00;
                                                    C41401tr A016 = C41401tr.A01();
                                                    C41661uJ A00121 = C41661uJ.A00();
                                                    C07A A017 = C07A.A01();
                                                    C41671uK A00122 = C41671uK.A00();
                                                    C0DW A00123 = C0DW.A00();
                                                    C41681uL A00124 = C41681uL.A00();
                                                    C41691uM A00125 = C41691uM.A00();
                                                    C41701uN A00126 = C41701uN.A00();
                                                    C0EW A00127 = C0EW.A00();
                                                    C06K A00128 = C06K.A00();
                                                    C41711uO A00129 = C41711uO.A00();
                                                    C41721uP A00130 = C41721uP.A00();
                                                    C013606n A03 = C013606n.A03();
                                                    C41501u1 A00131 = C41501u1.A00();
                                                    C41731uQ A00132 = C41731uQ.A00();
                                                    C41741uR A00133 = C41741uR.A00();
                                                    C41751uS c41751uS = C41751uS.A00;
                                                    C013306k A07 = C013306k.A07();
                                                    C41761uT A00134 = C41761uT.A00();
                                                    C41771uU A00135 = C41771uU.A00();
                                                    if (C41781uV.A02 == null) {
                                                        synchronized (C41781uV.class) {
                                                            if (C41781uV.A02 == null) {
                                                                C41781uV.A02 = new C41781uV(C40291rx.A00(), C41641uH.A00());
                                                            }
                                                        }
                                                    }
                                                    C1u5.A1V = new C1u5(c001200o2, A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078, A0079, A0080, A0081, A0082, A0083, A0084, A0085, A0086, A0087, A014, A0088, A06, c01r, A0089, A0090, A0091, A015, A0092, A0093, A0094, A0095, A0096, A0097, c009905a, c00a, A0098, A0099, A00100, A00101, A00102, A00103, A00104, A00105, A00106, A00107, A00108, c06t, A00109, A00110, A00111, A00112, A00113, A00114, A00115, A00116, A00117, A00118, A00119, A00120, c41651uI2, A016, A00121, A017, A00122, A00123, A00124, A00125, A00126, A00127, A00128, A00129, A00130, A03, A00131, A00132, A00133, c41751uS, A07, A00134, A00135, C41781uV.A02, C0C8.A00(), AbstractC41791uW.A00(), AbstractC41801uX.A00(), C0DK.A00(), C41811uY.A00(), C0EX.A00, C41821uZ.A00(), C41831ua.A00(), C41841ub.A00(), C0EY.A00());
                                                }
                                            }
                                        }
                                        return C1u5.A1V;
                                    }
                                }), C007203d.A00(new InterfaceC007103c() { // from class: X.27B
                                    @Override // X.InterfaceC007103c
                                    public final Object get() {
                                        if (C2AK.A1Q == null) {
                                            synchronized (C2AK.class) {
                                                if (C2AK.A1Q == null) {
                                                    C2AK.A1Q = new C2AK(C001200o.A01, AnonymousClass012.A00(), C011605s.A00(), C003701t.A00(), C018508q.A00(), C05X.A00(), AbstractC000600i.A00(), C02L.A00(), C03010Du.A00(), C002801j.A00(), C05M.A00(), C41981up.A00(), C41991uq.A00(), C41181tV.A00(), C0EG.A00(), C01B.A00(), C0EA.A00(), C0EB.A00(), C018608r.A02(), C0EN.A00(), C0E6.A00(), C0GU.A00(), C05Y.A01(), C2AL.A00(), C0L6.A00(), C05W.A00(), C0GK.A00(), C42761wH.A00(), C41521u3.A00(), C002301c.A00(), C2AM.A00(), C42821wN.A00(), C0D5.A00(), C44551zG.A00(), C22I.A00(), C2AO.A00(), C2AP.A00(), C03880Hm.A00(), C451520p.A00(), C40261rr.A00(), C03300Fd.A00(), C0C9.A00(), C41561u9.A00(), C0ES.A00(), C03180Eq.A00(), C00A.A00, C2AQ.A00(), C2AR.A00(), C0HY.A00(), C0CB.A00(), C03940Hu.A00(), C41601uD.A00(), C2AS.A00(), C41951um.A00(), C451720r.A00(), C011505r.A00(), C41511u2.A00(), C2AT.A00(), C22X.A00(), C0EJ.A00(), C40301ry.A00(), C0E7.A00(), C2AU.A00(), C04400Ka.A00(), C456723a.A00(), C43081wp.A00(), AnonymousClass075.A00(), C41641uH.A00(), C000500h.A00(), C0CA.A00(), C07A.A01(), C03340Fh.A00, C41681uL.A00(), C2AV.A00(), C41461tx.A00(), C41221tZ.A00(), C41771uU.A00(), C2AW.A00(), C451820s.A00(), C0C8.A00(), C459724l.A01, C456923c.A00(), C0DK.A00(), C2A6.A00(), C2AX.A00(), AnonymousClass072.A00());
                                                }
                                            }
                                        }
                                        return C2AK.A1Q;
                                    }
                                }), C007203d.A00(new InterfaceC007103c() { // from class: X.27C
                                    @Override // X.InterfaceC007103c
                                    public final Object get() {
                                        if (C41781uV.A02 == null) {
                                            synchronized (C41781uV.class) {
                                                if (C41781uV.A02 == null) {
                                                    C41781uV.A02 = new C41781uV(C40291rx.A00(), C41641uH.A00());
                                                }
                                            }
                                        }
                                        return C41781uV.A02;
                                    }
                                }), C007203d.A00(new InterfaceC007103c() { // from class: X.27D
                                    @Override // X.InterfaceC007103c
                                    public final Object get() {
                                        if (C22K.A0C == null) {
                                            synchronized (C22K.class) {
                                                if (C22K.A0C == null) {
                                                    C22K.A0C = new C22K(C0EG.A00(), C01R.A02, C0EP.A00(), C0E4.A00(), C01J.A00(), C04h.A00(), C0EJ.A00(), C000500h.A00(), C41401tr.A01(), C0E5.A00(), C2AY.A00);
                                                }
                                            }
                                        }
                                        return C22K.A0C;
                                    }
                                }), C007203d.A00(new InterfaceC007103c() { // from class: X.27E
                                    @Override // X.InterfaceC007103c
                                    public final Object get() {
                                        if (C2AZ.A01 == null) {
                                            synchronized (C2AZ.class) {
                                                if (C2AZ.A01 == null) {
                                                    C2AZ.A01 = new C2AZ(C2Aa.A00());
                                                }
                                            }
                                        }
                                        return C2AZ.A01;
                                    }
                                }));
                            }
                        }
                    }
                    C462826e c462826e = C462826e.A0O;
                    if (C462926f.A05 == null) {
                        synchronized (C462926f.class) {
                            if (C462926f.A05 == null) {
                                C462926f.A05 = new C462926f(AnonymousClass012.A00(), AbstractC000600i.A00(), AnonymousClass011.A00(), C0EJ.A00());
                            }
                        }
                    }
                    A1f = new C40291rx(c001200o, A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, c26v, A0015, A0016, A0017, A01, A0018, c26w, A0022, A0023, A0024, A012, c26y, A0025, A0026, c26z, A0027, A0028, A0029, A0030, A0031, A0032, c010005b, A013, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, c462726d, c41651uI, A0047, c462826e, C462926f.A05, C03740Gw.A00(), C463026g.A00(), C005102h.A00(), C41461tx.A00(), C010105c.A00(), C05G.A00(), C03020Dv.A00(), C010205d.A00(), C41901uh.A00(), C010605h.A03);
                }
            }
        }
        return A1f;
    }

    public static void A01(C40291rx c40291rx) {
        if (c40291rx.A1b) {
            return;
        }
        Log.i("xmpp/handler/start");
        c40291rx.A1b = true;
        C27F c27f = new C27F(c40291rx.A0z, c40291rx.A0Z, c40291rx.A0i, c40291rx.A0h, c40291rx.A0N, c40291rx.A0P, c40291rx.A1R, c40291rx.A0a, c40291rx.A0R, c40291rx.A0T, c40291rx.A0l, c40291rx.A1V, c40291rx.A0S, c40291rx.A0L, c40291rx.A0q, c40291rx.A1S, c40291rx.A1J, c40291rx.A1E, c40291rx.A1U, c40291rx.A14, c40291rx, c40291rx.A0X, c40291rx.A0d, c40291rx.A0t, c40291rx.A1I, c40291rx.A1C, c40291rx.A1D, c40291rx.A1O, c40291rx.A0e, c40291rx.A17, c40291rx.A0m, c40291rx.A0Q, c40291rx.A13, c40291rx.A0o, c40291rx.A12, c40291rx.A1L, c40291rx.A1Q, c40291rx.A0k, c40291rx.A0g, c40291rx.A0n, c40291rx.A0M, c40291rx.A18, c40291rx.A0f, c40291rx.A0W, c40291rx.A1G, c40291rx.A0c, c40291rx.A1H, c40291rx.A0V, c40291rx.A1P, c40291rx.A16, c40291rx.A19, c40291rx.A1A, c40291rx.A1B, c40291rx.A0p, c40291rx.A1K, c40291rx.A15);
        c40291rx.A07 = c27f;
        c27f.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0062, code lost:
        if (r1 == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(X.C40291rx r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40291rx.A02(X.1rx, boolean):void");
    }

    public void A03() {
        Message obtain = Message.obtain(null, 0, 0, 0);
        obtain.getData().putBoolean("should_register", true);
        sendMessage(obtain);
    }

    public void A04() {
        synchronized (this.A0I) {
            Log.i("xmpp/handler/logout-timer/reset");
            if (A0H()) {
                A07();
            }
        }
    }

    public final void A05() {
        Application application = this.A0a.A00;
        synchronized (this.A0I) {
            Log.i("xmpp/handler/logout-timer/cancel");
            PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent("com.whatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.whatsapp"), 536870912);
            if (broadcast != null) {
                AlarmManager A02 = this.A0X.A02();
                if (A02 != null) {
                    A02.cancel(broadcast);
                } else {
                    Log.w("MessageHandler/cancelLogoutTimer AlarmManager is null");
                }
                broadcast.cancel();
            }
        }
    }

    public final void A06() {
        synchronized (this.A1X) {
            this.A0w.A00(A0G() ? false : true);
        }
    }

    public final void A07() {
        Application application = this.A0a.A00;
        synchronized (this.A0I) {
            Log.i("xmpp/handler/logout-timer/start");
            AlarmManager A02 = this.A0X.A02();
            if (A02 != null) {
                PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent("com.whatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.whatsapp"), 134217728);
                long A03 = (this.A0i.A03(431) * 60 * 1000) + SystemClock.elapsedRealtime();
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A02.setExactAndAllowWhileIdle(2, A03, broadcast);
                } else if (i >= 19) {
                    A02.setExact(2, A03, broadcast);
                } else {
                    A02.set(2, A03, broadcast);
                }
            } else {
                Log.w("MessageHandler/startLogoutTimer AlarmManager is null");
            }
        }
    }

    public void A08(int i) {
        Message obtain = Message.obtain(null, 0, 2, 0);
        obtain.getData().putBoolean("force", true);
        obtain.getData().putInt("connect_reason", i);
        sendMessage(obtain);
    }

    public void A09(boolean z) {
        C000200d.A1C("xmpp/service/stop/unregister:", z);
        this.A0U.A06 = false;
        Message obtain = Message.obtain(null, 0, 1, 0);
        obtain.getData().putBoolean("should_unregister", z);
        sendMessage(obtain);
    }

    public final void A0A(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A03;
        if (j > 0 && elapsedRealtime < j) {
            Log.i("xmpp/handler/schedule-reconnect/already-pending");
            return;
        }
        Application application = this.A0a.A00;
        if (this.A0G) {
            this.A1T.A03(this.A02);
            this.A0G = false;
        }
        C0J5 c0j5 = this.A1T;
        long A01 = c0j5.A01();
        this.A02 = c0j5.A00();
        long j2 = A01 * 10000;
        if (j2 == 0) {
            Log.i("xmpp/handler/schedule-reconnect/immediate");
            A08(0);
            return;
        }
        Random random = this.A1Y;
        long nextLong = ((random.nextLong() & Long.MAX_VALUE) % j2) + (j2 / 2);
        if (z) {
            long j3 = A1d;
            if (nextLong > j3) {
                nextLong = (random.nextInt(60) - 30) + j3;
                Log.i("xmpp/handler/schedule-reconnect/backoff clamped to ~15mins");
            }
        }
        StringBuilder sb = new StringBuilder("xmpp/handler/schedule-reconnect/backoff:");
        sb.append(nextLong);
        Log.i(sb.toString());
        Intent intent = new Intent("com.whatsapp.MessageHandler.RECONNECT_ACTION").setPackage("com.whatsapp");
        intent.putExtra("connect_reason", 3);
        PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, intent, 0);
        AlarmManager A02 = this.A0X.A02();
        if (A02 != null) {
            long j4 = elapsedRealtime + nextLong;
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                A02.setExactAndAllowWhileIdle(2, j4, broadcast);
            } else if (i >= 19) {
                A02.setExact(2, j4, broadcast);
            } else {
                A02.set(2, j4, broadcast);
            }
            this.A03 = j4;
            return;
        }
        Log.w("MessageHandler/scheduleReconnect AlarmManager is null");
        this.A03 = 0L;
    }

    public void A0B(boolean z, boolean z2) {
        Application application = this.A0a.A00;
        AlarmManager A02 = this.A0X.A02();
        if (A02 != null) {
            Intent intent = new Intent("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION").setPackage("com.whatsapp");
            if (!z) {
                PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, intent, 536870912);
                if (broadcast != null) {
                    Log.i("connectivity retry alarm canceled");
                    A02.cancel(broadcast);
                    broadcast.cancel();
                }
            } else if (!z2) {
                PendingIntent broadcast2 = PendingIntent.getBroadcast(application, 0, intent, 134217728);
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A02.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + 60000, broadcast2);
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime() + 60000;
                    if (i >= 19) {
                        A02.setExact(2, elapsedRealtime, broadcast2);
                    } else {
                        A02.set(2, elapsedRealtime, broadcast2);
                    }
                }
                Log.i("connectivity retry alarm set for 60000ms from now");
                return;
            }
        } else {
            Log.w("MessageHandler/onCaptivePortalDetectionAndWaitDone AlarmManager is null");
        }
        A1e.set(z);
        A1c.countDown();
    }

    public final void A0C(boolean z, boolean z2, boolean z3) {
        A0E(z, z2, z3, false, false, null, null, 0);
    }

    public void A0D(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        A0F(z, z2, z3, z4, false, null, null, false, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0013, code lost:
        if (r4 >= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0017, code lost:
        if (r0 != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, java.lang.String r16, java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40291rx.A0E(boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, int):void");
    }

    public void A0F(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, int i) {
        Message obtain = Message.obtain(null, 0, 2, 0);
        obtain.getData().putBoolean("force", z);
        obtain.getData().putBoolean("force_no_ongoing_backoff", z2);
        obtain.getData().putBoolean("reset", z3);
        obtain.getData().putBoolean("check_connection", z4);
        obtain.getData().putBoolean("notify_on_failure", z5);
        obtain.getData().putString("ip_address", str);
        obtain.getData().putString("cl_sess", str2);
        obtain.getData().putBoolean("fgservice", z6);
        obtain.getData().putInt("connect_reason", i);
        sendMessage(obtain);
    }

    public boolean A0G() {
        SharedPreferences sharedPreferences = this.A0c.A00;
        return !this.A0S.A0E(C01C.A0t) && sharedPreferences.contains("c2dm_reg_id") && sharedPreferences.getInt("logins_with_messages", 0) < 3;
    }

    public final boolean A0H() {
        boolean z;
        synchronized (this.A0I) {
            z = PendingIntent.getBroadcast(this.A0a.A00, 0, new Intent("com.whatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.whatsapp"), 536870912) != null;
            StringBuilder sb = new StringBuilder();
            sb.append("xmpp/handler/logout-timer/has=");
            sb.append(z);
            Log.i(sb.toString());
        }
        return z;
    }
}
