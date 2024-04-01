package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0z3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21260z3 {
    public C21250z2 A01;
    public C21250z2 A02;
    public boolean A03;
    public final ArrayList A05 = new ArrayList();
    public final HashMap A06 = new HashMap();
    public final C21210yy A04 = new C21210yy();
    public AbstractC21230z0 A00 = AbstractC21230z0.A00;

    public final C21250z2 A00(C21250z2 c21250z2, AbstractC21230z0 abstractC21230z0) {
        C219010g c219010g = c21250z2.A02;
        int A04 = abstractC21230z0.A04(c219010g.A04);
        return A04 == -1 ? c21250z2 : new C21250z2(c219010g, abstractC21230z0, abstractC21230z0.A08(A04, this.A04, false).A00);
    }

    public final void A01() {
        ArrayList arrayList = this.A05;
        if (arrayList.isEmpty()) {
            return;
        }
        this.A01 = (C21250z2) arrayList.get(0);
    }
}
