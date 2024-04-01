package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2A8 */
/* loaded from: classes2.dex */
public final class C2A8 {
    public static final int[][] A05 = {new int[]{1621036800, R.string.green_alert_date_one}, new int[]{1622332800, R.string.green_alert_date_two}, new int[]{1623715200, R.string.green_alert_date_three}, new int[]{1625011200, R.string.green_alert_date_four}};
    public static final String[] A03 = {"https://www.whatsapp.com/legal/updates/terms-of-service", "https://www.whatsapp.com/legal/updates/terms-of-service", "https://www.whatsapp.com/legal/updates/terms-of-service-eea"};
    public static final String[] A01 = {"https://www.whatsapp.com/legal/updates/privacy-policy", "https://www.whatsapp.com/legal/brazil-privacy-notice", "https://www.whatsapp.com/legal/updates/privacy-policy-eea"};
    public static final String[] A00 = {"were-updating-our-terms-and-privacy-policy", "were-updating-our-terms-and-privacy-policy", "were-updating-our-terms-and-privacy-policy-eea"};
    public static final String[] A04 = {"what-happens-when-our-terms-and-privacy-policy-updates-take-effect", "what-happens-when-our-terms-and-privacy-policy-updates-take-effect", "what-happens-when-our-terms-and-privacy-policy-updates-take-effect"};
    public static final String[] A02 = {"how-we-work-with-facebook-to-offer-new-products-and-services", "how-we-work-with-facebook-to-offer-new-products-and-services", "how-we-work-with-facebook-to-offer-new-products-and-services"};

    public static C40811su A00(C003701t c003701t, AnonymousClass072 anonymousClass072, boolean z) {
        int A032;
        C40911t4 c40911t4;
        if (z) {
            A032 = c003701t.A03(357);
        } else {
            A032 = c003701t.A03(358);
        }
        if (A032 == 0) {
            StringBuilder sb = new StringBuilder("GreenAlertUtils/buildModal/dismissible: ");
            sb.append(z);
            sb.append(", no start time received");
            Log.i(sb.toString());
            return null;
        }
        if (!z) {
            A032 += c003701t.A03(365);
        }
        if (anonymousClass072 != null) {
            if (z) {
                c40911t4 = new C40911t4(-1L, new long[]{86400000});
            } else {
                c40911t4 = null;
            }
            return new C40811su("", "", "", "", new ArrayList(), "", new C40891t2(new C40901t3(A032 * 1000), c40911t4, null), null, null, z ? "" : null);
        }
        throw null;
    }

    public static boolean A01(int i, C003701t c003701t) {
        return String.valueOf(i).startsWith("202102") && !c003701t.A0C(344);
    }

    public static boolean A02(C003701t c003701t, C2A7 c2a7) {
        return String.valueOf(c2a7.A00).startsWith("202102") && c003701t.A0C(344);
    }

    public static boolean A03(C41951um c41951um) {
        return c41951um.A02() == null || c41951um.A02().A01 != 4;
    }

    public static boolean A04(C006602x c006602x, AnonymousClass072 anonymousClass072) {
        if (anonymousClass072 != null) {
            return c006602x.A05() || c006602x.A08("GI");
        }
        throw null;
    }
}
