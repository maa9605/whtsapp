package X;

import android.app.Activity;

/* renamed from: X.4Bg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C90504Bg implements InterfaceC467528c {
    public final C018508q A00;
    public final C0E7 A01;
    public final C001200o A02;
    public final C013306k A03;
    public final C013606n A04;
    public final C45A A05;
    public final C894947f A06;
    public final C28S A07;
    public final C463026g A08;
    public final C0DV A09;
    public final C49682Lx A0A;
    public final InterfaceC002901k A0B;

    @Override // X.InterfaceC467528c
    public long ACH() {
        return 604800000L;
    }

    public C90504Bg(C018508q c018508q, C001200o c001200o, InterfaceC002901k interfaceC002901k, C49682Lx c49682Lx, C0DV c0dv, C0E7 c0e7, C894947f c894947f, C463026g c463026g, C013606n c013606n, C013306k c013306k, C45A c45a, C28S c28s) {
        this.A00 = c018508q;
        this.A02 = c001200o;
        this.A0B = interfaceC002901k;
        this.A0A = c49682Lx;
        this.A09 = c0dv;
        this.A01 = c0e7;
        this.A06 = c894947f;
        this.A08 = c463026g;
        this.A04 = c013606n;
        this.A03 = c013306k;
        this.A05 = c45a;
        this.A07 = c28s;
    }

    @Override // X.InterfaceC467528c
    public void ARC(AnonymousClass093 anonymousClass093, C3NS c3ns, Activity activity) {
        this.A0B.ARy(new C90494Bf(this, anonymousClass093, c3ns, activity), new Void[0]);
    }

    @Override // X.InterfaceC467528c
    public void AVz(String str, InterfaceC53332eX interfaceC53332eX) {
        new C4C8(this.A02.A00, this.A00, this.A0A, this.A01, this.A06, this.A08, this.A04, this.A05, this.A07).A00(str, null, interfaceC53332eX);
    }
}
