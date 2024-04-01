package X;

import java.net.DatagramPacket;

/* renamed from: X.3eU */
/* loaded from: classes2.dex */
public class C75183eU {
    public final byte[] A00 = new byte[48];
    public volatile DatagramPacket A01;

    public final int A00(int i) {
        byte[] bArr = this.A00;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final C75203eW A01(int i) {
        byte[] bArr = this.A00;
        return new C75203eW(((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i + 7] & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75183eU.toString():java.lang.String");
    }
}
