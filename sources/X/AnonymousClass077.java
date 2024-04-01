package X;

import java.util.Iterator;

/* renamed from: X.077  reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass077 extends AnonymousClass009 {
    public void A02(C0QX c0qx) {
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0SS) c0g5.next()).AQG(c0qx);
        }
    }
}
