package X;

import android.content.Context;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4GZ  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GZ extends C28V {
    public final /* synthetic */ C91724Ga A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GZ(C91724Ga c91724Ga, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s) {
        super(context, c018508q, c0e7, c28s);
        this.A00 = c91724Ga;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        C77683ib c77683ib = this.A00.A08;
        BrazilPayBloksActivity.A04(c77683ib.A00, new C28Q());
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        C77683ib c77683ib = this.A00.A08;
        BrazilPayBloksActivity.A04(c77683ib.A00, new C28Q());
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        try {
            C02590Ca A0E = c02590Ca.A0E("account");
            C28Q A00 = C28Q.A00(A0E);
            if (A00 != null) {
                BrazilPayBloksActivity.A04(this.A00.A08.A00, A00);
                return;
            }
            C92234Ic c92234Ic = new C92234Ic();
            C91724Ga c91724Ga = this.A00;
            c92234Ic.A03(c91724Ga.A04, 0, A0E.A0E("merchant"));
            final C0N1 c0n1 = (C0N1) c92234Ic.A05();
            c91724Ga.A07.A01().A02(c0n1, new C28N() { // from class: X.3hx
                @Override // X.C28N
                public final void AH2(List list) {
                    C4GZ.this.A05(c0n1);
                }
            });
        } catch (C0L4 unused) {
            Log.e("PAY: BrazilMerchantRegAction/regMerchant: invalid response message");
            C77683ib c77683ib = this.A00.A08;
            BrazilPayBloksActivity.A04(c77683ib.A00, new C28Q());
        }
    }

    public /* synthetic */ void A05(C0N1 c0n1) {
        BrazilPayBloksActivity.A04(this.A00.A08.A00, null);
    }
}
