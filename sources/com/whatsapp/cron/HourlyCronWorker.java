package com.whatsapp.cron;

import X.AbstractC09650eU;
import X.C00J;
import X.C02180Ae;
import X.C0C5;
import X.C0EQ;
import X.C1VF;
import X.C41361tn;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class HourlyCronWorker extends Worker {
    public final C41361tn A00;
    public final C00J A01;

    public HourlyCronWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0C5 c0c5 = (C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class);
        this.A00 = c0c5.A0i();
        this.A01 = c0c5.A1t();
    }

    public static void A00(C41361tn c41361tn, Set set) {
        c41361tn.A00("/cron/hourly/started");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0EQ) it.next()).AKy();
        }
        c41361tn.A00("/cron/hourly/completed");
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        A00(this.A00, (Set) this.A01.get());
        return new C1VF();
    }
}
