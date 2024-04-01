package com.whatsapp.push;

import X.AbstractC03220Ev;
import X.AnonymousClass029;
import X.C0C5;
import X.C42121v8;
import X.C42131v9;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public class WAFbnsPreloadReceiver extends AbstractC03220Ev {
    public C42131v9 A00;
    public C42121v8 A01;
    public final Object A02;
    public volatile boolean A03;

    public WAFbnsPreloadReceiver() {
        this(0);
    }

    public WAFbnsPreloadReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    @Override // X.AbstractC03220Ev, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A2A(this);
                    this.A03 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }
}
