package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4Gb */
/* loaded from: classes3.dex */
public class C91734Gb extends C28V {
    public final /* synthetic */ C90664By A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91734Gb(C90664By c90664By, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s) {
        super(context, c018508q, c0e7, c28s);
        this.A00 = c90664By;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilVerifyCardOTPSendAction onRequestError: ");
        sb.append(c28q);
        Log.i(sb.toString());
        this.A00.A04.A00(null, c28q);
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilVerifyCardOTPSendAction onResponseError: ");
        sb.append(c28q);
        Log.i(sb.toString());
        this.A00.A04.A00(null, c28q);
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        C02590Ca A0D;
        Log.i("PAY: BrazilVerifyCardOTPSendAction success");
        C02590Ca A0D2 = c02590Ca.A0D("account");
        if (A0D2 != null && (A0D = A0D2.A0D("card")) != null) {
            C92224Ib c92224Ib = new C92224Ib();
            C90664By c90664By = this.A00;
            c92224Ib.A03(c90664By.A02, 0, A0D);
            final C0N7 c0n7 = (C0N7) c92224Ib.A05();
            ((AnonymousClass481) c90664By).A06.A01().A02(c0n7, new C28N() { // from class: X.3hy
                {
                    C91734Gb.this = this;
                }

                @Override // X.C28N
                public final void AH2(List list) {
                    C91734Gb.this.A05(c0n7);
                }
            });
            return;
        }
        this.A00.A04.A00(null, new C28Q());
    }

    public /* synthetic */ void A05(C0N7 c0n7) {
        this.A00.A04.A00(c0n7, null);
    }
}
