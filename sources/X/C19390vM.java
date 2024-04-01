package X;

import java.util.LinkedHashMap;

/* renamed from: X.0vM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19390vM {
    public final InterfaceC19440vR A01;
    public final LinkedHashMap A02 = new LinkedHashMap();
    public int A00 = 0;

    public C19390vM(InterfaceC19440vR interfaceC19440vR) {
        this.A01 = interfaceC19440vR;
    }

    public synchronized int A00() {
        return this.A02.size();
    }

    public synchronized int A01() {
        return this.A00;
    }

    public synchronized Object A02(Object obj) {
        Object remove;
        remove = this.A02.remove(obj);
        this.A00 -= remove == null ? 0 : this.A01.ADB(remove);
        return remove;
    }

    public synchronized void A03(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = this.A02;
        Object remove = linkedHashMap.remove(obj);
        this.A00 -= remove == null ? 0 : this.A01.ADB(remove);
        linkedHashMap.put(obj, obj2);
        this.A00 += this.A01.ADB(obj2);
    }
}
