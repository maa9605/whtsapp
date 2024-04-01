package com.whatsapp.service;

import X.Abstractjob.JobServiceC81063oI;
import X.C00A;
import X.C00B;
import X.C00T;
import X.C05E;
import X.C40291rx;
import X.C53942hl;
import X.InterfaceC002901k;
import X.RunnableC71363Vv;
import X.RunnableC71373Vw;
import X.RunnableC71383Vx;
import android.app.job.JobParameters;
import android.os.Handler;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class UnsentMessagesNetworkAvailableJob extends Abstractjob.JobServiceC81063oI {
    public JobParameters A00;
    public C00A A01;
    public C05E A02;
    public C00B A03;
    public C40291rx A04;
    public InterfaceC002901k A05;
    public final Handler A06 = new Handler();
    public final C00T A07 = new C53942hl(this);
    public final Runnable A08 = new RunnableC71363Vv(this);

    public final void A00() {
        C05E c05e = this.A02;
        c05e.A05();
        if (c05e.A01 && this.A03.A04()) {
            Handler handler = this.A06;
            handler.post(new RunnableC71373Vw(this));
            Log.i("Unsent messages found, scheduling timeout task");
            handler.postDelayed(this.A08, 30000L);
            this.A04.A0D(false, true, false, false, 0);
            return;
        }
        JobParameters jobParameters = this.A00;
        if (jobParameters == null) {
            return;
        }
        jobFinished(jobParameters, false);
        this.A00 = null;
    }

    public /* synthetic */ void A01() {
        this.A01.A01(this.A07);
    }

    public /* synthetic */ void A02() {
        this.A01.A00(this.A07);
        JobParameters jobParameters = this.A00;
        if (jobParameters != null) {
            jobFinished(jobParameters, false);
            this.A00 = null;
        }
    }

    @Override // X.Abstractjob.JobServiceC81063oI, android.app.Service
    public void onCreate() {
        Log.i("UnsentMessagesNetworkAvailableJob/onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("UnsentMessagesNetworkAvailableJob/onDestroy");
        super.onDestroy();
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getJobId() == 6 && this.A00 == null) {
            this.A00 = jobParameters;
            this.A05.AS1(new RunnableC71383Vx(this));
            return true;
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.A00 != null) {
            this.A01.A00(this.A07);
            this.A06.removeCallbacks(this.A08);
            this.A00 = null;
            return true;
        }
        return true;
    }
}
