package X;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0RO */
/* loaded from: classes.dex */
public final class C0RO {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public final InputStream A09;
    public final boolean A0A;
    public final byte[] A0B;

    public C0RO(InputStream inputStream) {
        this.A03 = Integer.MAX_VALUE;
        this.A06 = 100;
        this.A07 = 67108864;
        this.A0B = new byte[4096];
        this.A00 = 0;
        this.A08 = 0;
        this.A09 = inputStream;
        this.A0A = false;
    }

    public C0RO(byte[] bArr, int i, int i2, boolean z) {
        this.A03 = Integer.MAX_VALUE;
        this.A06 = 100;
        this.A07 = 67108864;
        this.A0B = bArr;
        this.A01 = i2 + i;
        this.A00 = i;
        this.A08 = -i;
        this.A09 = null;
        this.A0A = z;
    }

    public int A00() {
        int i = this.A03;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.A08 + this.A00);
    }

    public int A01() {
        int i = this.A00;
        if (this.A01 - i < 4) {
            A0E(4);
            i = this.A00;
        }
        byte[] bArr = this.A0B;
        this.A00 = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x003a, code lost:
        if (r4[r2] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A02() {
        /*
            r5 = this;
            int r0 = r5.A00
            int r1 = r5.A01
            if (r1 == r0) goto L3c
            byte[] r4 = r5.A0B
            int r2 = r0 + 1
            r3 = r4[r0]
            if (r3 < 0) goto L5d
            r5.A00 = r2
            return r3
        L11:
            int r2 = r1 + 1
            r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
            int r2 = r1 + 1
            r0 = r4[r1]
            if (r0 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
            int r2 = r1 + 1
            r0 = r4[r1]
            if (r0 >= 0) goto L4d
            int r1 = r2 + 1
            r0 = r4[r2]
            if (r0 >= 0) goto L6d
        L3c:
            long r1 = r5.A07()
            int r0 = (int) r1
            return r0
        L42:
            int r2 = r1 + 1
            r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L4f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L4d:
            r1 = r2
            goto L6d
        L4f:
            int r1 = r2 + 1
            r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L11
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L6d
        L5d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L3c
            int r1 = r2 + 1
            r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L42
            r3 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
        L6d:
            r5.A00 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RO.A02():int");
    }

    public int A03() {
        if (this.A00 == this.A01 && !A0G(1)) {
            this.A04 = 0;
            return 0;
        }
        int A02 = A02();
        this.A04 = A02;
        if ((A02 >>> 3) != 0) {
            return A02;
        }
        throw new C0JX("Protocol message contained an invalid tag (zero).");
    }

    public int A04(int i) {
        if (i >= 0) {
            int i2 = this.A08 + this.A00 + i;
            int i3 = this.A03;
            if (i2 <= i3) {
                this.A03 = i2;
                A0B();
                return i3;
            }
            throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C0JX("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public long A05() {
        int i = this.A00;
        if (this.A01 - i < 8) {
            A0E(8);
            i = this.A00;
        }
        byte[] bArr = this.A0B;
        this.A00 = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x002d, code lost:
        if (r6[r5] < 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A06() {
        /*
            Method dump skipped, instructions count: 181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RO.A06():long");
    }

    public long A07() {
        long j = 0;
        int i = 0;
        do {
            if (this.A00 == this.A01) {
                A0E(1);
            }
            byte[] bArr = this.A0B;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            byte b = bArr[i2];
            j |= (b & Byte.MAX_VALUE) << i;
            if ((b & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        throw new C0JX("CodedInputStream encountered a malformed varint.");
    }

    public C0AN A08() {
        int A02 = A02();
        int i = this.A01;
        int i2 = this.A00;
        if (A02 > i - i2 || A02 <= 0) {
            if (A02 == 0) {
                return C0AN.A01;
            }
            return new C02230Aj(A0H(A02));
        }
        C0AN A01 = C0AN.A01(this.A0B, i2, A02);
        this.A00 += A02;
        return A01;
    }

    public C0AX A09(C0RQ c0rq, C0RP c0rp) {
        int A02 = A02();
        int i = this.A05;
        if (i < this.A06) {
            int A04 = A04(A02);
            this.A05 = i + 1;
            C0AX c0ax = (C0AX) c0rq.A00(this, c0rp);
            A0C(0);
            this.A05--;
            this.A03 = A04;
            A0B();
            return c0ax;
        }
        throw new C0JX("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public String A0A() {
        int A02 = A02();
        int i = this.A01;
        int i2 = this.A00;
        if (A02 <= i - i2 && A02 > 0) {
            String str = new String(this.A0B, i2, A02, C02220Ai.A00);
            this.A00 += A02;
            return str;
        } else if (A02 == 0) {
            return "";
        } else {
            if (A02 <= i) {
                A0E(A02);
                String str2 = new String(this.A0B, this.A00, A02, C02220Ai.A00);
                this.A00 += A02;
                return str2;
            }
            return new String(A0H(A02), C02220Ai.A00);
        }
    }

    public final void A0B() {
        int i = this.A01 + this.A02;
        this.A01 = i;
        int i2 = this.A08 + i;
        int i3 = this.A03;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.A02 = i4;
            this.A01 = i - i4;
            return;
        }
        this.A02 = 0;
    }

    public void A0C(int i) {
        if (this.A04 != i) {
            throw new C0JX("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void A0D(int i) {
        int i2 = this.A01;
        int i3 = this.A00;
        int i4 = i2 - i3;
        if (i <= i4) {
            if (i >= 0) {
                this.A00 = i3 + i;
                return;
            }
        } else if (i >= 0) {
            int i5 = this.A08;
            int i6 = i5 + i3 + i;
            int i7 = this.A03;
            if (i6 <= i7) {
                this.A00 = i2;
                A0E(1);
                while (true) {
                    int i8 = i - i4;
                    int i9 = this.A01;
                    if (i8 > i9) {
                        i4 += i9;
                        this.A00 = i9;
                        A0E(1);
                    } else {
                        this.A00 = i8;
                        return;
                    }
                }
            } else {
                A0D((i7 - i5) - i3);
                throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        throw new C0JX("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void A0E(int i) {
        if (!A0G(i)) {
            throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public boolean A0F() {
        return A06() != 0;
    }

    public final boolean A0G(int i) {
        InputStream inputStream;
        int i2 = this.A00;
        int i3 = i2 + i;
        int i4 = this.A01;
        int i5 = i4;
        if (i3 > i4) {
            if (this.A08 + i2 + i <= this.A03 && (inputStream = this.A09) != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.A0B;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.A08 += i2;
                    i5 = this.A01 - i2;
                    this.A01 = i5;
                    this.A00 = 0;
                }
                byte[] bArr2 = this.A0B;
                int length = bArr2.length;
                int read = inputStream.read(bArr2, i5, length - i5);
                if (read == 0 || read < -1 || read > length) {
                    throw new IllegalStateException(C000200d.A0E("InputStream#read(byte[]) returned invalid result: ", read, "\nThe InputStream implementation is buggy."));
                }
                if (read > 0) {
                    this.A01 += read;
                    if ((this.A08 + i) - this.A07 <= 0) {
                        A0B();
                        if (this.A01 >= i) {
                            return true;
                        }
                        return A0G(i);
                    }
                    throw new C0JX("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        throw new IllegalStateException(C000200d.A0E("refillBuffer() called when ", i, " bytes were already available in buffer"));
    }

    public final byte[] A0H(int i) {
        if (i <= 0) {
            throw new C0JX("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.A08;
        int i3 = this.A00;
        int i4 = i2 + i3 + i;
        if (i4 <= this.A07) {
            int i5 = this.A03;
            if (i4 <= i5) {
                InputStream inputStream = this.A09;
                if (inputStream != null) {
                    int i6 = this.A01;
                    int i7 = i6 - i3;
                    this.A08 = i2 + i6;
                    this.A00 = 0;
                    this.A01 = 0;
                    int i8 = i - i7;
                    if (i8 >= 4096 && i8 > inputStream.available()) {
                        ArrayList arrayList = new ArrayList();
                        while (i8 > 0) {
                            int min = Math.min(i8, 4096);
                            byte[] bArr = new byte[min];
                            int i9 = 0;
                            while (i9 < min) {
                                int read = inputStream.read(bArr, i9, min - i9);
                                if (read != -1) {
                                    this.A08 += read;
                                    i9 += read;
                                } else {
                                    throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                }
                            }
                            i8 -= min;
                            arrayList.add(bArr);
                        }
                        byte[] bArr2 = new byte[i];
                        System.arraycopy(this.A0B, i3, bArr2, 0, i7);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            byte[] bArr3 = (byte[]) it.next();
                            int length = bArr3.length;
                            System.arraycopy(bArr3, 0, bArr2, i7, length);
                            i7 += length;
                        }
                        return bArr2;
                    }
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(this.A0B, i3, bArr4, 0, i7);
                    while (i7 < i) {
                        int read2 = inputStream.read(bArr4, i7, i - i7);
                        if (read2 != -1) {
                            this.A08 += read2;
                            i7 += read2;
                        } else {
                            throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
                    return bArr4;
                }
                throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            A0D((i5 - i2) - i3);
            throw new C0JX("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C0JX("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }
}
