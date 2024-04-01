package X;

/* renamed from: X.1Zm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30041Zm extends AbstractC21230z0 {
    public static final Object A05 = new Object();
    public final long A00;
    public final long A02;
    public final boolean A04;
    public final long A01 = -9223372036854775807L;
    public final long A03 = -9223372036854775807L;

    @Override // X.AbstractC21230z0
    public int A00() {
        return 1;
    }

    @Override // X.AbstractC21230z0
    public int A01() {
        return 1;
    }

    public C30041Zm(long j, boolean z) {
        this.A00 = j;
        this.A02 = j;
        this.A04 = z;
    }

    @Override // X.AbstractC21230z0
    public int A04(Object obj) {
        return A05.equals(obj) ? 0 : -1;
    }

    @Override // X.AbstractC21230z0
    public C21210yy A08(int i, C21210yy c21210yy, boolean z) {
        Object obj;
        C002701i.A17(i, 1);
        if (z) {
            obj = A05;
        } else {
            obj = null;
        }
        long j = this.A00;
        long j2 = -0L;
        if (c21210yy != null) {
            AnonymousClass111 anonymousClass111 = AnonymousClass111.A04;
            c21210yy.A04 = obj;
            c21210yy.A00 = 0;
            c21210yy.A01 = j;
            c21210yy.A02 = j2;
            c21210yy.A03 = anonymousClass111;
            return c21210yy;
        }
        throw null;
    }

    @Override // X.AbstractC21230z0
    public C21220yz A0B(int i, C21220yz c21220yz, boolean z, long j) {
        C002701i.A17(i, 1);
        boolean z2 = this.A04;
        long j2 = this.A02;
        c21220yz.A03 = z2;
        c21220yz.A02 = j2;
        c21220yz.A00 = 0;
        c21220yz.A01 = 0;
        return c21220yz;
    }

    @Override // X.AbstractC21230z0
    public Object A0C(int i) {
        C002701i.A17(i, 1);
        return A05;
    }
}
