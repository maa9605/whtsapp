package X;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2Hm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48942Hm {
    public int A00;
    public int A01 = 65536;
    public long A02;
    public byte[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C48982Hv A07;
    public final C48932Hl A08;
    public final C006002r A09;

    public C48942Hm(RandomAccessFile randomAccessFile, C48932Hl c48932Hl, int i, int i2, int i3, C006002r c006002r) {
        int i4 = 65536;
        this.A08 = c48932Hl;
        this.A06 = i;
        this.A05 = i2;
        this.A03 = C2Hq.A01(i);
        this.A04 = i3;
        this.A09 = c006002r;
        this.A07 = new C48982Hv(randomAccessFile, 0, 65536, c006002r);
        if (i3 != 0) {
            i4 = 32768;
            if (i3 == 1) {
                i4 = 16384;
            }
        }
        this.A00 = i4;
    }

    public static int A00(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return byteBuffer.getInt();
    }

    public static long A01(ByteBuffer byteBuffer) {
        long A00 = A00(byteBuffer);
        return 0 > A00 ? A00 + 4294967296L : A00;
    }

    public void A02() {
        int i = this.A06;
        A05(i, i == 0 ? 2 : this.A08.A05.length);
        this.A07.A01();
    }

    public void A03() {
        this.A03 = C2Hq.A01(this.A06);
        int i = 65536;
        this.A01 = 65536;
        this.A02 = 0L;
        C48982Hv c48982Hv = this.A07;
        c48982Hv.A05.clear();
        c48982Hv.A01 = 0;
        c48982Hv.A06.reset();
        c48982Hv.A00 = 0;
        int i2 = this.A04;
        if (i2 != 0) {
            i = 32768;
            if (i2 == 1) {
                i = 16384;
            }
        }
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0223, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Invalid value: ");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0239, code lost:
        throw new java.lang.RuntimeException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(int r16) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48942Hm.A04(int):void");
    }

    public final void A05(int i, int i2) {
        C48972Hu c48972Hu;
        C48982Hv c48982Hv = this.A07;
        ByteBuffer byteBuffer = c48982Hv.A05;
        byteBuffer.clear();
        c48982Hv.A01 = 0;
        c48982Hv.A06.reset();
        c48982Hv.A00 = 0;
        byteBuffer.put(C2Hq.A01(i));
        if (i != 0) {
            byteBuffer.putInt(i2);
        }
        byteBuffer.putInt(this.A01);
        byteBuffer.putInt(this.A00);
        C48932Hl c48932Hl = this.A08;
        byteBuffer.putInt(c48932Hl.A01);
        if (i >= 2) {
            byteBuffer.putInt(c48932Hl.A00);
            byteBuffer.put(c48932Hl.A04 ? (byte) 1 : (byte) 0);
            c48982Hv.A03(c48932Hl.A03);
            byteBuffer.putInt(c48932Hl.A02);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C48972Hu[] c48972HuArr = c48932Hl.A05;
            if (i3 < c48972HuArr.length) {
                c48972Hu = c48972HuArr[i3];
            } else {
                c48972Hu = new C48972Hu(this.A04);
            }
            byteBuffer.putInt(c48972Hu.A01);
            c48982Hv.A03(c48972Hu.A04);
            if (i >= 2) {
                byteBuffer.putInt(c48972Hu.A02);
                byteBuffer.putInt(c48972Hu.A00);
            }
            c48982Hv.A03(c48972Hu.A03);
        }
        long A00 = c48982Hv.A00();
        this.A02 = A00;
        c48982Hv.A03(A00);
    }
}
