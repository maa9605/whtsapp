package X;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

/* renamed from: X.0Aa */
/* loaded from: classes.dex */
public abstract class C0Aa implements C0AX {
    public int A00 = 0;

    public static void A08(Iterable iterable, Collection collection) {
        if (iterable != null) {
            if (iterable instanceof Collection) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        throw null;
                    }
                }
                collection.addAll((Collection) iterable);
                return;
            }
            for (Object obj2 : iterable) {
                if (obj2 != null) {
                    collection.add(obj2);
                } else {
                    throw null;
                }
            }
            return;
        }
        throw null;
    }

    public C0AN A09() {
        try {
            C24671Ck c24671Ck = new C24671Ck(AD4());
            C0RS c0rs = c24671Ck.A00;
            AWK(c0rs);
            if (c0rs.A0E() == 0) {
                return new C02230Aj(c24671Ck.A01);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            StringBuilder A0P = C000200d.A0P("Serializing ");
            A0P.append(getClass().getName());
            A0P.append(" to a ");
            A0P.append("ByteString");
            A0P.append(" threw an IOException (should never happen).");
            throw new RuntimeException(A0P.toString(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.15s, X.0RS, X.1cI] */
    public void A0A(OutputStream outputStream) {
        int AD4 = AD4();
        int A03 = C0RS.A03(AD4) + AD4;
        if (A03 > 4096) {
            A03 = 4096;
        }
        ?? r1 = new AbstractC31451cI(outputStream, A03) { // from class: X.15s
            public final OutputStream A00;

            {
                super(A03);
                if (outputStream != null) {
                    this.A00 = outputStream;
                    return;
                }
                throw new NullPointerException("out");
            }

            @Override // X.C0RT
            public void A00(byte[] bArr, int i, int i2) {
                int i3 = this.A02;
                int i4 = super.A00;
                int i5 = i3 - i4;
                if (i5 >= i2) {
                    System.arraycopy(bArr, i, this.A03, i4, i2);
                    super.A00 += i2;
                    this.A01 += i2;
                    return;
                }
                byte[] bArr2 = this.A03;
                System.arraycopy(bArr, i, bArr2, i4, i5);
                int i6 = i + i5;
                int i7 = i2 - i5;
                super.A00 = i3;
                this.A01 += i5;
                A0U();
                if (i7 <= i3) {
                    System.arraycopy(bArr, i6, bArr2, 0, i7);
                    super.A00 = i7;
                } else {
                    this.A00.write(bArr, i6, i7);
                }
                this.A01 += i7;
            }

            @Override // X.C0RS
            public void A0F(int i) {
                A0V(10);
                A0S(i);
            }

            @Override // X.C0RS
            public void A0H(int i, int i2) {
                A0V(14);
                A0S((i << 3) | 5);
                byte[] bArr = this.A03;
                int i3 = super.A00;
                int i4 = i3 + 1;
                super.A00 = i4;
                bArr[i3] = (byte) (i2 & 255);
                int i5 = i4 + 1;
                super.A00 = i5;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                int i6 = i5 + 1;
                super.A00 = i6;
                bArr[i5] = (byte) ((i2 >> 16) & 255);
                super.A00 = i6 + 1;
                bArr[i6] = (byte) ((i2 >> 24) & 255);
                this.A01 += 4;
            }

            @Override // X.C0RS
            public void A0I(int i, int i2) {
                A0V(20);
                A0S((i << 3) | 0);
                if (i2 >= 0) {
                    A0S(i2);
                } else {
                    A0T(i2);
                }
            }

            @Override // X.C0RS
            public void A0J(int i, int i2) {
                A0F((i << 3) | i2);
            }

            @Override // X.C0RS
            public void A0K(int i, int i2) {
                A0V(20);
                A0S((i << 3) | 0);
                A0S(i2);
            }

            @Override // X.C0RS
            public void A0L(int i, long j) {
                A0V(18);
                A0S((i << 3) | 1);
                byte[] bArr = this.A03;
                int i2 = super.A00;
                int i3 = i2 + 1;
                super.A00 = i3;
                bArr[i2] = (byte) (j & 255);
                int i4 = i3 + 1;
                super.A00 = i4;
                bArr[i3] = (byte) ((j >> 8) & 255);
                int i5 = i4 + 1;
                super.A00 = i5;
                bArr[i4] = (byte) ((j >> 16) & 255);
                int i6 = i5 + 1;
                super.A00 = i6;
                bArr[i5] = (byte) (255 & (j >> 24));
                int i7 = i6 + 1;
                super.A00 = i7;
                bArr[i6] = (byte) (((int) (j >> 32)) & 255);
                int i8 = i7 + 1;
                super.A00 = i8;
                bArr[i7] = (byte) (((int) (j >> 40)) & 255);
                int i9 = i8 + 1;
                super.A00 = i9;
                bArr[i8] = (byte) (((int) (j >> 48)) & 255);
                super.A00 = i9 + 1;
                bArr[i9] = (byte) (((int) (j >> 56)) & 255);
                this.A01 += 8;
            }

            @Override // X.C0RS
            public void A0M(int i, long j) {
                A0V(20);
                A0S((i << 3) | 0);
                A0T(j);
            }

            @Override // X.C0RS
            public void A0N(int i, C0AN c0an) {
                A0F((i << 3) | 2);
                A0F(c0an.A03());
                C02230Aj c02230Aj = (C02230Aj) c0an;
                A00(c02230Aj.bytes, c02230Aj.A07(), c02230Aj.A03());
            }

            @Override // X.C0RS
            public void A0O(int i, C0AX c0ax) {
                A0F((i << 3) | 2);
                A0F(c0ax.AD4());
                c0ax.AWK(this);
            }

            @Override // X.C0RS
            public void A0P(int i, String str) {
                int A00;
                A0F((i << 3) | 2);
                try {
                    int length = str.length();
                    int i2 = length * 3;
                    int A032 = C0RS.A03(i2);
                    int i3 = A032 + i2;
                    int i4 = this.A02;
                    if (i3 > i4) {
                        byte[] bArr = new byte[i2];
                        int A002 = C09780ek.A00.A00(str, bArr, 0, i2);
                        A0F(A002);
                        A00(bArr, 0, A002);
                        return;
                    }
                    if (i3 > i4 - super.A00) {
                        A0U();
                    }
                    int A033 = C0RS.A03(length);
                    int i5 = super.A00;
                    try {
                        try {
                            if (A033 != A032) {
                                A00 = C09780ek.A00(str);
                                A0S(A00);
                                super.A00 = C09780ek.A00.A00(str, this.A03, super.A00, A00);
                            } else {
                                int i6 = i5 + A033;
                                super.A00 = i6;
                                int A003 = C09780ek.A00.A00(str, this.A03, i6, i4 - i6);
                                super.A00 = i5;
                                A00 = (A003 - i5) - A033;
                                A0S(A00);
                                super.A00 = A003;
                            }
                            this.A01 += A00;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new C24701Cn(e);
                        }
                    } catch (C24811Cy e2) {
                        this.A01 -= super.A00 - i5;
                        super.A00 = i5;
                        throw e2;
                    }
                } catch (C24811Cy e3) {
                    A0R(str, e3);
                }
            }

            @Override // X.C0RS
            public void A0Q(int i, boolean z) {
                A0V(11);
                A0S((i << 3) | 0);
                byte b = z ? (byte) 1 : (byte) 0;
                byte[] bArr = this.A03;
                int i2 = super.A00;
                super.A00 = i2 + 1;
                bArr[i2] = b;
                this.A01++;
            }

            public final void A0U() {
                this.A00.write(this.A03, 0, super.A00);
                super.A00 = 0;
            }

            public final void A0V(int i) {
                if (this.A02 - super.A00 < i) {
                    A0U();
                }
            }
        };
        r1.A0F(AD4);
        AWK(r1);
        if (r1.A00 > 0) {
            r1.A0U();
        }
    }

    public byte[] A0B() {
        try {
            int AD4 = AD4();
            byte[] bArr = new byte[AD4];
            C09810en c09810en = new C09810en(bArr, AD4);
            AWK(c09810en);
            if (c09810en.A0E() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            StringBuilder A0P = C000200d.A0P("Serializing ");
            A0P.append(getClass().getName());
            A0P.append(" to a ");
            A0P.append("byte array");
            A0P.append(" threw an IOException (should never happen).");
            throw new RuntimeException(A0P.toString(), e);
        }
    }
}
