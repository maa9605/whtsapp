package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass011;
import X.C000200d;
import X.C002701i;
import X.C018308n;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.C40071rX;
import X.C40081rY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.Hilt_VerifiedBusinessInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment;

/* loaded from: classes2.dex */
public class VerifiedBusinessInfoDialogFragment extends Hilt_VerifiedBusinessInfoDialogFragment {
    public C018308n A00;
    public C40081rY A01;
    public AnonymousClass011 A02;
    public C40071rX A03;

    public static VerifiedBusinessInfoDialogFragment A00(String str) {
        VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment = new VerifiedBusinessInfoDialogFragment();
        verifiedBusinessInfoDialogFragment.A0P(C000200d.A02("message", str));
        return verifiedBusinessInfoDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        A02();
        String string = ((C0BA) this).A06.getString("message");
        final int i = ((C0BA) this).A06.getInt("system_action");
        C019208x c019208x = new C019208x(A09());
        CharSequence A0g = C002701i.A0g(string, ((Hilt_VerifiedBusinessInfoDialogFragment) this).A00, this.A01);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = A0g;
        c019308y.A0J = true;
        c019208x.A05(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.2rU
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment = VerifiedBusinessInfoDialogFragment.this;
                int i3 = i;
                Uri A03 = verifiedBusinessInfoDialogFragment.A03.A03("general", "26000089", null);
                if (i3 == 46) {
                    C09900ex c09900ex = new C09900ex();
                    c09900ex.A00 = 2;
                    c09900ex.A01 = 14;
                    verifiedBusinessInfoDialogFragment.A02.A0B(c09900ex, null, false);
                }
                verifiedBusinessInfoDialogFragment.A00.A06(((Hilt_VerifiedBusinessInfoDialogFragment) verifiedBusinessInfoDialogFragment).A00, new Intent("android.intent.action.VIEW", A03));
                verifiedBusinessInfoDialogFragment.A10();
            }
        });
        c019208x.A04(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.2rV
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VerifiedBusinessInfoDialogFragment.this.A10();
            }
        });
        return c019208x.A00();
    }
}
