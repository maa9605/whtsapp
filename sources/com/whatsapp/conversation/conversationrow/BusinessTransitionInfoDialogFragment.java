package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass011;
import X.C002701i;
import X.C018308n;
import X.C019208x;
import X.C019308y;
import X.C40071rX;
import X.C40081rY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.Hilt_BusinessTransitionInfoDialogFragment;

/* loaded from: classes2.dex */
public class BusinessTransitionInfoDialogFragment extends Hilt_BusinessTransitionInfoDialogFragment {
    public C018308n A00;
    public C40081rY A01;
    public AnonymousClass011 A02;
    public C40071rX A03;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Bundle A02 = A02();
        String string = A02.getString("message");
        final int i = A02.getInt("transitionId");
        C019208x c019208x = new C019208x(A09());
        CharSequence A0g = C002701i.A0g(string, ((Hilt_BusinessTransitionInfoDialogFragment) this).A00, this.A01);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = A0g;
        c019308y.A0J = true;
        c019208x.A05(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.2rE
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment = BusinessTransitionInfoDialogFragment.this;
                if (i == 30) {
                    C09900ex c09900ex = new C09900ex();
                    c09900ex.A00 = 2;
                    c09900ex.A01 = 14;
                    businessTransitionInfoDialogFragment.A02.A0B(c09900ex, null, false);
                }
                businessTransitionInfoDialogFragment.A00.A06(((Hilt_BusinessTransitionInfoDialogFragment) businessTransitionInfoDialogFragment).A00, new Intent("android.intent.action.VIEW", businessTransitionInfoDialogFragment.A03.A02("security-and-privacy", "end-to-end-encryption-for-business-messages")));
                businessTransitionInfoDialogFragment.A10();
            }
        });
        c019208x.A04(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2rD
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BusinessTransitionInfoDialogFragment.this.A10();
            }
        });
        return c019208x.A00();
    }
}
