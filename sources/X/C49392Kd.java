package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Kd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49392Kd {
    public C0HK A02;
    public final C018508q A03;
    public final AnonymousClass272 A04;
    public final C50942Ty A05;
    public final C50952Tz A06;
    public int A01 = 4;
    public int A00 = 0;

    public C49392Kd(C018508q c018508q, C50952Tz c50952Tz, AnonymousClass272 anonymousClass272, C50942Ty c50942Ty) {
        this.A03 = c018508q;
        this.A06 = c50952Tz;
        this.A04 = anonymousClass272;
        this.A05 = c50942Ty;
    }

    public final List A00() {
        C468728p c468728p;
        ArrayList arrayList = new ArrayList();
        for (String str : this.A06.A03) {
            C468628o A06 = this.A04.A06(str);
            if (A06 != null && (c468728p = A06.A04) != null && c468728p.A00 == 0 && !A06.A01) {
                arrayList.add(A06);
            }
        }
        return arrayList;
    }

    public void A01(C2U2 c2u2) {
        List<C468628o> list = c2u2.A01;
        if (list != null) {
            for (C468628o c468628o : list) {
                this.A04.A09(c468628o, this.A06.A00);
            }
        }
        c2u2.A01 = A00();
        C018508q c018508q = this.A03;
        c018508q.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, c2u2, 24));
    }
}
