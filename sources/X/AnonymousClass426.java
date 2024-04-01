package X;

/* renamed from: X.426  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass426 {
    public static volatile AnonymousClass426 A02;
    public final C44E A00;
    public final C44I A01;

    public AnonymousClass426() {
        C44I c44i = new C44I();
        this.A01 = c44i;
        this.A00 = new C44E(c44i);
    }

    public static AnonymousClass426 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass426.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass426();
                }
            }
        }
        return A02;
    }
}
