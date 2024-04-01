package com.whatsapp.messaging;

import X.C000200d;
import X.C005002g;
import X.C018508q;
import X.C27H;
import X.C41901uh;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class MessageService extends C27H {
    public C018508q A00;
    public C005002g A01;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(Context context) {
        try {
            context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
            Log.i("messageservice/startService success");
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 26) {
                e.getMessage();
                return;
            }
            throw e;
        }
    }

    public static void A01(Context context, C41901uh c41901uh) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                context.startService(new Intent(context, MessageService.class).setAction("com.whatsapp.messaging.MessageService.START"));
                Log.i("messageservice/startOnForeground success");
            } catch (Exception e) {
                StringBuilder A0P = C000200d.A0P("messageservice/startOnForeground failed:");
                A0P.append(e.getMessage());
                Log.e(A0P.toString());
                c41901uh.A01();
            }
        }
    }

    @Override // X.C27H, android.app.Service
    public void onCreate() {
        Log.i("messageservice/onCreate");
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26 && this.A00 == null) {
            throw null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("messageservice/onDestroy");
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 26 && this.A00 == null) {
            throw null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (!C005002g.A01() && intent != null) {
            intent.getAction();
        }
        return 1;
    }
}
