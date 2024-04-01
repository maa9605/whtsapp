package X;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.2i0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54052i0 extends SecretKeyFactorySpi {
    public String A00;

    public C54052i0(String str) {
        this.A00 = str;
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) {
        if (cls != null) {
            if (secretKey != null) {
                if (SecretKeySpec.class.isAssignableFrom(cls)) {
                    return new SecretKeySpec(secretKey.getEncoded(), this.A00);
                }
                try {
                    return (KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
                } catch (Exception e) {
                    throw new InvalidKeySpecException(e.toString());
                }
            }
            throw new InvalidKeySpecException("key parameter is null");
        }
        throw new InvalidKeySpecException("keySpec parameter is null");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineTranslateKey(SecretKey secretKey) {
        if (secretKey != null) {
            String algorithm = secretKey.getAlgorithm();
            String str = this.A00;
            if (algorithm.equalsIgnoreCase(str)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.A00);
            }
            throw new InvalidKeyException(C000200d.A0L(C000200d.A0P("Key not of type "), str, "."));
        }
        throw new InvalidKeyException("key parameter is null");
    }
}
