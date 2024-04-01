package X;

import java.io.InputStream;

/* renamed from: X.1xd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43581xd extends InputStream {
    public boolean A00;
    public final InputStream A01;
    public final InputStream A02;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public C43581xd(InputStream inputStream, InputStream inputStream2) {
        this.A01 = inputStream;
        this.A02 = inputStream2;
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.A00) {
            return this.A02.available();
        }
        return this.A02.available() + this.A01.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A01.close();
        this.A02.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.A00) {
            return this.A02.read();
        }
        int read = this.A01.read();
        if (read < 0) {
            this.A00 = true;
            return this.A02.read();
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.A00) {
            return this.A02.read(bArr, i, i2);
        }
        int read = this.A01.read(bArr, i, i2);
        if (read < 0) {
            this.A00 = true;
            return this.A02.read(bArr, i, i2);
        }
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (this.A00) {
            return this.A02.skip(j);
        }
        long skip = this.A01.skip(j);
        if (skip < j) {
            this.A00 = true;
            return this.A02.skip(j - skip) + skip;
        }
        return skip;
    }
}
