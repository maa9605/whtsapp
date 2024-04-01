package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0Fk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03360Fk extends AnonymousClass009 {
    public static final C03360Fk A00 = new C03360Fk();

    public void A02(Set set) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GE) c0g5.next()).A00(set);
        }
    }
}
