package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.settings.SettingsPrivacy;

/* renamed from: X.3oc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C81263oc {
    public final /* synthetic */ SettingsPrivacy A00;

    public /* synthetic */ C81263oc(SettingsPrivacy settingsPrivacy) {
        this.A00 = settingsPrivacy;
    }

    public final void A00(String str, int i) {
        SettingsPrivacy settingsPrivacy = this.A00;
        if (!settingsPrivacy.A0P.A05()) {
            settingsPrivacy.A0J.A07(R.string.coldsync_no_network, 0);
        } else {
            settingsPrivacy.A1Y(SettingsPrivacy.A02(str), SettingsPrivacy.A01(settingsPrivacy.A1R(str, i)));
        }
    }
}
