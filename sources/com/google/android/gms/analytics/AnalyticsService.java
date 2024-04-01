package com.google.android.gms.analytics;

import X.AnonymousClass176;
import X.C17V;
import X.C17Y;
import X.C39851qp;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class AnalyticsService extends Service implements C17Y {
    public C17V A00;

    @Override // X.C17Y
    public final boolean A5s(int i) {
        return stopSelfResult(i);
    }

    @Override // X.C17Y
    public final void AWm(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (this.A00 == null) {
            this.A00 = new C17V(this);
            return null;
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C17V c17v = this.A00;
        if (c17v == null) {
            c17v = new C17V(this);
            this.A00 = c17v;
        }
        C39851qp c39851qp = AnonymousClass176.A00(c17v.A00).A07;
        AnonymousClass176.A01(c39851qp);
        c39851qp.A03("Local AnalyticsService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C17V c17v = this.A00;
        if (c17v == null) {
            c17v = new C17V(this);
            this.A00 = c17v;
        }
        C39851qp c39851qp = AnonymousClass176.A00(c17v.A00).A07;
        AnonymousClass176.A01(c39851qp);
        c39851qp.A03("Local AnalyticsService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C17V c17v = this.A00;
        if (c17v == null) {
            c17v = new C17V(this);
            this.A00 = c17v;
        }
        c17v.A01(intent, i2);
        return 2;
    }
}
