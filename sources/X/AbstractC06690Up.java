package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.0Up  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06690Up {
    public BroadcastReceiver A00;
    public final /* synthetic */ C0CN A01;

    public abstract int A00();

    public abstract IntentFilter A01();

    public abstract void A04();

    public AbstractC06690Up(C0CN c0cn) {
        this.A01 = c0cn;
    }

    public void A02() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0j.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public void A03() {
        A02();
        IntentFilter A01 = A01();
        if (A01 == null || A01.countActions() == 0) {
            return;
        }
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver == null) {
            broadcastReceiver = new BroadcastReceiver() { // from class: X.0gK
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    AbstractC06690Up.this.A04();
                }
            };
            this.A00 = broadcastReceiver;
        }
        this.A01.A0j.registerReceiver(broadcastReceiver, A01);
    }
}
