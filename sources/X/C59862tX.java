package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;

/* renamed from: X.2tX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59862tX extends OutputStream {
    public int A00;
    public boolean A01;
    public byte[] A02 = new byte[1];
    public final C59852tW A03;
    public final OutputStream A04;
    public final Cipher A05;
    public final Mac A06;
    public final byte[] A07;

    public C59862tX(OutputStream outputStream, C42621w3 c42621w3, long j) {
        this.A04 = outputStream;
        this.A03 = new C59852tW(j);
        byte[] bArr = c42621w3.A01;
        this.A05 = C42041uv.A07(bArr, c42621w3.A00, 2);
        this.A06 = C42041uv.A08(bArr, c42621w3.A02);
        this.A07 = new byte[10];
        this.A01 = false;
    }

    public final void A00(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        int i4 = i2 - (10 - i3);
        if (i4 > 0) {
            i2 -= i4;
        }
        this.A03.A00 += i2;
        byte[] bArr2 = this.A07;
        System.arraycopy(bArr, i, bArr2, i3, i2);
        int i5 = this.A00 + i2;
        this.A00 = i5;
        if (i5 < 10) {
            return;
        }
        AnonymousClass029.A1g(bArr2, 10);
        try {
            if (MessageDigest.isEqual(bArr2, AnonymousClass029.A1g(this.A06.doFinal(), 10))) {
                this.A04.write(this.A05.doFinal());
                this.A01 = true;
            }
        } catch (BadPaddingException e) {
            Log.w(e);
            throw new IOException("Bad padding!");
        } catch (IllegalBlockSizeException e2) {
            Log.w(e2);
            throw new IOException("Bad block size!");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A04.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.A02;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            C59852tW c59852tW = this.A03;
            long j = c59852tW.A01;
            if (i + i2 <= j) {
                long j2 = c59852tW.A00;
                long j3 = j - 10;
                if (j2 < j3) {
                    int min = (int) Math.min(j2 > j3 ? 0L : j3 - j2, i2);
                    c59852tW.A00 = j2 + min;
                    this.A06.update(bArr, i, min);
                    byte[] update = this.A05.update(bArr, i, min);
                    if (update != null && update.length > 0) {
                        this.A04.write(update);
                    }
                    if (i2 > min) {
                        A00(bArr, i + min, i2 - min);
                        return;
                    }
                    return;
                } else if (j2 < j) {
                    A00(bArr, i, i2);
                    return;
                } else {
                    throw new IOException("Passed in total length is already read");
                }
            }
        }
        throw new IOException("Incorrect parameters passed in to read from");
    }
}
