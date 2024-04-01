package X;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentBankSetupActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* renamed from: X.4Di  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91024Di implements C49X {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    @Override // X.C49X
    public List A7o(List list) {
        return null;
    }

    @Override // X.C49X
    public String ABJ(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49X
    public String ABL(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49X
    public View ACC(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // X.C49X
    public boolean AUQ() {
        return true;
    }

    @Override // X.C49X
    public boolean AUT() {
        return false;
    }

    @Override // X.C49X
    public boolean AUU() {
        return true;
    }

    @Override // X.C49X
    public boolean AUV() {
        return false;
    }

    @Override // X.C49X
    public void AUe(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
    }

    public C91024Di(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    @Override // X.C49X
    public int ABI(C0N2 c0n2) {
        if (c0n2.equals(this.A00.A0G)) {
            return R.drawable.countrypicker_checkmark;
        }
        return 0;
    }

    @Override // X.C49X
    public String ABM(C0N2 c0n2) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        return C40841sx.A0H(((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0C, indiaUpiPaymentActivity.A08, c0n2, false);
    }

    @Override // X.C49X
    public void AGx() {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        Intent intent = new Intent(indiaUpiPaymentActivity, IndiaUpiPaymentBankSetupActivity.class);
        intent.putExtra("extra_bank_account_link_completed_send_payment_default_action", 1);
        indiaUpiPaymentActivity.startActivityForResult(intent, 1008);
    }
}
