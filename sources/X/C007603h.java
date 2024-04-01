package X;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.03h */
/* loaded from: classes.dex */
public class C007603h {
    public static volatile C007603h A08;
    public final C007303e A00;
    public final C03X A01;
    public final RunnableC008003l A02;
    public final InterfaceC007503g A03;
    public final C007803j A04;
    public final InterfaceC002901k A05;
    public final ArrayBlockingQueue A06 = new ArrayBlockingQueue(100);
    public final ConcurrentHashMap A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.03l] */
    public C007603h(InterfaceC002901k interfaceC002901k, C03X c03x, C007303e c007303e, C007203d c007203d, InterfaceC007503g interfaceC007503g, C007803j c007803j) {
        this.A05 = interfaceC002901k;
        this.A01 = c03x;
        this.A00 = c007303e;
        this.A03 = interfaceC007503g;
        this.A04 = c007803j;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A07 = concurrentHashMap;
        this.A02 = new Runnable(c03x, c007203d, this.A06, concurrentHashMap) { // from class: X.03l
            public static final AtomicInteger A04 = new AtomicInteger(0);
            public final C03X A00;
            public final C007203d A01;
            public final ArrayBlockingQueue A02;
            public final ConcurrentHashMap A03;

            {
                this.A01 = c007203d;
                this.A02 = r3;
                this.A00 = c03x;
                this.A03 = concurrentHashMap;
            }

            /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x00b1, code lost:
                if (r1.isEmpty() != false) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x00b3, code lost:
                r9.A00.A01(18, null, new java.lang.Object[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x00be, code lost:
                return;
             */
            /* JADX WARN: Removed duplicated region for block: B:103:0x008f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x006d A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:68:0x004e, B:69:0x0059, B:74:0x0067, B:76:0x006d, B:77:0x0072, B:71:0x005e, B:72:0x0061, B:70:0x005a), top: B:95:0x0067, inners: #1 }] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0086 A[DONT_GENERATE] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r9 = this;
                    java.util.concurrent.atomic.AtomicInteger r0 = X.RunnableC008003l.A04
                    int r3 = r0.getAndIncrement()
                    r2 = 0
                L7:
                    java.util.concurrent.ArrayBlockingQueue r1 = r9.A02
                    boolean r0 = r1.isEmpty()
                    if (r0 != 0) goto Lad
                    int r8 = r2 + 1
                    r0 = 15
                    if (r2 >= r0) goto Lad
                    java.lang.Object r2 = r1.poll()
                    X.1Q9 r2 = (X.C1Q9) r2
                    if (r2 != 0) goto L1e
                    return
                L1e:
                    X.03d r0 = r9.A01
                    java.lang.Object r5 = r0.get()
                    X.01y r5 = (X.InterfaceC004201y) r5
                    r4 = 916783105(0x36a50001, float:4.9173836E-6)
                    r5.AGL(r4, r3)
                    X.1QC r7 = r2.A01
                    java.lang.String r1 = r7.AAz()
                    java.lang.String r0 = "listener"
                    r5.AGF(r4, r3, r0, r1)
                    int r6 = r2.A00
                    java.lang.String r0 = "event_type"
                    r5.AGE(r4, r3, r0, r6)
                    X.1nL r2 = r2.A02
                    int r1 = r2.A00
                    java.lang.String r0 = "marker_id"
                    r5.AGE(r4, r3, r0, r1)
                    r0 = 1
                    if (r6 == r0) goto L5a
                    r0 = 2
                    if (r6 != r0) goto L4e
                    goto L5e
                L4e:
                    java.lang.String r0 = "Unknown event type: "
                    java.lang.String r1 = X.C000200d.A0D(r0, r6)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L92
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L92
                    r0.<init>(r1)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L92
                    throw r0     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L92
                L5a:
                    r7.AOr(r2)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L92
                    goto L61
                L5e:
                    r7.AJm(r2)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L92
                L61:
                    r0 = 2
                    r5.AGH(r4, r3, r0)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L92
                    goto L76
                L66:
                    r0 = move-exception
                    java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L92
                    if (r1 == 0) goto L72
                    java.lang.String r0 = "fail_reason"
                    r5.AGF(r4, r3, r0, r1)     // Catch: java.lang.Throwable -> L92
                L72:
                    r0 = 3
                    r5.AGH(r4, r3, r0)     // Catch: java.lang.Throwable -> L92
                L76:
                    int r0 = r2.A01
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                    java.util.concurrent.ConcurrentHashMap r1 = r9.A03
                    java.lang.Object r0 = r1.get(r2)
                    java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
                    if (r0 == 0) goto L8f
                    int r0 = r0.decrementAndGet()
                    if (r0 != 0) goto L8f
                    r1.remove(r2)
                L8f:
                    r2 = r8
                    goto L7
                L92:
                    r3 = move-exception
                    int r0 = r2.A01
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                    java.util.concurrent.ConcurrentHashMap r1 = r9.A03
                    java.lang.Object r0 = r1.get(r2)
                    java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
                    if (r0 == 0) goto Lac
                    int r0 = r0.decrementAndGet()
                    if (r0 != 0) goto Lac
                    r1.remove(r2)
                Lac:
                    throw r3
                Lad:
                    boolean r0 = r1.isEmpty()
                    if (r0 != 0) goto Lbe
                    X.03X r3 = r9.A00
                    r0 = 0
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    r1 = 18
                    r0 = 0
                    r3.A01(r1, r0, r2)
                Lbe:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC008003l.run():void");
            }
        };
    }

    public static C007603h A00() {
        if (A08 == null) {
            synchronized (C007603h.class) {
                if (A08 == null) {
                    InterfaceC002901k A00 = C002801j.A00();
                    C03X A002 = C03W.A00();
                    C007303e A003 = C007303e.A00();
                    C007203d A004 = C007203d.A00(new InterfaceC007103c() { // from class: X.03i
                        @Override // X.InterfaceC007103c
                        public final Object get() {
                            return C03U.A00();
                        }
                    });
                    C007403f A005 = C007403f.A00();
                    if (C007803j.A03 == null) {
                        synchronized (C007803j.class) {
                            if (C007803j.A03 == null) {
                                C007803j.A03 = new C007803j(C02E.A00(), new C007903k(Runtime.getRuntime()));
                            }
                        }
                    }
                    A08 = new C007603h(A00, A002, A003, A004, A005, C007803j.A03);
                }
            }
        }
        return A08;
    }

    public final void A01(int i, C37971nL c37971nL) {
        C1QC[] c1qcArr;
        C1QD c1qd = c37971nL.A05;
        if (c1qd == C1QD.A02) {
            return;
        }
        for (C1QC c1qc : c1qd.A00) {
            if (i == 1) {
                c1qc.AOr(c37971nL);
            } else if (i == 2) {
                c1qc.AJm(c37971nL);
            } else {
                throw new IllegalStateException(C000200d.A0D("Unknown event type: ", i));
            }
        }
        for (C1QC c1qc2 : c1qd.A01) {
            if (this.A06.offer(new C1Q9(i, c1qc2, c37971nL))) {
                Integer valueOf = Integer.valueOf(c37971nL.A01);
                ConcurrentHashMap concurrentHashMap = this.A07;
                AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(valueOf);
                if (atomicInteger == null) {
                    atomicInteger = new AtomicInteger(0);
                    AtomicInteger atomicInteger2 = (AtomicInteger) concurrentHashMap.putIfAbsent(valueOf, atomicInteger);
                    if (atomicInteger2 != null) {
                        atomicInteger = atomicInteger2;
                    }
                }
                atomicInteger.incrementAndGet();
            } else {
                this.A01.A01(17, null, new Object[0]);
            }
        }
        this.A05.AS3(this.A02, "qpl_bg_listeners");
    }
}
