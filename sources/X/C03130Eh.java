package X;

/* renamed from: X.0Eh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03130Eh {
    public static volatile C03130Eh A02;
    public boolean A00;
    public final C03100Ee A01 = new C03100Ee();

    public static C03130Eh A00() {
        if (A02 == null) {
            synchronized (C03130Eh.class) {
                if (A02 == null) {
                    A02 = new C03130Eh();
                }
            }
        }
        return A02;
    }
}
