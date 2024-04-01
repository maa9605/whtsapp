package com.whatsapp.service;

import X.AbstractServiceC81053oH;
import X.C03120Eg;
import X.C09560eJ;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes2.dex */
public class BackgroundMediaControlService extends AbstractServiceC81053oH {
    public C03120Eg A00;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        C09560eJ A01 = this.A00.A01();
        if (str != null) {
            if (str.equals("com.whatsapp.service.BackgroundMediaControlService.STOP")) {
                this.A00.A03();
            } else if (str.equals("com.whatsapp.service.BackgroundMediaControlService.START") && A01 != null) {
                A01.A0F(0);
            }
        }
        stopSelf();
        return 2;
    }
}
