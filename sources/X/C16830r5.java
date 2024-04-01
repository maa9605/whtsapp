package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: X.0r5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16830r5 {
    public static C16830r5 A04;
    public C38881pA A00;
    public C38891pB A01;
    public C29161Vq A02;
    public C38901pC A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1pA] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1pB] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1pC] */
    public C16830r5(Context context, final InterfaceC17300rs taskExecutor) {
        final Context applicationContext = context.getApplicationContext();
        this.A00 = new AbstractC29151Vp(applicationContext, taskExecutor) { // from class: X.1pA
            public static final String A00 = AbstractC16430qO.A01("BatteryChrgTracker");

            @Override // X.AbstractC16800r2
            public Object A00() {
                int intExtra;
                Intent registerReceiver = this.A01.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z = false;
                if (registerReceiver == null) {
                    AbstractC16430qO.A00().A03(A00, "getInitialState - null intent received", new Throwable[0]);
                    return null;
                }
                if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.AbstractC29151Vp
            public IntentFilter A05() {
                IntentFilter intentFilter = new IntentFilter();
                if (Build.VERSION.SDK_INT >= 23) {
                    intentFilter.addAction("android.os.action.CHARGING");
                    intentFilter.addAction("android.os.action.DISCHARGING");
                    return intentFilter;
                }
                intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                return intentFilter;
            }

            @Override // X.AbstractC29151Vp
            public void A06(Context context2, Intent intent) {
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                AbstractC16430qO.A00().A02(A00, String.format("Received %s", action), new Throwable[0]);
                switch (action.hashCode()) {
                    case -1886648615:
                        if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            return;
                        }
                        A04(Boolean.FALSE);
                        return;
                    case -54942926:
                        if (!action.equals("android.os.action.DISCHARGING")) {
                            return;
                        }
                        A04(Boolean.FALSE);
                        return;
                    case 948344062:
                        if (!action.equals("android.os.action.CHARGING")) {
                            return;
                        }
                        A04(Boolean.TRUE);
                        return;
                    case 1019184907:
                        if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            return;
                        }
                        A04(Boolean.TRUE);
                        return;
                    default:
                        return;
                }
            }
        };
        this.A01 = new AbstractC29151Vp(applicationContext, taskExecutor) { // from class: X.1pB
            public static final String A00 = AbstractC16430qO.A01("BatteryNotLowTracker");

            @Override // X.AbstractC16800r2
            public Object A00() {
                Intent registerReceiver = this.A01.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                boolean z = false;
                if (registerReceiver == null) {
                    AbstractC16430qO.A00().A03(A00, "getInitialState - null intent received", new Throwable[0]);
                    return null;
                }
                return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
            }

            @Override // X.AbstractC29151Vp
            public IntentFilter A05() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter;
            }

            @Override // X.AbstractC29151Vp
            public void A06(Context context2, Intent intent) {
                if (intent.getAction() == null) {
                    return;
                }
                AbstractC16430qO.A00().A02(A00, String.format("Received %s", intent.getAction()), new Throwable[0]);
                String action = intent.getAction();
                int hashCode = action.hashCode();
                if (hashCode == -1980154005) {
                    if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                        return;
                    }
                    A04(Boolean.TRUE);
                } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    A04(Boolean.FALSE);
                }
            }
        };
        this.A02 = new C29161Vq(applicationContext, taskExecutor);
        this.A03 = new AbstractC29151Vp(applicationContext, taskExecutor) { // from class: X.1pC
            public static final String A00 = AbstractC16430qO.A01("StorageNotLowTracker");

            @Override // X.AbstractC16800r2
            public Object A00() {
                Context context2 = this.A01;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                Intent registerReceiver = context2.registerReceiver(null, intentFilter);
                if (registerReceiver != null && registerReceiver.getAction() != null) {
                    String action = registerReceiver.getAction();
                    int hashCode = action.hashCode();
                    if (hashCode == -1181163412) {
                        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            return Boolean.FALSE;
                        }
                        return null;
                    } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        return Boolean.TRUE;
                    } else {
                        return null;
                    }
                }
                return Boolean.TRUE;
            }

            @Override // X.AbstractC29151Vp
            public IntentFilter A05() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter;
            }

            @Override // X.AbstractC29151Vp
            public void A06(Context context2, Intent intent) {
                if (intent.getAction() == null) {
                    return;
                }
                AbstractC16430qO.A00().A02(A00, String.format("Received %s", intent.getAction()), new Throwable[0]);
                String action = intent.getAction();
                int hashCode = action.hashCode();
                if (hashCode == -1181163412) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                        A04(Boolean.FALSE);
                    }
                } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    A04(Boolean.TRUE);
                }
            }
        };
    }

    public static synchronized C16830r5 A00(Context context, InterfaceC17300rs taskExecutor) {
        C16830r5 c16830r5;
        synchronized (C16830r5.class) {
            c16830r5 = A04;
            if (c16830r5 == null) {
                c16830r5 = new C16830r5(context, taskExecutor);
                A04 = c16830r5;
            }
        }
        return c16830r5;
    }
}
