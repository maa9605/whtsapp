package X;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

/* renamed from: X.2Hv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48982Hv {
    public static final long A07 = new Adler32().getValue();
    public int A00;
    public int A01 = 0;
    public final int A02;
    public final C006002r A03;
    public final RandomAccessFile A04;
    public final ByteBuffer A05;
    public final Checksum A06;

    public C48982Hv(RandomAccessFile randomAccessFile, int i, int i2, C006002r c006002r) {
        this.A04 = randomAccessFile;
        this.A02 = i;
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        this.A05 = allocate;
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        this.A06 = new Adler32();
        this.A00 = 0;
        this.A03 = c006002r;
    }

    public final long A00() {
        Checksum checksum = this.A06;
        ByteBuffer byteBuffer = this.A05;
        checksum.update(byteBuffer.array(), this.A00, byteBuffer.position() - this.A00);
        this.A00 = byteBuffer.position();
        return checksum.getValue();
    }

    public void A01() {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            ByteBuffer byteBuffer = this.A05;
            int position = byteBuffer.position();
            int i = this.A01;
            if (position != i) {
                try {
                    randomAccessFile.seek(this.A02 + i);
                    try {
                        randomAccessFile.write(byteBuffer.array(), this.A01, byteBuffer.position() - this.A01);
                        this.A01 = byteBuffer.position();
                    } catch (IOException e) {
                        C006002r c006002r = this.A03;
                        c006002r.A0G = Boolean.TRUE;
                        c006002r.A06();
                        throw e;
                    }
                } catch (IOException e2) {
                    C006002r c006002r2 = this.A03;
                    c006002r2.A09 = Boolean.TRUE;
                    c006002r2.A06();
                    throw e2;
                }
            }
        }
    }

    public void A02(int i) {
        long j = this.A02;
        try {
            RandomAccessFile randomAccessFile = this.A04;
            randomAccessFile.seek(j);
            try {
                ByteBuffer byteBuffer = this.A05;
                randomAccessFile.readFully(byteBuffer.array(), 0, i);
                byteBuffer.position(i);
                this.A01 = i;
                this.A06.reset();
                this.A00 = 0;
            } catch (EOFException e) {
                C006002r c006002r = this.A03;
                c006002r.A04 = Boolean.TRUE;
                c006002r.A06();
                throw e;
            } catch (IOException e2) {
                C006002r c006002r2 = this.A03;
                c006002r2.A0D = Boolean.TRUE;
                c006002r2.A06();
                throw e2;
            }
        } catch (IOException e3) {
            C006002r c006002r3 = this.A03;
            c006002r3.A09 = Boolean.TRUE;
            c006002r3.A06();
            throw e3;
        }
    }

    public final void A03(long j) {
        if (j >= 0 && j <= 4294967295L) {
            this.A05.putInt((int) j);
            return;
        }
        throw new IllegalArgumentException("Value is not an unsigned integer");
    }
}
