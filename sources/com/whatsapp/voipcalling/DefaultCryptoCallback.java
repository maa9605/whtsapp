package com.whatsapp.voipcalling;

import X.C002701i;
import X.C02L;
import com.whatsapp.jid.UserJid;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class DefaultCryptoCallback implements CryptoCallback {
    public static final int E2E_CALL_KEY_LENGTH = 32;
    public static final int E2E_EXTENDED_V2_KEY_LENGTH = 46;
    public static final int SECURE_SSRC_LENGTH = 4;
    public final C02L meManager;
    public final SecureRandom secureRandom = new SecureRandom();

    public DefaultCryptoCallback(C02L c02l) {
        this.meManager = c02l;
    }

    private byte[] expandCallKey(byte[] bArr, String str) {
        if (bArr.length == 32) {
            if (str == null) {
                C02L c02l = this.meManager;
                c02l.A05();
                UserJid userJid = c02l.A03;
                if (userJid == null) {
                    throw null;
                }
                str = userJid.getRawString();
            }
            byte[] A1Y = C002701i.A1Y(bArr, str.getBytes(), 46);
            if (A1Y.length == 46) {
                return A1Y;
            }
            throw new IllegalStateException("split byte counts do not match");
        }
        throw new IllegalArgumentException("callKey should be 32 bytes");
    }

    @Override // com.whatsapp.voipcalling.CryptoCallback
    public boolean generateE2EKeysV2(byte[] bArr, byte[] bArr2, String str) {
        if (bArr == null || bArr2 == null || bArr.length != 32 || bArr2.length != 46) {
            return false;
        }
        System.arraycopy(expandCallKey(bArr, str), 0, bArr2, 0, 46);
        return true;
    }

    @Override // com.whatsapp.voipcalling.CryptoCallback
    public boolean generateRandomBytes(byte[] bArr) {
        this.secureRandom.nextBytes(bArr);
        return true;
    }

    public static byte[] generateSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] A1Z = C002701i.A1Z(bArr, bArr3, bArr2, 4);
        if (A1Z.length == 4) {
            return A1Z;
        }
        throw new IllegalStateException("split byte counts do not match");
    }

    @Override // com.whatsapp.voipcalling.CryptoCallback
    public boolean getSecureSsrc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null || bArr2 == null || bArr3 == null || bArr4 == null || bArr.length == 0 || bArr2.length == 0 || bArr3.length != 4) {
            return false;
        }
        System.arraycopy(generateSecureSsrc(bArr, bArr2, bArr3), 0, bArr4, 0, 4);
        return true;
    }
}
