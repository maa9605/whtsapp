package X;

import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.4AX  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4AX {
    public static volatile C4AX A05;
    public KeyStore A00;
    public boolean A01;
    public final C001200o A02;
    public final C0EU A03;
    public final C014406v A04 = C014406v.A00("PaymentTrustedDeviceManager", "infra", "COMMON");

    public C4AX(C001200o c001200o, C0EU c0eu) {
        this.A02 = c001200o;
        this.A03 = c0eu;
    }

    public PrivateKey A00() {
        byte[] bArr;
        A02();
        C0EU c0eu = this.A03;
        String string = c0eu.A04().getString("payment_trusted_device_credential", null);
        if (!TextUtils.isEmpty(string)) {
            bArr = Base64.decode(string, 3);
        } else {
            bArr = null;
        }
        if (bArr == null) {
            A02();
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
                keyPairGenerator.initialize(2048);
                PrivateKey privateKey = keyPairGenerator.genKeyPair().getPrivate();
                if (Build.VERSION.SDK_INT >= 18) {
                    byte[] A04 = A04(privateKey.getEncoded());
                    if (A04 != null) {
                        C000200d.A0k(c0eu, "payment_trusted_device_credential", Base64.encodeToString(A04, 3));
                        if (!c0eu.A04().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                            c0eu.A04().edit().putBoolean("payment_trusted_device_credential_use_keystore", true).apply();
                        }
                        Arrays.fill(A04, (byte) 0);
                        return privateKey;
                    }
                    return null;
                }
                C000200d.A0k(c0eu, "payment_trusted_device_credential", Base64.encodeToString(privateKey.getEncoded(), 3));
                return privateKey;
            } catch (NoSuchAlgorithmException e) {
                C014406v c014406v = this.A04;
                StringBuilder A0P = C000200d.A0P("generate RSA key fails: ");
                A0P.append(e.toString());
                c014406v.A04(A0P.toString());
                return null;
            }
        }
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                if (!c0eu.A04().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                    byte[] A042 = A04(bArr);
                    if (A042 != null) {
                        C000200d.A0k(c0eu, "payment_trusted_device_credential", Base64.encodeToString(A042, 3));
                        c0eu.A04().edit().putBoolean("payment_trusted_device_credential_use_keystore", true).apply();
                        Arrays.fill(A042, (byte) 0);
                    }
                } else {
                    try {
                        String string2 = c0eu.A04().getString("payment_trusted_device_credential_encrypted_aes", null);
                        byte[] decode = TextUtils.isEmpty(string2) ? null : Base64.decode(string2, 3);
                        if (decode == null) {
                            decode = A03();
                        }
                        if (decode == null) {
                            bArr = null;
                        } else {
                            byte[] A052 = A05(decode);
                            if (A052 == null) {
                                bArr = null;
                            } else {
                                byte[] bArr2 = new byte[16];
                                System.arraycopy(bArr, 0, bArr2, 0, 16);
                                int length = bArr.length - 16;
                                byte[] bArr3 = new byte[length];
                                System.arraycopy(bArr, 16, bArr3, 0, length);
                                SecretKeySpec secretKeySpec = new SecretKeySpec(A052, "AES");
                                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
                                bArr = cipher.doFinal(bArr3);
                            }
                        }
                    } catch (Exception e2) {
                        C014406v c014406v2 = this.A04;
                        StringBuilder A0P2 = C000200d.A0P("decrypt key fails: ");
                        A0P2.append(e2.toString());
                        c014406v2.A04(A0P2.toString());
                        bArr = null;
                    }
                }
            }
            if (bArr == null) {
                return null;
            }
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Arrays.fill(bArr, (byte) 0);
            return keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        } catch (Exception e3) {
            C014406v c014406v3 = this.A04;
            StringBuilder A0P3 = C000200d.A0P("loadRSAKey fails, ");
            A0P3.append(e3.toString());
            c014406v3.A04(A0P3.toString());
            return null;
        }
    }

    public final void A01() {
        if (this.A03.A04().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
            return;
        }
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 50);
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(this.A02.A00).setAlias("payment_trusted_device_key_alias").setSubject(new X500Principal("CN=payment_trusted_device_key_alias")).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            C014406v c014406v = this.A04;
            StringBuilder A0P = C000200d.A0P("generate RSA key pairs fails: ");
            A0P.append(e.toString());
            c014406v.A04(A0P.toString());
        }
        A03();
    }

    public final synchronized void A02() {
        if (this.A01) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = keyStore;
                keyStore.load(null);
                if (!this.A03.A04().getBoolean("payment_trusted_device_credential_use_keystore", false)) {
                    A01();
                }
                this.A01 = true;
            } catch (Exception e) {
                C014406v c014406v = this.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("keystore init fails: ");
                sb.append(e.toString());
                c014406v.A04(sb.toString());
            }
        } else {
            this.A01 = true;
        }
    }

    public final byte[] A03() {
        byte[] bArr;
        byte[] bArr2 = new byte[16];
        new SecureRandom().nextBytes(bArr2);
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", null)).getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
            cipherOutputStream.write(bArr2);
            cipherOutputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            C014406v c014406v = this.A04;
            StringBuilder A0P = C000200d.A0P("RSA encrypt fails: ");
            A0P.append(e.toString());
            c014406v.A04(A0P.toString());
            bArr = null;
        }
        if (bArr != null) {
            C0EU c0eu = this.A03;
            if (c0eu != null) {
                C000200d.A0k(c0eu, "payment_trusted_device_credential_encrypted_aes", Base64.encodeToString(bArr, 3));
            } else {
                throw null;
            }
        }
        Arrays.fill(bArr2, (byte) 0);
        return bArr;
    }

    public final byte[] A04(byte[] bArr) {
        byte[] A052;
        try {
            String string = this.A03.A04().getString("payment_trusted_device_credential_encrypted_aes", null);
            byte[] decode = TextUtils.isEmpty(string) ? null : Base64.decode(string, 3);
            if (decode == null) {
                decode = A03();
            }
            if (decode == null || (A052 = A05(decode)) == null) {
                return null;
            }
            byte[] bArr2 = new byte[16];
            new SecureRandom().nextBytes(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A052, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            byte[] doFinal = cipher.doFinal(bArr);
            int length = doFinal.length;
            byte[] bArr3 = new byte[length + 16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            System.arraycopy(doFinal, 0, bArr3, 16, length);
            return bArr3;
        } catch (Exception e) {
            C014406v c014406v = this.A04;
            StringBuilder A0P = C000200d.A0P("encrypt key fails: ");
            A0P.append(e.toString());
            c014406v.A04(A0P.toString());
            return null;
        }
    }

    public final byte[] A05(byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", null)).getPrivateKey());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            CipherInputStream cipherInputStream = new CipherInputStream(byteArrayInputStream, cipher);
            try {
                ArrayList arrayList = new ArrayList();
                while (true) {
                    int read = cipherInputStream.read();
                    if (read == -1) {
                        break;
                    }
                    arrayList.add(Byte.valueOf((byte) read));
                }
                int size = arrayList.size();
                byte[] bArr2 = new byte[size];
                for (int i = 0; i < size; i++) {
                    bArr2[i] = ((Byte) arrayList.get(i)).byteValue();
                }
                cipherInputStream.close();
                byteArrayInputStream.close();
                return bArr2;
            } finally {
            }
        } catch (Exception e) {
            C014406v c014406v = this.A04;
            StringBuilder A0P = C000200d.A0P("RSA decrypt fails: ");
            A0P.append(e.toString());
            c014406v.A04(A0P.toString());
            return null;
        }
    }
}
