package X;

/* renamed from: X.2Cw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47862Cw {
    public static volatile C47862Cw A04;
    public final C000400f A00;
    public final InterfaceC002901k A01;
    public volatile AnonymousClass262 A02;
    public volatile AnonymousClass262 A03;

    public C47862Cw(InterfaceC002901k interfaceC002901k, C000400f c000400f) {
        this.A01 = interfaceC002901k;
        this.A00 = c000400f;
    }

    public static C47862Cw A00() {
        if (A04 == null) {
            synchronized (C47862Cw.class) {
                if (A04 == null) {
                    A04 = new C47862Cw(C002801j.A00(), C000400f.A00());
                }
            }
        }
        return A04;
    }

    public AnonymousClass262 A01() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass262(this.A00.A04, this.A01);
                }
            }
        }
        return this.A02;
    }
}
