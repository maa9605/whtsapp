package X;

import android.util.Pair;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1zR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44661zR extends AbstractC44571zI {
    public final C44581zJ A00;
    public final C0FO A01;
    public final AnonymousClass012 A02;
    public final C05A A03;
    public final C05M A04;
    public final C0CB A05;

    public C44661zR(AnonymousClass012 anonymousClass012, C05A c05a, C05M c05m, C0FO c0fo, C44581zJ c44581zJ, C0CB c0cb, C44351yv c44351yv) {
        super(c44351yv);
        this.A02 = anonymousClass012;
        this.A03 = c05a;
        this.A04 = c05m;
        this.A01 = c0fo;
        this.A00 = c44581zJ;
        this.A05 = c0cb;
    }

    public final void A08(C44671zS c44671zS, AbstractC005302j abstractC005302j) {
        C0IT A07 = this.A04.A07(abstractC005302j);
        C0CB c0cb = this.A05;
        long j = c44671zS.A04;
        c0cb.A0A(abstractC005302j, j);
        if (A07 == null || !A07.A0S) {
            return;
        }
        A07.A0S = false;
        this.A03.A0C(A07);
        this.A01.A01();
        super.A00.A0G(Collections.singleton(new C44601zL(null, abstractC005302j, false, j, null, false, this.A00.A02(abstractC005302j, false))));
    }

    public final void A09(C44671zS c44671zS, AbstractC005302j abstractC005302j) {
        C0CB c0cb = this.A05;
        boolean z = c0cb.A07(abstractC005302j).A0E;
        boolean z2 = c44671zS.A01;
        if (!z2 && z) {
            c0cb.A0B(abstractC005302j, false, 0L);
        } else if (!z2 || z) {
        } else {
            AbstractCollection abstractCollection = (AbstractCollection) c0cb.A0F();
            if (abstractCollection.size() < 3) {
                A08(c44671zS, abstractC005302j);
                return;
            }
            Iterator it = abstractCollection.iterator();
            long j = Long.MAX_VALUE;
            AbstractC005302j abstractC005302j2 = null;
            while (it.hasNext()) {
                AbstractC005302j abstractC005302j3 = (AbstractC005302j) it.next();
                long A02 = c0cb.A02(abstractC005302j3);
                if (A02 < j) {
                    abstractC005302j2 = abstractC005302j3;
                    j = A02;
                }
            }
            Pair pair = new Pair(abstractC005302j2, Long.valueOf(j));
            AbstractC005302j abstractC005302j4 = (AbstractC005302j) pair.first;
            if (((Number) pair.second).longValue() >= c44671zS.A04) {
                return;
            }
            c0cb.A0B(abstractC005302j4, false, 0L);
            A08(c44671zS, abstractC005302j);
        }
    }
}
