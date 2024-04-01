package X;

import com.whatsapp.util.Log;

/* renamed from: X.2hV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53782hV implements InterfaceC010405f {
    public C53792hW A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final AnonymousClass012 A04;
    public final C05Y A05;

    public C53782hV(AnonymousClass012 anonymousClass012, C018508q c018508q, AbstractC000600i abstractC000600i, C05Y c05y, C0E7 c0e7) {
        this.A04 = anonymousClass012;
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A05 = c05y;
        this.A03 = c0e7;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/delivery-error");
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("GetBusinessActivityReportProtocolHelper/onError");
        int A01 = C40731sm.A01(c02590Ca);
        if (this.A00 != null) {
            this.A02.A0G(new RunnableEBaseShape0S0101000_I0(this, A01, 8));
        }
        AbstractC000600i abstractC000600i = this.A01;
        StringBuilder sb = new StringBuilder("error_code=");
        sb.append(A01);
        abstractC000600i.A09("GetBusinessActivityReportProtocolHelper/get business activity error", sb.toString(), true);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C02590Ca A0D = c02590Ca.A0D("p2b");
        if (A0D != null) {
            C02590Ca A0D2 = A0D.A0D("report");
            if (A0D2 != null && this.A00 != null) {
                C02590Ca A0D3 = A0D2.A0D("url");
                C02590Ca A0D4 = A0D2.A0D("title");
                C02590Ca A0D5 = A0D2.A0D("file_length");
                if (A0D3 != null && A0D4 != null && A0D5 != null) {
                    this.A02.A0G(new RunnableEBaseShape4S0200000_I0_4(this, new C2E9(Long.valueOf(A0D5.A0F()).longValue(), A0D3.A0F(), A0D2.A07("creation", 0L) * 1000, A0D2.A07("expiration", (this.A04.A05() + 2592000000L) / 1000) * 1000, A0D4.A0F()), 8));
                    return;
                }
                this.A02.A0G(new RunnableEBaseShape6S0100000_I0_6(this, 0));
            } else if (this.A00 == null) {
            } else {
                this.A02.A0G(new RunnableEBaseShape0S0100100_I0(this, A0D.A07("timestamp", 0L) * 1000, 4));
            }
        } else if (this.A00 == null) {
        } else {
            this.A02.A0G(new RunnableEBaseShape6S0100000_I0_6(this, 1));
        }
    }
}
