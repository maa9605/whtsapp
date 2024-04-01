package X;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1C1  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1C1 {
    public static C1C1 A04;
    public final Context A02;
    public final ScheduledExecutorService A03;
    public C1C2 A01 = new C1C2(this);
    public int A00 = 1;

    public C1C1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }

    public static synchronized C1C1 A00(Context context) {
        C1C1 c1c1;
        synchronized (C1C1.class) {
            c1c1 = A04;
            if (c1c1 == null) {
                c1c1 = new C1C1(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC232715y("MessengerIpcClient"))));
                A04 = c1c1;
            }
        }
        return c1c1;
    }

    public final synchronized C0AC A01(C1C9 c1c9) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(c1c9);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.A01.A02(c1c9)) {
            C1C2 c1c2 = new C1C2(this);
            this.A01 = c1c2;
            c1c2.A02(c1c9);
        }
        return c1c9.A03.A00;
    }
}
