package X;

import java.util.Comparator;

/* renamed from: X.2c5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2c5 implements Comparator {
    public final C01B A00;
    public final C05W A01;
    public final C018708s A02;

    public C2c5(C05W c05w, C018708s c018708s, C01B c01b) {
        this.A01 = c05w;
        this.A02 = c018708s;
        this.A00 = c01b;
    }

    @Override // java.util.Comparator
    /* renamed from: A00 */
    public int compare(C0D4 c0d4, C0D4 c0d42) {
        int i = c0d4.A00;
        int i2 = c0d42.A00;
        C05W c05w = this.A01;
        C06C A0A = c05w.A0A(c0d4.A02);
        C06C A0A2 = c05w.A0A(c0d42.A02);
        if (AnonymousClass029.A1O(this.A00)) {
            C04460Kg c04460Kg = A0A.A08;
            if ((c04460Kg != null) != (A0A2.A08 != null)) {
                return c04460Kg == null ? 1 : -1;
            }
            C018708s c018708s = this.A02;
            return c018708s.A08(A0A, false).compareTo(c018708s.A08(A0A2, false));
        } else if (i != i2) {
            return i != 5 ? 1 : -1;
        } else {
            C04460Kg c04460Kg2 = A0A.A08;
            if ((c04460Kg2 != null) == (A0A2.A08 != null)) {
                return 0;
            }
            return c04460Kg2 == null ? 1 : -1;
        }
    }
}
