package X;

import java.io.InputStream;

/* renamed from: X.1xn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43681xn extends InputStream {
    public long A00;
    public InputStream A01;
    public byte[] A02 = new byte[1];

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public C43681xn(InputStream inputStream, long j) {
        this.A00 = 0L;
        this.A01 = inputStream;
        this.A00 = j;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A01.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        throw new IllegalStateException("Can't mark");
    }

    @Override // java.io.InputStream
    public int read() {
        int read = read(this.A02, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.A02[0] & 255;
        }
        throw new IllegalStateException(C000200d.A0D("OIS unexpected return value: ", read));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.A01.read(bArr, i, i2);
        this.A00 += read;
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        throw new IllegalStateException("Can't reset");
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long skip = this.A01.skip(j);
        this.A00 += skip;
        return skip;
    }
}
