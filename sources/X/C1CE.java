package X;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1CE */
/* loaded from: classes.dex */
public abstract class C1CE extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final Object A03;
    public final ExecutorService A04;

    public abstract Intent A00(Intent intent);

    public abstract void A02(Intent intent);

    public boolean A03(Intent intent) {
        return false;
    }

    public C1CE() {
        String simpleName = getClass().getSimpleName();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC232715y(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A04 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A03 = new Object();
        this.A01 = 0;
    }

    public final void A01(Intent intent) {
        int intExtra;
        if (intent != null && (intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0)) != 0) {
            SparseArray sparseArray = FirebaseInstanceIdReceiver.A03;
            synchronized (sparseArray) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No active wake lock id #");
                    sb.append(intExtra);
                    Log.w("WakefulBroadcastReceiv.", sb.toString());
                }
            }
        }
        synchronized (this.A03) {
            int i = this.A01 - 1;
            this.A01 = i;
            if (i == 0) {
                stopSelfResult(this.A00);
            }
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        binder = this.A02;
        if (binder == null) {
            binder = new C1CI(this);
            this.A02 = binder;
        }
        return binder;
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.A03) {
            this.A00 = i2;
            this.A01++;
        }
        final Intent A00 = A00(intent);
        if (A00 == null) {
            A01(intent);
            return 2;
        } else if (A03(A00)) {
            A01(intent);
            return 2;
        } else {
            this.A04.execute(new Runnable() { // from class: X.1CD
                {
                    C1CE.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1CE c1ce = C1CE.this;
                    c1ce.A02(A00);
                    c1ce.A01(intent);
                }
            });
            return 3;
        }
    }
}
