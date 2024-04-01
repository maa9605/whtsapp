package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Dw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C25051Dw {
    public final Object A00 = new Object();
    public final Map A02 = new HashMap();
    public final Map A01 = new HashMap();

    public int A00(C1E1 c1e1) {
        synchronized (this.A00) {
            Map map = this.A02;
            Integer num = (Integer) map.get(c1e1);
            if (num != null) {
                return num.intValue();
            }
            int incrementAndGet = C24951Dm.A00.incrementAndGet();
            Integer valueOf = Integer.valueOf(incrementAndGet);
            map.put(c1e1, valueOf);
            this.A01.put(valueOf, c1e1);
            return incrementAndGet;
        }
    }
}
