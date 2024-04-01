package X;

import java.io.DataOutputStream;

/* renamed from: X.3IX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3IX implements C31Q {
    public final C31Q A00;
    public final DataOutputStream A01;

    public C3IX(C31Q c31q, DataOutputStream dataOutputStream) {
        this.A00 = c31q;
        this.A01 = dataOutputStream;
    }

    @Override // X.C31Q
    public boolean AEX() {
        return this.A00.AEX();
    }

    @Override // X.C31Q
    public void AR5(byte[] bArr) {
        this.A00.AR5(bArr);
        this.A01.write(bArr);
    }

    @Override // X.C31Q
    public long ARH() {
        return this.A00.ARH();
    }

    @Override // X.C31Q
    public void ATe(long j) {
        C31Q c31q = this.A00;
        byte[] bArr = new byte[(int) (j - c31q.position())];
        c31q.AR5(bArr);
        this.A01.write(bArr);
    }

    @Override // X.C31Q
    public void close() {
        this.A00.close();
        this.A01.close();
    }

    @Override // X.C31Q
    public long position() {
        return this.A00.position();
    }

    @Override // X.C31Q
    public byte readByte() {
        byte readByte = this.A00.readByte();
        this.A01.write(readByte);
        return readByte;
    }

    @Override // X.C31Q
    public int readInt() {
        int readInt = this.A00.readInt();
        this.A01.writeInt(readInt);
        return readInt;
    }

    @Override // X.C31Q
    public long readLong() {
        long readLong = this.A00.readLong();
        this.A01.writeLong(readLong);
        return readLong;
    }

    @Override // X.C31Q
    public short readShort() {
        short readShort = this.A00.readShort();
        this.A01.writeShort(readShort);
        return readShort;
    }
}
