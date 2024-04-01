package X;

import java.util.Iterator;

/* renamed from: X.0MC  reason: invalid class name */
/* loaded from: classes.dex */
public class C0MC extends AnonymousClass009 {
    public static final C0MC A00 = new C0MC();

    public void A02() {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((InterfaceC09350d7) c0g5.next()).AI5();
        }
    }

    public void A03(C0D3 c0d3) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((InterfaceC09350d7) c0g5.next()).AI6(c0d3);
        }
    }
}
