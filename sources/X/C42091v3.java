package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1v3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42091v3 extends BroadcastReceiver {
    public C42021ut A00;
    public volatile boolean A02 = false;
    public final Object A01 = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A28(this);
                    this.A02 = true;
                }
            }
        }
        Log.i("PaymentMethodUpdateNotification/dismiss");
        C42021ut c42021ut = this.A00;
        if (TextUtils.isEmpty(c42021ut.A04.A02("unread_payment_method_credential_ids"))) {
            return;
        }
        c42021ut.A04.A06("unread_payment_method_credential_ids", "");
        c42021ut.A01.A05(null, 22);
    }
}
