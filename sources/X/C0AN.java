package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0AN */
/* loaded from: classes.dex */
public abstract class C0AN implements Iterable, Serializable {
    public static final C0RX A00;
    public static final C0AN A01 = new C02230Aj(C02220Ai.A01);
    public int hash = 0;

    public abstract byte A02(int i);

    public abstract int A03();

    public abstract C0RO A04();

    public abstract void A05(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    static {
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        A00 = z ? new C0RX() { // from class: X.0RW
            @Override // X.C0RX
            public byte[] A6c(byte[] bArr, int i, int i2) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
            }
        } : new C0RX() { // from class: X.1fF
            @Override // X.C0RX
            public byte[] A6c(byte[] bArr, int i, int i2) {
                return Arrays.copyOfRange(bArr, i, i2 + i);
            }
        };
    }

    public static C0AN A00(byte[] bArr) {
        return A01(bArr, 0, bArr.length);
    }

    public static C0AN A01(byte[] bArr, int i, int i2) {
        return new C02230Aj(A00.A6c(bArr, i, i2));
    }

    public final byte[] A06() {
        int A03 = A03();
        if (A03 == 0) {
            return C02220Ai.A01;
        }
        byte[] bArr = new byte[A03];
        A05(bArr, 0, 0, A03);
        return bArr;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int A03 = A03();
            C02230Aj c02230Aj = (C02230Aj) this;
            byte[] bArr = c02230Aj.bytes;
            int A07 = c02230Aj.A07();
            i = A03;
            for (int i2 = A07; i2 < A07 + A03; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new Iterator() { // from class: X.1Cj
            public int A00 = 0;
            public final int A01;

            {
                C0AN.this = this;
                this.A01 = this.A03();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.A00 < this.A01;
            }

            @Override // java.util.Iterator
            public Object next() {
                try {
                    C0AN c0an = C0AN.this;
                    int i = this.A00;
                    this.A00 = i + 1;
                    return Byte.valueOf(c0an.A02(i));
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(A03()));
    }
}
