package androidx.work;

import X.AbstractC09650eU;
import X.C09610eQ;
import X.InterfaceFutureC09630eS;
import android.content.Context;
import androidx.work.Worker;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public C09610eQ A00;

    public abstract AbstractC09650eU A03();

    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC09630eS A00() {
        this.A00 = new C09610eQ();
        this.A01.A04.execute(new Runnable() { // from class: X.0qU
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Worker worker = Worker.this;
                    worker.A00.A08(worker.A03());
                } catch (Throwable th) {
                    Worker.this.A00.A09(th);
                }
            }
        });
        return this.A00;
    }
}
