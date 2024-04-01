package X;

/* renamed from: X.48a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C896848a {
    public static volatile C896848a A00;

    public static C896848a A00() {
        if (A00 == null) {
            synchronized (C896848a.class) {
                if (A00 == null) {
                    C49682Lx.A00();
                    if (C48X.A00 == null) {
                        synchronized (C48X.class) {
                            if (C48X.A00 == null) {
                                C0EU.A00();
                                C48X.A00 = new C48X();
                            }
                        }
                    }
                    C463026g.A00();
                    A00 = new C896848a();
                }
            }
        }
        return A00;
    }
}
