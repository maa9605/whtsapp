package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4DB  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DB implements InterfaceC896347v {
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A00;

    public C4DB(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity) {
        this.A00 = brazilPaymentCardDetailsActivity;
    }

    public /* synthetic */ void A00(C0N7 c0n7) {
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        ((C4KP) brazilPaymentCardDetailsActivity).A07 = c0n7;
        C49I c49i = brazilPaymentCardDetailsActivity.A0G;
        Intent intent = new Intent(brazilPaymentCardDetailsActivity, BrazilPayBloksActivity.class);
        intent.putExtra("screen_params", c49i.A03(c0n7, null));
        intent.putExtra("screen_name", "brpay_p_card_verified");
        brazilPaymentCardDetailsActivity.A15(intent, 1);
    }

    @Override // X.InterfaceC896347v
    public void AIH(final C0N7 c0n7) {
        Log.i("PAY: BrazilPaymentCardDetailsActivity BrazilGetVerificationMethods - onCardVerified");
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.ARS();
        brazilPaymentCardDetailsActivity.A0A.A01().A02(c0n7, new C28N() { // from class: X.3is
            @Override // X.C28N
            public final void AH2(List list) {
                C4DB.this.A00(c0n7);
            }
        });
    }

    @Override // X.InterfaceC896347v
    public void AOD(ArrayList arrayList, C28Q c28q) {
        int i;
        JSONArray A03;
        BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A00;
        brazilPaymentCardDetailsActivity.ARS();
        if (c28q == null) {
            if (arrayList != null && !arrayList.isEmpty() && (A03 = brazilPaymentCardDetailsActivity.A04.A03(arrayList)) != null && !C47W.A02(arrayList)) {
                Intent A01 = brazilPaymentCardDetailsActivity.A0G.A01(brazilPaymentCardDetailsActivity, (C0N7) ((C4KP) brazilPaymentCardDetailsActivity).A07, A03.toString());
                C47V.A00(A01, "payment_method_details");
                brazilPaymentCardDetailsActivity.A15(A01, 1);
                return;
            }
            i = 0;
        } else {
            i = c28q.A00;
            if (i != 443 && (arrayList == null || arrayList.isEmpty())) {
                i = -233;
            }
        }
        C000200d.A0q("PAY: BrazilGetVerificationMethods Error: ", i);
        brazilPaymentCardDetailsActivity.A05.A01(brazilPaymentCardDetailsActivity, i, R.string.payment_verify_card_error).show();
    }
}
