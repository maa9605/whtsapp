package com.whatsapp.conversation;

import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.ChatMediaEphemeralVisibilityDialog;

/* loaded from: classes2.dex */
public class ChatMediaEphemeralVisibilityDialog extends Hilt_ChatMediaEphemeralVisibilityDialog {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A0A());
        c019208x.A02(R.string.ephemeral_media_visibility_warning);
        c019208x.A08(A0F(R.string.ok), new DialogInterface.OnClickListener() { // from class: X.2qi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ((DialogFragment) ChatMediaEphemeralVisibilityDialog.this).A03.dismiss();
            }
        });
        return c019208x.A00();
    }
}
