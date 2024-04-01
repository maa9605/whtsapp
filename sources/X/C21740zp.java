package X;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: X.0zp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21740zp {
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC06380Sv A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C21740zp(InterfaceC06380Sv interfaceC06380Sv, long j, long j2) {
        this.A05 = interfaceC06380Sv;
        this.A02 = j;
        this.A04 = j2;
    }

    public final int A00(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedException();
    }

    public void A01(int i) {
        int min = Math.min(this.A00, i);
        A02(min);
        while (min < i) {
            if (min != -1) {
                byte[] bArr = this.A06;
                min = A00(bArr, -min, Math.min(i, bArr.length + min), min, false);
            } else {
                return;
            }
        }
        if (min != -1) {
            this.A02 += min;
        }
    }

    public final void A02(int i) {
        int i2 = this.A00 - i;
        this.A00 = i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[65536 + i2];
        }
        System.arraycopy(bArr, i, bArr, 0, i2);
        this.A03 = bArr;
    }

    public void A03(byte[] bArr, int i, int i2) {
        if (A04(i2)) {
            System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        }
    }

    public boolean A04(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        int length = bArr.length;
        if (i2 > length) {
            this.A03 = Arrays.copyOf(bArr, Math.max(65536 + i2, Math.min(length << 1, i2 + 524288)));
        }
        int i3 = this.A00;
        int i4 = this.A01;
        int i5 = i3 - i4;
        while (i5 < i) {
            i5 = A00(this.A03, i4, i, i5, false);
            if (i5 == -1) {
                return false;
            }
            i4 = this.A01;
            this.A00 = i4 + i5;
        }
        this.A01 = i4 + i;
        return true;
    }

    public boolean A05(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.A00;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.A03, 0, bArr, i, min);
            A02(min);
        }
        while (min < i2) {
            if (min == -1) {
                return false;
            }
            min = A00(bArr, i, i2, min, z);
        }
        if (min != -1) {
            this.A02 += min;
        }
        return min != -1;
    }
}
