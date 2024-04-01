package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3eo  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75383eo extends KeyGeneratorSpi {
    public int A00;
    public String A01;
    public C75313eh A02;
    public boolean A03 = true;

    public C75383eo(String str, int i, C75313eh c75313eh) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = c75313eh;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        if (this.A03) {
            C75313eh c75313eh = this.A02;
            SecureRandom secureRandom = new SecureRandom();
            int i = this.A00;
            c75313eh.A01 = secureRandom;
            c75313eh.A00 = (i + 7) >> 3;
            this.A03 = false;
        }
        C75313eh c75313eh2 = this.A02;
        byte[] bArr = new byte[c75313eh2.A00];
        c75313eh2.A01.nextBytes(bArr);
        return new SecretKeySpec(bArr, this.A01);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        if (secureRandom == null) {
            try {
                secureRandom = new SecureRandom();
            } catch (IllegalArgumentException e) {
                throw new InvalidParameterException(e.getMessage());
            }
        }
        C75313eh c75313eh = this.A02;
        c75313eh.A01 = secureRandom;
        c75313eh.A00 = (i + 7) / 8;
        this.A03 = false;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            C75313eh c75313eh = this.A02;
            int i = this.A00;
            c75313eh.A01 = secureRandom;
            c75313eh.A00 = (i + 7) >> 3;
            this.A03 = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
