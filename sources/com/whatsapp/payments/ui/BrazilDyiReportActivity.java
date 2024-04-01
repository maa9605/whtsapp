package com.whatsapp.payments.ui;

import X.ActivityC02290Ap;
import X.C002301c;
import X.C4BZ;
import X.C4EU;
import X.C4KJ;
import X.C4KX;
import X.C895547l;
import X.C90454Bb;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class BrazilDyiReportActivity extends C4KX {
    public C4BZ A00;
    public C90454Bb A01;
    public C895547l A02;

    public final void A1V(int i, int i2) {
        DialogInterfaceC019408z A01;
        if (i == 477) {
            A01 = C895547l.A01(this, getString(R.string.dyi_request_report_incomplete_setup_failure_dialog_title), getString(R.string.dyi_request_report_incomplete_setup_failure_dialog_message), null);
        } else {
            A01 = this.A01.A01(this, i, i2);
        }
        A01.show();
        A1Q(A01);
    }

    @Override // X.C4KX, X.C4KJ, X.C4K3, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C002301c c002301c = ((C4KJ) this).A0C;
        this.A01 = new C90454Bb(c002301c, ((C4KJ) this).A0H);
        this.A02 = new C895547l(c002301c);
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A01 = new C4EU(((C4KJ) this).A03, this.A0T, this.A0R, ((C4KJ) this).A0J, ((C4KJ) this).A0D, ((C4KJ) this).A0F, ((ActivityC02290Ap) this).A0D, this.A01, ((C4KJ) this).A0G, ((C4KJ) this).A0O, ((C4KJ) this).A0I, ((C4KJ) this).A0E).A01(this, i);
        return A01 != null ? A01 : super.onCreateDialog(i);
    }
}
