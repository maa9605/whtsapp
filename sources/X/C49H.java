package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.49H  reason: invalid class name */
/* loaded from: classes3.dex */
public class C49H {
    public Context A00;
    public C0DV A01;
    public final C02L A02;
    public final C002301c A03;
    public final C014406v A04 = C014406v.A00("PaymentMethodNotificationUtil", "notification", "COMMON");

    public C49H(Context context, C02L c02l, C002301c c002301c, C0DV c0dv) {
        this.A00 = context;
        this.A01 = c0dv;
        this.A02 = c02l;
        this.A03 = c002301c;
    }

    private PendingIntent A00(Context context, C0N2 c0n2, String str) {
        if (c0n2 != null) {
            Intent intent = new Intent(context, this.A01.A03().A8G());
            intent.addFlags(335544320);
            intent.putExtra("extra_bank_account", c0n2);
            return PendingIntent.getActivity(context, 0, intent, 0);
        }
        Class ACK = this.A01.A03().ACK();
        C014406v c014406v = this.A04;
        StringBuilder sb = new StringBuilder("getPendingIntent for ");
        sb.append(str);
        c014406v.A07(null, sb.toString(), null);
        Intent intent2 = new Intent(context, ACK);
        intent2.addFlags(335544320);
        return PendingIntent.getActivity(context, 0, intent2, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.PendingIntent A01(android.content.Context r7, X.C0N2 r8, java.lang.String r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L72
            X.0N0 r0 = r8.A06
            if (r0 == 0) goto L72
            int r0 = r9.hashCode()
            r4 = 1
            r3 = 0
            r5 = 2
            r1 = 3
            switch(r0) {
                case -945151213: goto L34;
                case -863506419: goto L2a;
                case -188177059: goto L20;
                case 1084491615: goto L16;
                default: goto L11;
            }
        L11:
            android.app.PendingIntent r0 = r6.A00(r7, r8, r9)
            return r0
        L16:
            java.lang.String r0 = "MERCHANT_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L11
            r0 = 1
            goto L3d
        L20:
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L11
            r0 = 2
            goto L3d
        L2a:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L11
            r0 = 0
            goto L3d
        L34:
            java.lang.String r0 = "MERCHANT_DISABLED"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L11
            r0 = 3
        L3d:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L48
            if (r0 == r5) goto L48
            if (r0 == r1) goto L48
            goto L11
        L48:
            java.lang.Class<com.whatsapp.payments.ui.BrazilFbPayHubActivity> r0 = com.whatsapp.payments.ui.BrazilFbPayHubActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)
            java.lang.String r0 = "extra_force_get_methods"
            r1.putExtra(r0, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r7, r3, r1, r2)
            return r0
        L5e:
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7, r0)
            java.lang.String r0 = "extra_bank_account"
            r1.putExtra(r0, r8)
            r1.addFlags(r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r7, r3, r1, r2)
            return r0
        L72:
            android.app.PendingIntent r0 = r6.A00(r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49H.A01(android.content.Context, X.0N2, java.lang.String):android.app.PendingIntent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r10.equals("MERCHANT_VERIFICATION_FAILURE") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        if (r10.equals("MERCHANT_DISABLED") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        if ((r9 instanceof X.C0N1) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        r0 = (X.AbstractC466427q) r9.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
        r4 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        r4 = r8.A02.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if ("MERCHANT_VERIFIED".equals(r10) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        return r8.A00.getString(com.google.android.search.verification.client.R.string.brazil_notification_merchant_verified_description, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if ("MERCHANT_VERIFICATION_FAILURE".equals(r10) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
        return r8.A00.getString(com.google.android.search.verification.client.R.string.brazil_notification_merchant_verification_failure_description, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        if ("MERCHANT_DISABLED".equals(r10) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        return r8.A00.getString(com.google.android.search.verification.client.R.string.brazil_notification_merchant_disabled_description, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r10.equals("MERCHANT_VERIFIED") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02(X.C0N2 r9, java.lang.String r10) {
        /*
            r8 = this;
            int r0 = r10.hashCode()
            java.lang.String r6 = "MERCHANT_VERIFIED"
            java.lang.String r5 = "MERCHANT_VERIFICATION_FAILURE"
            java.lang.String r2 = "MERCHANT_DISABLED"
            r3 = 1
            r7 = 0
            switch(r0) {
                case -945151213: goto L4d;
                case -863506419: goto L2b;
                case -188177059: goto L24;
                case 1084491615: goto L1d;
                default: goto Lf;
            }
        Lf:
            android.content.Context r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755138(0x7f100082, float:1.9141147E38)
            java.lang.String r0 = r1.getQuantityString(r0, r3)
            return r0
        L1d:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto Lf
            goto L53
        L24:
            boolean r0 = r10.equals(r5)
            if (r0 == 0) goto Lf
            goto L53
        L2b:
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto Lf
            boolean r0 = r9 instanceof X.C0N7
            if (r0 == 0) goto Lab
            X.0N7 r9 = (X.C0N7) r9
            android.content.Context r4 = r8.A00
            r2 = 2131886430(0x7f12015e, float:1.9407439E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.01c r0 = r8.A03
            java.lang.String r0 = X.C40841sx.A0E(r0, r9)
            r1[r7] = r0
            java.lang.String r0 = r4.getString(r2, r1)
            return r0
        L4d:
            boolean r0 = r10.equals(r2)
            if (r0 == 0) goto Lf
        L53:
            boolean r0 = r9 instanceof X.C0N1
            if (r0 == 0) goto Lab
            X.0N0 r0 = r9.A06
            X.27q r0 = (X.AbstractC466427q) r0
            java.lang.String r1 = ""
            if (r0 == 0) goto La9
            java.lang.String r4 = r0.A02
        L61:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L6d
            X.02L r0 = r8.A02
            java.lang.String r4 = r0.A02()
        L6d:
            boolean r0 = r6.equals(r10)
            if (r0 == 0) goto L81
            android.content.Context r2 = r8.A00
            r1 = 2131886429(0x7f12015d, float:1.9407437E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r7] = r4
            java.lang.String r1 = r2.getString(r1, r0)
        L80:
            return r1
        L81:
            boolean r0 = r5.equals(r10)
            if (r0 == 0) goto L95
            android.content.Context r2 = r8.A00
            r1 = 2131886428(0x7f12015c, float:1.9407435E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r7] = r4
            java.lang.String r1 = r2.getString(r1, r0)
            return r1
        L95:
            boolean r0 = r2.equals(r10)
            if (r0 == 0) goto L80
            android.content.Context r2 = r8.A00
            r1 = 2131886427(0x7f12015b, float:1.9407433E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r7] = r4
            java.lang.String r1 = r2.getString(r1, r0)
            return r1
        La9:
            r4 = r1
            goto L61
        Lab:
            android.content.Context r0 = r8.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755138(0x7f100082, float:1.9141147E38)
            java.lang.String r0 = r1.getQuantityString(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49H.A02(X.0N2, java.lang.String):java.lang.String");
    }
}
