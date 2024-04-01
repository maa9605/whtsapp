package X;

import java.math.BigDecimal;

/* renamed from: X.2Kg */
/* loaded from: classes2.dex */
public class C49412Kg {
    public static final BigDecimal A00(C02590Ca c02590Ca, C09R c09r) {
        String A0F;
        if (c02590Ca == null || (A0F = c02590Ca.A0F()) == null || c09r == null) {
            return null;
        }
        return C06960Vv.A02(c09r, Long.parseLong(A0F));
    }

    public C49422Kh A01(C02590Ca c02590Ca) {
        C09R c09r;
        if (c02590Ca != null) {
            C02590Ca A0D = c02590Ca.A0D("subtotal");
            C02590Ca A0D2 = c02590Ca.A0D("total");
            C02590Ca A0D3 = c02590Ca.A0D("currency");
            C02590Ca A0D4 = c02590Ca.A0D("price_status");
            String A0F = A0D4 == null ? null : A0D4.A0F();
            if (A0D3 != null && !AnonymousClass024.A0j(A0D3.A0F())) {
                c09r = new C09R(A0D3.A0F());
            } else {
                c09r = null;
            }
            BigDecimal A00 = A00(A0D2, c09r);
            BigDecimal A002 = A00(A0D, c09r);
            if (A0F == null || c09r == null || A00 == null || A002 == null) {
                return null;
            }
            return new C49422Kh(A00, c09r);
        }
        return null;
    }
}
