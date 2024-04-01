package X;

/* renamed from: X.2E3  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2E3 {
    public static volatile C2E3 A05;
    public C2EB A00;
    public final C001200o A01;
    public final C005102h A02;
    public final C002301c A03;
    public final C2EA A04;

    public C2E3(C001200o c001200o, C002301c c002301c, C005102h c005102h, C2EA c2ea) {
        this.A01 = c001200o;
        this.A03 = c002301c;
        this.A02 = c005102h;
        this.A04 = c2ea;
    }

    public static C2E3 A00() {
        if (A05 == null) {
            synchronized (C2E3.class) {
                if (A05 == null) {
                    A05 = new C2E3(C001200o.A01, C002301c.A00(), C005102h.A00(), C2EA.A00());
                }
            }
        }
        return A05;
    }
}
