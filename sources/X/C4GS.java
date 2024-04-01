package X;

import android.content.Context;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4GS  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GS extends C28V {
    public final /* synthetic */ C896647y A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GS(C896647y c896647y, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s) {
        super(context, c018508q, c0e7, c28s);
        this.A00 = c896647y;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantLinkAction request error: ");
        sb.append(c28q);
        Log.e(sb.toString());
        BrazilPayBloksActivity.A03(this.A00.A07.A00, null, c28q);
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantLinkAction response error: ");
        sb.append(c28q);
        Log.e(sb.toString());
        BrazilPayBloksActivity.A03(this.A00.A07.A00, null, c28q);
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        try {
            C02590Ca A0E = c02590Ca.A0E("account");
            C28Q A00 = C28Q.A00(A0E);
            if (A00 != null) {
                BrazilPayBloksActivity.A03(this.A00.A07.A00, null, A00);
                return;
            }
            C92234Ic c92234Ic = new C92234Ic();
            C896647y c896647y = this.A00;
            c92234Ic.A03(c896647y.A03, 0, A0E.A0E("merchant"));
            final C0N1 c0n1 = (C0N1) c92234Ic.A05();
            c896647y.A06.A01().A02(c0n1, new C28N() { // from class: X.3ht
                @Override // X.C28N
                public final void AH2(List list) {
                    C4GS.this.A05(c0n1);
                }
            });
        } catch (C0L4 e) {
            Log.e("PAY: BrazilMerchantLinkAction/regMerchant: invalid response message", e);
            C77703id c77703id = this.A00.A07;
            BrazilPayBloksActivity.A03(c77703id.A00, null, new C28Q());
        }
    }

    public /* synthetic */ void A05(C0N1 c0n1) {
        BrazilPayBloksActivity.A03(this.A00.A07.A00, c0n1, null);
    }
}
