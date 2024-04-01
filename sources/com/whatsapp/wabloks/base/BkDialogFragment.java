package com.whatsapp.wabloks.base;

import X.AbstractC02800Cx;
import X.C00J;
import X.C02820Cz;
import X.C46M;
import X.C74993eB;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* loaded from: classes3.dex */
public abstract class BkDialogFragment extends Hilt_BkDialogFragment {
    public BkFragment A00;
    public C00J A01;
    public String A02;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bk_dialog_fragment, viewGroup, false);
        try {
            Bundle A02 = A02();
            this.A00 = (BkFragment) ((C46M) this.A01.get()).A01("bk_dialog_fragment", A02.getString("bk_dialog_fragment", ""));
            String string = A02.getString("fragment_tag", "");
            this.A02 = string;
            if (this.A00 != null && string != null) {
                if (string != null) {
                    View findViewById = inflate.findViewById(R.id.wa_bloks_dialog_fragment_container);
                    AbstractC02800Cx A0B = A0B();
                    if (A0B != null) {
                        C02820Cz c02820Cz = new C02820Cz(A0B);
                        c02820Cz.A09(findViewById.getId(), this.A00, this.A02, 1);
                        c02820Cz.A04();
                        return inflate;
                    }
                    throw null;
                }
                throw null;
            }
            throw new C74993eB("Bloks: BkDialogFragment should be initialized first");
        } catch (C74993eB e) {
            Log.e(e);
            e.getMessage();
            return inflate;
        }
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        int i = configuration.orientation;
        if (i == 2) {
            if (((DialogFragment) this).A03.getWindow() != null) {
                ((DialogFragment) this).A03.getWindow().setLayout((int) (A0A().getWindowManager().getDefaultDisplay().getWidth() * 0.8d), -2);
                return;
            }
            throw null;
        } else if (i != 1) {
        } else {
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog != null) {
                if (dialog.getWindow() != null) {
                    ((DialogFragment) this).A03.getWindow().setLayout(-2, (int) (A0A().getWindowManager().getDefaultDisplay().getHeight() * 0.85d));
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
