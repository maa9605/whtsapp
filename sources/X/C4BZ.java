package X;

import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.security.KeyStoreException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4BZ */
/* loaded from: classes3.dex */
public class C4BZ implements InterfaceC03660Go {
    public static volatile C4BZ A04;
    public final C0GZ A00;
    public final C0EU A01;
    public final C897448g A02;
    public final C899248y A03;

    public C4BZ(C899248y c899248y, C0EU c0eu, C0GZ c0gz, C897448g c897448g) {
        this.A03 = c899248y;
        this.A01 = c0eu;
        this.A00 = c0gz;
        this.A02 = c897448g;
    }

    public static C4BZ A00() {
        if (A04 == null) {
            synchronized (C4BZ.class) {
                if (A04 == null) {
                    A04 = new C4BZ(C899248y.A01(), C0EU.A00(), C0GZ.A00(), C897448g.A00());
                }
            }
        }
        return A04;
    }

    public static void A01(ActivityC02270An activityC02270An, C0N2 c0n2) {
        String str;
        if (c0n2 == null) {
            C002701i.A19(activityC02270An, 102);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("credential_id", c0n2.A07);
        hashMap.put("last4", c0n2.A0A);
        C0N8 c0n8 = (C0N8) c0n2.A06;
        if (c0n8 != null) {
            StringBuilder A0P = C000200d.A0P("");
            A0P.append(c0n8.A04);
            str = A0P.toString();
        } else {
            str = "-1";
        }
        hashMap.put("remaining_retries", str);
        Intent intent = new Intent(activityC02270An, BrazilPayBloksActivity.class);
        intent.putExtra("screen_name", "brpay_p_reset_pin_from_card");
        intent.putExtra("screen_params", hashMap);
        activityC02270An.startActivity(intent);
    }

    @Override // X.InterfaceC03660Go
    public void A74() {
        this.A01.A0H(null);
        this.A03.A04();
        C897448g c897448g = this.A02;
        C48Y c48y = c897448g.A01;
        c48y.A00();
        C899148x c899148x = c48y.A00;
        if (c899148x != null) {
            try {
                c899148x.A01.deleteEntry("alias-payments-br-trusted-device-key");
            } catch (KeyStoreException unused) {
                Log.e("PAY: Secp256r1KeyStoreHelper/deleteKeyPair failed");
            }
        }
        try {
            C0EU c0eu = c897448g.A00;
            String A06 = c0eu.A06();
            if (TextUtils.isEmpty(A06)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(A06);
            jSONObject.remove("td");
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: TrustedDeviceKeyStore delete failed", e);
        }
    }

    @Override // X.InterfaceC03660Go
    public boolean AUM(C0K8 c0k8) {
        return (this.A01.A04().getBoolean("payments_card_can_receive_payment", false) && this.A00.A09()) ? false : true;
    }
}
