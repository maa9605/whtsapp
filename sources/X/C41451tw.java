package X;

/* renamed from: X.1tw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41451tw {
    public static volatile C41451tw A02;
    public C0JK A00;
    public final C004902f A01;

    public C41451tw(C004902f c004902f) {
        this.A01 = c004902f;
    }

    public static C41451tw A00() {
        if (A02 == null) {
            synchronized (C41451tw.class) {
                if (A02 == null) {
                    A02 = new C41451tw(C004902f.A00());
                }
            }
        }
        return A02;
    }

    public C0JK A01() {
        C0JK c0jk = this.A00;
        if (c0jk == null) {
            C0JK c0jk2 = new C0JK(this.A01);
            this.A00 = c0jk2;
            return c0jk2;
        }
        return c0jk;
    }
}
