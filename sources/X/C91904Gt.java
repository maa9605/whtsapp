package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Gt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C91904Gt extends C4CQ {
    public String A00;
    public final C48Y A01;
    public final JniBridge A02;
    public final JSONObject A03;
    public final JSONObject A04;
    public final byte[] A05;

    public C91904Gt(JniBridge jniBridge, C48Y c48y, JSONObject jSONObject, JSONObject jSONObject2) {
        C000700j.A06(jSONObject2.length() > 0);
        this.A02 = jniBridge;
        this.A01 = c48y;
        this.A04 = jSONObject;
        this.A03 = jSONObject2;
        this.A05 = C02A.A0C(12);
    }

    @Override // X.C4CQ
    public C4CQ A00(PublicKey... publicKeyArr) {
        C000700j.A06(this.A00 == null);
        super.A00(publicKeyArr);
        try {
            String A0K = C40841sx.A0K(this.A04.toString());
            byte[] bArr = this.A05;
            String encodeToString = Base64.encodeToString(bArr, 11);
            this.A01.A00();
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            JSONObject jSONObject = new JSONObject();
            JSONObject put = jSONObject.put("alg", "ECDH-ES").put("enc", "A256GCM");
            List list = super.A00;
            if (list != null) {
                Collections.sort(list);
                put.put("apu", C40841sx.A0K(TextUtils.join(";", list))).put("apv", C40841sx.A0K(C40841sx.A0T(null))).put("epk", new JSONObject().put("kty", "EC").put("crv", "P-256").put("der", Base64.encodeToString(publicKey.getEncoded(), 2)));
                String A0K2 = C40841sx.A0K(jSONObject.toString());
                byte[] bytes = TextUtils.join(".", new String[]{A0K2, A0K}).getBytes();
                PrivateKey privateKey = generateKeyPair.getPrivate();
                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(null, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                List list2 = super.A00;
                if (list2 != null) {
                    Collections.sort(list2);
                    byte[] bytes2 = TextUtils.join(";", list2).getBytes();
                    byte[] bytes3 = C40841sx.A0T(null).getBytes();
                    byte[] A1c = AnonymousClass029.A1c(1);
                    byte[] bytes4 = "A256GCM".getBytes("UTF-8");
                    byte[] A1c2 = AnonymousClass029.A1c(256);
                    int length = generateSecret.length;
                    int i = length + 4;
                    int i2 = i + 4;
                    int length2 = bytes4.length;
                    int i3 = i2 + length2;
                    int i4 = i3 + 4;
                    int length3 = bytes2.length;
                    int i5 = i4 + length3;
                    int i6 = i5 + 4;
                    int length4 = bytes3.length;
                    int i7 = i6 + length4;
                    int i8 = i7 + 4;
                    byte[] bArr2 = new byte[i8];
                    System.arraycopy(A1c, 0, bArr2, 0, 4);
                    System.arraycopy(generateSecret, 0, bArr2, 4, length);
                    System.arraycopy(AnonymousClass029.A1c(length2), 0, bArr2, i, 4);
                    System.arraycopy(bytes4, 0, bArr2, i2, length2);
                    System.arraycopy(AnonymousClass029.A1c(length3), 0, bArr2, i3, 4);
                    System.arraycopy(bytes2, 0, bArr2, i4, length3);
                    System.arraycopy(AnonymousClass029.A1c(length4), 0, bArr2, i5, 4);
                    System.arraycopy(bytes3, 0, bArr2, i6, length4);
                    System.arraycopy(A1c2, 0, bArr2, i7, 4);
                    C000700j.A09(i8 == i8, "length doesn't match");
                    byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr2);
                    byte[] bytes5 = this.A03.toString().getBytes();
                    if (this.A02 != null) {
                        byte[] bArr3 = (byte[]) JniBridge.jvidispatchOIOOOO(4, 16, digest, bArr, bytes5, bytes);
                        if (bArr3 == null) {
                            throw new C897348f(new IllegalStateException("cipher failed"));
                        }
                        int length5 = bArr3.length;
                        int i9 = length5 - 16;
                        C0FK c0fk = new C0FK(Arrays.copyOfRange(bArr3, 0, i9), Arrays.copyOfRange(bArr3, i9, length5));
                        Object obj = c0fk.A00;
                        if (obj != null) {
                            String encodeToString2 = Base64.encodeToString((byte[]) obj, 11);
                            Object obj2 = c0fk.A01;
                            if (obj2 != null) {
                                this.A00 = TextUtils.join(".", new String[]{A0K, A0K2, "", encodeToString, encodeToString2, Base64.encodeToString((byte[]) obj2, 11)});
                                return this;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | JSONException e) {
            Log.w("PAY: EncryptedTrustTokenBuilder/declareSigningKeys", e);
            throw new C897348f(e);
        }
    }
}
