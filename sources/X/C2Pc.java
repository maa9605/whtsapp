package X;

import android.os.Bundle;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;

/* renamed from: X.2Pc  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2Pc extends ActivityC02290Ap {
    public boolean A00 = false;

    @Override // X.AbstractActivityC02300Aq
    public void A0q() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        ((C0CQ) generatedComponent()).A4O((SolidColorWallpaper) this);
    }

    @Override // X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        A0q();
        super.onCreate(bundle);
    }
}
