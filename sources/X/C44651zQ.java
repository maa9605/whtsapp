package X;

import java.util.Arrays;

/* renamed from: X.1zQ */
/* loaded from: classes2.dex */
public class C44651zQ {
    public final byte[] A00;

    public C44651zQ(int i, int i2) {
        if (i == 0 && i2 == 0) {
            this.A00 = new byte[0];
            return;
        }
        this.A00 = r3;
        byte[] bArr = {(byte) (i >> 8), (byte) i, (byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2};
    }

    public C44651zQ(byte[] bArr) {
        this.A00 = bArr;
    }

    public static C44651zQ A00(C87483zj c87483zj) {
        if ((c87483zj.A00 & 1) == 1) {
            return new C44651zQ(c87483zj.A01.A06());
        }
        return null;
    }

    public int A01() {
        byte[] bArr = this.A00;
        if (bArr.length == 0) {
            return 0;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public int A02() {
        byte[] bArr = this.A00;
        if (bArr.length == 0) {
            return 0;
        }
        return (bArr[5] & 255) | ((bArr[2] & 255) << 24) | ((bArr[3] & 255) << 16) | ((bArr[4] & 255) << 8);
    }

    public C87483zj A03() {
        C0CT AVX = C87483zj.A02.AVX();
        C0AN A00 = C0AN.A00(this.A00);
        AVX.A02();
        C87483zj c87483zj = (C87483zj) AVX.A00;
        c87483zj.A00 |= 1;
        c87483zj.A01 = A00;
        return (C87483zj) AVX.A01();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44651zQ) {
            return Arrays.equals(this.A00, ((C44651zQ) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncdKeyId{deviceId=");
        A0P.append(A01());
        A0P.append(", epoch=");
        A0P.append(A02());
        A0P.append("}");
        return A0P.toString();
    }
}
