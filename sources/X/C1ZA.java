package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: X.1ZA  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZA implements InterfaceC21420zJ {
    public int A00;
    public int A01;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;

    @Override // X.InterfaceC21420zJ
    public int ABj() {
        return 2;
    }

    public C1ZA() {
        ByteBuffer byteBuffer = InterfaceC21420zJ.A00;
        this.A02 = byteBuffer;
        this.A03 = byteBuffer;
        this.A00 = -1;
        this.A01 = -1;
    }

    @Override // X.InterfaceC21420zJ
    public boolean A6P(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.A07, this.A06);
        int[] iArr = this.A07;
        this.A06 = iArr;
        if (iArr == null) {
            this.A04 = false;
            return z;
        } else if (i3 == 2) {
            if (!z && this.A01 == i && this.A00 == i2) {
                return false;
            }
            this.A01 = i;
            this.A00 = i2;
            int length = iArr.length;
            boolean z2 = i2 != length;
            this.A04 = z2;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = iArr[i4];
                if (i5 < i2) {
                    boolean z3 = false;
                    if (i5 != i4) {
                        z3 = true;
                    }
                    boolean z4 = z3 | z2;
                    this.A04 = z4;
                    z2 = z4;
                } else {
                    throw new C21410zI(i, i2, i3);
                }
            }
            return true;
        } else {
            throw new C21410zI(i, i2, i3);
        }
    }

    @Override // X.InterfaceC21420zJ
    public ByteBuffer ABh() {
        ByteBuffer byteBuffer = this.A03;
        this.A03 = InterfaceC21420zJ.A00;
        return byteBuffer;
    }

    @Override // X.InterfaceC21420zJ
    public int ABi() {
        int[] iArr = this.A06;
        return iArr == null ? this.A00 : iArr.length;
    }

    @Override // X.InterfaceC21420zJ
    public int ABk() {
        return this.A01;
    }

    @Override // X.InterfaceC21420zJ
    public boolean AF4() {
        return this.A04;
    }

    @Override // X.InterfaceC21420zJ
    public boolean AFE() {
        return this.A05 && this.A03 == InterfaceC21420zJ.A00;
    }

    @Override // X.InterfaceC21420zJ
    public void AR0() {
        this.A05 = true;
    }

    @Override // X.InterfaceC21420zJ
    public void AR1(ByteBuffer byteBuffer) {
        C002701i.A1K(this.A06 != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.A00 << 1)) * this.A06.length) << 1;
        if (this.A02.capacity() < length) {
            this.A02 = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        while (position < limit) {
            for (int i : this.A06) {
                this.A02.putShort(byteBuffer.getShort((i << 1) + position));
            }
            position += this.A00 << 1;
        }
        byteBuffer.position(limit);
        this.A02.flip();
        this.A03 = this.A02;
    }

    @Override // X.InterfaceC21420zJ
    public void flush() {
        this.A03 = InterfaceC21420zJ.A00;
        this.A05 = false;
    }

    @Override // X.InterfaceC21420zJ
    public void reset() {
        flush();
        this.A02 = InterfaceC21420zJ.A00;
        this.A00 = -1;
        this.A01 = -1;
        this.A06 = null;
        this.A07 = null;
        this.A04 = false;
    }
}
