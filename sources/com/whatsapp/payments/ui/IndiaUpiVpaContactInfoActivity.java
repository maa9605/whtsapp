package com.whatsapp.payments.ui;

import X.C000200d;
import X.C002701i;
import X.C013806p;
import X.C014406v;
import X.C019208x;
import X.C02160Ac;
import X.C0L7;
import X.C0U1;
import X.C28Q;
import X.C2MY;
import X.C40841sx;
import X.C45A;
import X.C463026g;
import X.C4Jh;
import X.C78133jP;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;

/* loaded from: classes3.dex */
public class IndiaUpiVpaContactInfoActivity extends C4Jh implements View.OnClickListener {
    public View A00;
    public LinearLayout A01;
    public C0L7 A02;
    public C45A A03;
    public C2MY A04;
    public C463026g A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final C014406v A0A = C014406v.A00("IndiaUpiVpaContactInfoActivity", "payment-settings", "IN");

    public void A1G() {
        this.A03.A03(this, this.A05, this.A06, true, new C78133jP(this, true));
    }

    public final void A1H(boolean z) {
        this.A09 = z;
        ImageView imageView = (ImageView) findViewById(R.id.block_vpa_icon);
        TextView textView = (TextView) findViewById(R.id.block_vpa_text);
        this.A00.setVisibility(z ? 8 : 0);
        this.A01.setVisibility(z ? 8 : 0);
        if (z) {
            imageView.setColorFilter(C02160Ac.A00(this, R.color.dark_gray));
            textView.setTextColor(C02160Ac.A00(this, R.color.dark_gray));
            textView.setText(R.string.unblock);
            return;
        }
        imageView.setColorFilter(C02160Ac.A00(this, R.color.red_button_text));
        textView.setTextColor(C02160Ac.A00(this, R.color.red_button_text));
        textView.setText(R.string.block);
    }

    public /* synthetic */ void A1I(boolean z, C28Q c28q) {
        if (c28q == null) {
            A1H(z);
        } else if (z) {
            AUj(R.string.block_upi_id_error);
        } else {
            AUl(0, R.string.unblock_payment_id_error_default, getString(R.string.india_upi_payment_id_name));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.new_payment_container) {
            C014406v c014406v = this.A0A;
            StringBuilder A0P = C000200d.A0P("send payment to vpa: ");
            A0P.append(C40841sx.A0Q(this.A06));
            c014406v.A07(null, A0P.toString(), null);
            Intent A01 = this.A04.A01(this, false, true);
            A01.putExtra("extra_payment_handle", this.A06);
            A01.putExtra("extra_payment_handle_id", this.A07);
            A01.putExtra("extra_payee_name", this.A08);
            startActivity(A01);
        } else if (view.getId() != R.id.block_vpa_btn) {
        } else {
            if (this.A09) {
                C014406v c014406v2 = this.A0A;
                StringBuilder A0P2 = C000200d.A0P("unblock vpa: ");
                A0P2.append(C40841sx.A0Q(this.A06));
                c014406v2.A07(null, A0P2.toString(), null);
                this.A03.A03(this, this.A05, this.A06, false, new C78133jP(this, false));
                return;
            }
            C014406v c014406v3 = this.A0A;
            StringBuilder A0P3 = C000200d.A0P("block vpa: ");
            A0P3.append(C40841sx.A0Q(this.A06));
            c014406v3.A07(null, A0P3.toString(), null);
            C002701i.A19(this, 1);
        }
    }

    @Override // X.C4Jh, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_vpa_contact);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A08(R.string.upi_id_info);
        }
        this.A06 = getIntent().getStringExtra("extra_payment_handle");
        this.A07 = getIntent().getStringExtra("extra_payment_handle_id");
        this.A08 = getIntent().getStringExtra("extra_payee_name");
        this.A00 = findViewById(R.id.payment_separator);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.new_payment_container);
        this.A01 = linearLayout;
        linearLayout.setOnClickListener(this);
        ((TextView) findViewById(R.id.account_id_handle)).setText(this.A06);
        ((TextView) findViewById(R.id.vpa_name)).setText(this.A08);
        this.A02.A05((ImageView) findViewById(R.id.avatar), R.drawable.avatar_contact);
        View findViewById = findViewById(R.id.payment_drawable_text);
        findViewById.setContentDescription(getString(R.string.new_payment));
        ((TextView) findViewById).setText(C013806p.A05.A9L(this));
        View findViewById2 = findViewById(R.id.block_vpa_btn);
        findViewById2.setVisibility(0);
        findViewById2.setOnClickListener(this);
        A1H(this.A03.A07(this.A06));
    }

    @Override // android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C019208x c019208x = new C019208x(this);
        c019208x.A01.A0E = getString(R.string.block_upi_id_confirmation, this.A08);
        c019208x.A06(R.string.block, new DialogInterface.OnClickListener() { // from class: X.3QO
            {
                IndiaUpiVpaContactInfoActivity.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IndiaUpiVpaContactInfoActivity.this.A1G();
            }
        });
        c019208x.A04(R.string.cancel, null);
        return c019208x.A00();
    }
}
