package com.whatsapp.schedulers.job;

import X.Abstractjob.JobServiceC80203mu;
import X.C41881uf;
import X.C71173Vc;
import X.InterfaceC002901k;
import X.RunnableC71163Vb;
import android.app.job.JobParameters;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class SchedulerExperimentJobService extends Abstractjob.JobServiceC80203mu {
    public C41881uf A00;
    public C71173Vc A01;
    public InterfaceC002901k A02;
    public final HashMap A03 = new HashMap();

    public /* synthetic */ void A00(JobParameters jobParameters) {
        jobParameters.getJobId();
        if (11 == jobParameters.getJobId()) {
            this.A00.A01("/ntp/job/api/started");
            try {
                C71173Vc c71173Vc = this.A01;
                if (c71173Vc.A01.A01() != 4) {
                    c71173Vc.A05(11);
                } else {
                    long A03 = c71173Vc.A01.A03();
                    jobParameters.getJobId();
                    SystemClock.sleep(A03);
                }
            } finally {
                this.A00.A01("/ntp/job/api/completed");
            }
        } else if (12 != jobParameters.getJobId() && 13 != jobParameters.getJobId()) {
            if (14 == jobParameters.getJobId()) {
                this.A00.A01("/ntp/job/manual_post/started");
                try {
                    C71173Vc c71173Vc2 = this.A01;
                    if (c71173Vc2.A01.A01() != 6) {
                        c71173Vc2.A05(11);
                    } else {
                        long A032 = c71173Vc2.A01.A03();
                        jobParameters.getJobId();
                        SystemClock.sleep(A032);
                        c71173Vc2.A02();
                    }
                } finally {
                    this.A00.A01("/ntp/job/manual_post/completed");
                }
            } else {
                jobParameters.getJobId();
            }
        } else {
            this.A00.A01("/ntp/job/manual_pre/started");
            try {
                C71173Vc c71173Vc3 = this.A01;
                if (c71173Vc3.A01.A01() != 5) {
                    c71173Vc3.A05(11);
                } else {
                    c71173Vc3.A03();
                    long A033 = c71173Vc3.A01.A03();
                    jobParameters.getJobId();
                    SystemClock.sleep(A033);
                }
            } finally {
                this.A00.A01("/ntp/job/manual_pre/completed");
            }
        }
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            if (((JobParameters) hashMap.remove(Integer.valueOf(jobParameters.getJobId()))) != null) {
                jobParameters.getJobId();
                jobFinished(jobParameters, false);
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        jobParameters.getJobId();
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            hashMap.put(Integer.valueOf(jobParameters.getJobId()), jobParameters);
        }
        this.A02.AS1(new RunnableC71163Vb(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        jobParameters.getJobId();
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            hashMap.remove(Integer.valueOf(jobParameters.getJobId()));
        }
        return false;
    }
}
