package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.1nL */
/* loaded from: classes.dex */
public class C37971nL {
    public static final AtomicInteger A0H = new AtomicInteger(0);
    public final int A00;
    public final long A02;
    public final long A03;
    public final C03X A04;
    public final C1QD A05;
    public final C007603h A06;
    public final Integer A07;
    public final boolean A0G;
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();
    public final ConcurrentHashMap A0A = new ConcurrentHashMap();
    public final ConcurrentHashMap A09 = new ConcurrentHashMap();
    public final AtomicInteger A0B = new AtomicInteger(0);
    public final AtomicInteger A0D = new AtomicInteger(0);
    public final AtomicInteger A0C = new AtomicInteger(-1);
    public final AtomicLong A0E = new AtomicLong(-1);
    public final int A01 = A0H.incrementAndGet();
    public final boolean A0F = true;

    public C37971nL(C03X c03x, C007603h c007603h, boolean z, long j, int i, Integer num, long j2, C1QD c1qd) {
        this.A04 = c03x;
        this.A06 = c007603h;
        this.A00 = i;
        this.A05 = c1qd;
        this.A07 = num;
        this.A03 = j2;
        this.A02 = j;
        this.A0G = z;
    }

    public void A00(String str, Object obj, int i) {
        if (str.length() > 50) {
            this.A04.A01(13, "markerId:%d, annotationKey:%s", Integer.valueOf(this.A00), str);
            return;
        }
        AtomicInteger atomicInteger = this.A0B;
        if (atomicInteger.get() + i >= 1000) {
            this.A04.A01(1, "markerId:%d, annotationKey:%s", Integer.valueOf(this.A00), str);
            return;
        }
        atomicInteger.addAndGet(i);
        if (this.A08.putIfAbsent(str, obj) != null) {
            atomicInteger.addAndGet(-i);
        }
    }

    public void A01(short s, long j) {
        if (this.A0E.compareAndSet(-1L, j)) {
            this.A0C.set(s);
            this.A06.A01(2, this);
        }
    }
}
