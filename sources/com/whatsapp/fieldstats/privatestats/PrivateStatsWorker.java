package com.whatsapp.fieldstats.privatestats;

import X.AbstractC09650eU;
import X.C02180Ae;
import X.C0C5;
import X.C1VF;
import X.C41431tu;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class PrivateStatsWorker extends Worker {
    public final C41431tu A00;

    public PrivateStatsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A16();
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        Log.i("PrivateStatsWorker/doWork--->>> in doWork");
        C41431tu c41431tu = this.A00;
        c41431tu.A07.AS1(new RunnableEBaseShape2S0100000_I0_2(c41431tu, 44));
        return new C1VF();
    }
}
