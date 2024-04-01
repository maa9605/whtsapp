package com.whatsapp.location;

import X.AnonymousClass029;
import X.C0C5;
import X.C41461tx;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class FinalLiveLocationBroadcastReceiver extends BroadcastReceiver {
    public C41461tx A00;
    public final Object A01;
    public volatile boolean A02;

    public FinalLiveLocationBroadcastReceiver() {
        this(0);
    }

    public FinalLiveLocationBroadcastReceiver(int i) {
        this.A02 = false;
        this.A01 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A24(this);
                    this.A02 = true;
                }
            }
        }
        Log.i("FinalLiveLocationBroadcastReceiver/onReceive");
        this.A00.A0G();
    }
}
