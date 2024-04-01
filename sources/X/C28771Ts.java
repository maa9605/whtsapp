package X;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Ts  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28771Ts implements InterfaceC14300mj {
    public static C28771Ts A00;

    @Override // X.InterfaceC14300mj
    public CharSequence AQv(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(editTextPreference.A00)) {
            return ((Preference) editTextPreference).A05.getString(R.string.not_set);
        }
        return editTextPreference.A00;
    }
}
