package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3fQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75713fQ {
    public final int A00;
    public final byte[][] A01;

    public C75713fQ(int i, byte[][] bArr) {
        int length = bArr.length;
        if (length != 0 && 32 % length == 0) {
            A00(i, bArr);
            this.A00 = i;
            this.A01 = bArr;
            return;
        }
        StringBuilder A0P = C000200d.A0P("Invalid number of chain keys: ");
        A0P.append(length);
        throw new IllegalArgumentException(A0P.toString());
    }

    public C75713fQ(List list) {
        int i;
        if (!list.isEmpty() && 32 % list.size() == 0) {
            int size = list.size();
            int[] iArr = new int[size];
            this.A01 = new byte[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = ((C881041t) list.get(i2)).A01;
                this.A01[i2] = ((C881041t) list.get(i2)).A02.A06();
            }
            int[] iArr2 = new int[size];
            int i3 = 0;
            while (true) {
                i = size - 1;
                if (i3 >= i) {
                    break;
                }
                iArr2[i3] = iArr[i3] - 1;
                i3++;
            }
            iArr2[i] = iArr[i];
            int i4 = 32 / size;
            int i5 = (int) ((1 << i4) - 1);
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                i6 += (iArr2[(size - i7) - 1] & i5) << (i4 * i7);
            }
            this.A00 = i6;
            A00(i6, this.A01);
            return;
        }
        StringBuilder A0P = C000200d.A0P("Invalid number of chain keys: ");
        A0P.append(list.size());
        throw new IllegalArgumentException(A0P.toString());
    }

    public C75713fQ(byte[] bArr) {
        int i = 1 << 3;
        this.A00 = 0;
        byte[][] bArr2 = new byte[i];
        this.A01 = bArr2;
        bArr2[0] = bArr;
        for (int i2 = 1; i2 < i; i2++) {
            bArr2[i2] = new byte[0];
        }
    }

    public static void A00(int i, byte[][] bArr) {
        int length;
        if (i == 0 && (length = bArr.length) > 1) {
            if (bArr[1].length == 0) {
                for (int i2 = 2; i2 < length; i2++) {
                    if (bArr[i2].length > 0) {
                        throw new IllegalArgumentException("Invalid chain key values for starting iteration");
                    }
                }
                return;
            }
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length == 0) {
                throw new IllegalArgumentException("Invalid chain key values");
            }
        }
    }

    public static final byte[] A01(byte b, byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            mac.update(b);
            return mac.doFinal();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public C75713fQ A02(int i) {
        if (i > 0) {
            int i2 = this.A00;
            int i3 = i + i2;
            int length = this.A01.length;
            int[] A01 = C75823fb.A01(i2, length);
            int[] A012 = C75823fb.A01(i3, length);
            byte[][] A04 = A04();
            int i4 = 0;
            while (true) {
                int length2 = A04.length;
                if (i4 >= length2) {
                    return new C75713fQ(i3, A04);
                }
                while (A012[i4] > A01[i4]) {
                    if (i4 < length2 - 1 && A012[i4] - 1 == A01[i4]) {
                        int i5 = i4 + 1;
                        A04[i5] = A01((byte) (i4 + 2 + 1), A04[i4]);
                        A01[i5] = 0;
                    }
                    A04[i4] = A01((byte) (i4 + 2), A04[i4]);
                    A01[i4] = A01[i4] + 1;
                }
                i4++;
            }
        } else {
            throw new IllegalArgumentException(C000200d.A0D("count must be a positive number: ", i));
        }
    }

    public C75733fS A03() {
        byte[][] A04 = A04();
        return new C75733fS(this.A00, A01((byte) 1, A04[A04.length - 1]));
    }

    public byte[][] A04() {
        byte[] bArr;
        byte[][] bArr2 = this.A01;
        int length = bArr2.length;
        byte[][] bArr3 = new byte[length];
        if (this.A00 == 0 && length > 1) {
            int i = 0;
            if (bArr2[1].length == 0) {
                while (i < length - 1) {
                    if (i == 0) {
                        bArr = bArr2[0];
                    } else {
                        bArr = bArr3[i];
                    }
                    int i2 = i + 1;
                    int i3 = i + 2;
                    bArr3[i2] = A01((byte) (i3 + 1), bArr);
                    bArr3[i] = A01((byte) i3, bArr);
                    i = i2;
                }
                return bArr3;
            }
        }
        for (int i4 = 0; i4 < length; i4++) {
            bArr3[i4] = new byte[bArr2[i4].length];
            byte[] bArr4 = bArr2[i4];
            System.arraycopy(bArr4, 0, bArr3[i4], 0, bArr4.length);
        }
        return bArr3;
    }
}
