package com.whatsapp.voipcalling;

import X.C000200d;
import X.C2U9;
import X.C41641uH;
import X.C49032Ic;
import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public final class VoiceFGService extends C2U9 {
    public static volatile Notification A01;
    public C41641uH A00;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // X.C2U9, X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        Log.i("voicefgservice/onCreate");
        super.onCreate();
    }

    @Override // X.C0IL, android.app.Service
    public void onDestroy() {
        Log.i("voicefgservice/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("voicefgservice/onStartCommand:");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if (!"hangup_call".equals(action) && !"reject_call".equals(action)) {
            if ("com.whatsapp.service.VoiceFgService.START".equals(action) && A01 != null) {
                if (intent.getBooleanExtra("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", false)) {
                    stopForeground(true);
                }
                A01(i2, intent.getIntExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23), A01);
                return 2;
            }
            StringBuilder A0P = C000200d.A0P("voicefgservice/onStartCommand service started with unknown action:");
            A0P.append(intent.getAction());
            Log.e(A0P.toString());
            return 2;
        }
        C41641uH c41641uH = this.A00;
        c41641uH.A00.obtainMessage(1, new C49032Ic(action, intent.getExtras(), null)).sendToTarget();
        return 2;
    }
}
