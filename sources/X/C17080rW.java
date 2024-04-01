package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.0rW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17080rW {
    public static final String A00 = AbstractC16430qO.A01("PackageManagerHelper");

    public static void A00(Context context, Class klazz, boolean enabled) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String name = klazz.getName();
            packageManager.setComponentEnabledSetting(new ComponentName(context, name), enabled ? 1 : 2, 1);
            AbstractC16430qO A002 = AbstractC16430qO.A00();
            String str = A00;
            Object[] objArr = new Object[2];
            objArr[0] = name;
            objArr[1] = enabled ? "enabled" : "disabled";
            A002.A02(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            AbstractC16430qO A003 = AbstractC16430qO.A00();
            String str2 = A00;
            Object[] objArr2 = new Object[2];
            objArr2[0] = klazz.getName();
            objArr2[1] = enabled ? "enabled" : "disabled";
            A003.A02(str2, String.format("%s could not be %s", objArr2), e);
        }
    }
}
