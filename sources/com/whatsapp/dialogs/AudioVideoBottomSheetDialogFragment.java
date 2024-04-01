package com.whatsapp.dialogs;

import X.C000200d;
import X.C0AT;
import X.InterfaceC04780Lu;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class AudioVideoBottomSheetDialogFragment extends Hilt_AudioVideoBottomSheetDialogFragment {
    public InterfaceC04780Lu A00;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A00 = null;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        A02();
        View inflate = layoutInflater.inflate(R.layout.audio_video_bottom_sheet, viewGroup, false);
        View A0D = C0AT.A0D(inflate, R.id.audio_call_button);
        View A0D2 = C0AT.A0D(inflate, R.id.video_call_button);
        A0D.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 40));
        A0D2.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 39));
        return inflate;
    }

    @Override // com.whatsapp.dialogs.Hilt_AudioVideoBottomSheetDialogFragment, com.whatsapp.Hilt_RoundedBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (context instanceof InterfaceC04780Lu) {
            this.A00 = (InterfaceC04780Lu) context;
            return;
        }
        StringBuilder A0P = C000200d.A0P("Activity must implement ");
        A0P.append("AudioVideoBottomSheetDialogFragment$AudioVideoBottomSheetDialogListener");
        throw new IllegalStateException(A0P.toString());
    }
}
