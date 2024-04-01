package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3fY */
/* loaded from: classes2.dex */
public class C75793fY {
    public final int A00;
    public final AbstractC75763fV A01;
    public final byte[] A02;
    public static final byte[] A04 = {1};
    public static final byte[] A03 = {2};

    public C75793fY(AbstractC75763fV abstractC75763fV, byte[] bArr, int i) {
        this.A01 = abstractC75763fV;
        this.A02 = bArr;
        this.A00 = i;
    }

    public C75793fY A00() {
        return new C75793fY(this.A01, A02(A03), this.A00 + 1);
    }

    public C75803fZ A01() {
        C75743fT c75743fT = new C75743fT(this.A01.A01(A02(A04), new byte[32], "WhisperMessageKeys".getBytes(), 80));
        return new C75803fZ(c75743fT.A01, c75743fT.A02, c75743fT.A00, this.A00);
    }

    public final byte[] A02(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(this.A02, "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
