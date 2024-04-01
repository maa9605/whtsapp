package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1uw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42051uw extends BroadcastReceiver {
    public C02E A00;
    public final C0G2 A01;
    public final C0G4 A02;
    public volatile boolean A04 = false;
    public final Object A03 = new Object();

    public C42051uw(C0G2 c0g2, C0G4 c0g4) {
        this.A01 = c0g2;
        this.A02 = c0g4;
    }

    public final void A00(Context context, C02E c02e) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        if (Build.VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        }
        context.registerReceiver(this, intentFilter);
        if (Build.VERSION.SDK_INT >= 21) {
            A01(c02e);
        } else {
            this.A02.A02(false);
        }
    }

    public final void A01(C02E c02e) {
        boolean isPowerSaveMode;
        PowerManager A0D = c02e.A0D();
        if (A0D == null) {
            Log.w("battery-receiver/on-action-power-save-mode-changed pm=null");
            isPowerSaveMode = true;
        } else {
            isPowerSaveMode = A0D.isPowerSaveMode();
        }
        this.A02.A02(isPowerSaveMode);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A21(this);
                    this.A04 = true;
                }
            }
        }
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1538406691) {
            if (hashCode == 1779291251 && action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                A01(this.A00);
                return;
            }
        } else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
            C0G3 c0g3 = new C0G3(intent);
            C0G2 c0g2 = this.A01;
            if (c0g2.A00.equals(c0g3)) {
                return;
            }
            C000700j.A01();
            c0g2.A00 = c0g3;
            Iterator it = ((AnonymousClass009) c0g2).A00.iterator();
            while (true) {
                C0G5 c0g5 = (C0G5) it;
                if (c0g5.hasNext()) {
                    ((C0EH) c0g5.next()).AHw(c0g3);
                } else {
                    StringBuilder sb = new StringBuilder("battery changed; newEvent=");
                    sb.append(c0g3);
                    Log.i(sb.toString());
                    return;
                }
            }
        }
        StringBuilder A0P = C000200d.A0P("Unexpected action: ");
        A0P.append(intent.getAction());
        throw new IllegalArgumentException(A0P.toString());
    }
}
