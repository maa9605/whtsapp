package X;

import java.nio.charset.Charset;
import java.text.ParseException;

/* renamed from: X.24I */
/* loaded from: classes2.dex */
public class C24I {
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;
    public static final int[] A06 = {32, 32, 32, 32, 32};
    public static final Charset A05 = Charset.forName("UTF-8");

    public C24I(C44981zy c44981zy) {
        int[] iArr = A06;
        int length = iArr.length;
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        byte[] A1Y = C002701i.A1Y(c44981zy.A02, "WhatsApp Mutation Keys".getBytes(A05), i);
        try {
            if (A1Y != null) {
                int i3 = 0;
                for (int i4 : iArr) {
                    if (i4 < 0) {
                        throw new ParseException(C000200d.A0D("Invalid length: ", i4), 0);
                    }
                    i3 += i4;
                }
                if (A1Y.length >= i3) {
                    byte[][] bArr = new byte[length];
                    int i5 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        int i7 = iArr[i6];
                        bArr[i6] = new byte[i7];
                        System.arraycopy(A1Y, i5, bArr[i6], 0, i7);
                        i5 += i7;
                    }
                    this.A00 = bArr[0];
                    this.A03 = bArr[1];
                    this.A04 = bArr[2];
                    this.A02 = bArr[3];
                    this.A01 = bArr[4];
                    return;
                }
                StringBuilder A0P = C000200d.A0P("Input too small: ");
                A0P.append(C40771sq.A00(A1Y));
                throw new ParseException(A0P.toString(), 0);
            }
            throw new ParseException("Null input", 0);
        } catch (ParseException e) {
            throw new AbstractC44931zt(e) { // from class: X.24i
            };
        }
    }
}
