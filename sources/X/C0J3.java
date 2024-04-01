package X;

/* renamed from: X.0J3  reason: invalid class name */
/* loaded from: classes.dex */
public class C0J3 {
    public static volatile C0J3 A02;
    public long A00;
    public final AnonymousClass012 A01;

    public C0J3(AnonymousClass012 anonymousClass012) {
        this.A01 = anonymousClass012;
    }

    public static C0J3 A00() {
        if (A02 == null) {
            synchronized (C0J3.class) {
                if (A02 == null) {
                    A02 = new C0J3(AnonymousClass012.A00());
                }
            }
        }
        return A02;
    }

    public synchronized boolean A01() {
        return this.A01.A05() <= this.A00;
    }
}
