package X;

/* renamed from: X.2CO  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2CO {
    public static C2CO A00() {
        if (C2CR.A00 == null) {
            synchronized (C2CR.class) {
                if (C2CR.A00 == null) {
                    C2CR.A00 = new C2CR();
                }
            }
        }
        return C2CR.A00;
    }
}
