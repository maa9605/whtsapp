package X;

/* renamed from: X.06l */
/* loaded from: classes.dex */
public class C013406l extends AbstractC013506m {
    public static volatile C013406l A00;

    public C013406l(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C001200o c001200o, C04Z c04z) {
        super(anonymousClass012, abstractC000600i, c001200o, c04z);
    }

    public static C013406l A00() {
        if (A00 == null) {
            synchronized (C013406l.class) {
                if (A00 == null) {
                    AnonymousClass012 A002 = AnonymousClass012.A00();
                    AbstractC000600i A003 = AbstractC000600i.A00();
                    C001200o c001200o = C001200o.A01;
                    C04Z A004 = C04Z.A00();
                    C013606n.A03();
                    A00 = new C013406l(A002, A003, c001200o, A004);
                }
            }
        }
        return A00;
    }
}
