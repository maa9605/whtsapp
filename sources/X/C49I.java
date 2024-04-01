package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.49I */
/* loaded from: classes3.dex */
public class C49I {
    public static volatile C49I A05;
    public final C002301c A00;
    public final C0GZ A01;
    public final C03550Gd A02;
    public final C0DW A03;
    public final AnonymousClass499 A04;

    public C49I(C002301c c002301c, C0GZ c0gz, C0DW c0dw, AnonymousClass499 anonymousClass499, C03550Gd c03550Gd) {
        this.A00 = c002301c;
        this.A03 = c0dw;
        this.A01 = c0gz;
        this.A04 = anonymousClass499;
        this.A02 = c03550Gd;
    }

    public static C49I A00() {
        if (A05 == null) {
            synchronized (C49I.class) {
                if (A05 == null) {
                    C002301c A00 = C002301c.A00();
                    C000500h.A00();
                    A05 = new C49I(A00, C0GZ.A00(), C0DW.A00(), AnonymousClass499.A00(), C03550Gd.A00());
                }
            }
        }
        return A05;
    }

    public Intent A01(Context context, C0N7 c0n7, String str) {
        Intent intent = new Intent(context, BrazilPayBloksActivity.class);
        intent.putExtra("screen_params", A03(c0n7, str));
        intent.putExtra("screen_name", "brpay_p_card_verify_options");
        intent.putExtra("payment_method_credential_id", c0n7.A07);
        return intent;
    }

    public String A02(boolean z) {
        if (z) {
            C03680Gq A00 = this.A01.A00();
            if (A00 != null) {
                String str = A00.A03;
                if (str.equals("tos_no_wallet")) {
                    return "brpay_p_tos";
                }
                if (this.A04.A04()) {
                    if (str.equals("add_card")) {
                        return "brpay_p_compliance_kyc_next_screen_router";
                    }
                    return null;
                }
                return "brpay_p_pin_nux_create";
            }
            return null;
        }
        this.A03.A01();
        return null;
    }

    public HashMap A03(C0N7 c0n7, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("credential_id", c0n7.A07);
        if (str != null) {
            hashMap.put("verify_methods", str);
        }
        hashMap.put("source", "pay_flow");
        hashMap.put("network_name", C0N7.A06(c0n7.A01));
        C0N8 c0n8 = (C0N8) c0n7.A06;
        if (c0n8 != null && !TextUtils.isEmpty(c0n8.A0E)) {
            hashMap.put("card_image_url", c0n8.A0E);
        }
        hashMap.put("readable_name", C40841sx.A0E(this.A00, c0n7));
        hashMap.put("verified_state", ((C0N8) c0n7.A06).A0X ? "1" : "0");
        return hashMap;
    }
}
