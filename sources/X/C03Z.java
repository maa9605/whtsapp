package X;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.03Z  reason: invalid class name */
/* loaded from: classes.dex */
public class C03Z {
    public static volatile C03Z A02;
    public final C000500h A00;
    public final AtomicLong A01 = new AtomicLong(-1);

    public C03Z(C000500h c000500h) {
        this.A00 = c000500h;
    }

    public static C03Z A00() {
        if (A02 == null) {
            synchronized (C03Z.class) {
                if (A02 == null) {
                    A02 = new C03Z(C000500h.A00());
                }
            }
        }
        return A02;
    }

    public long A01() {
        AtomicLong atomicLong = this.A01;
        long j = atomicLong.get();
        if (j != -1) {
            return j;
        }
        C000500h c000500h = this.A00;
        long j2 = c000500h.A00.getLong("qpl_id", -1L);
        if (j2 != -1) {
            atomicLong.set(j2);
            return j2;
        }
        synchronized (C03Z.class) {
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            long mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
            atomicLong.set(mostSignificantBits);
            c000500h.A0D().putLong("qpl_id", mostSignificantBits).apply();
            return mostSignificantBits;
        }
    }
}
