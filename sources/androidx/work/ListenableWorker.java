package androidx.work;

import X.InterfaceFutureC09630eS;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context A00;
    public WorkerParameters A01;
    public boolean A02;
    public volatile boolean A03;

    public abstract InterfaceFutureC09630eS A00();

    public void A01() {
    }

    public boolean A02() {
        return false;
    }

    public ListenableWorker(Context appContext, WorkerParameters workerParams) {
        if (appContext == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParams != null) {
            this.A00 = appContext;
            this.A01 = workerParams;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }
}
