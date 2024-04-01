package com.whatsapp.schedulers.alarm;

import X.AbstractServiceC05030Na;
import X.AnonymousClass029;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public class SchedulerExperimentAlarmReceiver extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;

    public SchedulerExperimentAlarmReceiver() {
        this(0);
    }

    public SchedulerExperimentAlarmReceiver(int i) {
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
        AbstractServiceC05030Na.A00(context, SchedulerExperimentAlarmService.class, 10, intent);
    }
}
