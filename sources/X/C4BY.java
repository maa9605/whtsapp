package X;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.4BY  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4BY extends C0HS {
    public final C76943hP A00;
    public final C0DV A01;

    public C4BY(C0DV c0dv, C76943hP c76943hP) {
        this.A01 = c0dv;
        this.A00 = c76943hP;
    }

    @Override // X.C0HS
    public Object A07(Object[] objArr) {
        C0DV c0dv = this.A01;
        c0dv.A04();
        List A0B = c0dv.A08.A0B();
        AbstractList abstractList = (AbstractList) A0B;
        if (abstractList.size() > 0) {
            Collections.sort(A0B, new Comparator() { // from class: X.3NM
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    C0N2 c0n2 = (C0N2) obj2;
                    C0N8 c0n8 = (C0N8) ((C0N2) obj).A06;
                    long j = Long.MAX_VALUE;
                    if (c0n8 != null) {
                        long j2 = c0n8.A06;
                        if (j2 >= 0) {
                            j = j2;
                        }
                    }
                    C0N8 c0n82 = (C0N8) c0n2.A06;
                    long j3 = Long.MAX_VALUE;
                    if (c0n82 != null) {
                        long j4 = c0n82.A06;
                        if (j4 >= 0) {
                            j3 = j4;
                        }
                    }
                    return (j > j3 ? 1 : (j == j3 ? 0 : -1));
                }
            });
            C0N2 c0n2 = (C0N2) abstractList.get(0);
            C0N0 c0n0 = c0n2.A06;
            if (c0n0 == null || ((C0N8) c0n0).A06 < 0) {
                return null;
            }
            return new C0FK(Integer.valueOf(abstractList.size()), c0n2);
        }
        return null;
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C0FK c0fk = (C0FK) obj;
        if (c0fk != null) {
            Object obj2 = c0fk.A01;
            if (obj2 != null) {
                C4BZ.A01(this.A00.A00, (C0N2) obj2);
                return;
            }
            throw null;
        }
        C4BZ.A01(this.A00.A00, null);
    }
}
