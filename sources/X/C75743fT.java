package X;

import java.text.ParseException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3fT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75743fT {
    public final IvParameterSpec A00;
    public final SecretKeySpec A01;
    public final SecretKeySpec A02;

    public C75743fT(byte[] bArr) {
        try {
            byte[][] A03 = C75823fb.A03(bArr, 32, 32, 16);
            this.A01 = new SecretKeySpec(A03[0], "AES");
            this.A02 = new SecretKeySpec(A03[1], "HmacSHA256");
            this.A00 = new IvParameterSpec(A03[2]);
        } catch (ParseException e) {
            throw new AssertionError(e);
        }
    }
}
