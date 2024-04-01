package X;

import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;

/* renamed from: X.0K7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0K7 {
    public static void A00(C02E c02e, Window window, View view) {
        if (Build.MANUFACTURER.equals("OnePlus")) {
            String str = Build.MODEL;
            if ((str.equals("ONEPLUS A6000") || str.equals("ONEPLUS A6003")) && (window.getAttributes().flags & 1024) != 0 && c02e.A0H.A00.getPackageManager().hasSystemFeature("com.oneplus.screen.cameranotch")) {
                view.setPadding(0, (int) TypedValue.applyDimension(5, 5.0f, view.getContext().getResources().getDisplayMetrics()), 0, 0);
            }
        }
    }

    public static boolean A01() {
        boolean startsWith;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            String str = Build.MODEL;
            return str.startsWith("SM-G570") || (startsWith = str.startsWith("SM-J260")) || str.startsWith("SM-G935") || str.startsWith("SM-G930") || str.startsWith("SM-A520") || str.startsWith("SM-A720") || str.startsWith("SM-A260") || str.startsWith("SM-J400") || str.startsWith("SM-J600") || startsWith || str.startsWith("SM-G950");
        }
        return false;
    }

    public static boolean A02() {
        String str = Build.MANUFACTURER;
        if (str.equalsIgnoreCase("vestel") && Build.MODEL.equalsIgnoreCase("vsp250s")) {
            return true;
        }
        if (str.equalsIgnoreCase("asus")) {
            String str2 = Build.MODEL;
            return str2.equalsIgnoreCase("ASUS_Z00AD") || str2.equalsIgnoreCase("asus_x00ada") || str2.equalsIgnoreCase("asus_x00adc") || str2.equalsIgnoreCase("asus_t00j") || str2.equalsIgnoreCase("asus_x00ad") || str2.equalsIgnoreCase("asus_x014d") || str2.equalsIgnoreCase("asus_z008d") || str2.equalsIgnoreCase("asus_z00ldd") || str2.equalsIgnoreCase("zb500kl");
        }
        return false;
    }

    public static boolean A03() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            String str = Build.MANUFACTURER;
            if ("samsung".equalsIgnoreCase(str) && i == 23) {
                return false;
            }
            if ("xiaomi".equalsIgnoreCase(str) && (i == 23 || i == 24)) {
                return false;
            }
            if ("lenovo".equalsIgnoreCase(str) && i == 23) {
                return false;
            }
            if ("asus".equalsIgnoreCase(str) && (i == 23 || i == 24)) {
                return false;
            }
            if ("zte".equalsIgnoreCase(str) && (i == 23 || i == 24)) {
                return false;
            }
            if ("lemobile".equalsIgnoreCase(str) && i == 23) {
                return false;
            }
            if ("bullittgrouplimited".equalsIgnoreCase(str) && i == 23) {
                return false;
            }
            return ("tcl".equalsIgnoreCase(str) && i == 23) ? false : true;
        }
        return false;
    }

    public static boolean A04() {
        return Build.VERSION.SDK_INT == 22 && Build.MANUFACTURER.equalsIgnoreCase("LAVA");
    }

    public static boolean A05() {
        return Build.MANUFACTURER.equalsIgnoreCase("Essential Products") && Build.MODEL.equalsIgnoreCase("PH-1");
    }

    public static boolean A06(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            C000700j.A08(false, "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier");
        }
        return str.contains("android.permission.UPDATE_APP_OPS_STATS");
    }
}
