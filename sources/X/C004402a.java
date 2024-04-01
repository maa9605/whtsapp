package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;

/* renamed from: X.02a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C004402a {
    public final Handler A00;
    public final SparseArray A01;
    public final InterfaceC002901k A02;

    public C004402a(InterfaceC002901k interfaceC002901k) {
        this.A02 = interfaceC002901k;
        HandlerThread handlerThread = new HandlerThread("light-prefs-save-scheduler", -2);
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
        this.A01 = new SparseArray();
    }

    public void A00(int i, final Runnable runnable, boolean z) {
        final ExecutorC004702d executorC004702d;
        synchronized (this) {
            SparseArray sparseArray = this.A01;
            executorC004702d = (ExecutorC004702d) sparseArray.get(i);
            if (executorC004702d == null) {
                executorC004702d = new ExecutorC004702d(this.A02, true);
                sparseArray.put(i, executorC004702d);
            }
        }
        if (z) {
            this.A00.postDelayed(new Runnable() { // from class: X.1Px
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC004702d.this.execute(runnable);
                }
            }, 100L);
        } else {
            executorC004702d.execute(runnable);
        }
    }
}
