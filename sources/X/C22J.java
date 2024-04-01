package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;

/* renamed from: X.22J  reason: invalid class name */
/* loaded from: classes2.dex */
public class C22J {
    public int A00;
    public C22T A01;
    public C22S A02;
    public C0KS A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final C01B A09;
    public final C010005b A0A;
    public final C02E A0B;
    public final C001200o A0C;
    public volatile long A0D;

    public C22J(C001200o c001200o, C01B c01b, C02E c02e, Looper looper, C010005b c010005b) {
        this.A0C = c001200o;
        this.A09 = c01b;
        this.A0B = c02e;
        this.A08 = new Handler(looper);
        this.A0A = c010005b;
    }

    public long A00() {
        return Math.min(32000L, Math.max(8000L, this.A09.A07(C01C.A3n) * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
    }

    public void A01() {
        Log.i("xmpp/client-ping/on-demand-ping");
        this.A08.post(new RunnableEBaseShape4S0100000_I0_4(this, 17));
    }

    public final void A02() {
        Log.i("xmpp/client-ping/timeout/cancel-alarm");
        A07(new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"));
    }

    public final void A03() {
        C000700j.A02(this.A08);
        if (this.A06) {
            return;
        }
        A07(new Intent("com.whatsapp.MessageHandler.CLIENT_PINGER_ACTION"));
        A07(new Intent("com.whatsapp.MessageHandler.CLIENT_PINGER_ACTION").setPackage("com.whatsapp"));
        this.A06 = true;
    }

    public final void A04() {
        Log.i("xmpp/client-ping/ping-timeout");
        C000700j.A02(this.A08);
        if (this.A05 && this.A03 != null) {
            if (!this.A0A.A06) {
                Log.w("xmpp/client-ping/ping-timeout; xmpp connection is not ready, ignoring.");
                return;
            } else if (this.A07) {
                Log.w("xmpp/client-ping/ping-timeout; already notified about timeout, ignoring.");
                return;
            } else {
                this.A03.ASW();
                this.A07 = true;
                A02();
                return;
            }
        }
        Log.w("xmpp/client-ping/ping-timeout; not connected, ignoring.");
    }

    public final void A05() {
        Log.i("xmpp/client-ping/send-ping");
        C000700j.A02(this.A08);
        if (this.A05 && this.A03 != null) {
            if (this.A0D > 0) {
                Log.w("xmpp/client-ping/send-ping; skipping ping request, pending ping already exists.");
                if (this.A0D > 0) {
                    if (SystemClock.elapsedRealtime() > A00() + this.A0D) {
                        A04();
                        return;
                    }
                    return;
                }
                return;
            }
            Log.i("xmpp/client-ping/periodic/cancel-alarm");
            A07(new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"));
            this.A0D = SystemClock.elapsedRealtime();
            this.A07 = false;
            Log.i("xmpp/client-ping/timeout/schedule-alarm");
            PendingIntent broadcast = PendingIntent.getBroadcast(this.A0C.A00, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.whatsapp"), 134217728);
            long elapsedRealtime = SystemClock.elapsedRealtime() + A00();
            AlarmManager A02 = this.A0B.A02();
            if (A02 == null) {
                Log.w("xmpp/client-ping/timeout/schedule-alarm; failed to schedule alarm");
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    A02.setExactAndAllowWhileIdle(2, elapsedRealtime, broadcast);
                } else if (i >= 19) {
                    A02.setExact(2, elapsedRealtime, broadcast);
                } else {
                    A02.set(2, elapsedRealtime, broadcast);
                }
            }
            this.A03.ASQ();
            this.A00++;
            return;
        }
        Log.w("xmpp/client-ping/send-ping; not connected, ignoring.");
    }

    public final void A06() {
        Log.i("xmpp/client-ping/periodic/schedule-alarm");
        Application application = this.A0C.A00;
        AlarmManager A02 = this.A0B.A02();
        if (A02 == null) {
            Log.w("xmpp/client-ping/periodic/schedule-alarm; alarm manager is null");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(application, 0, new Intent("com.whatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.whatsapp"), 134217728);
        A02.set(this.A04 ? 3 : 2, SystemClock.elapsedRealtime() + (this.A00 == 0 ? 15000L : 240000L), broadcast);
    }

    public void A07(Intent intent) {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A0C.A00, 0, intent, 536870912);
        if (broadcast == null) {
            return;
        }
        AlarmManager A02 = this.A0B.A02();
        if (A02 == null) {
            Log.w("xmpp/client-ping/cancel-alarm; service is null");
            return;
        }
        A02.cancel(broadcast);
        broadcast.cancel();
    }
}
