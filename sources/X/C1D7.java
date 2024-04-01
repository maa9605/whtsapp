package X;

/* renamed from: X.1D7  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1D7 {
    public final int A00;
    public final int A01;

    public abstract byte[] A00();

    public abstract byte[] A01(int i, byte[] bArr);

    public C1D7(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final String toString() {
        char c;
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = A01(i3, bArr);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                if (i5 < 64) {
                    c = '#';
                } else if (i5 < 128) {
                    c = '+';
                } else {
                    c = ' ';
                    if (i5 < 192) {
                        c = '.';
                    }
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
