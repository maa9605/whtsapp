package X;

/* renamed from: X.0Fd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03300Fd {
    public static volatile C03300Fd A05;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public final AnonymousClass011 A04;

    public C03300Fd(AnonymousClass011 anonymousClass011) {
        this.A04 = anonymousClass011;
    }

    public static C03300Fd A00() {
        if (A05 == null) {
            synchronized (C03300Fd.class) {
                if (A05 == null) {
                    A05 = new C03300Fd(AnonymousClass011.A00());
                }
            }
        }
        return A05;
    }

    public void A01(int i, AbstractC005302j abstractC005302j) {
        this.A00 = i;
        int i2 = C003101m.A0U(abstractC005302j) ? 2 : 1;
        this.A02 = i2;
        C36721lG c36721lG = new C36721lG();
        int i3 = this.A01;
        if (i3 > 0) {
            c36721lG.A01 = Integer.valueOf(i3);
        }
        c36721lG.A02 = Integer.valueOf(i);
        c36721lG.A00 = Integer.valueOf(i2);
        if (i == 1) {
            c36721lG.A03 = Long.valueOf(this.A03);
        }
        this.A04.A0B(c36721lG, null, false);
    }
}
