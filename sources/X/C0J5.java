package X;

/* renamed from: X.0J5 */
/* loaded from: classes.dex */
public class C0J5 {
    public long A00;
    public long A01;
    public long A02;
    public final long A03;
    public final long A04;

    public C0J5(long j, long j2) {
        C000700j.A07(j > 0);
        C000700j.A07(j2 > 0);
        this.A04 = j2;
        this.A03 = j;
        A02();
    }

    public synchronized long A00() {
        return this.A02;
    }

    public synchronized long A01() {
        this.A02++;
        long j = this.A00;
        long j2 = this.A04;
        if (j > j2) {
            return j2;
        }
        long j3 = this.A01 + j;
        this.A01 = j3;
        long j4 = j3 - j;
        this.A00 = j4;
        return j3 - j4;
    }

    public synchronized void A02() {
        this.A02 = 0L;
        this.A00 = 0L;
        this.A01 = this.A03;
    }

    public synchronized void A03(long j) {
        C000700j.A07(j >= 0);
        if (j < this.A02) {
            A02();
        }
        while (this.A02 < j) {
            A01();
        }
    }
}
