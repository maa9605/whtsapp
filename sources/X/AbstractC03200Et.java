package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.phoneid.PhoneIdRequestReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.0Et */
/* loaded from: classes.dex */
public abstract class AbstractC03200Et extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String targetPackage;
        C04970Mr ACN = ((PhoneIdRequestReceiver) this).A00.ACN();
        if ("com.facebook.GET_PHONE_ID".equals(intent.getAction())) {
            Bundle resultExtras = getResultExtras(true);
            PendingIntent pendingIntent = (PendingIntent) resultExtras.getParcelable("auth");
            if (pendingIntent == null) {
                StringBuilder sb = new StringBuilder("phoneid-request-receiver/on-receive invalid auth intent; data=");
                sb.append(resultExtras);
                Log.e(sb.toString());
                return;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                targetPackage = pendingIntent.getCreatorPackage();
            } else {
                targetPackage = pendingIntent.getTargetPackage();
            }
            try {
                if (AnonymousClass029.A1M(context.getPackageManager().getPackageInfo(targetPackage, 64))) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("timestamp", ACN.A00);
                    setResult(-1, ACN.A01, bundle);
                }
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sb2 = new StringBuilder("cannot find package; packageName=");
                sb2.append(targetPackage);
                Log.e(sb2.toString(), e);
            }
        }
    }
}
