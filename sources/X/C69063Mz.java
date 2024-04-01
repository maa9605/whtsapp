package X;

import java.util.Arrays;

/* renamed from: X.3Mz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C69063Mz {
    public byte A00;
    public short A01;
    public byte[] A02;

    public C69063Mz(byte[] bArr) {
        int length;
        int length2 = bArr.length - 1;
        while (true) {
            byte b = bArr[length2];
            if (b != 0) {
                this.A01 = (short) ((length - length2) - 1);
                this.A00 = b;
                this.A02 = Arrays.copyOfRange(bArr, 0, length2);
                return;
            }
            length2--;
        }
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("WtTlsInnerPlainText{content= [");
        byte[] bArr = this.A02;
        A0P.append(bArr.length);
        A0P.append("] ");
        A0P.append(C40841sx.A0U(bArr));
        A0P.append(", contentType=");
        A0P.append((int) this.A00);
        A0P.append(", zeros=");
        A0P.append((int) this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
