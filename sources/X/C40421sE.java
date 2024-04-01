package X;

/* renamed from: X.1sE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40421sE {
    public static volatile C40421sE A02;
    public final C02N A00;
    public final C40451sH A01;

    public C40421sE(C02N c02n, C40451sH c40451sH) {
        this.A01 = c40451sH;
        this.A00 = c02n;
    }

    public static C40421sE A00() {
        if (A02 == null) {
            synchronized (C40421sE.class) {
                if (A02 == null) {
                    A02 = new C40421sE(new C02N(), C40451sH.A00());
                }
            }
        }
        return A02;
    }
}
