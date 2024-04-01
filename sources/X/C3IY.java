package X;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.3IY  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3IY implements C31Q {
    public long A00 = 0;
    public final long A01;
    public final DataInputStream A02;

    public C3IY(File file) {
        this.A01 = file.length();
        this.A02 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    }

    @Override // X.C31Q
    public boolean AEX() {
        return this.A00 < this.A01;
    }

    @Override // X.C31Q
    public void AR5(byte[] bArr) {
        this.A02.read(bArr);
        this.A00 += bArr.length;
    }

    @Override // X.C31Q
    public long ARH() {
        return this.A01 - this.A00;
    }

    @Override // X.C31Q
    public void ATe(long j) {
        AR5(new byte[(int) (j - this.A00)]);
    }

    @Override // X.C31Q
    public void close() {
        this.A02.close();
    }

    @Override // X.C31Q
    public long position() {
        return this.A00;
    }

    @Override // X.C31Q
    public byte readByte() {
        byte readByte = this.A02.readByte();
        this.A00++;
        return readByte;
    }

    @Override // X.C31Q
    public int readInt() {
        int readInt = this.A02.readInt();
        this.A00 += 4;
        return readInt;
    }

    @Override // X.C31Q
    public long readLong() {
        this.A00 += 8;
        return this.A02.readLong();
    }

    @Override // X.C31Q
    public short readShort() {
        short readShort = this.A02.readShort();
        this.A00 += 2;
        return readShort;
    }
}
