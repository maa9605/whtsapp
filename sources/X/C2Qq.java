package X;

/* renamed from: X.2Qq  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Qq {
    public static volatile C2Qq A06;
    public final C01B A00;
    public final C0EL A01;
    public final C42331vZ A02;
    public final C47692Cf A03;
    public final C41451tw A04;
    public final AnonymousClass035 A05;

    public C2Qq(C0EL c0el, C01B c01b, C47692Cf c47692Cf, AnonymousClass035 anonymousClass035, C41451tw c41451tw, C42331vZ c42331vZ) {
        this.A01 = c0el;
        this.A00 = c01b;
        this.A03 = c47692Cf;
        this.A05 = anonymousClass035;
        this.A04 = c41451tw;
        this.A02 = c42331vZ;
    }

    public static C2Qq A00() {
        if (A06 == null) {
            synchronized (C2Qq.class) {
                if (A06 == null) {
                    A06 = new C2Qq(C0EL.A00(), C01B.A00(), C47692Cf.A00(), AnonymousClass035.A00(), C41451tw.A00(), C42331vZ.A00());
                }
            }
        }
        return A06;
    }
}
