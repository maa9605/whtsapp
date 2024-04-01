package X;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;

/* renamed from: X.0Eo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03160Eo {
    public static volatile C03160Eo A0A;
    public Handler A00;
    public Runnable A01;
    public final C02L A02;
    public final C001200o A03;
    public final C05M A04;
    public final C0CA A05;
    public final C03180Eq A06;
    public final C0FQ A07;
    public final C0CB A08;
    public final C00J A09;

    public C03160Eo(C001200o c001200o, C02L c02l, C05M c05m, C0FQ c0fq, C03180Eq c03180Eq, C0CB c0cb, C0CA c0ca, C00J c00j) {
        this.A03 = c001200o;
        this.A02 = c02l;
        this.A04 = c05m;
        this.A07 = c0fq;
        this.A06 = c03180Eq;
        this.A08 = c0cb;
        this.A05 = c0ca;
        this.A09 = c00j;
    }

    public static C03160Eo A00() {
        if (A0A == null) {
            synchronized (C03160Eo.class) {
                if (A0A == null) {
                    A0A = new C03160Eo(C001200o.A01, C02L.A00(), C05M.A00(), C0FQ.A00(), C03180Eq.A00(), C0CB.A00(), C0CA.A00(), C007203d.A00(new InterfaceC007103c() { // from class: X.0GI
                        @Override // X.InterfaceC007103c
                        public final Object get() {
                            return C03080Ec.A00();
                        }
                    }));
                }
            }
        }
        return A0A;
    }

    public synchronized Handler A01() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("update_widget", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    public synchronized void A02() {
        final C001200o c001200o = this.A03;
        Application application = c001200o.A00;
        try {
            int[] appWidgetIds = AppWidgetManager.getInstance(application).getAppWidgetIds(new ComponentName(application, WidgetProvider.class));
            if (appWidgetIds != null && appWidgetIds.length > 0) {
                Intent intent = new Intent(application, WidgetProvider.class);
                intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                intent.putExtra("appWidgetIds", appWidgetIds);
                application.sendBroadcast(intent);
            }
        } catch (RuntimeException e) {
            Log.e("widgetprovider/getAppWidgetIds failed", e);
        }
        C0FQ c0fq = this.A07;
        final C0FS A01 = c0fq.A01(application);
        if (A01 != null && A01 != c0fq.A02) {
            if (this.A01 == null) {
                final C02L c02l = this.A02;
                final C05M c05m = this.A04;
                final C03180Eq c03180Eq = this.A06;
                final C0CB c0cb = this.A08;
                final C0CA c0ca = this.A05;
                final C00J c00j = this.A09;
                this.A01 = new Runnable(c001200o, c02l, c05m, A01, c03180Eq, c0cb, c0ca, c00j) { // from class: X.1MQ
                    public final C02L A00;
                    public final C001200o A01;
                    public final C05M A02;
                    public final C0CA A03;
                    public final C03180Eq A04;
                    public final C0FS A05;
                    public final C0CB A06;
                    public final C00J A07;

                    {
                        this.A01 = c001200o;
                        this.A00 = c02l;
                        this.A02 = c05m;
                        this.A05 = A01;
                        this.A04 = c03180Eq;
                        this.A06 = c0cb;
                        this.A03 = c0ca;
                        this.A07 = c00j;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
                        if (r0 == false) goto L44;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            r9 = this;
                            X.0CA r0 = r9.A03
                            java.util.ArrayList r0 = r0.A08()
                            java.util.Iterator r8 = r0.iterator()
                            r7 = 0
                        Lb:
                            boolean r0 = r8.hasNext()
                            if (r0 == 0) goto L8a
                            java.lang.Object r2 = r8.next()
                            X.02j r2 = (X.AbstractC005302j) r2
                            X.05M r0 = r9.A02
                            int r4 = r0.A01(r2)
                            if (r4 <= 0) goto Lb
                            X.0CB r3 = r9.A06
                            X.0Fl r0 = r3.A07(r2)
                            boolean r0 = r0.A0A()
                            if (r0 != 0) goto L84
                            X.0Eq r1 = r9.A04
                            r0 = 7
                            int r0 = java.lang.Math.min(r4, r0)
                            java.util.ArrayList r0 = r1.A07(r2, r0)
                            java.util.Iterator r6 = r0.iterator()
                        L3a:
                            boolean r0 = r6.hasNext()
                            if (r0 == 0) goto Lb
                            java.lang.Object r5 = r6.next()
                            X.092 r5 = (X.AnonymousClass092) r5
                            java.util.List r1 = r5.A0c
                            r2 = 1
                            if (r1 == 0) goto L59
                            X.02L r0 = r9.A00
                            r0.A05()
                            com.whatsapp.jid.UserJid r0 = r0.A03
                            boolean r0 = r1.contains(r0)
                            r1 = 1
                            if (r0 != 0) goto L5a
                        L59:
                            r1 = 0
                        L5a:
                            X.092 r0 = r5.A0C()
                            if (r0 == 0) goto L86
                            X.02j r0 = r0.A0A()
                            if (r0 != 0) goto L86
                        L66:
                            X.094 r0 = r5.A0n
                            X.02j r0 = r0.A00
                            boolean r0 = X.C003101m.A0U(r0)
                            if (r0 == 0) goto L3a
                            if (r2 != 0) goto L74
                            if (r1 == 0) goto L3a
                        L74:
                            X.02j r0 = r5.A0A()
                            if (r0 == 0) goto L88
                            X.0Fl r0 = r3.A07(r0)
                            boolean r0 = r0.A0A()
                            if (r0 == 0) goto L3a
                        L84:
                            int r7 = r7 + r4
                            goto Lb
                        L86:
                            r2 = 0
                            goto L66
                        L88:
                            r0 = 0
                            throw r0
                        L8a:
                            X.00J r0 = r9.A07
                            java.lang.Object r0 = r0.get()
                            X.0Ec r0 = (X.C03080Ec) r0
                            r0.A04()
                            java.util.List r0 = r0.A00
                            int r2 = r0.size()
                            int r2 = r2 + r7
                            java.lang.String r0 = "widgetprovider/updatebadgecount:"
                            X.C000200d.A0q(r0, r2)
                            X.0FS r1 = r9.A05
                            X.00o r0 = r9.A01
                            android.app.Application r0 = r0.A00
                            r1.A01(r0, r2)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1MQ.run():void");
                    }
                };
            }
            A01().removeCallbacks(this.A01);
            A01().post(this.A01);
        }
    }
}
