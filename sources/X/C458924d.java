package X;

/* renamed from: X.24d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C458924d {
    public final C44841zk A00;
    public final C44651zQ A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C458924d(C44651zQ c44651zQ, byte[] bArr, C44841zk c44841zk, byte[] bArr2) {
        this.A01 = c44651zQ;
        this.A03 = bArr;
        this.A00 = c44841zk;
        this.A02 = bArr2;
        byte[] bArr3 = new byte[32];
        int length = bArr2.length;
        if (length < 32) {
            System.arraycopy(bArr2, 0, bArr3, 32 - length, length);
        } else {
            System.arraycopy(bArr2, length - 32, bArr3, 0, 32);
        }
        this.A04 = bArr3;
    }
}
