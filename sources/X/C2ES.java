package X;

/* renamed from: X.2ES  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2ES {
    public static volatile C2ES A02;
    public final C06T A00;
    public final C05E A01;

    public C2ES(C06T c06t, C05E c05e) {
        this.A00 = c06t;
        this.A01 = c05e;
    }

    public static C2ES A00() {
        if (A02 == null) {
            synchronized (C2ES.class) {
                if (A02 == null) {
                    A02 = new C2ES(C06T.A02, C05E.A00());
                }
            }
        }
        return A02;
    }
}
