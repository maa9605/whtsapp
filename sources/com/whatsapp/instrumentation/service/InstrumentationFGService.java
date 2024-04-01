package com.whatsapp.instrumentation.service;

import X.C005402l;
import X.C0DU;
import X.C0IN;
import X.C12V;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class InstrumentationFGService extends C12V {
    public Handler A00 = new Handler();
    public Runnable A01 = new RunnableEBaseShape8S0100000_I1_0(this, 40);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // X.C0IL, android.app.Service
    public void onDestroy() {
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("instrumentationfgservice/onStartCommand:");
        sb.append(intent);
        sb.append(" startId:");
        sb.append(i2);
        Log.i(sb.toString());
        C005402l A00 = C0DU.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A0B(((C0IN) this).A01.A06(R.string.localized_app_name));
        A00.A0A(((C0IN) this).A01.A06(R.string.localized_app_name));
        A00.A09(((C0IN) this).A01.A06(R.string.notification_text_instrumentation_fg));
        A00.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
        A00.A03 = Build.VERSION.SDK_INT >= 26 ? -1 : -2;
        A00.A07.icon = R.drawable.notifybar;
        A01(i2, 25, A00.A01());
        this.A00.removeCallbacks(this.A01);
        this.A00.postDelayed(this.A01, 5000L);
        return 2;
    }
}
