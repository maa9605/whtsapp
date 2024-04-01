package X;

import java.util.Iterator;

/* renamed from: X.0EX  reason: invalid class name */
/* loaded from: classes.dex */
public class C0EX extends AnonymousClass009 {
    public static final C0EX A00 = new C0EX();

    public void A02(AnonymousClass093 anonymousClass093) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((InterfaceC28001Pq) c0g5.next()).AMu(anonymousClass093);
        }
    }
}
