package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.0G7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0G7 {
    public static volatile C0G7 A01;
    public final C05Y A00;

    public C0G7(C05Y c05y) {
        this.A00 = c05y;
    }

    public static final void A00(String str, C02590Ca c02590Ca, C1Q6 c1q6) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder("EncryptedBackupProtocolHelper/onError id=");
        sb.append(str);
        Log.e(sb.toString());
        C02590Ca A0D = c02590Ca.A0D("error");
        if (A0D == null) {
            StringBuilder sb2 = new StringBuilder("EncryptedBackupProtocolHelper/onError/error node is empty, id=");
            sb2.append(str);
            Log.e(sb2.toString());
            c1q6.AJu("error node is empty", 1);
            return;
        }
        C04P A0A = A0D.A0A("text");
        if (A0A != null) {
            str2 = A0A.A03;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            StringBuilder sb3 = new StringBuilder("EncryptedBackupProtocolHelper/onError/error text is empty, id=");
            sb3.append(str);
            Log.e(sb3.toString());
            c1q6.AJu("error text is empty", 1);
            return;
        }
        C04P A0A2 = A0D.A0A("code");
        if (A0A2 != null) {
            str3 = A0A2.A03;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            StringBuilder sb4 = new StringBuilder("EncryptedBackupProtocolHelper/onError/error code is empty, id=");
            sb4.append(str);
            Log.e(sb4.toString());
            c1q6.AJu("error code is empty", 1);
            return;
        }
        try {
            c1q6.AJu(str2, Integer.parseInt(str3));
        } catch (NumberFormatException unused) {
            StringBuilder sb5 = new StringBuilder("EncryptedBackupProtocolHelper/onError/error code is not numerical, id=");
            sb5.append(str);
            sb5.append(", error=");
            sb5.append(str3);
            Log.e(sb5.toString());
            c1q6.AJu("error code is not numerical", 1);
        }
    }

    public void A01(final C1PL c1pl) {
        C05Y c05y = this.A00;
        String A02 = c05y.A02();
        C000200d.A14("EncryptedBackupProtocolHelper/sendInitRegIq id=", A02);
        c05y.A07(255, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02), new C04P("xmlns", "vesta"), new C04P("type", "get"), new C04P("to", "s.whatsapp.net")}, new C02590Ca("init_reg", null)), new InterfaceC010405f() { // from class: X.1nB
            @Override // X.InterfaceC010405f
            public void AJI(String str) {
                C000200d.A13("EncryptedBackupProtocolHelper/onDeliveryFailure id=", str);
                c1pl.A00.AJv("delivery failure", 3, 0);
            }

            @Override // X.InterfaceC010405f
            public void AJx(String str, C02590Ca c02590Ca) {
                C0G7.A00(str, c02590Ca, c1pl);
            }

            @Override // X.InterfaceC010405f
            public void APJ(String str, C02590Ca c02590Ca) {
                byte[] bArr;
                byte[] bArr2;
                byte[] bArr3;
                byte[] bArr4;
                C0G7 c0g7 = C0G7.this;
                C1PL c1pl2 = c1pl;
                if (c0g7 != null) {
                    StringBuilder sb = new StringBuilder("EncryptedBackupProtocolHelper/onSuccess id=");
                    sb.append(str);
                    Log.i(sb.toString());
                    C02590Ca A0D = c02590Ca.A0D("hk_pub");
                    if (A0D != null && (bArr = A0D.A01) != null) {
                        C02590Ca A0D2 = c02590Ca.A0D("hk_key_signature");
                        if (A0D2 != null && (bArr2 = A0D2.A01) != null) {
                            C02590Ca A0D3 = c02590Ca.A0D("ok_pub");
                            if (A0D3 != null && (bArr3 = A0D3.A01) != null) {
                                C02590Ca A0D4 = c02590Ca.A0D("ok_key_signature");
                                if (A0D4 != null && (bArr4 = A0D4.A01) != null) {
                                    if (!C1N3.A00(bArr, bArr2)) {
                                        C000200d.A13("EncryptedBackupProtocolHelper/hk_pub cannot be verified with hk_key_signature id=", str);
                                        c1pl2.AJu("hk_pub cannot be verified with hk_key_signature", 1);
                                        return;
                                    } else if (!C1N3.A00(bArr3, bArr4)) {
                                        C000200d.A13("EncryptedBackupProtocolHelper/ok_pub cannot be verified with ok_key_signature id=", str);
                                        c1pl2.AJu("ok_pub cannot be verified with ok_key_signature", 1);
                                        return;
                                    } else {
                                        C03310Fe c03310Fe = c1pl2.A01;
                                        String str2 = c1pl2.A02;
                                        C1N2 c1n2 = c1pl2.A00;
                                        C27971Pn c27971Pn = new C27971Pn((NativeHolder) JniBridge.jvidispatchOOO(2, str2, bArr3));
                                        C27961Pm c27961Pm = new C27961Pm((NativeHolder) JniBridge.jvidispatchOO(2, c27971Pn.A00));
                                        JniBridge jniBridge = JniBridge.getInstance();
                                        NativeHolder nativeHolder = c27961Pm.A00;
                                        int modelGetInt = jniBridge.modelGetInt(nativeHolder, 66);
                                        if (modelGetInt != 0) {
                                            StringBuilder sb2 = new StringBuilder("WESOpaqueClientCreateRegistrationStart failed with WESOpaqueStatusType=");
                                            sb2.append(modelGetInt);
                                            c1n2.AJv(sb2.toString(), 4, 1);
                                            return;
                                        }
                                        byte[] modelGetByteArray = JniBridge.getInstance().modelGetByteArray(nativeHolder, 67);
                                        final C0G7 c0g72 = c03310Fe.A02;
                                        final C1NU c1nu = new C1NU(c03310Fe, bArr, c27971Pn, c1n2);
                                        C05Y c05y2 = c0g72.A00;
                                        String A022 = c05y2.A02();
                                        C000200d.A14("EncryptedBackupProtocolHelper/sendBeginRegIq id=", A022);
                                        c05y2.A07(255, A022, new C02590Ca("iq", new C04P[]{new C04P("id", A022), new C04P("xmlns", "vesta"), new C04P("type", "set"), new C04P("to", "s.whatsapp.net")}, new C02590Ca("r1", (C04P[]) null, modelGetByteArray)), new InterfaceC010405f() { // from class: X.1nC
                                            @Override // X.InterfaceC010405f
                                            public void AJI(String str3) {
                                                C000200d.A13("EncryptedBackupProtocolHelper/onDeliveryFailure id=", str3);
                                                c1nu.A00.AJv("delivery failure", 3, 1);
                                            }

                                            @Override // X.InterfaceC010405f
                                            public void AJx(String str3, C02590Ca c02590Ca2) {
                                                C0G7.A00(str3, c02590Ca2, c1nu);
                                            }

                                            @Override // X.InterfaceC010405f
                                            public void APJ(String str3, C02590Ca c02590Ca2) {
                                                byte[] bArr5;
                                                byte[] bArr6;
                                                C0G7 c0g73 = C0G7.this;
                                                C1NU c1nu2 = c1nu;
                                                if (c0g73 != null) {
                                                    StringBuilder sb3 = new StringBuilder("EncryptedBackupProtocolHelper/onSuccess id=");
                                                    sb3.append(str3);
                                                    Log.i(sb3.toString());
                                                    C02590Ca A0D5 = c02590Ca2.A0D("r2");
                                                    if (A0D5 != null && (bArr5 = A0D5.A01) != null) {
                                                        C02590Ca A0D6 = c02590Ca2.A0D("opaque_c");
                                                        if (A0D6 != null && (bArr6 = A0D6.A01) != null) {
                                                            C03310Fe c03310Fe2 = c1nu2.A01;
                                                            byte[] bArr7 = c1nu2.A03;
                                                            C27971Pn c27971Pn2 = c1nu2.A02;
                                                            C1N2 c1n22 = c1nu2.A00;
                                                            C27951Pl c27951Pl = new C27951Pl((NativeHolder) JniBridge.jvidispatchOIOO(2, 100000, c27971Pn2.A00, bArr5));
                                                            JniBridge jniBridge2 = JniBridge.getInstance();
                                                            NativeHolder nativeHolder2 = c27951Pl.A00;
                                                            int modelGetInt2 = jniBridge2.modelGetInt(nativeHolder2, 63);
                                                            if (modelGetInt2 != 0) {
                                                                StringBuilder sb4 = new StringBuilder("WESOpaqueClientCreateLoginFinish failed with WESOpaqueStatusType=");
                                                                sb4.append(modelGetInt2);
                                                                c1n22.AJv(sb4.toString(), 4, 2);
                                                                return;
                                                            }
                                                            byte[] copyOfRange = Arrays.copyOfRange(JniBridge.getInstance().modelGetByteArray(nativeHolder2, 64), 0, 32);
                                                            byte[] modelGetByteArray2 = JniBridge.getInstance().modelGetByteArray(nativeHolder2, 65);
                                                            try {
                                                                C0G6 c0g6 = c03310Fe2.A00;
                                                                byte[] A012 = c0g6.A01();
                                                                if (A012 == null) {
                                                                    A012 = C02A.A0C(32);
                                                                    c0g6.A00(A012);
                                                                }
                                                                byte[] A0C = C02A.A0C(12);
                                                                try {
                                                                    C000700j.A06(A012.length == 32);
                                                                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                                                                    cipher.init(1, new SecretKeySpec(copyOfRange, "AES"), new IvParameterSpec(A0C));
                                                                    byte[] doFinal = cipher.doFinal(A012);
                                                                    int length = doFinal.length;
                                                                    C000700j.A06(length == 48);
                                                                    C0CT AVX = C14430mw.A05.AVX();
                                                                    C0AN A013 = C0AN.A01(doFinal, 0, length);
                                                                    AVX.A02();
                                                                    C14430mw c14430mw = (C14430mw) AVX.A00;
                                                                    c14430mw.A00 |= 1;
                                                                    c14430mw.A01 = A013;
                                                                    C0AN A014 = C0AN.A01(modelGetByteArray2, 0, modelGetByteArray2.length);
                                                                    AVX.A02();
                                                                    C14430mw c14430mw2 = (C14430mw) AVX.A00;
                                                                    c14430mw2.A00 |= 2;
                                                                    c14430mw2.A04 = A014;
                                                                    C0AN A015 = C0AN.A01(bArr6, 0, bArr6.length);
                                                                    AVX.A02();
                                                                    C14430mw c14430mw3 = (C14430mw) AVX.A00;
                                                                    c14430mw3.A00 |= 4;
                                                                    c14430mw3.A03 = A015;
                                                                    C0AN A016 = C0AN.A01(A0C, 0, A0C.length);
                                                                    AVX.A02();
                                                                    C14430mw c14430mw4 = (C14430mw) AVX.A00;
                                                                    c14430mw4.A00 |= 8;
                                                                    c14430mw4.A02 = A016;
                                                                    byte[] A0B = AVX.A01().A0B();
                                                                    try {
                                                                        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr7));
                                                                        Cipher cipher2 = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
                                                                        cipher2.init(1, generatePublic);
                                                                        byte[] doFinal2 = cipher2.doFinal(A0B);
                                                                        if (doFinal2 == null) {
                                                                            return;
                                                                        }
                                                                        final C0G7 c0g74 = c03310Fe2.A02;
                                                                        final C1NT c1nt = new C1NT(c03310Fe2, c1n22);
                                                                        C05Y c05y3 = c0g74.A00;
                                                                        String A023 = c05y3.A02();
                                                                        C000200d.A14("EncryptedBackupProtocolHelper/sendFinishRegIq id=", A023);
                                                                        c05y3.A07(255, A023, new C02590Ca("iq", new C04P[]{new C04P("id", A023), new C04P("xmlns", "vesta"), new C04P("type", "set"), new C04P("to", "s.whatsapp.net")}, new C02590Ca("reg_payload", (C04P[]) null, doFinal2)), new InterfaceC010405f() { // from class: X.1nD
                                                                            @Override // X.InterfaceC010405f
                                                                            public void AJI(String str4) {
                                                                                C000200d.A13("EncryptedBackupProtocolHelper/onDeliveryFailure id=", str4);
                                                                                c1nt.A00.AJv("delivery failure", 3, 2);
                                                                            }

                                                                            @Override // X.InterfaceC010405f
                                                                            public void AJx(String str4, C02590Ca c02590Ca3) {
                                                                                C0G7.A00(str4, c02590Ca3, c1nt);
                                                                            }

                                                                            @Override // X.InterfaceC010405f
                                                                            public void APJ(String str4, C02590Ca c02590Ca3) {
                                                                                C0G7 c0g75 = C0G7.this;
                                                                                C1NT c1nt2 = c1nt;
                                                                                if (c0g75 != null) {
                                                                                    StringBuilder sb5 = new StringBuilder("EncryptedBackupProtocolHelper/onSuccess id=");
                                                                                    sb5.append(str4);
                                                                                    Log.i(sb5.toString());
                                                                                    if (c02590Ca3.A0D("success") == null) {
                                                                                        C000200d.A13("EncryptedBackupProtocolHelper/success was empty id=", str4);
                                                                                        c1nt2.AJu("success was empty", 1);
                                                                                        return;
                                                                                    }
                                                                                    C000200d.A0j(c1nt2.A01.A01, "encrypted_backup_enabled", true);
                                                                                    Log.i("EncBackupManager/encrypted backup enabled");
                                                                                    c1nt2.A00.APE();
                                                                                    return;
                                                                                }
                                                                                throw null;
                                                                            }
                                                                        }, 32000L);
                                                                        return;
                                                                    } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                                                                        Log.e("EncBackupManager/createEncRegPayload/rsaEncrypt/exception.", e);
                                                                        c1n22.AJv("Failed to perform rsa encryption of reg payload", 5, 3);
                                                                        return;
                                                                    }
                                                                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                                                                    Log.e("EncBackupManager/createEncRegPayload/aesEncrypt/exception.", e2);
                                                                    c1n22.AJv("Failed to perform aes encryption of rootKey", 5, 3);
                                                                    return;
                                                                }
                                                            } catch (IOException e3) {
                                                                Log.e("EncBackupManager/createEncRegPayload/getAndSaveRootKey/exception.", e3);
                                                                c1n22.AJv("Failed to getAndSaveRootKey", 6, 3);
                                                                return;
                                                            }
                                                        }
                                                        C000200d.A13("EncryptedBackupProtocolHelper/opaque_c was empty id=", str3);
                                                        c1nu2.AJu("opaque_c was empty", 1);
                                                        return;
                                                    }
                                                    C000200d.A13("EncryptedBackupProtocolHelper/r2 was empty id=", str3);
                                                    c1nu2.AJu("r2 was empty", 1);
                                                    return;
                                                }
                                                throw null;
                                            }
                                        }, 32000L);
                                        return;
                                    }
                                }
                                C000200d.A13("EncryptedBackupProtocolHelper/ok_key_signature was empty id=", str);
                                c1pl2.AJu("ok_key_signature was empty", 1);
                                return;
                            }
                            C000200d.A13("EncryptedBackupProtocolHelper/ok_pub was empty id=", str);
                            c1pl2.AJu("ok_pub was empty", 1);
                            return;
                        }
                        C000200d.A13("EncryptedBackupProtocolHelper/hk_key_signature was empty id=", str);
                        c1pl2.AJu("hk_key_signature was empty", 1);
                        return;
                    }
                    C000200d.A13("EncryptedBackupProtocolHelper/hk_pub was empty id=", str);
                    c1pl2.AJu("hk_pub was empty", 1);
                    return;
                }
                throw null;
            }
        }, 32000L);
    }

    public void A02(final C1NW c1nw) {
        C05Y c05y = this.A00;
        String A02 = c05y.A02();
        c05y.A07(255, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02), new C04P("xmlns", "vesta"), new C04P("type", "get"), new C04P("to", "s.whatsapp.net")}, new C02590Ca("init_login", null)), new InterfaceC010405f() { // from class: X.1nE
            @Override // X.InterfaceC010405f
            public void AJI(String str) {
                C000200d.A13("EncryptedBackupProtocolHelper/onDeliveryFailure id=", str);
                c1nw.A00.AJw("delivery failure", 3, 0, -1);
            }

            @Override // X.InterfaceC010405f
            public void AJx(String str, C02590Ca c02590Ca) {
                C0G7.A00(str, c02590Ca, c1nw);
            }

            @Override // X.InterfaceC010405f
            public void APJ(String str, C02590Ca c02590Ca) {
                byte[] bArr;
                byte[] bArr2;
                String str2;
                String str3;
                C0G7 c0g7 = C0G7.this;
                C1NW c1nw2 = c1nw;
                if (c0g7 != null) {
                    C02590Ca A0D = c02590Ca.A0D("ok_pub");
                    if (A0D != null && (bArr = A0D.A01) != null) {
                        C02590Ca A0D2 = c02590Ca.A0D("ok_key_signature");
                        if (A0D2 != null && (bArr2 = A0D2.A01) != null) {
                            C02590Ca A0D3 = c02590Ca.A0D("count");
                            if (A0D3 != null) {
                                C04P A0A = A0D3.A0A("value");
                                if (A0A != null) {
                                    str2 = A0A.A03;
                                } else {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    try {
                                        C04P A0A2 = A0D3.A0A("value");
                                        if (A0A2 != null) {
                                            str3 = A0A2.A03;
                                        } else {
                                            str3 = null;
                                        }
                                        int parseInt = Integer.parseInt(str3);
                                        if (!C1N3.A00(bArr, bArr2)) {
                                            C000200d.A13("EncryptedBackupProtocolHelper/ok_pub cannot be verified with ok_key_signature id=", str);
                                            c1nw2.AJu("ok_pub cannot be verified with ok_key_signature", 2);
                                            return;
                                        }
                                        C03310Fe c03310Fe = c1nw2.A01;
                                        String str4 = c1nw2.A02;
                                        boolean z = c1nw2.A03;
                                        C1N1 c1n1 = c1nw2.A00;
                                        C27941Pk c27941Pk = new C27941Pk((NativeHolder) JniBridge.jvidispatchOOO(3, str4, bArr));
                                        C27931Pj c27931Pj = new C27931Pj((NativeHolder) JniBridge.jvidispatchOO(3, c27941Pk.A00));
                                        JniBridge jniBridge = JniBridge.getInstance();
                                        NativeHolder nativeHolder = c27931Pj.A00;
                                        int modelGetInt = jniBridge.modelGetInt(nativeHolder, 57);
                                        if (modelGetInt != 0) {
                                            c1n1.AJw(C000200d.A0D("WESOpaqueClientCreateLoginStart failed with WESOpaqueStatusType=", modelGetInt), 4, 1, -1);
                                            return;
                                        }
                                        byte[] modelGetByteArray = JniBridge.getInstance().modelGetByteArray(nativeHolder, 58);
                                        final C0G7 c0g72 = c03310Fe.A02;
                                        final C1NR c1nr = new C1NR(c03310Fe, modelGetByteArray, c27941Pk, parseInt, z, c1n1);
                                        C05Y c05y2 = c0g72.A00;
                                        String A022 = c05y2.A02();
                                        C000200d.A14("EncryptedBackupProtocolHelper/sendBeginRegIq id=", A022);
                                        c05y2.A07(255, A022, new C02590Ca("iq", new C04P[]{new C04P("id", A022), new C04P("xmlns", "vesta"), new C04P("type", "get"), new C04P("to", "s.whatsapp.net")}, new C02590Ca("l1", (C04P[]) null, modelGetByteArray)), new InterfaceC010405f() { // from class: X.1nF
                                            @Override // X.InterfaceC010405f
                                            public void AJI(String str5) {
                                                C000200d.A13("EncryptedBackupProtocolHelper/onDeliveryFailure id=", str5);
                                                c1nr.A01.AJw("delivery failure", 3, 1, -1);
                                            }

                                            @Override // X.InterfaceC010405f
                                            public void AJx(String str5, C02590Ca c02590Ca2) {
                                                C0G7.A00(str5, c02590Ca2, c1nr);
                                            }

                                            @Override // X.InterfaceC010405f
                                            public void APJ(String str5, C02590Ca c02590Ca2) {
                                                byte[] bArr3;
                                                C0G7 c0g73 = C0G7.this;
                                                C1NR c1nr2 = c1nr;
                                                if (c0g73 != null) {
                                                    StringBuilder sb = new StringBuilder("EncryptedBackupProtocolHelper/onSuccess id=");
                                                    sb.append(str5);
                                                    Log.i(sb.toString());
                                                    C02590Ca A0D4 = c02590Ca2.A0D("l2");
                                                    if (A0D4 != null && (bArr3 = A0D4.A01) != null) {
                                                        C03310Fe c03310Fe2 = c1nr2.A02;
                                                        byte[] bArr4 = c1nr2.A05;
                                                        C27941Pk c27941Pk2 = c1nr2.A03;
                                                        int i = c1nr2.A00;
                                                        boolean z2 = c1nr2.A04;
                                                        C1N1 c1n12 = c1nr2.A01;
                                                        C27921Pi c27921Pi = new C27921Pi((NativeHolder) JniBridge.jvidispatchOIOOO(3, 100000, c27941Pk2.A00, bArr4, bArr3));
                                                        JniBridge jniBridge2 = JniBridge.getInstance();
                                                        NativeHolder nativeHolder2 = c27921Pi.A00;
                                                        int modelGetInt2 = jniBridge2.modelGetInt(nativeHolder2, 53);
                                                        if (modelGetInt2 == -1) {
                                                            c1n12.AJw("Login Failure Invalid Password", 8, 2, i);
                                                            return;
                                                        } else if (modelGetInt2 != 0) {
                                                            c1n12.AJw(C000200d.A0D("WESOpaqueClientCreateLoginFinish failed with WESOpaqueStatusType=", modelGetInt2), 4, 2, -1);
                                                            return;
                                                        } else {
                                                            byte[] modelGetByteArray2 = JniBridge.getInstance().modelGetByteArray(nativeHolder2, 56);
                                                            final C0G7 c0g74 = c03310Fe2.A02;
                                                            final C1NQ c1nq = new C1NQ(c03310Fe2, z2, c27921Pi, c1n12);
                                                            C05Y c05y3 = c0g74.A00;
                                                            String A023 = c05y3.A02();
                                                            C000200d.A14("EncryptedBackupProtocolHelper/sendFinishLoginIq id=", A023);
                                                            c05y3.A07(255, A023, new C02590Ca("iq", new C04P[]{new C04P("id", A023), new C04P("xmlns", "vesta"), new C04P("type", "get"), new C04P("to", "s.whatsapp.net")}, new C02590Ca("l3", (C04P[]) null, modelGetByteArray2)), new InterfaceC010405f() { // from class: X.1nG
                                                                @Override // X.InterfaceC010405f
                                                                public void AJI(String str6) {
                                                                    C000200d.A13("EncryptedBackupProtocolHelper/onDeliveryFailure id=", str6);
                                                                    c1nq.A00.AJw("delivery failure", 3, 2, -1);
                                                                }

                                                                @Override // X.InterfaceC010405f
                                                                public void AJx(String str6, C02590Ca c02590Ca3) {
                                                                    C0G7.A00(str6, c02590Ca3, c1nq);
                                                                }

                                                                @Override // X.InterfaceC010405f
                                                                public void APJ(String str6, C02590Ca c02590Ca3) {
                                                                    byte[] bArr5;
                                                                    C0G7 c0g75 = C0G7.this;
                                                                    C1NQ c1nq2 = c1nq;
                                                                    if (c0g75 != null) {
                                                                        StringBuilder sb2 = new StringBuilder("EncryptedBackupProtocolHelper/onSuccess id=");
                                                                        sb2.append(str6);
                                                                        Log.i(sb2.toString());
                                                                        C02590Ca A0D5 = c02590Ca3.A0D("success");
                                                                        if (A0D5 != null && (bArr5 = A0D5.A01) != null) {
                                                                            if (c1nq2.A03) {
                                                                                Log.i("EncBackupManger/finishLogin shouldSaveBackupKey=true -> saving backup key");
                                                                                C03310Fe c03310Fe3 = c1nq2.A01;
                                                                                C27921Pi c27921Pi2 = c1nq2.A02;
                                                                                C1N1 c1n13 = c1nq2.A00;
                                                                                JniBridge jniBridge3 = JniBridge.getInstance();
                                                                                NativeHolder nativeHolder3 = c27921Pi2.A00;
                                                                                byte[] copyOfRange = Arrays.copyOfRange(jniBridge3.modelGetByteArray(nativeHolder3, 54), 0, 32);
                                                                                try {
                                                                                    C14440mx c14440mx = (C14440mx) C0AZ.A03(C14440mx.A03, bArr5);
                                                                                    try {
                                                                                        byte[] A06 = c14440mx.A01.A06();
                                                                                        byte[] A062 = c14440mx.A02.A06();
                                                                                        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                                                                                        cipher.init(2, new SecretKeySpec(copyOfRange, "AES"), new IvParameterSpec(A062));
                                                                                        try {
                                                                                            C14450my c14450my = (C14450my) C0AZ.A03(C14450my.A03, cipher.doFinal(A06));
                                                                                            if (c14450my != null) {
                                                                                                byte[] copyOfRange2 = Arrays.copyOfRange(JniBridge.getInstance().modelGetByteArray(nativeHolder3, 55), 0, 32);
                                                                                                try {
                                                                                                    byte[] A063 = c14450my.A01.A06();
                                                                                                    byte[] A064 = c14450my.A02.A06();
                                                                                                    Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                                                                                                    cipher2.init(2, new SecretKeySpec(copyOfRange2, "AES"), new IvParameterSpec(A064));
                                                                                                    try {
                                                                                                        c03310Fe3.A00.A00(cipher2.doFinal(A063));
                                                                                                        C000200d.A0j(c03310Fe3.A01, "encrypted_backup_enabled", true);
                                                                                                        c1n13.APE();
                                                                                                        return;
                                                                                                    } catch (IOException unused) {
                                                                                                        c1n13.AJw("Failed to store backup key", 6, 4, -1);
                                                                                                        return;
                                                                                                    }
                                                                                                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                                                                                                    Log.e("EncBackupManager/retrieveBackupKey/aesDecrypt/exception.", e);
                                                                                                    c1n13.AJw("Failed to decrypt backup key", 5, 4, -1);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            return;
                                                                                        } catch (C0JX e2) {
                                                                                            Log.e("EncBackupManager/retrieveBackupKey/parseLoginPayload/exception.", e2);
                                                                                            c1n13.AJw("Failed to parse aes_k_nonce_k", 7, 4, -1);
                                                                                            return;
                                                                                        }
                                                                                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e3) {
                                                                                        Log.e("EncBackupManager/retrieveBackupKey/aesDecrypt/exception.", e3);
                                                                                        c1n13.AJw("Failed to decrypt aes_k_nonce_k", 5, 4, -1);
                                                                                        return;
                                                                                    }
                                                                                } catch (C0JX e4) {
                                                                                    Log.e("EncBackupManager/retrieveBackupKey/parseLoginPayload/exception.", e4);
                                                                                    c1n13.AJw("Failed to parse login payload", 7, 4, -1);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            Log.i("EncBackupManger/finishLogin shouldSaveBackupKey=false -> calling loginCallback.onSuccess()");
                                                                            c1nq2.A00.APE();
                                                                            return;
                                                                        }
                                                                        C000200d.A13("EncryptedBackupProtocolHelper/success was empty id=", str6);
                                                                        c1nq2.AJu("success was empty", 1);
                                                                        return;
                                                                    }
                                                                    throw null;
                                                                }
                                                            }, 32000L);
                                                            return;
                                                        }
                                                    }
                                                    C000200d.A13("EncryptedBackupProtocolHelper/l2 was empty id=", str5);
                                                    c1nr2.AJu("l2 was empty", 1);
                                                    return;
                                                }
                                                throw null;
                                            }
                                        }, 32000L);
                                        return;
                                    } catch (NumberFormatException unused) {
                                        C000200d.A13("EncryptedBackupProtocolHelper/count is not numerical, id=", str);
                                        c1nw2.AJu("count is not numerical", 1);
                                        return;
                                    }
                                }
                            }
                            C000200d.A13("EncryptedBackupProtocolHelper/count was empty id=", str);
                            c1nw2.AJu("count was empty", 2);
                            return;
                        }
                        C000200d.A13("EncryptedBackupProtocolHelper/ok_key_signature was empty id=", str);
                        c1nw2.AJu("ok_key_signature was empty", 2);
                        return;
                    }
                    C000200d.A13("EncryptedBackupProtocolHelper/ok_pub was empty id=", str);
                    c1nw2.AJu("ok_pub was empty", 1);
                    return;
                }
                throw null;
            }
        }, 32000L);
    }
}
