package org.spongycastle.jcajce.provider.digest;

import X.AbstractC40041rL;
import X.C000200d;
import X.C01Z;
import X.C02180Ae;
import X.C2iS;
import X.C41001tD;
import X.C41011tE;
import X.C49132Iq;
import X.C54052i0;
import X.C54062i1;
import X.C54082i3;
import X.C54092i4;
import X.C75313eh;
import X.C75383eo;
import X.InterfaceC002101a;
import X.InterfaceC54072i2;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes2.dex */
public class SHA1 {

    /* loaded from: classes2.dex */
    public class Mappings extends AbstractC40041rL {
        public static final String A00 = SHA1.class.getName();

        @Override // X.C07I
        public void A00(InterfaceC002101a interfaceC002101a) {
            StringBuilder sb = new StringBuilder();
            String str = A00;
            C01Z c01z = (C01Z) interfaceC002101a;
            c01z.A00("MessageDigest.SHA-1", C000200d.A0L(sb, str, "$Digest"));
            c01z.A00("Alg.Alias.MessageDigest.SHA1", "SHA-1");
            c01z.A00("Alg.Alias.MessageDigest.SHA", "SHA-1");
            AbstractC40041rL.A00(c01z, "SHA1", C000200d.A0L(new StringBuilder(), str, "$HashMac"), C000200d.A0L(new StringBuilder(), str, "$KeyGenerator"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$SHA1Mac");
            c01z.A00("Mac.PBEWITHHMACSHA", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$SHA1Mac");
            c01z.A00("Mac.PBEWITHHMACSHA1", sb3.toString());
            c01z.A00("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("$PBKDF2WithHmacSHA1UTF8");
            c01z.A00("SecretKeyFactory.PBKDF2WithHmacSHA1", sb4.toString());
            c01z.A00("Alg.Alias.SecretKeyFactory.PBKDF2WithHmacSHA1AndUTF8", "PBKDF2WithHmacSHA1");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("$PBKDF2WithHmacSHA18BIT");
            c01z.A00("SecretKeyFactory.PBKDF2WithHmacSHA1And8BIT", sb5.toString());
            c01z.A00("Alg.Alias.SecretKeyFactory.PBKDF2withASCII", "PBKDF2WithHmacSHA1And8BIT");
            c01z.A00("Alg.Alias.SecretKeyFactory.PBKDF2with8BIT", "PBKDF2WithHmacSHA1And8BIT");
        }
    }

    /* loaded from: classes2.dex */
    public class Digest extends C49132Iq implements Cloneable {
        public Digest() {
            super(new C41011tE());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            C49132Iq c49132Iq = (C49132Iq) super.clone();
            c49132Iq.A00 = new C41011tE((C41011tE) this.A00);
            return c49132Iq;
        }
    }

    /* loaded from: classes2.dex */
    public class PBKDF2WithHmacSHA18BIT extends BasePBKDF2WithHmacSHA1 {
        public PBKDF2WithHmacSHA18BIT() {
            super("PBKDF2WithHmacSHA1And8bit", 1);
        }
    }

    /* loaded from: classes2.dex */
    public class BasePBKDF2WithHmacSHA1 extends C54052i0 {
        public int A00;

        public BasePBKDF2WithHmacSHA1(String str, int i) {
            super(str);
            this.A00 = i;
        }

        @Override // javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            byte[] bArr;
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() != null) {
                    if (pBEKeySpec.getIterationCount() > 0) {
                        if (pBEKeySpec.getKeyLength() > 0) {
                            if (pBEKeySpec.getPassword().length != 0) {
                                int keyLength = pBEKeySpec.getKeyLength();
                                int i = this.A00;
                                C41001tD A0t = C02180Ae.A0t(i, 1);
                                if (i == 5) {
                                    char[] password = pBEKeySpec.getPassword();
                                    if (password != null) {
                                        bArr = C54062i1.A01(password);
                                    } else {
                                        bArr = new byte[0];
                                    }
                                } else {
                                    char[] password2 = pBEKeySpec.getPassword();
                                    if (password2 != null) {
                                        int length = password2.length;
                                        bArr = new byte[length];
                                        for (int i2 = 0; i2 != length; i2++) {
                                            bArr[i2] = (byte) password2[i2];
                                        }
                                    } else {
                                        bArr = new byte[0];
                                    }
                                }
                                byte[] salt = pBEKeySpec.getSalt();
                                int iterationCount = pBEKeySpec.getIterationCount();
                                A0t.A02 = bArr;
                                A0t.A03 = salt;
                                A0t.A00 = iterationCount;
                                InterfaceC54072i2 A00 = A0t.A00(keyLength);
                                for (int i3 = 0; i3 != bArr.length; i3++) {
                                    bArr[i3] = 0;
                                }
                                return new C54082i3(super.A00, this.A00, keyLength, pBEKeySpec, A00);
                            }
                            throw new IllegalArgumentException("password empty");
                        }
                        StringBuilder A0P = C000200d.A0P("positive key length required: ");
                        A0P.append(pBEKeySpec.getKeyLength());
                        throw new InvalidKeySpecException(A0P.toString());
                    }
                    StringBuilder A0P2 = C000200d.A0P("positive iteration count required: ");
                    A0P2.append(pBEKeySpec.getIterationCount());
                    throw new InvalidKeySpecException(A0P2.toString());
                }
                throw new InvalidKeySpecException("missing required salt");
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* loaded from: classes2.dex */
    public class HashMac extends C2iS {
        public HashMac() {
            super(new C54092i4(new C41011tE()));
        }
    }

    /* loaded from: classes2.dex */
    public class KeyGenerator extends C75383eo {
        public KeyGenerator() {
            super("HMACSHA1", 160, new C75313eh());
        }
    }

    /* loaded from: classes2.dex */
    public class SHA1Mac extends C2iS {
        public SHA1Mac() {
            super(new C54092i4(new C41011tE()));
        }
    }

    /* loaded from: classes2.dex */
    public class PBKDF2WithHmacSHA1UTF8 extends BasePBKDF2WithHmacSHA1 {
        public PBKDF2WithHmacSHA1UTF8() {
            super("PBKDF2WithHmacSHA1", 5);
        }
    }
}
