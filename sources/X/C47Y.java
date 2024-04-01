package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.47Y */
/* loaded from: classes3.dex */
public class C47Y {
    public static volatile C47Y A04;
    public final AnonymousClass012 A00;
    public final C898848u A01;
    public final C4AX A02;
    public final JniBridge A03;

    public C47Y(AnonymousClass012 anonymousClass012, JniBridge jniBridge, C898848u c898848u, C4AX c4ax) {
        this.A00 = anonymousClass012;
        this.A03 = jniBridge;
        this.A01 = c898848u;
        this.A02 = c4ax;
    }

    public static C47Y A00() {
        if (A04 == null) {
            AnonymousClass012 A00 = AnonymousClass012.A00();
            JniBridge jniBridge = JniBridge.getInstance();
            if (C898848u.A01 == null) {
                synchronized (C898848u.class) {
                    if (C898848u.A01 == null) {
                        C898848u.A01 = new C898848u(JniBridge.getInstance());
                    }
                }
            }
            C898848u c898848u = C898848u.A01;
            if (C4AX.A05 == null) {
                C4AX.A05 = new C4AX(C001200o.A01, C0EU.A00());
            }
            A04 = new C47Y(A00, jniBridge, c898848u, C4AX.A05);
        }
        return A04;
    }

    public static final String A01(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clientDeviceID", str);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("clientReferenceID", str2);
        }
        jSONObject.put("vProvisionedTokenID", str3);
        jSONObject.put("nonce", String.valueOf(new SecureRandom().nextInt(100000)));
        return jSONObject.toString();
    }

    public final String A02() {
        PrivateKey A00 = this.A02.A00();
        if (A00 != null) {
            StringBuilder A0P = C000200d.A0P("-----BEGIN PRIVATE KEY-----\r\n");
            A0P.append(Base64.encodeToString(A00.getEncoded(), 0));
            A0P.append("-----END PRIVATE KEY-----\r\n\u0000");
            return A0P.toString();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.security.interfaces.RSAKey] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.3i3] */
    public String A03(String str, C77343i3 c77343i3) {
        BigInteger bigInteger;
        C77343i3 c77343i32;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alg", "PS256");
            String obj = jSONObject.toString();
            PrivateKey A00 = this.A02.A00();
            String str2 = null;
            if (A00 != null) {
                try {
                    ?? r6 = (RSAKey) A00;
                    JSONObject put = new JSONObject().put("otp", str).put("certID", C898848u.A00(r6.getModulus()));
                    C898848u c898848u = this.A01;
                    String obj2 = put.toString();
                    try {
                        r6 = c77343i3;
                        bigInteger = ((RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(r6.A06))).getModulus();
                        c77343i32 = r6;
                    } catch (Exception e) {
                        try {
                            Log.w("PAY: JweCompactSerializer/getModulusFromProviderKey failed: ", e);
                            bigInteger = null;
                            c77343i32 = r6;
                        } catch (Exception e2) {
                            Log.w("PAY: JweCompactSerializer/generateStepUpJweToken failed: ", e2);
                        }
                    }
                    String encodeToString = Base64.encodeToString(new JSONObject().put("alg", "RSA-OAEP-256").put("enc", "A256GCM").put("typ", "JOSE").put("kid", C898848u.A00(bigInteger)).toString().getBytes("UTF-8"), 11);
                    byte[] bArr = new byte[32];
                    SecureRandom secureRandom = new SecureRandom();
                    secureRandom.nextBytes(bArr);
                    try {
                        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(c77343i32.A06));
                        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
                        cipher.init(1, generatePublic);
                        String encodeToString2 = Base64.encodeToString(cipher.doFinal(bArr), 11);
                        byte[] bArr2 = new byte[12];
                        secureRandom.nextBytes(bArr2);
                        String encodeToString3 = Base64.encodeToString(bArr2, 11);
                        byte[] bytes = obj2.getBytes("UTF-8");
                        byte[] bytes2 = encodeToString.getBytes("US-ASCII");
                        if (c898848u.A00 != null) {
                            byte[] bArr3 = (byte[]) JniBridge.jvidispatchOIOOOO(4, 16, bArr, bArr2, bytes, bytes2);
                            if (bArr3 != null) {
                                int length = bytes.length;
                                str2 = TextUtils.join(".", new String[]{encodeToString, encodeToString2, encodeToString3, Base64.encodeToString(Arrays.copyOfRange(bArr3, 0, length), 11), Base64.encodeToString(Arrays.copyOfRange(bArr3, length, bArr3.length), 11)});
                            }
                        } else {
                            throw null;
                        }
                    } catch (Exception e3) {
                        StringBuilder A0P = C000200d.A0P("PAY: JweCompactSerializer/encryptCek");
                        A0P.append(e3.toString());
                        Log.w(A0P.toString());
                        throw new RuntimeException(e3);
                    }
                } catch (JSONException e4) {
                    Log.w("PAY: BrazilTokenizationHelper/generateStepUpJweToken failed: ", e4);
                }
            }
            return A04(obj, str2);
        } catch (JSONException e5) {
            Log.w("PAY: generateJwsTokenForCode failed: ", e5);
            return null;
        }
    }

    public final String A04(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            String join = TextUtils.join(".", new String[]{Base64.encodeToString(str.getBytes("UTF-8"), 11), Base64.encodeToString(str2.getBytes("UTF-8"), 11)});
            String A02 = A02();
            if (!TextUtils.isEmpty(A02)) {
                JniBridge jniBridge = this.A03;
                byte[] bytes = join.getBytes();
                byte[] bytes2 = A02.getBytes();
                if (jniBridge != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(join);
                    sb.append(".");
                    sb.append(Base64.encodeToString((byte[]) JniBridge.jvidispatchOOO(4, bytes, bytes2), 11));
                    return sb.toString();
                }
                throw null;
            }
        } catch (UnsupportedEncodingException e) {
            Log.w("PAY: generateJwsToken threw UnsupportedEncoding Exception: ", e);
        }
        return null;
    }

    public final String A05(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", "PS256");
        jSONObject.put("typ", "JOSE");
        jSONObject.put("kid", str);
        if (z) {
            jSONObject.put("iat", this.A00.A05() / 1000);
        }
        return jSONObject.toString();
    }
}
