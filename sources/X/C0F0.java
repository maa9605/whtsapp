package X;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0F0 */
/* loaded from: classes.dex */
public class C0F0 {
    public static volatile C0F0 A01;
    public final C00E A00;

    public C0F0(C00E c00e) {
        this.A00 = c00e;
    }

    public static C0F0 A00() {
        if (A01 == null) {
            synchronized (C0F0.class) {
                if (A01 == null) {
                    A01 = new C0F0(C00E.A00());
                }
            }
        }
        return A01;
    }

    public static byte[] A01(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            Cipher cipher2 = (Cipher) C27401Nf.A00(cipher, "AES/CBC/PKCS5Padding", cipher.getProvider().getName());
            cipher2.init(i, secretKeySpec, ivParameterSpec);
            return cipher2.doFinal(bArr2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new SecurityException(e);
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2) {
        byte[] A0G = C02A.A0G(bArr, bArr2);
        C000700j.A06(A0G.length >= 20);
        return AnonymousClass029.A1g(A0G, 20);
    }

    public String A03(C07F c07f, String str) {
        if (c07f.A03) {
            byte[] decode = Base64.decode(str, 11);
            try {
                byte[][] A1l = AnonymousClass029.A1l(decode, 20, 16, (decode.length - 20) - 16);
                byte[] bArr = A1l[0];
                byte[] bArr2 = A1l[1];
                byte[] bArr3 = A1l[2];
                byte[] A05 = A05(c07f);
                if (Arrays.equals(bArr, A02(A05, AnonymousClass029.A1h(bArr2, bArr3)))) {
                    return new String(A01(2, bArr2, bArr3, A05));
                }
                throw new SecurityException("Data mac corrupt");
            } catch (ParseException e) {
                throw new SecurityException(e);
            }
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public String A04(C07F c07f, String str) {
        if (c07f.A03) {
            byte[] A05 = A05(c07f);
            byte[] A02 = A02(A05, str.getBytes());
            C000700j.A06(A02.length >= 16);
            byte[] A1g = AnonymousClass029.A1g(A02, 16);
            byte[] A1h = AnonymousClass029.A1h(A1g, A01(1, A1g, str.getBytes(), A05));
            return Base64.encodeToString(AnonymousClass029.A1h(A02(A05, A1h), A1h), 11);
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public final synchronized byte[] A05(C07F c07f) {
        String string;
        C00E c00e = this.A00;
        String str = c07f.A01;
        string = c00e.A02().getString(C00E.A01(str, "auth/encryption_key"), null);
        if (string == null) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                KeyGenerator keyGenerator2 = (KeyGenerator) C27401Nf.A00(keyGenerator, "AES", keyGenerator.getProvider().getName());
                SecureRandom A012 = C27401Nf.A01();
                byte[] encoded = keyGenerator2.generateKey().getEncoded();
                keyGenerator2.init(256, A012);
                string = Base64.encodeToString(encoded, 11);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                string = null;
            }
            c00e.A02().edit().putString(C00E.A01(str, "auth/encryption_key"), string).apply();
        }
        return Base64.decode(string, 11);
    }
}
