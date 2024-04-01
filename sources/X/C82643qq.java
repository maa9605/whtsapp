package X;

import java.util.List;

/* renamed from: X.3qq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82643qq extends C0HS {
    public final C3Y6 A00;
    public final C2AS A01;

    public C82643qq(C2AS c2as, C3Y6 c3y6) {
        this.A01 = c2as;
        this.A00 = c3y6;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        return this.A01.A0L.A01();
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        List<C42531vt> list = (List) obj;
        if (list != null) {
            for (C42531vt c42531vt : list) {
                C47522Bo c47522Bo = this.A01.A0J;
                c42531vt.A05 = c47522Bo.A01.containsKey(c42531vt.A0D);
            }
            this.A00.A00(list);
            return;
        }
        throw null;
    }
}
