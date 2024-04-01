package X;

import android.app.Activity;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;

/* renamed from: X.4AS  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4AS {
    public final C0GZ A00;

    public C4AS(C0GZ c0gz) {
        this.A00 = c0gz;
    }

    public void A00(Activity activity) {
        boolean z;
        C0GZ c0gz = this.A00;
        if (c0gz.A08()) {
            z = true;
        } else {
            c0gz.A09();
            z = false;
        }
        AnonymousClass029.A19(activity, IndiaUpiPayIntentReceiverActivity.class, z);
    }
}
