package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0mE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14020mE {
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public C14020mE(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.A02);
        sb.append(" filter=");
        sb.append(this.A03);
        if (this.A01) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
