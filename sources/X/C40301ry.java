package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1ry */
/* loaded from: classes2.dex */
public class C40301ry {
    public static volatile C40301ry A0n;
    public Handler A01;
    public RunnableC460224q A02;
    public boolean A03;
    public final C03020Dv A04;
    public final AbstractC000600i A05;
    public final C012005w A06;
    public final C018508q A07;
    public final C02L A08;
    public final C03150Ej A09;
    public final C01B A0A;
    public final C0L8 A0B;
    public final C0LA A0C;
    public final C03160Eo A0D;
    public final C03170Ep A0E;
    public final C0L7 A0F;
    public final C05W A0G;
    public final C018708s A0H;
    public final C0L5 A0I;
    public final C03120Eg A0J;
    public final C02E A0K;
    public final AnonymousClass012 A0L;
    public final C001200o A0M;
    public final C005102h A0N;
    public final C000500h A0O;
    public final C002301c A0P;
    public final C05M A0Q;
    public final C0CA A0R;
    public final C0C9 A0S;
    public final C0C8 A0T;
    public final C03180Eq A0U;
    public final C05O A0V;
    public final C40421sE A0W;
    public final C0L9 A0X;
    public final C0DU A0Z;
    public final C41621uF A0a;
    public final C459724l A0b;
    public final C0FQ A0c;
    public final C05G A0d;
    public final C0CB A0e;
    public final C43101wr A0f;
    public final C03070Ea A0g;
    public final C0H9 A0h;
    public final C459824m A0i;
    public final C0L6 A0j;
    public final C41991uq A0k;
    public volatile long A0m;
    public final C459924n A0Y = new C459924n(this);
    public long A00 = System.currentTimeMillis() - 200;
    public final Map A0l = new HashMap();

    public C40301ry(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, C03070Ea c03070Ea, AbstractC000600i abstractC000600i, C05M c05m, C012005w c012005w, C05O c05o, C41991uq c41991uq, C01B c01b, C0L5 c0l5, C0L6 c0l6, C03160Eo c03160Eo, C03170Ep c03170Ep, C0L7 c0l7, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C0FQ c0fq, C43101wr c43101wr, C0H9 c0h9, C0C9 c0c9, C03180Eq c03180Eq, C0CB c0cb, C0DU c0du, C0L8 c0l8, C0L9 c0l9, C41621uF c41621uF, C40421sE c40421sE, C000500h c000500h, C0CA c0ca, C005102h c005102h, C03150Ej c03150Ej, C0C8 c0c8, C459724l c459724l, C05G c05g, C03020Dv c03020Dv, C0LA c0la, C03120Eg c03120Eg, C459824m c459824m) {
        this.A0M = c001200o;
        this.A0L = anonymousClass012;
        this.A07 = c018508q;
        this.A08 = c02l;
        this.A0g = c03070Ea;
        this.A05 = abstractC000600i;
        this.A0Q = c05m;
        this.A06 = c012005w;
        this.A0V = c05o;
        this.A0k = c41991uq;
        this.A0A = c01b;
        this.A0I = c0l5;
        this.A0j = c0l6;
        this.A0D = c03160Eo;
        this.A0E = c03170Ep;
        this.A0F = c0l7;
        this.A0G = c05w;
        this.A0K = c02e;
        this.A0H = c018708s;
        this.A0P = c002301c;
        this.A0c = c0fq;
        this.A0f = c43101wr;
        this.A0h = c0h9;
        this.A0S = c0c9;
        this.A0U = c03180Eq;
        this.A0e = c0cb;
        this.A0Z = c0du;
        this.A0B = c0l8;
        this.A0X = c0l9;
        this.A0a = c41621uF;
        this.A0W = c40421sE;
        this.A0O = c000500h;
        this.A0R = c0ca;
        this.A0N = c005102h;
        this.A09 = c03150Ej;
        this.A0T = c0c8;
        this.A0b = c459724l;
        this.A0d = c05g;
        this.A04 = c03020Dv;
        this.A0C = c0la;
        this.A0J = c03120Eg;
        this.A0i = c459824m;
        c0la.A01.A00(new C0LB() { // from class: X.24o
            {
                C40301ry.this = this;
            }

            @Override // X.C0LB
            public final void AOe() {
                C40301ry.this.A04();
            }
        });
    }

    public static C40301ry A00() {
        if (A0n == null) {
            synchronized (C40301ry.class) {
                if (A0n == null) {
                    A0n = new C40301ry(C001200o.A01, AnonymousClass012.A00(), C018508q.A00(), C02L.A00(), C03070Ea.A00(), AbstractC000600i.A00(), C05M.A00(), C012005w.A00(), C05O.A00(), C41991uq.A00(), C01B.A00(), C0L5.A01(), C0L6.A00(), C03160Eo.A00(), C03170Ep.A00(), C0L7.A02(), C05W.A00(), C02E.A00(), C018708s.A00(), C002301c.A00(), C0FQ.A00(), C43101wr.A01(), C0H9.A00(), C0C9.A00(), C03180Eq.A00(), C0CB.A00(), C0DU.A01(), C0L8.A00(), C0L9.A00(), C41621uF.A00(), C40421sE.A00(), C000500h.A00(), C0CA.A00(), C005102h.A00(), C03150Ej.A00(), C0C8.A00(), C459724l.A01, C05G.A00(), C03020Dv.A00(), C0LA.A00(), C03120Eg.A00(), C459824m.A00());
                }
            }
        }
        return A0n;
    }

    public static final void A01(List list) {
        if (list == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((AnonymousClass092) it.next()).A0n.A01);
            sb.append(' ');
        }
        sb.toString();
    }

    public final synchronized Handler A02() {
        Handler handler;
        handler = this.A01;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("Notifications", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A01 = handler;
        }
        return handler;
    }

    public void A03() {
        C41991uq c41991uq = this.A0k;
        if (c41991uq.A0L.A04()) {
            PendingIntent broadcast = PendingIntent.getBroadcast(c41991uq.A0G.A00, 0, new Intent("com.whatsapp.alarm.WEB_RENOTIFY").setPackage("com.whatsapp"), 536870912);
            if (broadcast != null) {
                AlarmManager A02 = c41991uq.A0E.A02();
                if (A02 != null) {
                    A02.cancel(broadcast);
                } else {
                    Log.w("WebSession/cancelReNotify AlarmManager is null");
                }
                broadcast.cancel();
            }
        }
        C41621uF c41621uF = this.A0a;
        synchronized (c41621uF) {
            c41621uF.A01 = null;
            c41621uF.A00 = null;
        }
    }

    public void A04() {
        A0A(null, true, true, false);
    }

    public void A05(AbstractC005302j abstractC005302j) {
        A02().post(new RunnableEBaseShape3S0200000_I0_3(this, abstractC005302j, 27));
        A03();
    }

    public void A06(AbstractC005302j abstractC005302j, AnonymousClass092 anonymousClass092) {
        A02().post(new RunnableEBaseShape0S0300000_I0_0(this, abstractC005302j, anonymousClass092, 31));
    }

    public void A07(AbstractC005302j abstractC005302j, AnonymousClass092 anonymousClass092) {
        A02().post(new RunnableEBaseShape0S0300000_I0_0(this, anonymousClass092, abstractC005302j, 30));
    }

    public void A08(AnonymousClass094 anonymousClass094, boolean z, boolean z2) {
        if (anonymousClass094 != null) {
            AnonymousClass092 A05 = this.A0S.A0H.A05(anonymousClass094);
            if (A05 != null) {
                C0DB.A08(A05);
                A0A(A05, false, z, z2);
                return;
            }
            Log.i("messagenotification/refreshStatusBarNotificationIfMessageExists/no-message");
            return;
        }
        Log.e("messagenotification/refreshStatusBarNotificationIfMessageExists/no-messag-key");
    }

    public void A09(AnonymousClass092 anonymousClass092, boolean z, boolean z2) {
        A0B(anonymousClass092, z, this.A03, false, false, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0005, code lost:
        if (r9 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(X.AnonymousClass092 r8, boolean r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            r1 = r8
            r2 = r9
            if (r8 == 0) goto L7
            r6 = 1
            if (r9 == 0) goto L8
        L7:
            r6 = 0
        L8:
            r5 = 0
            r0 = r7
            r4 = r11
            r3 = r10
            r0.A0B(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40301ry.A0A(X.092, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0076, code lost:
        if (r67 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fe, code lost:
        if (r11 != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B(X.AnonymousClass092 r67, boolean r68, boolean r69, boolean r70, boolean r71, boolean r72) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40301ry.A0B(X.092, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0C(boolean z) {
        A02().post(new RunnableEBaseShape0S0110000_I0(this, z, 11));
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x002b, code lost:
        if (r1.contains(r0.A03) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0039, code lost:
        if (r0.A0A() != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0D(X.AnonymousClass092 r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 != 0) goto L4
            return r5
        L4:
            X.094 r0 = r7.A0n
            X.02j r3 = r0.A00
            boolean r0 = X.C003101m.A0Y(r3)
            if (r0 == 0) goto L13
            int r0 = r7.A08
            if (r0 != 0) goto L13
            return r5
        L13:
            byte r1 = r7.A0m
            r0 = 36
            if (r1 != r0) goto L1a
            return r5
        L1a:
            java.util.List r1 = r7.A0c
            r4 = 1
            if (r1 == 0) goto L2d
            X.02L r0 = r6.A08
            r0.A05()
            com.whatsapp.jid.UserJid r0 = r0.A03
            boolean r0 = r1.contains(r0)
            r2 = 1
            if (r0 != 0) goto L2e
        L2d:
            r2 = 0
        L2e:
            X.092 r0 = r7.A0C()
            if (r0 == 0) goto L3b
            X.02j r0 = r0.A0A()
            r1 = 1
            if (r0 == 0) goto L3c
        L3b:
            r1 = 0
        L3c:
            boolean r0 = X.C003101m.A0U(r3)
            if (r0 == 0) goto L56
            if (r1 != 0) goto L46
            if (r2 == 0) goto L56
        L46:
            X.0CB r1 = r6.A0e
            X.02j r0 = r7.A0A()
            if (r0 == 0) goto L73
            X.0Fl r0 = r1.A07(r0)
            boolean r5 = r0.A0A()
        L56:
            if (r3 == 0) goto L61
            X.05M r0 = r6.A0Q
            boolean r0 = r0.A0F(r3)
            if (r0 == 0) goto L61
            return r5
        L61:
            X.0CB r0 = r6.A0e
            if (r3 == 0) goto L71
            X.0Fl r0 = r0.A07(r3)
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L70
            return r4
        L70:
            return r5
        L71:
            r0 = 0
            throw r0
        L73:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40301ry.A0D(X.092):boolean");
    }
}
