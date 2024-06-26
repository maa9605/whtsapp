package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1ZH  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZH implements InterfaceC21420zJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public ByteBuffer A07;
    public ByteBuffer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public byte[] A0C;
    public byte[] A0D;

    @Override // X.InterfaceC21420zJ
    public int ABj() {
        return 2;
    }

    public C1ZH() {
        ByteBuffer byteBuffer = InterfaceC21420zJ.A00;
        this.A07 = byteBuffer;
        this.A08 = byteBuffer;
        this.A01 = -1;
        this.A04 = -1;
        byte[] bArr = C08M.A05;
        this.A0C = bArr;
        this.A0D = bArr;
    }

    public final int A00(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.A00;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void A01(int i) {
        if (this.A07.capacity() < i) {
            this.A07 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A07.clear();
        }
        if (i > 0) {
            this.A0A = true;
        }
    }

    public final void A02(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        int i2 = this.A03;
        int min = Math.min(remaining, i2);
        int i3 = i2 - min;
        System.arraycopy(bArr, i - i3, this.A0D, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.A0D, i3, min);
    }

    public final void A03(byte[] bArr, int i) {
        A01(i);
        this.A07.put(bArr, 0, i);
        this.A07.flip();
        this.A08 = this.A07;
    }

    @Override // X.InterfaceC21420zJ
    public boolean A6P(int i, int i2, int i3) {
        if (i3 == 2) {
            if (this.A04 == i && this.A01 == i2) {
                return false;
            }
            this.A04 = i;
            this.A01 = i2;
            this.A00 = i2 << 1;
            return true;
        }
        throw new C21410zI(i, i2, i3);
    }

    @Override // X.InterfaceC21420zJ
    public ByteBuffer ABh() {
        ByteBuffer byteBuffer = this.A08;
        this.A08 = InterfaceC21420zJ.A00;
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
        return this.A04 != -1 && this.A09;
    }

    @Override // X.InterfaceC21420zJ
    public boolean AFE() {
        return this.A0B && this.A08 == InterfaceC21420zJ.A00;
    }

    @Override // X.InterfaceC21420zJ
    public void AR0() {
        this.A0B = true;
        int i = this.A02;
        if (i > 0) {
            A03(this.A0C, i);
        }
        if (this.A0A) {
            return;
        }
        this.A06 += this.A03 / this.A00;
    }

    @Override // X.InterfaceC21420zJ
    public void AR1(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.A08.hasRemaining()) {
            int i = this.A05;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.A0C.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                            int i2 = this.A00;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                        limit2 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.A05 = 1;
                } else {
                    byteBuffer.limit(position);
                    A01(byteBuffer.remaining());
                    this.A07.put(byteBuffer);
                    this.A07.flip();
                    this.A08 = this.A07;
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int A00 = A00(byteBuffer);
                int position2 = A00 - byteBuffer.position();
                byte[] bArr = this.A0C;
                int length = bArr.length;
                int i3 = this.A02;
                int i4 = length - i3;
                if (A00 < limit3 && position2 < i4) {
                    A03(bArr, i3);
                    this.A02 = 0;
                    this.A05 = 0;
                } else {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.A0C, this.A02, min);
                    int i5 = this.A02 + min;
                    this.A02 = i5;
                    byte[] bArr2 = this.A0C;
                    if (i5 == bArr2.length) {
                        if (this.A0A) {
                            A03(bArr2, this.A03);
                            long j = this.A06;
                            i5 = this.A02;
                            this.A06 = j + ((i5 - (this.A03 << 1)) / this.A00);
                        } else {
                            this.A06 += (i5 - this.A03) / this.A00;
                        }
                        A02(byteBuffer, this.A0C, i5);
                        this.A02 = 0;
                        this.A05 = 2;
                    }
                    byteBuffer.limit(limit3);
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int A002 = A00(byteBuffer);
                byteBuffer.limit(A002);
                this.A06 += byteBuffer.remaining() / this.A00;
                A02(byteBuffer, this.A0D, this.A03);
                if (A002 < limit4) {
                    A03(this.A0D, this.A03);
                    this.A05 = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // X.InterfaceC21420zJ
    public void flush() {
        if (AF4()) {
            long j = this.A04;
            int i = this.A00;
            int i2 = ((int) ((j * 150000) / SearchActionVerificationClientService.MS_TO_NS)) * i;
            if (this.A0C.length != i2) {
                this.A0C = new byte[i2];
            }
            int i3 = ((int) ((j * 20000) / SearchActionVerificationClientService.MS_TO_NS)) * i;
            this.A03 = i3;
            if (this.A0D.length != i3) {
                this.A0D = new byte[i3];
            }
        }
        this.A05 = 0;
        this.A08 = InterfaceC21420zJ.A00;
        this.A0B = false;
        this.A06 = 0L;
        this.A02 = 0;
        this.A0A = false;
    }

    @Override // X.InterfaceC21420zJ
    public void reset() {
        this.A09 = false;
        flush();
        this.A07 = InterfaceC21420zJ.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A03 = 0;
        byte[] bArr = C08M.A05;
        this.A0C = bArr;
        this.A0D = bArr;
    }
}
