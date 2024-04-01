package X;

/* renamed from: X.1ul  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41941ul {
    public static volatile C41941ul A02;
    public final AnonymousClass011 A00;
    public final C2A6 A01;

    public C41941ul(AnonymousClass011 anonymousClass011, C2A6 c2a6) {
        this.A00 = anonymousClass011;
        this.A01 = c2a6;
    }

    public static C41941ul A00() {
        if (A02 == null) {
            synchronized (C41941ul.class) {
                if (A02 == null) {
                    A02 = new C41941ul(AnonymousClass011.A00(), C2A6.A00());
                }
            }
        }
        return A02;
    }

    public final void A01(Integer num) {
        C2A7 A03 = this.A01.A03();
        if (A03 == null) {
            return;
        }
        C0OS c0os = new C0OS();
        c0os.A02 = Long.valueOf(A03.A00);
        c0os.A01 = Long.valueOf(A03.A02);
        c0os.A00 = num;
        this.A00.A0B(c0os, null, false);
    }

    public final void A02(Integer num) {
        C2A7 A03 = this.A01.A03();
        if (A03 == null) {
            return;
        }
        C0OT c0ot = new C0OT();
        c0ot.A02 = Long.valueOf(A03.A00);
        c0ot.A01 = Long.valueOf(A03.A02);
        c0ot.A00 = num;
        this.A00.A0B(c0ot, null, false);
    }
}
