package com.whatsapp.payments.receiver;

import X.AbstractActivityC92454Kx;
import X.AnonymousClass029;
import X.C002701i;
import X.C019208x;
import X.C0GZ;
import X.C49E;
import X.C4AS;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentLauncherActivity;
import com.whatsapp.util.Log;

/* loaded from: classes3.dex */
public class IndiaUpiPayIntentReceiverActivity extends AbstractActivityC92454Kx {
    public C0GZ A00;
    public C4AS A01;

    public void A1a() {
        C002701i.A18(this, SearchActionVerificationClientService.NOTIFICATION_ID);
        AnonymousClass029.A19(this, IndiaUpiPayIntentReceiverActivity.class, false);
        Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
        setResult(0);
        finish();
    }

    public void A1b() {
        C002701i.A18(this, 10001);
        AnonymousClass029.A19(this, IndiaUpiPayIntentReceiverActivity.class, false);
        Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
        setResult(0);
        finish();
    }

    @Override // X.AbstractActivityC92454Kx, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = new C4AS(this.A00);
        if (C49E.A00(getIntent().getData(), false) == null) {
            finish();
            return;
        }
        C0GZ c0gz = this.A01.A00;
        if (c0gz.A08()) {
            Intent intent = new Intent(this, IndiaUpiPaymentLauncherActivity.class);
            intent.setData(getIntent().getData());
            startActivity(intent);
            finish();
        } else if (c0gz.A09()) {
            C002701i.A19(this, 10001);
        } else {
            C002701i.A19(this, SearchActionVerificationClientService.NOTIFICATION_ID);
        }
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 10000) {
            C019208x c019208x = new C019208x(this);
            c019208x.A03(R.string.payment_intent_error_cannot_continue_dialog_title);
            c019208x.A02(R.string.payment_intent_error_no_account);
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3O0
                {
                    IndiaUpiPayIntentReceiverActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiPayIntentReceiverActivity.this.A1a();
                }
            });
            c019208x.A01.A0J = false;
            return c019208x.A00();
        } else if (i != 10001) {
            return super.onCreateDialog(i);
        } else {
            C019208x c019208x2 = new C019208x(this);
            c019208x2.A03(R.string.payment_intent_error_cannot_continue_dialog_title);
            c019208x2.A02(R.string.payment_intent_error_no_pin_set);
            c019208x2.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3Nz
                {
                    IndiaUpiPayIntentReceiverActivity.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IndiaUpiPayIntentReceiverActivity.this.A1b();
                }
            });
            c019208x2.A01.A0J = false;
            return c019208x2.A00();
        }
    }
}
