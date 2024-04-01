package X;

/* renamed from: X.0yo */
/* loaded from: classes.dex */
public final class C21110yo {
    public static final C219010g A0D = new C219010g(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC21230z0 A03;
    public final C219010g A04;
    public final C219010g A05;
    public final C220910z A06;
    public final C222311n A07;
    public final Object A08;
    public final boolean A09;
    public volatile long A0A;
    public volatile long A0B;
    public volatile long A0C;

    public C21110yo(AbstractC21230z0 abstractC21230z0, Object obj, C219010g c219010g, long j, long j2, int i, boolean z, C220910z c220910z, C222311n c222311n, C219010g c219010g2, long j3, long j4, long j5) {
        this.A03 = abstractC21230z0;
        this.A08 = obj;
        this.A05 = c219010g;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A09 = z;
        this.A06 = c220910z;
        this.A07 = c222311n;
        this.A04 = c219010g2;
        this.A0A = j3;
        this.A0C = j4;
        this.A0B = j5;
    }

    public static C21110yo A00(long j, C222311n c222311n) {
        AbstractC21230z0 abstractC21230z0 = AbstractC21230z0.A00;
        C219010g c219010g = A0D;
        return new C21110yo(abstractC21230z0, null, c219010g, j, -9223372036854775807L, 1, false, C220910z.A03, c222311n, c219010g, j, 0L, j);
    }

    public C21110yo A01(C219010g c219010g, long j, long j2) {
        long j3 = j2;
        AbstractC21230z0 abstractC21230z0 = this.A03;
        Object obj = this.A08;
        if (!c219010g.A00()) {
            j3 = -9223372036854775807L;
        }
        return new C21110yo(abstractC21230z0, obj, c219010g, j, j3, this.A00, this.A09, this.A06, this.A07, c219010g, j, 0L, j);
    }

    public C21110yo A02(C219010g c219010g, long j, long j2, long j3) {
        long j4 = j2;
        AbstractC21230z0 abstractC21230z0 = this.A03;
        Object obj = this.A08;
        if (!c219010g.A00()) {
            j4 = -9223372036854775807L;
        }
        return new C21110yo(abstractC21230z0, obj, c219010g, j, j4, this.A00, this.A09, this.A06, this.A07, this.A04, this.A0A, j3, j);
    }

    public C21110yo A03(C220910z c220910z, C222311n c222311n) {
        return new C21110yo(this.A03, this.A08, this.A05, this.A02, this.A01, this.A00, this.A09, c220910z, c222311n, this.A04, this.A0A, this.A0C, this.A0B);
    }

    public C219010g A04(boolean z, C21220yz c21220yz) {
        AbstractC21230z0 abstractC21230z0 = this.A03;
        if (abstractC21230z0.A0D()) {
            return A0D;
        }
        return new C219010g(abstractC21230z0.A0C(abstractC21230z0.A0A(abstractC21230z0.A05(z), c21220yz).A00));
    }
}
