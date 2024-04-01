package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.0Wl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07050Wl {
    public static final Locale A00 = new Locale("", "");

    public static int A00(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(A00)) {
            String A002 = C13000kR.A00(locale);
            if (A002 == null) {
                byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
                return (directionality == 1 || directionality == 2) ? 1 : 0;
            } else if (A002.equalsIgnoreCase("Arab") || A002.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
