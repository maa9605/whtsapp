package X;

/* renamed from: X.28F  reason: invalid class name */
/* loaded from: classes2.dex */
public class C28F {
    public static volatile C28F A08;
    public C2DU A00;
    public String A01;
    public final C02E A02;
    public final C001200o A03;
    public final C02F A04;
    public final C000500h A05;
    public final C2DT A06;
    public final InterfaceC002901k A07;

    public C28F(C001200o c001200o, InterfaceC002901k interfaceC002901k, C02E c02e, C02F c02f, C000500h c000500h, C2DT c2dt) {
        this.A03 = c001200o;
        this.A07 = interfaceC002901k;
        this.A02 = c02e;
        this.A04 = c02f;
        this.A05 = c000500h;
        this.A06 = c2dt;
    }

    public static C28F A00() {
        if (A08 == null) {
            synchronized (C28F.class) {
                if (A08 == null) {
                    A08 = new C28F(C001200o.A01, C002801j.A00(), C02E.A00(), C02F.A00(), C000500h.A00(), C2DT.A00());
                }
            }
        }
        return A08;
    }

    public void A01() {
        C2DU c2du = this.A00;
        if (c2du != null) {
            this.A03.A00.unregisterReceiver(c2du);
            this.A00 = null;
        }
    }
}
