package X;

/* renamed from: X.1y1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43811y1 {
    public static volatile C43811y1 A03;
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public C43811y1(C01B c01b) {
        boolean A0E = c01b.A0E(C01C.A2F);
        boolean A0E2 = c01b.A0E(C01C.A2E);
        boolean A0E3 = c01b.A0E(C01C.A2M);
        this.A01 = A0E;
        this.A00 = A0E2;
        this.A02 = A0E3;
    }

    public static C43811y1 A00() {
        if (A03 == null) {
            synchronized (C43811y1.class) {
                if (A03 == null) {
                    A03 = new C43811y1(C01B.A00());
                }
            }
        }
        return A03;
    }
}
