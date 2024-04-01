package X;

/* renamed from: X.2i8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2i8 implements InterfaceC54072i2 {
    public InterfaceC54072i2 A00;
    public byte[] A01;

    public C2i8(InterfaceC54072i2 interfaceC54072i2, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.A01 = bArr2;
        this.A00 = interfaceC54072i2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public C2i8(InterfaceC54072i2 interfaceC54072i2, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A01 = bArr2;
        this.A00 = interfaceC54072i2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
