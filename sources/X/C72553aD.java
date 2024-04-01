package X;

/* renamed from: X.3aD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C72553aD {
    public int A00;
    public byte[] A01 = new byte[200];

    public boolean A00(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return true;
            }
            int i2 = (this.A00 - i) - 1;
            if (i2 < 0) {
                i2 += this.A01.length;
            }
            if (this.A01[i2] != bArr[(length - i) - 1]) {
                return false;
            }
            i++;
        }
    }
}
