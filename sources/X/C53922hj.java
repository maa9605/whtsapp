package X;

import com.whatsapp.util.Log;

/* renamed from: X.2hj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53922hj implements InterfaceC010405f {
    public C53932hk A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final C05Y A04;

    public C53922hj(C018508q c018508q, AbstractC000600i abstractC000600i, C05Y c05y, C0E7 c0e7) {
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A04 = c05y;
        this.A03 = c0e7;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A02.A0G(new RunnableEBaseShape6S0100000_I0_6(this, 2));
        }
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("RequestBusinessActivityReportProtocolHelper/onError");
        int A01 = C40731sm.A01(c02590Ca);
        if (this.A00 != null) {
            this.A02.A0G(new RunnableEBaseShape0S0101000_I0(this, A01, 9));
        }
        AbstractC000600i abstractC000600i = this.A01;
        StringBuilder sb = new StringBuilder("error_code=");
        sb.append(A01);
        abstractC000600i.A09("RequestBusinessActivityReportProtocolHelper/get business activity error", sb.toString(), true);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C02590Ca A0D = c02590Ca.A0D("p2b");
        if (A0D != null) {
            long A07 = A0D.A07("timestamp", 0L) * 1000;
            if (this.A00 != null) {
                this.A02.A0G(new RunnableEBaseShape0S0100100_I0(this, A07, 5));
            }
        } else if (this.A00 == null) {
        } else {
            this.A02.A0G(new RunnableEBaseShape6S0100000_I0_6(this, 3));
        }
    }
}
