package X;

import android.app.job.JobService;
import com.whatsapp.schedulers.job.SchedulerExperimentJobService;

/* renamed from: X.3mu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class Abstractjob.JobServiceC80203mu extends JobService implements AnonymousClass005 {
    public volatile C2GL A02;
    public final Object A01 = new Object();
    public boolean A00 = false;

    @Override // X.AnonymousClass005
    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C2GL(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            ((C0RY) generatedComponent()).A0J((SchedulerExperimentJobService) this);
        }
        super.onCreate();
    }
}
