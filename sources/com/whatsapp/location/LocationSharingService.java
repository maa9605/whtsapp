package com.whatsapp.location;

import X.AbstractC005302j;
import X.AbstractServiceC453621n;
import X.AnonymousClass012;
import X.C000200d;
import X.C000500h;
import X.C005402l;
import X.C02160Ac;
import X.C02180Ae;
import X.C02E;
import X.C02F;
import X.C0DU;
import X.C0G2;
import X.C0G4;
import X.C0IK;
import X.C2AX;
import X.C41461tx;
import X.C451520p;
import X.C62812yb;
import X.InterfaceC453721o;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* loaded from: classes2.dex */
public class LocationSharingService extends AbstractServiceC453621n implements InterfaceC453721o {
    public static volatile boolean A0H;
    public long A00;
    public C0IK A01;
    public C0G2 A02;
    public C0G4 A03;
    public C02E A04;
    public AnonymousClass012 A05;
    public C02F A06;
    public C000500h A07;
    public C41461tx A08;
    public C2AX A09;
    public C62812yb A0A;
    public C451520p A0B;
    public final Handler A0C = new Handler(Looper.getMainLooper());
    public final Runnable A0D = new RunnableEBaseShape3S0100000_I0_3(this, 32);
    public final Runnable A0E = new RunnableEBaseShape3S0100000_I0_3(this, 31);
    public volatile boolean A0F;
    public volatile boolean A0G;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(Context context) {
        C02160Ac.A06(context, new Intent(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING"));
    }

    public static void A01(Context context, C41461tx c41461tx) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (c41461tx.A0f()) {
                C02160Ac.A06(context, new Intent(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_PERSISTENT_LOCATION_REPORTING"));
            } else if (!A0H) {
            } else {
                A00(context);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
        if (r3.A08.A0f() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02() {
        /*
            r3 = this;
            boolean r0 = r3.A0F
            if (r0 != 0) goto L16
            boolean r0 = r3.A0G
            if (r0 != 0) goto L16
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L49
            X.1tx r0 = r3.A08
            boolean r0 = r0.A0f()
            if (r0 == 0) goto L49
        L16:
            java.lang.String r0 = "LocationSharingService/stopSelfIfNeeded/service not stopped: "
            java.lang.StringBuilder r2 = X.C000200d.A0P(r0)
            boolean r0 = r3.A0F
            r2.append(r0)
            java.lang.String r1 = "|"
            r2.append(r1)
            boolean r0 = r3.A0G
            r2.append(r0)
            r2.append(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L3d
            X.1tx r0 = r3.A08
            boolean r1 = r0.A0f()
            r0 = 1
            if (r1 != 0) goto L3e
        L3d:
            r0 = 0
        L3e:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i(r0)
            return
        L49:
            r3.stopSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.LocationSharingService.A02():void");
    }

    @Override // X.AbstractServiceC453621n, android.app.Service
    public void onCreate() {
        Log.i("LocationSharingService/onCreate");
        super.onCreate();
        C62812yb c62812yb = new C62812yb(this.A04, this.A07, this.A02, this.A01, this.A03, this);
        this.A0A = c62812yb;
        try {
            PowerManager A0D = c62812yb.A08.A0D();
            if (A0D == null) {
                Log.w("MyLocationUpdater/onCreate pm=null");
            } else {
                PowerManager.WakeLock wakeLock = c62812yb.A03;
                if (wakeLock == null) {
                    wakeLock = C02180Ae.A0R(A0D, 1, "ShareLocationService");
                    c62812yb.A03 = wakeLock;
                }
                if (wakeLock != null && !wakeLock.isHeld()) {
                    c62812yb.A03.acquire(5000L);
                }
            }
        } catch (RuntimeException e) {
            Log.e("MyLocationUpdater/onCreate/PowerManager exception", e);
        }
        String string = c62812yb.A09.A00.getString("location_shared_duration", "");
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split(";")) {
                String[] split = str.split(",");
                if (split.length == 2) {
                    int intValue = Integer.valueOf(split[0]).intValue();
                    if ((intValue * 1000) + 86400000 >= currentTimeMillis) {
                        c62812yb.A04.put(intValue, Integer.valueOf(split[1]).intValue());
                    }
                }
            }
        }
        this.A0C.postDelayed(this.A0D, 42000L);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.i("LocationSharingService/onDestroy");
        C41461tx c41461tx = this.A08;
        synchronized (c41461tx.A0R) {
            c41461tx.A00 = 0;
        }
        stopForeground(true);
        A0H = false;
        this.A01.A08 = false;
        Handler handler = this.A0C;
        handler.removeCallbacks(this.A0D);
        handler.removeCallbacks(this.A0E);
        C62812yb c62812yb = this.A0A;
        c62812yb.A05.A06(c62812yb);
        c62812yb.A00();
        PowerManager.WakeLock wakeLock = c62812yb.A03;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        c62812yb.A03.release();
        c62812yb.A03 = null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("LocationSharingService/onStartCommand intent=");
        sb.append(intent);
        sb.append(" permission=");
        sb.append(this.A06.A04());
        Log.i(sb.toString());
        C005402l A00 = C0DU.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A0B(getString(R.string.notification_ticker_live_location_fg));
        A00.A0A(getString(R.string.notification_ticker_live_location_fg));
        A00.A09 = PendingIntent.getActivity(this, 0, new Intent(this, LiveLocationPrivacyActivity.class), 0);
        A00.A03 = Build.VERSION.SDK_INT >= 26 ? -1 : -2;
        if (this.A06.A04()) {
            A00.A09(getString(R.string.notification_text_live_location_fg));
            A00.A07.icon = R.drawable.notify_live_location;
        } else {
            A00.A09(getString(R.string.live_location_fix_location_update));
            A00.A07.icon = R.drawable.notifybar_error;
        }
        startForeground(12, A00.A01());
        A0H = true;
        this.A01.A08 = true;
        if (intent != null) {
            if ("com.whatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE".equals(intent.getAction())) {
                C451520p c451520p = this.A0B;
                String stringExtra = intent.getStringExtra("id");
                AbstractC005302j A02 = AbstractC005302j.A02(intent.getStringExtra("chatJid"));
                if (A02 != null) {
                    c451520p.A04(stringExtra, A02, intent.getLongExtra("duration", -1L), true);
                    A02();
                    return 1;
                }
                throw null;
            } else if ("com.whatsapp.ShareLocationService.STOP_LOCATION_REPORTING".equals(intent.getAction())) {
                this.A0F = false;
                A02();
                return 1;
            }
        }
        long j = 42000;
        if (intent != null) {
            if ("com.whatsapp.ShareLocationService.ACTION_START_LOCATION_UPDATES_FOR_WEB".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("duration", 42000L);
                Handler handler = this.A0C;
                Runnable runnable = this.A0E;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, longExtra);
                this.A0G = true;
                C000200d.A0u("LocationSharingService/onStartCommand/start location updates; duration=", longExtra);
                this.A0A.A02("web-client-updates");
                return 1;
            } else if ("com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB".equals(intent.getAction())) {
                Log.i("LocationSharingService/onStartCommand/stop location updates");
                this.A0G = false;
                A02();
                return 1;
            } else {
                j = intent.getLongExtra("duration", 42000L);
            }
        }
        Handler handler2 = this.A0C;
        Runnable runnable2 = this.A0D;
        handler2.removeCallbacks(runnable2);
        handler2.postDelayed(runnable2, j);
        this.A00 = this.A05.A05() + j;
        this.A0F = true;
        C000200d.A1I(C000200d.A0S("LocationSharingService/onStartCommand/start; duration=", j, "; maxEndTime="), this.A00);
        this.A0A.A02("location-sharing-service");
        return 1;
    }
}
