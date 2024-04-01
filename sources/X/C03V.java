package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.03V  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C03V implements InterfaceC004201y {
    public final AnonymousClass012 A00;
    public final C007303e A01;
    public final C03X A02;
    public final C007603h A03;
    public final InterfaceC007503g A04;
    public final ConcurrentNavigableMap A07 = new ConcurrentSkipListMap();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();
    public final AtomicInteger A08 = new AtomicInteger(0);

    public C03V(AnonymousClass012 anonymousClass012, C03X c03x, C007303e c007303e, InterfaceC007503g interfaceC007503g, C007603h c007603h) {
        this.A00 = anonymousClass012;
        this.A02 = c03x;
        this.A01 = c007303e;
        this.A04 = interfaceC007503g;
        this.A03 = c007603h;
    }

    public long A00() {
        if (this.A00.A00 != null) {
            return System.nanoTime();
        }
        throw null;
    }

    public C37971nL A01(int i, Integer num) {
        if (num == null) {
            return (C37971nL) this.A05.get(Integer.valueOf(i));
        }
        return (C37971nL) this.A07.get(Long.valueOf((num.intValue() & 4294967295L) | (i << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
        if (r0.A02 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r0.A02 == false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C37971nL A02(int r32, java.lang.Integer r33, long r34) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03V.A02(int, java.lang.Integer, long):X.1nL");
    }

    public C37971nL A03(int i, Integer num, short s, long j) {
        C37971nL c37971nL;
        if (num == null) {
            c37971nL = (C37971nL) this.A05.remove(Integer.valueOf(i));
        } else {
            c37971nL = (C37971nL) this.A07.remove(Long.valueOf((num.intValue() & 4294967295L) | (i << 32)));
        }
        if (c37971nL != null) {
            c37971nL.A01(s, j);
            this.A08.decrementAndGet();
        }
        return c37971nL;
    }

    public final void A04(ConcurrentMap concurrentMap, short s, int i, long j) {
        if (concurrentMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : concurrentMap.entrySet()) {
            C37971nL c37971nL = (C37971nL) entry.getValue();
            if (c37971nL != null) {
                if (i >= 0) {
                    if (c37971nL.A03 + TimeUnit.MILLISECONDS.toNanos(i) < j) {
                    }
                }
                C37971nL c37971nL2 = (C37971nL) concurrentMap.remove(entry.getKey());
                if (c37971nL2 != null) {
                    c37971nL2.A01(s, j);
                    this.A06.add(c37971nL2);
                    this.A08.decrementAndGet();
                }
            }
        }
        AWJ();
    }

    public final void A05(ConcurrentMap concurrentMap, short s, boolean z, long j) {
        if (concurrentMap.isEmpty()) {
            return;
        }
        Iterator it = new HashSet(concurrentMap.keySet()).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C37971nL c37971nL = (C37971nL) concurrentMap.get(next);
            if (c37971nL != null && (!z || c37971nL.A0F)) {
                C37971nL c37971nL2 = (C37971nL) concurrentMap.remove(next);
                if (c37971nL2 != null) {
                    c37971nL2.A01(s, j);
                    this.A06.add(c37971nL2);
                    this.A08.decrementAndGet();
                }
            }
        }
        AWJ();
    }

    @Override // X.InterfaceC004201y
    public boolean AES() {
        return !this.A06.isEmpty();
    }

    @Override // X.InterfaceC004201y
    public Long AQe() {
        C37971nL c37971nL = (C37971nL) this.A06.peek();
        if (c37971nL != null) {
            long j = c37971nL.A0E.get();
            if (j != -1) {
                return Long.valueOf(j);
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC004201y
    public Integer AQf() {
        C37971nL c37971nL = (C37971nL) this.A06.peek();
        if (c37971nL != null) {
            return Integer.valueOf(c37971nL.A01);
        }
        return null;
    }
}
