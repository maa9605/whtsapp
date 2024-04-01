package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0CL */
/* loaded from: classes.dex */
public class C0CL {
    public static boolean A00;
    public static boolean A01;
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00bf, code lost:
        if (r9.getPackageManager().hasSystemFeature("android.hardware.type.embedded") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00cd, code lost:
        if (r0.booleanValue() != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CL.A00(android.content.Context, int):int");
    }

    public static boolean A01(Context context) {
        try {
            if (!A01) {
                PackageInfo packageInfo = C06080Rl.A00(context).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C06070Rk.A00(context);
                if (packageInfo != null && !C06070Rk.A02(packageInfo, false) && C06070Rk.A02(packageInfo, true)) {
                    A00 = true;
                } else {
                    A00 = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            A01 = true;
        }
        return A00 || !"user".equals(Build.TYPE);
    }

    public static boolean A02(Context context) {
        ApplicationInfo applicationInfo;
        Bundle applicationRestrictions;
        boolean equals = "com.google.android.gms".equals("com.google.android.gms");
        if (AnonymousClass088.A1r()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled) {
            return (AnonymousClass088.A1p() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) ? false : true;
        }
        return false;
    }

    public static boolean A03(Context context, int i) {
        C06090Rm A002 = C06080Rl.A00(context);
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                ((AppOpsManager) A002.A00.getSystemService("appops")).checkPackage(i, "com.google.android.gms");
            } catch (SecurityException unused) {
            }
        } else {
            String[] packagesForUid = A002.A00.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null) {
                for (String str : packagesForUid) {
                    if (!"com.google.android.gms".equals(str)) {
                    }
                }
            }
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C06070Rk A003 = C06070Rk.A00(context);
            if (A003 != null) {
                if (packageInfo != null) {
                    if (C06070Rk.A02(packageInfo, false)) {
                        return true;
                    }
                    if (C06070Rk.A02(packageInfo, true)) {
                        if (A01(A003.A00)) {
                            return true;
                        }
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    }
                }
                return false;
            }
            throw null;
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                return false;
            }
        }
    }

    public static boolean A04(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return A02(context);
        }
        return false;
    }
}
