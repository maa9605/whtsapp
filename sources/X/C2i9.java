package X;

/* renamed from: X.2i9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2i9 {
    public long A00;
    public C466927v A01;
    public byte[] A02;
    public final C54132iA A03;
    public static final byte[] A05 = {78, 111, 105, 115, 101, 95, 88, 88, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public static final byte[] A06 = {78, 111, 105, 115, 101, 95, 73, 75, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public static final byte[] A04 = {78, 111, 105, 115, 101, 95, 88, 88, 102, 97, 108, 108, 98, 97, 99, 107, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54};

    public C2i9(byte[] bArr, byte[] bArr2) {
        C54132iA c54132iA = new C54132iA(bArr);
        this.A03 = c54132iA;
        this.A02 = c54132iA.A00;
        c54132iA.A00(bArr2);
    }

    public void A00(byte[] bArr) {
        byte[][] A1k = AnonymousClass029.A1k(C002701i.A1Z(bArr, this.A02, null, 64));
        this.A02 = A1k[0];
        this.A01 = new C466927v(A1k[1]);
        this.A00 = 0L;
    }

    public byte[] A01(byte[] bArr) {
        byte[] bArr2;
        C466927v c466927v = this.A01;
        if (c466927v != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = c466927v.A01(j, this.A03.A00, bArr);
        } else {
            bArr2 = bArr;
        }
        this.A03.A00(bArr);
        return bArr2;
    }

    public byte[] A02(byte[] bArr) {
        byte[] bArr2 = bArr;
        C466927v c466927v = this.A01;
        if (c466927v != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = c466927v.A02(j, this.A03.A00, bArr2, bArr.length);
        }
        this.A03.A00(bArr2);
        return bArr2;
    }
}
