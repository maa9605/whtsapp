package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4GV  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4GV extends C28V {
    public final /* synthetic */ C4GW A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4GV(C4GW c4gw, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s) {
        super(context, c018508q, c0e7, c28s);
        this.A00 = c4gw;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        this.A00.A0B.A00(c28q);
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantRegAction/regMerchant: onResponseError: ");
        sb.append(c28q);
        Log.e(sb.toString());
        this.A00.A0B.A00(c28q);
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        try {
            C02590Ca A0E = c02590Ca.A0E("account");
            C28Q A00 = C28Q.A00(A0E);
            if (A00 != null) {
                this.A00.A0B.A00(A00);
                return;
            }
            C92234Ic c92234Ic = new C92234Ic();
            C4GW c4gw = this.A00;
            c92234Ic.A03(c4gw.A05, 0, A0E.A0E("merchant"));
            final C0N1 c0n1 = (C0N1) c92234Ic.A05();
            c4gw.A08.A01().A02(c0n1, new C28N() { // from class: X.3hu
                @Override // X.C28N
                public final void AH2(List list) {
                    C4GV.this.A05();
                }
            });
        } catch (C0L4 unused) {
            Log.e("PAY: BrazilMerchantRegAction/regMerchant: invalid response message");
            this.A00.A0B.A00(new C28Q());
        }
    }

    public /* synthetic */ void A05() {
        this.A00.A0B.A00(null);
    }
}
