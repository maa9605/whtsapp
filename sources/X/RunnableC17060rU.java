package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0rU */
/* loaded from: classes.dex */
public class RunnableC17060rU implements Runnable {
    public int A00 = 0;
    public final Context A01;
    public final C0OP A02;
    public static final String A04 = AbstractC16430qO.A01("ForceStopRunnable");
    public static final long A03 = TimeUnit.DAYS.toMillis(3650);

    public RunnableC17060rU(Context context, C0OP workManager) {
        this.A01 = context.getApplicationContext();
        this.A02 = workManager;
    }

    public static void A00(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + A03;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, broadcast);
            } else {
                alarmManager.set(0, currentTimeMillis, broadcast);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x00d2, code lost:
        if (r15 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00f0, code lost:
        if (r1 != 0) goto L66;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC17060rU.run():void");
    }
}
