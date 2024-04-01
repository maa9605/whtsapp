package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: X.0qV */
/* loaded from: classes.dex */
public abstract class AbstractC16500qV {
    public static final String A00 = AbstractC16430qO.A01("WorkerFactory");

    public final ListenableWorker A00(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        ListenableWorker listenableWorker = null;
        try {
            Class<? extends U> asSubclass = Class.forName(workerClassName).asSubclass(ListenableWorker.class);
            if (asSubclass != 0) {
                try {
                    ListenableWorker listenableWorker2 = (ListenableWorker) asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                    listenableWorker = listenableWorker2;
                    if (listenableWorker2 != null && listenableWorker2.A02) {
                        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), workerClassName));
                    }
                } catch (Throwable th) {
                    AbstractC16430qO.A00().A03(A00, C000200d.A0H("Could not instantiate ", workerClassName), th);
                    return listenableWorker;
                }
            }
        } catch (Throwable th2) {
            AbstractC16430qO.A00().A03(A00, C000200d.A0H("Invalid class: ", workerClassName), th2);
        }
        return listenableWorker;
    }
}
