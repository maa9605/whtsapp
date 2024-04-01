package X;

import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;

/* renamed from: X.0G4  reason: invalid class name */
/* loaded from: classes.dex */
public class C0G4 extends AnonymousClass009 {
    public static volatile C0G4 A01;
    public volatile boolean A00;

    public C0G4(C02E c02e) {
        if (Build.VERSION.SDK_INT >= 21) {
            PowerManager A0D = c02e.A0D();
            if (A0D == null) {
                this.A00 = true;
                return;
            } else {
                this.A00 = A0D.isPowerSaveMode();
                return;
            }
        }
        this.A00 = false;
    }

    public static C0G4 A00() {
        if (A01 == null) {
            synchronized (C0G4.class) {
                if (A01 == null) {
                    A01 = new C0G4(C02E.A00());
                }
            }
        }
        return A01;
    }

    public void A02(boolean z) {
        C000700j.A01();
        this.A00 = z;
        Iterator it = super.A00.iterator();
        while (true) {
            C0G5 c0g5 = (C0G5) it;
            if (!c0g5.hasNext()) {
                return;
            }
            ((C0EI) c0g5.next()).AN8(z);
        }
    }
}
