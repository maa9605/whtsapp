package com.whatsapp.voipcalling;

import X.ActivityC02330At;
import X.C019208x;
import X.C019308y;
import X.C07280Xp;
import X.C0BA;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class JoinableEducationDialogFragment extends Hilt_JoinableEducationDialogFragment {
    public WeakReference A00;
    public boolean A01;

    public static JoinableEducationDialogFragment A00(boolean z, DialogInterface.OnDismissListener onDismissListener) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_param_voice_call", z);
        JoinableEducationDialogFragment joinableEducationDialogFragment = new JoinableEducationDialogFragment();
        joinableEducationDialogFragment.A0P(bundle);
        if (onDismissListener != null) {
            joinableEducationDialogFragment.A00 = new WeakReference(onDismissListener);
        }
        return joinableEducationDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        if (bundle != null) {
            this.A01 = bundle.getBoolean("bundle_param_voice_call", false);
        } else {
            Bundle bundle2 = ((C0BA) this).A06;
            if (bundle2 != null) {
                this.A01 = bundle2.getBoolean("bundle_param_voice_call", false);
            }
        }
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            C019208x c019208x = new C019208x(A09);
            View inflate = LayoutInflater.from(A09).inflate(R.layout.voip_call_joinable_education_dialog, (ViewGroup) null, false);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.voip_call_joinable_education_dialog_icon);
            if (this.A01) {
                C07280Xp A00 = C07280Xp.A00(A01(), R.drawable.ic_voip_joinable_calls_education_stars_voice, null);
                if (A00 != null) {
                    imageView.setImageDrawable(A00);
                    imageView.setContentDescription(A0F(R.string.voip_joinable_education_icon_content_description_voice));
                } else {
                    throw null;
                }
            }
            C019308y c019308y = c019208x.A01;
            c019308y.A0C = inflate;
            c019308y.A01 = 0;
            c019208x.A06(R.string.ok, null);
            return c019208x.A00();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener;
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        WeakReference weakReference = this.A00;
        if (weakReference == null || (onDismissListener = (DialogInterface.OnDismissListener) weakReference.get()) == null) {
            return;
        }
        onDismissListener.onDismiss(dialogInterface);
    }
}
