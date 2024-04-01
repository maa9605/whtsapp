package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.48R  reason: invalid class name */
/* loaded from: classes3.dex */
public class C48R {
    public final Context A00;
    public final C018508q A01;
    public final C0E7 A02;
    public final C28S A03;
    public final C463026g A04;
    public final C899048w A05;
    public final C014406v A06 = C014406v.A00("PaymentProviderKeyAction", "network", "COMMON");
    public final String A07;

    public C48R(Context context, C018508q c018508q, C0E7 c0e7, C463026g c463026g, C28S c28s, C899048w c899048w, String str) {
        this.A00 = context;
        this.A01 = c018508q;
        this.A02 = c0e7;
        this.A04 = c463026g;
        this.A03 = c28s;
        this.A05 = c899048w;
        this.A07 = str;
    }

    public void A00(String str, final C48Q c48q) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("action", "get-provider-key", null, (byte) 0));
        arrayList.add(new C04P("provider", str, null, (byte) 0));
        arrayList.add(new C04P("key-scope", this.A07, null, (byte) 0));
        C02590Ca c02590Ca = new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null);
        C463026g c463026g = this.A04;
        final Context context = this.A00;
        final C018508q c018508q = this.A01;
        final C0E7 c0e7 = this.A02;
        final C28S c28s = this.A03;
        c463026g.A0F("get", c02590Ca, new C28V(context, c018508q, c0e7, c28s) { // from class: X.4Gp
            @Override // X.C28V
            public void A02(C28Q c28q) {
                C014406v c014406v = C48R.this.A06;
                StringBuilder A0P = C000200d.A0P("providerKey: onRequestError ");
                A0P.append(c28q.A00);
                c014406v.A04(A0P.toString());
                c48q.AJs(c28q);
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                C014406v c014406v = C48R.this.A06;
                StringBuilder A0P = C000200d.A0P("providerKey: onResponseError ");
                A0P.append(c28q.A00);
                c014406v.A04(A0P.toString());
                c48q.AJs(c28q);
            }

            @Override // X.C28V
            public void A04(C02590Ca c02590Ca2) {
                try {
                    C02590Ca A0E = c02590Ca2.A0E("account").A0E("key");
                    C48R c48r = C48R.this;
                    C899048w c899048w = c48r.A05;
                    C77343i3 A01 = c899048w.A01(A0E);
                    C014406v c014406v = c48r.A06;
                    StringBuilder sb = new StringBuilder();
                    sb.append("providerKey/onSuccess: isValidSignature=");
                    sb.append(A01 != null);
                    c014406v.A05(sb.toString());
                    if (A01 != null) {
                        c899048w.A03(A01);
                        c48q.AO6(A01);
                        return;
                    }
                    c014406v.A04("providerKey/onSuccess signature is not valid");
                    c48q.AJs(new C28Q(8));
                } catch (C0L4 e) {
                    C48R.this.A06.A08("providerKey/parseResponse failed: ", e);
                    c48q.AJs(new C28Q(9));
                }
            }
        }, 0L);
    }
}
