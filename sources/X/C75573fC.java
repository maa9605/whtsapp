package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.3fC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75573fC {
    public static void A00(byte[] bArr, byte[] bArr2, long j) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(bArr2, 0, (int) j);
            byte[] digest = messageDigest.digest();
            System.arraycopy(digest, 0, bArr, 0, digest.length);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
