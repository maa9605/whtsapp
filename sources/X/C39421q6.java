package X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.1q6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39421q6 extends AbstractC30211a6 {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public C39421q6() {
        super(false);
    }

    @Override // X.InterfaceC06380Sv
    public Uri ADi() {
        return this.A01;
    }

    @Override // X.InterfaceC06380Sv
    public long AQX(AnonymousClass126 anonymousClass126) {
        try {
            Uri uri = anonymousClass126.A05;
            this.A01 = uri;
            A01();
            RandomAccessFile randomAccessFile = new RandomAccessFile(uri.getPath(), "r");
            this.A02 = randomAccessFile;
            long j = anonymousClass126.A04;
            randomAccessFile.seek(j);
            long j2 = anonymousClass126.A03;
            if (j2 == -1) {
                j2 = this.A02.length() - j;
            }
            this.A00 = j2;
            if (j2 >= 0) {
                this.A03 = true;
                A03(anonymousClass126);
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new AnonymousClass128(e);
        }
    }

    @Override // X.InterfaceC06380Sv
    public void close() {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new AnonymousClass128(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A00();
            }
        }
    }

    @Override // X.InterfaceC06380Sv
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.A00 -= read;
                A02(read);
            }
            return read;
        } catch (IOException e) {
            throw new AnonymousClass128(e);
        }
    }
}
