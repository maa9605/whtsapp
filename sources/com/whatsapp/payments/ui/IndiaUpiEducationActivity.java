package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.C000200d;
import X.C014406v;
import X.C0N6;
import X.C0U1;
import X.C2Lw;
import X.C37081lq;
import X.C37091lr;
import X.C37311mD;
import X.C3PH;
import X.C3PI;
import X.C40841sx;
import X.C4CV;
import X.C4CW;
import X.C4LB;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class IndiaUpiEducationActivity extends C4LB {
    public int A00;
    public int A01;
    public int A02;
    public C4CV A03;
    public C4CW A04;
    public final C014406v A05 = C014406v.A00("IndiaUpiEducationActivity", "onboarding", "IN");

    public void A1a(C0N6 c0n6) {
        int i = this.A00;
        if (i == 1) {
            setResult(-1);
            finish();
            if (this.A02 != 2) {
                C4CV c4cv = this.A03;
                C2Lw c2Lw = c4cv.A03;
                String str = c2Lw.A02;
                if (str == null) {
                    str = c2Lw.A02();
                }
                C37081lq c37081lq = new C37081lq();
                c37081lq.A02 = c4cv.A00;
                c37081lq.A03 = str;
                c37081lq.A01 = Boolean.TRUE;
                ((AbstractActivityC92444Kp) this).A04.A0B(c37081lq, null, false);
                A1b(5);
            }
        } else if (i == 0) {
            Intent intent = new Intent(this, IndiaUpiDebitCardVerifActivity.class);
            intent.putExtra("extra_bank_account", c0n6);
            startActivityForResult(intent, 1013);
            C4CV c4cv2 = this.A03;
            C2Lw c2Lw2 = c4cv2.A03;
            String str2 = c2Lw2.A02;
            if (str2 == null) {
                str2 = c2Lw2.A02();
            }
            C37091lr c37091lr = new C37091lr();
            c37091lr.A02 = c4cv2.A00;
            c37091lr.A03 = str2;
            c37091lr.A01 = Boolean.TRUE;
            ((AbstractActivityC92444Kp) this).A04.A0B(c37091lr, null, false);
        } else {
            C014406v c014406v = this.A05;
            StringBuilder A0P = C000200d.A0P("unsupported education type ");
            A0P.append(i);
            c014406v.A03(A0P.toString());
        }
    }

    public final void A1b(Integer num) {
        C37311mD A00 = this.A04.A00();
        A00.A04 = num;
        A00.A05 = 1;
        A00.A0P = "setup_upi_pin";
        ((AbstractActivityC92444Kp) this).A04.A0B(A00, null, false);
    }

    public /* synthetic */ void lambda$onCreate$134$IndiaUpiEducationActivity(View view) {
        setResult(100);
        finish();
    }

    @Override // X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.A05.A07(null, C000200d.A0F("got result for activity: ", i, " result:", i2), null);
        super.onActivityResult(i, i2, intent);
        if (i == 1013 && i2 == 101) {
            Intent intent2 = getIntent();
            intent2.putExtras(intent);
            setResult(101, intent2);
            finish();
        }
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        int i = this.A00;
        if (i == 1 && this.A02 != 2) {
            C4CV c4cv = this.A03;
            C2Lw c2Lw = c4cv.A03;
            String str = c2Lw.A02;
            if (str == null) {
                str = c2Lw.A02();
            }
            C37081lq c37081lq = new C37081lq();
            c37081lq.A02 = c4cv.A00;
            c37081lq.A03 = str;
            c37081lq.A00 = Boolean.TRUE;
            ((AbstractActivityC92444Kp) this).A04.A0B(c37081lq, null, false);
            A1b(1);
        } else if (i != 0) {
        } else {
            C4CV c4cv2 = this.A03;
            C2Lw c2Lw2 = c4cv2.A03;
            String str2 = c2Lw2.A02;
            if (str2 == null) {
                str2 = c2Lw2.A02();
            }
            C37091lr c37091lr = new C37091lr();
            c37091lr.A02 = c4cv2.A00;
            c37091lr.A03 = str2;
            c37091lr.A00 = Boolean.TRUE;
            ((AbstractActivityC92444Kp) this).A04.A0B(c37091lr, null, false);
        }
    }

    @Override // X.C4LB, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        int i;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.payment_education);
        this.A00 = getIntent().getIntExtra("extra_education_type", 0);
        this.A02 = getIntent().getIntExtra("extra_use_pin_education_type", -1);
        this.A01 = getIntent().getIntExtra("extra_set_pin_education_type", -1);
        C0N6 c0n6 = (C0N6) getIntent().getParcelableExtra("extra_bank_account");
        if (this.A00 == 1) {
            String stringExtra = getIntent().getStringExtra("extra_bank_account");
            if (this.A02 == 2) {
                string = getString(R.string.upi_pin_entry_education_activity_title_text);
                str = getString(R.string.upi_pin_entry_education_title_text);
                string2 = getString(R.string.upi_pin_entry_education_desc_text, stringExtra);
                string3 = getString(R.string.upi_pin_entry_education_button_text);
                TextView textView = (TextView) findViewById(R.id.extra_desc);
                textView.setText(R.string.upi_pin_entry_education_cta_text);
                textView.setVisibility(0);
                textView.setOnClickListener(new C3PI(this));
            } else {
                string = getString(R.string.upi_pin_setup_education_title_text);
                str = getString(R.string.upi_pin_setup_education_title_text);
                string2 = getString(R.string.upi_pin_setup_education_desc_text, stringExtra);
                string3 = getString(R.string.upi_pin_setup_education_button_text);
            }
            i = R.drawable.ic_hero_pin;
        } else {
            String A0M = C40841sx.A0M(c0n6.A0A);
            string = getString(R.string.payments_verify_debit_card_activity_title);
            int i2 = this.A01;
            if (i2 == 1) {
                string2 = getString(R.string.payments_verify_debit_card_education_activity_set_desc, A0M);
            } else if (i2 == 2) {
                string2 = getString(R.string.payments_verify_debit_card_education_activity_reset_desc, A0M);
            } else {
                string2 = getString(R.string.payments_verify_debit_card_education_activity_desc, A0M);
            }
            string3 = getString(R.string.btn_continue);
            i = R.drawable.ic_hero_card;
            str = string;
        }
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H(string);
            A0c.A0L(true);
        }
        ((ImageView) findViewById(R.id.education_activity_image)).setImageResource(i);
        ((TextView) findViewById(R.id.education_activity_title)).setText(str);
        ((TextView) findViewById(R.id.education_activity_desc)).setText(string2);
        TextView textView2 = (TextView) findViewById(R.id.education_main_button);
        textView2.setText(string3);
        textView2.setOnClickListener(new C3PH(this, c0n6));
    }
}
