package X;

/* renamed from: X.1uY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41811uY {
    public static volatile C41811uY A06;
    public final C01B A00;
    public final C0E6 A01;
    public final C06T A02;
    public final C0C9 A03;
    public final AnonymousClass074 A04;
    public final C003701t A05;

    public C41811uY(C003701t c003701t, C01B c01b, C0E6 c0e6, C0C9 c0c9, C06T c06t, AnonymousClass074 anonymousClass074) {
        this.A05 = c003701t;
        this.A00 = c01b;
        this.A01 = c0e6;
        this.A03 = c0c9;
        this.A02 = c06t;
        this.A04 = anonymousClass074;
    }

    public static C41811uY A00() {
        if (A06 == null) {
            synchronized (C41811uY.class) {
                if (A06 == null) {
                    C003701t A00 = C003701t.A00();
                    C002801j.A00();
                    A06 = new C41811uY(A00, C01B.A00(), C0E6.A00(), C0C9.A00(), C06T.A02, AnonymousClass074.A00());
                }
            }
        }
        return A06;
    }
}
