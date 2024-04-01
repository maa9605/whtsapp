package androidx.preference;

import X.C019208x;
import X.C019308y;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreferenceDialogFragmentCompat;
import androidx.preference.PreferenceDialogFragmentCompat;

/* loaded from: classes.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public int A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        super.A0k(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.A00);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.A01);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.A02);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) A17();
            if (listPreference.A03 != null && listPreference.A04 != null) {
                this.A00 = listPreference.A0T(listPreference.A01);
                this.A01 = listPreference.A03;
                this.A02 = listPreference.A04;
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.A00 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.A01 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.A02 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void A19(C019208x c019208x) {
        CharSequence[] charSequenceArr = this.A01;
        int i = this.A00;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.0mZ
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
                listPreferenceDialogFragmentCompat.A00 = i2;
                ((PreferenceDialogFragmentCompat) listPreferenceDialogFragmentCompat).A01 = -1;
                dialogInterface.dismiss();
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0M = charSequenceArr;
        c019308y.A05 = onClickListener;
        c019308y.A00 = i;
        c019308y.A0L = true;
        c019208x.A08(null, null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void A1A(boolean z) {
        int i;
        if (!z || (i = this.A00) < 0) {
            return;
        }
        String charSequence = this.A02[i].toString();
        ListPreference listPreference = (ListPreference) A17();
        if (listPreference.A0R(charSequence)) {
            listPreference.A0V(charSequence);
        }
    }
}
