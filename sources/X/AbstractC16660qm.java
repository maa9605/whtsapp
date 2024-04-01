package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0qm */
/* loaded from: classes.dex */
public abstract class AbstractC16660qm extends BroadcastReceiver {
    public static final String A00 = AbstractC16430qO.A01("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC16430qO.A00().A02(A00, String.format("onReceive : %s", intent), new Throwable[0]);
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
