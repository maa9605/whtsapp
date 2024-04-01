package X;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;

/* renamed from: X.0Le */
/* loaded from: classes.dex */
public class C04630Le {
    public static C04630Le A00 = new C04630Le();
    public static Pattern A01;
    public static Pattern A02;
    public static Pattern A03;

    public static String A00(C06C c06c) {
        return A02((AbstractC005302j) c06c.A03(AbstractC005302j.class));
    }

    public static String A01(AbstractC005302j abstractC005302j) {
        String replaceAll;
        String A022 = A02(abstractC005302j);
        if (A022 == null || (replaceAll = A022.replaceAll("\\D", "")) == null) {
            return null;
        }
        return C000200d.A0H("+", replaceAll);
    }

    public static String A02(AbstractC005302j abstractC005302j) {
        String str;
        int indexOf;
        if (abstractC005302j == null) {
            Log.w("contact/phonenumber/jid/null");
            return null;
        } else if (C003101m.A0P(abstractC005302j) || TextUtils.isEmpty(abstractC005302j.user)) {
            return null;
        } else {
            boolean A0U = C003101m.A0U(abstractC005302j);
            if (A0U) {
                String str2 = abstractC005302j.user;
                if (str2 != null && (indexOf = str2.indexOf("-")) != -1) {
                    str = str2.substring(0, indexOf);
                } else {
                    str = null;
                }
            } else {
                str = abstractC005302j.user;
            }
            if (PhoneNumberUtils.isGlobalPhoneNumber(str)) {
                if (!A0U && !C003101m.A0Y(abstractC005302j)) {
                    return A03(str);
                }
                StringBuilder sb = new StringBuilder("+");
                sb.append(str);
                return sb.toString();
            }
            return str;
        }
    }

    public static String A03(String str) {
        StringBuilder sb = new StringBuilder("+");
        sb.append(str);
        String obj = sb.toString();
        try {
            C0DZ A002 = C0DZ.A00();
            C10090fH A0F = A002.A0F(obj, "ZZ");
            int i = A0F.countryCode_;
            String valueOf = String.valueOf(A0F.nationalNumber_);
            if (52 == i) {
                if (valueOf.length() == 11 && valueOf.charAt(0) == '1') {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("+");
                    sb2.append(i);
                    sb2.append(valueOf.substring(1));
                    obj = sb2.toString();
                }
            } else if (225 == i) {
                Pattern pattern = A01;
                if (pattern == null) {
                    pattern = Pattern.compile("((?:0[1-3]|[457][0-3])\\d{6})");
                    A01 = pattern;
                }
                if (pattern.matcher(valueOf).matches()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("+");
                    sb3.append(i);
                    sb3.append("01");
                    sb3.append(valueOf);
                    obj = sb3.toString();
                } else {
                    Pattern pattern2 = A02;
                    if (pattern2 == null) {
                        pattern2 = Pattern.compile("([04-9][4-6]\\d{6})");
                        A02 = pattern2;
                    }
                    if (pattern2.matcher(valueOf).matches()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("+");
                        sb4.append(i);
                        sb4.append("05");
                        sb4.append(valueOf);
                        obj = sb4.toString();
                    } else {
                        Pattern pattern3 = A03;
                        if (pattern3 == null) {
                            pattern3 = Pattern.compile("((?:[04-8][7-9]|9[78])\\d{6})");
                            A03 = pattern3;
                        }
                        if (pattern3.matcher(valueOf).matches()) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("+");
                            sb5.append(i);
                            sb5.append("07");
                            sb5.append(valueOf);
                            obj = sb5.toString();
                        }
                    }
                }
            }
            return A002.A0H(A002.A0F(obj, "ZZ"), EnumC10160fO.INTERNATIONAL);
        } catch (Exception e) {
            StringBuilder A0W = C000200d.A0W("contact/formatter-exception num:", obj, " ");
            A0W.append(e.getMessage());
            Log.e(A0W.toString(), e);
            return obj;
        } catch (ExceptionInInitializerError e2) {
            StringBuilder A0W2 = C000200d.A0W("contact/formatter-init-exception num:", obj, " ");
            A0W2.append(e2.getMessage());
            Log.e(A0W2.toString(), e2);
            return obj;
        }
    }
}
