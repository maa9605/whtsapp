package com.whatsapp.notification;

import X.AnonymousClass029;
import X.C005402l;
import X.C018508q;
import X.C018608r;
import X.C02E;
import X.C02O;
import X.C03070Ea;
import X.C05W;
import X.C06C;
import X.C07940aL;
import X.C0DU;
import X.C0NE;
import X.C0PW;
import X.C12760k1;
import X.C12830k9;
import X.C40301ry;
import X.C41221tZ;
import X.C50512Sb;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public final class AndroidWear extends C0PW {
    public static C0NE A08;
    public static final int[] A09 = {R.string.android_wear_smile_emoji, R.string.android_wear_yes, R.string.android_wear_no, R.string.android_wear_on_my_way, R.string.android_wear_ok, R.string.android_wear_see_you_soon, R.string.android_wear_haha, R.string.android_wear_lol, R.string.android_wear_nice, R.string.android_wear_cant_talk, R.string.android_wear_sad_emoji, R.string.android_wear_thanks};
    public C018508q A00;
    public C018608r A01;
    public C05W A02;
    public C41221tZ A03;
    public C02E A04;
    public C40301ry A05;
    public C02O A06;
    public C03070Ea A07;

    public static C07940aL A00(Context context, C06C c06c) {
        C12760k1 c12760k1 = new C12760k1(R.drawable.ic_notif_mark_read, context.getString(R.string.mark_read), PendingIntent.getService(context, 0, new Intent("com.whatsapp.intent.action.MARK_AS_READ", ContentUris.withAppendedId(C50512Sb.A00, c06c.A01()), context, AndroidWear.class), 134217728));
        c12760k1.A00 = 2;
        c12760k1.A03 = false;
        return c12760k1.A00();
    }

    public static boolean A01() {
        return Build.VERSION.SDK_INT >= 18;
    }

    @Override // X.C0PW, X.C0O9, android.app.IntentService, android.app.Service
    public void onCreate() {
        Log.i("android-wear/onCreate");
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Log.i("android-wear/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        C06C A05;
        if (intent == null) {
            return;
        }
        if (!this.A07.A05()) {
            Log.i("androidwear/tosupdate/not allowed");
            return;
        }
        Bundle A00 = C12830k9.A00(intent);
        if (C50512Sb.A01(intent.getData()) && (A05 = this.A02.A05(C50512Sb.A00(intent.getData()))) != null) {
            if (A00 != null) {
                CharSequence charSequence = A00.getCharSequence("android_wear_voice_input");
                String trim = charSequence != null ? charSequence.toString().trim() : null;
                if (!AnonymousClass029.A1R(this.A04, this.A06, trim)) {
                    Log.i("androidwear/voiceinputfromandroidwear/message is empty");
                    this.A00.A02.post(new RunnableEBaseShape4S0100000_I0_4(this, 34));
                    return;
                }
                this.A00.A02.post(new RunnableEBaseShape0S1200000_I0(this, trim, A05, 14));
                return;
            } else if (!"com.whatsapp.intent.action.MARK_AS_READ".equals(intent.getAction())) {
                return;
            } else {
                this.A00.A02.post(new RunnableEBaseShape3S0200000_I0_3(this, A05, 25));
                return;
            }
        }
        this.A00.A02.post(new RunnableEBaseShape4S0100000_I0_4(this, 35));
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("androidwear/onStartCommand: ");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent != null && intent.getBooleanExtra("is_foreground", false)) {
            intent.getExtras();
            intent.getBooleanExtra("is_foreground", false);
            C005402l A00 = C0DU.A00(this);
            A00.A0J = "other_notifications@1";
            A00.A0B(getString(R.string.localized_app_name));
            A00.A0A(getString(R.string.localized_app_name));
            A00.A09(getString(R.string.sending_message));
            A00.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
            A00.A03 = Build.VERSION.SDK_INT >= 26 ? -1 : -2;
            A00.A07.icon = R.drawable.notifybar;
            startForeground(18, A00.A01());
        }
        return super.onStartCommand(intent, i, i2);
    }
}
