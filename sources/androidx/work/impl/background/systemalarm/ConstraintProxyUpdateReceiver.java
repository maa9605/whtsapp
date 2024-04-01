package androidx.work.impl.background.systemalarm;

import X.AbstractC16430qO;
import X.C0OP;
import X.C1WH;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String A00 = AbstractC16430qO.A01("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AbstractC16430qO.A00().A02(A00, String.format("Ignoring unknown action %s", str), new Throwable[0]);
            return;
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        ((C1WH) C0OP.A00(context).A06).A01.execute(new Runnable() { // from class: X.0qn
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Intent intent2 = intent;
                    boolean booleanExtra = intent2.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent2.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent2.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent2.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    AbstractC16430qO.A00().A02(ConstraintProxyUpdateReceiver.A00, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                    Context context2 = context;
                    C17080rW.A00(context2, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    C17080rW.A00(context2, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    C17080rW.A00(context2, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    C17080rW.A00(context2, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                } finally {
                    goAsync.finish();
                }
            }
        });
    }
}
