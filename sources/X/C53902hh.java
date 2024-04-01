package X;

import com.whatsapp.util.Log;

/* renamed from: X.2hh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53902hh implements InterfaceC010405f {
    public C53912hi A00;
    public final AbstractC000600i A01;
    public final C018508q A02;
    public final C0E7 A03;
    public final C05Y A04;

    public C53902hh(C018508q c018508q, AbstractC000600i abstractC000600i, C05Y c05y, C0E7 c0e7) {
        this.A02 = c018508q;
        this.A01 = abstractC000600i;
        this.A04 = c05y;
        this.A03 = c0e7;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        Log.e("DeleteBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A02.A0G(new RunnableEBaseShape5S0100000_I0_5(this, 48));
        }
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        Log.e("DeleteBusinessActivityReport/onError");
        if (this.A00 != null) {
            this.A02.A0G(new RunnableEBaseShape5S0100000_I0_5(this, 49));
        }
        AbstractC000600i abstractC000600i = this.A01;
        StringBuilder A0P = C000200d.A0P("error_code=");
        A0P.append(C40731sm.A01(c02590Ca));
        abstractC000600i.A09("DeleteBusinessActivityReport/delete business activity error", A0P.toString(), true);
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        if (this.A00 != null) {
            this.A02.A0G(new RunnableEBaseShape5S0100000_I0_5(this, 47));
        }
    }
}
