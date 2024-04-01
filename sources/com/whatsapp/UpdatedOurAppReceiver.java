package com.whatsapp;

import X.AbstractC004101x;
import X.AnonymousClass029;
import X.C000500h;
import X.C02L;
import X.C03080Ec;
import X.C03090Ed;
import X.C05G;
import X.C0C5;
import X.C40301ry;
import X.C42021ut;
import X.C42031uu;
import X.RunnableC07180Xe;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class UpdatedOurAppReceiver extends BroadcastReceiver {
    public C02L A00;
    public C000500h A01;
    public final Object A02;
    public volatile boolean A03;

    public UpdatedOurAppReceiver() {
        this(0);
    }

    public UpdatedOurAppReceiver(int i) {
        this.A03 = false;
        this.A02 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A1y(this);
                    this.A03 = true;
                }
            }
        }
        if (intent == null || !"android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            return;
        }
        Log.i("received broadcast that com.whatsapp was updated");
        this.A01.A00.getInt("c2dm_app_vers", 0);
        this.A01.A00.getString("c2dm_reg_id", null);
        C02L c02l = this.A00;
        c02l.A05();
        if (c02l.A00 != null) {
            Log.i("updatedappreceiver/request-refresh");
            RegistrationIntentService.A01(context.getApplicationContext());
        } else {
            Log.i("updateappreceiver/skip-refresh");
        }
        if (C05G.A00().A02()) {
            Log.i("updatedappreceiver/update-notif");
            C40301ry.A00().A04();
            C03080Ec.A00().A05(true);
            C03090Ed A00 = C03090Ed.A00();
            A00.A0A.AS1(new RunnableC07180Xe(A00));
            C42021ut.A00().A01();
            C42031uu.A00().A02();
        }
        AbstractC004101x.A00(this.A01.A07());
    }
}
