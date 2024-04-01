package X;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.EditText;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.28E */
/* loaded from: classes2.dex */
public class C28E {
    public static String A00 = "";

    public static int A00(EditText editText) {
        if (editText.isFocused()) {
            String obj = editText.getText().toString();
            int i = 0;
            for (int i2 = 0; i2 < editText.getSelectionEnd() && i2 <= obj.length(); i2++) {
                if (obj.charAt(i2) <= '9' && obj.charAt(i2) >= '0') {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public static int A01(String str, String str2) {
        int length;
        int length2;
        if (str != null && str2 != null && (length = str.length()) >= 6 && (length2 = str2.length()) >= 6) {
            int i = length - 6;
            int i2 = length2 - 6;
            int i3 = 0;
            int i4 = 0;
            do {
                if (str.charAt(i + i3) != str2.charAt(i2 + i3)) {
                    i4++;
                }
                i3++;
            } while (i3 < 6);
            return i4;
        }
        return -1;
    }

    public static long A02(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                Log.w(e);
            }
        }
        return j;
    }

    public static Dialog A03(final ActivityC02290Ap activityC02290Ap, C002301c c002301c, final C018808t c018808t, final String str, final String str2, final Runnable runnable) {
        boolean z = runnable != null;
        StringBuilder sb = new StringBuilder("registrationutils/dialog/ban cancelable=");
        sb.append(z);
        Log.w(sb.toString());
        String A0F = c002301c.A0F(A0C(str, str2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(activityC02290Ap.getString(R.string.register_user_is_banned_top));
        sb2.append("\n");
        sb2.append(A0F);
        sb2.append("\n");
        sb2.append(activityC02290Ap.getString(R.string.register_user_is_banned_bottom));
        String obj = sb2.toString();
        C019208x c019208x = new C019208x(activityC02290Ap);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = obj;
        c019308y.A0J = z;
        c019208x.A08(activityC02290Ap.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: X.3Ua
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                Runnable runnable2 = runnable;
                C002701i.A18(activityC02290Ap2, 124);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        String string = activityC02290Ap.getString(R.string.register_user_support_button);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3Ub
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                Runnable runnable2 = runnable;
                C018808t c018808t2 = c018808t;
                String str3 = str;
                String str4 = str2;
                C002701i.A18(activityC02290Ap2, 124);
                if (runnable2 != null) {
                    runnable2.run();
                }
                activityC02290Ap2.startActivity(C002701i.A09(activityC02290Ap2, c018808t2, C000200d.A0I("blocked +", str3, str4), null, null, null, null, null));
            }
        };
        c019308y.A0G = string;
        c019308y.A04 = onClickListener;
        return c019208x.A00();
    }

    public static Dialog A04(final ActivityC02290Ap activityC02290Ap, final C018808t c018808t, final String str, final String str2) {
        Log.w("registrationutils/dialog/underage-ban cancelable=");
        C019208x c019208x = new C019208x(activityC02290Ap);
        String string = activityC02290Ap.getString(R.string.underage_account_ban_title);
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = string;
        c019308y.A0E = activityC02290Ap.getString(R.string.underage_account_ban_description);
        c019308y.A0J = false;
        c019208x.A08(activityC02290Ap.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: X.3UW
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C002701i.A18(activityC02290Ap, 125);
            }
        });
        String string2 = activityC02290Ap.getString(R.string.register_contact_support);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3UZ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                C018808t c018808t2 = c018808t;
                String str3 = str;
                String str4 = str2;
                C002701i.A18(activityC02290Ap2, 125);
                StringBuilder sb = new StringBuilder("blocked +");
                sb.append(str3);
                sb.append(str4);
                activityC02290Ap2.startActivity(C002701i.A09(activityC02290Ap2, c018808t2, sb.toString(), null, null, null, null, null));
            }
        };
        c019308y.A0G = string2;
        c019308y.A04 = onClickListener;
        return c019208x.A00();
    }

    public static Dialog A05(final ActivityC02290Ap activityC02290Ap, final InterfaceC002901k interfaceC002901k, final C02E c02e, final C018808t c018808t, final C0E7 c0e7, final C02F c02f, final C2DT c2dt) {
        Log.i("registrationutils/dialog/cant-connect");
        C019208x c019208x = new C019208x(activityC02290Ap);
        String string = activityC02290Ap.getString(R.string.register_try_again_later);
        C019308y c019308y = c019208x.A01;
        c019308y.A0E = string;
        c019208x.A08(activityC02290Ap.getString(R.string.check_system_status), new DialogInterface.OnClickListener() { // from class: X.3UX
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                InterfaceC002901k interfaceC002901k2 = interfaceC002901k;
                C02E c02e2 = c02e;
                C018808t c018808t2 = c018808t;
                C0E7 c0e72 = c0e7;
                C02F c02f2 = c02f;
                C2DT c2dt2 = c2dt;
                Log.i("verifynumber/dialog/cant-connect/button/checkstatus");
                C002701i.A18(activityC02290Ap2, 109);
                interfaceC002901k2.ARy(new C34701hx(activityC02290Ap2, c02e2, c018808t2, c0e72, c02f2, c2dt2, true, true, false, "reg/cant-connect", null), new String[0]);
            }
        });
        String string2 = activityC02290Ap.getString(R.string.cancel);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.3UV
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                Log.i("registername/dialog/cant-connect/button/cancel");
                C002701i.A18(activityC02290Ap2, 109);
            }
        };
        c019308y.A0F = string2;
        c019308y.A03 = onClickListener;
        c019308y.A02 = new DialogInterface.OnCancelListener() { // from class: X.3UY
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Log.i("registername/dialog/cant-connect/cancel");
            }
        };
        return c019208x.A00();
    }

    public static SpannableStringBuilder A06(String str, String str2, Runnable runnable) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, runnable);
        return A07(str, hashMap, 0, null);
    }

    public static SpannableStringBuilder A07(String str, final Map map, final int i, TextAppearanceSpan textAppearanceSpan) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (final URLSpan uRLSpan : uRLSpanArr) {
                if (map.containsKey(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new AbstractC02750Cs() { // from class: X.3wd
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0, 0, 0);
                        }

                        @Override // X.InterfaceC02760Ct
                        public void onClick(View view) {
                            Runnable runnable = (Runnable) map.get(uRLSpan.getURL());
                            if (runnable != null) {
                                runnable.run();
                            }
                        }

                        @Override // X.AbstractC02750Cs, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                            int i2 = i;
                            if (i2 != 0) {
                                textPaint.setColor(i2);
                            } else {
                                textPaint.setColor(textPaint.linkColor);
                            }
                        }
                    }, spanStart, spanEnd, spanFlags);
                    if (textAppearanceSpan != null) {
                        spannableStringBuilder.setSpan(textAppearanceSpan, spanStart, spanEnd, spanFlags);
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    public static C1KQ A08(C0DZ c0dz, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("\\D", "");
        if (!TextUtils.isEmpty(str3) && !str3.equals("ZZ")) {
            try {
                C10090fH A0F = c0dz.A0F(replaceAll, str3.toUpperCase(Locale.US));
                return new C1KQ(String.valueOf(A0F.countryCode_), String.valueOf(A0F.nationalNumber_), str2);
            } catch (C24581Cb e) {
                Log.w("parsePhoneNumber/exception", e);
            }
        }
        String A0s = C002701i.A0s(replaceAll);
        if (A0s != null) {
            return new C1KQ(A0s, replaceAll.substring(A0s.length()), str2);
        }
        return null;
    }

    public static String A09(AnonymousClass031 anonymousClass031, String str, String str2) {
        String str3;
        String replaceAll = str2.replaceAll("\\D", "");
        try {
            str3 = anonymousClass031.A02(Integer.parseInt(str), replaceAll);
        } catch (IOException e) {
            Log.e("verify/number/trim/error", e);
            str3 = null;
        }
        return str3 != null ? A0C(str, replaceAll.substring(str.length())) : replaceAll;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0058, code lost:
        if (r5.equals(r4) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A0A(X.AnonymousClass031 r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r0 != 0) goto L83
            int r1 = r12.length()
            int r0 = r11.length()
            if (r1 < r0) goto L83
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r5 = r12.replaceAll(r1, r0)
            java.lang.String r1 = r10.replaceAll(r1, r0)
            java.lang.String r6 = X.C002701i.A0i(r9, r11, r1)
            java.lang.String r4 = X.C002701i.A0i(r9, r11, r5)
            java.lang.String r7 = X.C000200d.A0H(r11, r6)
            int r0 = A01(r6, r4)
            if (r0 != 0) goto L4f
            boolean r0 = r4.equals(r6)
            if (r0 != 0) goto L4e
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L4e
            boolean r0 = X.C002701i.A1T(r5, r6, r4, r11)
            if (r0 != 0) goto L4e
            boolean r0 = r1.endsWith(r4)
            if (r0 == 0) goto L4f
            int r1 = X.C26L.A02(r9, r11, r4)
            r0 = 5
            if (r1 != r0) goto L4f
        L4e:
            return r8
        L4f:
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L5a
            boolean r0 = r5.equals(r4)
            r1 = 1
            if (r0 == 0) goto L5b
        L5a:
            r1 = 0
        L5b:
            boolean r0 = A0I(r9, r5, r11, r7, r3)
            if (r0 == 0) goto L62
            return r5
        L62:
            if (r1 == 0) goto L6b
            boolean r0 = A0I(r9, r4, r11, r7, r3)
            if (r0 == 0) goto L6b
            return r4
        L6b:
            boolean r0 = A0I(r9, r5, r11, r6, r2)
            if (r0 == 0) goto L76
            java.lang.String r0 = X.C000200d.A0H(r11, r5)
            return r0
        L76:
            if (r1 == 0) goto L83
            boolean r0 = A0I(r9, r4, r11, r6, r2)
            if (r0 == 0) goto L83
            java.lang.String r0 = X.C000200d.A0H(r11, r4)
            return r0
        L83:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28E.A0A(X.031, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String A0B(C001200o c001200o, C02E c02e, C02F c02f) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!c02f.A08()) {
            Log.i("verifynumber/getphonennumber/permission denied");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 22 && (activeSubscriptionInfoList = SubscriptionManager.from(c001200o.A00).getActiveSubscriptionInfoList()) != null) {
            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                String number = subscriptionInfo.getNumber();
                if (number != null) {
                    return number;
                }
            }
        }
        try {
            TelephonyManager A0G = c02e.A0G();
            if (A0G != null) {
                return A0G.getLine1Number();
            }
            return null;
        } catch (Exception e) {
            Log.w("verifynumber/getphonennumber/error ", e);
            return null;
        }
    }

    public static String A0C(String str, String str2) {
        if (str != null && str2 != null) {
            String A0J = C000200d.A0J("+", str, " ", str2);
            C0DZ A002 = C0DZ.A00();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("+");
                sb.append(str);
                sb.append(str2);
                return A002.A0H(A002.A0F(sb.toString(), "ZZ"), EnumC10160fO.INTERNATIONAL);
            } catch (Exception e) {
                Log.e("verifynumber/formatter-exception", e);
                return A0J;
            } catch (ExceptionInInitializerError e2) {
                Log.e("verifynumber/formatter-init-exception", e2);
                return A0J;
            }
        }
        Log.e("verifynumber/prettyprint/cc-or-phnum-is-null");
        return null;
    }

    public static List A0D(C02E c02e, C02F c02f, C0DZ c0dz) {
        C1KQ A08;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        ArrayList arrayList = new ArrayList();
        if (!c02f.A08()) {
            Log.i("verifynumber/getphonennumbers/permission denied");
            return arrayList;
        } else if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager A0F = c02e.A0F();
            if (A0F != null && (activeSubscriptionInfoList = A0F.getActiveSubscriptionInfoList()) != null) {
                for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                    C1KQ A082 = A08(c0dz, subscriptionInfo.getNumber(), subscriptionInfo.getCarrierName().toString(), subscriptionInfo.getCountryIso());
                    if (A082 != null) {
                        arrayList.add(A082);
                    }
                }
            }
            return arrayList;
        } else {
            try {
                TelephonyManager A0G = c02e.A0G();
                if (A0G != null && (A08 = A08(c0dz, A0G.getLine1Number(), A0G.getNetworkOperatorName(), A0G.getSimCountryIso())) != null) {
                    arrayList.add(A08);
                }
                return arrayList;
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumbers/error ", e);
                return arrayList;
            }
        }
    }

    public static void A0E(Context context, C005102h c005102h, int i) {
        Log.i("registrationutils/notify/unverified");
        long currentTimeMillis = System.currentTimeMillis();
        String string = context.getString(R.string.sms_notification_headline_unverified_app_name, context.getString(R.string.localized_app_name));
        String string2 = context.getString(R.string.sms_notification_title_unverified);
        String string3 = context.getString(R.string.sms_notification_message_unverified);
        Intent intent = new Intent(context, context.getClass());
        if (i != -1) {
            intent.putExtra("com.whatsapp.verifynumber.dialog", i);
        }
        intent.addFlags(536870912);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        C005402l A002 = C0DU.A00(context);
        A002.A0J = "critical_app_alerts@1";
        A002.A0B(string);
        A002.A07.when = currentTimeMillis;
        A002.A03(3);
        A002.A05(16, true);
        A002.A0A(string2);
        A002.A09(string3);
        A002.A09 = activity;
        A002.A07.icon = R.drawable.notifybar;
        c005102h.A03(null, 1, A002.A01());
    }

    public static void A0F(Context context, C2Aa c2Aa, C005102h c005102h, boolean z) {
        Intent intent;
        Log.i("registrationutils/notify/verified");
        long currentTimeMillis = System.currentTimeMillis();
        String string = context.getString(R.string.sms_notification_headline_verified_app_name, context.getString(R.string.localized_app_name));
        String string2 = context.getString(R.string.sms_notification_title_verified);
        String string3 = context.getString(R.string.sms_notification_message_verified);
        if (z) {
            intent = new Intent(context, Main.class);
        } else {
            intent = new Intent(context, RegisterName.class);
            c2Aa.A0B(2);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 0);
        C005402l A002 = C0DU.A00(context);
        A002.A0J = "other_notifications@1";
        A002.A0B(string);
        A002.A07.when = currentTimeMillis;
        A002.A03(3);
        A002.A05(16, true);
        A002.A0A(string2);
        A002.A09(string3);
        A002.A09 = activity;
        A002.A07.icon = R.drawable.notifybar;
        c005102h.A03(null, 1, A002.A01());
    }

    public static void A0G(EditText editText, int i) {
        int length = editText.getText().length();
        if (i <= -1 || i > length) {
            if (i <= length) {
                editText.setSelection(length);
                return;
            }
            editText.requestFocus();
            editText.setSelection(length);
            return;
        }
        editText.requestFocus();
        String obj = editText.getText().toString();
        int i2 = 0;
        for (int i3 = 0; i3 < obj.length() && i > 0; i3++) {
            if (obj.charAt(i3) <= '9' && obj.charAt(i3) >= '0') {
                i--;
            }
            i2++;
        }
        editText.setSelection(i2);
    }

    public static void A0H(C000500h c000500h, String str) {
        A00 = str;
        C000200d.A0i(c000500h, "registration_failure_reason", str);
    }

    public static boolean A0I(AnonymousClass031 anonymousClass031, String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length >= length2) {
            boolean A0J = A0J(str3, str);
            return z ? A0J && C26L.A02(anonymousClass031, str2, str.substring(length2)) == 1 : A0J && C26L.A02(anonymousClass031, str2, str) == 1;
        }
        return false;
    }

    public static boolean A0J(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int abs = Math.abs(length - length2);
        if (abs == 1) {
            String str3 = str2;
            if (length < length2) {
                str3 = str;
            }
            if (str3.equals(str)) {
                str = str2;
            }
            for (int i = 0; i < str3.length(); i++) {
                if (str3.charAt(i) != str.charAt(i)) {
                    return str.substring(i + 1).equals(str3.substring(i));
                }
            }
            return true;
        }
        if (abs == 0) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != str2.charAt(i2)) {
                    if (i2 == length - 1) {
                        return true;
                    }
                    int i3 = i2 + 1;
                    return str.substring(i3).equals(str2.substring(i3));
                }
            }
        }
        return false;
    }
}
