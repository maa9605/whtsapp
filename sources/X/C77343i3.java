package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3i3 */
/* loaded from: classes2.dex */
public class C77343i3 implements InterfaceC69183Nl {
    public final InterfaceC69183Nl A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public C77343i3(String str, String str2, String str3, String str4, byte[] bArr, Long l) {
        this.A05 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = bArr;
        this.A01 = l;
        switch (str3.hashCode()) {
            case 100229:
                if (str3.equals("ecc")) {
                    this.A00 = new InterfaceC69183Nl(bArr) { // from class: X.3i1
                        public final C02920Dk A00;

                        {
                            this.A00 = new C02920Dk(bArr);
                        }

                        @Override // X.InterfaceC69183Nl
                        public byte[] A7c(byte[] bArr2, byte[] bArr3) {
                            if (bArr3 == null) {
                                bArr3 = C02A.A0C(16);
                            }
                            C0b9 A00 = C0b9.A00();
                            byte[] bArr4 = A00.A02.A01;
                            byte[][] A1k = AnonymousClass029.A1k(C002701i.A1Z(C02180Ae.A1f(this.A00, A00.A01), bArr4, null, 64));
                            byte[] bArr5 = A1k[0];
                            byte[] bArr6 = A1k[1];
                            try {
                                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr5, "AES");
                                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                                byte[] doFinal = cipher.doFinal(bArr2);
                                try {
                                    Mac mac = Mac.getInstance("HmacSHA256");
                                    mac.init(new SecretKeySpec(bArr6, "HmacSHA256"));
                                    mac.update(bArr3);
                                    byte[] A1h = AnonymousClass029.A1h(bArr3, bArr4, mac.doFinal(doFinal), doFinal);
                                    A00.destroy();
                                    return A1h;
                                } catch (InvalidKeyException | NoSuchAlgorithmException e) {
                                    throw new AssertionError(e);
                                }
                            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                                throw new AssertionError(e2);
                            }
                        }
                    };
                    return;
                }
                break;
            case 113216:
                if (str3.equals("rsa")) {
                    this.A00 = new InterfaceC69183Nl(bArr) { // from class: X.3i4
                        public final byte[] A00;

                        {
                            this.A00 = bArr;
                        }

                        @Override // X.InterfaceC69183Nl
                        public byte[] A7c(byte[] bArr2, byte[] bArr3) {
                            byte[] bArr4 = this.A00;
                            int length = bArr4.length;
                            int length2 = bArr2.length;
                            if (length >= length2) {
                                try {
                                    PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr4));
                                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                                    cipher.init(1, generatePublic);
                                    return cipher.doFinal(bArr2);
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            StringBuilder A0P = C000200d.A0P("PAY: RsaKey encrypt: payload length is ");
                            A0P.append(length2);
                            A0P.append(" bytes while key can encrypt at most ");
                            A0P.append(length);
                            A0P.append(" bytes");
                            throw new AssertionError(C014406v.A01("RsaKey", A0P.toString()));
                        }
                    };
                    return;
                }
                break;
            case 3387192:
                if (str3.equals("none")) {
                    this.A00 = new InterfaceC69183Nl() { // from class: X.3i2
                        @Override // X.InterfaceC69183Nl
                        public byte[] A7c(byte[] bArr2, byte[] bArr3) {
                            return bArr2;
                        }
                    };
                    return;
                }
                break;
            case 110541305:
                if (str3.equals("token")) {
                    this.A00 = new InterfaceC69183Nl() { // from class: X.3i5
                        @Override // X.InterfaceC69183Nl
                        public byte[] A7c(byte[] bArr2, byte[] bArr3) {
                            return bArr2;
                        }
                    };
                    return;
                }
                break;
        }
        StringBuilder sb = new StringBuilder("PaymentProviderKey invalid key type: ");
        sb.append(str3);
        throw new AssertionError(C014406v.A01("PaymentProviderKey", sb.toString()));
    }

    @Override // X.InterfaceC69183Nl
    public byte[] A7c(byte[] bArr, byte[] bArr2) {
        return this.A00.A7c(bArr, bArr2);
    }
}
