package X;

import android.util.Pair;

/* renamed from: X.0z0 */
/* loaded from: classes.dex */
public abstract class AbstractC21230z0 {
    public static final AbstractC21230z0 A00 = new AbstractC21230z0() { // from class: X.1Z8
        @Override // X.AbstractC21230z0
        public int A00() {
            return 0;
        }

        @Override // X.AbstractC21230z0
        public int A01() {
            return 0;
        }

        @Override // X.AbstractC21230z0
        public int A04(Object obj) {
            return -1;
        }

        @Override // X.AbstractC21230z0
        public C21210yy A08(int i, C21210yy c21210yy, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // X.AbstractC21230z0
        public C21220yz A0B(int i, C21220yz c21220yz, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // X.AbstractC21230z0
        public Object A0C(int i) {
            throw new IndexOutOfBoundsException();
        }
    };

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C21210yy A08(int i, C21210yy c21210yy, boolean z);

    public abstract C21220yz A0B(int i, C21220yz c21220yz, boolean z, long j);

    public abstract Object A0C(int i);

    public int A02(int i, int i2, boolean z) {
        if (i2 == 0) {
            int i3 = i + 1;
            if (i == A06(z)) {
                return -1;
            }
            return i3;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == A06(z) ? A05(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final int A03(int i, C21210yy c21210yy, C21220yz c21220yz, int i2, boolean z) {
        int i3 = A08(i, c21210yy, false).A00;
        if (A0A(i3, c21220yz).A01 == i) {
            int A02 = A02(i3, i2, z);
            if (A02 == -1) {
                return -1;
            }
            return A0A(A02, c21220yz).A00;
        }
        return i + 1;
    }

    public int A05(boolean z) {
        return A0D() ? -1 : 0;
    }

    public int A06(boolean z) {
        if (A0D()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair A07(C21220yz c21220yz, C21210yy c21210yy, int i, long j, long j2) {
        C002701i.A17(i, A01());
        A0B(i, c21220yz, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        int i2 = c21220yz.A00;
        long j3 = 0 + j;
        long j4 = A08(i2, c21210yy, true).A01;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < c21220yz.A01) {
            j3 -= j4;
            i2++;
            j4 = A08(i2, c21210yy, true).A01;
        }
        return Pair.create(c21210yy.A04, Long.valueOf(j3));
    }

    public C21210yy A09(Object obj, C21210yy c21210yy) {
        return A08(A04(obj), c21210yy, true);
    }

    public final C21220yz A0A(int i, C21220yz c21220yz) {
        return A0B(i, c21220yz, false, 0L);
    }

    public final boolean A0D() {
        return A01() == 0;
    }
}
