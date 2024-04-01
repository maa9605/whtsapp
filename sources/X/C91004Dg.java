package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.4Dg */
/* loaded from: classes3.dex */
public class C91004Dg implements C49J {
    public final /* synthetic */ InterfaceC013706o A00;
    public final /* synthetic */ C014006r A01;
    public final /* synthetic */ IndiaUpiPaymentActivity A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    @Override // X.C49J
    public Integer A8z() {
        return null;
    }

    @Override // X.C49J
    public String A9t(C0N2 c0n2, int i) {
        return null;
    }

    @Override // X.C49J
    public boolean AF8(C0N2 c0n2) {
        return true;
    }

    @Override // X.C49J
    public boolean AUO(C0N2 c0n2, int i) {
        return false;
    }

    @Override // X.C49J
    public boolean AUR(C0N2 c0n2) {
        return true;
    }

    @Override // X.C49J
    public boolean AUS() {
        return false;
    }

    @Override // X.C49J
    public boolean AUT() {
        return false;
    }

    @Override // X.C49J
    public void AUe(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
    }

    public C91004Dg(IndiaUpiPaymentActivity indiaUpiPaymentActivity, PaymentBottomSheet paymentBottomSheet, InterfaceC013706o interfaceC013706o, C014006r c014006r) {
        this.A02 = indiaUpiPaymentActivity;
        this.A03 = paymentBottomSheet;
        this.A00 = interfaceC013706o;
        this.A01 = c014006r;
    }

    @Override // X.C49J
    public void A5Z(ViewGroup viewGroup) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A02;
        ((TextView) C0AT.A0D(indiaUpiPaymentActivity.getLayoutInflater().inflate(R.layout.confirm_payment_total_amount_row, viewGroup, true), R.id.amount)).setText(this.A00.A81(indiaUpiPaymentActivity.A08, this.A01));
    }

    @Override // X.C49J
    public String A90(C0N2 c0n2, int i) {
        C4IA c4ia = (C4IA) c0n2.A06;
        if (c4ia != null && !c4ia.A0G) {
            return this.A02.getString(R.string.upi_pin_setup_education_button_text);
        }
        return this.A02.getString(R.string.payments_send_payment_text);
    }

    @Override // X.C49J
    public String A9a(C002301c c002301c, C0N2 c0n2) {
        return this.A02.getString(R.string.payments_send_payment_using);
    }

    @Override // X.C49J
    public String A9b(C0N2 c0n2) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A02;
        return C40841sx.A0H(((AbstractActivityC92484Li) indiaUpiPaymentActivity).A0C, indiaUpiPaymentActivity.A08, c0n2, false);
    }

    @Override // X.C49J
    public String ABK(C0N2 c0n2) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A02;
        String A05 = ((AbstractActivityC92484Li) indiaUpiPaymentActivity).A05.A05();
        if (TextUtils.isEmpty(A05)) {
            return null;
        }
        return indiaUpiPaymentActivity.getString(R.string.india_upi_payment_id_with_upi_label, A05);
    }

    @Override // X.C49J
    public void AHN(C002301c c002301c, ViewGroup viewGroup) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A02;
        View inflate = indiaUpiPaymentActivity.getLayoutInflater().inflate(R.layout.confirm_dialog_title, viewGroup, true);
        ((TextView) C0AT.A0D(inflate, R.id.text)).setText(indiaUpiPaymentActivity.getString(R.string.confirm_payment_bottom_sheet_default_title));
        ImageView imageView = (ImageView) C0AT.A0D(inflate, R.id.icon);
        imageView.setImageResource(R.drawable.ic_close);
        imageView.setOnClickListener(new C3PM(this.A03));
    }

    @Override // X.C49J
    public void AHO(C002301c c002301c, ViewGroup viewGroup) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A02;
        View inflate = indiaUpiPaymentActivity.getLayoutInflater().inflate(R.layout.india_upi_confirm_payment_recipient_row, viewGroup, true);
        ImageView imageView = (ImageView) C0AT.A0D(inflate, R.id.payment_recipient_profile_pic);
        TextView textView = (TextView) C0AT.A0D(inflate, R.id.payment_recipient_name);
        TextView textView2 = (TextView) C0AT.A0D(inflate, R.id.payment_recipient_vpa);
        C06C c06c = indiaUpiPaymentActivity.A0C;
        if (c06c != null) {
            indiaUpiPaymentActivity.A04.A02(c06c, imageView);
            C06C c06c2 = indiaUpiPaymentActivity.A0C;
            textView.setText(c06c2 == null ? ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E : indiaUpiPaymentActivity.A03.A08(c06c2, false));
            textView2.setText(indiaUpiPaymentActivity.getString(R.string.india_upi_payment_id_with_upi_label, ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E));
            return;
        }
        indiaUpiPaymentActivity.A01.A05(imageView, R.drawable.avatar_contact);
        textView.setText(((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0A);
        textView2.setText(indiaUpiPaymentActivity.getString(R.string.india_upi_payment_id_with_upi_label, ((AbstractActivityC92444Kp) indiaUpiPaymentActivity).A0E));
    }

    @Override // X.C49J
    public void AKZ(C002301c c002301c, ViewGroup viewGroup, C0N2 c0n2) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A02;
        View inflate = indiaUpiPaymentActivity.getLayoutInflater().inflate(R.layout.india_upi_confirm_payment_footer_row, viewGroup, true);
        ((ImageView) C0AT.A0D(inflate, R.id.footer_img_right)).setImageResource(C40841sx.A0A(((AbstractActivityC92484Li) indiaUpiPaymentActivity).A05.A03()).A00);
        ((ImageView) C0AT.A0D(inflate, R.id.footer_img_left)).setImageResource(R.drawable.powered_by_upi);
    }
}
