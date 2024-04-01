package X;

import java.util.Comparator;

/* renamed from: X.2Bv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47592Bv implements Comparator {
    public final boolean A00;

    public C47592Bv(boolean z) {
        this.A00 = z;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C42531vt c42531vt = (C42531vt) obj;
        C42531vt c42531vt2 = (C42531vt) obj2;
        if (this.A00) {
            boolean z = c42531vt2.A06;
            if (z != c42531vt.A06) {
                return z ? 1 : -1;
            }
            boolean A01 = c42531vt2.A01();
            if (A01 != c42531vt.A01()) {
                return A01 ? 1 : -1;
            }
        }
        return c42531vt2.A00 - c42531vt.A00;
    }
}
