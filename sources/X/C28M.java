package X;

import java.util.Iterator;

/* renamed from: X.28M  reason: invalid class name */
/* loaded from: classes2.dex */
public class C28M extends AnonymousClass009 {
    public static final C28M A00 = new C28M();

    public void A02(C0N2 c0n2) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C78223jY) c0g5.next()).A00.A1S(c0n2);
        }
    }
}
