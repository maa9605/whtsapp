package X;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0u1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC18610u1 implements Runnable, Delayed {
    public long A00;
    public long A01;
    public String A02;

    public void A00() {
    }

    @Override // java.lang.Runnable
    public abstract void run();

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (delayed2 instanceof AbstractRunnableC18610u1) {
            AbstractRunnableC18610u1 abstractRunnableC18610u1 = (AbstractRunnableC18610u1) delayed2;
            long j = this.A01;
            long j2 = abstractRunnableC18610u1.A01;
            if (j == j2) {
                long j3 = this.A00 - abstractRunnableC18610u1.A00;
                if (j3 <= 0) {
                    return j3 == 0 ? 0 : 1;
                }
                return -1;
            }
            long j4 = j - j2;
            if (j4 >= 0) {
                return j4 == 0 ? 0 : 1;
            }
            return -1;
        }
        throw new IllegalArgumentException("Comparing a Dispatchable to a non-Dispatchable.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractRunnableC18610u1) {
            AbstractRunnableC18610u1 abstractRunnableC18610u1 = (AbstractRunnableC18610u1) obj;
            if (this.A00 == abstractRunnableC18610u1.A00) {
                String str = this.A02;
                if (str == null) {
                    if (abstractRunnableC18610u1.A02 != null) {
                        return false;
                    }
                } else if (!str.equals(abstractRunnableC18610u1.A02)) {
                    return false;
                }
                return this.A01 == abstractRunnableC18610u1.A01;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.A01 - SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }
}
