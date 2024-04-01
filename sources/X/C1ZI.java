package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: X.1ZI  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZI implements InterfaceC21420zJ {
    public int A04;
    public long A06;
    public long A07;
    public C21580zZ A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;

    @Override // X.InterfaceC21420zJ
    public int ABj() {
        return 2;
    }

    public C1ZI() {
        ByteBuffer byteBuffer = InterfaceC21420zJ.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
        this.A04 = -1;
    }

    @Override // X.InterfaceC21420zJ
    public boolean A6P(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.A04;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.A05 == i && this.A02 == i2 && this.A03 == i4) {
                return false;
            }
            this.A05 = i;
            this.A02 = i2;
            this.A03 = i4;
            this.A08 = null;
            return true;
        }
        throw new C21410zI(i, i2, i3);
    }

    @Override // X.InterfaceC21420zJ
    public ByteBuffer ABh() {
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = InterfaceC21420zJ.A00;
        return byteBuffer;
    }

    @Override // X.InterfaceC21420zJ
    public int ABi() {
        return this.A02;
    }

    @Override // X.InterfaceC21420zJ
    public int ABk() {
        return this.A03;
    }

    @Override // X.InterfaceC21420zJ
    public boolean AF4() {
        int i = this.A05;
        if (i != -1) {
            return Math.abs(this.A01 - 1.0f) >= 0.01f || Math.abs(this.A00 - 1.0f) >= 0.01f || this.A03 != i;
        }
        return false;
    }

    @Override // X.InterfaceC21420zJ
    public boolean AFE() {
        if (this.A0C) {
            C21580zZ c21580zZ = this.A08;
            return c21580zZ == null || c21580zZ.A05 == 0;
        }
        return false;
    }

    @Override // X.InterfaceC21420zJ
    public void AR0() {
        int i;
        C21580zZ c21580zZ = this.A08;
        C002701i.A1K(c21580zZ != null);
        int i2 = c21580zZ.A00;
        float f = c21580zZ.A0F;
        float f2 = c21580zZ.A0D;
        int i3 = c21580zZ.A05 + ((int) ((((i2 / (f / f2)) + c21580zZ.A06) / (c21580zZ.A0E * f2)) + 0.5f));
        short[] A04 = c21580zZ.A04(c21580zZ.A0A, i2, (c21580zZ.A0J << 1) + i2);
        c21580zZ.A0A = A04;
        int i4 = 0;
        while (true) {
            i = c21580zZ.A0J << 1;
            int i5 = c21580zZ.A0G;
            if (i4 >= i * i5) {
                break;
            }
            A04[(i5 * i2) + i4] = 0;
            i4++;
        }
        c21580zZ.A00 = i + c21580zZ.A00;
        c21580zZ.A01();
        if (c21580zZ.A05 > i3) {
            c21580zZ.A05 = i3;
        }
        c21580zZ.A00 = 0;
        c21580zZ.A09 = 0;
        c21580zZ.A06 = 0;
        this.A0C = true;
    }

    @Override // X.InterfaceC21420zJ
    public void AR1(ByteBuffer byteBuffer) {
        C002701i.A1K(this.A08 != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A06 += remaining;
            C21580zZ c21580zZ = this.A08;
            if (c21580zZ != null) {
                int remaining2 = asShortBuffer.remaining();
                int i = c21580zZ.A0G;
                int i2 = remaining2 / i;
                short[] A04 = c21580zZ.A04(c21580zZ.A0A, c21580zZ.A00, i2);
                c21580zZ.A0A = A04;
                asShortBuffer.get(A04, c21580zZ.A00 * i, ((i * i2) << 1) >> 1);
                c21580zZ.A00 += i2;
                c21580zZ.A01();
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                throw null;
            }
        }
        int i3 = (this.A08.A05 * this.A02) << 1;
        if (i3 > 0) {
            if (this.A09.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.A09 = order;
                this.A0B = order.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            C21580zZ c21580zZ2 = this.A08;
            ShortBuffer shortBuffer = this.A0B;
            if (c21580zZ2 != null) {
                int remaining3 = shortBuffer.remaining();
                int i4 = c21580zZ2.A0G;
                int min = Math.min(remaining3 / i4, c21580zZ2.A05);
                shortBuffer.put(c21580zZ2.A0B, 0, i4 * min);
                int i5 = c21580zZ2.A05 - min;
                c21580zZ2.A05 = i5;
                short[] sArr = c21580zZ2.A0B;
                System.arraycopy(sArr, min * i4, sArr, 0, i5 * i4);
                this.A07 += i3;
                this.A09.limit(i3);
                this.A0A = this.A09;
                return;
            }
            throw null;
        }
    }

    @Override // X.InterfaceC21420zJ
    public void flush() {
        if (AF4()) {
            C21580zZ c21580zZ = this.A08;
            if (c21580zZ == null) {
                this.A08 = new C21580zZ(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                c21580zZ.A00 = 0;
                c21580zZ.A05 = 0;
                c21580zZ.A06 = 0;
                c21580zZ.A04 = 0;
                c21580zZ.A03 = 0;
                c21580zZ.A09 = 0;
                c21580zZ.A08 = 0;
                c21580zZ.A07 = 0;
                c21580zZ.A02 = 0;
                c21580zZ.A01 = 0;
            }
        }
        this.A0A = InterfaceC21420zJ.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // X.InterfaceC21420zJ
    public void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        ByteBuffer byteBuffer = InterfaceC21420zJ.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
