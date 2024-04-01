package X;

import java.util.Iterator;

/* renamed from: X.0Ff  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03320Ff extends AnonymousClass009 {
    public static final C03320Ff A00 = new C03320Ff();

    public void A02(AbstractC005302j abstractC005302j) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0GC) c0g5.next()).A01(abstractC005302j);
        }
    }
}
