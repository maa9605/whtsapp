package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.4EC  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4EC extends C49W {
    public C4EB A00;

    public C4EC(Context context, C002301c c002301c, C0DV c0dv, C4EB c4eb) {
        super(context, c002301c, c0dv);
        this.A00 = c4eb;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        PaymentMethodRow paymentMethodRow;
        if (view == null) {
            paymentMethodRow = new PaymentMethodRow(getContext());
        } else {
            paymentMethodRow = (PaymentMethodRow) view;
        }
        C0N2 c0n2 = (C0N2) super.A00.get(i);
        if (c0n2 != null) {
            String ABM = this.A00.ABM(c0n2);
            C4EB c4eb = this.A00;
            if (c4eb.AUT()) {
                c4eb.AUe(c0n2, paymentMethodRow);
            } else {
                C40841sx.A0b(paymentMethodRow, c0n2);
            }
            if (TextUtils.isEmpty(ABM)) {
                ABM = C40841sx.A0G(this.A02, this.A01, c0n2);
            }
            paymentMethodRow.A04.setText(ABM);
            paymentMethodRow.A01(this.A00.ABL(c0n2));
            String ABJ = this.A00.ABJ(c0n2);
            if (!TextUtils.isEmpty(ABJ)) {
                paymentMethodRow.A02.setText(ABJ);
                paymentMethodRow.A02.setVisibility(0);
            } else {
                paymentMethodRow.A02.setVisibility(8);
            }
            int ABI = this.A00.ABI(c0n2);
            if (ABI == 0) {
                paymentMethodRow.A07.setVisibility(8);
            } else {
                paymentMethodRow.A07.setImageResource(ABI);
                paymentMethodRow.A07.setVisibility(0);
                return paymentMethodRow;
            }
        }
        return paymentMethodRow;
    }
}
