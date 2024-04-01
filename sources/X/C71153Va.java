package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.schedulers.alarm.SchedulerExperimentAlarmReceiver;

/* renamed from: X.3Va */
/* loaded from: classes2.dex */
public class C71153Va {
    public static volatile C71153Va A03;
    public final AlarmManager A00;
    public final C001200o A01;
    public final C41861ud A02;

    public C71153Va(C001200o c001200o, C02E c02e, C41861ud c41861ud) {
        this.A01 = c001200o;
        this.A00 = c02e.A02();
        this.A02 = c41861ud;
    }

    public static C71153Va A00() {
        if (A03 == null) {
            synchronized (C71153Va.class) {
                if (A03 == null) {
                    A03 = new C71153Va(C001200o.A01, C02E.A00(), C41861ud.A00());
                }
            }
        }
        return A03;
    }

    public final Intent A01() {
        Intent intent = new Intent(this.A01.A00, SchedulerExperimentAlarmReceiver.class);
        intent.setAction("com.whatsapp.schexp.PERIODIC_API");
        intent.putExtra("alarm_period", this.A02.A02());
        return intent;
    }

    public void A02() {
        AlarmManager alarmManager;
        C41861ud c41861ud = this.A02;
        if (c41861ud.A01() == 2 && (alarmManager = this.A00) != null) {
            PendingIntent broadcast = PendingIntent.getBroadcast(this.A01.A00, 0, A01(), 0);
            long A02 = c41861ud.A02();
            alarmManager.setInexactRepeating(3, SystemClock.elapsedRealtime() + A02, A02, broadcast);
        }
    }

    public final void A03() {
        AlarmManager alarmManager;
        C41861ud c41861ud = this.A02;
        if (c41861ud.A01() == 3 && (alarmManager = this.A00) != null) {
            C001200o c001200o = this.A01;
            Intent intent = new Intent(c001200o.A00, SchedulerExperimentAlarmReceiver.class);
            intent.setAction("com.whatsapp.schexp.PERIODIC_MANUAL");
            alarmManager.set(3, SystemClock.elapsedRealtime() + c41861ud.A02(), PendingIntent.getBroadcast(c001200o.A00, 0, intent, 0));
        }
    }

    public void A04(Intent intent) {
        PendingIntent broadcast;
        AlarmManager alarmManager = this.A00;
        if (alarmManager == null || (broadcast = PendingIntent.getBroadcast(this.A01.A00, 0, intent, 536870912)) == null) {
            return;
        }
        alarmManager.cancel(broadcast);
        broadcast.cancel();
    }
}
