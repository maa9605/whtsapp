package X;

import java.util.List;

/* renamed from: X.2ML  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2ML {
    public static volatile C2ML A01;
    public final C72963as A00;

    public C2ML(C018508q c018508q, InterfaceC002901k interfaceC002901k, C02E c02e, C002301c c002301c) {
        this.A00 = new C72963as(c018508q, interfaceC002901k, c02e, c002301c);
    }

    public void A00() {
        C72963as c72963as = this.A00;
        if (c72963as != null) {
            C000700j.A01();
            List<C48652Gd> list = c72963as.A07;
            list.size();
            List<C48652Gd> list2 = c72963as.A06;
            list2.size();
            for (C48652Gd c48652Gd : list2) {
                c48652Gd.A0G();
                c48652Gd.A09();
            }
            list2.clear();
            for (C48652Gd c48652Gd2 : list) {
                c48652Gd2.A0G();
                c48652Gd2.A09();
            }
            list.clear();
            c72963as.A00 = 0;
            return;
        }
        throw null;
    }
}
