package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1CU  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CU {
    public static final AtomicInteger A03 = new AtomicInteger((int) SystemClock.elapsedRealtime());
    public Bundle A00;
    public final Context A01;
    public final String A02;

    public C1CU(Context context, String str) {
        this.A01 = context;
        this.A02 = str;
    }

    public static String A00(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    public static void A01(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    public final PendingIntent A02(int i, Intent intent) {
        Context context = this.A01;
        return PendingIntent.getBroadcast(context, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    public final synchronized Bundle A03() {
        Bundle bundle;
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            return bundle2;
        }
        try {
            ApplicationInfo applicationInfo = this.A01.getPackageManager().getApplicationInfo(this.A02, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                this.A00 = bundle;
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A04(android.os.Bundle r16, java.lang.String r17) {
        /*
            r15 = this;
            r7 = r17
            r4 = r16
            java.lang.String r1 = A00(r4, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = "_loc_key"
            java.lang.String r9 = r7.concat(r0)
            java.lang.String r2 = A00(r4, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r14 = 0
            if (r0 != 0) goto L4d
            android.content.Context r0 = r15.A01
            android.content.res.Resources r8 = r0.getResources()
            java.lang.String r1 = r15.A02
            java.lang.String r0 = "string"
            int r3 = r8.getIdentifier(r2, r0, r1)
            java.lang.String r6 = " Default value will be used."
            r13 = 6
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 != 0) goto L4e
            java.lang.String r2 = r9.substring(r13)
            r0 = 49
            int r0 = X.C000200d.A00(r2, r0)
            int r1 = r7.length()
            int r1 = r1 + r0
            java.lang.String r0 = " resource not found: "
            java.lang.String r0 = X.C000200d.A08(r1, r2, r0, r7, r6)
            android.util.Log.w(r5, r0)
        L4d:
            return r14
        L4e:
            java.lang.String r0 = "_loc_args"
            java.lang.String r12 = r7.concat(r0)
            java.lang.String r9 = A00(r4, r12)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r4 = ": "
            if (r0 != 0) goto La4
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: org.json.JSONException -> L77
            r10.<init>(r9)     // Catch: org.json.JSONException -> L77
            int r2 = r10.length()     // Catch: org.json.JSONException -> L77
            java.lang.String[] r11 = new java.lang.String[r2]     // Catch: org.json.JSONException -> L77
            r1 = 0
        L6c:
            if (r1 >= r2) goto La5
            java.lang.Object r0 = r10.opt(r1)     // Catch: org.json.JSONException -> L77
            r11[r1] = r0     // Catch: org.json.JSONException -> L77
            int r1 = r1 + 1
            goto L6c
        L77:
            java.lang.String r2 = r12.substring(r13)
            r0 = 41
            int r0 = X.C000200d.A00(r2, r0)
            int r0 = X.C000200d.A00(r9, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Malformed "
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            r1.append(r9)
            java.lang.String r0 = "  Default value will be used."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0)
        La4:
            r11 = r14
        La5:
            if (r11 != 0) goto Lac
            java.lang.String r14 = r8.getString(r3)
            return r14
        Lac:
            java.lang.String r14 = r8.getString(r3, r11)     // Catch: java.util.MissingFormatArgumentException -> Lb1
            return r14
        Lb1:
            r3 = move-exception
            java.lang.String r2 = java.util.Arrays.toString(r11)
            int r0 = r7.length()
            int r0 = r0 + 58
            int r0 = X.C000200d.A00(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Missing format argument for "
            r1.append(r0)
            r1.append(r7)
            r1.append(r4)
            r1.append(r2)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0, r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1CU.A04(android.os.Bundle, java.lang.String):java.lang.String");
    }

    public final boolean A05(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (this.A01.getResources().getDrawable(i, null) instanceof AdaptiveIconDrawable) {
                StringBuilder sb = new StringBuilder(77);
                sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb.append(i);
                Log.e("FirebaseMessaging", sb.toString());
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }
}
