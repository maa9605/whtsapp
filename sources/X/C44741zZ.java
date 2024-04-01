package X;

/* renamed from: X.1zZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44741zZ extends AbstractC44571zI {
    public final C2BM A00;
    public final C44581zJ A01;
    public final AnonymousClass012 A02;
    public final C05M A03;

    public C44741zZ(AnonymousClass012 anonymousClass012, C05M c05m, C44581zJ c44581zJ, C44351yv c44351yv, C2BM c2bm) {
        super(c44351yv);
        this.A02 = anonymousClass012;
        this.A03 = c05m;
        this.A01 = c44581zJ;
        this.A00 = c2bm;
    }

    public final void A08(C44751za c44751za) {
        C05M c05m = this.A03;
        AbstractC005302j abstractC005302j = c44751za.A01;
        if (c05m.A07(abstractC005302j) == null) {
            return;
        }
        C2BM c2bm = this.A00;
        if (c2bm != null) {
            boolean z = c44751za.A02;
            boolean z2 = c44751za.A03;
            C44591zK c44591zK = c44751za.A00;
            int A00 = C44591zK.A00(c2bm.A01.A02(abstractC005302j, true), c44591zK);
            if (A00 != 2 && A00 != 1) {
                c2bm.A01(abstractC005302j, z, z2, c44591zK);
                return;
            } else {
                c2bm.A02.A0M(abstractC005302j, null, !z2, z);
                return;
            }
        }
        throw null;
    }
}
