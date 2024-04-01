package com.whatsapp.account.delete;

import X.AbstractView$OnClickListenerC49532Ky;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.C02160Ac;
import X.C02180Ae;
import X.C0DW;
import X.C0U1;
import X.C0WJ;
import X.C0We;
import X.C469829b;
import X.InterfaceC49772Mh;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class DeleteAccountActivity extends C0WJ implements InterfaceC49772Mh {
    public C469829b A00;
    public C0DW A01;

    @Override // X.InterfaceC49772Mh
    public void ALn() {
        A16(new Intent(this, DeleteAccountFeedback.class), true);
    }

    @Override // X.InterfaceC49772Mh
    public void AMF() {
        AUj(R.string.delete_account_mismatch);
    }

    public /* synthetic */ void lambda$onCreate$967$DeleteAccountActivity(View view) {
        Log.i("delete-account/changenumber");
        startActivity(new Intent(this, ChangeNumberOverview.class));
    }

    @Override // X.C0WJ, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.delete_account);
        setTitle(R.string.settings_delete_account);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
        }
        ImageView imageView = (ImageView) findViewById(R.id.change_number_icon);
        imageView.setImageDrawable(new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_settings_change_number)));
        C02180Ae.A17(imageView, AnonymousClass029.A03(this, R.attr.settingsIconColor, R.color.settings_icon));
        ((TextView) findViewById(R.id.delete_account_instructions)).setText(R.string.delete_account_instructions);
        findViewById(R.id.delete_account_change_number_option).setOnClickListener(new View.OnClickListener() { // from class: X.1Lj
            {
                DeleteAccountActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccountActivity.this.lambda$onCreate$967$DeleteAccountActivity(view);
            }
        });
        if (!this.A00.A07() || ((ActivityC02290Ap) this).A0F.A0F() == null) {
            findViewById(R.id.delete_gdrive_account_warning).setVisibility(8);
        }
        if (!this.A01.A04()) {
            findViewById(R.id.delete_payments_account_warning).setVisibility(8);
        }
        final MatchPhoneNumberFragment matchPhoneNumberFragment = (MatchPhoneNumberFragment) A0N().A06(R.id.delete_account_match_phone_number_fragment);
        if (matchPhoneNumberFragment != null) {
            findViewById(R.id.delete_account_submit).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1ji
                @Override // X.AbstractView$OnClickListenerC49532Ky
                public void A00(View view) {
                    matchPhoneNumberFragment.A0y();
                }
            });
            return;
        }
        throw null;
    }
}
