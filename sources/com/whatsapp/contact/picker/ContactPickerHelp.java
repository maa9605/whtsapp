package com.whatsapp.contact.picker;

import X.C0U1;
import X.C2NN;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ContactPickerHelp extends C2NN {
    @Override // X.C2NN, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.contacts_help);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            setContentView(R.layout.contact_picker_help);
            findViewById(R.id.scroll_view).post(new RunnableEBaseShape1S0100000_I0_1(this, 37));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
