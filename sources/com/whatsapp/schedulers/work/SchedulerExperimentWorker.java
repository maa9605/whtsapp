package com.whatsapp.schedulers.work;

import X.AbstractC09650eU;
import X.C02180Ae;
import X.C0C5;
import X.C1VE;
import X.C1VF;
import X.C41861ud;
import X.C41881uf;
import X.C41891ug;
import android.content.Context;
import android.os.SystemClock;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes2.dex */
public class SchedulerExperimentWorker extends Worker {
    public final C41861ud A00;
    public final C41881uf A01;
    public final C41891ug A02;

    public SchedulerExperimentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A00 = c0c5.A1W();
        this.A01 = c0c5.A1X();
        this.A02 = c0c5.A1Y();
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        C41881uf c41881uf = this.A01;
        c41881uf.A01("/ntp/job/work/started");
        try {
            C41861ud c41861ud = this.A00;
            if (c41861ud.A01() != 7) {
                this.A02.A00.A02("com.whatsapp.schedulers.work.PERIODIC");
                return new C1VE();
            }
            SystemClock.sleep(c41861ud.A03());
            c41881uf.A01("/ntp/job/work/completed");
            return new C1VF();
        } finally {
            c41881uf.A01("/ntp/job/work/completed");
        }
    }
}
