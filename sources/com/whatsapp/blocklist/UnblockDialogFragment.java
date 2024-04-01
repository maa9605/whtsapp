package com.whatsapp.blocklist;

import X.ActivityC02330At;
import X.C019208x;
import X.C019308y;
import X.C2nQ;
import X.DialogInterfaceC019408z;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.search.verification.client.R;
import com.whatsapp.blocklist.UnblockDialogFragment;

/* loaded from: classes2.dex */
public class UnblockDialogFragment extends Hilt_UnblockDialogFragment {
    public C2nQ A00;
    public boolean A01;

    public static UnblockDialogFragment A00(String str, int i, boolean z, C2nQ c2nQ) {
        UnblockDialogFragment unblockDialogFragment = new UnblockDialogFragment();
        unblockDialogFragment.A00 = c2nQ;
        unblockDialogFragment.A01 = z;
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putInt("title", i);
        unblockDialogFragment.A0P(bundle);
        return unblockDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final ActivityC02330At A09 = A09();
        String string = A02().getString("message");
        if (string != null) {
            int i = A02().getInt("title");
            DialogInterface.OnClickListener onClickListener = this.A00 == null ? null : new DialogInterface.OnClickListener() { // from class: X.2nK
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnblockDialogFragment.this.A00.AVi();
                }
            };
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: X.2nL
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    UnblockDialogFragment unblockDialogFragment = UnblockDialogFragment.this;
                    Activity activity = A09;
                    if (unblockDialogFragment.A01) {
                        activity.finish();
                    }
                }
            };
            C019208x c019208x = new C019208x(A09);
            C019308y c019308y = c019208x.A01;
            c019308y.A0E = string;
            if (i != 0) {
                c019208x.A03(i);
            }
            c019208x.A06(R.string.unblock, onClickListener);
            c019208x.A04(R.string.cancel, onClickListener2);
            if (this.A01) {
                c019308y.A08 = new DialogInterface.OnKeyListener() { // from class: X.2nM
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                        Activity activity = A09;
                        if (i2 == 4 && keyEvent.getAction() == 1) {
                            activity.finish();
                            return true;
                        }
                        return false;
                    }
                };
            }
            DialogInterfaceC019408z A00 = c019208x.A00();
            A00.setCanceledOnTouchOutside(!this.A01);
            return A00;
        }
        throw null;
    }
}
