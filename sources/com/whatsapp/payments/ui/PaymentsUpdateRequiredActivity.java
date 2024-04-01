package com.whatsapp.payments.ui;

import X.C09I;
import X.C0U1;
import X.C3R0;
import X.C4KC;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class PaymentsUpdateRequiredActivity extends C4KC {
    public View A00;
    public C09I A01;

    public /* synthetic */ void lambda$onCreate$96$PaymentsUpdateRequiredActivity(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(this.A01.A01());
        startActivity(intent);
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.setVisibility(configuration.orientation == 2 ? 8 : 0);
    }

    @Override // X.C4KC, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.software_about_to_expire_title);
            A0c.A0L(true);
        }
        setContentView(R.layout.payment_update_required);
        findViewById(R.id.upgrade_button).setOnClickListener(new C3R0(this));
        this.A00 = findViewById(R.id.update_icon);
    }
}
