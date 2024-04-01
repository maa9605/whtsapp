package X;

import java.util.concurrent.Callable;

/* renamed from: X.02e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C004802e {
    public int A00 = 1;

    public void A00() {
        if (A06()) {
            synchronized (this) {
                while (this.A00 <= 3) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public synchronized void A01() {
        this.A00 = 5;
        notifyAll();
    }

    public synchronized void A02() {
        this.A00 = 4;
        notifyAll();
    }

    public synchronized void A03() {
        this.A00 = 3;
    }

    public void A04(Callable callable) {
        synchronized (this) {
            if (this.A00 == 1) {
                try {
                    callable.call();
                } catch (Exception e) {
                    if (e instanceof RuntimeException) {
                        throw ((RuntimeException) e);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception occurred with while executing operation with message: ");
                    sb.append(e.getMessage());
                    throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    public synchronized boolean A05() {
        return this.A00 == 1;
    }

    public synchronized boolean A06() {
        return !(this.A00 > 3);
    }
}
