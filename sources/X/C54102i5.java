package X;

/* renamed from: X.2i5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54102i5 implements InterfaceC54072i2 {
    public byte[] A00;

    public C54102i5(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public C54102i5(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }
}
