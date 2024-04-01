package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.messaging.CaptivePortalActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2Ak */
/* loaded from: classes2.dex */
public class C47232Ak {
    public static volatile C47232Ak A09;
    public final Handler A00;
    public final C03150Ej A01;
    public final C010005b A02;
    public final C02E A03;
    public final C001200o A04;
    public final C47382Az A05;
    public final C26Y A06;
    public final C2AU A07;
    public final InterfaceC002901k A08;

    public C47232Ak(C001200o c001200o, InterfaceC002901k interfaceC002901k, C02E c02e, C26Y c26y, C010005b c010005b, C2AU c2au, final C03150Ej c03150Ej, C47782Co c47782Co) {
        this.A04 = c001200o;
        this.A08 = interfaceC002901k;
        this.A03 = c02e;
        this.A06 = c26y;
        this.A02 = c010005b;
        this.A07 = c2au;
        this.A01 = c03150Ej;
        this.A05 = new C47382Az(c001200o, c02e, c26y, this, c2au, c47782Co);
        this.A00 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.3St
            {
                C47232Ak.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C47232Ak c47232Ak = C47232Ak.this;
                C03150Ej c03150Ej2 = c03150Ej;
                if (message.what != 1) {
                    return false;
                }
                if (!c03150Ej2.A00) {
                    c47232Ak.A02(false);
                    return true;
                }
                return true;
            }
        });
    }

    public static C47232Ak A00() {
        if (A09 == null) {
            synchronized (C47232Ak.class) {
                if (A09 == null) {
                    A09 = new C47232Ak(C001200o.A01, C002801j.A00(), C02E.A00(), C26Y.A01, C010005b.A07, C2AU.A00(), C03150Ej.A00(), C47782Co.A00());
                }
            }
        }
        return A09;
    }

    public void A01() {
        C26Y c26y = this.A06;
        if (c26y.A00()) {
            c26y.A00 = 2;
            C47382Az c47382Az = this.A05;
            if (c47382Az != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() + 15000;
                PendingIntent broadcast = PendingIntent.getBroadcast(c47382Az.A02.A00, 0, new Intent("com.whatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.whatsapp"), 134217728);
                AlarmManager A02 = c47382Az.A01.A02();
                if (A02 != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        A02.setExactAndAllowWhileIdle(2, elapsedRealtime, broadcast);
                    } else if (i >= 19) {
                        A02.setExact(2, elapsedRealtime, broadcast);
                    } else {
                        A02.set(2, elapsedRealtime, broadcast);
                    }
                } else {
                    Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/startAvailableTimeoutAlarm AlarmManager is null");
                }
            } else {
                throw null;
            }
        }
        StringBuilder A0P = C000200d.A0P("presencestatemanager/startTransitionToUnavailable/new-state ");
        A0P.append(c26y);
        Log.i(A0P.toString());
    }

    public final void A02(boolean z) {
        Application application = this.A04.A00;
        C03150Ej c03150Ej = this.A01;
        C02E c02e = this.A03;
        C000700j.A01();
        if (C03140Ei.A05) {
            boolean z2 = !C03140Ei.A00(c02e);
            C03140Ei.A05 = z2;
            C000200d.A1V(C000200d.A0P("ScreenLockReceiver manual check; locked="), z2);
            c03150Ej.A02(C03140Ei.A05);
        }
        C26Y c26y = this.A06;
        if (!c26y.A00()) {
            if (c26y.A02()) {
                this.A05.A00();
                c26y.A00 = 1;
            } else if (z) {
                c26y.A00 = 1;
                C010005b c010005b = this.A02;
                if (!c010005b.A03) {
                    C2AU c2au = this.A07;
                    c2au.A00 = true;
                    c2au.A01();
                }
                if (!c010005b.A02) {
                    this.A08.ARy(new C0HS(application, c010005b) { // from class: X.2Cp
                        public final Context A00;
                        public final C010005b A01;

                        {
                            this.A00 = application;
                            this.A01 = c010005b;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
                            if (r1 == false) goto L10;
                         */
                        @Override // X.C0HS
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public java.lang.Object A07(java.lang.Object[] r3) {
                            /*
                                r2 = this;
                                X.05b r0 = r2.A01     // Catch: java.lang.InterruptedException -> L24
                                boolean r0 = r0.A06     // Catch: java.lang.InterruptedException -> L24
                                if (r0 == 0) goto L1e
                                java.lang.String r0 = "awaiting captive wifi status"
                                com.whatsapp.util.Log.i(r0)     // Catch: java.lang.InterruptedException -> L24
                                java.util.concurrent.CountDownLatch r0 = X.C40291rx.A1c     // Catch: java.lang.InterruptedException -> L24
                                r0.await()     // Catch: java.lang.InterruptedException -> L24
                                java.util.concurrent.atomic.AtomicBoolean r0 = X.C40291rx.A1e     // Catch: java.lang.InterruptedException -> L24
                                boolean r1 = r0.get()     // Catch: java.lang.InterruptedException -> L24
                                java.lang.String r0 = "captive wifi status is "
                                X.C000200d.A1C(r0, r1)     // Catch: java.lang.InterruptedException -> L24
                                r0 = 1
                                if (r1 != 0) goto L1f
                            L1e:
                                r0 = 0
                            L1f:
                                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.InterruptedException -> L24
                                return r0
                            L24:
                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C47792Cp.A07(java.lang.Object[]):java.lang.Object");
                        }

                        @Override // X.C0HS
                        public void A09(Object obj) {
                            if (((Boolean) obj).booleanValue()) {
                                Context context = this.A00;
                                Intent intent = new Intent(context, CaptivePortalActivity.class);
                                intent.setFlags(268435456);
                                context.startActivity(intent);
                            }
                        }
                    }, new Void[0]);
                }
            }
        }
        StringBuilder A0P = C000200d.A0P("presencestatemanager/setAvailable/new-state: ");
        A0P.append(c26y);
        A0P.append(" setIfUnavailable:");
        A0P.append(z);
        Log.i(A0P.toString());
    }
}
