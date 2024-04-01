package com.whatsapp.ephemeral;

import X.ActivityC02330At;
import X.C000200d;
import X.C000500h;
import X.C018308n;
import X.C0AT;
import X.C40071rX;
import X.ViewTreeObserver$OnGlobalLayoutListenerC60782v2;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ViewOnceNUXDialog extends Hilt_ViewOnceNUXDialog {
    public View A00;
    public ScrollView A01;
    public C018308n A02;
    public C000500h A03;
    public C40071rX A04;

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        if (this.A03.A00.getBoolean("view_once_nux", false)) {
            A11();
        }
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            A18(dialog);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC60782v2(this));
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        View inflate = A0A.getLayoutInflater().inflate(R.layout.view_once_nux, (ViewGroup) null, false);
        View A0D = C0AT.A0D(inflate, R.id.view_once_nux_finished);
        View A0D2 = C0AT.A0D(inflate, R.id.view_once_nux_go_to_faq);
        this.A00 = C0AT.A0D(inflate, R.id.view_once_nux_buttons_container);
        this.A01 = (ScrollView) C0AT.A0D(inflate, R.id.view_once_nux_scroller);
        A0D.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 0));
        A0D2.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 1));
        return new AlertDialog.Builder(A0A).setView(inflate).create();
    }

    public final void A18(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = Math.min(A01().getDimensionPixelSize(R.dimen.view_once_nux_width), A01().getDisplayMetrics().widthPixels);
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            A18(dialog);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC60782v2(this));
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C000200d.A0j(this.A03, "view_once_nux", true);
        if (((DialogFragment) this).A0C) {
            return;
        }
        A16(true, true);
    }
}
