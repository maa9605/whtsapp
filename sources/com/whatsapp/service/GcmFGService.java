package com.whatsapp.service;

import X.C005402l;
import X.C0DU;
import X.C22F;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public final class GcmFGService extends C22F {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // X.C22F, X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        Log.i("gcmfgservice/onCreate");
        super.onCreate();
    }

    @Override // X.C0IL, android.app.Service
    public void onDestroy() {
        Log.i("gcmfgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("gcmfgservice/onStartCommand:");
        sb.append(intent);
        sb.append(" startId:");
        sb.append(i2);
        Log.i(sb.toString());
        C005402l A00 = C0DU.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A0B(getString(R.string.localized_app_name));
        A00.A0A(getString(R.string.localized_app_name));
        A00.A09(getString(R.string.notification_text_gcm_fg));
        A00.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
        int i3 = Build.VERSION.SDK_INT;
        A00.A03 = i3 >= 26 ? -1 : -2;
        if (i3 != 24) {
            A00.A07.icon = R.drawable.notifybar;
        }
        Notification A01 = A00.A01();
        if (i3 == 24) {
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(this, A01);
            recoverBuilder.setSmallIcon(Icon.createWithBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.notifybar)));
            A01(i2, 210915015, recoverBuilder.build());
            return 1;
        }
        A01(i2, 11, A01);
        return 1;
    }
}
