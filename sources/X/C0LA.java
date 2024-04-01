package X;

/* renamed from: X.0LA  reason: invalid class name */
/* loaded from: classes.dex */
public class C0LA {
    public static volatile C0LA A03;
    public final C01B A00;
    public final C0LC A01 = new AnonymousClass064() { // from class: X.0LC
    };
    public volatile boolean A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0LC] */
    public C0LA(C01B c01b) {
        this.A00 = c01b;
    }

    public static C0LA A00() {
        if (A03 == null) {
            synchronized (C0LA.class) {
                if (A03 == null) {
                    A03 = new C0LA(C01B.A00());
                }
            }
        }
        return A03;
    }

    public void A01(boolean z) {
        if (this.A02 != z) {
            if (!z || this.A00.A0E(C01C.A1C)) {
                this.A02 = z;
                for (C0LB c0lb : this.A01.A00) {
                    c0lb.AOe();
                }
            }
        }
    }
}
