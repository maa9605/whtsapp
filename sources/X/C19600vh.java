package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.0vh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19600vh implements Closeable {
    public final AbstractC19030uj A03;
    public C19270v9 A02 = C19270v9.A01;
    public int A00 = 1;
    public int A01 = -1;

    public C19600vh(AbstractC19030uj abstractC19030uj) {
        C07K.A1X(AbstractC19030uj.A02(abstractC19030uj));
        this.A03 = abstractC19030uj.clone();
    }

    public InputStream A00() {
        AbstractC19030uj A00 = AbstractC19030uj.A00(this.A03);
        if (A00 != null) {
            try {
                final C1Y7 c1y7 = (C1Y7) A00.A04();
                return new InputStream(c1y7) { // from class: X.0ug
                    public int A00;
                    public int A01;
                    public final C1Y7 A02;

                    @Override // java.io.InputStream
                    public boolean markSupported() {
                        return true;
                    }

                    {
                        boolean z;
                        synchronized (c1y7) {
                            z = !AbstractC19030uj.A02(c1y7.A00);
                        }
                        C07K.A1X(!z);
                        this.A02 = c1y7;
                        this.A01 = 0;
                        this.A00 = 0;
                    }

                    @Override // java.io.InputStream
                    public int available() {
                        return this.A02.A01() - this.A01;
                    }

                    @Override // java.io.InputStream
                    public void mark(int i) {
                        this.A00 = this.A01;
                    }

                    @Override // java.io.InputStream
                    public int read() {
                        if (available() <= 0) {
                            return -1;
                        }
                        C1Y7 c1y72 = this.A02;
                        int i = this.A01;
                        this.A01 = i + 1;
                        return c1y72.A00(i) & 255;
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] bArr) {
                        return read(bArr, 0, bArr.length);
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] bArr, int i, int i2) {
                        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
                            int available = available();
                            if (available <= 0) {
                                return -1;
                            }
                            if (i2 <= 0) {
                                return 0;
                            }
                            int min = Math.min(available, i2);
                            C1Y7 c1y72 = this.A02;
                            int i3 = this.A01;
                            synchronized (c1y72) {
                                c1y72.A02();
                                C07K.A1X(i3 + min <= c1y72.A01);
                                ((InterfaceC19710vs) c1y72.A00.A04()).AR4(i3, bArr, i, min);
                            }
                            this.A01 += min;
                            return min;
                        }
                        StringBuilder A0P = C000200d.A0P("length=");
                        C000200d.A1H(A0P, bArr.length, "; regionStart=", i, "; regionLength=");
                        A0P.append(i2);
                        throw new ArrayIndexOutOfBoundsException(A0P.toString());
                    }

                    @Override // java.io.InputStream
                    public void reset() {
                        this.A01 = this.A00;
                    }

                    @Override // java.io.InputStream
                    public long skip(long j) {
                        C07K.A1X(j >= 0);
                        int min = Math.min((int) j, available());
                        this.A01 += min;
                        return min;
                    }
                };
            } finally {
                A00.close();
            }
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC19030uj abstractC19030uj = this.A03;
        if (abstractC19030uj != null) {
            abstractC19030uj.close();
        }
    }
}
