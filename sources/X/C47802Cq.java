package X;

import java.util.Iterator;

/* renamed from: X.2Cq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47802Cq extends AnonymousClass009 {
    public void A02() {
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (c0g5.hasNext()) {
                C0I8 c0i8 = ((C66973Di) c0g5.next()).A00.A00;
                if (c0i8 != null) {
                    c0i8.A00();
                }
            } else {
                return;
            }
        }
    }
}
