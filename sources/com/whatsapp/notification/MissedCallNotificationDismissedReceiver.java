package com.whatsapp.notification;

import X.AnonymousClass029;
import X.C03080Ec;
import X.C05E;
import X.C0C5;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver {
    public C05E A00;
    public C03080Ec A01;
    public final Object A02;
    public volatile boolean A03;

    public MissedCallNotificationDismissedReceiver() {
        this(0);
    }

    public MissedCallNotificationDismissedReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A26(this);
                    this.A03 = true;
                }
            }
        }
        Log.i("missedcallnotification/dismiss");
        C05E c05e = this.A00;
        c05e.A05();
        if (c05e.A01) {
            this.A01.A02();
        }
    }
}
