package com.whatsapp.ephemeral;

import X.AbstractC02800Cx;
import X.C000500h;
import X.C003701t;
import X.C018308n;
import X.C0AT;
import X.C40071rX;
import X.ViewTreeObserver$OnGlobalLayoutListenerC60772v1;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.ephemeral.EphemeralNUXDialog;

/* loaded from: classes2.dex */
public class EphemeralNUXDialog extends Hilt_EphemeralNUXDialog {
    public View A00;
    public ScrollView A01;
    public C018308n A02;
    public C000500h A03;
    public C003701t A04;
    public C40071rX A05;

    public static void A00(C000500h c000500h, AbstractC02800Cx abstractC02800Cx, boolean z) {
        if (!abstractC02800Cx.A0r() && (!c000500h.A00.getBoolean("ephemeral_nux", false)) && abstractC02800Cx.A0Q.A01("ephemeral_nux") == null) {
            EphemeralNUXDialog ephemeralNUXDialog = new EphemeralNUXDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_settings", z);
            ephemeralNUXDialog.A0P(bundle);
            ephemeralNUXDialog.A14(abstractC02800Cx, "ephemeral_nux");
        }
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        if (this.A03.A00.getBoolean("ephemeral_nux", false)) {
            A11();
        }
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.2v0
                {
                    EphemeralNUXDialog.this = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    ActivityC02330At A09;
                    EphemeralNUXDialog ephemeralNUXDialog = EphemeralNUXDialog.this;
                    if (i == 4 && keyEvent.getAction() == 0 && (A09 = ephemeralNUXDialog.A09()) != null) {
                        A09.onBackPressed();
                        return true;
                    }
                    return false;
                }
            });
            dialog.setCanceledOnTouchOutside(false);
            A18(dialog);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC60772v1(this));
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        int i;
        int i2;
        int i3;
        boolean z = A02().getBoolean("from_settings");
        View inflate = A0A().getLayoutInflater().inflate(R.layout.ephemeral_nux, (ViewGroup) null, false);
        TextView textView = (TextView) C0AT.A0D(inflate, R.id.ephemeral_nux_title);
        TextView textView2 = (TextView) C0AT.A0D(inflate, R.id.ephemeral_nux_content);
        TextView textView3 = (TextView) C0AT.A0D(inflate, R.id.ephemeral_nux_finished);
        View A0D = C0AT.A0D(inflate, R.id.ephemeral_nux_go_to_faq);
        this.A00 = C0AT.A0D(inflate, R.id.ephemeral_nux_buttons_container);
        this.A01 = (ScrollView) C0AT.A0D(inflate, R.id.ephemeral_nux_scroller);
        if (z) {
            i = R.string.ephemeral_nux_from_settings_title;
            boolean A0C = this.A04.A0C(407);
            i2 = R.string.ephemeral_nux_from_settings_content;
            if (A0C) {
                i2 = R.string.ephemeral_nux_from_settings_content_generic;
            }
            i3 = R.string.ephemeral_nux_finished;
        } else {
            i = R.string.ephemeral_nux_someone_turned_on_title;
            boolean A0C2 = this.A04.A0C(407);
            i2 = R.string.ephemeral_nux_someone_turned_on_content;
            if (A0C2) {
                i2 = R.string.ephemeral_nux_someone_turned_on_content_generic;
            }
            i3 = R.string.ok;
        }
        textView3.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 48));
        A0D.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 49));
        textView.setText(i);
        textView2.setText(i2);
        textView3.setText(i3);
        return new AlertDialog.Builder(A00()).setView(inflate).create();
    }

    public final void A18(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = Math.min(A01().getDimensionPixelSize(R.dimen.ephemeral_nux_width), A01().getDisplayMetrics().widthPixels);
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
                this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC60772v1(this));
            }
        }
    }
}
