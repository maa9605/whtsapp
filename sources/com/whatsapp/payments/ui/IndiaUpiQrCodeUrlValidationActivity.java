package com.whatsapp.payments.ui;

import X.AnonymousClass483;
import X.C002301c;
import X.C002701i;
import X.C019208x;
import X.C019308y;
import X.C01B;
import X.C2OW;
import X.C4AU;
import X.C4HC;
import X.C4LJ;
import X.C91534Fh;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* loaded from: classes3.dex */
public class IndiaUpiQrCodeUrlValidationActivity extends C4LJ {
    public C01B A00;
    public C002301c A01;
    public AnonymousClass483 A02;
    public C4AU A03;
    public C91534Fh A04;
    public C2OW A05;
    public String A06;

    public /* synthetic */ void A1a() {
        this.A04.A05(1);
    }

    public /* synthetic */ void A1b() {
        this.A04.A05(2);
    }

    public /* synthetic */ void A1c() {
        this.A04.A05(4);
    }

    public /* synthetic */ void A1d() {
        this.A04.A05(3);
    }

    @Override // X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            C002701i.A19(this, 25);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.C4LJ, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04 = (C91534Fh) C002701i.A0J(this, new C4HC(this, getIntent().getStringExtra("ARG_URL"), getIntent().getStringExtra("external_payment_source"))).A00(C91534Fh.class);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        switch (i) {
            case 21:
                C019208x c019208x = new C019208x(this);
                String string = getString(R.string.payment_id_cannot_verify_error_text_default, getString(R.string.india_upi_payment_id_name));
                C019308y c019308y = c019208x.A01;
                c019308y.A0E = string;
                c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3QB
                    {
                        IndiaUpiQrCodeUrlValidationActivity.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        IndiaUpiQrCodeUrlValidationActivity.this.finish();
                    }
                });
                c019308y.A0J = false;
                return c019208x.A00();
            case 22:
                C019208x c019208x2 = new C019208x(this);
                String string2 = getString(R.string.unblock_payment_id_error_default, getString(R.string.india_upi_payment_id_name));
                C019308y c019308y2 = c019208x2.A01;
                c019308y2.A0E = string2;
                c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Q8
                    {
                        IndiaUpiQrCodeUrlValidationActivity.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        IndiaUpiQrCodeUrlValidationActivity.this.finish();
                    }
                });
                c019308y2.A0J = false;
                return c019208x2.A00();
            case 23:
            default:
                return super.onCreateDialog(i);
            case 24:
                C019208x c019208x3 = new C019208x(this);
                c019208x3.A03(R.string.payments_qr_dialog_unsafe_code_warning_title);
                c019208x3.A02(R.string.payments_qr_dialog_unsafe_code_warning);
                c019208x3.A06(R.string.payments_qr_dialog_unsafe_code_cta_continue, new DialogInterface.OnClickListener() { // from class: X.3QC
                    {
                        IndiaUpiQrCodeUrlValidationActivity.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        IndiaUpiQrCodeUrlValidationActivity.this.A1a();
                    }
                });
                c019208x3.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3QA
                    {
                        IndiaUpiQrCodeUrlValidationActivity.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        IndiaUpiQrCodeUrlValidationActivity.this.finish();
                    }
                });
                c019208x3.A01.A0J = true;
                return c019208x3.A00();
            case 25:
                Uri parse = Uri.parse(this.A04.A02().A07);
                C2OW c2ow = this.A05;
                String string3 = getString(R.string.upi_invoice_link_dialog_title);
                if (c2ow != null) {
                    SpannableString spannableString = new SpannableString(C2OW.A00(parse.toString()));
                    Linkify.addLinks(spannableString, 1);
                    C019208x c019208x4 = new C019208x(this, R.style.AlertDialogExternalLink);
                    C019308y c019308y3 = c019208x4.A01;
                    c019308y3.A0I = string3;
                    c019308y3.A0E = spannableString;
                    c019208x4.A04(R.string.payments_send_money, new DialogInterface.OnClickListener() { // from class: X.3Q4
                        {
                            IndiaUpiQrCodeUrlValidationActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiQrCodeUrlValidationActivity.this.A1b();
                        }
                    });
                    c019208x4.A06(R.string.upi_invoice_link_dialog_cta, new DialogInterface.OnClickListener() { // from class: X.3Q7
                        {
                            IndiaUpiQrCodeUrlValidationActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IndiaUpiQrCodeUrlValidationActivity.this.A1c();
                        }
                    });
                    c019308y3.A0J = true;
                    c019308y3.A07 = new DialogInterface.OnDismissListener() { // from class: X.3Q9
                        {
                            IndiaUpiQrCodeUrlValidationActivity.this = this;
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            IndiaUpiQrCodeUrlValidationActivity.this.A1d();
                        }
                    };
                    return c019208x4.A00();
                }
                throw null;
            case 26:
                C019208x c019208x5 = new C019208x(this);
                String string4 = getString(R.string.payments_qr_dialog_payment_from_non_verified_merchant_exceeded_limit, this.A06);
                C019308y c019308y4 = c019208x5.A01;
                c019308y4.A0E = string4;
                c019208x5.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Q6
                    {
                        IndiaUpiQrCodeUrlValidationActivity.this = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        IndiaUpiQrCodeUrlValidationActivity.this.finish();
                    }
                });
                c019308y4.A0J = false;
                return c019208x5.A00();
        }
    }
}
