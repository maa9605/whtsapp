package X;

/* renamed from: X.2AQ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AQ {
    public static volatile C2AQ A01;
    public final AnonymousClass011 A00;

    public C2AQ(AnonymousClass011 anonymousClass011) {
        this.A00 = anonymousClass011;
    }

    public static C2AQ A00() {
        if (A01 == null) {
            synchronized (C2AQ.class) {
                if (A01 == null) {
                    A01 = new C2AQ(AnonymousClass011.A00());
                }
            }
        }
        return A01;
    }
}
