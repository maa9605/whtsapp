package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4D4  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4D4 implements InterfaceC896347v {
    public final /* synthetic */ BrazilPaymentActivity A00;
    public final /* synthetic */ String A01;

    public C4D4(BrazilPaymentActivity brazilPaymentActivity, String str) {
        this.A00 = brazilPaymentActivity;
        this.A01 = str;
    }

    public /* synthetic */ void A00(List list) {
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        brazilPaymentActivity.ARS();
        if (brazilPaymentActivity.A0P == null || list.size() <= 0) {
            return;
        }
        brazilPaymentActivity.A0P.AMp((C0N2) list.get(0));
    }

    @Override // X.InterfaceC896347v
    public void AIH(C0N7 c0n7) {
        Log.i("PAY: BrazilPaymentActivity BrazilGetVerificationMethods - onCardVerified");
        ((C4KG) this.A00).A0F.A01().A02(c0n7, new C28N() { // from class: X.3im
            @Override // X.C28N
            public final void AH2(List list) {
                C4D4.this.A00(list);
            }
        });
    }

    @Override // X.InterfaceC896347v
    public void AOD(ArrayList arrayList, C28Q c28q) {
        Intent A01;
        BrazilPaymentActivity brazilPaymentActivity = this.A00;
        brazilPaymentActivity.ARS();
        if (c28q == null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray A03 = brazilPaymentActivity.A0A.A03(arrayList);
                if (A03 != null && !C47W.A02(arrayList)) {
                    String str = this.A01;
                    String obj = A03.toString();
                    C0DV c0dv = ((C4KG) brazilPaymentActivity).A0F;
                    c0dv.A04();
                    C0N7 c0n7 = (C0N7) c0dv.A08.A08(str);
                    if (c0n7 == null || (A01 = brazilPaymentActivity.A0O.A01(brazilPaymentActivity, c0n7, obj)) == null) {
                        return;
                    }
                    C47V.A00(A01, "verify_to_pay");
                    brazilPaymentActivity.A15(A01, 1);
                    return;
                }
            } else {
                brazilPaymentActivity.A0B.A01(brazilPaymentActivity, 0, R.string.payment_card_cannot_verified_error).show();
                return;
            }
        }
        Log.i("PAY: BrazilGetVerificationMethods Error: 0");
        brazilPaymentActivity.A0B.A01(brazilPaymentActivity, 0, R.string.payment_verify_card_error).show();
    }
}
