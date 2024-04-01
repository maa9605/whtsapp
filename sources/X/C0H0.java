package X;

/* renamed from: X.0H0  reason: invalid class name */
/* loaded from: classes.dex */
public class C0H0 {
    public static volatile C0H0 A03;
    public final C05E A00;
    public final C05C A01;
    public final C05L A02;

    public C0H0(C05C c05c, C05L c05l, C05E c05e) {
        this.A01 = c05c;
        this.A02 = c05l;
        this.A00 = c05e;
    }

    public static C0H0 A00() {
        if (A03 == null) {
            synchronized (C0H0.class) {
                if (A03 == null) {
                    A03 = new C0H0(C05C.A00(), C05L.A00(), C05E.A00());
                }
            }
        }
        return A03;
    }

    public static final void A01(AnonymousClass092 anonymousClass092) {
        boolean z = anonymousClass092.A0p > 0;
        StringBuilder A0P = C000200d.A0P("SendCountMessageStore/validateMessage/message must have row_id set; key=");
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        C000200d.A1L(A0P, anonymousClass094, z);
        C000200d.A1L(C000200d.A0P("SendCountMessageStore/validateMessage/message in main storage; key="), anonymousClass094, anonymousClass092.A09 == 1);
    }

    public boolean A02() {
        String A02 = this.A01.A02("send_count_ready");
        return A02 != null && Long.parseLong(A02) == 1;
    }
}
