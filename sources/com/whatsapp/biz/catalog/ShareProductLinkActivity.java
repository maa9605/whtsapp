package com.whatsapp.biz.catalog;

import X.AbstractActivityC04530Ku;
import X.AbstractActivityC49842Mt;
import X.C02L;
import X.C1LA;
import X.C35481jD;
import X.C35491jE;
import X.C35501jF;
import X.C49462Ko;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class ShareProductLinkActivity extends AbstractActivityC49842Mt {
    public C02L A00;
    public C49462Ko A01;

    @Override // X.AbstractActivityC49842Mt, X.AbstractActivityC04530Ku, X.AbstractActivityC04540Kv, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            String stringExtra = getIntent().getStringExtra("product_id");
            if (stringExtra != null) {
                String format = String.format("%s/p/%s/%s", "https://wa.me", stringExtra, nullable.user);
                setTitle(R.string.product_share_title);
                TextView textView = ((AbstractActivityC04530Ku) this).A01;
                if (textView != null) {
                    textView.setText(format);
                }
                ((TextView) findViewById(R.id.share_link_description)).setText(R.string.product_share_description);
                String string = this.A00.A0A(nullable) ? getString(R.string.product_share_text_template, format) : format;
                C35501jF A1S = A1S();
                A1S.A00 = string;
                A1S.A01 = new RunnableEBaseShape0S1200000_I0(this, stringExtra, nullable, 5);
                C35481jD A1Q = A1Q();
                A1Q.A00 = format;
                A1Q.A01 = new RunnableEBaseShape0S1200000_I0(this, stringExtra, nullable, 3);
                C35491jE A1R = A1R();
                A1R.A02 = string;
                A1R.A00 = getString(R.string.share);
                A1R.A01 = getString(R.string.product_share_email_subject);
                ((C1LA) A1R).A01 = new RunnableEBaseShape0S1200000_I0(this, stringExtra, nullable, 4);
                return;
            }
            throw null;
        }
        throw null;
    }
}
