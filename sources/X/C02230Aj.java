package X;

/* renamed from: X.0Aj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C02230Aj extends AbstractC02240Ak {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    public int A07() {
        return 0;
    }

    public C02230Aj(byte[] bArr) {
        this.bytes = bArr;
    }

    @Override // X.C0AN
    public byte A02(int i) {
        return this.bytes[i];
    }

    @Override // X.C0AN
    public int A03() {
        return this.bytes.length;
    }

    @Override // X.C0AN
    public final C0RO A04() {
        byte[] bArr = this.bytes;
        int A07 = A07();
        int A03 = A03();
        C0RO c0ro = new C0RO(bArr, A07, A03, true);
        try {
            c0ro.A04(A03);
            return c0ro;
        } catch (C0JX e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // X.C0AN
    public void A05(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.bytes, i, bArr, i2, i3);
    }

    @Override // X.C0AN
    public final boolean equals(Object obj) {
        int A03;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C0AN) && (A03 = A03()) == ((C0AN) obj).A03()) {
            if (A03 == 0) {
                return true;
            }
            if (obj instanceof C02230Aj) {
                C02230Aj c02230Aj = (C02230Aj) obj;
                int i = this.hash;
                int i2 = c02230Aj.hash;
                if (i == 0 || i2 == 0 || i == i2) {
                    int A032 = c02230Aj.A03();
                    if (A03 <= A032) {
                        if (0 + A03 <= A032) {
                            byte[] bArr = this.bytes;
                            byte[] bArr2 = c02230Aj.bytes;
                            int A07 = A07();
                            int i3 = A03 + A07;
                            int A072 = c02230Aj.A07() + 0;
                            while (A07 < i3) {
                                if (bArr[A07] != bArr2[A072]) {
                                    return false;
                                }
                                A07++;
                                A072++;
                            }
                            return true;
                        }
                        StringBuilder A0R = C000200d.A0R("Ran off end of other: ", 0, ", ", A03, ", ");
                        A0R.append(A032);
                        throw new IllegalArgumentException(A0R.toString());
                    }
                    StringBuilder sb = new StringBuilder("Length too large: ");
                    sb.append(A03);
                    sb.append(A03);
                    throw new IllegalArgumentException(sb.toString());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }
}
