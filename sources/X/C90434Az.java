package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.4Az */
/* loaded from: classes3.dex */
public class C90434Az {
    public static C90434Az A03;
    public KeyStore A00;
    public final C014406v A01 = C014406v.A00("CLKeyStorageManager", "onboarding", "IN");
    public final C90424Ay A02;

    public C90434Az(Context context, C02O c02o) {
        this.A02 = new C90424Ay(c02o);
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                this.A01.A07(null, "initializing KS", null);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = keyStore;
                keyStore.load(null);
                A03(context);
            } catch (Exception e) {
                this.A01.A06("onboarding", null, e);
                throw new RuntimeException(e);
            }
        }
    }

    public static C90434Az A00(Context context) {
        if (A03 == null) {
            synchronized (C90434Az.class) {
                if (A03 == null) {
                    A03 = new C90434Az(context, C02O.A00());
                }
            }
        }
        return A03;
    }

    public final String A01(String str, String str2, String str3) {
        try {
            this.A01.A07("onboarding", "decrypt the key", new C03630Gl[]{new C03630Gl("alias", str)});
            byte[] A08 = A08(Base64.decode(this.A02.A00.getString(str2, ""), 0), str);
            byte[] decode = Base64.decode(str3, 0);
            byte[] bArr = new byte[16];
            System.arraycopy(decode, 0, bArr, 0, 16);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            int length = decode.length - 16;
            byte[] bArr2 = new byte[length];
            System.arraycopy(decode, 16, bArr2, 0, length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A08, "AES");
            int i = Build.VERSION.SDK_INT;
            if (i >= 18) {
                Cipher cipher = Cipher.getInstance(i >= 23 ? "AES/GCM/NoPadding" : "AES/CBC/PKCS7Padding");
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return C02180Ae.A0p(cipher.doFinal(bArr2));
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            StringBuilder A0P = C000200d.A0P("PAY");
            A0P.append(e.toString());
            Log.w(A0P.toString());
            throw new RuntimeException(e);
        }
    }

    public final String A02(String str, String str2, String str3) {
        try {
            this.A01.A07("onboarding", " encrypt the key ", new C03630Gl[]{new C03630Gl("alias", str)});
            byte[] A08 = A08(Base64.decode(this.A02.A00.getString(str2, ""), 0), str);
            int i = Build.VERSION.SDK_INT;
            if (i >= 18) {
                Cipher cipher = Cipher.getInstance(i >= 23 ? "AES/GCM/NoPadding" : "AES/CBC/PKCS7Padding");
                SecretKeySpec secretKeySpec = new SecretKeySpec(A08, "AES");
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
                byte[] doFinal = cipher.doFinal(C02180Ae.A1d(str3));
                int length = doFinal.length;
                byte[] bArr2 = new byte[length + 16];
                System.arraycopy(bArr, 0, bArr2, 0, 16);
                System.arraycopy(doFinal, 0, bArr2, 16, length);
                return Base64.encodeToString(bArr2, 0);
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            this.A01.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }

    public final synchronized void A03(Context context) {
        SharedPreferences sharedPreferences = this.A02.A00;
        if (sharedPreferences.getBoolean("use_ks", false)) {
            return;
        }
        try {
            this.A00.load(null);
            A04(context, "k0");
            A04(context, "token");
            A05("aes_k0", "k0");
            A05("aes_token", "token");
            sharedPreferences.edit().putBoolean("use_ks", true).apply();
        } catch (Exception e) {
            C014406v c014406v = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append(" Skip Android KeyStore setup because: ");
            sb.append(e.toString());
            c014406v.A06("onboarding", sb.toString(), e);
        }
    }

    public final void A04(Context context, String str) {
        try {
            this.A01.A07("onboarding", "generate rsa key pairs for", new C03630Gl[]{new C03630Gl("alias", str)});
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(2, 1);
            KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(str);
            StringBuilder sb = new StringBuilder();
            sb.append("CN=");
            sb.append(str);
            KeyPairGeneratorSpec build = alias.setSubject(new X500Principal(sb.toString())).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            this.A01.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }

    public final void A05(String str, String str2) {
        C014406v c014406v = this.A01;
        c014406v.A07("onboarding", "generate and store aes key", new C03630Gl[]{new C03630Gl("alias", str2)});
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str2, null);
            int i = Build.VERSION.SDK_INT;
            if (i >= 18) {
                Cipher cipher = Cipher.getInstance(i >= 23 ? "RSA/ECB/OAEPPadding" : "RSA/ECB/PKCS1Padding");
                cipher.init(1, privateKeyEntry.getCertificate().getPublicKey());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
                cipherOutputStream.write(bArr);
                cipherOutputStream.close();
                this.A02.A00.edit().putString(str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)).apply();
                return;
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            c014406v.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }

    public synchronized void A06(String str, String str2) {
        if (A07()) {
            try {
                String A02 = A02("k0", "aes_k0", str);
                str2 = A02("token", "aes_token", str2);
                str = A02;
            } catch (Exception e) {
                this.A02.A00.edit().putBoolean("use_ks", false).apply();
                C014406v c014406v = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append(" Skip using Android KeyStore ");
                sb.append(e.toString());
                c014406v.A06("onboarding", sb.toString(), e);
            }
        }
        SharedPreferences sharedPreferences = this.A02.A00;
        sharedPreferences.edit().putString("k0", str).apply();
        sharedPreferences.edit().putString("token", str2).apply();
    }

    public final boolean A07() {
        return this.A00 != null && this.A02.A00.getBoolean("use_ks", false);
    }

    public final byte[] A08(byte[] bArr, String str) {
        try {
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) this.A00.getEntry(str, null);
            int i = Build.VERSION.SDK_INT;
            if (i >= 18) {
                Cipher cipher = Cipher.getInstance(i >= 23 ? "RSA/ECB/OAEPPadding" : "RSA/ECB/PKCS1Padding");
                cipher.init(2, privateKeyEntry.getPrivateKey());
                CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArr), cipher);
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
                for (int i2 = 0; i2 < size; i2++) {
                    bArr2[i2] = ((Byte) arrayList.get(i2)).byteValue();
                }
                return bArr2;
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            this.A01.A06("onboarding", null, e);
            throw new RuntimeException(e);
        }
    }
}
