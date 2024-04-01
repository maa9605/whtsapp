package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.Hilt_BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4Cv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90894Cv implements InterfaceC896347v {
    public final /* synthetic */ BrazilConfirmReceivePaymentFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;
    public final /* synthetic */ String A02;

    public C90894Cv(BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment, String str, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = brazilConfirmReceivePaymentFragment;
        this.A02 = str;
        this.A01 = paymentBottomSheet;
    }

    public /* synthetic */ void A00(C0N7 c0n7, PaymentBottomSheet paymentBottomSheet) {
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = this.A00;
        brazilConfirmReceivePaymentFragment.A00.A03();
        C49I c49i = brazilConfirmReceivePaymentFragment.A0G;
        Intent intent = new Intent(brazilConfirmReceivePaymentFragment.A09(), BrazilPayBloksActivity.class);
        intent.putExtra("screen_params", c49i.A03(c0n7, null));
        intent.putExtra("screen_name", "brpay_p_card_verified");
        brazilConfirmReceivePaymentFragment.A0i(intent);
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A10();
        }
    }

    @Override // X.InterfaceC896347v
    public void AIH(final C0N7 c0n7) {
        Log.i("PAY: BrazilConfirmReceivePayment BrazilGetVerificationMethods - onCardVerified");
        C03560Ge A01 = this.A00.A0C.A01();
        final PaymentBottomSheet paymentBottomSheet = this.A01;
        A01.A02(c0n7, new C28N() { // from class: X.3iS
            @Override // X.C28N
            public final void AH2(List list) {
                C90894Cv.this.A00(c0n7, paymentBottomSheet);
            }
        });
    }

    @Override // X.InterfaceC896347v
    public void AOD(ArrayList arrayList, C28Q c28q) {
        JSONArray A03;
        Intent A01;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = this.A00;
        brazilConfirmReceivePaymentFragment.A00.A03();
        if (c28q == null && arrayList != null && !arrayList.isEmpty() && (A03 = brazilConfirmReceivePaymentFragment.A06.A03(arrayList)) != null && !C47W.A02(arrayList)) {
            String str = this.A02;
            String obj = A03.toString();
            C0DV c0dv = brazilConfirmReceivePaymentFragment.A0C;
            c0dv.A04();
            C0N7 c0n7 = (C0N7) c0dv.A08.A08(str);
            if (c0n7 != null && (A01 = brazilConfirmReceivePaymentFragment.A0G.A01(brazilConfirmReceivePaymentFragment.A09(), c0n7, obj)) != null) {
                brazilConfirmReceivePaymentFragment.A0i(A01);
            }
            PaymentBottomSheet paymentBottomSheet = this.A01;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A16(false, false);
                return;
            }
            return;
        }
        C000200d.A0q("PAY: BrazilConfirmReceivePayment GetVerificationMethods Error: ", 0);
        brazilConfirmReceivePaymentFragment.A07.A01(((Hilt_BrazilConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A00, 0, R.string.payment_verify_card_error).show();
    }
}
