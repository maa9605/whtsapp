package X;

/* renamed from: X.0EF  reason: invalid class name */
/* loaded from: classes.dex */
public class C0EF {
    public static volatile C0EF A03;
    public final C000500h A00;
    public final C0EC A01;
    public final C0EE A02;

    public C0EF(C0EE c0ee, C0EC c0ec, C000500h c000500h) {
        this.A02 = c0ee;
        this.A01 = c0ec;
        this.A00 = c000500h;
    }

    public static C0EF A00() {
        if (A03 == null) {
            synchronized (C0EF.class) {
                if (A03 == null) {
                    A03 = new C0EF(C0EE.A00(), C0EC.A00(), C000500h.A00());
                }
            }
        }
        return A03;
    }

    public boolean A01(AbstractC005302j abstractC005302j) {
        if (A02(abstractC005302j)) {
            return true;
        }
        return this.A02.A04() && !this.A01.A02().A00.isEmpty();
    }

    public boolean A02(AbstractC005302j abstractC005302j) {
        return C003101m.A0U(abstractC005302j) || this.A00.A0m();
    }

    public boolean A03(AnonymousClass092 anonymousClass092) {
        return A02(anonymousClass092.A0n.A00) && anonymousClass092.A0E >= 1415214000000L;
    }
}
