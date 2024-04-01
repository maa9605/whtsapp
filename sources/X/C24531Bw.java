package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Bw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24531Bw extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public C24531Bw(Context context) {
        this.A00 = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (C08U.A09) {
            for (C08U c08u : C08U.A0E.values()) {
                c08u.A04();
            }
        }
        this.A00.unregisterReceiver(this);
    }
}
