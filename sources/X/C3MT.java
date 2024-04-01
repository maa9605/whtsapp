package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.3MT  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3MT extends InputStream {
    public C76273gK A00 = new C76273gK();
    public C3MW A01;

    public C3MT(C3MW c3mw) {
        this.A01 = c3mw;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.A00.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        C76273gK c76273gK = this.A00;
        synchronized (c76273gK) {
            c76273gK.A00();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        if (this.A00 != null) {
            return true;
        }
        throw null;
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read <= 1) {
            if (read == 1) {
                return (short) (((short) (bArr[0] & 255)) | 0);
            }
            return -1;
        }
        throw new IOException("Read returned more than 1 byte");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw new IOException("Buffer is null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0162 A[ADDED_TO_REGION, EDGE_INSN: B:102:0x0162->B:82:0x0162 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0159 A[EDGE_INSN: B:108:0x0159->B:78:0x0159 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3MT.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.A00.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.A00.skip(j);
    }
}
