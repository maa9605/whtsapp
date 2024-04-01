package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Do  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02960Do {
    public static final C02960Do A02 = new C02960Do();
    public final C0FB A00 = new C0FB();
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public C02630Ce A00(AbstractC011205o abstractC011205o, C0FD c0fd) {
        C02630Ce c02630Ce;
        ConcurrentHashMap concurrentHashMap = this.A01;
        C02630Ce c02630Ce2 = (C02630Ce) concurrentHashMap.get(abstractC011205o);
        if (c02630Ce2 == null) {
            C0FB c0fb = this.A00;
            if (c0fb != null) {
                Integer valueOf = Integer.valueOf(Math.abs(abstractC011205o.hashCode()) % 128);
                ConcurrentHashMap concurrentHashMap2 = c0fb.A00;
                if (!concurrentHashMap2.containsKey(valueOf)) {
                    concurrentHashMap2.putIfAbsent(valueOf, new Object());
                }
                Object obj = concurrentHashMap2.get(valueOf);
                if (obj != null) {
                    synchronized (obj) {
                        c02630Ce = (C02630Ce) concurrentHashMap.get(abstractC011205o);
                        if (c02630Ce == null) {
                            c02630Ce = c0fd.A6h(abstractC011205o);
                            concurrentHashMap.put(abstractC011205o, c02630Ce);
                        }
                    }
                    return c02630Ce;
                }
                throw null;
            }
            throw null;
        }
        return c02630Ce2;
    }
}
