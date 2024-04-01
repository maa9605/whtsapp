package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* renamed from: X.0BY  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0BY {
    public int A00;
    public int A01 = 0;
    public String A02;
    public String A03;
    public final Context A04;

    public C0BY(Context context) {
        this.A04 = context;
    }

    public static String A00(C08U c08u) {
        c08u.A03();
        C08W c08w = c08u.A02;
        String str = c08w.A04;
        if (str != null) {
            return str;
        }
        c08u.A03();
        String str2 = c08w.A01;
        if (str2.startsWith("1:")) {
            String[] split = str2.split(":");
            if (split.length < 2) {
                return null;
            }
            String str3 = split[1];
            if (str3.isEmpty()) {
                return null;
            }
            return str3;
        }
        return str2;
    }

    public final synchronized int A01() {
        int i;
        int i2 = this.A01;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.A04.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!AnonymousClass088.A1s()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.A01 = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.A01 = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (AnonymousClass088.A1s()) {
            this.A01 = 2;
            i = 2;
        } else {
            this.A01 = 1;
            i = 1;
        }
        return i;
    }

    public final synchronized int A02() {
        PackageInfo A03;
        if (this.A00 == 0 && (A03 = A03("com.google.android.gms")) != null) {
            this.A00 = A03.versionCode;
        }
        return this.A00;
    }

    public final PackageInfo A03(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public final synchronized String A04() {
        if (this.A02 == null) {
            A05();
        }
        return this.A02;
    }

    public final synchronized void A05() {
        PackageInfo A03 = A03(this.A04.getPackageName());
        if (A03 != null) {
            this.A02 = Integer.toString(A03.versionCode);
            this.A03 = A03.versionName;
        }
    }
}
