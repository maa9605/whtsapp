package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.4Hu */
/* loaded from: classes3.dex */
public class View$OnClickListenerC92174Hu extends C4FO implements View.OnClickListener {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public C01B A04;
    public C4A6 A05;
    public boolean A06;

    public View$OnClickListenerC92174Hu(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.india_upi_pin_widget, this);
        int A00 = C02160Ac.A00(context, R.color.settings_icon);
        C02180Ae.A17((ImageView) findViewById(R.id.change_icon), A00);
        C02180Ae.A17((ImageView) findViewById(R.id.reset_icon), A00);
        C02180Ae.A17((ImageView) findViewById(R.id.check_balance_icon), A00);
        C02180Ae.A17((ImageView) findViewById(R.id.switch_payment_provider_icon), A00);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.reset_upi_pin_container) {
            C4A6 c4a6 = this.A05;
            boolean z = this.A06;
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) c4a6;
            if (indiaUpiBankAccountDetailsActivity != null) {
                Intent intent = new Intent(indiaUpiBankAccountDetailsActivity, IndiaUpiResetPinActivity.class);
                intent.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity.A01);
                if (!z) {
                    intent.putExtra("extra_set_pin_education_type", 1);
                    indiaUpiBankAccountDetailsActivity.startActivityForResult(intent, 1012);
                    return;
                }
                intent.putExtra("extra_set_pin_education_type", 2);
                indiaUpiBankAccountDetailsActivity.startActivity(intent);
                return;
            }
            throw null;
        } else if (view.getId() == R.id.change_upi_pin_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = (IndiaUpiBankAccountDetailsActivity) this.A05;
            if (indiaUpiBankAccountDetailsActivity2 != null) {
                Intent intent2 = new Intent(indiaUpiBankAccountDetailsActivity2, IndiaUpiChangePinActivity.class);
                intent2.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity2.A01);
                indiaUpiBankAccountDetailsActivity2.startActivity(intent2);
                return;
            }
            throw null;
        } else if (view.getId() == R.id.check_balance_container) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity3 = (IndiaUpiBankAccountDetailsActivity) this.A05;
            C0N6 c0n6 = indiaUpiBankAccountDetailsActivity3.A01;
            Intent intent3 = new Intent(indiaUpiBankAccountDetailsActivity3, IndiaUpiCheckBalanceActivity.class);
            intent3.putExtra("payment_bank_account", c0n6);
            indiaUpiBankAccountDetailsActivity3.startActivity(intent3);
        } else if (view.getId() != R.id.switch_payment_provider_container) {
        } else {
            Activity activity = (Activity) this.A05;
            if (activity != null) {
                C002701i.A19(activity, 100);
                return;
            }
            throw null;
        }
    }
}
