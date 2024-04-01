package com.whatsapp.contact.picker;

import X.AnonymousClass024;
import X.C000700j;
import X.C0B5;
import X.InterfaceC42681w9;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class SharedFilePreviewDialogFragment extends Hilt_SharedFilePreviewDialogFragment {
    public Uri A00;
    public Bundle A01;
    public File A02;

    @Override // com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment, X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.A0p(layoutInflater, viewGroup, bundle);
        final RelativeLayout relativeLayout = (RelativeLayout) A0A().getLayoutInflater().inflate(R.layout.shared_file_preview_layout, (ViewGroup) null, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        relativeLayout.setLayoutParams(layoutParams);
        ((BaseSharedPreviewDialogFragment) this).A04.addView(relativeLayout);
        final String string = this.A01.getString("mime_type", "");
        ((BaseSharedPreviewDialogFragment) this).A0F.A0f(this.A00, (C0B5) A09(), new InterfaceC42681w9() { // from class: X.36P
            @Override // X.InterfaceC42681w9
            public final void AKN(File file) {
                SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment = SharedFilePreviewDialogFragment.this;
                String str = string;
                RelativeLayout relativeLayout2 = relativeLayout;
                sharedFilePreviewDialogFragment.A02 = file;
                if (C0DD.A00(str) == 2) {
                    C2Vy c2Vy = new C2Vy(sharedFilePreviewDialogFragment.A09());
                    c2Vy.A00(sharedFilePreviewDialogFragment, file);
                    relativeLayout2.addView(c2Vy);
                    return;
                }
                C2W0 c2w0 = new C2W0(sharedFilePreviewDialogFragment.A09());
                c2w0.A00(sharedFilePreviewDialogFragment, file, str, sharedFilePreviewDialogFragment.A00);
                relativeLayout2.addView(c2w0);
            }
        });
        ((BaseSharedPreviewDialogFragment) this).A03.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 6));
        return ((BaseSharedPreviewDialogFragment) this).A00;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0r() {
        super.A0r();
        try {
            File file = this.A02;
            if (file == null || !((BaseSharedPreviewDialogFragment) this).A06.A0S(file)) {
                return;
            }
            AnonymousClass024.A0f(this.A02);
        } catch (IOException e) {
            Log.e("sharedfilepreviewdialogfragment/ondestroyview exception", e);
        }
    }

    @Override // com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        String string = A02.getString("share_uri");
        C000700j.A04(string, "null share uri");
        this.A00 = Uri.parse(string);
        Bundle bundle2 = A02.getBundle("extras");
        C000700j.A04(bundle2, "null extras");
        this.A01 = bundle2;
        return super.A0z(bundle);
    }
}
