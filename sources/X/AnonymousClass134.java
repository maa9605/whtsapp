package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.134 */
/* loaded from: classes.dex */
public final class AnonymousClass134 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final AnonymousClass132 A0A;
    public final AnonymousClass133 A0B;

    public AnonymousClass134(Context context) {
        DisplayManager displayManager;
        AnonymousClass132 anonymousClass132 = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService("window");
        }
        if (this.A09 != null) {
            if (C08M.A00 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                anonymousClass132 = new AnonymousClass132(this, displayManager);
            }
            this.A0A = anonymousClass132;
            this.A0B = AnonymousClass133.A05;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public final void A00() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.A06 = refreshRate;
            this.A07 = (refreshRate * 80) / 100;
        }
    }
}
