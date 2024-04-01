package androidx.appcompat.app;

import X.AnonymousClass090;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public void A13(Dialog dialog, int i) {
        if (!(dialog instanceof AnonymousClass090)) {
            super.A13(dialog, i);
            return;
        }
        AnonymousClass090 anonymousClass090 = (AnonymousClass090) dialog;
        if (i != 1 && i != 2) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        anonymousClass090.A00().A0R(1);
    }
}
