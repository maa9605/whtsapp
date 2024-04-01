package X;

import android.app.job.JobParameters;
import com.whatsapp.schedulers.job.SchedulerExperimentJobService;

/* renamed from: X.3Vb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC71163Vb extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ SchedulerExperimentJobService A01;

    public /* synthetic */ RunnableC71163Vb(SchedulerExperimentJobService schedulerExperimentJobService, JobParameters jobParameters) {
        this.A01 = schedulerExperimentJobService;
        this.A00 = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00(this.A00);
    }
}
