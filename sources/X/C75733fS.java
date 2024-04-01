package X;

/* renamed from: X.3fS */
/* loaded from: classes2.dex */
public class C75733fS {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public C75733fS(int i, byte[] bArr) {
        byte[][] A02 = C75823fb.A02(new C85523vl().A01(bArr, new byte[32], "WhisperGroup".getBytes(), 48), 16, 32);
        this.A00 = i;
        this.A03 = bArr;
        this.A02 = A02[0];
        this.A01 = A02[1];
    }
}
