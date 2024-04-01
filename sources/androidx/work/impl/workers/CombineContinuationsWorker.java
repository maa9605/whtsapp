package androidx.work.impl.workers;

import X.AbstractC09650eU;
import X.C1VF;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override // androidx.work.Worker
    public AbstractC09650eU A03() {
        return new C1VF(this.A01.A01);
    }
}
