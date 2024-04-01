package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0EU */
/* loaded from: classes.dex */
public class C0EU {
    public static volatile C0EU A04;
    public SharedPreferences A00;
    public final AnonymousClass012 A01;
    public final C014406v A02 = C014406v.A00("PaymentSharedPrefs", "infra", "COMMON");
    public final C02O A03;

    public C0EU(AnonymousClass012 anonymousClass012, C02O c02o) {
        this.A01 = anonymousClass012;
        this.A03 = c02o;
    }

    public static C0EU A00() {
        if (A04 == null) {
            synchronized (C0EU.class) {
                if (A04 == null) {
                    A04 = new C0EU(AnonymousClass012.A00(), C02O.A00());
                }
            }
        }
        return A04;
    }

    public static final String A01(Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put(((Jid) entry.getKey()).getRawString(), entry.getValue());
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PAY: PaymentSharedPrefs/getRawFromJidsWithExpiration/exception: ");
            sb.append(e);
            Log.e(sb.toString());
        }
        return jSONObject.toString();
    }

    public static final String A02(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((Jid) it.next()).getRawString());
        }
        return TextUtils.join(";", hashSet);
    }

    public static final Set A03(String str) {
        List<String> asList = Arrays.asList(str.split(";"));
        HashSet hashSet = new HashSet();
        for (String str2 : asList) {
            UserJid nullable = UserJid.getNullable(str2);
            if (nullable != null) {
                hashSet.add(nullable);
            }
        }
        return hashSet;
    }

    public final synchronized SharedPreferences A04() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A02("com.whatsapp_payment_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C0KJ A05() {
        String string = A04().getString("payment_step_up_info", null);
        if (string != null) {
            return C0KJ.A01(string);
        }
        return null;
    }

    public String A06() {
        return A04().getString("payments_setup_country_specific_info", "");
    }

    public String A07(boolean z) {
        return z ? A04().getString("payments_setup_completed_steps", "") : A04().getString("payments_merchant_setup_completed_steps", "");
    }

    public Map A08() {
        return A0A(A04().getString("payments_invitee_jids_with_expiry", ""));
    }

    public Map A09() {
        return A0A(A04().getString("payments_inviter_jids_with_expiry", ""));
    }

    public final Map A0A(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long A05 = this.A01.A05();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    UserJid nullable = UserJid.getNullable(next);
                    long j = jSONObject.getLong(next);
                    if (nullable != null && j >= A05) {
                        hashMap.put(nullable, Long.valueOf(j));
                    }
                }
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: PaymentSharedPrefs/getJidsWithExpirationFromRaw/exception: ");
                sb.append(e);
                Log.e(sb.toString());
            }
        }
        return hashMap;
    }

    public Set A0B() {
        return A03(A04().getString("payments_invitee_jids", ""));
    }

    public Set A0C() {
        return A03(A04().getString("payments_inviter_jids", ""));
    }

    public void A0D() {
        A04().edit().remove("payment_dyi_report_state").remove("payment_dyi_report_timestamp").remove("payment_dyi_report_expiration_timestamp").apply();
    }

    public void A0E(int i) {
        A04().edit().putInt("payment_dyi_report_state", i).apply();
    }

    public void A0F(long j) {
        A04().edit().putLong("payments_enabled_till", j).apply();
    }

    public void A0G(UserJid userJid, boolean z) {
        if (z) {
            Map A09 = A09();
            ((AbstractMap) A09).remove(userJid);
            A04().edit().putString("payments_inviter_jids_with_expiry", A01(A09)).apply();
            return;
        }
        Set A0C = A0C();
        ((AbstractCollection) A0C).remove(userJid);
        A04().edit().putString("payments_inviter_jids", A02(A0C)).apply();
    }

    public void A0H(String str) {
        C000200d.A0k(this, "payments_setup_country_specific_info", str);
    }

    public void A0I(boolean z) {
        if (z) {
            A04().edit().remove("payments_setup_completed_steps").remove("payments_merchant_setup_completed_steps").remove("payments_methods_last_sync_time").remove("payments_card_can_receive_payment").remove("payments_all_transactions_last_sync_time").remove("payments_pending_transactions_last_sync_time").remove("payments_nagged_transactions").remove("payments_sent_payment_with_account").remove("payments_sandbox").remove("payments_invitee_jids").remove("payments_inviter_jids").remove("payments_enabled_till").remove("payments_support_phone_number").remove("payments_device_id").remove("payments_network_id_map").remove("payment_trusted_device_credential").remove("payment_trusted_device_credential_encrypted_aes").remove("payment_kyc_info").remove("payment_step_up_info").remove("payment_dyi_report_expiration_timestamp").remove("payment_dyi_report_timestamp").remove("payment_dyi_report_state").remove("payments_invitee_jids_with_expiry").remove("payments_inviter_jids_with_expiry").apply();
        } else {
            A04().edit().remove("payments_merchant_setup_completed_steps").apply();
        }
    }
}
