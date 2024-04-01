package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.13A  reason: invalid class name */
/* loaded from: classes.dex */
public final class C13A {
    public SharedPreferences A00;

    public C13A(Context context) {
        SharedPreferences sharedPreferences;
        Context createPackageContext;
        try {
            try {
                createPackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (createPackageContext != null) {
                sharedPreferences = createPackageContext.getSharedPreferences("google_ads_flags", 0);
                this.A00 = sharedPreferences;
            }
            sharedPreferences = null;
            this.A00 = sharedPreferences;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.A00 = null;
        }
    }
}
