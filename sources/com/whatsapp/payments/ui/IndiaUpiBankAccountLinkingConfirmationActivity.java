package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.ActivityC02310Ar;
import X.C000200d;
import X.C014406v;
import X.C0U1;
import X.C41751uS;
import X.C4KG;
import X.C4L4;
import X.View$OnClickListenerC69563Ox;
import X.View$OnClickListenerC69573Oy;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class IndiaUpiBankAccountLinkingConfirmationActivity extends C4L4 {
    public C41751uS A00;
    public boolean A01 = false;

    public /* synthetic */ void lambda$onCreate$66$IndiaUpiBankAccountLinkingConfirmationActivity(View view) {
        finish();
    }

    public void lambda$onCreate$67$IndiaUpiBankAccountLinkingConfirmationActivity(View view) {
        if (this.A01) {
            if (((C4KG) this).A08 == null && ((AbstractActivityC92444Kp) this).A0E == null) {
                int i = ((AbstractActivityC92444Kp) this).A00;
                if (i == 0) {
                    Intent intent = new Intent(this, IndiaUpiContactPicker.class);
                    intent.putExtra("for_payments", true);
                    startActivity(intent);
                } else {
                    C014406v c014406v = ((AbstractActivityC92444Kp) this).A0H;
                    StringBuilder A0P = C000200d.A0P("IndiaUpiBankAccountLinkingConfirmationActivity primary button clicked and not next screen flow found. Default action sent is :");
                    A0P.append(i);
                    c014406v.A04(A0P.toString());
                }
            } else {
                Intent intent2 = new Intent(this, IndiaUpiPaymentActivity.class);
                A1Z(intent2);
                startActivity(intent2);
            }
        }
        finish();
    }

    @Override // X.C4L4, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_account_linking_confirmation);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H(((ActivityC02310Ar) this).A01.A07(R.string.payments_account_linking_confirmation_activity_title));
            A0c.A0L(true);
        }
        if (getIntent() != null && getIntent().hasExtra("isUpiMPinSet")) {
            this.A01 = getIntent().getBooleanExtra("isUpiMPinSet", false);
        }
        ((ImageView) findViewById(R.id.hero_img)).setImageResource(R.drawable.ic_hero_account_linking_confirmation);
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.desc);
        TextView textView3 = (TextView) findViewById(R.id.primary_button);
        TextView textView4 = (TextView) findViewById(R.id.secondary_button);
        if (this.A01) {
            textView.setText(R.string.bankaccount_linking_confirmation_title_text);
            textView2.setVisibility(8);
            textView3.setText(R.string.bankaccount_linking_confirmation_button_text_send_a_payment);
            textView4.setText(R.string.bankaccount_linking_confirmation_button_text_done);
            textView4.setOnClickListener(new View$OnClickListenerC69563Ox(this));
        } else {
            textView.setText(R.string.bankaccount_linking_confirmation_pin_not_set_title_text);
            textView2.setText(R.string.bankaccount_linking_confirmation_pin_not_set_desc_text);
            textView3.setText(R.string.bankaccount_linking_confirmation_button_text_done);
            textView4.setVisibility(4);
        }
        textView3.setOnClickListener(new View$OnClickListenerC69573Oy(this));
        this.A00.A02();
    }
}
