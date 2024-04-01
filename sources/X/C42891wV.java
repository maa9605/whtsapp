package X;

import com.whatsapp.util.Log;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1wV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42891wV {
    public final C42851wQ A00;
    public final SecureRandom A01 = new SecureRandom();

    public C42891wV(C42851wQ c42851wQ) {
        this.A00 = c42851wQ;
    }

    public static byte[] A00(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length + length2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    public static byte[] A01(byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return mac.doFinal(bArr2);
        } catch (Exception e) {
            Log.e("qr hmac fail ", e);
            return null;
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 != null) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
                return cipher.doFinal(bArr3);
            } catch (Exception e) {
                Log.e("qr aes fail ", e);
                return null;
            }
        }
        return null;
    }
}
