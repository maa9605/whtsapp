package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0Es  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03190Es extends BroadcastReceiver {
    public C03090Ed A00;
    public volatile boolean A02 = false;
    public final Object A01 = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A27(this);
                    this.A02 = true;
                }
            }
        }
        Log.i("MessagelessPaymentNotification/dismiss");
        C03090Ed c03090Ed = this.A00;
        if (TextUtils.isEmpty(c03090Ed.A05.A02("unread_messageless_transaction_ids"))) {
            return;
        }
        c03090Ed.A05.A06("unread_messageless_transaction_ids", "");
        c03090Ed.A01.A05(null, 17);
    }
}
