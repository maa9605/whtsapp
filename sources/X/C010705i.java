package X;

import java.util.Iterator;

/* renamed from: X.05i  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C010705i extends AnonymousClass009 {
    public void A02() {
        C000700j.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (c0g5.hasNext()) {
                C05W c05w = ((C36351kf) c0g5.next()).A00;
                AnonymousClass008 anonymousClass008 = c05w.A06;
                C02L c02l = c05w.A01;
                c02l.A05();
                anonymousClass008.A06(c02l.A03);
            } else {
                return;
            }
        }
    }
}
