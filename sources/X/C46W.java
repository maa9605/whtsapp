package X;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.util.Locale;

/* renamed from: X.46W */
/* loaded from: classes3.dex */
public final class C46W {
    public static int A00(C0JV c0jv) {
        String str;
        C0L3 c0l3 = c0jv.A06;
        String str2 = c0jv.A07;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.US);
        } else {
            str = null;
        }
        switch (c0l3.ordinal()) {
            case 0:
                return R.drawable.device_list_ic_unknown_browser;
            case 1:
                return R.drawable.device_list_ic_chrome;
            case 2:
                return R.drawable.device_list_ic_firefox;
            case 3:
                return R.drawable.device_list_ic_ie;
            case 4:
                return R.drawable.device_list_ic_opera;
            case 5:
                return R.drawable.device_list_ic_safari;
            case 6:
                return R.drawable.device_list_ic_edge;
            case 7:
                if ("windows".equals(str)) {
                    return R.drawable.device_list_ic_windows;
                }
                return "mac os".equals(str) ? R.drawable.device_list_ic_mac : R.drawable.device_list_ic_desktop_fallback;
            case 8:
                return R.drawable.device_list_ic_unknown_device;
            case 9:
                return R.drawable.device_list_ic_unknown_device;
            case 10:
            case GoogleMigrateImporterActivity.A0E /* 11 */:
            case 12:
                return R.drawable.device_list_ic_portal;
            default:
                return R.drawable.device_list_ic_unknown_browser;
        }
    }

    public static int A01(C42881wU c42881wU) {
        String str;
        if (c42881wU.A0C) {
            return R.drawable.device_list_ic_portal;
        }
        String str2 = c42881wU.A08;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.US);
        } else {
            str = null;
        }
        String str3 = c42881wU.A07;
        if (str3 == null) {
            return R.drawable.device_list_ic_chrome;
        }
        String lowerCase = str3.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1361128838:
                if (lowerCase.equals("chrome")) {
                    return R.drawable.device_list_ic_chrome;
                }
                break;
            case -909897856:
                if (lowerCase.equals("safari")) {
                    return R.drawable.device_list_ic_safari;
                }
                break;
            case -849452327:
                if (lowerCase.equals("firefox")) {
                    return R.drawable.device_list_ic_firefox;
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    return R.drawable.device_list_ic_ie;
                }
                break;
            case 3108285:
                if (lowerCase.equals("edge")) {
                    return R.drawable.device_list_ic_edge;
                }
                break;
            case 105948115:
                if (lowerCase.equals("opera")) {
                    return R.drawable.device_list_ic_opera;
                }
                break;
            case 1557106716:
                if (lowerCase.equals("desktop")) {
                    if ("windows".equals(str)) {
                        return R.drawable.device_list_ic_windows;
                    }
                    return "mac os".equals(str) ? R.drawable.device_list_ic_mac : R.drawable.device_list_ic_desktop_fallback;
                }
                break;
        }
        return R.drawable.device_list_ic_unknown_browser;
    }

    public static C48z A02() {
        C48z A00 = C48z.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static AnonymousClass499 A03() {
        AnonymousClass499 A00 = AnonymousClass499.A00();
        C02180Ae.A1B(A00);
        return A00;
    }

    public static String A04(C0JV c0jv, Context context) {
        switch (c0jv.A06.ordinal()) {
            case 1:
                return context.getString(R.string.linked_device_name_platform_chrome, c0jv.A07);
            case 2:
                return context.getString(R.string.linked_device_name_platform_firefox, c0jv.A07);
            case 3:
                return context.getString(R.string.linked_device_name_platform_ie, c0jv.A07);
            case 4:
                return context.getString(R.string.linked_device_name_platform_opera, c0jv.A07);
            case 5:
                return context.getString(R.string.linked_device_name_platform_safari, c0jv.A07);
            case 6:
                return context.getString(R.string.linked_device_name_platform_edge, c0jv.A07);
            default:
                return c0jv.A07;
        }
    }

    public static String A05(C42881wU c42881wU, Context context) {
        String str = c42881wU.A07;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -1361128838:
                    if (lowerCase.equals("chrome")) {
                        return context.getString(R.string.linked_device_name_platform_chrome, c42881wU.A08);
                    }
                    break;
                case -909897856:
                    if (lowerCase.equals("safari")) {
                        return context.getString(R.string.linked_device_name_platform_safari, c42881wU.A08);
                    }
                    break;
                case -849452327:
                    if (lowerCase.equals("firefox")) {
                        return context.getString(R.string.linked_device_name_platform_firefox, c42881wU.A08);
                    }
                    break;
                case 3356:
                    if (lowerCase.equals("ie")) {
                        return context.getString(R.string.linked_device_name_platform_ie, c42881wU.A08);
                    }
                    break;
                case 3108285:
                    if (lowerCase.equals("edge")) {
                        return context.getString(R.string.linked_device_name_platform_edge, c42881wU.A08);
                    }
                    break;
                case 105948115:
                    if (lowerCase.equals("opera")) {
                        return context.getString(R.string.linked_device_name_platform_opera, c42881wU.A08);
                    }
                    break;
            }
            return c42881wU.A08;
        }
        return c42881wU.A08;
    }

    public static void A06(ImageView imageView, boolean z) {
        if (z) {
            imageView.setAlpha(1.0f);
            imageView.clearColorFilter();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        imageView.setAlpha(0.5f);
    }

    public static boolean A07(C01B c01b) {
        return c01b.A0E(C01C.A1H) && c01b.A0E(C01C.A1G);
    }

    public static boolean A08(C01B c01b, C0EE c0ee) {
        return c01b.A0E(C01C.A1H) || c0ee.A02() || c0ee.A03();
    }
}
