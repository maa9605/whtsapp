package com.whatsapp;

import X.AbstractServiceC05030Na;
import X.AnonymousClass029;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class AlarmBroadcastReceiver extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;

    public AlarmBroadcastReceiver() {
        this(0);
    }

    public AlarmBroadcastReceiver(int i) {
        this.A01 = false;
        this.A00 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass029.A0Y(context);
                    this.A01 = true;
                }
            }
        }
        Intent intent2 = new Intent(intent).setClass(context, AlarmService.class);
        StringBuilder sb = new StringBuilder("AlarmBroadcastReceiver dispatching to AlarmService; intent=");
        sb.append(intent);
        sb.append("; elapsedRealtime=");
        sb.append(SystemClock.elapsedRealtime());
        Log.i(sb.toString());
        AbstractServiceC05030Na.A00(context, AlarmService.class, 3, intent2);
    }
}
