package org.spongycastle.jcajce.provider.symmetric;

import X.C000200d;
import X.C01Z;
import X.C07I;
import X.C75313eh;
import X.C75383eo;
import X.C85453vd;
import X.C85463ve;
import X.C85473vf;
import X.InterfaceC002101a;
import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes2.dex */
public final class AES {

    /* loaded from: classes2.dex */
    public class AlgParams extends C85463ve {
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "AES IV";
        }
    }

    /* loaded from: classes2.dex */
    public class Mappings extends C07I {
        public static final String A00 = AES.class.getName();

        @Override // X.C07I
        public void A00(InterfaceC002101a interfaceC002101a) {
            StringBuilder sb = new StringBuilder();
            String str = A00;
            C01Z c01z = (C01Z) interfaceC002101a;
            c01z.A00("AlgorithmParameters.AES", C000200d.A0L(sb, str, "$AlgParams"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$AlgParamGen");
            c01z.A00("AlgorithmParameterGenerator.AES", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ECB");
            c01z.A00("Cipher.AES", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGen");
            c01z.A00("KeyGenerator.AES", sb4.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class AlgParamGen extends AlgorithmParameterGeneratorSpi {
        public SecureRandom A00;
        public final C85473vf A01 = new C85473vf();

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("AES", this.A01.A00);
                algorithmParameters.init(new IvParameterSpec(bArr));
                return algorithmParameters;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
            this.A00 = secureRandom;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* loaded from: classes2.dex */
    public class KeyGen extends C75383eo {
        public KeyGen() {
            super("AES", 192, new C75313eh());
        }
    }

    /* loaded from: classes2.dex */
    public class ECB extends C85453vd {
        public ECB() {
            new Object() { // from class: org.spongycastle.jcajce.provider.symmetric.AES.ECB.1
            };
        }
    }
}
