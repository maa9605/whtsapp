package com.whatsapp.service;

import X.AbstractServiceC44811zh;
import X.C001200o;
import X.C005402l;
import X.C01B;
import X.C0DU;
import X.C0EE;
import X.C0ER;
import X.C20R;
import X.C41721uP;
import X.C41741uR;
import X.InterfaceC002901k;
import X.RunnableC71393Vy;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public final class MDSyncService extends AbstractServiceC44811zh {
    public int A00;
    public C01B A01;
    public C001200o A02;
    public C41741uR A03;
    public C0EE A04;
    public C41721uP A05;
    public C0ER A06;
    public RunnableC71393Vy A07;
    public InterfaceC002901k A08;
    public boolean A09;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // X.AbstractServiceC44811zh, X.C0IL, X.C0IM, android.app.Service
    public void onCreate() {
        Log.i("md-sync-service/onCreate");
        super.onCreate();
    }

    @Override // X.C0IL, android.app.Service
    public void onDestroy() {
        Log.i("md-sync-service/onDestroy");
        RunnableC71393Vy runnableC71393Vy = this.A07;
        if (runnableC71393Vy != null) {
            synchronized (runnableC71393Vy) {
                runnableC71393Vy.A04.set(true);
            }
            this.A07 = null;
        }
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("md-sync-service/onStartCommand:");
        sb.append(intent);
        Log.i(sb.toString());
        C005402l A00 = C0DU.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A09 = PendingIntent.getActivity(this, 0, C20R.A00(this, this.A01, this.A04, false), 0);
        A00.A03 = Build.VERSION.SDK_INT >= 26 ? -1 : -2;
        A00.A0B(getString(R.string.notification_ticker_companion_client));
        A00.A0A(getString(R.string.notification_ticker_companion_client));
        A00.A09(getString(R.string.notification_text_companion_client));
        A00.A07.icon = R.drawable.notify_web_client_connected;
        A01(i2, 210915028, A00.A01());
        if (intent != null) {
            if ("com.whatsapp.service.MDSyncService.STOP_HISTORY_SYNC".equals(intent.getAction())) {
                this.A09 = false;
            } else if ("com.whatsapp.service.MDSyncService.START_HISTORY_SYNC".equals(intent.getAction())) {
                if (this.A07 == null) {
                    this.A09 = true;
                    RunnableC71393Vy runnableC71393Vy = new RunnableC71393Vy(this.A02, this.A06, this.A05, this.A03);
                    this.A07 = runnableC71393Vy;
                    this.A08.AS1(runnableC71393Vy);
                }
            } else if ("com.whatsapp.service.MDSyncService.RMR_STARTED".equals(intent.getAction())) {
                this.A00++;
            } else if ("com.whatsapp.service.MDSyncService.RMR_COMPLETED".equals(intent.getAction())) {
                this.A00--;
            }
        }
        if (!this.A09 && this.A00 <= 0) {
            this.A06.A02(this.A02.A00, MDSyncService.class);
        }
        return 1;
    }
}
