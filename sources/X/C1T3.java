package X;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;

/* renamed from: X.1T3  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1T3 extends JobServiceEngine implements InterfaceC12720jx {
    public JobParameters A00;
    public final AbstractServiceC05030Na A01;
    public final Object A02;

    public C1T3(AbstractServiceC05030Na abstractServiceC05030Na) {
        super(abstractServiceC05030Na);
        this.A02 = new Object();
        this.A01 = abstractServiceC05030Na;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStartJob(JobParameters jobParameters) {
        this.A00 = jobParameters;
        this.A01.A03(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public boolean onStopJob(JobParameters jobParameters) {
        AbstractServiceC05030Na abstractServiceC05030Na = this.A01;
        AsyncTaskC12710jw asyncTaskC12710jw = abstractServiceC05030Na.A00;
        if (asyncTaskC12710jw != null) {
            asyncTaskC12710jw.cancel(false);
        }
        boolean A04 = abstractServiceC05030Na.A04();
        synchronized (this.A02) {
            this.A00 = null;
        }
        return A04;
    }
}
