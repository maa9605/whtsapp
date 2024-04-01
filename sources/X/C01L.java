package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.01L */
/* loaded from: classes.dex */
public class C01L {
    public static volatile C01L A0A;
    public C05090Ng A00;
    public AnonymousClass054 A01;
    public C02920Dk A02;
    public boolean A03;
    public final AbstractC000600i A04;
    public final C01B A05;
    public final AnonymousClass054 A06 = new AnonymousClass054() { // from class: X.053
        public static final byte[] A00(String str, byte[] bArr) {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            char[] cArr = new char[length];
            for (int i = 0; i < length; i++) {
                cArr[i] = (char) bytes[i];
            }
            return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1And8BIT").generateSecret(new PBEKeySpec(cArr, bArr, 16, 128)).getEncoded(), "AES").getEncoded();
        }

        @Override // X.AnonymousClass054
        public C09700eb A02(byte[] bArr) {
            try {
                byte[] bArr2 = new byte[4];
                SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr2);
                byte[] bArr3 = new byte[16];
                SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr3);
                byte[] bArr4 = new byte[16];
                SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr4);
                String encodeToString = Base64.encodeToString(bArr4, 3);
                StringBuilder sb = new StringBuilder();
                sb.append(C0FH.A0I);
                sb.append(encodeToString);
                SecretKeySpec secretKeySpec = new SecretKeySpec(A00(sb.toString(), bArr2), "AES/OFB/NoPadding");
                Cipher cipher = Cipher.getInstance("AES/OFB/NoPadding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                return new C09700eb(2, cipher.doFinal(bArr), bArr3, bArr2, encodeToString);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                StringBuilder sb2 = new StringBuilder("EncryptedKeyHelperAESPassword/");
                sb2.append("crypto issue on encryption");
                Log.e(sb2.toString(), e);
                return null;
            }
        }

        @Override // X.AnonymousClass054
        public byte[] A04(C09700eb c09700eb) {
            if (c09700eb.A00 != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("EncryptedKeyHelperAESPassword/");
                sb.append("getDecrypted invalid type");
                Log.e(sb.toString());
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0FH.A0I);
                sb2.append(c09700eb.A01);
                SecretKeySpec secretKeySpec = new SecretKeySpec(A00(sb2.toString(), c09700eb.A04), "AES/OFB/NoPadding");
                Cipher cipher = Cipher.getInstance("AES/OFB/NoPadding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(c09700eb.A03));
                return cipher.doFinal(c09700eb.A02);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("EncryptedKeyHelperAESPassword/");
                sb3.append("crypto issue on decryption");
                Log.e(sb3.toString(), e);
                return null;
            }
        }
    };
    public final C003701t A07;
    public final AnonymousClass011 A08;
    public final C02O A09;

    public C01L(C003701t c003701t, AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011, C01B c01b, C02O c02o) {
        this.A07 = c003701t;
        this.A04 = abstractC000600i;
        this.A08 = anonymousClass011;
        this.A05 = c01b;
        this.A09 = c02o;
    }

    public static C01L A00() {
        if (A0A == null) {
            synchronized (C01L.class) {
                if (A0A == null) {
                    A0A = new C01L(C003701t.A00(), AbstractC000600i.A00(), AnonymousClass011.A00(), C01B.A00(), C02O.A00());
                }
            }
        }
        return A0A;
    }

    public static final void A01(SharedPreferences sharedPreferences) {
        if (sharedPreferences.edit().remove("client_static_keypair_enc").commit()) {
            return;
        }
        Log.w("AuthKeyStore/failed to clear key pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0072, code lost:
        if (r0 == (-1)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00fe, code lost:
        if (A09(r16.A02()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0209, code lost:
        if (r19 == false) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0049 A[Catch: all -> 0x0315, TryCatch #0 {, blocks: (B:161:0x0003, B:163:0x000a, B:164:0x001d, B:166:0x0023, B:170:0x0034, B:173:0x003c, B:175:0x0049, B:176:0x0050, B:177:0x0051, B:179:0x0057, B:188:0x0078, B:190:0x00a7, B:191:0x00aa, B:193:0x00be, B:195:0x00c8, B:201:0x00f0, B:204:0x0101, B:208:0x0109, B:210:0x010f, B:211:0x0114, B:213:0x0126, B:215:0x013c, B:243:0x01bb, B:279:0x0264, B:280:0x0270, B:282:0x0278, B:285:0x0287, B:287:0x0291, B:290:0x02b4, B:291:0x02bb, B:294:0x02bf, B:295:0x02e1, B:297:0x02e9, B:298:0x02f4, B:301:0x030c, B:216:0x0142, B:218:0x0150, B:220:0x0157, B:222:0x015c, B:224:0x0163, B:226:0x0173, B:239:0x01a3, B:240:0x01b3, B:258:0x01f3, B:260:0x01f9, B:262:0x0203, B:267:0x020c, B:270:0x0219, B:272:0x021f, B:274:0x0246, B:277:0x024d, B:278:0x0258, B:198:0x00e6, B:168:0x002d), top: B:307:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0057 A[Catch: all -> 0x0315, TryCatch #0 {, blocks: (B:161:0x0003, B:163:0x000a, B:164:0x001d, B:166:0x0023, B:170:0x0034, B:173:0x003c, B:175:0x0049, B:176:0x0050, B:177:0x0051, B:179:0x0057, B:188:0x0078, B:190:0x00a7, B:191:0x00aa, B:193:0x00be, B:195:0x00c8, B:201:0x00f0, B:204:0x0101, B:208:0x0109, B:210:0x010f, B:211:0x0114, B:213:0x0126, B:215:0x013c, B:243:0x01bb, B:279:0x0264, B:280:0x0270, B:282:0x0278, B:285:0x0287, B:287:0x0291, B:290:0x02b4, B:291:0x02bb, B:294:0x02bf, B:295:0x02e1, B:297:0x02e9, B:298:0x02f4, B:301:0x030c, B:216:0x0142, B:218:0x0150, B:220:0x0157, B:222:0x015c, B:224:0x0163, B:226:0x0173, B:239:0x01a3, B:240:0x01b3, B:258:0x01f3, B:260:0x01f9, B:262:0x0203, B:267:0x020c, B:270:0x0219, B:272:0x021f, B:274:0x0246, B:277:0x024d, B:278:0x0258, B:198:0x00e6, B:168:0x002d), top: B:307:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0126 A[Catch: all -> 0x0315, TryCatch #0 {, blocks: (B:161:0x0003, B:163:0x000a, B:164:0x001d, B:166:0x0023, B:170:0x0034, B:173:0x003c, B:175:0x0049, B:176:0x0050, B:177:0x0051, B:179:0x0057, B:188:0x0078, B:190:0x00a7, B:191:0x00aa, B:193:0x00be, B:195:0x00c8, B:201:0x00f0, B:204:0x0101, B:208:0x0109, B:210:0x010f, B:211:0x0114, B:213:0x0126, B:215:0x013c, B:243:0x01bb, B:279:0x0264, B:280:0x0270, B:282:0x0278, B:285:0x0287, B:287:0x0291, B:290:0x02b4, B:291:0x02bb, B:294:0x02bf, B:295:0x02e1, B:297:0x02e9, B:298:0x02f4, B:301:0x030c, B:216:0x0142, B:218:0x0150, B:220:0x0157, B:222:0x015c, B:224:0x0163, B:226:0x0173, B:239:0x01a3, B:240:0x01b3, B:258:0x01f3, B:260:0x01f9, B:262:0x0203, B:267:0x020c, B:270:0x0219, B:272:0x021f, B:274:0x0246, B:277:0x024d, B:278:0x0258, B:198:0x00e6, B:168:0x002d), top: B:307:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0278 A[Catch: all -> 0x0315, TryCatch #0 {, blocks: (B:161:0x0003, B:163:0x000a, B:164:0x001d, B:166:0x0023, B:170:0x0034, B:173:0x003c, B:175:0x0049, B:176:0x0050, B:177:0x0051, B:179:0x0057, B:188:0x0078, B:190:0x00a7, B:191:0x00aa, B:193:0x00be, B:195:0x00c8, B:201:0x00f0, B:204:0x0101, B:208:0x0109, B:210:0x010f, B:211:0x0114, B:213:0x0126, B:215:0x013c, B:243:0x01bb, B:279:0x0264, B:280:0x0270, B:282:0x0278, B:285:0x0287, B:287:0x0291, B:290:0x02b4, B:291:0x02bb, B:294:0x02bf, B:295:0x02e1, B:297:0x02e9, B:298:0x02f4, B:301:0x030c, B:216:0x0142, B:218:0x0150, B:220:0x0157, B:222:0x015c, B:224:0x0163, B:226:0x0173, B:239:0x01a3, B:240:0x01b3, B:258:0x01f3, B:260:0x01f9, B:262:0x0203, B:267:0x020c, B:270:0x0219, B:272:0x021f, B:274:0x0246, B:277:0x024d, B:278:0x0258, B:198:0x00e6, B:168:0x002d), top: B:307:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x02b4 A[Catch: all -> 0x0315, TryCatch #0 {, blocks: (B:161:0x0003, B:163:0x000a, B:164:0x001d, B:166:0x0023, B:170:0x0034, B:173:0x003c, B:175:0x0049, B:176:0x0050, B:177:0x0051, B:179:0x0057, B:188:0x0078, B:190:0x00a7, B:191:0x00aa, B:193:0x00be, B:195:0x00c8, B:201:0x00f0, B:204:0x0101, B:208:0x0109, B:210:0x010f, B:211:0x0114, B:213:0x0126, B:215:0x013c, B:243:0x01bb, B:279:0x0264, B:280:0x0270, B:282:0x0278, B:285:0x0287, B:287:0x0291, B:290:0x02b4, B:291:0x02bb, B:294:0x02bf, B:295:0x02e1, B:297:0x02e9, B:298:0x02f4, B:301:0x030c, B:216:0x0142, B:218:0x0150, B:220:0x0157, B:222:0x015c, B:224:0x0163, B:226:0x0173, B:239:0x01a3, B:240:0x01b3, B:258:0x01f3, B:260:0x01f9, B:262:0x0203, B:267:0x020c, B:270:0x0219, B:272:0x021f, B:274:0x0246, B:277:0x024d, B:278:0x0258, B:198:0x00e6, B:168:0x002d), top: B:307:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02bf A[Catch: all -> 0x0315, TryCatch #0 {, blocks: (B:161:0x0003, B:163:0x000a, B:164:0x001d, B:166:0x0023, B:170:0x0034, B:173:0x003c, B:175:0x0049, B:176:0x0050, B:177:0x0051, B:179:0x0057, B:188:0x0078, B:190:0x00a7, B:191:0x00aa, B:193:0x00be, B:195:0x00c8, B:201:0x00f0, B:204:0x0101, B:208:0x0109, B:210:0x010f, B:211:0x0114, B:213:0x0126, B:215:0x013c, B:243:0x01bb, B:279:0x0264, B:280:0x0270, B:282:0x0278, B:285:0x0287, B:287:0x0291, B:290:0x02b4, B:291:0x02bb, B:294:0x02bf, B:295:0x02e1, B:297:0x02e9, B:298:0x02f4, B:301:0x030c, B:216:0x0142, B:218:0x0150, B:220:0x0157, B:222:0x015c, B:224:0x0163, B:226:0x0173, B:239:0x01a3, B:240:0x01b3, B:258:0x01f3, B:260:0x01f9, B:262:0x0203, B:267:0x020c, B:270:0x0219, B:272:0x021f, B:274:0x0246, B:277:0x024d, B:278:0x0258, B:198:0x00e6, B:168:0x002d), top: B:307:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x02e9 A[Catch: all -> 0x0315, TryCatch #0 {, blocks: (B:161:0x0003, B:163:0x000a, B:164:0x001d, B:166:0x0023, B:170:0x0034, B:173:0x003c, B:175:0x0049, B:176:0x0050, B:177:0x0051, B:179:0x0057, B:188:0x0078, B:190:0x00a7, B:191:0x00aa, B:193:0x00be, B:195:0x00c8, B:201:0x00f0, B:204:0x0101, B:208:0x0109, B:210:0x010f, B:211:0x0114, B:213:0x0126, B:215:0x013c, B:243:0x01bb, B:279:0x0264, B:280:0x0270, B:282:0x0278, B:285:0x0287, B:287:0x0291, B:290:0x02b4, B:291:0x02bb, B:294:0x02bf, B:295:0x02e1, B:297:0x02e9, B:298:0x02f4, B:301:0x030c, B:216:0x0142, B:218:0x0150, B:220:0x0157, B:222:0x015c, B:224:0x0163, B:226:0x0173, B:239:0x01a3, B:240:0x01b3, B:258:0x01f3, B:260:0x01f9, B:262:0x0203, B:267:0x020c, B:270:0x0219, B:272:0x021f, B:274:0x0246, B:277:0x024d, B:278:0x0258, B:198:0x00e6, B:168:0x002d), top: B:307:0x0003, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized X.C05090Ng A02() {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01L.A02():X.0Ng");
    }

    public final C0b9 A03() {
        C09700eb A00;
        AnonymousClass054 anonymousClass054;
        SharedPreferences A01 = this.A09.A01("keystore");
        String string = A01.getString("client_static_keypair_enc", null);
        if (string == null || (A00 = C09700eb.A00(new JSONArray(string))) == null) {
            return null;
        }
        if (A00.A00 == 0) {
            if (Build.VERSION.SDK_INT >= 23 && (anonymousClass054 = this.A01) != null) {
                byte[] A04 = anonymousClass054.A04(A00);
                Log.i("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc");
                if (A04 != null) {
                    return C0b9.A01(A04);
                }
            } else {
                Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/not supported sdk for type");
                A01(A01);
                return null;
            }
        } else {
            Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc not supported type");
            A01(A01);
        }
        Log.e("AuthKeyStore/readAndroidKeyStoreClientStaticKeypairEnc/failed to read data");
        return null;
    }

    public final C0b9 A04(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("client_static_keypair_pwd_enc", null);
        if (string == null) {
            return null;
        }
        try {
            C09700eb A00 = C09700eb.A00(new JSONArray(string));
            if (A00 == null) {
                return null;
            }
            if (A00.A00 != 2) {
                Log.e("AuthKeyStore/readClientStaticKeypairEnc 3 not expected type");
                return null;
            }
            byte[] A04 = this.A06.A04(A00);
            Log.i("AuthKeyStore/readClientStaticKeypairEnc 3");
            if (A04 == null) {
                Log.e("AuthKeyStore/readClientStaticKeypairEnc/failed to read data");
                return null;
            }
            return C0b9.A01(A04);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final C0b9 A05(boolean z) {
        SharedPreferences A01 = this.A09.A01("keystore");
        StringBuilder sb = new StringBuilder("AuthKeyStore/generating new client static keypair/store 1 = ");
        sb.append(z);
        Log.i(sb.toString());
        C0b9 A00 = C0b9.A00();
        byte[] A02 = A00.A02();
        if (!z || !A09(A02)) {
            A07(A01, A02);
        }
        return A00;
    }

    public final void A06() {
        if (this.A01 != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            SharedPreferences A01 = this.A09.A01("keystore");
            String A05 = this.A07.A05(388);
            String A0L = C000200d.A0L(new StringBuilder(), Build.MANUFACTURER, ";");
            if (A05 == null || !A05.contains(A0L) || !A01.contains("client_static_keypair_pwd_enc")) {
                this.A01 = new AnonymousClass054() { // from class: X.1kq
                    public final String A00 = "aes_auth_key";

                    @Override // X.AnonymousClass054
                    public C09700eb A02(byte[] bArr) {
                        SecretKey generateKey;
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            keyStore.load(null);
                            String str = this.A00;
                            if (keyStore.containsAlias(str) && keyStore.entryInstanceOf(str, KeyStore.SecretKeyEntry.class)) {
                                generateKey = A05();
                            } else {
                                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                                generateKey = keyGenerator.generateKey();
                            }
                            if (generateKey != null) {
                                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                                cipher.init(1, generateKey);
                                return new C09700eb(0, cipher.doFinal(bArr), cipher.getIV(), null, null);
                            }
                            throw new KeyStoreException("could not get key store entry");
                        } catch (IOException e) {
                            e = e;
                            StringBuilder sb = new StringBuilder();
                            sb.append("EncryptedKeyHelperAESKeyStore/");
                            sb.append("key store issue on decryption");
                            Log.e(sb.toString(), e);
                            return null;
                        } catch (NullPointerException e2) {
                            e = e2;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("EncryptedKeyHelperAESKeyStore/");
                            sb2.append("crypto issue on encryption");
                            Log.e(sb2.toString(), e);
                            return null;
                        } catch (InvalidAlgorithmParameterException e3) {
                            e = e3;
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("EncryptedKeyHelperAESKeyStore/");
                            sb22.append("crypto issue on encryption");
                            Log.e(sb22.toString(), e);
                            return null;
                        } catch (InvalidKeyException e4) {
                            e = e4;
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append("EncryptedKeyHelperAESKeyStore/");
                            sb222.append("crypto issue on encryption");
                            Log.e(sb222.toString(), e);
                            return null;
                        } catch (KeyStoreException e5) {
                            e = e5;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("EncryptedKeyHelperAESKeyStore/");
                            sb3.append("key store issue on decryption");
                            Log.e(sb3.toString(), e);
                            return null;
                        } catch (NoSuchAlgorithmException e6) {
                            e = e6;
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append("EncryptedKeyHelperAESKeyStore/");
                            sb2222.append("crypto issue on encryption");
                            Log.e(sb2222.toString(), e);
                            return null;
                        } catch (NoSuchProviderException e7) {
                            e = e7;
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append("EncryptedKeyHelperAESKeyStore/");
                            sb32.append("key store issue on decryption");
                            Log.e(sb32.toString(), e);
                            return null;
                        } catch (ProviderException e8) {
                            e = e8;
                            StringBuilder sb322 = new StringBuilder();
                            sb322.append("EncryptedKeyHelperAESKeyStore/");
                            sb322.append("key store issue on decryption");
                            Log.e(sb322.toString(), e);
                            return null;
                        } catch (UnrecoverableEntryException e9) {
                            e = e9;
                            StringBuilder sb3222 = new StringBuilder();
                            sb3222.append("EncryptedKeyHelperAESKeyStore/");
                            sb3222.append("key store issue on decryption");
                            Log.e(sb3222.toString(), e);
                            return null;
                        } catch (CertificateException e10) {
                            e = e10;
                            StringBuilder sb32222 = new StringBuilder();
                            sb32222.append("EncryptedKeyHelperAESKeyStore/");
                            sb32222.append("key store issue on decryption");
                            Log.e(sb32222.toString(), e);
                            return null;
                        } catch (BadPaddingException e11) {
                            e = e11;
                            StringBuilder sb22222 = new StringBuilder();
                            sb22222.append("EncryptedKeyHelperAESKeyStore/");
                            sb22222.append("crypto issue on encryption");
                            Log.e(sb22222.toString(), e);
                            return null;
                        } catch (IllegalBlockSizeException e12) {
                            e = e12;
                            StringBuilder sb222222 = new StringBuilder();
                            sb222222.append("EncryptedKeyHelperAESKeyStore/");
                            sb222222.append("crypto issue on encryption");
                            Log.e(sb222222.toString(), e);
                            return null;
                        } catch (NoSuchPaddingException e13) {
                            e = e13;
                            StringBuilder sb2222222 = new StringBuilder();
                            sb2222222.append("EncryptedKeyHelperAESKeyStore/");
                            sb2222222.append("crypto issue on encryption");
                            Log.e(sb2222222.toString(), e);
                            return null;
                        }
                    }

                    @Override // X.AnonymousClass054
                    public void A03() {
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            keyStore.load(null);
                            keyStore.deleteEntry(this.A00);
                        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                            StringBuilder sb = new StringBuilder("EncryptedKeyHelperAESKeyStore/");
                            sb.append("failed to clear keyStore");
                            Log.e(sb.toString());
                        }
                    }

                    @Override // X.AnonymousClass054
                    public byte[] A04(C09700eb c09700eb) {
                        if (c09700eb.A00 != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("EncryptedKeyHelperAESKeyStore/");
                            sb.append("getDecrypted invalid type");
                            Log.e(sb.toString());
                            return null;
                        }
                        try {
                            SecretKey A052 = A05();
                            if (A052 != null) {
                                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                                cipher.init(2, A052, new GCMParameterSpec(128, c09700eb.A03));
                                return cipher.doFinal(c09700eb.A02);
                            }
                            throw new KeyStoreException("could not get key store entry");
                        } catch (IOException e) {
                            e = e;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("EncryptedKeyHelperAESKeyStore/");
                            sb2.append("key store issue on decryption");
                            Log.e(sb2.toString(), e);
                            return null;
                        } catch (NullPointerException e2) {
                            e = e2;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("EncryptedKeyHelperAESKeyStore/");
                            sb3.append("crypto issue on decryption");
                            Log.e(sb3.toString(), e);
                            return null;
                        } catch (InvalidAlgorithmParameterException e3) {
                            e = e3;
                            StringBuilder sb32 = new StringBuilder();
                            sb32.append("EncryptedKeyHelperAESKeyStore/");
                            sb32.append("crypto issue on decryption");
                            Log.e(sb32.toString(), e);
                            return null;
                        } catch (InvalidKeyException e4) {
                            e = e4;
                            StringBuilder sb322 = new StringBuilder();
                            sb322.append("EncryptedKeyHelperAESKeyStore/");
                            sb322.append("crypto issue on decryption");
                            Log.e(sb322.toString(), e);
                            return null;
                        } catch (KeyStoreException e5) {
                            e = e5;
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append("EncryptedKeyHelperAESKeyStore/");
                            sb22.append("key store issue on decryption");
                            Log.e(sb22.toString(), e);
                            return null;
                        } catch (NoSuchAlgorithmException e6) {
                            e = e6;
                            StringBuilder sb3222 = new StringBuilder();
                            sb3222.append("EncryptedKeyHelperAESKeyStore/");
                            sb3222.append("crypto issue on decryption");
                            Log.e(sb3222.toString(), e);
                            return null;
                        } catch (ProviderException e7) {
                            e = e7;
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append("EncryptedKeyHelperAESKeyStore/");
                            sb222.append("key store issue on decryption");
                            Log.e(sb222.toString(), e);
                            return null;
                        } catch (UnrecoverableEntryException e8) {
                            e = e8;
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append("EncryptedKeyHelperAESKeyStore/");
                            sb2222.append("key store issue on decryption");
                            Log.e(sb2222.toString(), e);
                            return null;
                        } catch (CertificateException e9) {
                            e = e9;
                            StringBuilder sb22222 = new StringBuilder();
                            sb22222.append("EncryptedKeyHelperAESKeyStore/");
                            sb22222.append("key store issue on decryption");
                            Log.e(sb22222.toString(), e);
                            return null;
                        } catch (BadPaddingException e10) {
                            e = e10;
                            StringBuilder sb32222 = new StringBuilder();
                            sb32222.append("EncryptedKeyHelperAESKeyStore/");
                            sb32222.append("crypto issue on decryption");
                            Log.e(sb32222.toString(), e);
                            return null;
                        } catch (IllegalBlockSizeException e11) {
                            e = e11;
                            StringBuilder sb322222 = new StringBuilder();
                            sb322222.append("EncryptedKeyHelperAESKeyStore/");
                            sb322222.append("crypto issue on decryption");
                            Log.e(sb322222.toString(), e);
                            return null;
                        } catch (NoSuchPaddingException e12) {
                            e = e12;
                            StringBuilder sb3222222 = new StringBuilder();
                            sb3222222.append("EncryptedKeyHelperAESKeyStore/");
                            sb3222222.append("crypto issue on decryption");
                            Log.e(sb3222222.toString(), e);
                            return null;
                        }
                    }

                    public final SecretKey A05() {
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            keyStore.load(null);
                            return ((KeyStore.SecretKeyEntry) keyStore.getEntry(this.A00, null)).getSecretKey();
                        } catch (UnrecoverableKeyException unused) {
                            StringBuilder sb = new StringBuilder("EncryptedKeyHelperAESKeyStore/");
                            sb.append(" KeyStore error, will wait and retry with new keystore");
                            Log.e(sb.toString());
                            SystemClock.sleep(50L);
                            KeyStore keyStore2 = KeyStore.getInstance("AndroidKeyStore");
                            keyStore2.load(null);
                            return ((KeyStore.SecretKeyEntry) keyStore2.getEntry(this.A00, null)).getSecretKey();
                        }
                    }
                };
                return;
            }
        }
        this.A01 = null;
    }

    public final void A07(SharedPreferences sharedPreferences, byte[] bArr) {
        if (!A0A(bArr, sharedPreferences) && !A0A(bArr, sharedPreferences)) {
            throw new RuntimeException("unable to write client static keypair");
        }
    }

    public final boolean A08(C09700eb c09700eb, String str) {
        SharedPreferences A01 = this.A09.A01("keystore");
        if (c09700eb != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(c09700eb.A00);
            jSONArray.put(Base64.encodeToString(c09700eb.A02, 3));
            byte[] bArr = c09700eb.A03;
            if (bArr != null) {
                jSONArray.put(Base64.encodeToString(bArr, 3));
            }
            byte[] bArr2 = c09700eb.A04;
            if (bArr2 != null) {
                jSONArray.put(Base64.encodeToString(bArr2, 3));
            }
            String str2 = c09700eb.A01;
            if (str2 != null) {
                jSONArray.put(str2);
            }
            String obj = jSONArray.toString();
            if (obj != null) {
                boolean commit = A01.edit().putString(str, obj).commit();
                if (!commit) {
                    Log.e("AuthKeyStore/failed to store clientStaticKeypair");
                }
                return commit;
            }
        }
        Log.e("AuthKeyStore/failed to store clientStaticKeypair/cant generate json");
        return false;
    }

    public final boolean A09(byte[] bArr) {
        SharedPreferences A01 = this.A09.A01("keystore");
        if (TextUtils.isEmpty(A01.getString("client_static_keypair_enc", null))) {
            AnonymousClass054 anonymousClass054 = this.A01;
            if (anonymousClass054 != null && (A0B(bArr, A01, anonymousClass054) || A0B(bArr, A01, this.A01))) {
                return true;
            }
            Log.w("AuthKeyStore/ensureEncKeyStored/failed to use enc csk");
            return false;
        }
        return false;
    }

    public final boolean A0A(byte[] bArr, SharedPreferences sharedPreferences) {
        C0b9 A04;
        if (A08(this.A06.A02(bArr), "client_static_keypair_pwd_enc") && (A04 = A04(sharedPreferences)) != null && Arrays.equals(bArr, A04.A02())) {
            Log.i("AuthKeyStore/storedAndCanRead/3");
            return true;
        }
        AnonymousClass054.A01("failed to store and read correct key", new RuntimeException());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0010, code lost:
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0016, code lost:
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0020, code lost:
        if (java.util.Arrays.equals(r3, r0.A02()) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0022, code lost:
        com.whatsapp.util.Log.i("AuthKeyStore/storeAndCanReadAndroidKeyStoreKey/1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0028, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0B(byte[] r3, android.content.SharedPreferences r4, X.AnonymousClass054 r5) {
        /*
            r2 = this;
            X.0eb r1 = r5.A02(r3)
            java.lang.String r0 = "client_static_keypair_enc"
            boolean r0 = r2.A08(r1, r0)
            if (r0 == 0) goto L2f
            X.0b9 r0 = r2.A03()     // Catch: org.json.JSONException -> L12
            if (r0 != 0) goto L18
        L12:
            X.0b9 r0 = r2.A03()     // Catch: org.json.JSONException -> L29
            if (r0 == 0) goto L2f
        L18:
            byte[] r0 = r0.A02()
            boolean r0 = java.util.Arrays.equals(r3, r0)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "AuthKeyStore/storeAndCanReadAndroidKeyStoreKey/1"
            com.whatsapp.util.Log.i(r0)
            r0 = 1
            return r0
        L29:
            r1 = move-exception
            java.lang.String r0 = "read invalid json"
            X.AnonymousClass054.A01(r0, r1)
        L2f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            java.lang.String r0 = "failed to store and read correct key"
            X.AnonymousClass054.A01(r0, r1)
            A01(r4)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01L.A0B(byte[], android.content.SharedPreferences, X.054):boolean");
    }
}
