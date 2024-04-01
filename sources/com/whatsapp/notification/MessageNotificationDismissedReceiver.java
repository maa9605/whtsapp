package com.whatsapp.notification;

import X.AnonymousClass029;
import X.C000500h;
import X.C0C5;
import X.C40301ry;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    public C000500h A00;
    public C40301ry A01;
    public final Object A02;
    public volatile boolean A03;

    public MessageNotificationDismissedReceiver() {
        this(0);
    }

    public MessageNotificationDismissedReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A25(this);
                    this.A03 = true;
                }
            }
        }
        String stringExtra = intent.getStringExtra("notification_hash");
        this.A00.A0D().putString("notification_hash", stringExtra).apply();
        StringBuilder sb = new StringBuilder("notification/dismiss ");
        sb.append(stringExtra);
        Log.i(sb.toString());
        this.A01.A03();
    }
}
