package X;

import android.os.Build;
import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.3Ts  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70813Ts {
    public float A00 = -1.0f;

    public void A00(Window window) {
        window.clearFlags(128);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.A00;
        window.setAttributes(attributes);
    }

    public void A01(C02E c02e, Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.A00 = attributes.screenBrightness;
        PowerManager A0D = c02e.A0D();
        if (Build.VERSION.SDK_INT < 21 || A0D == null || A0D.isPowerSaveMode()) {
            return;
        }
        window.addFlags(128);
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
    }
}
