package androidx.preference;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    public EditText A00;
    public CharSequence A01;

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public boolean A1B() {
        return true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        super.A0k(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A01);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        if (bundle == null) {
            this.A01 = ((EditTextPreference) A17()).A00;
        } else {
            this.A01 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void A18(View view) {
        super.A18(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.A00 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.A00.setText(this.A01);
            EditText editText2 = this.A00;
            editText2.setSelection(editText2.getText().length());
            if (A17() == null) {
                throw null;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void A1A(boolean z) {
        if (z) {
            String obj = this.A00.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) A17();
            if (editTextPreference.A0R(obj)) {
                editTextPreference.A0T(obj);
            }
        }
    }
}
