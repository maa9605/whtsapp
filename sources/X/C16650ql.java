package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0ql  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16650ql {
    public static final String A00 = AbstractC16430qO.A01("Alarms");

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r4 == Integer.MAX_VALUE) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(android.content.Context r9, X.C0OP r10, java.lang.String r11, long r12) {
        /*
            androidx.work.impl.WorkDatabase r6 = r10.A04
            X.0rI r5 = r6.A08()
            X.1Vv r5 = (X.C29201Vv) r5
            X.0rH r0 = r5.A00(r11)
            if (r0 == 0) goto L17
            int r0 = r0.A00
            A01(r9, r11, r0)
            A02(r9, r11, r0, r12)
            return
        L17:
            java.lang.Class<X.0rV> r8 = X.C17070rV.class
            monitor-enter(r8)
            java.lang.String r7 = "next_alarm_manager_id"
            r6.A03()     // Catch: java.lang.Throwable -> L61
            X.0rG r0 = r6.A07()     // Catch: java.lang.Throwable -> L5c
            X.1Vt r0 = (X.C29181Vt) r0     // Catch: java.lang.Throwable -> L61
            java.lang.Long r0 = r0.A00(r7)     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            if (r0 == 0) goto L48
            int r4 = r0.intValue()     // Catch: java.lang.Throwable -> L5c
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r0) goto L49
        L35:
            X.0rG r3 = r6.A07()     // Catch: java.lang.Throwable -> L5c
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L5c
            X.0rF r0 = new X.0rF     // Catch: java.lang.Throwable -> L5c
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L5c
            X.1Vt r3 = (X.C29181Vt) r3     // Catch: java.lang.Throwable -> L5c
            r3.A01(r0)     // Catch: java.lang.Throwable -> L5c
            r6.A05()     // Catch: java.lang.Throwable -> L5c
            goto L4c
        L48:
            r4 = 0
        L49:
            int r1 = r4 + 1
            goto L35
        L4c:
            r6.A04()     // Catch: java.lang.Throwable -> L61
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            X.0rH r0 = new X.0rH
            r0.<init>(r11, r4)
            r5.A01(r0)
            A02(r9, r11, r4, r12)
            return
        L5c:
            r0 = move-exception
            r6.A04()     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16650ql.A00(android.content.Context, X.0OP, java.lang.String, long):void");
    }

    public static void A01(Context context, String workSpecId, int alarmId) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        PendingIntent service = PendingIntent.getService(context, alarmId, intent, 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC16430qO.A00().A02(A00, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", workSpecId, Integer.valueOf(alarmId)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void A02(Context context, String workSpecId, int alarmId, long triggerAtMillis) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        PendingIntent service = PendingIntent.getService(context, alarmId, intent, 134217728);
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, triggerAtMillis, service);
            } else {
                alarmManager.set(0, triggerAtMillis, service);
            }
        }
    }
}
