package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2U1  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2U1 implements InterfaceC010405f {
    public final AbstractC000600i A00;
    public final C06K A01;
    public final C49392Kd A02;
    public final C2U0 A03;
    public final C0E7 A04;
    public final C05Y A05;

    public C2U1(C05Y c05y, C49392Kd c49392Kd, C0E7 c0e7, C06K c06k, C2U0 c2u0, AbstractC000600i abstractC000600i) {
        this.A05 = c05y;
        this.A02 = c49392Kd;
        this.A04 = c0e7;
        this.A01 = c06k;
        this.A03 = c2u0;
        this.A00 = abstractC000600i;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("RequestBizProductListProtocolHelper/delivery-error");
        this.A02.A01(new C2U2(3));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("RequestBizProductListProtocolHelper/response-error");
        int A01 = C40731sm.A01(c02590Ca);
        this.A02.A01(new C2U2(2));
        AbstractC000600i abstractC000600i = this.A00;
        StringBuilder sb = new StringBuilder("error_code=");
        sb.append(A01);
        abstractC000600i.A09("RequestBizProductCatalogProtocolHelper/get product catalog error", sb.toString(), true);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C49392Kd c49392Kd = this.A02;
        C50952Tz c50952Tz = c49392Kd.A06;
        C2U0 c2u0 = this.A03;
        C59952tg A02 = c2u0.A02(c02590Ca);
        c2u0.A03(c02590Ca, c50952Tz.A00, this.A01);
        if (A02 == null) {
            c49392Kd.A01(new C2U2(4));
            this.A00.A09("RequestBizProductListProtocolHelper/get product catalog error", "error_code=0", true);
            return;
        }
        List list = A02.A01;
        C2U2 c2u2 = new C2U2(1);
        c2u2.A01 = list;
        c49392Kd.A01(c2u2);
    }
}
