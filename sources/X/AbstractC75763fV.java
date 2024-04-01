package X;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3fV */
/* loaded from: classes2.dex */
public abstract class AbstractC75763fV {
    public static AbstractC75763fV A00(int i) {
        if (i != 2) {
            if (i == 3) {
                return new C85523vl();
            }
            throw new AssertionError(C000200d.A0D("Unknown version: ", i));
        }
        return new AbstractC75763fV() { // from class: X.3vk
        };
    }

    public byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            byte[] doFinal = mac.doFinal(bArr);
            try {
                int ceil = (int) Math.ceil(i / 32.0d);
                byte[] bArr4 = new byte[0];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i2 = !(this instanceof C85523vl) ? 0 : 1;
                int i3 = i2;
                while (i2 < i3 + ceil) {
                    Mac mac2 = Mac.getInstance("HmacSHA256");
                    mac2.init(new SecretKeySpec(doFinal, "HmacSHA256"));
                    mac2.update(bArr4);
                    if (bArr3 != null) {
                        mac2.update(bArr3);
                    }
                    mac2.update((byte) i2);
                    bArr4 = mac2.doFinal();
                    int min = Math.min(i, bArr4.length);
                    byteArrayOutputStream.write(bArr4, 0, min);
                    i -= min;
                    i2++;
                }
                return byteArrayOutputStream.toByteArray();
            } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
