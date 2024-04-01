package X;

import java.util.ArrayList;

/* renamed from: X.0j7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12260j7 {
    public static int A02;
    public AbstractC28611St A00;
    public ArrayList A01 = new ArrayList();

    public C12260j7(AbstractC28611St abstractC28611St) {
        A02++;
        this.A00 = abstractC28611St;
    }

    public final long A00(C28601Ss c28601Ss, long j) {
        AbstractC28611St abstractC28611St = c28601Ss.A06;
        if (abstractC28611St instanceof C38461oB) {
            return j;
        }
        int size = c28601Ss.A07.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC12230j4 interfaceC12230j4 = (InterfaceC12230j4) c28601Ss.A07.get(i);
            if (interfaceC12230j4 instanceof C28601Ss) {
                C28601Ss c28601Ss2 = (C28601Ss) interfaceC12230j4;
                if (c28601Ss2.A06 != abstractC28611St) {
                    j2 = Math.min(j2, A00(c28601Ss2, c28601Ss2.A00 + j));
                }
            }
        }
        if (c28601Ss == abstractC28611St.A04) {
            long A04 = j - abstractC28611St.A04();
            return Math.min(Math.min(j2, A00(abstractC28611St.A05, A04)), A04 - abstractC28611St.A05.A00);
        }
        return j2;
    }

    public final long A01(C28601Ss c28601Ss, long j) {
        AbstractC28611St abstractC28611St = c28601Ss.A06;
        if (abstractC28611St instanceof C38461oB) {
            return j;
        }
        int size = c28601Ss.A07.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC12230j4 interfaceC12230j4 = (InterfaceC12230j4) c28601Ss.A07.get(i);
            if (interfaceC12230j4 instanceof C28601Ss) {
                C28601Ss c28601Ss2 = (C28601Ss) interfaceC12230j4;
                if (c28601Ss2.A06 != abstractC28611St) {
                    j2 = Math.max(j2, A01(c28601Ss2, c28601Ss2.A00 + j));
                }
            }
        }
        if (c28601Ss == abstractC28611St.A05) {
            long A04 = j + abstractC28611St.A04();
            return Math.max(Math.max(j2, A01(abstractC28611St.A04, A04)), A04 - abstractC28611St.A04.A00);
        }
        return j2;
    }
}
