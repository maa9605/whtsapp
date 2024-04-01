package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.0un */
/* loaded from: classes.dex */
public class C19070un {
    public static final Map A03 = new IdentityHashMap();
    public int A00;
    public Object A01;
    public final InterfaceC19050ul A02;

    public C19070un(Object obj, InterfaceC19050ul interfaceC19050ul) {
        if (obj != null) {
            this.A01 = obj;
            if (interfaceC19050ul != null) {
                this.A02 = interfaceC19050ul;
                this.A00 = 1;
                Map map = A03;
                synchronized (map) {
                    Integer num = (Integer) map.get(obj);
                    if (num == null) {
                        map.put(obj, 1);
                    } else {
                        map.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public synchronized Object A00() {
        return this.A01;
    }

    public final void A01() {
        boolean z;
        synchronized (this) {
            z = this.A00 > 0;
        }
        if (!z) {
            throw new RuntimeException() { // from class: X.0um
            };
        }
    }
}
