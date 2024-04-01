package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0RS */
/* loaded from: classes.dex */
public abstract class C0RS extends C0RT {
    public static final Logger A01 = Logger.getLogger(C0RS.class.getName());
    public static final boolean A02 = C09760ei.A02;
    public static final long A00 = C09760ei.A00;

    public static int A03(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int A0C(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract int A0E();

    public abstract void A0F(int i);

    public abstract void A0H(int i, int i2);

    public abstract void A0I(int i, int i2);

    public abstract void A0J(int i, int i2);

    public abstract void A0K(int i, int i2);

    public abstract void A0L(int i, long j);

    public abstract void A0M(int i, long j);

    public abstract void A0N(int i, C0AN c0an);

    public abstract void A0O(int i, C0AX c0ax);

    public abstract void A0P(int i, String str);

    public abstract void A0Q(int i, boolean z);

    public C0RS() {
    }

    public C0RS(C24691Cm c24691Cm) {
    }

    public static int A00(int i) {
        return A03((i << 3) | 0) + 1;
    }

    public static int A01(int i) {
        return A03((i << 3) | 0) + 8;
    }

    public static int A02(int i) {
        if (i >= 0) {
            return A03(i);
        }
        return 10;
    }

    public static int A04(int i, int i2) {
        return A03((i << 3) | 0) + A02(i2);
    }

    public static int A05(int i, int i2) {
        return A02(i2) + A03((i << 3) | 0);
    }

    public static int A06(int i, int i2) {
        return A03(i2) + A03((i << 3) | 0);
    }

    public static int A07(int i, long j) {
        return A03((i << 3) | 0) + A0C(j);
    }

    public static int A08(int i, long j) {
        return A0C(j) + A03((i << 3) | 0);
    }

    public static int A09(int i, C0AN c0an) {
        int A03 = A03((i << 3) | 0);
        int A032 = c0an.A03();
        return A03 + A03(A032) + A032;
    }

    public static int A0A(int i, C0AX c0ax) {
        int A03 = A03((i << 3) | 0);
        int AD4 = c0ax.AD4();
        return A03 + A03(AD4) + AD4;
    }

    public static int A0B(int i, String str) {
        return A0D(str) + A03((i << 3) | 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int A0D(String str) {
        int i;
        try {
            str = C09780ek.A00(str);
            i = str;
        } catch (C24811Cy unused) {
            i = str.getBytes(C02220Ai.A00).length;
        }
        return A03(i) + i;
    }

    public final void A0G(int i, double d) {
        A0L(i, Double.doubleToRawLongBits(d));
    }

    public final void A0R(String str, C24811Cy c24811Cy) {
        A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c24811Cy);
        byte[] bytes = str.getBytes(C02220Ai.A00);
        try {
            int length = bytes.length;
            A0F(length);
            A00(bytes, 0, length);
        } catch (C24701Cn e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new C24701Cn(e2);
        }
    }
}
