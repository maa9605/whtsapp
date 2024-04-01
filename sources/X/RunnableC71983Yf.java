package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;

/* renamed from: X.3Yf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC71983Yf extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C0HE A01;

    public /* synthetic */ RunnableC71983Yf(C0HE c0he, long j) {
        this.A01 = c0he;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0HE c0he = this.A01;
        long j = this.A00;
        if (Looper.myLooper() != null) {
            new Handler(Looper.myLooper()).postDelayed(new RunnableEBaseShape7S0100000_I0_7(c0he, 13), j);
            return;
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            Log.e(e);
            Thread.currentThread().interrupt();
        }
        c0he.A01();
    }
}
