package X;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Tv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28791Tv implements InterfaceC14300mj {
    public static C28791Tv A00;

    @Override // X.InterfaceC14300mj
    public CharSequence AQv(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.A0U())) {
            return ((Preference) listPreference).A05.getString(R.string.not_set);
        }
        return listPreference.A0U();
    }
}
