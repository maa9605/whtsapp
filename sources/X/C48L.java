package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.48L  reason: invalid class name */
/* loaded from: classes3.dex */
public class C48L {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C28S A03;
    public final C463026g A04;
    public final C48K A05;
    public final C014406v A06 = C014406v.A00("PaymentGetTokenIdAction", "network", "COMMON");

    public C48L(Context context, C018508q c018508q, C0E7 c0e7, C463026g c463026g, C28S c28s, C48K c48k) {
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c0e7;
        this.A04 = c463026g;
        this.A03 = c28s;
        this.A05 = c48k;
    }

    public void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A05.AOC(null, null);
            return;
        }
        this.A06.A07(null, "starts to fetch token id", null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "get-token-id", null, (byte) 0));
        arrayList.add(new C04P("credential-id", str, null, (byte) 0));
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
        C463026g c463026g = this.A04;
        final Context context = this.A00;
        final C018508q c018508q = this.A01;
        final C0E7 c0e7 = this.A02;
        final C28S c28s = this.A03;
        c463026g.A0F("get", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4Gm
            @Override // X.C28V
            public void A02(C28Q c28q) {
                C48L c48l = C48L.this;
                C014406v c014406v = c48l.A06;
                StringBuilder sb = new StringBuilder("onRequestError: ");
                sb.append(c28q);
                c014406v.A07(null, sb.toString(), null);
                c48l.A05.AOC(null, c28q);
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                C48L c48l = C48L.this;
                C014406v c014406v = c48l.A06;
                StringBuilder sb = new StringBuilder("onResponseError: ");
                sb.append(c28q);
                c014406v.A07(null, sb.toString(), null);
                c48l.A05.AOC(null, c28q);
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca2) {
                String str2;
                C02590Ca A0D = c02590Ca2.A0D("account");
                if (A0D != null) {
                    C48K c48k = C48L.this.A05;
                    C04P A0A = A0D.A0A("token-id");
                    if (A0A != null) {
                        str2 = A0A.A03;
                    } else {
                        str2 = null;
                    }
                    c48k.AOC(str2, null);
                    return;
                }
                C48L.this.A05.AOC(null, new C28Q());
            }
        }, 0L);
    }
}
