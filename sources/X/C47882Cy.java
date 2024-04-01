package X;

/* renamed from: X.2Cy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47882Cy {
    public static volatile C47882Cy A02;
    public final AnonymousClass011 A00;
    public final C2D8 A01;

    public C47882Cy(AnonymousClass011 anonymousClass011, C2D8 c2d8) {
        this.A00 = anonymousClass011;
        this.A01 = c2d8;
    }

    public static C47882Cy A00() {
        if (A02 == null) {
            synchronized (C47882Cy.class) {
                if (A02 == null) {
                    AnonymousClass011 A00 = AnonymousClass011.A00();
                    if (C2D8.A01 == null) {
                        synchronized (C2D8.class) {
                            if (C2D8.A01 == null) {
                                C2D8.A01 = new C2D8(C2D9.A00());
                            }
                        }
                    }
                    A02 = new C47882Cy(A00, C2D8.A01);
                }
            }
        }
        return A02;
    }
}
