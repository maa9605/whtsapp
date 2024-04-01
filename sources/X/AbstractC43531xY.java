package X;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;

/* renamed from: X.1xY */
/* loaded from: classes2.dex */
public abstract class AbstractC43531xY extends FilterInputStream {
    public int A00;
    public Mac A01;
    public boolean A02;
    public final int A03;
    public final C43541xZ A04;
    public final C59842tV A05;
    public final C42621w3 A06;
    public final List A07;
    public final byte[] A08;

    public AbstractC43531xY(InputStream inputStream, C42621w3 c42621w3) {
        super(inputStream);
        this.A05 = new C59842tV();
        this.A02 = false;
        this.A00 = 0;
        this.A03 = 10;
        this.A06 = c42621w3;
        this.A07 = new ArrayList();
        this.A01 = C42041uv.A08(c42621w3.A01, c42621w3.A02);
        this.A08 = new byte[8192];
        this.A04 = new C43541xZ(this);
    }

    public final byte[] A00(byte[] bArr, int i) {
        byte[] bArr2 = new byte[16];
        if (i < 16) {
            C59842tV c59842tV = this.A05;
            int i2 = 16 - i;
            C000700j.A07(i2 <= c59842tV.A00);
            byte[] bArr3 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (c59842tV.A02 - i2) + i3;
                if (i4 < 0) {
                    i4 += c59842tV.A01;
                }
                bArr3[i3] = c59842tV.A03[i4];
            }
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            System.arraycopy(bArr, 0, bArr2, i2, i);
            return bArr2;
        }
        System.arraycopy(bArr, i - 16, bArr2, 0, 16);
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.A00 > 0) {
            this.A07.add(AnonymousClass029.A1g(this.A01.doFinal(), this.A03));
        }
        this.A02 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        byte[] bArr = new byte[1];
        do {
            read = read(bArr, 0, 1);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return bArr[0];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        boolean z;
        int intValue;
        int intValue2;
        boolean z2;
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            if (!(this instanceof C3A0)) {
                z = false;
            } else {
                C3A0 c3a0 = (C3A0) this;
                int i3 = c3a0.A00;
                z = true;
                if (i3 != c3a0.A01.size() - 1) {
                    z = false;
                }
            }
            if (z) {
                this.A00 += read;
                this.A01.update(bArr, 0, read);
            } else {
                if (!(this instanceof C3A0)) {
                    intValue = ((C43521xX) this).A00;
                } else {
                    C3A0 c3a02 = (C3A0) this;
                    intValue = ((Number) c3a02.A01.get(c3a02.A00)).intValue();
                }
                int i4 = this.A00;
                int i5 = i4 + read;
                if (i5 <= intValue) {
                    this.A00 = i5;
                    this.A01.update(bArr, 0, read);
                    if (this.A00 == intValue) {
                        this.A00 = 0;
                        this.A07.add(AnonymousClass029.A1g(this.A01.doFinal(), this.A03));
                        this.A01 = C42041uv.A08(A00(bArr, read), this.A06.A02);
                        if (this instanceof C3A0) {
                            ((C3A0) this).A00++;
                        }
                    }
                } else if (i5 > intValue) {
                    this.A01.update(bArr, 0, intValue - i4);
                    byte[] doFinal = this.A01.doFinal();
                    int i6 = this.A03;
                    byte[] A1g = AnonymousClass029.A1g(doFinal, i6);
                    List list = this.A07;
                    list.add(A1g);
                    byte[] A00 = A00(bArr, intValue - this.A00);
                    byte[] bArr2 = this.A06.A02;
                    this.A01 = C42041uv.A08(A00, bArr2);
                    int i7 = this.A00;
                    int i8 = (i7 + read) - intValue;
                    int i9 = intValue - i7;
                    this.A00 = 0;
                    if (this instanceof C3A0) {
                        ((C3A0) this).A00++;
                    }
                    while (i8 > 0) {
                        if (!(this instanceof C3A0)) {
                            intValue2 = ((C43521xX) this).A00;
                        } else {
                            C3A0 c3a03 = (C3A0) this;
                            intValue2 = ((Number) c3a03.A01.get(c3a03.A00)).intValue();
                        }
                        if (!(this instanceof C3A0)) {
                            z2 = false;
                        } else {
                            C3A0 c3a04 = (C3A0) this;
                            int i10 = c3a04.A00;
                            z2 = true;
                            if (i10 != c3a04.A01.size() - 1) {
                                z2 = false;
                            }
                        }
                        if (!z2 && i8 >= intValue2) {
                            this.A01.update(bArr, i9, intValue2);
                            list.add(AnonymousClass029.A1g(this.A01.doFinal(), i6));
                            i9 += intValue2;
                            this.A01 = C42041uv.A08(A00(bArr, i9), bArr2);
                            i8 -= intValue2;
                            if (this instanceof C3A0) {
                                ((C3A0) this).A00++;
                            }
                        } else {
                            this.A01.update(bArr, i9, i8);
                            this.A00 = i8;
                            break;
                        }
                    }
                }
            }
            for (int max = Math.max(0, read - 16); max < read; max++) {
                C59842tV c59842tV = this.A05;
                byte b = bArr[max];
                int i11 = c59842tV.A02;
                int i12 = c59842tV.A01;
                if (i11 >= i12) {
                    c59842tV.A02 = 0;
                    i11 = 0;
                }
                c59842tV.A03[i11] = b;
                c59842tV.A02 = i11 + 1;
                int i13 = c59842tV.A00;
                if (i13 < i12) {
                    c59842tV.A00 = i13 + 1;
                }
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        byte[] bArr = this.A08;
        return read(bArr, 0, (int) Math.min(bArr.length, j));
    }
}
