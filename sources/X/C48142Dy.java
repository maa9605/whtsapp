package X;

import java.io.OutputStream;

/* renamed from: X.2Dy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48142Dy extends OutputStream {
    public final int A00;
    public final C0EL A01;
    public final OutputStream A02;

    public C48142Dy(OutputStream outputStream, C0EL c0el, int i) {
        this.A02 = outputStream;
        this.A01 = c0el;
        this.A00 = i;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A02.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.A02.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.A02.write(i);
        this.A01.A04(1, this.A00);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.A02.write(bArr);
        this.A01.A04(bArr.length, this.A00);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.A02.write(bArr, i, i2);
        this.A01.A04(i2, this.A00);
    }
}
