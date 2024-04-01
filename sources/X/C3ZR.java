package X;

import android.view.ViewTreeObserver;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;

/* renamed from: X.3ZR  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZR implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ SettingsTwoFactorAuthActivity A00;

    public C3ZR(SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity) {
        this.A00 = settingsTwoFactorAuthActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity = this.A00;
        settingsTwoFactorAuthActivity.A05.getViewTreeObserver().removeOnPreDrawListener(this);
        if (settingsTwoFactorAuthActivity.A05.canScrollVertically(1)) {
            settingsTwoFactorAuthActivity.A03.setElevation(settingsTwoFactorAuthActivity.A00);
            return false;
        }
        settingsTwoFactorAuthActivity.A03.setElevation(0.0f);
        return false;
    }
}
