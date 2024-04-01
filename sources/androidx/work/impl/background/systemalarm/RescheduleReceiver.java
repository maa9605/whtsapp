package androidx.work.impl.background.systemalarm;

import X.AbstractC16430qO;
import X.C0OP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = AbstractC16430qO.A01("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC16430qO A002 = AbstractC16430qO.A00();
        String str = A00;
        A002.A02(str, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C0OP A003 = C0OP.A00(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                if (A003 != null) {
                    synchronized (C0OP.A0C) {
                        A003.A00 = goAsync;
                        if (A003.A08) {
                            goAsync.finish();
                            A003.A00 = null;
                        }
                    }
                    return;
                }
                throw null;
            } catch (IllegalStateException e) {
                AbstractC16430qO.A00().A03(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                return;
            }
        }
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_RESCHEDULE");
        context.startService(intent2);
    }
}
