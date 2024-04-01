package com.facebook.msys.mci;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class DefaultCrypto implements Crypto {
    public static final Crypto mCrypto = new DefaultCrypto();

    @Override // com.facebook.msys.mci.Crypto
    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString().getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    public static Crypto get() {
        return mCrypto;
    }
}