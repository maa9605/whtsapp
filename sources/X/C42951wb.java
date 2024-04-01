package X;

/* renamed from: X.1wb  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42951wb {
    public static volatile C42951wb A03;
    public final C01B A00;
    public final C42961wc A01;
    public final C42991wf A02;

    public C42951wb(AbstractC000600i abstractC000600i, C001200o c001200o, C01B c01b, C04Z c04z, C42961wc c42961wc) {
        this.A02 = new C42991wf(c001200o.A00, abstractC000600i, c04z);
        this.A00 = c01b;
        this.A01 = c42961wc;
    }

    public static C42951wb A00() {
        if (A03 == null) {
            synchronized (C42951wb.class) {
                if (A03 == null) {
                    A03 = new C42951wb(AbstractC000600i.A00(), C001200o.A01, C01B.A00(), C04Z.A00(), C42961wc.A00());
                }
            }
        }
        return A03;
    }
}
