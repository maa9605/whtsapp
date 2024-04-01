package com.whatsapp.voipcalling;

import X.C02160Ac;
import X.C09I;
import X.C0VJ;
import X.C2M7;
import X.C2QZ;
import X.InterfaceC74223cu;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import com.whatsapp.voipcalling.VoipAppUpdateActivity;

/* loaded from: classes2.dex */
public class VoipAppUpdateActivity extends C2QZ {
    public C09I A00;
    public InterfaceC74223cu A01 = new InterfaceC74223cu() { // from class: X.3tS
        {
            VoipAppUpdateActivity.this = this;
        }

        @Override // X.InterfaceC74223cu
        public final void A7q() {
            VoipAppUpdateActivity.this.finish();
        }
    };
    public C2M7 A02;

    @Override // X.C2QZ, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(C02160Ac.A00(this, R.color.popup_dim)));
        getWindow().addFlags(2621440);
        setContentView(R.layout.voip_app_update_dialog);
        C0VJ.A0A(this, R.id.cancel).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 16));
        C0VJ.A0A(this, R.id.upgrade).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 17));
        C2M7 c2m7 = this.A02;
        c2m7.A00.add(this.A01);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2M7 c2m7 = this.A02;
        c2m7.A00.remove(this.A01);
    }
}
