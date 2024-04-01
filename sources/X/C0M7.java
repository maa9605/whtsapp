package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0M7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0M7 {
    public static volatile AbstractC12870kD A00;

    public static Intent A00(Context context, C0M2 c0m2) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26 || (intent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(c0m2.A00())) == null) {
            intent = new Intent();
        }
        c0m2.A01(intent);
        return intent;
    }

    public static AbstractC12870kD A01(Context context) {
        if (A00 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    A00 = (AbstractC12870kD) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C0M7.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (A00 == null) {
                A00 = new AbstractC12870kD() { // from class: X.1TC
                    @Override // X.AbstractC12870kD
                    public Object A01() {
                        return null;
                    }

                    @Override // X.AbstractC12870kD
                    public Object A02(List list) {
                        return null;
                    }
                };
            }
        }
        return A00;
    }

    public static List A02(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                C0M2 c0m2 = new C12860kC(context, shortcutInfo).A00;
                if (!TextUtils.isEmpty(c0m2.A05)) {
                    Intent[] intentArr = c0m2.A0B;
                    if (intentArr != null && intentArr.length != 0) {
                        arrayList.add(c0m2);
                    } else {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                } else {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
            }
            return arrayList;
        }
        try {
            return A01(context).A03();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static void A03(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        A01(context).A01();
    }

    public static void A04(Context context, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0M2) it.next()).A00());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return;
            }
        }
        A01(context).A02(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(android.content.Context r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L13
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            return r0
        L13:
            java.lang.String r4 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r0 = X.C02160Ac.A01(r5, r4)
            r3 = 0
            if (r0 == 0) goto L1d
            return r3
        L1d:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r1 = "com.android.launcher.action.INSTALL_SHORTCUT"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            java.util.List r0 = r2.queryBroadcastReceivers(r0, r3)
            java.util.Iterator r2 = r0.iterator()
        L30:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.permission
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L4c
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L30
        L4c:
            r0 = 1
            return r0
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M7.A05(android.content.Context):boolean");
    }
}
