package X;

import android.os.Bundle;
import com.whatsapp.SingleSelectionDialogFragment;

/* renamed from: X.26E */
/* loaded from: classes2.dex */
public class C26E extends C26F {
    public void A1P(int i, int i2, int i3, int i4) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i3);
        bundle.putInt("dialogTitleResId", i2);
        bundle.putInt("itemsArrayResId", i4);
        singleSelectionDialogFragment.A0P(bundle);
        AUh(singleSelectionDialogFragment);
    }

    public void A1Q(int i, int i2, int i3, String[] strArr) {
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        singleSelectionDialogFragment.A0P(SingleSelectionDialogFragment.A00(i, i3, i2, strArr));
        AUh(singleSelectionDialogFragment);
    }
}
