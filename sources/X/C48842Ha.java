package X;

import java.util.Comparator;

/* renamed from: X.2Ha  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48842Ha implements Comparator {
    public C05W A00;
    public C61772wh A01;

    public C48842Ha(C02L c02l, C05W c05w, C018708s c018708s) {
        this.A00 = c05w;
        this.A01 = new C61772wh(c02l, c018708s);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C0K0 c0k0 = (C0K0) obj2;
        C06C A09 = this.A00.A09(((C0K0) obj).A06);
        if (A09 == null) {
            return 1;
        }
        C06C A092 = this.A00.A09(c0k0.A06);
        if (A092 == null) {
            return -1;
        }
        return this.A01.compare(A09, A092);
    }
}
