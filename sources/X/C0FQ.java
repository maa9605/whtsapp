package X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.FeatureInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0FQ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0FQ {
    public static volatile C0FQ A04;
    public C0FS A00;
    public final C0FS A01;
    public final C0FS A02 = new C0FS() { // from class: X.0FR
        @Override // X.C0FS
        public List A00(Context context) {
            return null;
        }

        @Override // X.C0FS
        public void A01(Context context, int i) {
            C000700j.A08(true, "should not call NoBadger");
        }
    };
    public final C0FS[] A03;

    public C0FQ(final C003701t c003701t) {
        C0FS c0fs = new C0FS() { // from class: X.0FT
            @Override // X.C0FS
            public List A00(Context context) {
                return Arrays.asList("com.asus.launcher", "com.lge.launcher", "com.lge.launcher2", "com.lge.launcher3");
            }

            @Override // X.C0FS
            public void A01(Context context, int i) {
                Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                intent.putExtra("badge_count", i);
                intent.putExtra("badge_count_package_name", context.getPackageName());
                intent.putExtra("badge_count_class_name", "com.whatsapp.Main");
                context.sendBroadcast(intent);
            }
        };
        this.A01 = c0fs;
        this.A03 = new C0FS[]{new C0FS() { // from class: X.0FU
            @Override // X.C0FS
            public List A00(Context context) {
                return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher", "com.sec.android.app.easylauncher", "com.sec.android.emergencylauncher");
            }

            @Override // X.C0FS
            public void A01(Context context, int i) {
                if (Build.VERSION.SDK_INT < 22) {
                    String packageName = context.getPackageName();
                    try {
                        Uri parse = Uri.parse("content://com.sec.badge/apps");
                        ContentResolver contentResolver = context.getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("package", packageName);
                        contentValues.put("class", "com.whatsapp.Main");
                        contentValues.put("badgecount", Integer.valueOf(i));
                        if (contentResolver.update(parse, contentValues, "package=? AND class=?", new String[]{packageName, "com.whatsapp.Main"}) == 0) {
                            contentResolver.insert(parse, contentValues);
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        Log.e("widgetprovider/updatebadge", e);
                        return;
                    }
                }
                Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
                intent.putExtra("badge_count", i);
                intent.putExtra("badge_count_package_name", context.getPackageName());
                intent.putExtra("badge_count_class_name", "com.whatsapp.Main");
                context.sendBroadcast(intent);
            }
        }, new C0FV(), new C0FS() { // from class: X.0FW
            @Override // X.C0FS
            public List A00(Context context) {
                return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
            }

            @Override // X.C0FS
            public void A01(Context context, int i) {
                if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
                    Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context.getPackageName());
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", "com.whatsapp.Main");
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
                    intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
                    context.sendBroadcast(intent);
                    return;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("badge_count", Integer.valueOf(i));
                contentValues.put("package_name", context.getPackageName());
                contentValues.put("activity_name", "com.whatsapp.Main");
                try {
                    context.getContentResolver().insert(Uri.parse("content://com.sonymobile.home.resourceprovider/badge"), contentValues);
                } catch (Exception e) {
                    Log.e("badger/sony/updatebadge", e);
                }
            }
        }, new C0FS() { // from class: X.0FX
            public static Pattern A01;
            public float A00 = -1.0f;

            @Override // X.C0FS
            public List A00(Context context) {
                if (A03(context) >= 4.0f) {
                    return Collections.singletonList("com.htc.launcher");
                }
                return new ArrayList();
            }

            @Override // X.C0FS
            public void A01(Context context, int i) {
                float A03 = A03(context);
                if (A03 >= 5.0f) {
                    Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
                    intent.setFlags(16);
                    intent.putExtra("com.htc.launcher.extra.COMPONENT", new ComponentName(context.getPackageName(), "com.whatsapp.Main").flattenToShortString());
                    intent.putExtra("com.htc.launcher.extra.COUNT", i);
                    context.sendBroadcast(intent);
                } else if (A03 < 4.0f) {
                } else {
                    Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                    intent2.setFlags(16);
                    intent2.putExtra("packagename", context.getPackageName());
                    intent2.putExtra("count", i);
                    context.sendBroadcast(intent2);
                    ContentResolver contentResolver = context.getContentResolver();
                    HashSet hashSet = new HashSet();
                    StringBuilder A0P = C000200d.A0P("%");
                    A0P.append(context.getPackageName());
                    A0P.append("%");
                    Cursor query = contentResolver.query(Uri.parse("content://com.htc.launcher.settings/favorites"), new String[]{"_id", "intent"}, "intent LIKE ?", new String[]{A0P.toString()}, null);
                    if (query != null) {
                        try {
                            int columnIndex = query.getColumnIndex("_id");
                            int columnIndex2 = query.getColumnIndex("intent");
                            query.moveToFirst();
                            while (!query.isAfterLast()) {
                                try {
                                    ComponentName component = Intent.parseUri(query.getString(columnIndex2), 0).getComponent();
                                    if (component != null && context.getPackageName().equals(component.getPackageName()) && "com.whatsapp.Main".equals(component.getClassName())) {
                                        hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                                    }
                                } catch (URISyntaxException unused) {
                                }
                                query.moveToNext();
                            }
                            query.close();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    query.close();
                                } catch (Throwable unused2) {
                                }
                                throw th2;
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Intent intent3 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
                        intent2.setFlags(16);
                        intent3.putExtra("packagename", context.getPackageName());
                        intent3.putExtra("favorite_item_id", ((Number) it.next()).longValue());
                        ComponentName componentName = new ComponentName(context.getPackageName(), "com.whatsapp.Main");
                        StringBuilder A0P2 = C000200d.A0P("%");
                        A0P2.append(componentName.flattenToShortString());
                        A0P2.append("%");
                        intent3.putExtra("selectArgs", new String[]{A0P2.toString()});
                        intent3.putExtra("count", i);
                        context.sendBroadcast(intent3);
                    }
                }
            }

            public final float A03(Context context) {
                float f = this.A00;
                if (f >= 0.0f) {
                    return f;
                }
                this.A00 = 0.0f;
                FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
                int length = systemAvailableFeatures.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    try {
                        String str = systemAvailableFeatures[i].name;
                        if (str != null && str.startsWith("com.htc.software.Sense")) {
                            Pattern pattern = A01;
                            if (pattern == null) {
                                pattern = Pattern.compile("com\\.htc\\.software\\.Sense(\\d+(?:\\.\\d+)?).*");
                                A01 = pattern;
                            }
                            Matcher matcher = pattern.matcher(str);
                            if (matcher.matches()) {
                                Float valueOf = Float.valueOf(Float.parseFloat(matcher.group(1)));
                                if (valueOf != null) {
                                    this.A00 = valueOf.floatValue();
                                    break;
                                }
                            } else {
                                throw new NumberFormatException("could not find version");
                                break;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i++;
                }
                StringBuilder A0P = C000200d.A0P("badger/htc/sense ");
                A0P.append(this.A00);
                Log.i(A0P.toString());
                return this.A00;
            }
        }, new C0FS() { // from class: X.0FY
            @Override // X.C0FS
            public List A00(Context context) {
                return Collections.singletonList("com.huawei.android.launcher");
            }

            @Override // X.C0FS
            public void A01(Context context, int i) {
                if (AnonymousClass029.A0B(context, "com.huawei.android.launcher") <= 63006) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("package", context.getPackageName());
                bundle.putString("class", "com.whatsapp.Main");
                bundle.putInt("badgenumber", i);
                try {
                    context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
                } catch (Exception e) {
                    StringBuilder A0P = C000200d.A0P("Unexpected exception, launcher version = ");
                    A0P.append(AnonymousClass029.A0B(context, "com.huawei.android.launcher"));
                    Log.e(A0P.toString(), e);
                }
            }
        }, new C0FS(c003701t) { // from class: X.0FZ
            public final C003701t A00;

            {
                this.A00 = c003701t;
            }

            @Override // X.C0FS
            public List A00(Context context) {
                if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                    String str = Build.BRAND;
                    if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("realme")) {
                        boolean z = false;
                        try {
                            z = !TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.build.version.oplusrom"));
                        } catch (Exception e) {
                            Log.e("Error while checking oppo launcher information", e);
                        }
                        if (z && this.A00.A0C(503)) {
                            return Collections.singletonList("com.android.launcher");
                        }
                    }
                }
                return Collections.singletonList("com.oppo.launcher");
            }

            @Override // X.C0FS
            public void A01(Context context, int i) {
                if (Build.VERSION.SDK_INT < 21) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                bundle.putString("app_badge_packageName", "com.whatsapp");
                try {
                    context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                } catch (Exception e) {
                    Log.e("cannot update badge", e);
                }
            }
        }, new C0FS() { // from class: X.0Fa
            public static final Uri A01 = Uri.parse("content://com.transsion.XOSLauncher.unreadprovider");
            public static final Uri A00 = Uri.parse("content://com.transsion.hilauncher.unreadprovider");

            /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
            @Override // X.C0FS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.List A00(android.content.Context r9) {
                /*
                    r8 = this;
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r0 = 24
                    if (r1 < r0) goto L5e
                    android.content.pm.PackageManager r2 = r9.getPackageManager()
                    r7 = 1
                    r6 = 0
                    if (r2 == 0) goto L49
                    java.lang.String r0 = "android.intent.action.MAIN"
                    android.content.Intent r1 = new android.content.Intent
                    r1.<init>(r0)
                    java.lang.String r0 = "android.intent.category.HOME"
                    r1.addCategory(r0)
                    android.content.pm.ResolveInfo r0 = r2.resolveActivity(r1, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r0 == 0) goto L49
                    android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    java.lang.String r1 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    r0 = 4096(0x1000, float:5.74E-42)
                    android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    android.content.pm.PermissionInfo[] r5 = r0.permissions     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    int r4 = r5.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    r3 = 0
                L2e:
                    if (r3 >= r4) goto L4b
                    r2 = r5[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    java.lang.String r1 = "com.transsion.hilauncher.permission.CHANGE_BADGE"
                    java.lang.String r0 = r2.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    boolean r0 = r1.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r0 != 0) goto L49
                    java.lang.String r1 = "com.transsion.XOSLauncher.permission.CHANGE_BADGE"
                    java.lang.String r0 = r2.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    boolean r0 = r1.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                    if (r0 != 0) goto L49
                    int r3 = r3 + 1
                    goto L2e
                L49:
                    r0 = 0
                    goto L4c
                L4b:
                    r0 = 1
                L4c:
                    if (r0 == 0) goto L5e
                    r0 = 2
                    java.lang.String[] r1 = new java.lang.String[r0]
                    java.lang.String r0 = "com.transsion.XOSLauncher"
                    r1[r6] = r0
                    java.lang.String r0 = "com.transsion.hilauncher"
                    r1[r7] = r0
                    java.util.List r0 = java.util.Arrays.asList(r1)
                    return r0
                L5e:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C03270Fa.A00(android.content.Context):java.util.List");
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[Catch: Exception -> 0x0068, TRY_ENTER, TryCatch #0 {Exception -> 0x0068, blocks: (B:12:0x0041, B:15:0x004c, B:17:0x0056, B:19:0x005e), top: B:24:0x0041 }] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:12:0x0041, B:15:0x004c, B:17:0x0056, B:19:0x005e), top: B:24:0x0041 }] */
            @Override // X.C0FS
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A01(android.content.Context r7, int r8) {
                /*
                    r6 = this;
                    java.lang.String r0 = "android.intent.action.MAIN"
                    android.content.Intent r2 = new android.content.Intent
                    r2.<init>(r0)
                    java.lang.String r0 = "android.intent.category.HOME"
                    r2.addCategory(r0)
                    android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: java.lang.RuntimeException -> L1f
                    r0 = 65536(0x10000, float:9.18355E-41)
                    android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch: java.lang.RuntimeException -> L1f
                    if (r0 == 0) goto L25
                    android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.RuntimeException -> L1f
                    if (r0 == 0) goto L25
                    java.lang.String r5 = r0.packageName     // Catch: java.lang.RuntimeException -> L1f
                    goto L27
                L1f:
                    r1 = move-exception
                    java.lang.String r0 = "Exception while getting launcher name"
                    com.whatsapp.util.Log.e(r0, r1)
                L25:
                    java.lang.String r5 = ""
                L27:
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    java.lang.String r1 = r7.getPackageName()
                    java.lang.String r0 = "package"
                    r4.putString(r0, r1)
                    java.lang.String r1 = "class"
                    java.lang.String r0 = "com.whatsapp.Main"
                    r4.putString(r1, r0)
                    java.lang.String r0 = "badgenumber"
                    r4.putInt(r0, r8)
                    java.lang.String r0 = "com.transsion.XOSLauncher"
                    boolean r0 = r5.equals(r0)     // Catch: java.lang.Exception -> L68
                    r3 = 0
                    java.lang.String r2 = "change_badge"
                    if (r0 == 0) goto L56
                    android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Exception -> L68
                    android.net.Uri r0 = X.C03270Fa.A01     // Catch: java.lang.Exception -> L68
                    r1.call(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L68
                    return
                L56:
                    java.lang.String r0 = "com.transsion.hilauncher"
                    boolean r0 = r5.equals(r0)     // Catch: java.lang.Exception -> L68
                    if (r0 == 0) goto L7d
                    android.content.ContentResolver r1 = r7.getContentResolver()     // Catch: java.lang.Exception -> L68
                    android.net.Uri r0 = X.C03270Fa.A00     // Catch: java.lang.Exception -> L68
                    r1.call(r0, r2, r3, r4)     // Catch: java.lang.Exception -> L68
                    return
                L68:
                    r2 = move-exception
                    java.lang.String r0 = "badger/getbadger "
                    java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
                    java.lang.String r0 = r2.getMessage()
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    com.whatsapp.util.Log.e(r0, r2)
                L7d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C03270Fa.A01(android.content.Context, int):void");
            }
        }, c0fs};
    }

    public static C0FQ A00() {
        if (A04 == null) {
            synchronized (C0FQ.class) {
                if (A04 == null) {
                    A04 = new C0FQ(C003701t.A00());
                }
            }
        }
        return A04;
    }

    public synchronized C0FS A01(Context context) {
        C0FS c0fs = this.A00;
        if (c0fs != null) {
            return c0fs;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            this.A00 = new C0FV();
        } else {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        String str = resolveInfo.activityInfo.packageName;
                        StringBuilder sb = new StringBuilder();
                        sb.append("badger/homepackage/");
                        sb.append(str);
                        Log.i(sb.toString());
                        C0FS[] c0fsArr = this.A03;
                        int length = c0fsArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            C0FS c0fs2 = c0fsArr[i];
                            if (c0fs2.A00(context.getApplicationContext()).contains(str)) {
                                this.A00 = c0fs2;
                                break;
                            }
                            i++;
                        }
                        if (this.A00 != null) {
                            break;
                        }
                    }
                } else {
                    Log.e("badger/nohome");
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("badger/getbadger ");
                sb2.append(e.getMessage());
                Log.e(sb2.toString(), e);
            }
            if (this.A00 == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    Log.i("badger/getbadger/notfound/default");
                    this.A00 = this.A01;
                } else {
                    Log.i("badger/getbadger/notfound/disable");
                    this.A00 = this.A02;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("badger/getbadger ");
        sb3.append(Arrays.asList(this.A03).indexOf(this.A00));
        Log.i(sb3.toString());
        return this.A00;
    }
}
