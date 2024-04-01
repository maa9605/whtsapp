package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Ee */
/* loaded from: classes.dex */
public class C03100Ee extends AbstractC03110Ef {
    public C03130Eh A00;
    public C03120Eg A01;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!super.A01) {
            synchronized (super.A00) {
                if (!super.A01) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A1v(this);
                    super.A01 = true;
                }
            }
        }
        int intExtra = intent.getIntExtra("state", 0);
        if (this.A00.A00 && intExtra < 1) {
            this.A01.A03();
        }
        this.A00.A00 = intExtra >= 1;
        C000200d.A0q("headserplugbroadcastReceiver/headset ", intExtra);
    }
}
