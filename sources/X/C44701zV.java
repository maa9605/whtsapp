package X;

/* renamed from: X.1zV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44701zV extends AbstractC44571zI {
    public final C44581zJ A00;
    public final C41221tZ A01;
    public final AnonymousClass012 A02;
    public final C001200o A03;
    public final C05M A04;

    public C44701zV(AnonymousClass012 anonymousClass012, C001200o c001200o, C05M c05m, C44581zJ c44581zJ, C44351yv c44351yv, C41221tZ c41221tZ) {
        super(c44351yv);
        this.A02 = anonymousClass012;
        this.A03 = c001200o;
        this.A04 = c05m;
        this.A00 = c44581zJ;
        this.A01 = c41221tZ;
    }

    public final void A08(C44711zW c44711zW) {
        AbstractC005302j abstractC005302j = c44711zW.A01;
        if (this.A04.A07(abstractC005302j) == null) {
            A06(c44711zW);
            return;
        }
        int A00 = C44591zK.A00(this.A00.A02(abstractC005302j, false), c44711zW.A00);
        if (A00 == 0) {
            A05(c44711zW);
            return;
        }
        if (A00 != 1) {
            if (A00 == 2) {
                if (c44711zW.A02) {
                    this.A01.A03(c44711zW.A01, false, true);
                } else {
                    this.A01.A01(c44711zW.A01, false);
                }
                A05(c44711zW);
                return;
            } else if (A00 != 3) {
                throw new IllegalArgumentException(C000200d.A0D("mark-chat-as-read-handler/applyMutation RangeEnclosedState is not recognized or not used = ", A00));
            }
        }
        A06(c44711zW);
    }
}
