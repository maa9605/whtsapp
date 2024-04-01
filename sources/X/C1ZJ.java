package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1ZJ  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZJ implements InterfaceC21420zJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public ByteBuffer A08;
    public ByteBuffer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public byte[] A0D;

    @Override // X.InterfaceC21420zJ
    public int ABj() {
        return 2;
    }

    public C1ZJ() {
        ByteBuffer byteBuffer = InterfaceC21420zJ.A00;
        this.A08 = byteBuffer;
        this.A09 = byteBuffer;
        this.A01 = -1;
        this.A04 = -1;
        this.A0D = C08M.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r3 != 0) goto L15;
     */
    @Override // X.InterfaceC21420zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A6P(int r6, int r7, int r8) {
        /*
            r5 = this;
            r4 = 2
            if (r8 != r4) goto L3a
            int r1 = r5.A02
            if (r1 <= 0) goto L10
            long r2 = r5.A07
            int r0 = r5.A00
            int r1 = r1 / r0
            long r0 = (long) r1
            long r2 = r2 + r0
            r5.A07 = r2
        L10:
            r5.A01 = r7
            r5.A04 = r6
            int r1 = X.C08M.A00(r4, r7)
            r5.A00 = r1
            int r3 = r5.A05
            int r0 = r3 * r1
            byte[] r0 = new byte[r0]
            r5.A0D = r0
            r2 = 0
            r5.A02 = r2
            int r0 = r5.A06
            int r1 = r1 * r0
            r5.A03 = r1
            boolean r1 = r5.A0B
            if (r0 != 0) goto L31
            r0 = 0
            if (r3 == 0) goto L32
        L31:
            r0 = 1
        L32:
            r5.A0B = r0
            r5.A0C = r2
            if (r1 == r0) goto L39
            r2 = 1
        L39:
            return r2
        L3a:
            X.0zI r0 = new X.0zI
            r0.<init>(r6, r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ZJ.A6P(int, int, int):boolean");
    }

    @Override // X.InterfaceC21420zJ
    public ByteBuffer ABh() {
        ByteBuffer byteBuffer = this.A09;
        if (this.A0A && this.A02 > 0 && byteBuffer == InterfaceC21420zJ.A00) {
            int capacity = this.A08.capacity();
            int i = this.A02;
            if (capacity < i) {
                this.A08 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.A08.clear();
            }
            this.A08.put(this.A0D, 0, this.A02);
            this.A02 = 0;
            this.A08.flip();
            byteBuffer = this.A08;
        }
        this.A09 = InterfaceC21420zJ.A00;
        return byteBuffer;
    }

    @Override // X.InterfaceC21420zJ
    public int ABi() {
        return this.A01;
    }

    @Override // X.InterfaceC21420zJ
    public int ABk() {
        return this.A04;
    }

    @Override // X.InterfaceC21420zJ
    public boolean AF4() {
        return this.A0B;
    }

    @Override // X.InterfaceC21420zJ
    public boolean AFE() {
        return this.A0A && this.A02 == 0 && this.A09 == InterfaceC21420zJ.A00;
    }

    @Override // X.InterfaceC21420zJ
    public void AR0() {
        this.A0A = true;
    }

    @Override // X.InterfaceC21420zJ
    public void AR1(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        this.A0C = true;
        int i2 = this.A03;
        int min = Math.min(i, i2);
        this.A07 += min / this.A00;
        this.A03 = i2 - min;
        byteBuffer.position(position + min);
        if (this.A03 > 0) {
            return;
        }
        int i3 = i - min;
        int length = (this.A02 + i3) - this.A0D.length;
        if (this.A08.capacity() < length) {
            this.A08 = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.A08.clear();
        }
        int max = Math.max(0, Math.min(length, this.A02));
        this.A08.put(this.A0D, 0, max);
        int max2 = Math.max(0, Math.min(length - max, i3));
        byteBuffer.limit(byteBuffer.position() + max2);
        this.A08.put(byteBuffer);
        byteBuffer.limit(limit);
        int i4 = i3 - max2;
        int i5 = this.A02 - max;
        this.A02 = i5;
        byte[] bArr = this.A0D;
        System.arraycopy(bArr, max, bArr, 0, i5);
        byteBuffer.get(this.A0D, this.A02, i4);
        this.A02 += i4;
        this.A08.flip();
        this.A09 = this.A08;
    }

    @Override // X.InterfaceC21420zJ
    public void flush() {
        this.A09 = InterfaceC21420zJ.A00;
        this.A0A = false;
        if (this.A0C) {
            this.A03 = 0;
        }
        this.A02 = 0;
    }

    @Override // X.InterfaceC21420zJ
    public void reset() {
        flush();
        this.A08 = InterfaceC21420zJ.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A0D = C08M.A05;
    }
}
