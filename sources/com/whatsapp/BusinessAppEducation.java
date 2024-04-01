package com.whatsapp;

import X.AbstractActivityC06880Vl;
import X.C0LD;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.BusinessAppEducation;

/* loaded from: classes.dex */
public class BusinessAppEducation extends AbstractActivityC06880Vl {
    public /* synthetic */ void lambda$setupActivity$2805$BusinessAppEducation(View view) {
        onBackPressed();
        A1P(3, 12, false);
    }

    public /* synthetic */ void lambda$setupActivity$2806$BusinessAppEducation(View view) {
        startActivity(C0LD.A01("smb_cs_chats_banner"));
        A1P(2, 12, false);
    }

    @Override // X.AbstractActivityC06880Vl, X.AbstractActivityC06900Vn, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.business_app_education);
        findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: X.1Ff
            {
                BusinessAppEducation.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessAppEducation.this.lambda$setupActivity$2805$BusinessAppEducation(view);
            }
        });
        findViewById(R.id.install_smb_google_play).setOnClickListener(new View.OnClickListener() { // from class: X.1Fg
            {
                BusinessAppEducation.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessAppEducation.this.lambda$setupActivity$2806$BusinessAppEducation(view);
            }
        });
        A1P(1, 12, false);
    }
}
