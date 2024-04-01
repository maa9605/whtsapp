package X;

/* renamed from: X.1O1  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1O1 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0C9 A01;
    public final /* synthetic */ AnonymousClass092 A02;

    public /* synthetic */ C1O1(C0C9 c0c9, AnonymousClass092 anonymousClass092, int i) {
        this.A01 = c0c9;
        this.A02 = anonymousClass092;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0C9 c0c9 = this.A01;
        AnonymousClass092 anonymousClass092 = this.A02;
        int i = this.A00;
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        if (anonymousClass094.A02 && !anonymousClass092.A0w) {
            long A04 = c0c9.A0C.A04();
            C0E3 c0e3 = c0c9.A05;
            long j = A04 - anonymousClass092.A0u;
            long j2 = A04 - anonymousClass092.A0y;
            c0e3.A0E(anonymousClass092, 4, 0, false, false, 0, 0, false, 0, 0, 0, j, j2, j2);
        }
        if (c0c9.A0k(anonymousClass092, i)) {
            c0c9.A0M.A04(anonymousClass094.A00);
        }
    }
}
