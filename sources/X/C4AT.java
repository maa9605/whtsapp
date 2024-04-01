package X;

import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.4AT  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4AT {
    public static volatile C4AT A06;
    public final C02L A00;
    public final C01B A01;
    public final C02E A02;
    public final C001200o A03;
    public final C90564Bm A04;
    public final C014406v A05 = C014406v.A00("IndiaUpiSimSwapDetectionUtils", "payment", "IN");

    public C4AT(C001200o c001200o, C02L c02l, C01B c01b, C02E c02e, C90564Bm c90564Bm) {
        this.A03 = c001200o;
        this.A00 = c02l;
        this.A01 = c01b;
        this.A02 = c02e;
        this.A04 = c90564Bm;
    }

    public static boolean A00(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String replaceAll = str == null ? null : str.replaceAll("\\D", "");
        String replaceAll2 = str2 == null ? null : str2.replaceAll("\\D", "");
        if (replaceAll.startsWith("91")) {
            return TextUtils.equals(replaceAll, replaceAll2);
        }
        return TextUtils.equals(replaceAll, replaceAll2.replaceFirst("91", ""));
    }

    public String A01() {
        Application application;
        try {
            application = this.A03.A00;
        } catch (Exception e) {
            this.A05.A08("Unable to get device bind ICCID", e);
        }
        if (C02160Ac.A01(application, "android.permission.READ_PHONE_STATE") == 0) {
            int i = Build.VERSION.SDK_INT;
            if (i < 30 || C02160Ac.A01(application, "android.permission.READ_PHONE_NUMBERS") == 0) {
                C02L c02l = this.A00;
                c02l.A05();
                String A00 = C04630Le.A00(c02l.A01);
                if (i >= 22) {
                    List<SubscriptionInfo> activeSubscriptionInfoList = this.A02.A0F().getActiveSubscriptionInfoList();
                    if (activeSubscriptionInfoList == null) {
                        return null;
                    }
                    for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                        String A02 = A02(subscriptionInfo);
                        if (A00(subscriptionInfo.getNumber(), A00)) {
                            this.A05.A03("iccid matched number");
                            return A02;
                        }
                    }
                    if (activeSubscriptionInfoList.size() > 0) {
                        this.A05.A03("no matching phone number found, storing the first iccid");
                        return A02(activeSubscriptionInfoList.get(0));
                    }
                } else if (i < 22) {
                    TelephonyManager A0G = this.A02.A0G();
                    if (A00(A0G.getLine1Number(), A00)) {
                        this.A05.A03("store first iccid");
                        return A0G.getSimSerialNumber();
                    } else if (A00(A03("getLine1Number"), A00)) {
                        this.A05.A03("store second iccid");
                        return A03("getSimSerialNumber");
                    } else if (A0G.getSimSerialNumber() != null) {
                        return A0G.getSimSerialNumber();
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final String A02(SubscriptionInfo subscriptionInfo) {
        boolean isEmpty;
        String str;
        if (Build.VERSION.SDK_INT >= 29) {
            C014406v c014406v = this.A05;
            StringBuilder A0P = C000200d.A0P("Sub Id : ");
            A0P.append(subscriptionInfo.getSubscriptionId());
            c014406v.A07(null, A0P.toString(), null);
            StringBuilder sb = new StringBuilder();
            sb.append(subscriptionInfo.getSubscriptionId());
            C90564Bm c90564Bm = this.A04;
            synchronized (c90564Bm) {
                isEmpty = true ^ TextUtils.isEmpty(c90564Bm.A0M("device_binding_sim_iccid")[0]);
            }
            if (!isEmpty) {
                str = Settings.Secure.getString(this.A03.A00.getContentResolver(), "android_id");
            } else {
                str = "";
            }
            sb.append(str);
            return sb.toString();
        }
        return subscriptionInfo.getIccId();
    }

    public final String A03(String str) {
        TelephonyManager A0G = this.A02.A0G();
        try {
            Object invoke = Class.forName(A0G.getClass().getName()).getMethod(str, Integer.TYPE).invoke(A0G, 1);
            if (invoke != null) {
                return invoke.toString();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
