package com.whatsapp.payments.ui;

import X.AbstractC91274Eh;
import X.AnonymousClass093;
import X.C000200d;
import X.C014406v;
import X.C019208x;
import X.C02180Ae;
import X.C0BA;
import X.C0TS;
import X.C2OW;
import X.C4FB;
import X.C4FI;
import X.C4HH;
import X.C4HI;
import X.C4HK;
import X.C4LF;
import X.C901249t;
import X.C901649x;
import X.C92084Hl;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class IndiaUpiPaymentTransactionDetailsActivity extends C4LF {
    public C92084Hl A00;
    public C901249t A01;
    public C2OW A02;
    public final C014406v A03 = C014406v.A00("IndiaUpiPaymentTransactionDetailsActivity", "payment-settings", "IN");

    @Override // X.ActivityC02290Ap, X.ActivityC02330At
    public void A0W(C0BA c0ba) {
        super.A0W(c0ba);
        if (c0ba instanceof ProgressDialogFragment) {
            ((ProgressDialogFragment) c0ba).A00 = new DialogInterface.OnKeyListener() { // from class: X.3Ps
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = IndiaUpiPaymentTransactionDetailsActivity.this;
                    if (i == 4) {
                        dialogInterface.dismiss();
                        indiaUpiPaymentTransactionDetailsActivity.finish();
                        return true;
                    }
                    return false;
                }
            };
        }
    }

    @Override // com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity, X.C4KM
    public C0TS A1P(ViewGroup viewGroup, int i) {
        if (i == 1000) {
            final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_payment_detail_footer_banner, viewGroup, false);
            return new AbstractC91274Eh(inflate) { // from class: X.4HJ
            };
        } else if (i == 1001) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_localization_failed, viewGroup, false);
            C02180Ae.A17((ImageView) inflate2.findViewById(R.id.payment_empty_icon), viewGroup.getContext().getResources().getColor(R.color.icon_color_disabled));
            return new C4HK(inflate2);
        } else if (i != 1004) {
            if (i != 1005) {
                return super.A1P(viewGroup, i);
            }
            return new C4HI(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_mandate_transaction_detail_pending_update_banner, viewGroup, false));
        } else {
            return new C4HH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_payment_amount_header_view_component, viewGroup, false));
        }
    }

    @Override // com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity
    public void A1Q(C901649x c901649x) {
        if (c901649x instanceof C4FB) {
            C4FB c4fb = (C4FB) c901649x;
            switch (c901649x.A00) {
                case 101:
                    this.A03.A07(null, "return back to caller without getting the finalized status", null);
                    String str = c4fb.A00;
                    String str2 = c4fb.A02;
                    String str3 = c4fb.A01;
                    Intent intent = new Intent();
                    intent.putExtra("response", TextUtils.join("&", Arrays.asList(C000200d.A0H("txnId=", str), C000200d.A0H("txnRef=", str2), C000200d.A0H("Status=", null), C000200d.A0H("responseCode=", str3))));
                    setResult(-1, intent);
                    finish();
                    return;
                case 102:
                    this.A02.A01(this, Uri.parse(c4fb.A03));
                    return;
                case 103:
                    PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                    AnonymousClass093 anonymousClass093 = c901649x.A04;
                    MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = new MandatePaymentBottomSheetFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("transaction", anonymousClass093);
                    mandatePaymentBottomSheetFragment.A0P(bundle);
                    paymentBottomSheet.A01 = mandatePaymentBottomSheetFragment;
                    AUg(paymentBottomSheet, "MandatePaymentBottomSheetFragment");
                    return;
                case 104:
                default:
                    super.A1Q(c901649x);
                    return;
                case 105:
                    Intent A01 = ((PaymentTransactionDetailsListActivity) this).A06.A01(this, false, false);
                    A01.putExtra("extra_payment_handle", c4fb.A04);
                    A01.putExtra("extra_payment_handle_id", c4fb.A09);
                    A01.putExtra("extra_payee_name", c4fb.A08);
                    A14(A01);
                    return;
            }
        }
        super.A1Q(c901649x);
    }

    public void A1T() {
        this.A00.A0I(false);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C92084Hl c92084Hl = this.A00;
        if (!c92084Hl.A00) {
            super.onBackPressed();
            return;
        }
        C4FB c4fb = new C4FB(101);
        c4fb.A00 = ((C4FI) c92084Hl).A04.A01;
        c4fb.A02 = ((C4FI) c92084Hl).A08;
        c4fb.A01 = "SUBMITTED";
        c4fb.A01 = "00";
        ((C4FI) c92084Hl).A05.A0B(c4fb);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 100) {
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.payments_request_status_requested_expired);
            c019208x.A01.A0J = false;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Pr
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiPaymentTransactionDetailsActivity.this.A1T();
                }
            });
            c019208x.A03(R.string.payments_request_status_request_expired);
            return c019208x.A00();
        }
        return super.onCreateDialog(i);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        C92084Hl c92084Hl = this.A00;
        if (c92084Hl != null) {
            c92084Hl.A00 = intent.getBooleanExtra("extra_return_after_completion", false);
        }
        super.onNewIntent(intent);
    }
}
