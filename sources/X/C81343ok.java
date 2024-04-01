package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3ok  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C81343ok extends C0HS {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final /* synthetic */ SettingsDataUsageActivity A01;

    public C81343ok(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A01 = settingsDataUsageActivity;
    }

    @Override // X.C0HS
    public void A06() {
        Log.i("settings-data-usage-activity/load storage size task/started");
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        if (settingsDataUsageActivity.A03 == -1) {
            settingsDataUsageActivity.A0F.setText(R.string.calculating);
        }
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        Log.i("settings-data-usage-activity/load storage size task/background");
        if (this.A00.get()) {
            return null;
        }
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        return Long.valueOf(C40731sm.A04(((ActivityC02290Ap) settingsDataUsageActivity).A09, settingsDataUsageActivity.A0P));
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        Number number = (Number) obj;
        Log.i("settings-data-usage-activity/load storage size task/fetch completed");
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
            long longValue = number.longValue();
            settingsDataUsageActivity.A03 = longValue;
            settingsDataUsageActivity.A0F.setText(C02180Ae.A0l(((ActivityC02310Ar) settingsDataUsageActivity).A01, longValue));
        }
    }
}
