package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.33L  reason: invalid class name */
/* loaded from: classes2.dex */
public class C33L implements InterfaceC010405f {
    public final AbstractC000600i A00;
    public final C06K A01;
    public final C2L3 A02;
    public final C2U0 A03;
    public final C0E7 A04;
    public final C59962th A05;
    public final C05Y A06;

    public C33L(AbstractC000600i abstractC000600i, C05Y c05y, C2U0 c2u0, C2L3 c2l3, C59962th c59962th, C0E7 c0e7, C06K c06k) {
        this.A03 = c2u0;
        this.A00 = abstractC000600i;
        this.A06 = c05y;
        this.A02 = c2l3;
        this.A05 = c59962th;
        this.A04 = c0e7;
        this.A01 = c06k;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("sendGetBizProductCatalog/delivery-error");
        this.A02.A01(this.A05, -1);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("sendGetBizProductCatalog/response-error");
        int A01 = C40731sm.A01(c02590Ca);
        this.A02.A01(this.A05, A01);
        AbstractC000600i abstractC000600i = this.A00;
        StringBuilder sb = new StringBuilder("error_code=");
        sb.append(A01);
        abstractC000600i.A09("RequestBizProductCatalogProtocolHelper/get product catalog error", sb.toString(), true);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C59962th c59962th = this.A05;
        UserJid userJid = c59962th.A03;
        C2U0 c2u0 = this.A03;
        C59952tg A02 = c2u0.A02(c02590Ca);
        c2u0.A03(c02590Ca, userJid, this.A01);
        if (A02 != null) {
            C2L3 c2l3 = this.A02;
            C018508q c018508q = c2l3.A06;
            c018508q.A02.post(new RunnableEBaseShape2S0300000_I1(A02, c2l3, c59962th, 1));
            return;
        }
        this.A02.A01(c59962th, 0);
        this.A00.A09("RequestBizProductCatalogProtocolHelper/get product catalog error", "error_code=0", true);
    }
}
