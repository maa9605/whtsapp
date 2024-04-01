package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2Hr */
/* loaded from: classes2.dex */
public class C2Hr {
    public int A01;
    public final C48982Hv A04;
    public final C48932Hl A05;
    public final C006002r A06;
    public int A02 = 0;
    public int A00 = 0;
    public final C006302u A03 = new C006302u();

    public C2Hr(RandomAccessFile randomAccessFile, int i, C48932Hl c48932Hl, int i2, C006002r c006002r) {
        if (i2 == 0) {
            this.A04 = new C48982Hv(randomAccessFile, (i * 65536) + 65536, 65536, c006002r);
        } else if (i2 == 1) {
            this.A04 = new C48982Hv(randomAccessFile, (i << 14) + 65536, 16384, c006002r);
        } else {
            this.A04 = new C48982Hv(randomAccessFile, (i * 32768) + 65536, 32768, c006002r);
        }
        this.A01 = i;
        this.A05 = c48932Hl;
        this.A06 = c006002r;
    }

    public final int A00() {
        if (A0B()) {
            return this.A00;
        }
        throw new UnsupportedOperationException("No event count available for rotated buffers");
    }

    public final int A01() {
        return this.A04.A05.capacity() - C48962Ht.A01(C48962Ht.A00.length - 1).length;
    }

    public final int A02() {
        return this.A04.A05.position();
    }

    public final int A03() {
        return this.A04.A05.remaining();
    }

    public final long A04() {
        return this.A05.A05[this.A01].A04;
    }

    public final C006402v A05(int i) {
        if (A0B()) {
            return this.A03.A00(i);
        }
        throw new UnsupportedOperationException("No attribute value available for rotated buffers");
    }

    public final Iterable A06() {
        if (A0B()) {
            return Collections.unmodifiableCollection(this.A03.A00.keySet());
        }
        throw new UnsupportedOperationException("No attribute codes available for rotated buffers");
    }

    public void A07() {
        C48982Hv c48982Hv = this.A04;
        c48982Hv.A05.clear();
        c48982Hv.A01 = 0;
        c48982Hv.A06.reset();
        c48982Hv.A00 = 0;
        C48972Hu c48972Hu = this.A05.A05[this.A01];
        c48972Hu.A01 = c48982Hv.A01;
        c48972Hu.A04 = 0L;
        c48972Hu.A02 = 1;
        c48972Hu.A00 = 0;
        c48972Hu.A03 = c48982Hv.A00();
        this.A02 = 0;
        this.A00 = 0;
        this.A03.A00.clear();
    }

    public void A08() {
        try {
            C48982Hv c48982Hv = this.A04;
            c48982Hv.A01();
            C48972Hu c48972Hu = this.A05.A05[this.A01];
            c48972Hu.A01 = c48982Hv.A01;
            c48972Hu.A03 = c48982Hv.A00();
        } catch (IOException e) {
            C006002r c006002r = this.A06;
            c006002r.A0F = Boolean.TRUE;
            c006002r.A06();
            Log.e("eventbuffer/flushEventBuffers: cannot write event buffer", e);
            throw e;
        }
    }

    public void A09() {
        try {
            C48982Hv c48982Hv = this.A04;
            C48972Hu[] c48972HuArr = this.A05.A05;
            c48982Hv.A02(c48972HuArr[this.A01].A01);
            ByteBuffer byteBuffer = c48982Hv.A05;
            Log.a(byteBuffer.position() == c48972HuArr[this.A01].A01);
            Log.a(c48982Hv.A01 == c48972HuArr[this.A01].A01);
            int i = (c48982Hv.A00() > c48972HuArr[this.A01].A03 ? 1 : (c48982Hv.A00() == c48972HuArr[this.A01].A03 ? 0 : -1));
            boolean A0B = A0B();
            if (i != 0) {
                if (A0B) {
                    this.A06.A01 = Boolean.TRUE;
                } else {
                    this.A06.A06 = Boolean.TRUE;
                }
                throw new Exception("Invalid checksum") { // from class: X.2Hx
                    {
                        C2Hr.this = this;
                    }
                };
            } else if (A0B) {
                this.A02 = 0;
                this.A00 = 0;
                C006302u c006302u = this.A03;
                c006302u.A00.clear();
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                asReadOnlyBuffer.flip();
                if (asReadOnlyBuffer.limit() != 0) {
                    byte[][] bArr = C48962Ht.A00;
                    int length = bArr.length;
                    int i2 = length - 1;
                    byte[] bArr2 = new byte[C48962Ht.A01(i2).length];
                    try {
                        asReadOnlyBuffer.get(bArr2);
                        for (int i3 = 0; i3 < length; i3++) {
                            if (Arrays.equals(bArr2, bArr[i3])) {
                                if (i3 >= 0 && i3 <= i2) {
                                    if (i3 >= 1) {
                                        asReadOnlyBuffer.get(A0D(i3));
                                    }
                                    while (asReadOnlyBuffer.position() < asReadOnlyBuffer.limit()) {
                                        try {
                                            try {
                                                C2I2 A07 = C0SO.A07(asReadOnlyBuffer);
                                                this.A02++;
                                                int i4 = A07.A01;
                                                if (i4 == 1) {
                                                    this.A00++;
                                                }
                                                if (i4 == 0) {
                                                    c006302u.A01(A07.A00, A07.A02);
                                                }
                                            } catch (BufferUnderflowException unused) {
                                                throw new C2I3("Incomplete buffer");
                                            }
                                        } catch (C2I3 e) {
                                            throw new Exception(e.toString()) { // from class: X.2Hx
                                                {
                                                    C2Hr.this = this;
                                                }
                                            };
                                        }
                                    }
                                    return;
                                }
                                throw new Exception("Invalid event buffer header") { // from class: X.2Hx
                                    {
                                        C2Hr.this = this;
                                    }
                                };
                            }
                        }
                        StringBuilder sb = new StringBuilder("Invalid value: ");
                        sb.append(bArr2);
                        throw new RuntimeException(sb.toString());
                    } catch (BufferUnderflowException unused2) {
                        throw new Exception("Event buffer does not have a header") { // from class: X.2Hx
                            {
                                C2Hr.this = this;
                            }
                        };
                    }
                }
            }
        } catch (IOException e2) {
            throw new Exception(e2.toString()) { // from class: X.2Hx
                {
                    C2Hr.this = this;
                }
            };
        }
    }

    public final void A0A(C0SN c0sn, C0SQ c0sq, int i) {
        if (A0C()) {
            C48982Hv c48982Hv = this.A04;
            byte[] A01 = C48962Ht.A01(i);
            ByteBuffer byteBuffer = c48982Hv.A05;
            byteBuffer.put(A01);
            C48932Hl c48932Hl = this.A05;
            C48972Hu[] c48972HuArr = c48932Hl.A05;
            C48972Hu c48972Hu = c48972HuArr[this.A01];
            int i2 = c48932Hl.A00 + 1;
            c48932Hl.A00 = i2;
            if (i2 > 65535) {
                c48932Hl.A00 = 1;
                i2 = 1;
            }
            c48972Hu.A00 = i2;
            byteBuffer.put(A0D(i));
            c48972HuArr[this.A01].A04 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        int A0A = c0sq.A0A() + c0sn.A0A();
        ByteBuffer byteBuffer2 = this.A04.A05;
        if (A0A <= byteBuffer2.remaining()) {
            byteBuffer2.put(c0sn.A02.A00());
            byteBuffer2.put(c0sq.A02.A00());
            int i3 = this.A02 + c0sn.A01;
            this.A02 = i3;
            this.A02 = i3 + c0sq.A01;
            this.A00++;
            Map map = c0sn.A00;
            for (Number number : Collections.unmodifiableCollection(map.keySet())) {
                C006302u c006302u = this.A03;
                int intValue = number.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                if (map.containsKey(valueOf)) {
                    c006302u.A01(intValue, ((C006402v) map.get(valueOf)).A00);
                } else {
                    throw new Error("The buffer does not contain the given attribute");
                }
            }
            return;
        }
        throw new Error("Not enough space in the buffer");
    }

    public boolean A0B() {
        return this.A01 == this.A05.A01;
    }

    public final boolean A0C() {
        return this.A04.A05.position() == 0;
    }

    public byte[] A0D(int i) {
        if (i == 1) {
            C48972Hu c48972Hu = this.A05.A05[this.A01];
            int i2 = c48972Hu.A00;
            return new byte[]{(byte) c48972Hu.A02, (byte) i2, (byte) (i2 >> 8)};
        }
        C48972Hu c48972Hu2 = this.A05.A05[this.A01];
        int i3 = c48972Hu2.A00;
        return new byte[]{(byte) c48972Hu2.A02, (byte) i3, (byte) (i3 >> 8), (byte) c48972Hu2.A05};
    }
}
