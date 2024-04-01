package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.2iA  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54132iA {
    public byte[] A00;

    public C54132iA(byte[] bArr) {
        try {
            if (bArr.length <= 32) {
                this.A00 = bArr;
            } else {
                this.A00 = MessageDigest.getInstance("SHA-256").digest(bArr);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public void A00(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(this.A00);
            this.A00 = messageDigest.digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
