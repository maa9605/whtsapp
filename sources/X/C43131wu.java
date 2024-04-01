package X;

/* renamed from: X.1wu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43131wu {
    public static volatile C43131wu A04;
    public final C0E7 A00;
    public final AnonymousClass012 A01;
    public final AnonymousClass011 A02;
    public final C25A A03;

    public C43131wu(AnonymousClass012 anonymousClass012, AnonymousClass011 anonymousClass011, C0E7 c0e7, C25A c25a) {
        this.A01 = anonymousClass012;
        this.A02 = anonymousClass011;
        this.A00 = c0e7;
        this.A03 = c25a;
    }

    public static C43131wu A00() {
        if (A04 == null) {
            synchronized (C43131wu.class) {
                if (A04 == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    AnonymousClass011 A002 = AnonymousClass011.A00();
                    C0E7 A003 = C0E7.A00();
                    if (C25A.A02 == null) {
                        synchronized (C25A.class) {
                            if (C25A.A02 == null) {
                                C25A.A02 = new C25A(C02O.A00());
                            }
                        }
                    }
                    A04 = new C43131wu(A00, A002, A003, C25A.A02);
                }
            }
        }
        return A04;
    }

    public final int A01() {
        Integer A01 = C0HA.A01(this.A00.A04());
        if (A01 == null) {
            return 0;
        }
        return A01.intValue();
    }

    public final long A02() {
        long A05 = this.A01.A05();
        return A05 - (A05 % 86400000);
    }

    public synchronized void A03(double d, int i, int i2, boolean z, boolean z2) {
        long A02 = A02();
        int A01 = A01();
        C25B A022 = this.A03.A02(A02, i, A01, i2, z2);
        double d2 = A022.A00;
        Double.isNaN(d2);
        A022.A00 = (long) (d2 + d);
        if (z) {
            A022.A02++;
        }
        this.A03.A03(A02, i, A01, i2, z2, A022);
    }

    public synchronized void A04(int i, int i2) {
        long A02 = A02();
        int A01 = A01();
        C25A c25a = this.A03;
        C25B A022 = c25a.A02(A02, i, A01, i2, false);
        A022.A04++;
        c25a.A03(A02, i, A01, i2, false, A022);
    }

    public synchronized void A05(int i, int i2) {
        long A02 = A02();
        int A01 = A01();
        C25A c25a = this.A03;
        C25B A022 = c25a.A02(A02, i2, A01, i, false);
        A022.A05++;
        c25a.A03(A02, i2, A01, i, false, A022);
    }

    public synchronized void A06(int i, int i2) {
        long A02 = A02();
        int A01 = A01();
        C25A c25a = this.A03;
        C25B A022 = c25a.A02(A02, i, A01, i2, false);
        A022.A08++;
        c25a.A03(A02, i, A01, i2, false, A022);
    }
}
