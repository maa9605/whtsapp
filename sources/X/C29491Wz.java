package X;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/* renamed from: X.1Wz */
/* loaded from: classes.dex */
public class C29491Wz {
    public static final AbstractRunnableC18610u1 A02 = new AbstractRunnableC18610u1() { // from class: X.1Wy
        @Override // X.AbstractRunnableC18610u1, java.lang.Runnable
        public void run() {
        }
    };
    public final BlockingQueue A00 = new DelayQueue();
    public final C18600u0[] A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C29491Wz(int i) {
        this.A01 = new C18600u0[i];
        int i2 = 0;
        while (true) {
            C18600u0[] c18600u0Arr = this.A01;
            if (i2 >= c18600u0Arr.length) {
                return;
            }
            c18600u0Arr[i2] = new Thread() { // from class: X.0u0
                {
                    C29491Wz.this = this;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(10);
                    while (true) {
                        try {
                            ((AbstractRunnableC18610u1) C29491Wz.this.A00.take()).run();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            };
            C18600u0 c18600u0 = this.A01[i2];
            StringBuilder sb = new StringBuilder("GCD-Thread #");
            sb.append(i2);
            c18600u0.setName(sb.toString());
            this.A01[i2].start();
            i2++;
        }
    }
}
