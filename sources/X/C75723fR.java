package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3fR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75723fR {
    public final int A00;
    public final byte[] A01;
    public static final byte[] A03 = {1};
    public static final byte[] A02 = {2};

    public C75723fR(int i, byte[] bArr) {
        this.A00 = i;
        this.A01 = bArr;
    }

    public static final byte[] A00(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public C75723fR A01() {
        return new C75723fR(this.A00 + 1, A00(A02, this.A01));
    }

    public C75733fS A02() {
        return new C75733fS(this.A00, A00(A03, this.A01));
    }
}
