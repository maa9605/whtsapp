package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.48w */
/* loaded from: classes3.dex */
public class C899048w {
    public static final byte[] A04 = Base64.decode("l6AjIyMhJYdTCB0+urtee7k2HmerRdr4c6seZyY2Pmw=", 2);
    public static final byte[] A05 = Base64.decode("oHsO+vVXYHOZXitgkZS2DI9N4+L+klLpMby3+JOPVGo=", 2);
    public static volatile C899048w A06;
    public final AnonymousClass012 A00;
    public final C898948v A01;
    public final C014406v A02 = C014406v.A00("PaymentsProviderKeyManager", "infra", "COMMON");
    public final C49692Lz A03;

    public C899048w(AnonymousClass012 anonymousClass012, C49692Lz c49692Lz, C898948v c898948v) {
        this.A00 = anonymousClass012;
        this.A03 = c49692Lz;
        this.A01 = c898948v;
    }

    public static C899048w A00() {
        if (A06 == null) {
            synchronized (C899048w.class) {
                if (A06 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C49692Lz c49692Lz = C49692Lz.A00;
                    if (C898948v.A03 == null) {
                        synchronized (C898948v.class) {
                            if (C898948v.A03 == null) {
                                C898948v.A03 = new C898948v(C02O.A00());
                            }
                        }
                    }
                    A06 = new C899048w(A00, c49692Lz, C898948v.A03);
                }
            }
        }
        return A06;
    }

    public C77343i3 A01(C02590Ca c02590Ca) {
        String str;
        String A0G = c02590Ca.A0G("key-type");
        String A0G2 = c02590Ca.A0G("provider");
        String A0G3 = c02590Ca.A0G("key-version");
        String A0G4 = c02590Ca.A0G("key-scope");
        C04P A0A = c02590Ca.A0A("expiry-ts");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        byte[] bArr = "none".equals(A0G) ? null : c02590Ca.A0E("data").A01;
        byte[] bArr2 = c02590Ca.A0E("signature").A01;
        if (bArr2 != null) {
            C77343i3 c77343i3 = new C77343i3(A0G2, A0G4, A0G, A0G3, bArr, TextUtils.isEmpty(str) ? null : Long.valueOf(AnonymousClass024.A03(str, 0L)));
            if (this.A03 != null) {
                byte[] bArr3 = A04;
                int length = bArr3.length;
                if (length == 32) {
                    byte[][] bArr4 = new byte[6];
                    bArr4[0] = c77343i3.A05.getBytes();
                    bArr4[1] = c77343i3.A03.getBytes();
                    bArr4[2] = c77343i3.A04.getBytes();
                    byte[] bArr5 = c77343i3.A06;
                    if (bArr5 == null) {
                        bArr5 = new byte[0];
                    }
                    bArr4[3] = bArr5;
                    bArr4[4] = c77343i3.A02.getBytes();
                    Long l = c77343i3.A01;
                    bArr4[5] = l == null ? new byte[0] : String.valueOf(l).getBytes();
                    if (C40631sa.A00().A03(bArr3, AnonymousClass029.A1h(bArr4), bArr2)) {
                        return c77343i3;
                    }
                    return null;
                }
                StringBuilder A0P = C000200d.A0P("Wrong length: ");
                A0P.append(length);
                throw new IllegalArgumentException(A0P.toString());
            }
            throw null;
        }
        throw null;
    }

    public C77343i3 A02(String str, String str2, boolean z) {
        JSONObject jSONObject;
        String optString;
        String optString2;
        String optString3;
        C77343i3 c77343i3;
        Long l;
        C898948v c898948v = this.A01;
        String string = c898948v.A00().getString(C000200d.A0I(str, "::", str2), null);
        if (TextUtils.isEmpty(string)) {
            C014406v c014406v = c898948v.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("getProviderKey/provider=");
            sb.append(str);
            sb.append(" is null");
            c014406v.A03(sb.toString());
        } else {
            try {
                jSONObject = new JSONObject(string);
                optString = jSONObject.optString("key_type");
                optString2 = jSONObject.optString("key_version");
                optString3 = jSONObject.optString("key_data");
            } catch (JSONException e) {
                C014406v c014406v2 = c898948v.A01;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getProviderKey/provider=");
                sb2.append(str);
                sb2.append(" threw: ");
                c014406v2.A08(sb2.toString(), e);
            }
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || (!"none".equals(optString) && TextUtils.isEmpty(optString3))) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("getProviderKey/provider=");
                sb3.append(str);
                sb3.append(" providerKey is null");
                StringBuilder sb4 = new StringBuilder(C014406v.A01("PaymentProviderKeySharedPrefs", sb3.toString()));
                if (TextUtils.isEmpty(optString)) {
                    sb4.append(" keyType is null");
                }
                if (TextUtils.isEmpty(optString2)) {
                    sb4.append(" keyVersion is null");
                }
                if (!"none".equals(optString) && TextUtils.isEmpty(optString3)) {
                    sb4.append(" keyData is null");
                }
                Log.e(sb4.toString());
            } else {
                String optString4 = jSONObject.optString("key_expiry");
                c77343i3 = new C77343i3(str, str2, optString, optString2, Base64.decode(optString3, 2), TextUtils.isEmpty(optString4) ? null : Long.valueOf(AnonymousClass024.A03(optString4, 0L)));
                if (!z && c77343i3 != null && (l = c77343i3.A01) != null && l.longValue() * 1000 < this.A00.A05()) {
                    c898948v.A00().edit().remove(C000200d.A0I(str, "::", str2)).apply();
                    return null;
                }
                return c77343i3;
            }
        }
        c77343i3 = null;
        if (!z) {
        }
        return c77343i3;
    }

    public void A03(C77343i3 c77343i3) {
        C898948v c898948v = this.A01;
        String str = c77343i3.A02;
        SharedPreferences.Editor edit = c898948v.A00().edit();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key_type", c77343i3.A03).put("key_version", c77343i3.A04);
            byte[] bArr = c77343i3.A06;
            if (bArr != null) {
                jSONObject.put("key_data", Base64.encodeToString(bArr, 2));
            }
            Long l = c77343i3.A01;
            if (l != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(l);
                jSONObject.put("key_expiry", sb.toString());
            }
            edit.putString(C000200d.A0I(c77343i3.A05, "::", str), jSONObject.toString());
            edit.apply();
        } catch (JSONException e) {
            C014406v c014406v = c898948v.A01;
            StringBuilder sb2 = new StringBuilder("storeProviderKey threw ");
            sb2.append(e);
            c014406v.A04(sb2.toString());
        }
    }

    public void A04(String str, String str2, C28Q c28q) {
        this.A01.A00().edit().remove(C000200d.A0I(str, "::", str2)).apply();
        C02590Ca c02590Ca = c28q.A03;
        if (c02590Ca != null) {
            try {
                C77343i3 A01 = A01(c02590Ca);
                if (A01 != null) {
                    A03(A01);
                }
            } catch (C0L4 e) {
                C014406v c014406v = this.A02;
                StringBuilder sb = new StringBuilder("handleStaleKey/failed to parse key node/exception: ");
                sb.append(e);
                c014406v.A04(sb.toString());
            }
        }
    }
}
