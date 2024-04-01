package X;

import com.whatsapp.Conversation;

/* renamed from: X.1zT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44681zT extends AbstractC44571zI {
    public final C2BM A00;
    public final C44581zJ A01;
    public final AnonymousClass012 A02;
    public final C05M A03;

    public C44681zT(AnonymousClass012 anonymousClass012, C05M c05m, C44581zJ c44581zJ, C44351yv c44351yv, C2BM c2bm) {
        super(c44351yv);
        this.A02 = anonymousClass012;
        this.A03 = c05m;
        this.A01 = c44581zJ;
        this.A00 = c2bm;
    }

    public final void A08(C44691zU c44691zU) {
        C05M c05m = this.A03;
        AbstractC005302j abstractC005302j = c44691zU.A01;
        if (c05m.A07(abstractC005302j) == null) {
            return;
        }
        C2BM c2bm = this.A00;
        if (c2bm != null) {
            boolean z = c44691zU.A02;
            C44591zK c44591zK = c44691zU.A00;
            int A00 = C44591zK.A00(c2bm.A01.A02(abstractC005302j, true), c44591zK);
            if (A00 != 2 && A00 != 1) {
                c2bm.A01(abstractC005302j, z, true, c44591zK);
                return;
            }
            c2bm.A00.A0N(abstractC005302j, z, false);
            Conversation.A0S(abstractC005302j);
            return;
        }
        throw null;
    }
}
