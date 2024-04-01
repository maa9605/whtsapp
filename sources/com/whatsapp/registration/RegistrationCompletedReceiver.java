package com.whatsapp.registration;

import X.AnonymousClass029;
import X.C000200d;
import X.C000500h;
import X.C02L;
import X.C0C5;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class RegistrationCompletedReceiver extends BroadcastReceiver {
    public C02L A00;
    public C000500h A01;
    public final Object A02;
    public volatile boolean A03;

    public RegistrationCompletedReceiver() {
        this(0);
    }

    public RegistrationCompletedReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A2D(this);
                    this.A03 = true;
                }
            }
        }
        Log.i("received broadcast that smba was registered on this device");
        if (this.A00.A0A(UserJid.getNullable(intent.getStringExtra("jid")))) {
            Log.i("smba registered this clients phone number");
            C000200d.A0j(this.A01, "registration_biz_registered_on_device", true);
        }
    }
}
