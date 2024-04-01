package com.whatsapp.wabloks.ui.bottomsheet;

import X.AbstractC02800Cx;
import X.ActivityC02270An;
import X.C00J;
import X.C021109r;
import X.C02180Ae;
import X.C02820Cz;
import X.C09P;
import X.C0AT;
import X.C0CS;
import X.C0D0;
import X.C0FK;
import X.C45Q;
import X.C52902bX;
import X.C892046c;
import X.C90294Al;
import X.C90304Am;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Hilt_RoundedBottomSheetDialogFragment;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.wabloks.base.BkFragment;

/* loaded from: classes3.dex */
public class BkBottomSheetContainerFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public LinearLayout A01;
    public C0FK A02;
    public C09P A03;
    public C00J A04;
    public boolean A05 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C52902bX(((Hilt_RoundedBottomSheetDialogFragment) this).A00, this);
            if (this.A05) {
                return;
            }
            this.A05 = true;
            ((C0CS) generatedComponent()).A3Y(this);
        }
    }

    @Override // X.C0BA
    public Context A0a() {
        return this.A00;
    }

    @Override // com.whatsapp.Hilt_RoundedBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(super.A0b(bundle), this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (X.C52912bY.A00(r0) == r4) goto L8;
     */
    @Override // com.whatsapp.Hilt_RoundedBottomSheetDialogFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0c(android.app.Activity r4) {
        /*
            r3 = this;
            super.A0c(r4)
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto Lf
            android.content.Context r0 = X.C52912bY.A00(r0)
            r2 = 0
            if (r0 != r4) goto L10
        Lf:
            r2 = 1
        L10:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.AnonymousClass029.A1J(r2, r0, r1)
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment.A0c(android.app.Activity):void");
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        AbstractC02800Cx A0N = A0A().A0N();
        if (A0N != null) {
            C02820Cz c02820Cz = new C02820Cz(A0N);
            c02820Cz.A06(this);
            c02820Cz.A05();
            super.A0k(bundle);
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        Object obj2;
        View inflate = layoutInflater.inflate(R.layout.wa_bloks_bottom_sheet, viewGroup, false);
        this.A01 = (LinearLayout) C0AT.A0D(inflate, R.id.wa_bloks_bottom_sheet_fragment_container);
        C0FK c0fk = this.A02;
        if (c0fk != null && (obj = c0fk.A00) != null && (obj2 = c0fk.A01) != null) {
            A1B((BkFragment) obj, (String) obj2, false, false);
        }
        return inflate;
    }

    @Override // com.whatsapp.Hilt_RoundedBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        A00();
    }

    @Override // com.whatsapp.Hilt_RoundedBottomSheetDialogFragment
    public void A18() {
        if (this.A05) {
            return;
        }
        this.A05 = true;
        ((C0CS) generatedComponent()).A3Y(this);
    }

    public void A1B(BkFragment bkFragment, String str, boolean z, boolean z2) {
        AbstractC02800Cx A0B = A0B();
        if (A0B != null) {
            C02820Cz c02820Cz = new C02820Cz(A0B);
            if (z) {
                c02820Cz.A03(str);
            }
            if (z2) {
                ((C0D0) c02820Cz).A02 = R.anim.enter_from_right;
                c02820Cz.A03 = R.anim.exit_to_left;
                c02820Cz.A04 = R.anim.enter_from_left;
                c02820Cz.A05 = R.anim.exit_to_right;
            }
            c02820Cz.A01(this.A01.getId(), bkFragment, str);
            c02820Cz.A04();
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.A03 != null) {
            ActivityC02270An activityC02270An = (ActivityC02270An) A0A();
            C45Q.A0O(new C892046c(activityC02270An.A0N(), activityC02270An, activityC02270An.A0F), this.A03, C021109r.A01);
        }
        if (((C90304Am) this.A04.get()).A00(C02180Ae.A0F(this.A00)) != null) {
            C90294Al.A01.pop();
            if (((DialogFragment) this).A0C) {
                return;
            }
            A16(true, true);
            return;
        }
        throw null;
    }
}
