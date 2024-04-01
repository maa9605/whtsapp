package androidx.preference;

import X.C019208x;
import X.C019308y;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreferenceDialogFragmentCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public Set A00 = new HashSet();
    public boolean A01;
    public CharSequence[] A02;
    public CharSequence[] A03;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        super.A0k(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.A00));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.A01);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.A02);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.A03);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A17();
            if (multiSelectListPreference.A01 != null && multiSelectListPreference.A02 != null) {
                this.A00.clear();
                this.A00.addAll(multiSelectListPreference.A00);
                this.A01 = false;
                this.A02 = multiSelectListPreference.A01;
                this.A03 = multiSelectListPreference.A02;
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.A00.clear();
        this.A00.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.A01 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.A02 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.A03 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void A19(C019208x c019208x) {
        int length = this.A03.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.A00.contains(this.A03[i].toString());
        }
        CharSequence[] charSequenceArr = this.A02;
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: X.0mb
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                if (z) {
                    multiSelectListPreferenceDialogFragmentCompat.A01 = multiSelectListPreferenceDialogFragmentCompat.A00.add(multiSelectListPreferenceDialogFragmentCompat.A03[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat.A01;
                    return;
                }
                multiSelectListPreferenceDialogFragmentCompat.A01 = multiSelectListPreferenceDialogFragmentCompat.A00.remove(multiSelectListPreferenceDialogFragmentCompat.A03[i2].toString()) | multiSelectListPreferenceDialogFragmentCompat.A01;
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0M = charSequenceArr;
        c019308y.A09 = onMultiChoiceClickListener;
        c019308y.A0N = zArr;
        c019308y.A0K = true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void A1A(boolean z) {
        if (z && this.A01) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A17();
            if (multiSelectListPreference.A0R(this.A00)) {
                multiSelectListPreference.A0T(this.A00);
            }
        }
        this.A01 = false;
    }
}
