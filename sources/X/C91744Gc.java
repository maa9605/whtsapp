package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4Gc */
/* loaded from: classes3.dex */
public class C91744Gc extends C28V {
    public final /* synthetic */ C90674Bz A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91744Gc(C90674Bz c90674Bz, Context context, C018508q c018508q, C0E7 c0e7, C28S c28s) {
        super(context, c018508q, c0e7, c28s);
        this.A00 = c90674Bz;
    }

    @Override // X.C28V
    public void A02(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilVerifyCardSendAuthCodeAction onRequestError: ");
        sb.append(c28q);
        Log.i(sb.toString());
        this.A00.A04.A00(c28q);
    }

    @Override // X.C28V
    public void A03(C28Q c28q) {
        StringBuilder sb = new StringBuilder("PAY: BrazilVerifyCardSendAuthCodeAction onResponseError: ");
        sb.append(c28q);
        Log.i(sb.toString());
        this.A00.A04.A00(c28q);
    }

    @Override // X.C28V
    public void A04(C02590Ca c02590Ca) {
        C02590Ca A0D;
        Log.i("PAY: BrazilVerifyCardSendAuthCodeAction success");
        C02590Ca A0D2 = c02590Ca.A0D("account");
        if (A0D2 != null && (A0D = A0D2.A0D("card")) != null) {
            C92224Ib c92224Ib = new C92224Ib();
            C90674Bz c90674Bz = this.A00;
            c92224Ib.A03(c90674Bz.A02, 0, A0D);
            final C0N7 c0n7 = (C0N7) c92224Ib.A05();
            ((AnonymousClass481) c90674Bz).A06.A01().A02(c0n7, new C28N() { // from class: X.3hz
                {
                    C91744Gc.this = this;
                }

                @Override // X.C28N
                public final void AH2(List list) {
                    C91744Gc.this.A05();
                }
            });
        }
        StringBuilder sb = new StringBuilder("PAY: BrazilVerifyCardSendAuthCodeAction onResponseSuccess: ");
        sb.append(c02590Ca);
        Log.i(sb.toString());
    }

    public /* synthetic */ void A05() {
        this.A00.A04.A00(null);
    }
}
