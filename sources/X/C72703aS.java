package X;

/* renamed from: X.3aS */
/* loaded from: classes2.dex */
public class C72703aS {
    public static volatile C72703aS A02;
    public final AbstractC000600i A00;
    public final AnonymousClass011 A01;

    public C72703aS(AbstractC000600i abstractC000600i, AnonymousClass011 anonymousClass011) {
        this.A00 = abstractC000600i;
        this.A01 = anonymousClass011;
    }

    public static C72703aS A00() {
        if (A02 == null) {
            synchronized (C72713aT.class) {
                if (A02 == null) {
                    A02 = new C72703aS(AbstractC000600i.A00(), AnonymousClass011.A00());
                }
            }
        }
        return A02;
    }

    public void A01(int i, int i2, String str) {
        if (i2 < 1) {
            return;
        }
        C36751lJ c36751lJ = new C36751lJ();
        c36751lJ.A00 = Integer.valueOf(i);
        c36751lJ.A05 = str;
        c36751lJ.A01 = Long.valueOf(i2);
        this.A01.A0B(c36751lJ, null, true);
    }
}
