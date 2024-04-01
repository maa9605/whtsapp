package X;

/* renamed from: X.2Av */
/* loaded from: classes2.dex */
public class C47342Av {
    public static volatile C47342Av A06;
    public final C01B A00;
    public final C42071uz A01;
    public final C001200o A02;
    public final C005102h A03;
    public final C002301c A04;
    public final C0EE A05;

    public C47342Av(C001200o c001200o, C01B c01b, C002301c c002301c, C0EE c0ee, C005102h c005102h, C42071uz c42071uz) {
        this.A02 = c001200o;
        this.A00 = c01b;
        this.A04 = c002301c;
        this.A05 = c0ee;
        this.A03 = c005102h;
        this.A01 = c42071uz;
    }

    public static C47342Av A00() {
        if (A06 == null) {
            synchronized (C47342Av.class) {
                if (A06 == null) {
                    A06 = new C47342Av(C001200o.A01, C01B.A00(), C002301c.A00(), C0EE.A00(), C005102h.A00(), C42071uz.A00());
                }
            }
        }
        return A06;
    }
}
