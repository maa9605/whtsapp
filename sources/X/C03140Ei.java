package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import com.whatsapp.util.Log;

/* renamed from: X.0Ei  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03140Ei extends BroadcastReceiver {
    public static C03140Ei A04 = new C03140Ei();
    public static boolean A05;
    public C03150Ej A00;
    public C02E A01;
    public volatile boolean A03 = false;
    public final Object A02 = new Object();

    public static boolean A00(C02E c02e) {
        PowerManager A0D = c02e.A0D();
        KeyguardManager A042 = c02e.A04();
        if (A0D == null || !A0D.isScreenOn()) {
            return false;
        }
        return (!"xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && A042.isKeyguardLocked() && A042.inKeyguardRestrictedInputMode()) ? false : true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A1w(this);
                    this.A03 = true;
                }
            }
        }
        boolean z = A05;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode != -1454123155) {
                    if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                        str = "unlock";
                    }
                } else if (action.equals("android.intent.action.SCREEN_ON")) {
                    str = "on";
                }
            } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                str = "off";
            }
            boolean A00 = true ^ A00(this.A01);
            A05 = A00;
            StringBuilder A0W = C000200d.A0W("ScreenLockReceiver; tag=", str, "; locked=");
            A0W.append(A00);
            A0W.append("; oldLocked=");
            A0W.append(z);
            Log.i(A0W.toString());
            this.A00.A02(A05);
        }
        str = "unknown";
        boolean A002 = true ^ A00(this.A01);
        A05 = A002;
        StringBuilder A0W2 = C000200d.A0W("ScreenLockReceiver; tag=", str, "; locked=");
        A0W2.append(A002);
        A0W2.append("; oldLocked=");
        A0W2.append(z);
        Log.i(A0W2.toString());
        this.A00.A02(A05);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("ScreenLockReceiver{locked=");
        A0P.append(A05);
        A0P.append('}');
        return A0P.toString();
    }
}
