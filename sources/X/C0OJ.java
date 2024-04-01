package X;

import android.os.Build;
import androidx.work.OverwritingInputMerger;

/* renamed from: X.0OJ  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OJ extends C0OK {
    public C0OJ(Class workerClass) {
        super(workerClass);
        this.A00.A0E = OverwritingInputMerger.class.getName();
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
        return new C0OM(this) { // from class: X.0ON
            {
                super(this.A02, this.A00, this.A01);
            }
        };
    }
}
