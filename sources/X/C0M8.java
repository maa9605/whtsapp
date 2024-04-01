package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;

/* renamed from: X.0M8  reason: invalid class name */
/* loaded from: classes.dex */
public class C0M8 {
    public static volatile C0M8 A02;
    public final C018508q A00;
    public final C0E7 A01;

    public C0M8(C018508q c018508q, C0E7 c0e7) {
        this.A00 = c018508q;
        this.A01 = c0e7;
    }

    public static C0M8 A00() {
        if (A02 == null) {
            synchronized (C0M8.class) {
                if (A02 == null) {
                    A02 = new C0M8(C018508q.A00(), C0E7.A00());
                }
            }
        }
        return A02;
    }

    public void A01(Activity activity, boolean z, C0M9 c0m9) {
        int i;
        if (!this.A01.A05()) {
            if (C0E7.A02(activity)) {
                i = R.string.no_network_cannot_unblock_airplane;
                if (z) {
                    i = R.string.no_network_cannot_block_airplane;
                }
            } else {
                i = R.string.no_network_cannot_unblock;
                if (z) {
                    i = R.string.no_network_cannot_block;
                }
            }
            this.A00.A07(i, 0);
            return;
        }
        this.A00.A0B((C0B5) activity);
        c0m9.A5l();
    }
}
