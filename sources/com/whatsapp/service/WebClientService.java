package com.whatsapp.service;

import X.AbstractServiceC43061wn;
import X.C005402l;
import X.C01B;
import X.C0DU;
import X.C0EE;
import X.C20R;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public final class WebClientService extends AbstractServiceC43061wn {
    public C01B A00;
    public C0EE A01;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // X.AbstractServiceC43061wn, X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        Log.i("webclientservice/onCreate");
        super.onCreate();
    }

    @Override // X.C0IL, android.app.Service
    public void onDestroy() {
        Log.i("webclientservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("webclientservice/onStartCommand:");
        sb.append(intent);
        Log.i(sb.toString());
        C005402l A00 = C0DU.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A09 = PendingIntent.getActivity(this, 0, C20R.A00(this, this.A00, this.A01, false), 0);
        A00.A03 = Build.VERSION.SDK_INT >= 26 ? -1 : -2;
        if (intent != null && intent.getBooleanExtra("isPortal", false)) {
            A00.A0B(getString(R.string.notification_ticker_portal_client));
            A00.A0A(getString(R.string.notification_ticker_portal_client));
            A00.A09(getString(R.string.notification_text_portal_client));
        } else {
            A00.A0B(getString(R.string.notification_ticker_web_client));
            A00.A0A(getString(R.string.notification_ticker_web_client));
            A00.A09(getString(R.string.notification_text_web_client));
        }
        A00.A07.icon = R.drawable.notify_web_client_connected;
        A01(i2, 9, A00.A01());
        return 1;
    }
}
