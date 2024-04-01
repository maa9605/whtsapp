package X;

import java.util.ArrayList;

/* renamed from: X.47p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C895947p {
    public static volatile C895947p A06;
    public final C0E7 A00;
    public final C0EU A01;
    public final C463026g A02;
    public final C2OR A03;
    public final C49692Lz A04;
    public final InterfaceC002901k A05;

    public C895947p(InterfaceC002901k interfaceC002901k, C2OR c2or, C0EU c0eu, C49692Lz c49692Lz, C0E7 c0e7, C463026g c463026g) {
        this.A05 = interfaceC002901k;
        this.A03 = c2or;
        this.A01 = c0eu;
        this.A04 = c49692Lz;
        this.A00 = c0e7;
        this.A02 = c463026g;
    }

    public static C895947p A00() {
        if (A06 == null) {
            synchronized (C895947p.class) {
                if (A06 == null) {
                    A06 = new C895947p(C002801j.A00(), C2OR.A02, C0EU.A00(), C49692Lz.A00, C0E7.A00(), C463026g.A00());
                }
            }
        }
        return A06;
    }

    public void A01(C49A c49a, String str, InterfaceC895747n interfaceC895747n) {
        if (!"token".equals(c49a.A00.A03)) {
            interfaceC895747n.API(str);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0FK("fbpay_pin", str));
        this.A05.ARy(new C4GL(this.A03, this.A01, this.A04, this.A00, this.A02, arrayList, interfaceC895747n, 0, null), new Void[0]);
    }
}
