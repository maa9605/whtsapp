package X;

/* renamed from: X.2Q4  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Q4 {
    public static volatile C2Q4 A0H;
    public C48652Gd A00;
    public final C018508q A01;
    public final C018608r A02;
    public final C018708s A03;
    public final C000800k A04;
    public final C000400f A05;
    public final C02E A06;
    public final AnonymousClass012 A07;
    public final C001200o A08;
    public final C002301c A09;
    public final C0DK A0A;
    public final C0ED A0B;
    public final AnonymousClass011 A0C;
    public final C41771uU A0D;
    public final C42441vk A0E;
    public final C42451vl A0F;
    public final InterfaceC002901k A0G;

    public C2Q4(C001200o c001200o, AnonymousClass012 anonymousClass012, C018508q c018508q, InterfaceC002901k interfaceC002901k, AnonymousClass011 anonymousClass011, C018608r c018608r, C0ED c0ed, C02E c02e, C018708s c018708s, C002301c c002301c, C42441vk c42441vk, C000400f c000400f, C41771uU c41771uU, C42451vl c42451vl, C000800k c000800k, C0DK c0dk) {
        this.A08 = c001200o;
        this.A07 = anonymousClass012;
        this.A01 = c018508q;
        this.A0G = interfaceC002901k;
        this.A0C = anonymousClass011;
        this.A02 = c018608r;
        this.A0B = c0ed;
        this.A06 = c02e;
        this.A03 = c018708s;
        this.A09 = c002301c;
        this.A0E = c42441vk;
        this.A05 = c000400f;
        this.A0D = c41771uU;
        this.A0F = c42451vl;
        this.A04 = c000800k;
        this.A0A = c0dk;
    }

    public static C2Q4 A00() {
        if (A0H == null) {
            synchronized (C2Q4.class) {
                if (A0H == null) {
                    A0H = new C2Q4(C001200o.A01, AnonymousClass012.A00(), C018508q.A00(), C002801j.A00(), AnonymousClass011.A00(), C018608r.A02(), C0ED.A01(), C02E.A00(), C018708s.A00(), C002301c.A00(), C42441vk.A01, C000400f.A00(), C41771uU.A00(), C42451vl.A00(), C000800k.A02, C0DK.A00());
                }
            }
        }
        return A0H;
    }
}
