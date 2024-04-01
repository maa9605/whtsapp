package X;

/* renamed from: X.01B */
/* loaded from: classes.dex */
public class C01B extends C01C {
    public static final AnonymousClass039 A00 = C01C.A03("web_sync_max_unread_count", "web_sync_max_unread_count", 200, 1, 200);
    public static volatile C01B A01;

    public C01B(C001200o c001200o, C03E c03e, C006202t c006202t, C03F c03f, C02O c02o) {
        super(c001200o, c03e, c006202t, c03f, c02o);
    }

    public static C01B A00() {
        if (A01 == null) {
            synchronized (C01B.class) {
                if (A01 == null) {
                    C001200o c001200o = C001200o.A01;
                    if (C03E.A03 == null) {
                        synchronized (C03E.class) {
                            if (C03E.A03 == null) {
                                C03E.A03 = new C03E(C02O.A00());
                            }
                        }
                    }
                    A01 = new C01B(c001200o, C03E.A03, C006202t.A00(), C03F.A00(), C02O.A00());
                }
            }
        }
        return A01;
    }
}
