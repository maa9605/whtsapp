package com.whatsapp.registration;

import X.AnonymousClass029;
import X.C002301c;
import X.C005102h;
import X.C005402l;
import X.C05170Np;
import X.C05G;
import X.C0C5;
import X.C0DU;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class RegRetryVerificationReceiver extends BroadcastReceiver {
    public C005102h A00;
    public C002301c A01;
    public C05G A02;
    public final Object A03;
    public volatile boolean A04;

    public RegRetryVerificationReceiver() {
        this(0);
    }

    public RegRetryVerificationReceiver(int i) {
        this.A04 = false;
        this.A03 = new Object();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    ((C0C5) AnonymousClass029.A0Y(context)).A2C(this);
                    this.A04 = true;
                }
            }
        }
        Log.i("reg-retry-verification-receiver/timeout");
        if (!this.A02.A02()) {
            long currentTimeMillis = System.currentTimeMillis();
            String A06 = this.A01.A06(R.string.localized_app_name);
            String A0D = this.A01.A0D(R.string.verification_retry_headline_app_name, A06);
            String A062 = this.A01.A06(R.string.verification_retry_message);
            PendingIntent activity = PendingIntent.getActivity(context, 1, new Intent(context, Main.class), 0);
            C005402l A00 = C0DU.A00(context);
            A00.A0J = "critical_app_alerts@1";
            A00.A0B(A0D);
            A00.A07.when = currentTimeMillis;
            A00.A03(3);
            A00.A05(16, true);
            A00.A0A(A06);
            A00.A09(A062);
            C05170Np c05170Np = new C05170Np();
            c05170Np.A07(A062);
            A00.A08(c05170Np);
            A00.A09 = activity;
            A00.A07.icon = R.drawable.notifybar;
            this.A00.A03(null, 1, A00.A01());
            return;
        }
        Log.i("app-init/async/registrationretry/verified");
    }
}
