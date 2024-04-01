package X;

import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.493 */
/* loaded from: classes3.dex */
public class AnonymousClass493 {
    public static volatile AnonymousClass493 A03;
    public final C0LI A00;
    public final C0EU A01;
    public final C014406v A02 = C014406v.A00("PaymentFingerprintKeyStore", "payment-settings", "COMMON");

    public AnonymousClass493(C001200o c001200o, C0EU c0eu) {
        this.A01 = c0eu;
        this.A00 = new C0LI(c001200o.A00);
    }

    public static AnonymousClass493 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass493.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass493(C001200o.A01, C0EU.A00());
                }
            }
        }
        return A03;
    }

    public synchronized int A01() {
        int i;
        String A06;
        JSONObject optJSONObject;
        try {
            A06 = this.A01.A06();
        } catch (JSONException e) {
            this.A02.A08("getState threw: ", e);
        }
        if (!TextUtils.isEmpty(A06) && (optJSONObject = new JSONObject(A06).optJSONObject("bio")) != null) {
            i = optJSONObject.optInt("bioState", 0);
            if (i == 1 && AnonymousClass088.A0R() == null) {
                A03();
                return 0;
            }
            return i;
        }
        i = 0;
        return i;
    }

    public final synchronized String A02(int i) {
        String str;
        str = null;
        try {
            C0EU c0eu = this.A01;
            String A06 = c0eu.A06();
            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
            JSONObject optJSONObject = jSONObject.optJSONObject("bio");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", "1");
            if (i != 0) {
                if (i == 2) {
                    str = UUID.randomUUID().toString().replace("-", "");
                    optJSONObject.put("bioId", str);
                }
            } else {
                optJSONObject.remove("bioId");
                optJSONObject.remove("bioPublicKey");
            }
            optJSONObject.put("bioState", i);
            jSONObject.put("bio", optJSONObject);
            c0eu.A0H(jSONObject.toString());
        } catch (JSONException e) {
            this.A02.A08("PaymentFingerprintKeyStore setState threw: ", e);
        }
        return str;
    }

    public void A03() {
        Log.i("FingerprintHelper-helper/remove-key");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("payment_bio_key_alias");
            A02(0);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            StringBuilder A0P = C000200d.A0P("FingerprintHelper/removeKey: api=");
            A0P.append(Build.VERSION.SDK_INT);
            A0P.append(" error: ");
            A0P.append(e.toString());
            Log.i(A0P.toString());
        }
    }

    public void A04(String str) {
        String str2;
        JSONObject optJSONObject;
        if (str != null) {
            synchronized (this) {
                str2 = null;
                try {
                    String A06 = this.A01.A06();
                    if (!TextUtils.isEmpty(A06) && (optJSONObject = new JSONObject(A06).optJSONObject("bio")) != null) {
                        str2 = optJSONObject.optString("bioId", null);
                    }
                } catch (JSONException e) {
                    this.A02.A08("getId threw: ", e);
                }
            }
            if (str.equals(str2)) {
                A02(1);
                return;
            }
        }
        A03();
    }

    public boolean A05() {
        C0LI c0li = this.A00;
        return c0li.A03() && c0li.A02();
    }

    public boolean A06(final byte[] bArr, C0HE c0he, final InterfaceC06550Tv interfaceC06550Tv) {
        C09S A0R = AnonymousClass088.A0R();
        if (A0R != null) {
            this.A00.A01(A0R, c0he, new C0LJ() { // from class: X.4Cd
                {
                    AnonymousClass493.this = this;
                }

                @Override // X.C0LJ
                public void A00() {
                    AnonymousClass493.this.A02.A07(null, "sign: authentication failed", null);
                    interfaceC06550Tv.AHa();
                }

                @Override // X.C0LJ
                public void A01(int i, CharSequence charSequence) {
                    C014406v c014406v = AnonymousClass493.this.A02;
                    StringBuilder sb = new StringBuilder("sign: authentication error=");
                    sb.append(i);
                    sb.append(" errString=");
                    sb.append(i);
                    c014406v.A04(sb.toString());
                    interfaceC06550Tv.AHZ(i, charSequence);
                }

                @Override // X.C0LJ
                public void A02(int i, CharSequence charSequence) {
                    C014406v c014406v = AnonymousClass493.this.A02;
                    StringBuilder sb = new StringBuilder("sign: authentication help=");
                    sb.append(i);
                    sb.append(" errString=");
                    sb.append((Object) charSequence);
                    c014406v.A07(null, sb.toString(), null);
                    interfaceC06550Tv.AHb(i, charSequence);
                }

                @Override // X.C0LJ
                public void A03(C12930kK c12930kK) {
                    try {
                        Signature signature = c12930kK.A00.A00;
                        if (signature != null) {
                            signature.update(bArr);
                            interfaceC06550Tv.AHc(signature.sign());
                            return;
                        }
                        throw null;
                    } catch (SignatureException e) {
                        C014406v c014406v = AnonymousClass493.this.A02;
                        StringBuilder A0P = C000200d.A0P("sign: api=");
                        A0P.append(Build.VERSION.SDK_INT);
                        A0P.append(" error: ");
                        A0P.append(e.toString());
                        c014406v.A04(A0P.toString());
                        interfaceC06550Tv.AHc(null);
                    }
                }
            });
            return true;
        }
        this.A02.A07(null, "sign: cryptoObject is null", null);
        A03();
        return false;
    }
}
