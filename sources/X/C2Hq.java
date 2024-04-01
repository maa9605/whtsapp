package X;

/* renamed from: X.2Hq  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Hq {
    public static final byte[][] A00;

    static {
        A00 = r3;
        byte[][] bArr = {new byte[]{87, 65, 77, 3}, new byte[]{87, 65, 77, 4}, new byte[]{87, 65, 77, 5}};
    }

    public static int A00() {
        return A00.length - 1;
    }

    public static byte[] A01(int i) {
        if (i >= 0) {
            byte[][] bArr = A00;
            if (i <= bArr.length - 1) {
                return bArr[i];
            }
        }
        throw new RuntimeException(C000200d.A0D("Invalid version: ", i));
    }
}
