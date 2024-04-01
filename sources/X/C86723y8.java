package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.3y8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86723y8 extends AbstractC84583tz {
    public final BroadcastReceiver A00 = new BroadcastReceiver() { // from class: X.3d6
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C86723y8.this.A02();
        }
    };
    public final Context A01;
    public final C02E A02;

    public C86723y8(Context context, C02E c02e) {
        this.A01 = context;
        this.A02 = c02e;
    }
}
