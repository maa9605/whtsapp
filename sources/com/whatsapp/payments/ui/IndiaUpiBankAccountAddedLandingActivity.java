package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.C0AT;
import X.C0N0;
import X.C0N5;
import X.C0N6;
import X.C0U1;
import X.C40841sx;
import X.C41751uS;
import X.C4IA;
import X.C4KG;
import X.C4L3;
import X.View$OnClickListenerC69463On;
import X.View$OnClickListenerC69473Oo;
import X.View$OnClickListenerC69483Op;
import X.View$OnClickListenerC69493Oq;
import X.View$OnClickListenerC69503Or;
import X.View$OnClickListenerC69513Os;
import X.View$OnClickListenerC69523Ot;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class IndiaUpiBankAccountAddedLandingActivity extends C4L3 {
    public C41751uS A00;

    public void lambda$onCreate$114$IndiaUpiBankAccountAddedLandingActivity(View view) {
        Intent intent = new Intent(this, IndiaUpiContactPicker.class);
        intent.putExtra("for_payments", true);
        startActivity(intent);
        finish();
    }

    public /* synthetic */ void lambda$onCreate$115$IndiaUpiBankAccountAddedLandingActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$116$IndiaUpiBankAccountAddedLandingActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$117$IndiaUpiBankAccountAddedLandingActivity(View view) {
        finish();
    }

    public /* synthetic */ void lambda$onCreate$118$IndiaUpiBankAccountAddedLandingActivity(View view) {
        if (((C4KG) this).A08 == null && ((AbstractActivityC92444Kp) this).A0E == null) {
            return;
        }
        Intent intent = new Intent(this, IndiaUpiPaymentActivity.class);
        A1Z(intent);
        startActivity(intent);
    }

    public void lambda$onCreate$119$IndiaUpiBankAccountAddedLandingActivity(View view) {
        if (((C4KG) this).A08 != null || ((AbstractActivityC92444Kp) this).A0E != null) {
            finish();
            return;
        }
        Intent intent = new Intent(this, IndiaUpiContactPicker.class);
        intent.putExtra("for_payments", true);
        startActivity(intent);
        finish();
    }

    public /* synthetic */ void lambda$onCreate$120$IndiaUpiBankAccountAddedLandingActivity(View view) {
        finish();
    }

    @Override // X.C4L3, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0N0 c0n0;
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_account_added_landing);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H(getString(R.string.payments_account_linking_confirmation_activity_title_v2));
            A0c.A0L(true);
        }
        ImageView imageView = (ImageView) findViewById(R.id.hero_img);
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.desc);
        TextView textView3 = (TextView) findViewById(R.id.primary_button);
        TextView textView4 = (TextView) findViewById(R.id.secondary_button);
        C0N6 c0n6 = ((AbstractActivityC92444Kp) this).A03;
        if (c0n6 != null && (c0n0 = c0n6.A06) != null) {
            C4IA c4ia = (C4IA) c0n0;
            boolean z = c4ia.A0G;
            int i = ((AbstractActivityC92444Kp) this).A01;
            if (i == 1) {
                int i2 = R.drawable.ic_hero_account_added_landing;
                if (z) {
                    i2 = R.drawable.ic_hero_account_added_landing_mpin;
                }
                imageView.setImageResource(i2);
                int i3 = R.string.bankaccount_linking_confirmation_title_first_account_without_mpin;
                if (z) {
                    i3 = R.string.bankaccount_linking_confirmation_title_first_account_with_mpin;
                }
                textView.setText(getString(i3));
                textView2.setText(getString(R.string.bankaccount_linking_confirmation_desc_first_account));
                textView3.setText(getString(R.string.bankaccount_linking_confirmation_button_text_done));
                textView4.setText(getString(R.string.bankaccount_linking_confirmation_button_text_send_a_payment));
                textView3.setOnClickListener(new View$OnClickListenerC69523Ot(this));
                textView4.setOnClickListener(new View$OnClickListenerC69463On(this));
            } else if (i == 2) {
                int i4 = R.drawable.ic_hero_account_added_landing;
                if (z) {
                    i4 = R.drawable.ic_hero_account_added_landing_mpin;
                }
                imageView.setImageResource(i4);
                int i5 = R.string.bankaccount_linking_confirmation_title_first_account_without_mpin;
                if (z) {
                    i5 = R.string.bankaccount_linking_confirmation_title_first_account_with_mpin;
                }
                textView.setText(getString(i5));
                textView2.setText(getString(R.string.bankaccount_linking_confirmation_desc_first_account));
                textView3.setText(getString(R.string.btn_continue));
                textView4.setVisibility(8);
                textView3.setOnClickListener(new View$OnClickListenerC69493Oq(this));
            } else if (i == 3) {
                int i6 = R.drawable.ic_hero_account_added_landing;
                if (z) {
                    i6 = R.drawable.ic_hero_account_added_landing_mpin;
                }
                imageView.setImageResource(i6);
                int i7 = R.string.bankaccount_linking_confirmation_title_first_account_without_mpin;
                if (z) {
                    i7 = R.string.bankaccount_linking_confirmation_title_first_account_with_mpin;
                }
                textView.setText(getString(i7));
                textView2.setText(getString(R.string.bankaccount_linking_confirmation_desc_first_account));
                textView3.setText(getString(R.string.bankaccount_linking_confirmation_button_text_send_a_payment));
                textView4.setText(getString(R.string.bankaccount_linking_confirmation_button_text_done));
                textView3.setOnClickListener(new View$OnClickListenerC69513Os(this));
                textView4.setOnClickListener(new View$OnClickListenerC69473Oo(this));
            } else if (i == 4) {
                imageView.setImageResource(R.drawable.ic_hero_bank_added);
                textView.setText(getString(R.string.bankaccount_linking_confirmation_title_other_account_added));
                int i8 = R.string.bankaccount_linking_confirmation_desc_other_account_without_mpin;
                if (z) {
                    i8 = R.string.bankaccount_linking_confirmation_desc_other_account_with_mpin;
                }
                textView2.setText(getString(i8));
                textView3.setText(getString(R.string.bankaccount_linking_confirmation_button_text_done));
                textView4.setVisibility(8);
                textView3.setOnClickListener(new View$OnClickListenerC69503Or(this));
            } else if (i == 5) {
                imageView.setImageResource(R.drawable.ic_hero_bank_added);
                textView.setText(getString(R.string.bankaccount_linking_confirmation_title_other_account_added));
                int i9 = R.string.bankaccount_linking_confirmation_desc_other_account_without_mpin;
                if (z) {
                    i9 = R.string.bankaccount_linking_confirmation_desc_other_account_with_mpin;
                }
                textView2.setText(getString(i9));
                textView3.setText(getString(R.string.bankaccount_linking_confirmation_button_text_done));
                textView4.setVisibility(8);
                textView3.setOnClickListener(new View$OnClickListenerC69483Op(this));
            }
            View findViewById = findViewById(R.id.account_layout);
            C0AT.A0D(findViewById, R.id.progress).setVisibility(8);
            Bitmap A04 = ((AbstractActivityC92444Kp) this).A03.A04();
            ImageView imageView2 = (ImageView) C0AT.A0D(findViewById, R.id.provider_icon);
            if (A04 != null) {
                imageView2.setImageBitmap(A04);
            } else {
                imageView2.setImageResource(R.drawable.av_bank);
            }
            ((TextView) C0AT.A0D(findViewById, R.id.account_number)).setText(C40841sx.A0R(((C0N5) c4ia).A05, C40841sx.A0M(((C0N5) c4ia).A06)));
            ((TextView) C0AT.A0D(findViewById, R.id.account_name)).setText(c4ia.A06);
        }
        this.A00.A02();
    }
}
