package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.PowerManager;
import android.text.TextUtils;
import com.whatsapp.push.WAFbnsPreloadReceiver;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Ev  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03220Ev extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        C19160ux c19160ux = C19160ux.A02;
        if (c19160ux == null) {
            c19160ux = new C19160ux(context);
            C19160ux.A02 = c19160ux;
        }
        final Runnable runnable = new Runnable() { // from class: X.0uv
            @Override // java.lang.Runnable
            public void run() {
                String targetPackage;
                AbstractC03220Ev abstractC03220Ev = AbstractC03220Ev.this;
                Context context2 = context;
                Intent intent2 = intent;
                if (abstractC03220Ev != null) {
                    if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent2.getAction())) {
                        Bundle bundleExtra = intent2.getBundleExtra("auth_bundle");
                        if (bundleExtra == null) {
                            Log.e("FBNSPreloadAuthUtils/Invalid auth bundle");
                            return;
                        }
                        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("auth_pending_intent");
                        if (pendingIntent == null) {
                            Log.e("FBNSPreloadAuthUtils/Invalid auth intent");
                            return;
                        }
                        if (Build.VERSION.SDK_INT >= 17) {
                            targetPackage = pendingIntent.getCreatorPackage();
                        } else {
                            targetPackage = pendingIntent.getTargetPackage();
                        }
                        if (!C05120Nk.A01(context2, targetPackage)) {
                            return;
                        }
                        String stringExtra = intent2.getStringExtra("receive_type");
                        if ("message".equals(stringExtra)) {
                            String stringExtra2 = intent2.getStringExtra("data");
                            C42121v8 c42121v8 = ((WAFbnsPreloadReceiver) abstractC03220Ev).A01;
                            if (!TextUtils.isEmpty(stringExtra2)) {
                                try {
                                    JSONObject jSONObject = new JSONObject(stringExtra2).getJSONObject("params");
                                    c42121v8.A00(jSONObject.optString("id", null), jSONObject.optString("ip", null), jSONObject.optString("cl_sess", null), jSONObject.optString("mmsov", null), jSONObject.optString("fbips", null), jSONObject.optString("er_ri", null), "1".equals(jSONObject.optString("notify", null)), jSONObject.optString("push_id", null), jSONObject.optString("push_ts", null), 1);
                                } catch (JSONException e) {
                                    StringBuilder sb = new StringBuilder("WAFbnsPreloadReceiver/handleFbnsPush: invalid payload:");
                                    sb.append(stringExtra2);
                                    Log.e(sb.toString(), e);
                                }
                            }
                            String stringExtra3 = intent2.getStringExtra("extra_notification_sender");
                            String stringExtra4 = intent2.getStringExtra("extra_notification_id");
                            if (stringExtra3 == null || stringExtra3.isEmpty() || stringExtra4 == null || stringExtra4.isEmpty()) {
                                return;
                            }
                            Intent intent3 = new Intent("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
                            intent3.putExtra("extra_notification_id", stringExtra4);
                            intent3.putExtra("extra_processor_completed", true);
                            if (!"com.facebook.services".equals(stringExtra3) && !"com.facebook.services.dev".equals(stringExtra3)) {
                                C000200d.A13("FBNSPreloadIPC/Unknown package ", stringExtra3);
                                return;
                            }
                            try {
                                intent3.setPackage(stringExtra3);
                                C05120Nk.A00(context2, intent3);
                                context2.sendBroadcast(intent3);
                                return;
                            } catch (RuntimeException e2) {
                                if (e2.getCause() instanceof DeadObjectException) {
                                    return;
                                }
                                throw e2;
                            }
                        } else if ("registered".equals(stringExtra)) {
                            String stringExtra5 = intent2.getStringExtra("data");
                            C42131v9 c42131v9 = ((WAFbnsPreloadReceiver) abstractC03220Ev).A00;
                            if (!c42131v9.A00.A0E(C01C.A0s)) {
                                return;
                            }
                            if (TextUtils.isEmpty(stringExtra5)) {
                                Log.e("FbnsTokenManager/onTokenRecevied tokenFromFb is null");
                                return;
                            }
                            synchronized (c42131v9) {
                                C000500h c000500h = c42131v9.A02;
                                SharedPreferences sharedPreferences = c000500h.A00;
                                String string = sharedPreferences.getString("fbns_token", null);
                                if (stringExtra5.equals(sharedPreferences.getString("last_server_fbns_token", null))) {
                                    Log.w("FbnsTokenManager/onTokenReceived called with token that is already on the server side");
                                } else {
                                    c42131v9.A03.A0Q(stringExtra5, "fbns", null);
                                    c000500h.A0D().putString("last_server_fbns_token", stringExtra5).apply();
                                }
                                if (stringExtra5.equals(string)) {
                                    Log.w("FbnsTokenManager/onTokenRecevied token already saved");
                                } else {
                                    c000500h.A0D().putString("fbns_token", stringExtra5).putInt("fbns_app_vers", 210915004).apply();
                                }
                            }
                            return;
                        } else if ("unregistered".equals(stringExtra) || !"reg_error".equals(stringExtra)) {
                            return;
                        } else {
                            intent2.getStringExtra("data");
                            return;
                        }
                    }
                    return;
                }
                throw null;
            }
        };
        final PowerManager.WakeLock newWakeLock = c19160ux.A00.newWakeLock(1, "FBNSPreloadWakefulExecutor");
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire(60000L);
        try {
            c19160ux.A01.execute(new Runnable() { // from class: X.0uw
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        newWakeLock.release();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            Log.e("FBNSPreloadWakefulExecutor/Notification skipped", e);
            newWakeLock.release();
        }
    }
}
