package X;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: X.0lK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C13480lK extends FilterOutputStream {
    public ByteOrder A00;
    public final OutputStream A01;

    public C13480lK(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.A01 = outputStream;
        this.A00 = byteOrder;
    }

    public void A00(int i) {
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            OutputStream outputStream = this.A01;
            outputStream.write((i >>> 0) & 255);
            outputStream.write((i >>> 8) & 255);
            outputStream.write((i >>> 16) & 255);
            outputStream.write((i >>> 24) & 255);
        } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
        } else {
            OutputStream outputStream2 = this.A01;
            outputStream2.write((i >>> 24) & 255);
            outputStream2.write((i >>> 16) & 255);
            outputStream2.write((i >>> 8) & 255);
            outputStream2.write((i >>> 0) & 255);
        }
    }

    public void A01(short s) {
        ByteOrder byteOrder = this.A00;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            OutputStream outputStream = this.A01;
            outputStream.write((s >>> 0) & 255);
            outputStream.write((s >>> 8) & 255);
        } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
        } else {
            OutputStream outputStream2 = this.A01;
            outputStream2.write((s >>> 8) & 255);
            outputStream2.write((s >>> 0) & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.A01.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.A01.write(bArr, i, i2);
    }
}
