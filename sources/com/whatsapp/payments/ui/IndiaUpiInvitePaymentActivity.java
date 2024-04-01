package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.C000700j;
import X.C07A;
import X.C0C9;
import X.C0E6;
import X.C0EU;
import X.C0HS;
import X.C0U1;
import X.C3PJ;
import X.C3PK;
import X.C464626x;
import X.C4KG;
import X.C4LC;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPaymentInviteOrSetupJob;
import com.whatsapp.payments.ui.IndiaUpiInvitePaymentActivity;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.Set;

/* loaded from: classes3.dex */
public class IndiaUpiInvitePaymentActivity extends C4LC {
    public C0C9 A00;
    public C464626x A01;
    public C07A A02;

    public void A1a(UserJid userJid) {
        C464626x c464626x = this.A01;
        C0E6 c0e6 = c464626x.A00;
        c0e6.A00.A01(new SendPaymentInviteOrSetupJob(userJid, true));
        C0EU c0eu = c464626x.A04;
        Set A0B = c0eu.A0B();
        ((AbstractCollection) A0B).add(userJid);
        c0eu.A04().edit().putString("payments_invitee_jids", C0EU.A02(A0B)).apply();
        ((AbstractActivityC92444Kp) this).A06.ARy(new C0HS(((C4KG) this).A05, userJid, this.A00, this.A02, this) { // from class: X.4Db
            public final AnonymousClass012 A00;
            public final C0C9 A01;
            public final AbstractC005302j A02;
            public final C07A A03;
            public final WeakReference A04;

            {
                this.A02 = userJid;
                this.A00 = r2;
                this.A03 = r5;
                this.A01 = r4;
                this.A04 = new WeakReference(this);
            }

            @Override // X.C0HS
            public void A06() {
                ActivityC02320As activityC02320As = (ActivityC02320As) C018308n.A01((Context) this.A04.get(), IndiaUpiInvitePaymentActivity.class);
                View findViewById = activityC02320As.findViewById(R.id.progress);
                View findViewById2 = activityC02320As.findViewById(R.id.payments_invite_button);
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                C07A c07a = this.A03;
                AbstractC005302j abstractC005302j = this.A02;
                C04590La A0C = c07a.A0C(abstractC005302j, this.A00.A05(), 42);
                A0C.A0d(abstractC005302j);
                this.A01.A0k(A0C, 16);
                return Boolean.TRUE;
            }
        }, new Void[0]);
        finish();
    }

    public /* synthetic */ void lambda$onCreate$137$IndiaUpiInvitePaymentActivity(View view) {
        Intent intent = new Intent(this, IndiaUpiPaymentSettingsActivity.class);
        intent.putExtra("extra_send_to_upi_id", true);
        startActivity(intent);
        finish();
    }

    @Override // X.C4LC, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_payments_invite);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        UserJid nullable = UserJid.getNullable(intent.getStringExtra("extra_receiver_jid"));
        C000700j.A07(nullable != null);
        String stringExtra = intent.getStringExtra("extra_receiver");
        C000700j.A03(stringExtra);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            A0c.A0H(getString(R.string.payments_invite_activity_title, stringExtra));
        }
        ((TextView) findViewById(R.id.payments_invite_title)).setText(getString(R.string.payments_invite_title, stringExtra));
        ((TextView) findViewById(R.id.payments_invite_desc)).setText(getString(R.string.payments_invite_desc, stringExtra));
        TextView textView = (TextView) findViewById(R.id.payments_invite_button);
        textView.setText(R.string.payments_invite_button_text);
        textView.setOnClickListener(new C3PK(this, nullable));
        findViewById(R.id.send_to_vpa).setOnClickListener(new C3PJ(this));
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
