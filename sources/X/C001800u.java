package X;

/* renamed from: X.00u  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C001800u {
    public final long A00;
    public final C004301z A01;
    public final C008103m A02;
    public final InterfaceC004201y A03;
    public final String A04;

    public C001800u(AnonymousClass012 anonymousClass012, InterfaceC004201y interfaceC004201y, C008103m c008103m, String str, C004301z c004301z) {
        this.A03 = interfaceC004201y;
        this.A04 = str;
        this.A01 = c004301z;
        if (anonymousClass012.A00 != null) {
            this.A00 = System.nanoTime();
            this.A02 = c008103m;
            return;
        }
        throw null;
    }
}
