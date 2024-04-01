package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;

/* renamed from: X.0TY  reason: invalid class name */
/* loaded from: classes.dex */
public class C0TY {
    public char A00;
    public char A01;
    public int A02;
    public RandomAccessFile A04;
    public final String A07;
    public int A03 = -1;
    public boolean A05 = true;
    public boolean A06 = false;
    public final byte[] A08 = new byte[512];

    public C0TY(String str) {
        this.A07 = str;
    }

    public long A00() {
        long j = 1;
        long j2 = 0;
        boolean z = true;
        while (true) {
            if (A06()) {
                A03();
                if (Character.isDigit(this.A00)) {
                    j2 = (j2 * 10) + (this.A00 - '0');
                } else if (z) {
                    if (this.A00 != '-') {
                        throw new C18810uM("Couldn't read number!");
                    }
                    j = -1;
                } else {
                    A04();
                    break;
                }
                z = false;
            } else if (z) {
                throw new C18810uM("Couldn't read number because the file ended!");
            }
        }
        return j * j2;
    }

    public void A01() {
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A04 = null;
                throw th;
            }
            this.A04 = null;
        }
    }

    public void A02() {
        this.A05 = true;
        RandomAccessFile randomAccessFile = this.A04;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0L);
            } catch (IOException unused) {
                A01();
            }
        }
        if (this.A04 == null) {
            try {
                this.A04 = new RandomAccessFile(this.A07, "r");
            } catch (IOException unused2) {
                this.A05 = false;
                A01();
            }
        }
        if (this.A05) {
            this.A03 = -1;
            this.A02 = 0;
            this.A00 = (char) 0;
            this.A01 = (char) 0;
            this.A06 = false;
        }
    }

    public final void A03() {
        if (A06()) {
            int i = this.A03 + 1;
            this.A03 = i;
            this.A01 = this.A00;
            this.A00 = (char) this.A08[i];
            this.A06 = false;
            return;
        }
        throw new NoSuchElementException();
    }

    public final void A04() {
        if (!this.A06) {
            this.A03--;
            this.A00 = this.A01;
            this.A06 = true;
            return;
        }
        throw new C18810uM("Can only rewind one step!");
    }

    public void A05(char c) {
        boolean z = false;
        while (A06()) {
            A03();
            if (this.A00 == c) {
                z = true;
            } else if (z) {
                A04();
                return;
            }
        }
    }

    public boolean A06() {
        RandomAccessFile randomAccessFile;
        if (this.A05 && (randomAccessFile = this.A04) != null) {
            int i = this.A03;
            int i2 = this.A02;
            if (i <= i2 - 1) {
                if (i < i2 - 1) {
                    return true;
                }
                try {
                    this.A02 = randomAccessFile.read(this.A08);
                    this.A03 = -1;
                } catch (IOException unused) {
                    this.A05 = false;
                    A01();
                }
                return A06();
            }
        }
        return false;
    }

    public void finalize() {
        A01();
    }
}
