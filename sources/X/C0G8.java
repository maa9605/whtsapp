package X;

import java.util.Random;

/* renamed from: X.0G8  reason: invalid class name */
/* loaded from: classes.dex */
public class C0G8 {
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final Random A04;

    public C0G8(Random random) {
        this.A00 = 0;
        this.A01 = false;
        this.A04 = random;
        this.A02 = 20;
        this.A03 = 3600000L;
    }

    public C0G8(Random random, int i, long j) {
        this.A00 = 0;
        this.A01 = false;
        this.A04 = random;
        this.A02 = i;
        this.A03 = j;
    }

    public synchronized int A00() {
        return this.A00;
    }

    public synchronized Long A01() {
        int i = this.A00;
        if (i >= this.A02) {
            return null;
        }
        int i2 = i + 1;
        this.A00 = i2;
        if (!this.A01) {
            long min = (1 << Math.min(i2, 50)) * 1000;
            long abs = (min / 2) + Math.abs(this.A04.nextLong() % min);
            long j = this.A03;
            if (abs >= j) {
                this.A01 = true;
                return Long.valueOf(j);
            }
            return Long.valueOf(abs);
        }
        return Long.valueOf(this.A03);
    }

    public synchronized void A02() {
        this.A00 = 0;
    }
}
