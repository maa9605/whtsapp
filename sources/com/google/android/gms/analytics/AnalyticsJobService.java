package com.google.android.gms.analytics;

import X.AnonymousClass176;
import X.C17V;
import X.C17Y;
import X.C39851qp;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

/* loaded from: classes.dex */
public final class AnalyticsJobService extends JobService implements C17Y {
    public C17V A00;

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // X.C17Y
    public final boolean A5s(int i) {
        return stopSelfResult(i);
    }

    @Override // X.C17Y
    public final void AWm(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final C17V c17v = this.A00;
        if (c17v == null) {
            c17v = new C17V(this);
            this.A00 = c17v;
        }
        final C39851qp c39851qp = AnonymousClass176.A00(c17v.A00).A07;
        AnonymousClass176.A01(c39851qp);
        String string = jobParameters.getExtras().getString("action");
        c39851qp.A06("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            c17v.A02(new Runnable(c17v, c39851qp, jobParameters) { // from class: X.17X
                public final JobParameters A00;
                public final C39851qp A01;
                public final C17V A02;

                {
                    this.A02 = c17v;
                    this.A01 = c39851qp;
                    this.A00 = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17V c17v2 = this.A02;
                    C39851qp c39851qp2 = this.A01;
                    JobParameters jobParameters2 = this.A00;
                    if (c17v2 != null) {
                        c39851qp2.A03("AnalyticsJobService processed last dispatch request");
                        ((C17Y) c17v2.A00).AWm(jobParameters2, false);
                        return;
                    }
                    throw null;
                }
            });
            return true;
        }
        return true;
    }
}
