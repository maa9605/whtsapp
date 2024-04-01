package X;

import android.app.ProgressDialog;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.3VI  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3VI {
    public C83383s2 A00;
    public final C002301c A01;
    public final C49622Lq A02;
    public final C41451tw A03;
    public final C40071rX A04;
    public final InterfaceC002901k A05;

    public C3VI(InterfaceC002901k interfaceC002901k, C40071rX c40071rX, C002301c c002301c, C49622Lq c49622Lq, C41451tw c41451tw) {
        this.A05 = interfaceC002901k;
        this.A04 = c40071rX;
        this.A01 = c002301c;
        this.A02 = c49622Lq;
        this.A03 = c41451tw;
    }

    public void A00() {
        ProgressDialog progressDialog;
        C83383s2 c83383s2 = this.A00;
        if (c83383s2 == null || (progressDialog = c83383s2.A00) == null || !progressDialog.isShowing()) {
            return;
        }
        c83383s2.A00.cancel();
    }

    public void A01(ActivityC02290Ap activityC02290Ap, C2CQ c2cq, String str) {
        String str2;
        C83383s2 c83383s2 = this.A00;
        if (c83383s2 != null) {
            c83383s2.A05(true);
        }
        Uri.Builder appendPath = C40071rX.A00().appendPath("verification.php");
        C002301c c002301c = this.A01;
        String A03 = c002301c.A03();
        String A04 = c002301c.A04();
        C02E c02e = c2cq.A08;
        TelephonyManager A0G = c02e.A0G();
        if (A0G != null) {
            str2 = C28A.A01(A0G.getNetworkOperator(), "000-000");
        } else {
            str2 = "none";
        }
        HashMap hashMap = new HashMap();
        if (c2cq.A00 != null) {
            hashMap.put("platform", "android");
            hashMap.put("network", str2);
            hashMap.put("lc", A03);
            hashMap.put("lg", A04);
            hashMap.put("context", c2cq.A00);
            StringBuilder sb = new StringBuilder();
            if (C02A.A0A(c02e)) {
                sb.append("rted ");
            }
            try {
                Class.forName("org.acra.ACRA");
                sb.append("nw-wap ");
            } catch (ClassNotFoundException unused) {
            }
            hashMap.put("diagnostic", sb.length() == 0 ? null : sb.toString());
            hashMap.put("fail_too_many", c2cq.A01 ? "true" : "false");
            hashMap.put("no_route_sms", c2cq.A02 ? "true" : "false");
            hashMap.put("no_route_voice", c2cq.A03 ? "true" : "false");
            hashMap.put("valid_number", c2cq.A05 ? "true" : "false");
            hashMap.put("no_number", c2cq.A04 ? "true" : "false");
            hashMap.put("debug-context", c2cq.A01(c2cq.A00));
        }
        for (String str3 : hashMap.keySet()) {
            String str4 = (String) hashMap.get(str3);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            appendPath.appendQueryParameter(str3, str4);
        }
        C83383s2 c83383s22 = new C83383s2(activityC02290Ap, this.A02, this.A03, appendPath.toString(), c2cq.A01(str));
        this.A00 = c83383s22;
        this.A05.ARy(c83383s22, new String[0]);
    }
}
