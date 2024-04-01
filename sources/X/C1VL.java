package X;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1VL  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VL extends C0OK {
    public C1VL(Class workerClass, long repeatInterval, TimeUnit repeatIntervalTimeUnit, long flexInterval, TimeUnit flexIntervalTimeUnit) {
        super(workerClass);
        this.A00.A01(repeatIntervalTimeUnit.toMillis(repeatInterval), flexIntervalTimeUnit.toMillis(flexInterval));
    }

    public C1VL(Class cls, TimeUnit timeUnit) {
        super(cls);
        C0OL c0ol = this.A00;
        long millis = timeUnit.toMillis(3600000L);
        if (c0ol != null) {
            if (millis < 900000) {
                AbstractC16430qO.A00().A05(C0OL.A0I, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
                millis = 900000;
            }
            c0ol.A01(millis, millis);
            return;
        }
        throw null;
    }

    @Override // X.C0OK
    public C0OM A01() {
        if (this.A03 && Build.VERSION.SDK_INT >= 23 && this.A00.A09.A06) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        C0OL c0ol = this.A00;
        if (c0ol.A0G && Build.VERSION.SDK_INT >= 23 && c0ol.A09.A06) {
            throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
        }
        return new C0OM(this) { // from class: X.1VM
            {
                super(this.A02, this.A00, this.A01);
            }
        };
    }
}
