package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentTypePickerFragment;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import com.whatsapp.payments.ui.PaymentRailPickerFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4D2  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4D2 implements C49K {
    public final /* synthetic */ C014006r A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ ConfirmPaymentFragment A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    @Override // X.C49K
    public void AMq(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
    }

    public C4D2(BrazilPaymentActivity brazilPaymentActivity, PaymentBottomSheet paymentBottomSheet, C014006r c014006r, ConfirmPaymentFragment confirmPaymentFragment) {
        this.A01 = brazilPaymentActivity;
        this.A03 = paymentBottomSheet;
        this.A00 = c014006r;
        this.A02 = confirmPaymentFragment;
    }

    public void A00(C0TN c0tn) {
        C0DV c0dv = ((C4KG) this.A01).A0F;
        c0dv.A04();
        c0dv.A08.A0H(c0tn);
    }

    public void A01(ConfirmPaymentFragment confirmPaymentFragment, final int i, PaymentBottomSheet paymentBottomSheet, List list) {
        if (list != null) {
            PaymentMethodsListPickerFragment A00 = PaymentMethodsListPickerFragment.A00(list);
            A00.A0S(confirmPaymentFragment, 0);
            A00.A07 = new C4EE() { // from class: X.4HA
                @Override // X.C49X
                public boolean AUT() {
                    return true;
                }

                @Override // X.C49X
                public void AGx() {
                    BrazilPaymentActivity brazilPaymentActivity = C4D2.this.A01;
                    String A02 = brazilPaymentActivity.A0N.A02(true);
                    Intent intent = new Intent(brazilPaymentActivity, BrazilPayBloksActivity.class);
                    if (A02 == null) {
                        A02 = "brpay_p_add_card";
                    }
                    intent.putExtra("screen_name", A02);
                    C47V.A00(intent, "payment_method_picker");
                    if (i == 1) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("add_debit_only", "1");
                        intent.putExtra("screen_params", hashMap);
                    }
                    brazilPaymentActivity.startActivity(intent);
                }

                @Override // X.C49X
                public void AUe(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
                    if (C40841sx.A0f(c0n2)) {
                        C4D2.this.A01.A0M.A03(c0n2, paymentMethodRow);
                    }
                }
            };
            paymentBottomSheet.A19(A00);
            return;
        }
        throw null;
    }

    @Override // X.C49K
    public void AIt(View view, View view2, C0N2 c0n2, C0TN c0tn, PaymentBottomSheet paymentBottomSheet) {
        if (c0tn != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A01;
            int A05 = c0tn.A05();
            if (BrazilPaymentActivity.A05(brazilPaymentActivity, c0n2, A05)) {
                if (paymentBottomSheet != null) {
                    brazilPaymentActivity.A01.A01.A03(new C77783il(this, this.A02, A05, paymentBottomSheet), null);
                    return;
                }
                return;
            }
            ((C4KG) brazilPaymentActivity).A0K.AS1(new C3O7(this, c0tn));
        }
        C0N0 c0n0 = c0n2.A06;
        if (c0n0 != null) {
            if (((C0N8) c0n0).A0X) {
                BrazilPaymentActivity brazilPaymentActivity2 = this.A01;
                ((C4KG) brazilPaymentActivity2).A0F.A01().A02(c0n2, null);
                boolean z = false;
                this.A03.A16(false, false);
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 23 && brazilPaymentActivity2.A0K.A05() && brazilPaymentActivity2.A0K.A01() == 1) {
                    C014006r c014006r = this.A00;
                    String obj = c014006r.toString();
                    z2 = (c0tn != null && c0tn.A0E() && c0tn.A05() == 0) ? false : false;
                    FingerprintBottomSheet A00 = FingerprintBottomSheet.A00(R.string.payment_bio_bottom_sheet_title, R.string.cancel, R.string.use_payments_pin, R.layout.pay_header);
                    C466327p c466327p = new C466327p(c014006r.A00.scaleByPowerOfTen(3).intValue(), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, C013806p.A04);
                    AnonymousClass012 anonymousClass012 = ((C4KG) brazilPaymentActivity2).A05;
                    C018508q c018508q = ((ActivityC02290Ap) brazilPaymentActivity2).A0A;
                    C02L c02l = ((C4KG) brazilPaymentActivity2).A02;
                    InterfaceC002901k interfaceC002901k = ((C4KG) brazilPaymentActivity2).A0K;
                    C895947p c895947p = ((C4KG) brazilPaymentActivity2).A0G;
                    C0DV c0dv = ((C4KG) brazilPaymentActivity2).A0F;
                    C49682Lx c49682Lx = brazilPaymentActivity2.A0R;
                    C0E7 c0e7 = ((ActivityC02290Ap) brazilPaymentActivity2).A0D;
                    AnonymousClass499 anonymousClass499 = brazilPaymentActivity2.A0L;
                    C463026g c463026g = ((C4KG) brazilPaymentActivity2).A0C;
                    C28S c28s = brazilPaymentActivity2.A0E;
                    AnonymousClass493 anonymousClass493 = brazilPaymentActivity2.A0K;
                    C899048w c899048w = brazilPaymentActivity2.A0I;
                    String str = c0n2.A07;
                    UserJid userJid = ((C4KG) brazilPaymentActivity2).A0A;
                    if (userJid != null) {
                        A00.A04 = new C4H5(((C4KG) brazilPaymentActivity2).A05, brazilPaymentActivity2.A0L, brazilPaymentActivity2, new C90634Bu(anonymousClass012, brazilPaymentActivity2, c018508q, c02l, interfaceC002901k, c895947p, c0dv, c49682Lx, c0e7, anonymousClass499, c463026g, c28s, anonymousClass493, c899048w, str, userJid, c466327p, c466327p, z2 ? "p2m" : "p2p", BrazilPaymentActivity.A00(z2, c0n2)), A00, new C4D7(brazilPaymentActivity2, c0n2, c014006r, obj, z2, A00));
                        brazilPaymentActivity2.AUh(A00);
                        return;
                    }
                    throw null;
                }
                C014006r c014006r2 = this.A00;
                String obj2 = c014006r2.toString();
                if (c0tn != null && c0tn.A0E() && c0tn.A05() == 0) {
                    z = true;
                }
                BrazilPaymentActivity.A02(brazilPaymentActivity2, c0n2, c014006r2, obj2, z);
                return;
            }
            BrazilPaymentActivity brazilPaymentActivity3 = this.A01;
            String str2 = c0n2.A07;
            brazilPaymentActivity3.A12(R.string.payment_get_verify_card_data);
            new C896447w(((C4KG) brazilPaymentActivity3).A05, brazilPaymentActivity3, ((ActivityC02290Ap) brazilPaymentActivity3).A0A, ((C4KG) brazilPaymentActivity3).A02, brazilPaymentActivity3.A0R, ((C4KG) brazilPaymentActivity3).A0F, ((ActivityC02290Ap) brazilPaymentActivity3).A0D, ((C4KG) brazilPaymentActivity3).A0C, brazilPaymentActivity3.A0J, brazilPaymentActivity3.A07, brazilPaymentActivity3.A0C, brazilPaymentActivity3.A0E, str2).A01(new C4D4(brazilPaymentActivity3, str2));
            return;
        }
        throw null;
    }

    @Override // X.C49K
    public void AMo(PaymentBottomSheet paymentBottomSheet, int i) {
        C0CI c0ci = this.A01.A01;
        c0ci.A01.A03(new C77783il(this, this.A02, i, paymentBottomSheet), null);
    }

    @Override // X.C49K
    public void AMr(int i, PaymentBottomSheet paymentBottomSheet) {
        PaymentRailPickerFragment paymentRailPickerFragment = new PaymentRailPickerFragment();
        Bundle bundle = new Bundle();
        if (i != 0) {
            bundle.putString("arg_type", "debit");
        } else {
            bundle.putString("arg_type", "credit");
        }
        paymentRailPickerFragment.A0P(bundle);
        paymentRailPickerFragment.A0S(this.A02, 0);
        paymentBottomSheet.A19(paymentRailPickerFragment);
    }

    @Override // X.C49K
    public void AMv(int i, PaymentBottomSheet paymentBottomSheet) {
        Bundle bundle = new Bundle();
        if (i != 0) {
            bundle.putString("arg_type", "friendsAndFamily");
        } else {
            bundle.putString("arg_type", "goodAndServices");
        }
        BrazilPaymentTypePickerFragment brazilPaymentTypePickerFragment = new BrazilPaymentTypePickerFragment();
        brazilPaymentTypePickerFragment.A0P(bundle);
        brazilPaymentTypePickerFragment.A0S(this.A02, 0);
        paymentBottomSheet.A19(brazilPaymentTypePickerFragment);
    }
}
