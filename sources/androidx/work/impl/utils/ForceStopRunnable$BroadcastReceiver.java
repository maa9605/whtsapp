package androidx.work.impl.utils;

import X.AbstractC16430qO;
import X.C1VG;
import X.RunnableC17060rU;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String A00 = AbstractC16430qO.A01("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        AbstractC16430qO A002 = AbstractC16430qO.A00();
        String str = A00;
        if (((C1VG) A002).A00 <= 2) {
            Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
        }
        RunnableC17060rU.A00(context);
    }
}
