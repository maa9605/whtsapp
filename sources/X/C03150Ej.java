package X;

import java.util.Iterator;

/* renamed from: X.0Ej */
/* loaded from: classes.dex */
public class C03150Ej extends AnonymousClass009 {
    public static volatile C03150Ej A01;
    public volatile boolean A00;

    public static C03150Ej A00() {
        if (A01 == null) {
            synchronized (C03150Ej.class) {
                if (A01 == null) {
                    A01 = new C03150Ej();
                }
            }
        }
        return A01;
    }

    public void A02(boolean z) {
        C000700j.A01();
        if (z == this.A00) {
            return;
        }
        this.A00 = z;
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0PH) c0g5.next()).AOK(this.A00);
        }
    }
}
