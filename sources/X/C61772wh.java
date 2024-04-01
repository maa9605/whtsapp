package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.2wh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61772wh implements Comparator {
    public final C02L A00;
    public final C018708s A01;
    public final Collator A02;

    public C61772wh(C02L c02l, C018708s c018708s) {
        this.A00 = c02l;
        this.A01 = c018708s;
        this.A02 = c018708s.A0E();
    }

    @Override // java.util.Comparator
    /* renamed from: A00 */
    public int compare(C06C c06c, C06C c06c2) {
        C02L c02l = this.A00;
        if (c02l.A0A(c06c.A02())) {
            return -1;
        }
        if (c02l.A0A(c06c2.A02())) {
            return 1;
        }
        boolean A0A = c06c.A0A();
        boolean A0A2 = c06c2.A0A();
        if (A0A != A0A2) {
            return A0A2 ? -1 : 1;
        }
        Collator collator = this.A02;
        C018708s c018708s = this.A01;
        return collator.compare(c018708s.A08(c06c, false), c018708s.A08(c06c2, false));
    }
}
