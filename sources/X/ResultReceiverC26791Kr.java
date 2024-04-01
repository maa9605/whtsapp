package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.1Kr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ResultReceiverC26791Kr extends ResultReceiver {
    public final WeakReference A00;
    public final WeakReference A01;

    public ResultReceiverC26791Kr(Handler handler, Runnable runnable, Set set) {
        super(handler);
        set.add(runnable);
        this.A00 = new WeakReference(runnable);
        this.A01 = new WeakReference(set);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        Runnable runnable = (Runnable) this.A00.get();
        if (runnable != null) {
            runnable.run();
            Set set = (Set) this.A01.get();
            if (set != null) {
                set.remove(runnable);
            }
        }
    }
}
