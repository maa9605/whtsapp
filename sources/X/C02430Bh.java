package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.0Bh */
/* loaded from: classes.dex */
public final class C02430Bh {
    public C02440Bj A00;
    public Boolean A01;
    public final boolean A02;
    public final /* synthetic */ FirebaseInstanceId A03;

    public C02430Bh(FirebaseInstanceId firebaseInstanceId, C0BK c0bk) {
        boolean z;
        Boolean bool;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.A03 = firebaseInstanceId;
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessaging");
        } catch (ClassNotFoundException unused) {
            C08U c08u = firebaseInstanceId.A02;
            c08u.A03();
            Context context = c08u.A00;
            Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent.setPackage(context.getPackageName());
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            z = (resolveService == null || resolveService.serviceInfo == null) ? false : false;
        }
        z = true;
        this.A02 = z;
        C08U c08u2 = this.A03.A02;
        c08u2.A03();
        Context context2 = c08u2.A00;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = context2.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            bool = null;
        }
        this.A01 = bool;
        if (bool == null && this.A02) {
            C02440Bj c02440Bj = new C02440Bj(this);
            this.A00 = c02440Bj;
            Executor executor = c0bk.A02;
            synchronized (c0bk) {
                C07K.A1P(C02450Bk.class);
                C07K.A1P(c02440Bj);
                C07K.A1P(executor);
                Map map = c0bk.A01;
                if (!map.containsKey(C02450Bk.class)) {
                    map.put(C02450Bk.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) map.get(C02450Bk.class)).put(c02440Bj, executor);
            }
        }
    }

    public final synchronized boolean A00() {
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.A02) {
            C08U c08u = this.A03.A02;
            c08u.A03();
            if (c08u.A07.get()) {
                return true;
            }
        }
        return false;
    }
}
