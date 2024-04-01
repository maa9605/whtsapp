package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.whatsapp.util.Log;

/* renamed from: X.1v0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42081v0 extends BroadcastReceiver {
    public C000500h A00;
    public volatile boolean A02 = false;
    public final Object A01 = new Object();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A23(this);
                    this.A02 = true;
                }
            }
        }
        StringBuilder A0P = C000200d.A0P("app/shutdown/external_media/state/");
        A0P.append(Environment.getExternalStorageState());
        Log.i(A0P.toString());
        C000200d.A0g(this.A00, "logins_with_messages", 0);
    }
}
