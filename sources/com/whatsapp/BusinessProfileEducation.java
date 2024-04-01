package com.whatsapp;

import X.AbstractActivityC06910Vp;
import X.C0LD;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.BusinessProfileEducation;

/* loaded from: classes.dex */
public class BusinessProfileEducation extends AbstractActivityC06910Vp {
    public /* synthetic */ void lambda$setupActivity$2807$BusinessProfileEducation(View view) {
        onBackPressed();
        A1P(3, 11, true);
    }

    public /* synthetic */ void lambda$setupActivity$2808$BusinessProfileEducation(View view) {
        startActivity(C0LD.A01("smb_cs_profile"));
        A1P(2, 11, true);
    }

    @Override // X.AbstractActivityC06910Vp, X.AbstractActivityC06900Vn, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.business_profile_education);
        findViewById(R.id.close).setOnClickListener(new View.OnClickListener() { // from class: X.1Fj
            {
                BusinessProfileEducation.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessProfileEducation.this.lambda$setupActivity$2807$BusinessProfileEducation(view);
            }
        });
        findViewById(R.id.upsell_button).setOnClickListener(new View.OnClickListener() { // from class: X.1Fi
            {
                BusinessProfileEducation.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessProfileEducation.this.lambda$setupActivity$2808$BusinessProfileEducation(view);
            }
        });
        A1P(1, 11, true);
    }
}
