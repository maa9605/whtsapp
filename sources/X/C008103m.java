package X;

/* renamed from: X.03m  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C008103m {
    public static volatile C008103m A03;
    public final C003701t A00;
    public final InterfaceC004201y A01;
    public volatile Boolean A02;

    public C008103m(C003701t c003701t, InterfaceC004201y interfaceC004201y) {
        this.A00 = c003701t;
        this.A01 = interfaceC004201y;
    }

    public static C008103m A00() {
        if (A03 == null) {
            synchronized (C008103m.class) {
                if (A03 == null) {
                    A03 = new C008103m(C003701t.A00(), C03U.A00());
                }
            }
        }
        return A03;
    }

    public final boolean A01() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(this.A00.A0C(433));
                }
            }
        }
        return this.A02.booleanValue();
    }
}
