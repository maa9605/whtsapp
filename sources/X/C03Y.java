package X;

/* renamed from: X.03Y */
/* loaded from: classes.dex */
public class C03Y {
    public static volatile C03Y A06;
    public final C02E A00;
    public final C001200o A01;
    public final C003701t A02;
    public final C02O A03;
    public final C03X A04;
    public final C03Z A05;

    public C03Y(C001200o c001200o, C003701t c003701t, C03Z c03z, C02E c02e, C03X c03x, C02O c02o) {
        this.A01 = c001200o;
        this.A02 = c003701t;
        this.A05 = c03z;
        this.A00 = c02e;
        this.A04 = c03x;
        this.A03 = c02o;
    }

    public static C03Y A00() {
        if (A06 == null) {
            synchronized (C03Y.class) {
                if (A06 == null) {
                    A06 = new C03Y(C001200o.A01, C003701t.A00(), C03Z.A00(), C02E.A00(), C03W.A00(), C02O.A00());
                }
            }
        }
        return A06;
    }
}
