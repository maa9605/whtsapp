package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.00A */
/* loaded from: classes.dex */
public class C00A extends AnonymousClass009 {
    public static final C00A A00 = new C00A();

    public void A02(AbstractC005302j abstractC005302j) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C00T) c0g5.next()).A00(abstractC005302j);
        }
    }

    public void A03(AbstractC005302j abstractC005302j) {
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C00T) c0g5.next()).A05(abstractC005302j);
        }
    }

    public void A04(AnonymousClass092 anonymousClass092, int i) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C00T) c0g5.next()).A0C(anonymousClass092, i);
        }
    }

    public void A05(AnonymousClass092 anonymousClass092, int i) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C00T) c0g5.next()).A08(anonymousClass092, i);
        }
    }

    public void A06(Collection collection, int i) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C00T) c0g5.next()).A03(collection, i);
        }
    }

    public void A07(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C00T) c0g5.next()).A0A(collection, abstractC005302j, map, z);
        }
    }

    public void A08(Collection collection, Map map, Map map2) {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C00T) c0g5.next()).A0B(collection, map, map2);
        }
    }
}
