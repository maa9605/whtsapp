package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.47u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C896247u {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C013606n A03;
    public final C28S A04;
    public final C463026g A05;
    public final C47t A06;

    public C896247u(Context context, C018508q c018508q, C0E7 c0e7, C463026g c463026g, C013606n c013606n, C28S c28s, C47t c47t) {
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c0e7;
        this.A05 = c463026g;
        this.A03 = c013606n;
        this.A04 = c28s;
        this.A06 = c47t;
    }

    public void A00() {
        C463026g c463026g = this.A05;
        C02590Ca c02590Ca = new C02590Ca("account", new C04P[]{new C04P("action", "br-get-payout-banks", null, (byte) 0)}, null, null);
        final Context context = this.A00;
        final C018508q c018508q = this.A01;
        final C0E7 c0e7 = this.A02;
        final C28S c28s = this.A04;
        c463026g.A0F("get", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4GP
            @Override // X.C28V
            public void A02(C28Q c28q) {
                C896247u.this.A06.AKl(null, new C28Q());
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                C896247u.this.A06.AKl(null, new C28Q());
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca2) {
                C02590Ca A0D = c02590Ca2.A0D("account");
                if (A0D != null) {
                    C28Q A00 = C28Q.A00(A0D);
                    if (A00 != null) {
                        C896247u.this.A06.AKl(null, A00);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C02590Ca c02590Ca3 : A0D.A0H("bank")) {
                        C92214Ia c92214Ia = new C92214Ia();
                        c92214Ia.A03(C896247u.this.A03, 0, c02590Ca3);
                        arrayList.add(c92214Ia);
                    }
                    C896247u.this.A06.AKl(arrayList, null);
                    return;
                }
                C896247u.this.A06.AKl(null, new C28Q());
            }
        }, 30000L);
    }
}
