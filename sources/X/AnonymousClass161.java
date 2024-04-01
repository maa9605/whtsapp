package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: X.161  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass161 {
    public static float A00 = Float.NaN;
    public static long A01;
    public static final IntentFilter A02 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static int A00(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, A02);
        int i = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return ((AnonymousClass088.A1q() ? powerManager.isInteractive() : powerManager.isScreenOn()) << 1) | i;
    }
}
