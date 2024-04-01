package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0d8 */
/* loaded from: classes.dex */
public class C09360d8 {
    public static volatile C09360d8 A01;
    public final AnonymousClass012 A00;

    public C09360d8(AnonymousClass012 anonymousClass012) {
        this.A00 = anonymousClass012;
    }

    public static void A00(C0BA c0ba, DialogFragment dialogFragment) {
        if (c0ba.A0W) {
            return;
        }
        AbstractC02800Cx A0B = c0ba.A0B();
        String name = dialogFragment.getClass().getName();
        if (A0B.A0Q.A01(name) == null) {
            dialogFragment.A14(c0ba.A0B(), name);
        }
    }

    public void A01(C0BA c0ba, Intent intent) {
        C002701i.A1C(intent, c0ba.getClass().getSimpleName(), this.A00);
        c0ba.A0i(intent);
    }
}
