package X;

/* renamed from: X.06L  reason: invalid class name */
/* loaded from: classes.dex */
public class C06L {
    public static volatile C06L A02;
    public final C01B A00;
    public final C003701t A01;

    public C06L(C003701t c003701t, C01B c01b) {
        this.A01 = c003701t;
        this.A00 = c01b;
    }

    public static C06L A00() {
        if (A02 == null) {
            synchronized (C06L.class) {
                if (A02 == null) {
                    A02 = new C06L(C003701t.A00(), C01B.A00());
                }
            }
        }
        return A02;
    }

    public int A01() {
        int A03 = this.A01.A03(471);
        if (A03 <= 0) {
            A03 = this.A00.A07(C01C.A2p);
        }
        return A03 & 124;
    }
}
