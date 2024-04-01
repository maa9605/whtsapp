package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2Az  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47382Az extends BroadcastReceiver {
    public final C47782Co A00;
    public final C02E A01;
    public final C001200o A02;
    public final C47232Ak A03;
    public final C26Y A04;
    public final C2AU A05;
    public volatile boolean A07 = false;
    public final Object A06 = new Object();

    public C47382Az(C001200o c001200o, C02E c02e, C26Y c26y, C47232Ak c47232Ak, C2AU c2au, C47782Co c47782Co) {
        this.A02 = c001200o;
        this.A01 = c02e;
        this.A04 = c26y;
        this.A03 = c47232Ak;
        this.A05 = c2au;
        this.A00 = c47782Co;
    }

    public void A00() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.A02.A00, 0, new Intent("com.whatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.whatsapp"), 536870912);
        if (broadcast != null) {
            AlarmManager A02 = this.A01.A02();
            if (A02 != null) {
                A02.cancel(broadcast);
            } else {
                Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/cancelAvailableTimeoutAlarm AlarmManager is null");
            }
            broadcast.cancel();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A07) {
            synchronized (this.A06) {
                if (!this.A07) {
                    AnonymousClass029.A0Y(context);
                    this.A07 = true;
                }
            }
        }
        C26Y c26y = this.A04;
        if (!c26y.A00()) {
            C47232Ak c47232Ak = this.A03;
            c47232Ak.A05.A00();
            StringBuilder sb = new StringBuilder("presencestatemanager/setUnavailable previous-state: ");
            C26Y c26y2 = c47232Ak.A06;
            sb.append(c26y2);
            Log.i(sb.toString());
            c26y2.A00 = 3;
            C2AU c2au = this.A05;
            c2au.A00 = false;
            c2au.A02();
            this.A00.A00.clear();
        }
        StringBuilder A0P = C000200d.A0P("app/presenceavailable/timeout/foreground ");
        A0P.append(c26y);
        Log.i(A0P.toString());
    }
}
