package X;

/* renamed from: X.2Ce  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47682Ce extends C2AN {
    public static volatile C47682Ce A00;

    public C47682Ce(C47742Ck c47742Ck) {
        super(c47742Ck, 36);
    }

    public static C47682Ce A00() {
        if (A00 == null) {
            synchronized (C47682Ce.class) {
                if (A00 == null) {
                    if (C47742Ck.A03 == null) {
                        synchronized (C47742Ck.class) {
                            if (C47742Ck.A03 == null) {
                                C47742Ck.A03 = new C47742Ck(C003701t.A00(), C001200o.A01, AbstractC000600i.A00());
                            }
                        }
                    }
                    A00 = new C47682Ce(C47742Ck.A03);
                }
            }
        }
        return A00;
    }
}
